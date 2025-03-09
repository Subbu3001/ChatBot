package com.example.Chatbot.Chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
	public String processText(String inputText) {
		// Simple Hardcoded NLP Analysis for Demo
		if (inputText.toLowerCase().contains("hello")) {
			return "Hi there! How can I help you?";
		} else if (inputText.toLowerCase().contains("bye")) {
			return "Goodbye! Have a great day!";
		} else if (inputText.toLowerCase().contains("thanks")) {
			return "You're welcome!";
		} else {
			return "Sorry, I didn't understand that.";
		}
	}
}
