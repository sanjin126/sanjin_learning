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
@WebServlet("/request3")
public class TestRequest3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("request3------------");
        String refer = req.getHeader("Referer");
        System.out.println(req.getAttribute("name"));
        System.out.println(refer);
        if (refer!=null){
            if (refer.contains("servlet")){
                System.out.println("欢迎您");
            } else {
                System.out.println("不能看哦");
            }
        }
    }
}
