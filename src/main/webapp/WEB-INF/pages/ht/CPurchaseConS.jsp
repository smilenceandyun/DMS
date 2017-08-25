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
    ul {
        width:900px; height:20px; size: 20px;
    }
    li {
        width:120px; height:20px; float:left;
    }
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购订单 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
   <div class="mt-20">
        <c:if test="${empty cPurchaseConS}">
            <table class="table table-border table-bordered table-bg">
                <thead>
                <tr class="text-c">
                    <th width="80">提示</th>
                </tr>
                </thead>
                <tbody>
                <tr class="text-c">
                    <td >没有添加明细，请添加</td>
                        <%--<td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/pur_order/detaileOrder/update/${detail.detaileId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> </td>--%>
                        <%--<a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="/pur_order/detaileOrder/delete/${detail.detaileId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>--%>
                </tr>
                </tbody>
            </table>
            <div class="cl pd-5 bg-1 bk-gray mt-20">&nbsp;&nbsp;&nbsp;&nbsp;<span><a href="/addS/${cPurchaseConSPurchasConNo}" class="btn btn-success radius">新增明细</a></span></div>
        </c:if>
        <c:if test="${!empty cPurchaseConS}">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总经理</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱价</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单价</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="" readonly ="readonly" value="${cPurchaseConSPurchasConNo}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同数量</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name=""></li>
            </ul><br>
            <div class="cl pd-5 mt-20 bg-1 bk-gray" style="height:32px;"> <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><span class="l"><a href="" class="btn btn-success radius">保存</a></span><span class="l">&nbsp;&nbsp;&nbsp;<a href="/addS/${cPurchaseConSPurchasConNo}" class="btn btn-success radius">新增明细</a></span></c:if></div>
            <br>
            <table class="table table-border table-bordered table-bg table-sort">
                <thead>
                <tr class="text-c">
                    <th width="30">ID</th>
                    <th width="80">商品名称</th>
                    <th width="80">规格型号</th>
                    <th width="80">单位</th>
                    <th width="80">税率</th>
                    <th width="80">单价</th>
                    <th width="80">箱价</th>
                    <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><th width="40">操作</th></c:if>
                </tr>
                </thead>
                <tbody>
                <%
                    int i = 1;
                %>
                <c:forEach items="${cPurchaseConS}" var="cPurchaseConS">
                    <tr class="text-c">
                        <td><%=i %><% i++; %></td>
                        <td><a href="/detail2/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}">${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsName}</a></td>
                        <td>${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsSpce}</td>
                        <td>${cPurchaseConS.cPurchaseConSTaxRate}</td>
                        <td>${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsUnit}</td>
                        <td>${cPurchaseConS.cPurchaseConSPrice}</td>
                        <td>${cPurchaseConS.cPurchaseConSBoxPrice}</td>
                        <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('订单编辑','index2.html','1')" href="/updateS/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/deleteS/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td></c:if>
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
