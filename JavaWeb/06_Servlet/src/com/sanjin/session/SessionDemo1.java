package com.sanjin.session; /**
 * @author sanjin
 * @date 2022/1/25 下午8:50
 * @description
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SessionDemo1", value = "/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        /*Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
