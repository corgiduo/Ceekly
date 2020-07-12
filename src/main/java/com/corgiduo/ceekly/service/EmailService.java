package com.corgiduo.ceekly.service;

import com.corgiduo.ceekly.dao.ReportMapper;
import com.corgiduo.ceekly.dao.UserMapper;
import com.corgiduo.ceekly.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmailService {

    private Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    UserMapper userMapper;
    @Autowired
    ReportMapper reportMapper;
    @Autowired
    JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String fromAddr;

    @Scheduled(cron = "0 30 17 * * 7")
    public void emailAlter() {
        final String title = "Ceekly | 本周周报提醒";
        final String content = "，您本周的周报尚未提交，请尽快填写！\n\nCeekly：http://ceekly.corgiduo.com";
        List<User> userList = userMapper.selectAllUser();
        for (User user : userList) {
            if (!hasReport(user.getUsername())) {
                logger.info(user.getNickname() + " has not submitted report");
                String toAddr = user.getEmail();
                if (toAddr != null && toAddr != "") {
                    logger.info("mail address of " + user.getNickname() + " is not null");
                    sendTextEmail(fromAddr, toAddr, title, user.getNickname() + content, user.getNickname());
                }
            }
        }
    }

    private void sendTextEmail(String fromAddr, String toAddr, String title, String content, String nickname) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromAddr);
        message.setTo(toAddr);
        message.setSubject(title);
        message.setText(content);
        Date date = new Date();
        try {
            mailSender.send(message);
            logger.info("email has been sent to " + nickname + " | " + date);
        } catch (Exception e) {
            logger.error("an exception occurred while sending mail | " + date);
            e.printStackTrace();
        }
    }

    private boolean hasReport(String username) {
        Date latestReportDate = reportMapper.selectLatestReportDateByUsername(username);
        Date lastSundayDate = getLastSundayDate();
        Date nextSundayDate = getNextSundayDate();
        return latestReportDate.getTime() <= nextSundayDate.getTime()
                && latestReportDate.getTime() > lastSundayDate.getTime();
    }

    private Date getNextSundayDate() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        long time = calendar.getTimeInMillis();
        long zero = time / (1000 * 3600 * 24) * (1000 * 3600 * 24) + (1000 * 3600 * 24)
                - TimeZone.getDefault().getRawOffset();
        return new Date(zero);
    }

    private Date getLastSundayDate() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        long time = calendar.getTimeInMillis();
        long zero = time / (1000 * 3600 * 24) * (1000 * 3600 * 24) - 6 * (1000 * 3600 * 24)
                - TimeZone.getDefault().getRawOffset();
        return new Date(zero);
    }

}
