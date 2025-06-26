package com.bcilab.neurotales.model.dto;
// Description: TODO

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "数据集预处理结果")
public class DatasetResultDTO {

    @Schema(description = "专注程度ei值列表")
    private List<Double> eiValues;

}
