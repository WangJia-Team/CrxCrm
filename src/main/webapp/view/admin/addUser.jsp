<%--
  Created by IntelliJ IDEA.
  User: WangJia
  Date: 2021/1/7
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新建员工</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style>
    span {
        color: red;
    }
</style>
<script src="<c:url value="/res/jquery-3.5.1.min.js"/>"></script>
<script>
$(function () {
    $("#btn").click(function () {
        $.ajax({
            type: "post",
            url: "/CrxCrm/addUser.do",
            dataType: "json",
            data: {
                username: $("#mobile").val(),
                password: $("#pwd").val(),
                realname: $("#uname").val(),
                mobile: $("#mobile").val(),
                email: $("#email").val(),
                sex: $("#sex").val(),
                parentId: $("#parentId").val()//待更新
            },
            success: function (data) {
                if (data.mess == "success") {
                    location = "/CrxCrm/userView.do";
                } else {
                    alert("错误");
                }
            }, error: function () {
                alert("异常")
            }
        })
    })
})
</script>
<body>
<div style="margin: 150px;padding-right: 500px;padding-left: 500px">
<form>
    <div class="form-group">
        <label for="mobile"><span>*</span>手机号（登录名）</label>
        <input type="text" class="form-control" id="mobile" placeholder="手机号（登录名）">
    </div>
    <div class="form-group">
        <label for="uname"><span>*</span>姓名</label>
        <input type="text" class="form-control" id="uname" placeholder="姓名">
    </div>
    <div class="form-group">
        <label for="pwd"><span>*</span>登录密码</label>
        <input type="text" class="form-control" id="pwd" placeholder="登录密码">
    </div>
    <div class="form-group">
        <label for="email">邮箱</label>
        <input type="text" class="form-control" id="email" placeholder="邮箱">
    </div>
    <div class="form-group">
        <label for="sex">性别</label>
        <input type="text" class="form-control" id="sex" placeholder="性别">
    </div>
    <div class="form-group">
        <label for="a"><span>*</span>部门</label>
        <input type="text" class="form-control" id="a" placeholder="部门">
    </div>
    <div class="form-group">
        <label for="b">岗位</label>
        <input type="text" class="form-control" id="b" placeholder="岗位">
    </div>
    <div class="form-group">
        <label for="parentId">直属上级</label>
        <input type="text" class="form-control" id="parentId" placeholder="直属上级">
    </div>
    <div class="form-group">
        <label for="d"><span>*</span>角色</label>
        <input type="text" class="form-control" id="d" placeholder="角色">
    </div>
    <button id="btn" type="button" class="btn btn-default">提交</button>
</form>
</div>
</body>
</html>
