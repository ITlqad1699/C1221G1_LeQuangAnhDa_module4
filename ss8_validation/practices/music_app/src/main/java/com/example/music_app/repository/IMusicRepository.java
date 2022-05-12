package com.example.music_app.repository;

import com.example.music_app.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music,String> {

}
