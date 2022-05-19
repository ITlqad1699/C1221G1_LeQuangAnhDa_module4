package com.codegym.app_blog.service.impl;

import com.codegym.app_blog.model.BlogModel;
import com.codegym.app_blog.repository.IBlogRepository;
import com.codegym.app_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public List<BlogModel> findAll() {
        return this.iBlogRepository.findAll();
    }

    @Override
    public BlogModel findById(Integer id) {
        return this.iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BlogModel blogModel) {
        this.iBlogRepository.save(blogModel);
    }

    @Override
    public void delete(BlogModel blogModel) {
        this.iBlogRepository.delete(blogModel);
    }

    @Override
    public List<BlogModel> findByName(String name) {
        return this.iBlogRepository.findByName("%"+name+"%");
    }

    @Override
    public Page<BlogModel> findAllByName(String keyword, Pageable pageable) {
        return this.iBlogRepository.findAllByNameContaining(keyword,pageable);
    }

    @Override
    public Page<BlogModel> findAllPage(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public Page<BlogModel> findAllByNameAndAuthorAndPost(String keywordName, String keywordAuthor, Integer postId, Pageable pageable) {
        return this.iBlogRepository.findAllByNameContainingAndAuthorContainingAndPosts_PostId(keywordName,keywordAuthor,postId,pageable);
    }
}
