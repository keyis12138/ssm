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
            $("#btn").click(function(){
                var username = $("#username").val();
                var password = $("#password").val();
                $.post("${pageContext.request.contextPath}/user/doLogin",
                    {
                        username:username,
                        password:password
                    },
                    function (data){
                        if(data.result=="true"){
                            alert("登录成功");
                            if(data.role=="admin"){
                                alert("管理员")
                                //跳转至管理员界面




                                //location.href="AdminServlet?action=login";
                            }else{
                                alert("用户")
                                //跳转至用户界面




                                //location.href="ListServlet?username="+username;
                            }
                        }else{
                            alert("用户名或密码错误，请重新输入");
                        }
                    })
            })

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
    <form>
        <input type="text" required="required" placeholder="用户名" name="username" id="username">
        <input type="password" required="required" placeholder="密码" name="password" id="password">
        <button class="but" type="button" id="btn">登录</button><button class="but" type="button" id="reg">注册</button>
    </form>
</div>
</body>
</html>
