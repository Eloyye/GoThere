package com.eloy.gothere.models;

import jakarta.persistence.*;

/**
 *
 */
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(User author_id) {
        this.author_id = author_id;
    }

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author_id;

    @ManyToOne
    @JoinColumn(name = "subreddit_id", nullable = false)
    private Subreddit subreddit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
