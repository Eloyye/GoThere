package com.eloy.gothere.repositories;

import com.eloy.gothere.models.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

    @Query("SELECT c FROM Comment c WHERE c.post.id = ?1")
    Iterable<Comment> findAllByPostId(Long postId);

    @Query("SELECT c FROM Comment c WHERE c.user.id = ?1")
    Iterable<Comment> findAllByUserId(Long userId);

    @Query("SELECT c FROM Comment c WHERE c.post.id = ?1 AND c.user.id = ?2")
    Iterable<Comment> findAllByPostIdAndUserId(Long postId, Long userId);
}
