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

    <script src="../../../statics/jss/ansel_select/ansel_select.js"></script>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

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

        function goodsChange(id) {
            switch (id){
                case  "":
                    document.getElementById("a5").value = "";
                    document.getElementById("a7").value = "";
                    document.getElementById("a8").value = "";
                    document.getElementById("a9").value = "";
                    document.getElementById("a11").value = "";
                    break;
                <c:forEach items="${goods}" var="good">
                case "${good.tGoodsGoodsNo}":
                    document.getElementById("a5").value = "${good.tGoodsGoodsSpce}";
                    document.getElementById("a7").value = "${good.tGoodsBarcode}";
                    document.getElementById("a8").value = "${good.tGoodsGoodsName}";
                    document.getElementById("a9").value = "${good.tGoodsUnit}";
                    document.getElementById("a11").value = "${good.tGoodsExDay}";
                    break;
                </c:forEach>
            }
        }
        function showDetail(id) {
            switch (id){
                <c:forEach items="${procures}" var="item">
                case "${item.bProcureSDetailId}":
                    document.getElementById("d2").value = "${item.bProcureSGoodsNo}";
                    document.getElementById("d3").value = "";
                    document.getElementById("d4").value = "${item.tGoodsByBProcureSGoodsNo.tGoodsBarcode}";
                    document.getElementById("d5").value = "${item.tGoodsByBProcureSGoodsNo.tGoodsSSpec}";
                    document.getElementById("d6").value = "${item.bProcureSQuantity}";
                    document.getElementById("d7").value = "${item.bProcureSGoodsNo}";
                    document.getElementById("d8").value = "${item.tGoodsByBProcureSGoodsNo.tGoodsGoodsName}";
                    document.getElementById("d9").value = "${item.tGoodsByBProcureSGoodsNo.tGoodsUnit}";
                    document.getElementById("d10").value = "${item.bProcureSRoomNo}";
                    document.getElementById("d11").value = "${item.tGoodsByBProcureSGoodsNo.tGoodsExDay}";
                    document.getElementById("d12").value = "${item.bProcureSLot}";
                    document.getElementById("d13").value = "${item.bProcureSLocationNo}";
                    break;
                </c:forEach>
            }
        }

        function init() {
            $(document).ready(function(){
                $("#add").hide();
                $("#head").hide();
            });
        }
        function showadd() {
            $("#add").show(300);
            $("#detail_show").hide(300);
            document.getElementById("add_btn").onclick = hideadd;
        }
        function hideadd() {
            $("#add").hide(300);
            $("#detail_show").show(300);
            document.getElementById("add_btn").onclick = showadd;
        }
        function hidehead() {
            $("#head").hide(300);
            document.getElementById("head_btn").innerHTML = "显示入库单据头";
            document.getElementById("head_btn").onclick = showhead;
        }
        function showhead() {
            $("#head").show(300);
            document.getElementById("head_btn").innerHTML = "隐藏入库单据头"
            document.getElementById("head_btn").onclick = hidehead;
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
<body onload="init();">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购入库明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-bottom: 20px;">
            <span class="l" style="margin-left: 10px"><a onclick="showadd()" id="add_btn" class="btn btn-success radius"><i class="Hui-iconfont">&#xe600;</i> 新增明细</a></span>
        <span class="r">共有数据：<strong>${procures.size() != 0 ? procures.size() : 0}</strong> 条</span>
    </div>
    <%--//----------------添加明细表单----------------//--%>
    <form id="add" action="/procure/addDetaildb" method="post">
        <input type="hidden" class="input-text" name="bProcureSProcureNo"  value="${procure.bProcureMProcureNo}" required>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
            <li><input required readonly id="a1" type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMOrdProcureNo}" name="ordProcureNo"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
            <li><input required id="a2" type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMFactoryGoodsNo}" name=""></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
            <li><input id="a3" type="text" class="input-text" name=""></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编号</li>
            <li>
                <select class="select" id="good1" style="width: 100%; height: 31px;" required onchange="goodsChange(this.value);" name="bProcureSGoodsNo">
                    <option value=""></option>
                    <c:forEach items="${goods}" var="good">
                        <option value="${good.tGoodsGoodsNo}"
                                <c:if test="${good.tGoodsGoodsNo.equals(spur.bProcureSGoodsNo)}">selected</c:if>
                        >${good.tGoodsGoodsNo}(${good.tGoodsGoodsName})</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
            <li><input required id="a5" type="text" class="input-text" name=""></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量</li>
            <li><input required id="a6" type="text" value="${spur.bProcureSQuantity}" class="input-text" name="bProcureSQuantity"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
            <li><input required id="a7" type="text" class="input-text" name=""></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
            <li><input required id="a8" type="text" class="input-text" name=""></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
            <li><input required id="a9" type="text" class="input-text" name=""></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库编号</li>
            <li>
                <select class="select" style="width: 100%; height: 31px;" required name="bProcureSRoomNo">
                    <option value=""></option>
                    <c:forEach items="${rooms}" var="room">
                        <option value="${room.tRoomRoomNo}"
                                <c:if test="${room.tRoomRoomNo.equals(spur.bProcureSRoomNo)}">selected</c:if>
                        >${room.tRoomRoomNo}(${room.tRoomRoomName})</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/天</li>
            <li><input required id="a11" type="text" class="input-text" name=""></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次</li>
            <li><input required id="a12" type="text" value="${spur.bProcureSLot}" class="input-text" name="bProcureSLot"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
            <li>
                <select class="select" style="width: 100%; height: 31px;" required name="bProcureSLocationNo">
                    <option value=""></option>
                    <c:forEach items="${stores}" var="store">
                        <option value="${store.storeLocationLocationNo}"
                                <c:if test="${store.storeLocationLocationNo.equals(spur.bProcureSLocationNo)}">selected</c:if>
                        >${store.storeLocationLocationNo}(${store.storeLocationLocation})</option>
                    </c:forEach>
                </select>
            </li>
        </ul>
        <center style="margin-bottom: 20px; width: 900px;">
        <div class="cl pd-5 mt-20" >
            <span ><button type="submit" class="btn btn-primary upload-btn"><i class="Hui-iconfont">&#xe600;</i> 确认</button></span>
            <span ><button type="reset" class="btn btn radius"> 清除数据</button></span>
            <span ><button type="reset" onclick="hideadd()" class="btn btn radius"> 取消</button></span>
        </div>
        </center>
    </form>

    <%--//----------------显示明细表单----------------//--%>
    <div id="detail_show">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
        <li><input disabled id="d1" type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMOrdProcureNo}" name="ordProcureNo"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
        <li><input id="d2" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
        <li><input id="d3" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
        <li><input id="d4" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
        <li><input id="d5" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量</li>
        <li><input id="d6" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编号</li>
        <li><input id="d7" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
        <li><input id="d8" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
        <li><input  id="d9" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库编号</li>
        <li><input id="d10" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/天</li>
        <li><input  id="d11" type="text" class="input-text" name=""></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次</li>
        <li><input id="d12" type="text" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
        <li><input id="d13" type="text" class="input-text" name=""></li>
    </ul>
    </div>
    <%--按钮--%>
    <div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-bottom: 20px;"><span><button type="button" id="head_btn" onclick="showhead()" class="btn btn-primary upload-btn">显示入库单据头</button></span></div>
