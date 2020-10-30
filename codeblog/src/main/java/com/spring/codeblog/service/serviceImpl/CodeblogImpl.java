package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;
    @Override
    public List<Post> FindAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post FindById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
