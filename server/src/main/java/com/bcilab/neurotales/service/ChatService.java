package com.bcilab.neurotales.service;

import com.bcilab.neurotales.model.dto.request.CallbackRequest;
import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import org.springframework.stereotype.Service;

@Service
public interface ChatService {

    CommonResult emptyChat();

    String chat(String message);

    CommonResult chatEi(DatasetInfoDTO datasetInfo);

    CommonResult chatEi(CallbackRequest callbackRequest);
}
