package com.sanjin.web;

import com.sanjin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/2/16 下午4:36
 * @description
 */
@WebServlet(value = "/userServlet",loadOnStartup = 1)
public class UserServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("true = " + true);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        UserService bean = app.getBean(UserService.class);
        bean.save();


    }
}
