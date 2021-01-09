<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/5
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>悟空CRM</title>
</head>
<body>
 本人及下属
 <select name="mySelect" id="mySelect">
     <option>本年</option>
     <option>本周</option>
     <option>本月</option>
     <option>本季度</option>
     <option>上周</option>
     <option">上月</option>
     <option>上季度</option>
     <button type="button">数据查重</button>
 </select>
 <frameset rows="20%,40%,40%">
     <frame src="frame_a.htm">

     <frame src="frame_b.htm">
     <frame src="frame_c.htm">
 </frameset>
</body>
</html>
