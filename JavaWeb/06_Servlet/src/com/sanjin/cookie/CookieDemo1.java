package com.sanjin.cookie; /**
 * @author sanjin
 * @date 2022/1/25 下午2:57
 * @description
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieDemo1", value = "/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", "sanjin");
        Cookie cookie1 = new Cookie("msg", "sanjin");
        cookie.setMaxAge(30);
        cookie.setPath("/");
        cookie1.setPath("/");
        response.addCookie(cookie);
        response.addCookie(cookie1);

        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            System.out.println(cookies[i].getName()+":"+cookies[i].getValue());

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
