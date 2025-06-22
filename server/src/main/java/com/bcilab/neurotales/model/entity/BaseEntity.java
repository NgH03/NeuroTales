package com.bcilab.neurotales.model.entity;
// Description: mongodb的document基础结构

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Schema(description = "基础字段")
public abstract class BaseEntity extends MongoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @CreatedDate
    @Field("createAt")
    @Schema(description = "创建时间")
    private LocalDateTime createAt;

    @LastModifiedDate
    @Field("updateAt")
    @Schema(description = "更新时间")
    private LocalDateTime updateAt;

}
