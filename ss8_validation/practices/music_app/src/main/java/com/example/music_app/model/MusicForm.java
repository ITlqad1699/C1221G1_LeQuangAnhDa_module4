package com.example.music_app.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MusicForm implements Validator {
    static final String REGEX_SINGER = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
    static final String REGEX_NAME = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
    //    regex tiếng việt nha anh
    @NotBlank(message = "not null")
    @Length(max = 800,message = "length errors")
    @Pattern(regexp = "^([A-Za-z\\d])\\w+$",message = "invalid name")
    private  String name;
    //    regex tiếng việt nha anh
    @NotBlank(message = "not null")
    @Pattern(regexp = REGEX_SINGER,message = "invalid singer name")
    @Length(max = 300,message = "length errors")
    private String singer;

    @NotBlank(message = "not null")
    @Length(max = 1000,message = "length errors")
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
