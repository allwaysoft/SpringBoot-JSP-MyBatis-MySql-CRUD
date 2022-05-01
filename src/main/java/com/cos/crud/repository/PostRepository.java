package com.cos.crud.repository;

import java.util.List;

import com.cos.crud.model.Post;

public interface PostRepository {

    List<Post> findAll();

    void save(Post post);

    void update(Post post);

    Post findById(int id);

    void delete(int id);
}
