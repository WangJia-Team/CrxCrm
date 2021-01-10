<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/5
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<table width="700" border="1" cellspacing="0" cellpadding="0">
    <tr>
        <th>序号</th>
        <th>用户</th>
        <th >密码</th>
        <th width="100">手机号</th>
        <th width="100">明日任务</th>
        <th width="100">问题</th>

    </tr>
    <c:forEach items="${userView}" var="l" varStatus="vas">
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
