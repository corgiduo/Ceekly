package com.corgiduo.ceekly.controller;

import com.corgiduo.ceekly.entity.Report;
import com.corgiduo.ceekly.entity.User;
import com.corgiduo.ceekly.service.ReportService;
import com.corgiduo.ceekly.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CeeklyController {

    private Logger logger = LoggerFactory.getLogger(CeeklyController.class);

    @Autowired
    UserService userService;
    @Autowired
    ReportService reportService;

    @GetMapping("/")
    public String getDefaultPage() {
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String getWelcomePage(Model model, Authentication authentication) {
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "welcome";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @GetMapping("/home")
    public String getHomePage(Model model, Authentication authentication) {
        User user = userService.getUserByUsername(authentication.getName());
        List<User> userList = userService.getAllUser();
        List<Report> reportList = reportService.getAllReport();
        model.addAttribute("user", user);
        model.addAttribute("userList", userList);
        model.addAttribute("reportList", reportList);
        return "home";
    }

    @GetMapping("/report")
    public String getReportPage() {
        return "report";
    }

}
