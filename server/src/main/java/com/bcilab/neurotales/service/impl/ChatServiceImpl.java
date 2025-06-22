package com.bcilab.neurotales.service.impl;
// Description: TODO

import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import com.bcilab.neurotales.repository.DatasetRepository;
import com.bcilab.neurotales.service.ChatService;
import com.bcilab.neurotales.utils.ChatAssistant;
import com.bcilab.neurotales.utils.MarkdownParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatAssistant chatAssistant;

    @Autowired
    private DatasetRepository datasetsRepository;

    @Autowired
    private MarkdownParser markdownParser;

    @Override
    public String chat(String eiValues) {
        return chatAssistant.sendMessage(eiValues);
//        return markdownParser.parse(markdownAnswer);
    }

    @Override
    public CommonResult chatEi(DatasetInfoDTO datasetInfo) {
        if (datasetInfo == null || datasetInfo.getDatasetObjectId() == null) {
            return CommonResult.fail("数据集为空请重试！");
        }
        // 判断传入的数据集是否是当前登录用户下的
//        Datasets datasets = datasetsRepository.findById(datasetInfo.getDatasetObjectId());
//        if (datasets == null) {
//            return CommonResult.fail("数据集不存在！");
//        }
//        // 判断该dataset是否经过预处理，否则直接返回报错
//        if(!datasets.getIsProcessed()){
//            return CommonResult.fail("数据集需先经过预处理，才能进行分析！");
//        }
//        // 将专注力查出来拼到prompt
//        List<Double> eiValues = datasets.getEiValues();
//        double[] eiArrays = {0.895,0.869,0.853,0.759,0.821,0.819,0.784,0.816,0.857,0.875,0.833,0.826,0.831,0.804,0.835,0.873,0.828,0.808,0.732,0.763,0.754,0.743,0.886,0.903,0.836,0.771,0.731,0.733,0.728,0.744,0.674,0.715,0.69,0.822,0.849,0.784,0.821,0.722,0.78,0.772,0.699,0.682,0.65,0.73,0.785,0.793,0.865,0.76,0.798,0.794,0.838,0.839,0.809,0.825,0.747,0.873,0.933,0.938,0.925,0.88,0.808,0.822};
        List<Double> eiValues = List.of(0.895, 0.869, 0.853, 0.759, 0.821, 0.819, 0.784, 0.816, 0.857, 0.875, 0.833, 0.826, 0.831, 0.804, 0.835, 0.873, 0.828, 0.808, 0.732, 0.763, 0.754, 0.743, 0.886, 0.903, 0.836, 0.771, 0.731, 0.733, 0.728, 0.744, 0.674, 0.715, 0.69, 0.822, 0.849, 0.784, 0.821, 0.722, 0.78, 0.772, 0.699, 0.682, 0.65, 0.73, 0.785, 0.793, 0.865, 0.76, 0.798, 0.794, 0.838, 0.839, 0.809, 0.825, 0.747, 0.873, 0.933, 0.938, 0.925, 0.88, 0.808, 0.822);
        // 问ai，包装返回结果返回
        return CommonResult.success(chatAssistant.chatEi(eiValues));
    }

    @Override
    public CommonResult emptyChat() {
        double[] eiArrays = {0.895,0.869,0.853,0.759,0.821,0.819,0.784,0.816,0.857,0.875,0.833,0.826,0.831,0.804,0.835,0.873,0.828,0.808,0.732,0.763,0.754,0.743,0.886,0.903,0.836,0.771,0.731,0.733,0.728,0.744,0.674,0.715,0.69,0.822,0.849,0.784,0.821,0.722,0.78,0.772,0.699,0.682,0.65,0.73,0.785,0.793,0.865,0.76,0.798,0.794,0.838,0.839,0.809,0.825,0.747,0.873,0.933,0.938,0.925,0.88,0.808,0.822};
        String eiValues = Arrays.toString(eiArrays);
        return CommonResult.success(chat(eiValues));
//        return chat(eiValues);
    }
}
