package com.eloy.gothere.services;

import com.eloy.gothere.repositories.SubredditRepository;
import org.springframework.stereotype.Service;

@Service
public class SubredditService {
    private final SubredditRepository subredditRepository;

    public SubredditService(SubredditRepository subredditRepository) {
        this.subredditRepository = subredditRepository;
    }
}
