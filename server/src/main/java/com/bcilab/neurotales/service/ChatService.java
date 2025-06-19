package com.bcilab.neurotales.service;

import org.springframework.stereotype.Service;

@Service
public interface ChatService {

    String emptyChat();

    String chat(String message);
}
