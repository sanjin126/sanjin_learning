<%@ page import="com.sanjin.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: sanjin
  Date: 2022/1/26
  Time: 下午7:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="" %>
<html>
<head>
    <title>el表达式</title>
</head>
<body>
    <%
        User user = new User(1, "sanjin", 11);
        session.setAttribute("u", user);
    %>

    ${3>4}
    \${3>4}
    ${! empty str}
    ${empty str}
    <hr>
    <h1>获取对象</h1>
    ${sessionScope.u.id}
    ${sessionScope.u.name}
    ${sessionScope.u.age + 1}


</body>
</html>
