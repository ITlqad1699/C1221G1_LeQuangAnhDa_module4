package com.codegym.controller;

import com.codegym.dao.UserDao;
import com.codegym.model.Login;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @GetMapping(value = "/goHomePage")
    public String goHomePage(Model model) {
        model.addAttribute("login", new Login());
        return "home";
    }

//    @PostMapping("/login")
//    public ModelAndView login(@ModelAttribute("login") Login login) {
//        User user = UserDao.checkLogin(login);
//        if (user == null) {
//            ModelAndView modelAndView = new ModelAndView("error");
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("user");
//            modelAndView.addObject("user", user);
//            return modelAndView;
//        }
//    }
    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login, Model model){
        User user = UserDao.checkLogin(login);
        if (user == null) {
            return "error";
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            model.addAttribute("user", user);
            return "user";
        }
    }
}