package com.bcilab.neurotales.utils;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;
import org.springframework.stereotype.Component;

import java.util.List;


import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

// Description: AI聊天助手
@Component
@AiService(
    wiringMode = EXPLICIT,
//    chatModel = "ollamaChatModel",
    chatModel = "qwenChatModel",
    contentRetriever = "contentRetriever"
//    chatModel = "openAiChatModel"
//    chatMemoryProvider = "chatMemoryProvider"
)
public interface ChatAssistant {
    @SystemMessage(value = Constants.SYSTEM_MESSAGES_EI)
    @UserMessage(fromResource = "prompt/ei-prompt-template.txt")
    String sendMessage(@V("ei_values") String eiValues);

    @SystemMessage(value = Constants.SYSTEM_MESSAGES_EI)
    @UserMessage(fromResource = "prompt/ei-prompt-template.txt")
    String chatEi(@V("ei_values") List<Double> eiValues);


    String testChat(@UserMessage String s);
}