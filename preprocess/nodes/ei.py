import numpy
import pandas as pd
from statistics import mean
from timeflux.core.node import Node
from datetime import datetime


class Engagement(Node):
    """
    计算专注力 Engagement Index(EI)
        EI = β/(α+θ) - Freeman, F etc. 1999.

    Attributes:
        i (Port): Default data input, expects DataFrame.

    Args:
        channels (string): 需要计算专注力的通道
        accuracy (int): 结果精确度（小数点后几位）
    """

    def __init__(self, channels: [str] = None, accuracy: int = 3):
        super().__init__()
        self.channels: [str] = channels if channels and len(channels) > 0 else None
        self.accuracy = min(max(accuracy, 0), 8)
        self.ei_value = None
        self.ei_list = []
        self.alpha_list = []

    def get_channel_val(self, ch) -> float:
        try:
            return self.i.data[ch].iloc[0]
        except Exception as e:
            raise Exception(f"{ch} 的数据不存在: {e}")

    def cal_channel_ei(self, channel):
        try:
            beta_val = self.get_channel_val(f'{channel}_beta')
            alpha_val = self.get_channel_val(f'{channel}_alpha')
            theta_val = self.get_channel_val(f'{channel}_theta')
            ei_value = round(beta_val / (alpha_val + theta_val), self.accuracy)
            self.logger.info(f"通道 {channel} 当前专注度 {ei_value}")

            self.alpha_list.append(str(round(alpha_val, 8)))
            self.logger.info(",".join(self.alpha_list))

            return ei_value
        except Exception as e:
            raise Exception(f"计算通道 {channel} 的EI值异常: {e}")

    def cal_ei(self):
        ei_value_list: [float] = []
        for channel in self.channels:
            try:
                ei_value_list.append(self.cal_channel_ei(channel=channel))
            except Exception as e:
                self.o.meta["error"] = {
                    "type": type(e).__name__,
                    "message": str(e),
                    "timestamp": datetime.now().timestamp()
                }
                self.logger.error(str(e))
        self.ei_value = mean(ei_value_list) if len(ei_value_list) > 0 else None
        return self.ei_value

    def update(self):
        # 检查input数据和channel数据
        if (self.i.data is None or
                self.channels is None or
                not isinstance(self.i.data, pd.DataFrame) or
                self.i.data.empty):
            return

        # 保存当前时间戳（使用输入数据的最后一个时间戳）
        current_timestamp = self.i.data.index[-1]

        # 计算EI值
        ei_value = self.cal_ei()

        if ei_value is None or numpy.isnan(ei_value):
            return

        # 创建带时间戳的DataFrame
        data = {'ei': [ei_value]}
        df = pd.DataFrame(data, index=[current_timestamp])

        # 设置输出
        self.o.data = df
        self.o.meta = self.i.meta

        # 记录日志
        self.ei_list.append(str(ei_value))
        self.logger.info(",".join(self.ei_list))