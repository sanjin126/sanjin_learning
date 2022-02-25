package com.sanjin.servlet;

import com.alibaba.fastjson.JSON;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author sanjin
 * @date 2022/2/10 下午11:30
 * @description
 */
@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/json;charset=utf-8");
        User sanjin = new User("sanjin", 21, new String[]{"北京", "上海"});
        User wangxin = new User("wangxin", 21, new String[]{"北京", "郑州"});
        User jinshui = new User("jinhsui", 21, new String[]{"北京", "郑州"});
        ArrayList<User> users = new ArrayList<>();
        users.add(sanjin);
        users.add(wangxin);
        users.add(jinshui);

        String json = JSON.toJSONString(users);
        resp.getWriter().write(json);
    }
}
