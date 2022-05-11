package com.codegym.app_blog.repository;

import com.codegym.app_blog.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostsRepository extends JpaRepository<Posts,Integer> {
}
