package com.bcilab.neurotales.utils;

import com.bcilab.neurotales.model.entity.BaseEntity;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MongoBeforeConvertListener extends AbstractMongoEventListener<Object> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        Object source = event.getSource();
        if(source instanceof BaseEntity) {
            ((BaseEntity) source).setUpdateAt(LocalDateTime.now());
        }
    }
}
