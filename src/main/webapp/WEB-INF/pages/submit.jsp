<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/test20" method="post">
  采购单号是：  <input name="name">
   业务员名字是：<input name="sex">

    <%--1号产品名字是：<input name="purDetail[0].factoryCode">--%>
    <%--2号产品名字是：<input name="purDetail[1].factoryCode">--%>
    <input type="submit">
</form:form>

</body>
</html>
