package com.codegym.controller;

import com.codegym.model.Settings;
import com.codegym.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailFormController {
    @Autowired
    private ISettingService iSettingService;
    @GetMapping("/goHomePage")
    public String goHomePage(Model model, RedirectAttributes redirectAttributes){
            model.addAttribute("settings",iSettingService.getSetting());
        return "home";
    }

    @PostMapping("/settings")
    public String createSettings(@ModelAttribute Settings setting, RedirectAttributes redirectAttributes){
        iSettingService.save(setting);
        redirectAttributes.addFlashAttribute("msg","success");
        return "redirect:/goHomePage";
    }
}
