package com.corgiduo.ceekly.controller;

import com.corgiduo.ceekly.dao.UserMapper;
import com.corgiduo.ceekly.entity.User;
import com.corgiduo.ceekly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CeeklyController {

    @Autowired
    UserService userService;

    @GetMapping("/demo")
    public List<User> selectAllUser() {
        return userService.getAll();
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/welcome")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

}
