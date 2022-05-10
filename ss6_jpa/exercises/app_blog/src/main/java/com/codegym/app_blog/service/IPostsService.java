package com.codegym.app_blog.service;

import com.codegym.app_blog.model.BlogModel;
import com.codegym.app_blog.model.Posts;

import java.util.List;

public interface IPostsService {
    List<Posts> findAll();

}
