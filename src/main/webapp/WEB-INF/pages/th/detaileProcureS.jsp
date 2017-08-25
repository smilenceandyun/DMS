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
    </script>

    <title>采购管理</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    ul{width:900px; height:20px;  size: 20px; color: rgba(0,0,0,0.5); font-weight: 600; font-size: inherit;}
    li{width:150px; height:20px; float:left;}
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购退货 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span><a href="/th/detail/add/${brProcureNo}" class="btn btn-success radius">新增明细</a></span></div>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">

<c:if test="${empty brProcureS}">
    <table class="table table-border table-bordered table-bg">
        <thead>
        <tr class="text-c">
            <th width="80">提示</th>
        </tr>
        </thead>
        <tbody>

        <script>window.onload(layer.msg('没有添加明细，请添加'));</script>
        <tr class="text-c">
            <td >没有添加明细，请添加</td>
            <%--<td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/pur_order/detaileOrder/update/${detail.detaileId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> </td>--%>
                <%--<a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="/pur_order/detaileOrder/delete/${detail.detaileId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>--%>
        </tr>

        </tbody>
    </table>
</c:if>
<c:if test="${!empty brProcureS}">

    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
        <li><input type="text" class="input-text" readonly="readonly" name="ordProcureNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退货单号</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" value="${brProcureNo}" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本数量/单位</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;包装数量/单位</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
        <li><input type="text" class="input-text" readonly="readonly" name="taxRate" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
        <li><input type="text" class="input-text" readonly="readonly" name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次号</li>
        <li><input type="text" class="input-text" readonly="readonly" name="price"></li>

    </ul><br>
    <table class="table table-border table-bordered table-bg table-sort">
        <thead>
        <tr class="text-c">
            <%--<th width="25"><input type="checkbox" name="id" value=""></th>--%>
            <th width="30">ID</th>
            <th width="70">商品名称</th>
                <%--<th width="80">排序</th>--%>
            <th width="80">规格型号</th>
            <th width="80">仓库</th>
            <th width="80">税率</th>
            <th width="80">基本数量/单位</th>
            <th width="80">包装数量/单位</th>
            <th width="40">操作</th>
        </tr>
        </thead>
        <tbody>
        <%
            int i = 1;
        %>
        <c:forEach items="${brProcureS}" var="brProcureS">
            <tr class="text-c">
                    <%--<td><input name="id" type="checkbox"  value="${purOrder.ordProcureNo}"></td>--%>
                <td ><%=i %><% i++; %></td>
                    <%--<td><a href="/pur_order/detaileOrder/${purOrder.bPurchaseOrdSOrdProcureNo}">${purOrder.bPurchaseOrdSOrdProcureNo}</a></td>--%>
                <td><a href="/detail/th2/${brProcureS.bRProcureSDetailId}&${brProcureS.bRProcureSRProcureNo}">${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}</a></td>
                <td >${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsSpce}</td>
                <td >${brProcureS.bPurchaseOrdS.tRoomByBPurchaseOrdSRoomNo.tRoomRoomName}</td>
                <td >${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsInTax}</td>
                <td >${brProcureS.bPurchaseOrdS.bPurchaseOrdSQuantity}${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsUnit}</td>
                <td >${brProcureS.bPurchaseOrdS.bPurchaseOrdSBoxQuantity}${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsPackUnit}</td>
                <td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/th/detaileOrder/update/${brProcureS.bRProcureSDetailId}&${brProcureS.bRProcureSRProcureNo}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/th/delete/${brProcureS.bRProcureSDetailId}&${brProcureS.bRProcureSRProcureNo}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
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
