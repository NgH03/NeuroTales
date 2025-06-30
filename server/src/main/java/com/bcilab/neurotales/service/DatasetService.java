package com.bcilab.neurotales.service;
// Description: TODO

import com.bcilab.neurotales.model.dto.DatasetResultDTO;
import com.bcilab.neurotales.model.dto.request.CallbackRequest;
import com.bcilab.neurotales.model.response.CommonResult;
import org.springframework.web.multipart.MultipartFile;

public interface DatasetService {
    CommonResult getDataset();

    CommonResult uploadDataset(MultipartFile file);

    CommonResult saveDataset(CallbackRequest callbackRequest);

    CommonResult getResult(String taskId);

//    CommonResult processDataset(String datasetPath);
}
