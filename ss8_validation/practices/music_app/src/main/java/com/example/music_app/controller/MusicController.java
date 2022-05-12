package com.example.music_app.controller;

import com.example.music_app.model.Music;
import com.example.music_app.model.MusicForm;
import com.example.music_app.service.IMusicService;
import javafx.scene.shape.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("/music")
@PropertySource("classpath:upload_file.properties")
public class MusicController {

    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String index(Model model) {
        List<Music> musicList = iMusicService.findAll();
        model.addAttribute("music", musicList);
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("musicForm", new MusicForm());
        return "create";
    }

    @Autowired
    ServletContext application;

    @PostMapping("/save")
    public ModelAndView saveMusic(@ModelAttribute @Validated MusicForm musicForm, BindingResult bindingResult) {
        new MusicForm().validate(musicForm, bindingResult);
        ModelAndView modelAndView = new ModelAndView("create");
        if(bindingResult.hasFieldErrors()){
            return modelAndView;
        }else{
            MultipartFile multipartFile = musicForm.getPath();
            String fileName = multipartFile.getOriginalFilename();

            try {
                FileCopyUtils.copy(musicForm.getPath().getBytes(), new File(fileUpload + fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            String id = null;
            Music music = new Music(id, musicForm.getName(), musicForm.getSinger(), musicForm.getTypeOfMusic(), fileName);
            this.iMusicService.save(music);

            modelAndView.addObject("musicForm", musicForm);
            modelAndView.addObject("message", "Created new music successfully !");
        }
        return modelAndView;
    }

//    @GetMapping("/edit")
//    public String goEditForm(Model model, @RequestParam String id) {
//        model.addAttribute("music", this.iMusicService.findById(id));
//        return "edit";
//    }
//
//    @PostMapping("/update")
//    public String update(@ModelAttribute Music music){
//        this.iMusicService.update(music);
//        return "redirect:/music";
//    }
//
//    @PostMapping("/delete")
//    public String delete(@RequestParam String id){
//        Music music = this.iMusicService.findById(id);
//        this.iMusicService.delete(music);
//        return "redirect:/music";
//    }
}
