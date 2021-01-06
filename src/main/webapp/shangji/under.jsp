<%--
  Created by IntelliJ IDEA.
  User: 17442
  Date: 2021/1/6
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        *{margin:0px; padding:0px;}
        div{width:100%;}
        .top{height:100px; background:aliceblue;}
        .nav{height:100%; background:cyan;position:absolute;}
        .foot{position:absolute; height:100px;bottom:0px; background:aliceblue;}
    </style>
</head>
<body>
<div id="cz" class="top">
    <p style="float:left">商机管理</p>
    <input type="text" name="search" placeholder="请输入商机名称">
    <input type="button" value="搜索" class="cc">
    <input type="button" value="+新建商机" style="float: right">
</div>
<div class="nav">这里如何自适应到底部</div>
<div class="foot"></div>
</body>
</html>
