<%--
  Created by IntelliJ IDEA.
  User: Krystal_wy
  Date: 2017/9/4
  Time: 11:13
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

        //查询订单，使用post时，参数必须一一对应，才可以匹配到 controller中
        function purSearch(){
//                 var search =$("input[id='search']").val();
            var search=$("#search").val();
            alert("确定要查询吗？");
            $.post('/pur_order/pur_search',{'search':search});
            window.location='pur_order';
        }
    </script>

    <title>销售订货</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 销售管理 <span class="c-gray en">&gt;</span> 赠品处理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="0">&nbsp;&nbsp;&nbsp;<a href="/zp_order/add" class="btn btn-success radius"><i class="Hui-iconfont">&#xe600;</i> 添加订单</a></span> <span class="r">共有数据：<strong>0</strong> 条</span> </div>
    <div class="mt-20">
    <form:form action="/index3" method="post" commondName="p">

        <table class="table table-border table-bordered table-bg table-sort">
            <thead>
            <tr class="text-c">
                <th width="25"><input type="checkbox" name="id" value=""></th>
                <th width="30">ID</th>
                    <%--<th width="80">排序</th>--%>
                <th width="100">出库单号</th>
                <th width="120">客户名称</th>
                <th width="80">仓库出库日期</th>
                <th width="80">回单日期</th>
                <th width="80">业务员</th>
                <th width="80">审核日期</th>
                <th width="80">审核状态</th>
                <th width="100">备注</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
            <%
                int i = 1;
            %>
            <c:forEach items="${bOutPreM}" var="bOutPreM">
                <tr class="text-c">
                    <td><input name="id" type="checkbox"  value="${bOutPreM.bOutPresentMOutPresentNo}"></td>
                    <td><%=i %><% i++; %></td>
                    <td><a href="/zp_order/detaileOrder/${bOutPreM.bOutPresentMOutPresentNo}">${bOutPreM.bOutPresentMOutPresentNo}</a></td>
                    <td>${null}</td>
                    <td >${bOutPreM.bOutPresentMRoomOutDate}</td>
                    <td >${bOutPreM.bOutPresentMDeliveryDate}</td>
                    <td >${bOutPreM.bOutPresentMWarehouseKeeper}</td>
                    <td >${bOutPreM.bOutPresentMCheckDate}</td>
                    <td >${bOutPreM.bOutPresentMState==0? "未审核" : "已审核"}</td>
                    <td >${bOutPreM.bOutPresentMNotes}</td>
                    <td class="f-14 product-brand-manage"><c:if test="${bOutPreM.bOutPresentMState == \"0\"}"><a style="text-decoration:none" onClick="product_brand_edit('订单编辑','index2.html','1')" href="/upda_order/${bOutPreM.bOutPresentMOutPresentNo}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></c:if><a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/zp_order/delete/${bOutPreM.bOutPresentMOutPresentNo}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </form:form>
</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../statics/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="../../statics/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../statics/jss/H-ui.min.js"></script>
<script type="text/javascript" src="../../statics/jss/admin/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../statics/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../../statics/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../statics/lib/laypage/1.2/laypage.js"></script>
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

