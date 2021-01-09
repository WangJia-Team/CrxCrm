<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/5
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"><link rel="icon" href="https://jscdn.com.cn/highcharts/images/favicon.ico">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://unpkg.com/highcharts/highcharts.js"></script>
    <script src="https://unpkg.com/highcharts/modules/exporting.js"></script>
    <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
</head>
<body>
销售趋势<br>
<div id="container" style="min-width:400px;height:400px"></div>
<script>
    var chart = Highcharts.chart('container', {
        chart: {
            type: 'bar'
        },
        title: {
            text: '堆叠条形图'
        },
        xAxis: {
            categories: ['苹果', '橘子', '梨', '葡萄', '香蕉']
        },
        yAxis: {
            min: 0,
            title: {
                text: '水果消费总量'
            }
        },
        legend: {
            /* 图例显示顺序反转
             * 这是因为堆叠的顺序默认是反转的，可以设置
             * yAxis.reversedStacks = false 来达到类似的效果
             */
            reversed: true
        },
        plotOptions: {
            series: {
                stacking: 'normal'
            }
        },
        series: [{
            name: '合同金额',
            data: [5, 3, 4, 7, 2]
        }, {
            name: '汇款金额',
            data: [2, 2, 3, 2, 1]
        }, {
            name: '小潘',
            data: [3, 4, 4, 2, 5]
        }]
    });
</script>
</body>
</html>
