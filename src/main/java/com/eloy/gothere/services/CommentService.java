package com.eloy.gothere.services;

import com.eloy.gothere.models.Comment;
import com.eloy.gothere.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteCommentById(Long id) {
        commentRepository.deleteById(id);
    }

    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }

    public Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Iterable<Comment> getAllCommentsByPostId(Long postId) {
        return commentRepository.findAllByPostId(postId);
    }

    public Iterable<Comment> getAllCommentsByUserId(Long userId) {
        return commentRepository.findAllByUserId(userId);
    }

    public Iterable<Comment> getAllCommentsByPostIdAndUserId(Long postId, Long userId) {
        return commentRepository.findAllByPostIdAndUserId(postId, userId);
    }
}
