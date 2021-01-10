<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 2021/1/6
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/CrxCrm/log/save.do" method="post" >
    日志类型
    <select id="categoryid" name="categoryid">
        <option value="1">日志</option>
        <option value="2">周志</option>
        <option value="3">月至</option>
    </select><br/>
今日任务
<textarea   type="text/plain" name="today" id="today"  style="width:100%;height:100px;"></textarea>
明日任务
<textarea   type="text/plain" name="tomorrow" id="tomorrow"  style="width:100%;height:100px;"></textarea>
问题
<textarea   type="text/plain" name="question" id="question"  style="width:100%;height:100px;"></textarea>
    发送给<br/>
    <input type="submit" value="提交">
    </form>
</body>
</html>
