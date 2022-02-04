package com.sanjin.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/21 上午10:52
 * @description
 */
@WebServlet("/testResponse")
public class TestRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getQueryString());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getProtocol());
        System.out.println(req.getRemoteAddr());
    }
}
