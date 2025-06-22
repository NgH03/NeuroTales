package com.bcilab.neurotales.model.dto;
// Description: 数据集VO


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "数据集信息DTO")
public class DatasetInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "数据集objectId")
    private ObjectId datasetObjectId;

    @Schema(name = "数据集名称")
    @NotBlank(message = "数据集名称不能为空")
    private String datasetName;

}
