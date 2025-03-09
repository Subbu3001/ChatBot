package com.example.Chatbot.Chatbot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Chatbot.Chatbot.service.ChatbotService;

@RestController
@RequestMapping("/Chatbot")
public class ChatbotController {
	private final ChatbotService chatbotService;
	  
    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processText(@RequestBody(required = false) String text) {
        if (text == null || text.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body is missing or empty.");
        }
        String response = chatbotService.processText(text);
        return ResponseEntity.ok(response);
    }
}
