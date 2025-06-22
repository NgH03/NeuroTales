package com.bcilab.neurotales.controller;

import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import com.bcilab.neurotales.service.ChatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "聊天控制器")
@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @Operation(summary = "测试返回HTML页面")
    @GetMapping("html")
    public CommonResult getHtml(){
        return chatService.emptyChat();
    }

    @Operation(summary = "ei专注力评估接口")
    @PostMapping("ei")
    public CommonResult chatEi(@RequestBody DatasetInfoDTO datasetInfo){
        // 根据传入的ei值数组返回大模型回答
        return chatService.chatEi(datasetInfo);
    }

}
