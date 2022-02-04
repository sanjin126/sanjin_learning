package com.sanjin.web;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/19 下午6:35
 * @description
 */
@WebServlet(urlPatterns = "/demo3")
public class annotationTest implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("使用注解配置");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
