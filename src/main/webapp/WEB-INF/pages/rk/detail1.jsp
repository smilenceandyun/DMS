<%--
  Created by IntelliJ IDEA.
  User: laoli
  Date: 2017/7/1
  Time: 10:23
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
    <script type="text/javascript" src="../../statics/lib/html5shiv.js"></script>
    <script type="text/javascript" src="../../statics/lib/respond.min.js
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="../../statics/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="../../statics/css/admin/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="../../statics/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="../../statics/skin/green/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="../../statics/css/admin/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="../../statics/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
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

    <title>采购入库明细</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    div{ height:50px;}
    ul{width:900px; height:20px; size: 20px;}
    li{width:130px; height:20px; float:left;}
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购入库明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
        <li><input disabled id="d1" type="text" class="input-text" value="${mpur.bProcureMOrdProcureNo}" name="bProcureMOrdProcureNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
        <li><input id="d2" type="text" class="input-text" value="${pro.bProcureSGoodsNo}" name="tGoodsFactoryGoodsNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
        <li><input id="d3" type="text" class="input-text"  name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
        <li><input id="d4" type="text" class="input-text" value="${pro.tGoodsByBProcureSGoodsNo.tGoodsBarcode}" name="tGoodsBarcode"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
        <li><input id="d5" type="text" class="input-text" value="${pro.tGoodsByBProcureSGoodsNo.tGoodsSSpec}" name="tGoodsSSpec"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量</li>
        <li><input id="d6" type="text" class="input-text" value="${pro.bProcureSQuantity}" name="bProcureSQuantity"></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编号</li>
        <li><input id="d7" type="text" class="input-text" value="${pro.bProcureSGoodsNo}" name="bProcureSGoodsNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
        <li><input id="d8" type="text" class="input-text" value="${pro.tGoodsByBProcureSGoodsNo.tGoodsGoodsName}" name="tGoodsGoodsName"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
        <li><input  id="d9" type="text" class="input-text" value="${pro.tGoodsByBProcureSGoodsNo.tGoodsUnit}" name="tGoodsUnit"></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库编号</li>
        <li><input id="d10" type="text" class="input-text" value="${pro.bProcureSRoomNo}" name="bProcureSRoomNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/月</li>
        <li><input  id="d11" type="text" class="input-text" value="${pro.tGoodsByBProcureSGoodsNo.tGoodsExDay}" name="tGoodsExDay"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次</li>
        <li><input id="d12" type="text" class="input-text" value="${pro.bProcureSLot}" name="bProcureSLot"></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
        <li><input id="d13" type="text" class="input-text" value="${pro.bProcureSLocationNo}" name=""></li>
    </ul>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <c:if test="${mpur.bProcureMState == null}">
        <%--<span class="l"><a href="javascript:;" onclick="" class="btn btn-success radius"><i class="Hui-iconfont">&#xe600;</i> 保存</a></span>&nbsp;&nbsp; --%>
            <span class="l" style="margin-left: 10px"><a href="/procure/addDetail/${mpur.bProcureMProcureNo}" onclick="" class="btn btn-success radius"><i class="Hui-iconfont">&#xe600;</i> 新增明细</a></span>
        </c:if>
            <span class="r">共有数据：<strong>${procures.size() != 0 ? procures.size() : 0}</strong> 条</span> </div>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">
        <form:form action="/index3" method="post" commondName="p">

            <table class="table table-border table-bordered table-bg table-sort">
                <thead>
                <tr class="text-c">
                    <th width="25"><input type="checkbox" name="id" value=""></th>
                    <th width="70">ID</th>
                        <%--<th width="80">排序</th>--%>
                    <th width="80">商品名称</th>
                    <th width="80">仓库</th>
                    <th width="80">单位</th>
                    <th width="80">单价</th>
                    <th width="80">数量</th>
                    <th width="80">保质期/天</th>
                    <th width="80">批次</th>
                    <c:if test="${mpur.bProcureMState == null}"><th width="100">操作</th></c:if>
                </tr>
                </thead>
                <tbody>
                <% int i = 0; %>
                <c:forEach items="${procures}" var="item">
                    <tr class="text-c">
                        <td><input name="id" type="checkbox"  value="${item.bProcureSProcureNo}"></td>
                        <td><%=i %><% i++; %></td>
                        <td><a href="/procure/detailone/${item.bProcureSProcureNo}&${item.bProcureSDetailId}">${item.tGoodsByBProcureSGoodsNo.tGoodsGoodsName}</a></td>
                        <td >${item.bProcureSRoomNo}</td>
                        <td>${item.tGoodsByBProcureSGoodsNo.tGoodsUnit}</td>
                        <td>${item.tGoodsByBProcureSGoodsNo.tGoodsSPrice}</td>
                        <td >${item.bProcureSQuantity}</td>
                        <td>${item.tGoodsByBProcureSGoodsNo.tGoodsExDay}</td>
                        <td >${item.bProcureSLot}</td>
                        <c:if test="${mpur.bProcureMState == null}">
                        <td class="f-14 product-brand-manage"><a style="text-decoration:none"  href="/procure/updateDetail/${item.bProcureSProcureNo}&${item.bProcureSDetailId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" href="/procure/deteleDetail/${item.bProcureSProcureNo}&${item.bProcureSDetailId}" onclick="if(!confirm('确定删除？')) return false;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                        </c:if>
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
//            {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
        ]
    });

</script>
</body>
</html>
