<%@ page import="java.util.Date" %>
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
        //删除选中订单
        function datadel1(){
            var ques_id = [];
            $("[name=id]:checked").each(function(){
                ques_id.push($(this).val());
            });
            if(ques_id!='' && ques_id!=null){
                alert("确定要删除吗？");
                $.post('/pur_order/delete',{'qid':ques_id},function(data){
                    if (data == "0")
                        alert("删除失败！");
                    else {
                        alert("删除成功！");
                        window.location='pur_order';
                        getusers();
                    }
                });
            }else{
                layer.msg('请先选择要删除的内容');
            }
        }

        //查询订单，使用post时，参数必须一一对应，才可以匹配到controller中
        function purSearch(){
//                 var search =$("input[id='search']").val();
            var search=$("#search").val();
            alert("确定要查询吗？");
            $.post('/pur_order/pur_search',{'search':search});
            window.location='pur_order';
        }

        function factoryChange(id) {
            switch (id){
                case  "":
                    document.getElementById("f2").value = "";
                    break;
                <c:forEach items="${bPurchaseOrdMEntities}" var="bPurchaseOrdMEntities">
                case "${bPurchaseOrdMEntities.bPurchaseOrdMOrdProcureNo}":
                    document.getElementById("f2").value = "${bPurchaseOrdMEntities.tFactorysByBPurchaseOrdMFactoryGoodsNo.tFactorysFactoryGoodsName}";
                    break;
                </c:forEach>
            }
        }
    </script>

    <title>采购管理</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    div {
        width:1000px; height:50px;
    }
    ul {
        width:1300px; height:20px; size: 20px;
    }
    li {
        width:125px; height:20px; float:left;
    }
    tr {
        text-align:center;
    }
</style>
<body onload="factoryChange(document.getElementById('f1').value)">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购退货 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div style="padding: 20px">
    <form:form action="/addRE" method="post" commondName="p">
        <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退货单号</li>
        <li><input type="text" class="input-text" name="bRProcureMRProcureNo" id="bRProcureMRProcureNo" value="${UUID}" readonly="readonly"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
        <li><input type="text" class="input-text" name="bRProcureMHandbillNo" id="bRProcureMHandbillNo" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家名称</li>
        <li><input type="text" class="input-text" name="" id="f2" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家订单号</li>
        <li>
            <select class="input-text" name="" id="f1" onchange="factoryChange(this.value);" required>
                <option value="" ></option>
                <c:forEach items="${bPurchaseOrdMEntities}" var="bPurchaseOrdMEntities">
                    <option value="${bPurchaseOrdMEntities.bPurchaseOrdMOrdProcureNo}">${bPurchaseOrdMEntities.bPurchaseOrdMOrdProcureNo}</option>
                </c:forEach>
            </select>
        </li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务性质</li>
            <li><input type="text" class="input-text" name="bRProcureMServiceAttribute" id="bRProcureMServiceAttribute" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
            <li><input type="text" class="input-text" name="bRProcureMPaymentAttributer" id="bRProcureMPaymentAttributer" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
            <li><input type="date" class="input-text" name="bRProcureMCreateDate" id="bRProcureMCreateDate" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核日期</li>
            <li><input type="date" class="input-text" name="bRProcureMCheckDate" id="bRProcureMCheckDate" required></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务日期</li>
            <li><input type="date" class="input-text" name="bRProcureMModifiTime" id="bRProcureMModifiTime" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
            <li>
                <select class="input-text" name="bRProcureMSalesman" id="bRProcureMSalesman" required>
                    <option value="" ></option>
                    <c:forEach items="${Staff}" var="Staff">
                        <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
            <li>
                <select class="input-text" name="bRProcureMWarehouseKeeper" id="bRProcureMWarehouseKeeper" required>
                    <option value="" ></option>
                    <c:forEach items="${Staff}" var="Staff">
                        <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
            <li>
                <select class="input-text" name="bRProcureMChecker" id="bRProcureMChecker">
                    <option value="" ></option>
                    <c:forEach items="${Staff}" var="Staff">
                        <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                    </c:forEach>
                </select>
            </li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货员</li>
            <li>
                <select class="input-text" name="bRProcureMDeliverymanNo" id="bRProcureMDeliverymanNo" required>
                    <option value="" ></option>
                    <c:forEach items="${Staff}" var="Staff">
                        <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
            <li><input type="text" style="width: 376px" class="input-text" name="bRProcureMNotes" id="bRProcureMNotes" required></li>
        </ul><br>
        <center>
            <div style="margin:0 auto;">
                <br><br><input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/CPurCon_order"  class="btn btn radius">取消</a>
            </div>
        </center>
    </form:form>
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