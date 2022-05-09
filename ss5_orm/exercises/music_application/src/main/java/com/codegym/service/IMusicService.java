package com.codegym.service;

import com.codegym.model.Music;
import java.util.List;

public interface IMusicService {

    List<Music> findAll();

    void save(Music music);

    Music findById(String id);

    void update( Music music);

    void delete(Music music);
}
