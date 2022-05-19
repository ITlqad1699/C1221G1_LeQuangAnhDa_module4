package com.codegym.app_blog.model;

import javax.persistence.*;

@Entity
@Table(name = "blog_table")
public class BlogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String author;


    @ManyToOne
    @JoinColumn(name = "post_id",referencedColumnName = "postId")
    private Category posts;

    public BlogModel() {
    }

    public BlogModel(Integer id, String name, String description, String author, Integer postId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }

    public Category getPosts() {
        return posts;
    }

    public void setPosts(Category posts) {
        this.posts = posts;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
