package com.codegym.app_blog.dto;

public class CategoryDto {
    private Integer postId;
    private String content;

    public CategoryDto() {
    }

    public CategoryDto(Integer postId, String content) {
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
