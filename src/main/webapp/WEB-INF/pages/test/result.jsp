<%--
  Created by IntelliJ IDEA.
  User: laoli
  Date: 2017/7/6
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<tr>
    <c:if test="${!empty p1}">
        <h1> {1}简单阐述绑定测试结果：${p1}</h1>
    </c:if >


</tr>
<tr>
<c:if test="${!empty p2}">
    <h1> {2}简单阐述绑定测试结果：${p2}</h1>
</c:if >

</tr>

<tr>
<c:if test="${!empty p}">
    <h1> {3}绑定对象结果：名字是：${p.name}，性别是：${p.sex}</h1>
</c:if >



</tr>

<tr>
    <c:if test="${!empty p4}">
        <h1> {4}绑定对象结果：名字是：${p4.name}，性别是：${p4.sex},数组是：${p4.list[0] } ${p4.list[1]}</h1>
    </c:if >



</tr>
<tr>
    <c:if test="${!empty person}">
        <h1> {5}person对象结果：名字是：${person.name}</h1>
    </c:if >



</tr>
<tr>
    <c:if test="${!empty user}">
        <h1> {5}User对象结果：名字是：${user.name}</h1>
    </c:if >



</tr>


</body>
</html>
