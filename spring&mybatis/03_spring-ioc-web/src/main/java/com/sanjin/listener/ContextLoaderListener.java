package com.sanjin.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author sanjin
 * @date 2022/2/16 下午4:49
 * @description
 */

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String contextConfigLocation = context.getInitParameter("contextConfigLocation");
        System.out.println("contextConfigLocation = " + contextConfigLocation);
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        context.setAttribute("app",app);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
