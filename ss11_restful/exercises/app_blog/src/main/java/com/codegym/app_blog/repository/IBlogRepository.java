package com.codegym.app_blog.repository;


import com.codegym.app_blog.model.BlogModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository  extends JpaRepository<BlogModel,Integer> {
    @Query(value="select * from blog_table where `name` like :name", nativeQuery = true)
    List<BlogModel> findByName(@Param("name") String name);

    Page<BlogModel> findAllByNameContaining(String keyword, Pageable pageable);

    Page<BlogModel> findAllByNameContainingAndAuthorContainingAndPosts_PostId(String keywordName, String keywordAuthor, Integer postId, Pageable pageable);

}
