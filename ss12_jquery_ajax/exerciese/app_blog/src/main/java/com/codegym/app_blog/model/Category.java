package com.codegym.app_blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "post")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private String content;

    public List<BlogModel> getBlogModels() {
        return blogModels;
    }

    public void setBlogModels(List<BlogModel> blogModels) {
        this.blogModels = blogModels;
    }

    @OneToMany(mappedBy = "posts")
    @JsonBackReference
    private List<BlogModel> blogModels;

    public Category() {
    }

    public Category(Integer postId, String content) {
        this.postId = postId;
        this.content = content;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
