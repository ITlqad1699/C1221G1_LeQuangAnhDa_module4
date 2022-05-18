package com.codegym.app_blog.service;

import com.codegym.app_blog.model.BlogModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<BlogModel> findAll();

    BlogModel findById(Integer id);

    void save(BlogModel blogModel);

    void delete(BlogModel blogModel);

    List<BlogModel> findByName(String name);

    Page<BlogModel> findAllByName(String keyword, Pageable pageable);

    Page<BlogModel> findAllPage(Pageable pageable);


}
