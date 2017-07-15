<%--
  Created by IntelliJ IDEA.
  User: laoli
  Date: 2017/7/6
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>复杂参数绑定</title>
</head>
<body>
<tr>
<h1> {1}订单号：${p1.orderNo}</h1>

</tr>
<tr>
    <h1> {2}厂家1名称：${p1.purDetail[0].factoryCode}</h1>

</tr>
<tr>
    <h1> {2}厂家2名称：${p1.purDetail[1].factoryCode}</h1>

</tr>
<tr>
    <h1> {2}开单人：${p1.salesMan.name}</h1>

</tr>
</body>
</html>
