<%--
  Created by IntelliJ IDEA.
  User: shenq
  Date: 2021/1/6
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<style type="text/css">
    * {
        text-align: center;
    }
</style>
<body>
<h2 style="text-align: center;padding-top: 200px">Hello World!</h2>
<p>用户名：${user.realname}</p>
<p>员工编号：${user.num}</p>
<p>手机号：${user.mobile}</p>
<p>邮箱：${user.email}</p>
<p>ip地址：${user.lastLoginIp}</p>
<p>上一次登录时间：${user.lastLoginTime}</p>
<a href="/CrxCrm/logout.do">退出登录</a>
</body>
</html>
