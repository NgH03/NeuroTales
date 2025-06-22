package com.bcilab.neurotales.service.impl;
// Description: TODO

import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.SessionService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Override
    public CommonResult findById(ObjectId id) {
        return null;
    }
}
