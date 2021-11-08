<%--
  Created by IntelliJ IDEA.
  User: zhaoxiyu
  Date: 2021/10/31
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>论坛贴吧管理平台</title>
</head>
<body>
<%--    ${themeList}--%>
<%--    ${pageInfo}--%>
    <h2 align="center">论坛贴吧管理平台</h2>
    <div align="center">
        <form id="myForm" action="allTheme2.action">
            输入主题：<input type="text" name="tname" value="${params.tname}">
            <input id="currentPage" type="hidden" name="pageNum" value="${params.pageNum}">
            <input type="submit" value="查询">
        </form>

    </div>
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>编号</td>
            <td>主题</td>
            <td>楼主</td>
            <td>贴吧状态</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${pageInfo.list}" var="theme" varStatus="no">
            <tr>
                <td>${no.count+(pageInfo.pageNum-1)*pageInfo.pageSize}</td>
<%--                <td>${theme.tid}</td>--%>
                <td>${theme.tname}</td>
                <td>${theme.host}</td>
                <td>${theme.status}</td>
                <td>
                    <a href="jsp/commentList.jsp">查看评论</a>&nbsp;&nbsp;
                    <a href="deleteTheme?id=${theme.tid}">删除主题</a>
                </td>
            </tr>
        </c:forEach>

        <tr>
            <td align="center" colspan="5">
                <a href="jsp/insertTheme.jsp">添加主题</a>
            </td>
        </tr>

    </table>
    <table align="center">
<%--        <tr>--%>
<%--            <td><a href="allTheme2.action?pageNum=1">首页</a></td>--%>
<%--            <td><a href="allTheme2.action?pageNum=${pageInfo.pageNum-1}">上一页</a></td>--%>
<%--            <td><a href="allTheme2.action?pageNum=${pageInfo.pageNum+1}">下一页</a></td>--%>
<%--            <td><a href="allTheme2.action?pageNum=${pageInfo.pages}">尾页</a></td>--%>
<%--        </tr>--%>
        <tr>
            <td><a href="javascript:toPage(1)">首页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pageNum-1})">上一页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pageNum+1})">下一页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pages})">尾页</a></td>
        </tr>
        <tr align="center">
            <td colspan="4">第${pageInfo.pageNum}页/共${pageInfo.pages}页</td>
        </tr>
    </table>
    <script type="text/javascript">
        function toPage(pageNum) {
            var currentPage = document.getElementById("currentPage");
            currentPage.value = pageNum;
            var myForm = document.getElementById("myForm");
            myForm.submit();

        }
    </script>
</body>
</html>
