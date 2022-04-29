package com.dictionary.controller;

import com.dictionary.service.ITranlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private  ITranlateService iTranlateService;

    @GetMapping(value = "/goHomePage")
    public String goHomePade() {
        return "homepage";
    }

    @GetMapping(value = "/translate")
    public String translate(@RequestParam String vietnamese,
                            Model model) {
        String english = iTranlateService.translate(vietnamese);
        model.addAttribute("vietnamese",vietnamese);
        model.addAttribute("english", english);
        return "homepage";
    }
}
