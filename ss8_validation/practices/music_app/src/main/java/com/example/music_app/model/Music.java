package com.example.music_app.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT")
    private String  id;
    private  String name;
    private String singer;
    @Column(name = "type_of_music")
    private String typeOfMusic;
    private String path;

    public Music(String name, String singer, String typeOfMusic, String path) {
        this.name = name;
        this.singer = singer;
        this.typeOfMusic = typeOfMusic;
        this.path = path;
    }

    public Music(String id, String name, String singer, String typeOfMusic, String path) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.typeOfMusic = typeOfMusic;
        this.path = path;
    }

    public Music() {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
