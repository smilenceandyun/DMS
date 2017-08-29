<%--
  Created by IntelliJ IDEA.
  User: Krystal_wy
  Date: 2017/8/28
  Time: 9:44
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


    <title>新增销售订货</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    ul{width:1200px; height:20px; size: 20px; color: rgba(0,0,0,0.5); font-weight: 600; font-size: inherit;}
    li{width:130px; height:20px; float:left;}
</style>
<body >
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 销售管理 <span class="c-gray en">&gt;</span> 销售订货 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="mt-20">
        <form:form name="dh" id="dh" action="/sale_order/addP" method="post"  commondName="p" role="form">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货单号</li>
                <li><input id="bSOrderMSOrderNo" name="bSOrderMSOrderNo" type="text" class="input-text"  value="${UUID}" readonly="readonly" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
                <li>
                    <select class="input-text" name="bSOrderMSalesman"  id="bSOrderMSalesman" required>
                        <option value="" >选择业务员</option>
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款</li>
                <li><input id="bSOrderMAdPaymoney" name="bSOrderMAdPaymoney" type="text" class="input-text" required ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单人</li>
                <li>
                    <select class="input-text" name="bSOrderMCreateNo"  id="bSOrderMCreateNo" required>
                        <option value="" >选择制单人</option>
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户单号</li>
                <li><input type="text" class="input-text" name="bSOrderMOrderNo" id="bSOrderMOrderNo" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售性质</li>
                <li><select class="input-text" name="bSOrderMSalesTypeNo" id="bSOrderMSalesTypeNoo" >
                    <option value="" ></option>
                    <c:forEach items="${SalesProperties}" var="SalesProperties">
                        <option value="${SalesProperties.salesPropertiesSalesTypeNo}">${SalesProperties.salesPropertiesSalesPropertiesName}</option>
                    </c:forEach>
                </select></li>

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
                <li><input type="text" class="input-text" id="bSOrderMChecker" name="bSOrderMChecker" disabled ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售折扣</li>
                <li><input type="text" class="input-text" name="bSOrderMSalesDiscount" id="bSOrderMSalesDiscount" ></li>
            </ul><br>
            <ul>

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称</li>
                <li>
                    <select class="input-text" name="bSOrderMClientNo" id="bSOrderMClientNo" >
                        <option value="" >选择客户</option>
                        <c:forEach items="${Client}" var="Client">
                            <option value="${Client.tClientClientNo}">${Client.tClientClientName}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
                <li>
                    <select class="input-text" name="bPurchaseOrdSPaymentNo" id="bPurchaseOrdSPaymentNo" >
                        <option value="" >选择结算方式</option>
                        <c:forEach items="${Payment}" var="Payment">
                            <option value="${Payment.tPaymentPaymentNo}">${Payment.tPaymentPaymentName}</option>
                        </c:forEach>

                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMSendDate" name="bSOrderMSendDate" required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址</li>
                <li>
                    <select style="float: left;width: 390px;" class="input-text" name="bSOrderMClientAddress"  id="bSOrderMClientAddress">
                        <option value="" >选择地址</option>
                        <c:forEach items="${Client}" var="Client">
                            <option value="${Client.tClientClientAddress}">${Client.tClientClientAddress}</option>
                        </c:forEach>
                    </select>

                </li>>

                <li></li>  <li></li>                   <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMCreateDate" name="bSOrderMCreateDate" required></li>

            </ul><br>

            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="float: left;width: 390px;"><input type="text" class="input-text" id="bSOrderMNotes" name="bSOrderMNotes" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMOrdDate" name="bSOrderMOrdDate" required ></li>
            </ul>
            <%-- <input type="hidden" id="bSOrderMIsPass" name="bSOrderMIsPass" value="0" >
             <input type="hidden" id="bSOrderMState" name="bSOrderMState" value="1">--%>
            <center>
                <div style="margin:0 auto;">
                    <br><br><input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加并添加明细">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/sale_order"  class="btn btn radius">取消</a>
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