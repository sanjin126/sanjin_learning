package com.sanjin.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/23 下午5:45
 * @description
 */
@WebServlet("/contextDemo2")
public class ServletContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        System.out.println(context.getRealPath("1.txt"));
        System.out.println(context.getRealPath("WEB_INF/1.txt"));
        System.out.println(context.getRealPath("WEB_INF/classes/1.txt"));
    }
}
