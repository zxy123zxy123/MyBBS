<%--
  Created by IntelliJ IDEA.
  User: zhaoxiyu
  Date: 2021/10/31
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>添加主题</h2>
    <form action="${pageContext.request.contextPath}/insertTheme">
        主&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题 <input type="text" name="tname"><br>
        楼&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主 <input type="text" name="host"><br>
        贴吧状态 <input type="text" name="status"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
