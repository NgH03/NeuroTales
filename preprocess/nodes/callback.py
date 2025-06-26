import pandas as pd
import requests
from statistics import mean
from timeflux.core.node import Node
from datetime import datetime
import logging


class Callback(Node):
    DEFAULT_URL = "http://localhost:8008/dataset/callback"
    MIN_ACCURACY = 0
    MAX_ACCURACY = 8

    """
    收集接收到的对应keys的数据，在结束运行时发送HTTP请求到后端

    Attributes:
        i (Port): Default data input, expects DataFrame.

    Args:
        keys ([string]): 需要收集的数据的key
        accuracy (int): 结果精确度（小数点后几位）
    """

    def __init__(self, keys: list[str] = None, accuracy: int = 3, task_id=None):
        super().__init__()
        self.keys = keys or []
        self.accuracy = max(min(accuracy, self.MAX_ACCURACY), self.MIN_ACCURACY)
        self.payload = {key: [] for key in self.keys}
        self.payload["taskId"] = task_id
        self.url = self.DEFAULT_URL
        self.has_data = False

    def update(self):
        # 检查输入数据的有效性
        if (self.i.data is None or
                self.keys is None or
                not isinstance(self.i.data, pd.core.frame.DataFrame)):
            return

        self.o = self.i

        for key in self.keys:
            if key in self.i.data.columns:
                try:
                    self.payload[key].append(round(self.i.data[key].iloc[0], self.accuracy))
                    self.has_data = True
                except (IndexError, TypeError, ValueError) as e:
                    self.logger.warning(f"Error processing key '{key}': {str(e)}")

    def terminate(self):
        # 节点终止时发送HTTP回调
        try:
            self._send_callback()
        except requests.exceptions.RequestException as e:
            self.logger.error(f"HTTP request failed: {str(e)}")
        except Exception as e:
            self.logger.error(f"Unexpected error in terminate: {str(e)}")


    def _send_callback(self):
        """发送成功回调"""
        self.payload["isSuccess"] = self.has_data
        self.logger.info(self.payload)
        response = requests.post(self.url, json=self.payload, timeout=5)
        if response.status_code != 200:
            self.logger.error(
                f"Callback failed with status {response.status_code}: "
                f"{response.text}"
            )
        else:
            self.logger.info(f"Sent successful callback: {self.payload}")
