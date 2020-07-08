package com.corgiduo.ceekly.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        userService.createUser("corgiduo", "nicolas214", "84d6fe70ac38569949c0fb01df858a6c");
    }

}