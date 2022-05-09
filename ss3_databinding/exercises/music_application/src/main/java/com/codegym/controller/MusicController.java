package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/goHomePage")
    public String goHomePage(Model model){
        model.addAttribute("listMusic",this.iMusicService.findAll());
        return "list_music";
    }

    @GetMapping("/goUpload")
    public String goUpload(Model model){
        model.addAttribute("music", new Music());
        return "upload";
    }
    @PostMapping("/upload")
    public String upload(@ModelAttribute Music music, RedirectAttributes redirectAttributes){
        this.iMusicService.save(music);
        redirectAttributes.addFlashAttribute("msg","success!");
        return "redirect:/goHomePage";
    }
}
