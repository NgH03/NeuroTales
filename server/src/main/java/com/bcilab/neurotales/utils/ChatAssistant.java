package com.bcilab.neurotales.utils;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;
import org.springframework.stereotype.Component;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

// Description: AI聊天助手
@Component
@AiService(
    wiringMode = EXPLICIT,
    chatModel = "ollamaChatModel"
//    chatModel = "openAiChatModel"
)
public interface ChatAssistant {
    @SystemMessage(value = "你是一位专业的脑科学专家，特别在专注力的分析和辅助训练方面有很高的成就，现在请根据以下数据生成一份专注力检测报告")
    @UserMessage(fromResource = "ei-prompt-template.txt")
    String sendMessage(@V("ei_values") String eiValues);
}