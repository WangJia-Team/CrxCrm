<%--
  Created by IntelliJ IDEA.
  User: 17442
  Date: 2021/1/6
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新建商机</title>
    <style type="text/css">
        html,body{
            margin: 0px;
            padding: 0px;
            height: 100%;
        }
        .center{
            background-color:lightcyan;
            width: 1000px;
            height: 100%;
            position: absolute;
            right: 50%;
            margin-right: -500px;
            z-index: 3;
        }
        .right{
            background-color: aliceblue;
            width: 100%;
            height: 100%;
            position: absolute;
            right: 0px;
            margin-left: 50%;
            z-index: 2;
        }
        .left{
            background-color: aliceblue;
            width: 100%;
            height: 100%;
            position: absolute;
            left: 0px;
            margin-right: 50%;
            z-index: 2;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#bc").click(function () {
                $.ajax({
                    type: "post",
                    url: "/CrxCrm/under.do",
                    dataType: "json",
                    data: {
                        bname: $("#bname").val(),
                        cname:$("#cname" ).val(),
                        tid:$("#tid" ).val(),
                        is_end:$("#is_end" ).val(),
                        money:$("#money" ).val(),
                        deal_date:$("#deal_date" ).val(),
                        remark:$("#remark" ).val(),
                        discount_rate:$("#discount_rate" ).val(),
                        cpmoney:$("#cpmoney" ).val(),
                    },
                    success: function (data) {
                        if (data.mess == "success") {
                            location = "/CrxCrm/shangji/under.jsp"
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
</head>

<body>
<div class="right"></div>
<div class="center">
    <form action="" method="post">
        <b style="margin:20px 50px 75px;">新建商机</b>
        <br>基本信息:</br>
        商机名称  :<input name="bname" id="bname" type="text" placeholder="请输入商机" style="width:200px; height:20px;" >
        -------------
        客户名称:<input name="cname" id="cname" type="text" placeholder="请添加客户" style="width:200px; height:20px;" ></br>
        商机状态组:
        <select  style="width:200px; height:20px;" name="tid" id="tid">
        <option>电子产品销售流程</option>
        </select>
        ----------
        商机阶段:<select placeholder="请选择" name="is_end" id="is_end"  style="width:200px; height:20px;">
        <option>赢单</option>
        <option>输单</option>
        <option>无效</option>
        </select></br>
        商机金额(元):<input name="money" id="money" type="text" placeholder="请输入金额" style="width:200px; height:20px;" >
        -----
        预计成交日期:<input name="deal_date" id="deal_date" type="datetime-local" placeholder="请选择日期" style="width:200px; height:20px;" ></br>

        <textarea name="remark" id="remark" clos="20" rows="5" >备注:</textarea></br>
        产品:
        <button type="button"  style="background-color: #00b7ee;float:right" >添加产品</button></br>
        整单折扣%:<input name="discount_rate" id="discount_rate" type="number" placeholder="请输入" style="width:75px; height:20px;" >
        ------------
        产品总金额:<input name="cpmoney" id="cpmoney" type="text" placeholder="请输入" style="width:75px; height:20px; " >元</br>

        <button type="button"  style="background-color: #00E8D7;" id="bc">保存</button>

        <button type="button" style="background-color: #AF2018;float:right">取消</button>
    </form>



</div>
<div class="left"></div>
</body>
</html>
