package com.eloy.gothere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RedditClientService {
    private final WebClient webClient;

    @Autowired
    public RedditClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://www.reddit.com").build();
    }


}
