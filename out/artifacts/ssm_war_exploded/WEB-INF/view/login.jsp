<%--
  Created by IntelliJ IDEA.
  User: A9819
  Date: 2021/7/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login&register.css">
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js" type="text/javascript">
    </script>
    <script>
        $(function () {
            $("#reg").click(
                function toRegister(){
                    window.location.href="${pageContext.request.contextPath}/user/register";
                }
            )
        })

    </script>
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form method="post" action="${pageContext.request.contextPath}/user/doLogin">
        <input type="text" required="required" placeholder="用户名" name="username" id="username">
        <input type="password" required="required" placeholder="密码" name="password" id="password">
        <button class="but" type="submit" id="btn"  onclick="onsubmit()">登录</button><button class="but" type="button" id="reg">注册</button>
    </form>
</div>
</body>
</html>
