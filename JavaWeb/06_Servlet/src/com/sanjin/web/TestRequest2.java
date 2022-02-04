package com.sanjin.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author sanjin
 * @date 2022/1/21 上午10:52
 * @description
 */
@WebServlet("/testResponse2")
public class TestRequest2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            System.out.println(name+"="+req.getHeader(name));
        }
    }
}
