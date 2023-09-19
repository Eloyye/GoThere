package com.eloy.gothere.services;

import com.eloy.gothere.models.Post;
import com.eloy.gothere.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
public class RedditClientService {
    private final WebClient webClient;

    @Autowired
    public RedditClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://www.reddit.com").build();
    }

}
