package com.codegym.controller;

import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping(value = "/goCreate")
    public String showForm(Model model){
       model.addAttribute("employee", new Employee());
       return "create";
    }
    @PostMapping(value = "/info")
    public String submit(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "info";
    }
}

