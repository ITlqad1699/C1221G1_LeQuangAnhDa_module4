package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class MusicForm {
    private  String name;
    private String singer;
    private String typeOfMusic;
    private MultipartFile path;

    public MusicForm() {
    }

    public MusicForm(String name, String singer, String typeOfMusic, MultipartFile path) {
        this.name = name;
        this.singer = singer;
        this.typeOfMusic = typeOfMusic;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }

    public MultipartFile getPath() {
        return path;
    }

    public void setPath(MultipartFile path) {
        this.path = path;
    }
}
