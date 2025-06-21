package com.bcilab.neurotales.model;
// Description: 聊天信息DAO

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("ei_chat_messages")
public class ChatMessages {

    @Id // 唯一标识，映射到Mongo文档的_ID字段
    private ObjectId id;

    private int messageId;

    private String content;
}
