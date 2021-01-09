<%--
  Created by IntelliJ IDEA.
  User: WangJia
  Date: 2021/1/7
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工管理</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="<c:url value="/res/jquery-3.5.1.min.js"/>"></script>
<body>
<div style="margin: 100px">
    <a href="/CrxCrm/view/admin/addUser.jsp">新建员工</a>
</div>
<div style="margin-left: 150px">
<table class="table table-hover">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>手机号</th>
        <th>性别</th>
        <th>邮箱</th>
        <th>部门</th>
        <th>角色</th>
        <th>岗位</th>
        <th>直属上司</th>
    </tr>
<c:forEach items="${userView}" var="u" varStatus="vas">
    <tr>
        <td>${vas.count}</td>
        <td>${u.realname}</td>
        <td>${u.mobile}</td>
        <c:if test="${u.sex eq 0}">
            <td></td>
        </c:if>
        <c:if test="${u.sex eq 1}">
            <td>男</td>
        </c:if>
        <c:if test="${u.sex eq 2}">
            <td>女</td>
        </c:if>
        <td>${u.email}</td>
    <c:forEach items="${depts}" var="d">
        <c:if test="${u.deptId eq d.deptId}"><td>${d.name}</td></c:if>
    </c:forEach>
        <td>暂无</td>
        <td>暂无</td>
        <td>暂无</td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>
