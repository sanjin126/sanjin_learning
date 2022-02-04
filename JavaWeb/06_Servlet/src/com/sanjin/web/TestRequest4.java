package com.sanjin.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/21 下午2:04
 * @description
 */
@WebServlet("/request4")
public class TestRequest4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("request4------------");
        req.setAttribute("name", "wangxin");
        System.out.println(req.getAttribute("name"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/request3");
        dispatcher.forward(req, resp);
        System.out.println("request4------------end");
    }
}
