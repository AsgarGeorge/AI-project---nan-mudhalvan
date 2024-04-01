package com.generativeAI.springAI.project.controller;

import com.generativeAI.springAI.project.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AIController {

    @Autowired
    AIService aiService;

    @GetMapping("/code")
    public String getDocumentation(@RequestParam String code){
        return aiService.getDocumentation(code);
    }

}
