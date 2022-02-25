package com.sanjin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sanjin.dao.UserDAO;
import sanjin.service.UserService;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author sanjin
 * @date 2022/2/13 下午4:40
 * @description
 */
public class testUserService {
    public static void main(String[] args) throws SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        app = new AnnotationConfigApplicationContext("sanjin");
        DataSource bean = app.getBean(DataSource.class);
        System.out.println(bean.getConnection());

    }
}
