package com.bcilab.neurotales.service;
// Description: TODO

import com.bcilab.neurotales.model.response.CommonResult;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

public interface DatasetService {
    CommonResult getDataset();

    CommonResult uploadDataset(MultipartFile file);

    CommonResult processDataset(ObjectId dataSetId);
}
