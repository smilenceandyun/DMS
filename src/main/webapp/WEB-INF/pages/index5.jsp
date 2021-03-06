<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0"/>
    <script type="text/javascript" src="../../statics/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../statics/select/ansel_select.js"></script>

    <style>
        html{font-family: "Helvetica Neue", Helvetica, sans-serif;  font-size: 20px;  }
        html,body {  -webkit-touch-callout:none;  -webkit-text-size-adjust:none;  -webkit-tap-highlight-color:rgba(0, 0, 0, 0);  -webkit-user-select:auto;  width: 100%;}
        body {  line-height: 1.5;  font-size: 0.8rem;  color: #212121;  background-color: #f5f5f5;outline: 0;}
        html,body,header,section,footer,div,ul,ol,li,img,a,span,em,del,legend,center,strong,var,fieldset,form,label,dl,dt,dd,cite,input,hr,time,mark,code,figcaption,figure,textarea,h1,h2,h3,h4,h5,h6,p{  margin:0;  border:0;  padding:0;  font-style:normal;  }
        * {  -webkit-box-sizing: border-box;  box-sizing: border-box;  -webkit-user-select: auto;  -webkit-tap-highlight-color: transparent;  outline: none;  }
        ul, li {  list-style: none;  }
        p {  font-size: 0.7rem;  color: #757575;  }
        a {  color: #0062cc;  text-decoration: none;  background-color: transparent;  }
        i {font-style:normal}
        textarea {overflow: hidden;resize: none;  }
        button {overflow: visible;}
        button,select {  text-transform: none;  }
        .demo {}

        /*插件自定义样式*/
        .ansel_input {height:40px;line-height: 40px;margin:30px auto;width:200px;padding:0 10px;background:#fff;border-radius: 4px;}
        .ansel_input .ansel_inputval {height:40px;line-height: 40px;width:100%;}
    </style>
</head>
<body class="">
<div class="main">
    1、指定选中数据
    <div class="demo">
            <select  class="select" isval="true" msg="选择数据1">
            <option value="">选择数据1</option>
            <option value="aaa" selected>aaa</option>
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