package com.corgiduo.ceekly.controller;

import com.corgiduo.ceekly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String register(String username, String password, String md5) {
        if (userService.createUser(username, password, md5)) {
            return "redirect:/login";
        } else {
            return "redirect:/register";
        }
    }


}
