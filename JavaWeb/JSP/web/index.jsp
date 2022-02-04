<%--
  Created by IntelliJ IDEA.
  User: sanjin
  Date: 2022/1/5
  Time: 上午12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <p>您的账号为：<%= request.getParameter("userName") %></p>
    <p>您的密码为：<%= request.getParameter("userPwd") %></p>
    $END$

  </body>
</html>
