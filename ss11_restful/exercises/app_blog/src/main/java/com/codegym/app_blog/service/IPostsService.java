package com.codegym.app_blog.service;

import com.codegym.app_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IPostsService {
    List<Category> findAll();

    Page<Category> findAllPage(Pageable pageable);

    Category findById(Integer postId);
}
