package com.codegym.app_blog.service.impl;

import com.codegym.app_blog.model.BlogModel;
import com.codegym.app_blog.model.Posts;
import com.codegym.app_blog.repository.IPostsRepository;
import com.codegym.app_blog.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService implements IPostsService {
    @Autowired
    IPostsRepository iPostsRepository;

    @Override
    public List<Posts> findAll() {
        return this.iPostsRepository.findAll();
    }
}
