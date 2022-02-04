package com.sanjin.cookie; /**
 * @author sanjin
 * @date 2022/1/25 下午5:02
 * @description
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieVisitor", value = "/CookieVisitor")
public class CookieVisitor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=gbk");
        boolean flag = false;
        for (Cookie cookie : request.getCookies()) {
            if ( "lastTime".equals(cookie.getName())){
                flag = true;
                String date = URLDecoder.decode(cookie.getValue(), "gbk");
                System.out.println(date);
                response.getWriter().write("last visiting time is:"+date);
            }
        }
        if (!flag){
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年 MM月dd日");
                String date = simpleDateFormat.format(new Date());
                String urlDate = URLEncoder.encode(date, "gbk");
                System.out.println(date+"--------"+urlDate);
                response.addCookie(new Cookie("lastTime", urlDate));
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.getWriter().write("welcome first visiting!");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
