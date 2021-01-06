<%--
  Created by IntelliJ IDEA.
  User: 曲超凡
  Date: 2021/1/6
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table >
<thead>
<tr>
    <th>序号</th>
    <th>用户名</th>
    <th>职务</th>
    <th>操作</th>
    <th>序号</th>
    <th>用户名</th>
    <th>职务</th>
    <th>操作</th>
    <th>序号</th>
    <th>用户名</th>
    <th>职务</th>
    <th>操作</th>
    <th>序号</th>
    <th>用户名</th>
    <th>职务</th>
    <th>操作</th>
    <th>序号</th>
    <th>用户名</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="l">
    <tr>
    <td>${l.cname}</td>
    <td></td>
    <td></td>
    </tr>
</c:forEach>
</body>
</html>
