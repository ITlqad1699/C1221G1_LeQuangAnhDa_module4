package com.codegym.controller;

import com.codegym.repository.IMedicalServiceRepository;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicalDeclarationController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/goHomePage")
    public String goHomePage(Model model) {
        model.addAttribute("list", this.iMedicalService.findAll());
        return "list";
    }

    @GetMapping("/goMedicalPage")
    public String goMedicalPage(Model model) {
        model.addAttribute("medical_declaration", this.iMedicalService.getMedical());
        return "form_medical_declaration";
    }
}
