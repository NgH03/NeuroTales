

import pandas as pd
from timeflux.core.node import Node
from timeflux_dsp.nodes.spectral import Bands

class Engagement(Node):

    """
    计算专注力 Engagement Index(EI)
    EI = β/(α+θ) 
        - Freeman, F etc. 1999. 


    Attributes:
        i (Port): Default data input, expects DataFrame.

    Args:
        name (string): The name of the stream.
        type (string): The content type of the stream, .
        format (string): The format type for each channel. Currently, only ``double64`` and ``string`` are supported.
        rate (float): The nominal sampling rate. Set to ``0.0`` to indicate a variable sampling rate.
        source (string, None): The unique identifier for the stream. If ``None``, it will be auto-generated.
        config_path (string, None): The path to an LSL config file.

    Example:
        .. literalinclude:: /../examples/lsl.yaml
           :language: yaml

    """

    # _dtypes = {"double64": np.number, "string": object}

    def __init__(
        self,
        # name,
        # type="Signal",
        # format="double64",
        # rate=0.0,
        # source=None,
        # config_path=None,
    ):
        pass

    def update(self):
        if not isinstance(self.i.data, pd.core.frame.DataFrame):
            return
        self.logger.debug(f"data = \n{self.i.data}")
        #  At this point, we are sure that we have some data to process
        # for band in self._bands:
        #     # 1. select the Xarray on freq axis in the range, 2. average along freq axis
        #     band_power = (
        #         self.i.data.loc[{"frequency": band["slice"]}].sum("frequency").values
        #     )  # todo: sum
        #     if self._relative:
        #         tot_power = self.i.data.sum("frequency").values
        #         tot_power[tot_power == 0.0] = 1
        #         band_power /= tot_power

        #     band["port"].data = pd.DataFrame(
        #         columns=self.i.data.space.values,
        #         index=self.i.data.time.values,
        #         data=band_power,
        #     )
        #     band["port"].meta = {**(self.i.meta or {}), **band["meta"]}
