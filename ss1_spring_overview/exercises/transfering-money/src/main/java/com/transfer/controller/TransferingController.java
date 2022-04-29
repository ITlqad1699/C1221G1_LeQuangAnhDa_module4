package com.transfer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferingController {
    @GetMapping(value = "/goHomePage")
    public String goHomePage(){
        return "homepage";
    }
    @PostMapping(value = "/transfer")
    public String transfer(@RequestParam Double usd,
                           @RequestParam Double vnd,
                           Model model){
        Double usdToVnd = usd*23000;
        Double vndToUsd = vnd/23000;
        model.addAttribute("usdToVnd",usdToVnd);
        model.addAttribute("vndToUsd",vndToUsd);
        return "result";
    }
}
