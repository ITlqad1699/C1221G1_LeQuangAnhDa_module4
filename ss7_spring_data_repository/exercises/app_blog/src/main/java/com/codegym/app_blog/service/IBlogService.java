package com.codegym.app_blog.service;

import com.codegym.app_blog.model.BlogModel;

import java.util.List;

public interface IBlogService {
    List<BlogModel> findAll();

    BlogModel findById(Integer id);

    void save(BlogModel blogModel);

    void delete(BlogModel blogModel);

    List<BlogModel> findByName(String name);
}
