<%--
  Created by IntelliJ IDEA.
  User: kokorozashiguohuang
  Date: 2021/5/24
  Time: 4:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/04_cookie_session/loginServlet" method="get">
    用户名:<input type="text" name="username" value="${cookie.username.value}"><br>
    密码:<input type="password" name="password" ><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
