
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>登录案例</title>
    <script>

        window.onload = function () {

            document.getElementById("imgcode").onclick = function () {
                let date = new Date();
                this.src = "/servlet/respDemoCode?"+ date.getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
    <form action="/servlet/login" method="post">
    <table>
        <tr>
            <td>账号：<input name="id" type="text"></td>
        </tr>
        <tr>
            <td>密码：<input name="pwd" type="password"></td>
        </tr>
        <tr>
            <td>验证码：<input name="code" id="code" type="text"></td>
            <td><img src="/servlet/respDemoCode" alt="" id="imgcode"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>


    </table>
        <div><%= request.getContextPath() %></div>
        <div><%=request.getAttribute("iderr")==null?"":request.getAttribute("iderr")  %></div>
        <div><%=request.getAttribute("codeerr")==null?"":request.getAttribute("codeerr")%></div>
    </form>
</body>
</html>
