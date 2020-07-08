package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.CeeklyApplication;
import com.corgiduo.ceekly.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = CeeklyApplication.class)
class UserMapperTest {

    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    UserMapper userMapper;

    @Test
    void insertUser() {
        Date date = new Date();
        User user1 = new User(null, "test1", "test1_passwd",
                null, null, null, null, date, date, null, null);
        User user2 = new User(null, "test2", "test2_passwd",
                null, null, null, null, date, date, null, null);
        userMapper.insertUser(user1);
        userMapper.insertUser(user2);
    }

    @Test
    void deleteAllUser() {
    }

    @Test
    void deleteUserByUsername() {

    }

    @Test
    void selectAllUser() {
        List<User> userList = userMapper.selectAllUser();
        for (User user : userList) {
            logger.info(user.getUsername() + " | " + user.getPassword());
        }
    }

    @Test
    void selectUserByUsername() {
        User user = userMapper.selectUserByUsername("test1");
        logger.info(user.getPassword());
    }
}