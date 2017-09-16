<%--
  Created by IntelliJ IDEA.
  User: Krystal_wy
  Date: 2017/9/15
  Time: 13:51
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 仓库管理 <span class="c-gray en">&gt;</span> 更新 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel1()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>1</strong> 条</span> </div>--%>
    <%--&lt;%&ndash;<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>&ndash;%&gt;--%>
    <div class="mt-20">
        <form:form action="/updateMds" method="post" role="form">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;代送入库单号</li>
                <li><input id="bSOrderMSOrderNo" name="bSOrderMSOrderNo" type="text" class="input-text"  value="${UUID}" readonly="readonly" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;付款方式</li>
                <li>
                    <select class="input-text" name="bSOrderMSalesman"  id="bSOrderMSalesman" >
                        <option value="" >选择付款方式</option>
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单据总金额</li>
                <li><input id="bSOrderMAdPaymoney" name="bSOrderMAdPaymoney" type="text" class="input-text" required ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
                <li>
                    <select class="input-text" name="bSOrderMCreateNo"  id="bSOrderMCreateNo" >
                        <option value="" >选择仓管员</option>
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
                <li><input type="text" class="input-text" name="bSOrderMOrderNo" id="bSOrderMOrderNo" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务属性</li>
                <li><select class="input-text" name="bSOrderMSalesTypeNo" id="bSOrderMSalesTypeNo" >
                    <option value="" >市销</option>
                    <c:forEach items="${SalesProperties}" var="SalesProperties">
                        <option value="${SalesProperties.salesPropertiesSalesTypeNo}">${SalesProperties.salesPropertiesSalesPropertiesName}</option>
                    </c:forEach>
                </select></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
                <li>
                    <select class="input-text" name="bSOrderMCreateNo"   >
                        <option value="" >选择业务员</option>
                        <c:forEach items="${Staff}" var="Staff">
                            <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;现金折扣</li>
                <li><input type="text" class="input-text" id="bSOrderMChecker" name="bSOrderMChecker"  ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;来货单号</li>
                <li><input type="text" class="input-text" id="b" name="bSOrderMChecer"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款</li>
                <li><input type="text" class="input-text" id="bS" name="bSOrderker"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户编号</li>
                <li><input type="text" class="input-text" id="bSO" name="bSOrdChecker"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
                <li><input type="text" class="input-text" id="bSOrde" name="bSOrderMChr"  ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交货日期</li>
                <li><input type="date" class="input-text" name="bSOrdersDiscount"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
                <li><input type="date" class="input-text" name="bSOrderMSalesDiscount" id="bSOrderMSalesDiscount" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核日期</li>
                <li><input type="date" class="input-text" name="bSOrderMSalesDiscount"  ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称</li>
                <li style="float: left;width: 300px;">
                    <select class="input-text" name="bSOrderMClientAddress"  id="bSOrderMClientAddress">
                        <option value="" >选择客户名称</option>
                        <c:forEach items="${Client}" var="Client">
                            <option value="${Client.tClientClientAddress}">${Client.tClientClientAddress}</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="float: left;width: 300px;"><input type="text" class="input-text" id="bSOrderMNotes" name="bSOrderMNotes" ></li>
            </ul><br>
            <input type="hidden" id="bSOrderMIsPass" name="bSOrderMIsPass" value="0" >
            <input type="hidden" id="bSOrderMState" name="bSOrderMState" value="1">
            <center>
                <div style="margin:0 auto;">
                    <br><br><input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/pur_inds"  class="btn btn radius">取消</a>
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
