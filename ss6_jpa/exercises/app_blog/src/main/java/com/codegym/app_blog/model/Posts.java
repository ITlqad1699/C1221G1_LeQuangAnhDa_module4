package com.codegym.app_blog.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "post")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private String content;
    @OneToMany(mappedBy = "posts")
    private List<BlogModel> blogModels;

    public Posts() {
    }

    public Posts(Integer postId, String content) {
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
