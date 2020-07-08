package com.corgiduo.ceekly.controller;

import com.corgiduo.ceekly.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReportController {

    private Logger logger = LoggerFactory.getLogger(ReportController.class);

    @Autowired
    ReportService reportService;

    @PostMapping("/submit")
    public String postReportSubmit(Authentication authentication, String reportContent, String planContent) {
        logger.info(authentication.getName() + " | " + reportContent + " | " + planContent);
        if (reportService.createReport(authentication.getName(), reportContent, planContent)) {
            return "redirect:/home";
        } else {
            return "redirect:/report";
        }
    }

}
