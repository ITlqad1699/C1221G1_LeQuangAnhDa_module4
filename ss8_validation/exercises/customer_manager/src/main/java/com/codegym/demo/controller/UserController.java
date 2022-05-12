package com.codegym.demo.controller;

import com.codegym.demo.dto.UserDto;
import com.codegym.demo.model.User;
import com.codegym.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping("/user")
    public String goPage(Model model){
        model.addAttribute("userDto", new UserDto());
        return "index";
    }

    @PostMapping("/validateUser")
    public String  createNewUser( @ModelAttribute @Validated UserDto userDto, BindingResult bindingResult) {
        new UserDto().validate(userDto,bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "index";
        } else{
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            this.iUserService.save(user);
            return "result";
        }
    }
}