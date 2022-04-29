package com.codegym.controller;

import com.codegym.service.ISumServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    @Autowired
    private ISumServie iSumServie;
    @GetMapping(value = "/goHomePage")
    public String goHomePage() {
        return "homepage";
    }

    @PostMapping(value = "/sum")
    public String Sum(@RequestParam Integer num1,
                      @RequestParam(name = "num2") Integer n,
                      Model model) {
        int sum = num1 + n;
        model.addAttribute("result",this.iSumServie.sum(num1,n));
        return "result_final";
    }
}
