package com.bcilab.neurotales.model.po;
// Description: 数据集

import com.bcilab.neurotales.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("datasets")
@Schema(description = "数据集实体")
public class Dataset extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "是否经过预处理")
    private Boolean isProcessed;

    @Schema(description = "eeg信号数据文件key")
    private String eegFile;

    @Schema(description = "专注程度ei值列表")
    private List<Double> eiValues;

    @Schema(description = "放松程度alpha值列表")
    private List<Double> alphaValues;

    @Schema(description = "信号图文件key")
    private String pictureFile;

}
