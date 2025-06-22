package com.bcilab.neurotales.service;

import com.bcilab.neurotales.model.response.CommonResult;
import org.bson.types.ObjectId;

public interface SessionService {

    CommonResult findById(ObjectId id);

}
