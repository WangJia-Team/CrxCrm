<%--
  Created by IntelliJ IDEA.
  User: 17442
  Date: 2021/1/6
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

        div{width:100%;}
        .top{height:60px; background:aliceblue;}
        .nav{height:900px; background:lightcyan;position:absolute;}
        .foot{position:absolute; height:100px;bottom:0px; background:aliceblue;}
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="res/bootstrap.min.css">
    <script src="res/jquery-3.5.1.min.js"></script>
</head>
<body>
<div id="cz" class="top">
    <b style="margin:20px 50px 75px;">商机管理</b>
    <input style="margin:20px 0px 75px 230px;"  type="text" name="search" placeholder="请输入商机名称" >
    <input type="button" value="搜索" class="cc">
    <input type="button" value="+新建商机" style="margin:20px 200px 75px 200px;">
</div>
<div class="nav">
    <table class="table table-bordered">
        <tr>
            <th><input type="checkbox" id="check"> </th>
            <th>标准价格</th>
            <th>创建人</th>
            <th>产品名称</th>
            <th>是否上架</th>
            <th>产品编码</th>
            <th>创建时间</th>
            <th>负责人</th>
            <th>单位</th>
            <th>产品类别</th>

        </tr>
        <c:forEach items="${list}" var="r" varStatus="vas">
            <tr>
                <td>${vas.count}</td>
                <td>${b.price}</td>
                <td>${b.creat_user_id}</td>
                <td>${b.proname}</td>
                <td>${b.prostatus}</td>
                <td>${b.pronum}</td>
                <td>${b.procreatetime}</td>
                <td>${b.owner_user_id}</td>
                <td>${b.prounit}</td>
                <td>${b.category_id}</td>

            </tr>
        </c:forEach>
    </table>
</div>
<div class="foot"></div>
</body>
</html>
