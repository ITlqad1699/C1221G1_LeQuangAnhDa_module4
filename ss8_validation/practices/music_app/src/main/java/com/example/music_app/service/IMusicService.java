package com.example.music_app.service;


import com.example.music_app.model.Music;

import java.util.List;

public interface IMusicService {

    List<Music> findAll();

    void save(Music music);

}
