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
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0"/>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script src="../../statics/select/ansel_select.js"></script>
</head>
<body class="">
<div class="main">
    1、指定选中数据
    <div class="demo">
        <select class="select" id="aaaa" >
            <option value="">选择数据1</option>
            <option value="aaa" >aaa</option>
            <option value="bbb">bbb</option>
            <option value="ccc">ccc</option>
            <option value="ddd">ddd</option>
            <option value="high">high</option>
            <option value="evaporation">evaporation</option>
            <option value="moisture">moisture</option>
            <option value="when">when</option>
            <option value="thin">thin</option>
            <option value="approach">approach</option>
            <option value="benefit">benefit</option>
        </select>
    </div>
    2、默认全部不选择
    <div class="demo">
        <select class="select" isval="true" msg="选择数据2">
            <option value="">选择数据2</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
    </div>
    3、允许不选择数据
    <div class="demo">
        <select class="select" isval="false" msg="选择数据2">
            <option value="">选择数据2</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
    </div>
</div>
<script>
    //插件初始化配置
    $('.select').anselcfg({});
</script>

</body>
</html>