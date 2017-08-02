<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 家铭
  Date: 2017/7/18
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="../../../statics/lib/html5shiv.js"></script>
    <script type="text/javascript" src="../../../statics/lib/respond.min.js
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="../../../statics/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="../../../statics/css/admin/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="../../../statics/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="../../../statics/skin/green/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="../../../statics/css/admin/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="../../../statics/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <script type="text/javascript">
        //查询订单，使用post时，参数必须一一对应，才可以匹配到controller中
        function purSearch(){
//                 var search =$("input[id='search']").val();
            var search=$("#search").val();
            alert("确定要查询吗？");
            $.post('/pur_order/pur_search',{'search':search});
            window.location='pur_order';
        }
    </script>
    <%--<script language="javascript" type="text/javascript">--%>
        <%--function test(){--%>
            <%--document.getElementById("select0").remove(0);--%>
        <%--}--%>
    <%--</script>--%>


    <title>采购入库</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    ul{width:1200px; height:20px; size: 20px; color: rgba(0,0,0,0.5); font-weight: 600; font-size: inherit;}
    li{width:115px; height:20px; float:left;}
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购入库 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"><span class="r">共有数据：<strong>1</strong> 条</span> </div>--%>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">
        <form:form name="pur" id="pur" action="/pur_order/addP" method="post" role="form" onsubmit="return checkinput(this)">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
                <li><input id="bPurchaseOrdMOrdProcureNo" type="text" class="input-text" name="bPurchaseOrdMOrdProcureNo"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
                <li>
                    <select class="input-text" name="bPurchaseOrdMSalesman" onchange="test()" id="select0">
                    <option value="" >选择业务员</option>
                    <c:forEach items="${Staff}" var="Staff">
                    <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                    </c:forEach>
                    </select>
                    <select class="input-text" name="bPurchaseOrdMSalesman" id="select1" style="display:none;" onblur="javascript:checkyewuyuan(pur)">
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款</li>
                <li><input id="bPurchaseOrdMAdPaymoney" type="text" class="input-text" name="bPurchaseOrdMAdPaymoney"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算性质</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
                <li><input type="text" class="input-text" name=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务属性</li>
                <li><input type="text" class="input-text" name="bPurchaseOrdMServiceAttribute"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" name="bPurchaseOrdMOrdDate" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总经理</li>
                <li><input type="text" class="input-text" name="bPurchaseOrdMManagerNo"></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;付款性质</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家名称</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" name=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;状态</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" name=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建人</li>
                <li><input type="text" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单据总金额</li>
                <li><input type="text" class="input-text" name=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="float: left;width: 810px;"><input type="text" class="input-text" name=""></li>
            </ul>
        <%--<table class="table table-border table-bordered table-bg table-sort">--%>
            <%--<thead>--%>
            <%--<tr class="text-c">--%>
                <%--<th width="40">采购编号</th>--%>
                <%--<th width="40">订单号</th>--%>
                <%--<th width="40">客户名称</th>--%>
                <%--<th width="40">入库单号</th>--%>
                <%--<th width="40">预付款</th>--%>
                <%--<th width="40">结算方式</th>--%>
                <%--<th width="40">业务员</th>--%>
                <%--<th width="40">制单人</th>--%>
                <%--<th width="90">审核日期</th>--%>
                <%--<th width="90">备注</th>--%>
                <%--&lt;%&ndash;<th width="100">操作</th>&ndash;%&gt;--%>
            <%--</tr>--%>
            <%--</thead>--%>
            <%--<tbody>--%>
                <%--<tr class="text-c">--%>
                    <%--<td><input type="text" class="input-text" id="id" name="id" placeholder="请输入采购编号:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="orderNo" name="orderNo" placeholder="请输入订单号:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="clientName" name="clientName" placeholder="请输入客户名称:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="storageNo" name="storageNo" placeholder="请输入入库单号:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="advancedCharge" name="advancedCharge" placeholder="请输入预付款:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="payWay" name="payWay" placeholder="请输入结算方式:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="salesMan" name="salesMan" placeholder="请输入业务员:"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="createMan" name="createMan" placeholder="请输入制单人:"/></td>--%>
                    <%--<td><input type="datetime" class="input-text" id="date" name="date" placeholder="请输入审核日期:" value="<% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); %>"/></td>--%>
                    <%--<td><input type="text" class="input-text" id="purDetail" name="purDetail" placeholder="请输入备注:"/></td>--%>
                    <%--&lt;%&ndash;<td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('订单编辑','index2.html','1')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>&ndash;%&gt;--%>
                <%--</tr>--%>
            <%--</tbody>--%>
        <%--</table>--%>
            <center>
           <div style="margin:0 auto;">
               <br><br><input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加并继续添加明细">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               <a href="/pur_order"  class="btn btn radius">取消</a>
           </div>
            </center>
    </form:form>
</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../../statics/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="../../../statics/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../../statics/jss/H-ui.min.js"></script>
<script type="text/javascript" src="../../../statics/jss/admin/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../../statics/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../../statics/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../../statics/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="../../../statics/jss/houtaifanduan.js"></script>
<script type="text/javascript">
    $('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
        ]
    });
</script>
</body>
</html>

