<%--
  Created by IntelliJ IDEA.
  User: shenq
  Date: 2021/1/6
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="<c:url value="/res/jquery-3.5.1.min.js"/>"></script>
<script>
$(function () {
    $("#btn").click(function () {
        $.ajax({
            type: "post",
            url: "/CrxCrm/login.do",
            dataType: "json",
            data: {
                username: $("#uname").val(),
                pwd: $("#pwd").val()

            },
            success: function (data) {
                if (data.mess == "success") {
                    location = "/CrxCrm/view/main.jsp"
                } else {
                    alert("错误");
                }
            },
            error: function () {
                alert("异常")
            }
        })
    })
})
</script>
<body>
<div style="text-align:center;padding-top: 200px">
    <h3>欢迎使用crm平台</h3>
</div>
<div>
    <form class="form-horizontal">
        <div class="form-group">
            <label for="uname" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input name="username" type="text" class="form-control" id="uname" placeholder="Username">
            </div>
        </div>
        <div class="form-group">
            <label for="pwd" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input name="pwd" type="password" class="form-control" id="pwd" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button id="btn" type="button" class="btn btn-default">登录</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
