package com.bcilab.neurotales.controller;

import com.bcilab.neurotales.service.ChatService;
import com.bcilab.neurotales.utils.ChatAssistant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "BCI聊天模型")
@RestController
@RequestMapping("/ei")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @Operation(summary = "测试返回HTML页面")
    @GetMapping("html")
    public String getHtml(){
        return chatService.emptyChat();
    }

}
