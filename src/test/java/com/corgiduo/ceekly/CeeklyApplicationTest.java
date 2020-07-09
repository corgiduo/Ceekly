package com.corgiduo.ceekly;

import com.corgiduo.ceekly.service.EmailService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CeeklyApplicationTest {

    private Logger logger = LoggerFactory.getLogger(CeeklyApplicationTest.class);

    @Autowired
    EmailService emailService;

    @Test
    public void test() {

    }

}