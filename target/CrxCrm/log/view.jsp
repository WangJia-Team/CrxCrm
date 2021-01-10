<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 2021/1/6
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>


<body>
<table width="700" border="1" cellspacing="0" cellpadding="0">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th >创建日期</th>
        <th width="100">今日任务</th>
        <th width="100">明日任务</th>
        <th width="100">问题</th>

    </tr>
<c:forEach items="${list}" var="l" varStatus="vas">
    <tr>
        <td>${vas.count}</td>
        <td>${l.username}</td>
        <td>${l.data}</td>
        <td>${l.today}</td>
        <td>${l.tomorrow}</td>
        <td>${l.question}</td>

    </tr>
</c:forEach>
</table>
</body>
</html>
