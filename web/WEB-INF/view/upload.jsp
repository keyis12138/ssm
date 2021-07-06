<%--
  Created by IntelliJ IDEA.
  User: A9819
  Date: 2021/7/6
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath}/file/doupload">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>

</body>
</html>
