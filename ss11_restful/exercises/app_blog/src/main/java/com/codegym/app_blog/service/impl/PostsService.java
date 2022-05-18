package com.codegym.app_blog.service.impl;

import com.codegym.app_blog.model.Category;
import com.codegym.app_blog.repository.IPostsRepository;
import com.codegym.app_blog.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsService implements IPostsService {
    @Autowired
    IPostsRepository iPostsRepository;

    @Override
    public List<Category> findAll() {
        return this.iPostsRepository.findAll();
    }

    @Override
    public Page<Category> findAllPage(Pageable pageable) {
        return this.iPostsRepository.findAll(pageable);
    }

    @Override
    public Category findById(Integer postId) {
        return this.iPostsRepository.findById(postId).get();
    }
}
