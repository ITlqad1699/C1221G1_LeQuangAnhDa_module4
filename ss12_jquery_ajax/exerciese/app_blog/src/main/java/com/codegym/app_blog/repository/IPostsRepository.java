package com.codegym.app_blog.repository;

import com.codegym.app_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostsRepository extends JpaRepository<Category,Integer> {

}
