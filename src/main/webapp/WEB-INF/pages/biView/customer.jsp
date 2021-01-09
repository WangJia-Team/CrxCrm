<%--
  Created by IntelliJ IDEA.
  User: 19307
  Date: 2021/1/7
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="<c:url value="/res/jquery-3.5.1.min.js"/>"></script>
<body>
<table class="table table-bordered">
<div>
    <div>
        <select>
            <option value="volvo">今天</option>
            <option value="saab">本周</option>
            <option value="opel">上周</option>
            <option value="audi">本月</option>
            <option value="">上月</option>
            <option>本季度</option>
            <option>上季度</option>
            <option>本年</option>
            <option>去年</option>
        </select>
    </div>

</div>
</table>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>员工姓名</th>
        <th>新增客户数</th>
        <th>成交客户数</th>
        <th>客户成交率(%)</th>
        <th>合同金额</th>
        <th>回款金额</th>
        <th>未回款金额</th>
        <th>回款完成率(%)</th>
    </tr>
    <c:forEach items="${list }" var="c" varStatus="vas">
        <tr><td>${vas.count}</td>
            <td>${c.uname}</td>
            <td>${c.adcunum}</td>
            <td>${c.dealnum}</td>
            <td>${c.dealrate}</td>
            <td>${c.contractmoney}</td>
            <td>${c.returnmoney}</td>
            <td>${c.noremoney}</td>
            <td>${c.remoneyrate}</td>


        </tr>
        <!-- ${pageContext.request.contextPath }获得当前工程路径 -->


    </c:forEach>
</table>
</body>
</html>
