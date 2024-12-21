package dev.bpt.chatclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AiConfig {

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
