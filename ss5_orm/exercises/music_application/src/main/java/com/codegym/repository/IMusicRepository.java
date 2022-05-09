package com.codegym.repository;

import com.codegym.model.Music;
import com.codegym.model.MusicForm;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void save(Music music);

    Music findById(String id);

    void update( Music music);

    void delete(Music music);
}
