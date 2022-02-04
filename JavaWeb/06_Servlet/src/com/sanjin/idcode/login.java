package com.sanjin.idcode; /**
 * @author sanjin
 * @date 2022/1/25 下午9:32
 * @description
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String code = request.getParameter("code");

        HttpSession session = request.getSession();
        String idcode = (String) session.getAttribute("idcode");
        session.removeAttribute("idcode");

        String contextPath = request.getContextPath();
        if (idcode!=null && idcode.equalsIgnoreCase(code)){
            if ("123".equals(pwd) && "root".equals(id)){
                session.setAttribute("usrid", "root");
                response.sendRedirect(contextPath+"/success.jsp");
            } else {
                request.setAttribute("iderr", "用户名或密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

        } else {
            request.setAttribute("codeerr", "验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
