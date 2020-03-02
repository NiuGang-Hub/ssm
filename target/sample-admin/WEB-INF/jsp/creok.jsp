<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/13
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>创建成功</title>
    </head>
    <body>
        您的账号为：${user.userId}<br>
        <p2>5秒后自动跳转至登陆页面</p2>
        <script language=javascript>
            setTimeout('window.location="http://127.0.0.1:8080/sample_web_war_exploded"',5000)
        </script>
    </body>
</html>
