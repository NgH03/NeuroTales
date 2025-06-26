#!/usr/bin/env python3
import argparse
import os
import sys
import tempfile
import subprocess
import time
from pathlib import Path


def run_timeflux(file_path, task_id):
    """运行Timeflux处理指定文件并传入任务ID"""
    # 验证文件存在
    if not Path(file_path).is_file():
        print(f"错误: 文件不存在 - {file_path}", file=sys.stderr)
        sys.exit(1)

    # 读取模板
    template_path = Path(__file__).parent / "graphs/main.yaml"
    if not template_path.exists():
        print(f"错误: 找不到配置文件模板 {template_path}", file=sys.stderr)
        sys.exit(1)

    with open(template_path, "r") as f:
        config = f.read()

    # 替换文件路径占位符和任务ID占位符 (使用绝对路径)
    abs_path = str(Path(file_path).absolute())
    config = config.replace("__FILEPATH__", abs_path)
    config = config.replace("__TASKID__", task_id)  # 新增任务ID替换

    # 创建临时配置文件
    with tempfile.NamedTemporaryFile(mode="w", suffix=".yaml", delete=False) as tmp:
        tmp.write(config)
        tmp_path = tmp.name
        print(f"生成临时配置文件: {tmp_path}")

    # 运行Timeflux
    try:
        print(f">>>>> 开始处理: {file_path} | 任务ID: {task_id}")
        print("────────────────────────────────────────")
        start_time = time.time()
        result = subprocess.run(
            ["timeflux", "-d", tmp_path],
            check=True,
            stderr=subprocess.STDOUT
        )
    except subprocess.CalledProcessError as e:
        print(f"❌ 处理失败 (代码 {e.returncode})", file=sys.stderr)
        sys.exit(e.returncode)
    finally:
        # 清理临时文件
        try:
            os.unlink(tmp_path)
            print(f"清理临时配置文件: {tmp_path}")
        except OSError:
            pass

    print("────────────────────────────────────────")
    print(f">>>>> 处理完成，耗时 {round(time.time()-start_time, 1)} 秒")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        description="EEG数据处理管道",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )
    parser.add_argument(
        "-p", "--path",
        required=True,
        help="HDF5文件路径"
    )
    # 新增任务ID参数
    parser.add_argument(
        "-t", "--task-id",
        required=True,
        help="任务ID标识符"
    )
    args = parser.parse_args()
    run_timeflux(args.path, args.task_id)  # 传递任务ID参数