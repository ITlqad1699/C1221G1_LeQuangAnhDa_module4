package com.codegym.repository.impl;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MusicRepositoryImpl implements IMusicRepository {
    private static Map<Integer, Music > musicMap;
    static {
        musicMap = new TreeMap<>();
        musicMap.put(1,new Music("you never walk alone","Tom Cruise","Country","https://www.nhaccuatui.mp3"));
        musicMap.put(2,new Music("baby","justin","pop","https://www.nhaccuatui.mp3"));
        musicMap.put(3,new Music("kill this love","black pink","pop","https://www.nhaccuatui.mp3"));
        musicMap.put(4,new Music("you never walk alone","Tom Cruise","Country","https://www.nhaccuatui.mp3"));
    }


    @Override
    public void save(Music music) {
        Integer id = (int)(Math.random()*100);
        musicMap.put(id,music);
    }

    @Override
    public List<Music> findAll() {
        return new ArrayList<>(musicMap.values());
    }
}