<%-----------------------单据头-------------------%>
    <div id="head">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;入库单号</li>
        <li><input readonly type="text" class="input-text" name="bProcureSProcureNo"  value="${procure.bProcureMProcureNo}" required>
        </li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家订单号</li>
        <li><input readonly type="text" class="input-text" value="${procure.bProcureMOrdProcureNo}" required>
        </li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家代表</li>
        <li><input readonly id="factory" style="width: 200px;" type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMFactoryGoodsNo}" name="" required></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
        <li><input readonly type="text" class="input-text"  value="${procure.bProcureMHandbillNo}" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供货商编号</li>
        <li><input readonly id="factory1" type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMFactoryGoodsNo}" name="" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交货日期</li>
        <li><input readonly id="deildate" style="width: 200px;" type="text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMDeliveryDate}" class="input-text" name="" required></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
        <li><input readonly type="text" class="input-text" name="" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.bPurchaseOrdMOrdProcureNo}" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
        <li><input readonly type="text" class="input-text" name="" value="${procure.bProcureMWarehouseKep}(${procure.tStaffByBProcureMWarehouseKep.tStaffStaffName})" required>
        </li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建日期</li>
        <li><input readonly style="width: 200px;" required type="text" value="${procure.bProcureMCreateDate.toString()}" class="input-text" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供货商名称</li>
        <li><input readonly style="width: 720px;" required type="text" class="input-text" value="${procure.bPurchaseOrdMByBProcureMOrdProcureNo.tFactorysByBPurchaseOrdMFactoryGoodsNo.tFactorysFactoryGoodsName}" name=""></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;附注</li>
        <li><input readonly style="width: 720px;" required type="text" class="input-text" value="${procure.bProcureMNotes}" name=""></li>
    </ul>
    </div>
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
                <td><a onclick='showDetail("${item.bProcureSDetailId}")'>${item.tGoodsByBProcureSGoodsNo.tGoodsGoodsName}</a></td>
                <td >${item.bProcureSRoomNo}</td>
                <td>${item.tGoodsByBProcureSGoodsNo.tGoodsUnit}</td>
                <td>${item.tGoodsByBProcureSGoodsNo.tGoodsSPrice}</td>
                <td >${item.bProcureSQuantity}</td>
                <td>${item.tGoodsByBProcureSGoodsNo.tGoodsExDay}</td>
                <td >${item.bProcureSLot}</td>
                <c:if test="${mpur.bProcureMState == null}">
                <td class="f-14 product-brand-manage"><a style="text-decoration:none" href="/procure/updateDetail/${item.bProcureSProcureNo}&${item.bProcureSDetailId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/procure/deteleDetail/${item.bProcureSProcureNo}&${item.bProcureSDetailId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
<script type="text/javascript" src="../../../statics/lib/scrolltopcontrol.js"></script>
<script type="text/javascript" src="../../../statics/select/ansel_select.js"></script>
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
<script>
    //插件初始化配置
    $('.select').anselcfg({});
</script>
</body>
</html>
