<%--
  Created by IntelliJ IDEA.
  User: A9819
  Date: 2021/7/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/login&register.css">
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form method="post">
        <input type="text" required="required" placeholder="用户名" name="loginName" id="username">
        <input type="password" required="required" placeholder="密码" name="password" id="password">
        <button class="but" type="button" id="btn">登录</button><button class="but" type="button" id="reg">注册</button>
    </form>
</div>
</body>
</html>