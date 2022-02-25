package com.sanjin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sanjin.config.SpringConfig;
import sanjin.service.UserService;

/**
 * @author sanjin
 * @date 2022/2/16 下午4:20
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = SpringConfig.class)
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUserservice(){
        userService.save();
    }
}
