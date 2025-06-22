package com.bcilab.neurotales.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@Schema(description = "MongoDB基础结构")
public class MongoEntity {

    @Id
    @Schema(description = "主键id")
    private ObjectId id;

}
