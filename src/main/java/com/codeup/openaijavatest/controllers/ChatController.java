package com.codeup.openaijavatest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @GetMapping("/chat")
    public String chatView() {
      return "chat";
    }
}
