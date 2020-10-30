package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> FindAll();
    Post FindById(long id);
    Post save(Post post);

}
