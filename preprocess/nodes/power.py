from timeflux.nodes.window import TimeWindow, SampleWindow
import numpy as np
import pandas as pd
import timeflux.nodes.zmq
from timeflux.nodes.hdf5 import Replay

class Power(TimeWindow):
    """ Average of squared samples on a moving window

    Attributes:
        i (Port): Default input, expects DataFrame.
        o (Port): Default output, provides DataFrame and meta.

    Args:
        length (float): Window length
        step (float): Step length
        average (mean|median) : Average method

    """

    def __init__(self, length, step, average='median'):
        super().__init__(length=length, step=step)
        if average == 'mean':
            self._average_method = np.mean
        else:
            self._average_method = np.median

    def update(self):
        super().update()
        if not self.o.ready(): return
        # print("power: ", self.o.data)
        self.o.data = pd.DataFrame((self.o.data ** 2).apply(self._average_method),
                                   columns=[self.i.data.index[-1]]).T
        # for i in self.o.data:
        #     print("i = ", i)