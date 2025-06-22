package com.bcilab.neurotales.model.po;
// Description: 聊天信息

import com.bcilab.neurotales.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_sessions")
@Schema(name = "聊天信息实体")
public class Session extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "会话id")
    private Integer sessionId;

    @Schema(description = "聊天内容")
    private String content;
}
