<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/7
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                url: "/CrxCrm/addProduct.do",
                dataType: "json",
                data: {
                    proname: $("#proname").val(),
                    pronum: $("#pronum").val(),
                    prounit: $("#prounit").val(),
                    categoryId: $("#categoryId").val(),
                    prostatus: $("#prostatus").val(),
                    price: $("#price").val(),
                    discription: $("#discription").val(),
                    creatUserId: $("#creatUserId").val(),
                    ownerUserId: $("#ownerUserId").val(),
                    procreatetime: $("#procreatetime").val(),

                },
                success: function (data) {
                    if (data.mess == "success") {
                        location = "/CrxCrm/pro.do";
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
<form>
    <div class="form-group">
        <label for="exampleInputEmail1">产品名称</label>
        <input type="proname" class="form-control" id="exampleInputEmail1" placeholder="产品名称">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">产品编码</label>
        <input type="pronum" class="form-control" id="exampleInputPassword1" placeholder="产品编码">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">单位</label>
        <select class="form-control">
            <option>枚</option>
            <option>瓶</option>
            <option>盒</option>
            <option>台</option>
            <option>吨</option>
            <option>千克</option>
            <option>米</option>
            <option>箱</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">产品类别</label>
        <select class="form-control">
            <option>1</option>
            <option>2</option>
            <option>3</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">是否上架</label>
        <select class="form-control">
            <option>上架</option>
            <option>下架</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">标准价格(元)</label>
        <input type="price" class="form-control" id="exampleInputPasswo  rd1" placeholder="标准价格">
    </div>
    <div>
        <label for="exampleInputPassword1">商品描述</label>
    <textarea class="form-control" rows="3">描述</textarea>
    </div>
    <button  id="btn" type="button" class="btn btn-primary">保存</button>
    <button type="button" class="btn btn-default">取消</button>

</form>
</body>
</html>
