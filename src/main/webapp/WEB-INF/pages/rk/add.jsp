<%@ page import="java.util.Date" %><%--
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
    ul{width:900px; height:20px; size: 20px;}
    li{width:130px; height:20px; float:left;}
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购入库新增明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;入库单号</li>
        <li><input type="text" class="input-text" name="ordProcureNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家订单号</li>
        <li><input type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家代表</li>
        <li><input style="width: 200px;" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
        <li><input type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供货商编号</li>
        <li><input type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交货日期</li>
        <li><input style="width: 200px;" type="date" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
        <li><input type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
        <li>
            <select style="width: 100%; height: 31px;">
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select>
        </li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建日期</li>
        <li><input style="width: 200px;" type="date" value="<% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd").format(new Date())); %>" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供货商名称</li>
        <li><input style="width: 720px;" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;附注</li>
        <li><input style="width: 720px;" type="text" class="input-text" name=""></li>
    </ul>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l"><a href="javascript:;" onclick="" class="btn btn-success radius">下一步</a></span>&nbsp;&nbsp;
        <span class="l" style="margin-left: 10px"><a href="javascript:;" onclick="" class="btn btn-success radius"><i class="Hui-iconfont">&#xe600;</i> 完成</a></span>
        <span class="l" style="margin-left: 10px"><a href="javascript:;" onclick="" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe600;</i> 取消</a></span>
        <%--<span class="r">共有数据：<strong>${rk.size() ? rk.size() : 0}</strong> 条</span> --%>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    </div>
        <div class="mt-20">
<form:form action="/index3" method="post" commondName="p">

        <table class="table table-border table-bordered table-bg table-sort">
            <tr style="background-color: #f5fafe;">
                <td rowspan="2" style="text-align: center">ID</td>
                <td style="text-align: center">条码</td>
                <td style="text-align: center">商品编号</td>
                <td style="text-align: center">厂家编号</td>
                <td style="text-align: center">仓库编号</td>
                <td style="text-align: center">保质期</td>
                <td style="text-align: center">规格型号</td>
                <td style="text-align: center">数量</td>
                <td rowspan="2" style="text-align: center">单位</td>
                <td style="text-align: center">创建人</td>
                <td style="text-align: center">备注</td>
                <td rowspan="2" style="text-align: center">操作</td>
            </tr>
            <tr style="background-color: #f5fafe;">
                <td colspan="2" style="text-align: center">商品名称</td>
                <td style="text-align: center">厂家名称</td>
                <td style="text-align: center">库位编号</td>
                <td style="text-align: center">生产日期</td>
                <td style="text-align: center">批次号</td>
                <td style="text-align: center">箱数</td>
                <td style="text-align: center">创建日期</td>
                <td style="text-align: center">赠送性质</td>
            </tr>
            <tbody>
            <%--行开始--%>
            <tr>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td rowspan="2" style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
            </tr>
            <tr>
                <td style="text-align: center">&nbsp;</td>
                <td colspan="2" style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
                <td style="text-align: center">&nbsp;</td>
            </tr>
            <%--行结束--%>
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
