package com.generativeAI.springAI.project.service;
import org.springframework.ai.client.AiClient;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AIService {

    @Autowired
    AiClient aiClient;

    public String getDocumentation(String code){
        PromptTemplate promptTemplate = new PromptTemplate("generate a code documentation for the below code {code}");
        promptTemplate.add("code", code);
        return this.aiClient.generate(promptTemplate.create()).getGeneration().getText();
    }
    
}
