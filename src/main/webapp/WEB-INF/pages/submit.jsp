<%--
  Created by IntelliJ IDEA.
  User: laoli
  Date: 2017/7/6
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类中类测试</title>
</head>
<body>
<form action="/test6" method="post">
  采购单号是：  <input name="orderNo">
   业务员名字是：<input name="salesMan.name">

    1号产品名字是：<input name="purDetail[0].factoryCode">
    2号产品名字是：<input name="purDetail[1].factoryCode">
    <input type="submit">
</form>

</body>
</html>
