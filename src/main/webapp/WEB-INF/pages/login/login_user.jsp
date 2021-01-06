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
<link href="<c:url value="/res/bootstrap.css"/>">
<script src="<c:url value="/res/jquery-3.5.1.min.js"/>"></script>
<script>
    $(function() {
        $("#btn").click(function() {
            $.ajax({
                type : "post",
                url : "/CrxCrm/login.do",
                dataType : "json",
                data : {
                    username : $("#uname").val(),
                    pwd : $("#pwd").val()

                },
                success : function(data) {
                    if (data.mess == "success") {
                        location = "/CrxCrm/view/main.jsp"
                    } else {
                        alert("错误");
                    }
                },
                error : function() {
                    alert("异常")
                }
            })
        })
    })
</script>
<body>
<form class="form-horizontal">
    <div class="form-group">
        <label for="uname" class="col-sm-2 control-label">Email</label>
        <div class="col-sm-10">
            <input name="username" type="text" class="form-control" id="uname" placeholder="Username">
        </div>
    </div>
    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-10">
            <input name="pwd" type="password" class="form-control" id="pwd" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button id="btn" type="button" class="btn btn-default">Sign in</button>
        </div>
    </div>
</form>
</body>
</html>
