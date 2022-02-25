package com.sanjin.dao.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sanjin
 * @date 2022/2/16 下午4:31
 * @description
 */
public class testDAO {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext.xml");
        new UserDAOImpl().save();
    }
}
