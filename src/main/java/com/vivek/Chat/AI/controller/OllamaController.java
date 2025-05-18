package com.vivek.Chat.AI.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OllamaController {


    public ChatClient chatClient;

    public OllamaController(OllamaChatModel chatModel){
        this.chatClient=ChatClient.create(chatModel);
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message){
        if(message==null || message.isBlank()){
            return ResponseEntity.badRequest().body("Message cannot be Empty");
        }

        String response=chatClient.prompt(message).call().content();
        return ResponseEntity.ok(response);
    }
}
