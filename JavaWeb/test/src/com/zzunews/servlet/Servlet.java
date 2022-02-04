package com.zzunews.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/7 上午9:55
 * @description
 */

@WebServlet("/login")
public class Servlet extends HttpServlet {
    @Override
    /**
     * 解决中文乱码：
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("GBK");
        String userName = req.getParameter("userName");
        String idCode = req.getParameter("idCode");
        System.out.println("用户名" + userName + "密码" + idCode);

        HttpSession session = req.getSession();
        String id = session.getId();
        System.out.println("session id=" + id);
        session.setAttribute("name", "sanjin");
        Object name = session.getAttribute("name");
        System.out.println("session's name："+name);

        resp.sendRedirect("work1.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello, post");
    }
}
