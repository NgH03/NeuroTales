package com.bcilab.neurotales.service.impl;
// Description: TODO

import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.DatasetService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DatasetServiceImpl implements DatasetService {
    @Override
    public CommonResult getDataset() {
        return null;
    }

    @Override
    public CommonResult uploadDataset(MultipartFile file) {
        return null;
    }

    @Override
    public CommonResult processDataset(ObjectId dataSetId) {
        return null;
    }
}
