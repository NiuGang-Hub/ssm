<%--
  Created by IntelliJ IDEA.

  Date: 2018/8/24
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>用户信息</title>
    </head>
    <body>
        <h2>Hello 你好</h2>
        <p>用户ID:${user.userId}</p>
        <p>用户名:${user.userName}</p>
        <a href="logout">退出登录</a>
        <div style="height: 500px;width: 600px;">
            <div id="weather-view-he"></div>
            <script>
            WIDGET = {ID: 'kqhLUcwUGU'};
            </script>
            <script type="text/javascript" src="https://apip.weatherdt.com/view/static/js/r.js?v=1111"></script>
	    </div>
    </body>
</html>
