package com.bcilab.neurotales.model.dto.request;
// Description: 数据集预处理结果

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "数据集与处理结果")
public class CallbackRequest {

    @Schema(description = "预处理是否成功")
    Boolean isSuccess;

    @Schema(description = "ei数据")
    List<Double> ei;

    @Schema(description = "文件名前缀uuid-任务id")
    String taskId;
}
