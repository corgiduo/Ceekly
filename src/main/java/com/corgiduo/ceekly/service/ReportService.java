package com.corgiduo.ceekly.service;

import com.corgiduo.ceekly.dao.ReportMapper;
import com.corgiduo.ceekly.dao.UserMapper;
import com.corgiduo.ceekly.entity.Report;
import com.corgiduo.ceekly.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportService {

    private Logger logger = LoggerFactory.getLogger(ReportService.class);

    @Autowired
    ReportMapper reportMapper;
    @Autowired
    UserMapper userMapper;

    public List<Report> getAllReport() {
        return reportMapper.selectAllReport();
    }

    public boolean createReport(String username, String reportContent, String planContent) {
        logger.info(username + " | " + reportContent + " | " + planContent);
        Date date = new Date();
        User user = userMapper.selectUserByUsername(username);
        Report report = new Report(null, null, reportContent, planContent, date, date, null);
        return reportMapper.insertReport(user.getId(), report) == 1;
    }



}
