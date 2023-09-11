package com.eloy.gothere.repositories;

import com.eloy.gothere.models.Subreddit;
import org.springframework.data.repository.CrudRepository;

public interface SubredditRepository extends CrudRepository<Subreddit, Long> {
}
