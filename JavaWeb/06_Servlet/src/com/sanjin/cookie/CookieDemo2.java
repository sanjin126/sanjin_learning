package com.sanjin.cookie; /**
 * @author sanjin
 * @date 2022/1/25 下午2:59
 * @description
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieDemo2", value = "/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            System.out.println(cookies[i].getName()+":"+cookies[i].getValue());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
