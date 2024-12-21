package dev.bpt.chatclient;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final ChatClient chatClient;

    public BookController(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    @GetMapping("/books")
    public List<BookRecommendation> home() {
        return chatClient.prompt().user("Generate 10 book recommendations on AI and coding")
                .call()
                .entity(new ParameterizedTypeReference<List<BookRecommendation>>() {});
    }
}
