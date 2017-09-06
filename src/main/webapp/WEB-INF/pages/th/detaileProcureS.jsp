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

        function goodsChange(id) {
            switch (id){
                case  "":
                    document.getElementById("guige").value = "";
                    document.getElementById("tiaoma").value = "";
                    //document.getElementById("kucun").value = "";
                    document.getElementById("mingcheng").value = "";
                    // document.getElementById("dangwei").value = "";
                    document.getElementById("baozjiqi").value = "";
                    document.getElementById("suilv").value = "";
                    // document.getElementById("danjia").value = "";
                    document.getElementById("shuliang").value = "";
//                    document.getElementById("bPurchaseOrdSBoxPrice").value = "";
                    break;
                <c:forEach items="${TGoods}" var="TGoods">
                case "${TGoods.tGoodsGoodsNo}":
                    document.getElementById("guige").value = "${TGoods.tGoodsGoodsSpce}";
                    document.getElementById("tiaoma").value = "${TGoods.tGoodsBarcode}";
                <%--document.getElementById("kucun").value = "${TGoods.tGoodsPackQuantity}";--%>
                    document.getElementById("mingcheng").value = "${TGoods.tGoodsGoodsName}";
                <%--document.getElementById("dangwei").value = "${TGoods.tGoodsUnit}";--%>
                    document.getElementById("baozjiqi").value = "${TGoods.tGoodsExDay/30}";
                    document.getElementById("suilv").value = "${TGoods.tGoodsInTax}";
                <%--document.getElementById("danjia").value = "${TGoods.tGoodsSPrice}";--%>
                    document.getElementById("shuliang").value = "${TGoods.tGoodsPackQuantity}";
                <%--document.getElementById("bPurchaseOrdSBoxPrice").value = "${TGoods.tGoodsPackQuantity * TGoods.tGoodsInTaxprice}";--%>


                    break;
                </c:forEach>
            }
        }

        function price(id) {

            document.getElementById("hansui").value =document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;
            document.getElementById("weihansui").value = (document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value) / (( 1 + document.getElementById("suilv").value)/10);
            document.getElementById("jinger").value = document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;

        }

        function caigou(id) {
            switch (id){
                case  "":
                    document.getElementById("shengchang").value = "";
                    document.getElementById("yuanjia").value = "";
                    //document.getElementById("kucun").value = "";
                    document.getElementById("kuwei").value = "";
                    // document.getElementById("dangwei").value = "";

//                    document.getElementById("bPurchaseOrdSBoxPrice").value = "";




                    break;
                <c:forEach items="${bPurchaseOrdSEntities}" var="bPurchaseOrdSEntities">
                case "${bPurchaseOrdSEntities.bPurchaseOrdSOrdProcureNo}":
                    document.getElementById("shengchang").value = "${bPurchaseOrdSEntities.bPurchaseOrdSMfg}";
                    document.getElementById("yuanjia").value = "${bPurchaseOrdSEntities.bPurchaseOrdSOriginalPrice}";
                <%--document.getElementById("kucun").value = "${TGoods.tGoodsPackQuantity}";--%>
                    document.getElementById("kuwei").value = "${bPurchaseOrdSEntities.bPurchaseOrdSLocationNo}";
                <%--document.getElementById("dangwei").value = "${TGoods.tGoodsUnit}";--%>

                <%--document.getElementById("bPurchaseOrdSBoxPrice").value = "${TGoods.tGoodsPackQuantity * TGoods.tGoodsInTaxprice}";--%>


                    break;
                </c:forEach>
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

        function hidediv(){
            $(document).ready(function(){
                $("#hide").click(function(){
                    $("#p1").hide(300);
                });
                $("#show").click(function(){
                    $("#p1").show(300);
                });
            });
            $(document).keydown(function(event){
                var eCode = event.which;
                if (eCode == 220) {
//                    alert('您按了回车键')
                    $("#detail").show(300);
                    $("#p2").hide(300);

                    //打开添加明细
                }
                if (eCode == 27) {
//                    alert('您按了回车键')
                    $("#detail").hide(300);
                    $("#p2").show(300);
                    //关闭添加明细
                }
            });
        }

        function hideform(){
            $(document).ready(function(){
                $("#hide1").click(function(){
                    $("#detail").hide(300);
                    $("#p2").show(300);
                });
                $("#show1").click(function(){
                    $("#detail").show(300);
                    $("#p2").hide(300);
                });
                $("#top").click(function(){
                    $("#detail").hide(300);
                    $("#p2").show(300);
                });

            });
        }
        function hidefirst() {
            $("#detail").hide();
            $("#p1").hide();
        }

        function showdetail(detailid) {
            switch (detailid){
                case  "":
                    document.getElementById("th1").value = ""; //商品名称
                    document.getElementById("th2").value = "";//商品条码
                    document.getElementById("th3").value = "";//商品编码
//                    document.getElementById("th4").value = "";
                    document.getElementById("th5").value = "";//规格型号
                    document.getElementById("th6").value = "";//仓库
                    document.getElementById("th7").value = "";//基本数量/单位
                    document.getElementById("th8").value = "";//包装数量/单位
                    document.getElementById("th9").value = "";//税率
                    document.getElementById("th10").value = "";//厂家编码
                    document.getElementById("th11").value = "";//库位编号
                    document.getElementById("th12").value = "";//保质期
                    document.getElementById("th13").value = "";//生产日期
                    document.getElementById("th14").value = "";//交易原价
                    document.getElementById("th15").value = "";//批次号

                    break;
                <c:forEach items="${brProcureS}" var="brProcureS1">
                case "${brProcureS1.bRProcureSDetailId}":
                    document.getElementById("th1").value = "${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}"; //商品名称
                    document.getElementById("th2").value = "${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsBarcode}";//商品条码
                    document.getElementById("th3").value = "${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsNo}";//商品编码
//                    document.getElementById("th4").value = "";
                    document.getElementById("th5").value = "${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsSpce}";//规格型号
                    document.getElementById("th6").value = "${brProcureS1.bPurchaseOrdS.tRoomByBPurchaseOrdSRoomNo.tRoomRoomName}";//仓库
                    document.getElementById("th7").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSQuantity}${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsUnit}";//基本数量/单位
                    document.getElementById("th8").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSBoxQuantity}/${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsPackUnit}";//包装数量/单位
                    document.getElementById("th9").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSTaxRate}";//税率
                    document.getElementById("th10").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSFactoryGoodsNo}";//厂家编码
                    document.getElementById("th11").value = "${brProcureS1.bRProcureSLocationNo}";//库位编号
                    document.getElementById("th12").value = "${brProcureS1.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsExDay/30}";//保质期
                    document.getElementById("th13").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSMfg}";//生产日期
                    document.getElementById("th14").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSOriginalPrice}";//交易原价
                    document.getElementById("th15").value = "${brProcureS1.bPurchaseOrdS.bPurchaseOrdSLot}";//批次号


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
    ul{width:1200px; height:20px;  size: 20px; color: rgba(0,0,0,0.5); font-weight: 600; font-size: inherit;}
    li{width:150px; height:20px; float:left;}
</style>
<body onload="hidediv();hideform();hidefirst();top();">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购退货 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span><a id="show1" class="btn btn-success radius" onclick="hideform()">新增明细</a></span></div>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">
        <form:form id="detail" name="detail" action="/th/detail/addP" method="post" role="form" >
            <ul>
                <input type="hidden" name="bRProcureSDetailId" value="${detailId}">

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                <li><select class='select' id="good1" class="input-text" required onchange="goodsChange(this.value);" name="bRProcureSGoodsNo" required>
                    <option value="" selected>选择商品编号</option>
                    <c:forEach items="${bPurchaseOrdSEntities}" var="bPurchaseOrdSEntities">
                        <option value="${bPurchaseOrdSEntities.bPurchaseOrdSGoodsNo}">${bPurchaseOrdSEntities.bPurchaseOrdSOrdProcureNo}采购订单号 ->${bPurchaseOrdSEntities.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsNo}(${bPurchaseOrdSEntities.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName})</option>
                    </c:forEach>
                </select></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
                <li><input type="text" class="input-text" readonly="readonly" id="mingcheng" required ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
                <li><input type="text" class="input-text" readonly="readonly"  id="tiaoma" required></li>


            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;采购订单号</li>
                <li>
                    <select class='select' class="input-text" required onchange="caigou(this.value);" id="bRProcureSOrdProcureNo" name="bRProcureSOrdProcureNo" required>
                        <option value="" selected >选择采购订单号</option>
                        <c:forEach items="${bPurchaseOrdMEntities}" var="bPurchaseOrdMEntities">
                            <option value="${bPurchaseOrdMEntities.bPurchaseOrdMOrdProcureNo}">${bPurchaseOrdMEntities.bPurchaseOrdMOrdProcureNo}</option>
                        </c:forEach>

                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                <li><input type="text" class="input-text" readonly="readonly"  id="guige" required ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
                <li>
                    <select class='select' class="input-text" name="bRProcureSRoomNo" id="bRProcureSRoomNo" required>
                        <option value="" >选择仓库编号</option>
                        <c:forEach items="${TRoom}" var="TRoom">
                            <option value="${TRoom.tRoomRoomNo}">${TRoom.tRoomRoomNo}(${TRoom.tRoomRoomName})</option>
                        </c:forEach>

                    </select></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量/单位</li>
                <li><input type="text" class="input-text" readonly id="shuliang" name="bRProcureSQuantity"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱数</li>
                <li><input type="text" class="input-text"  name="bRProcureSBoxQuantity" id="bRProcureSBoxQuantity" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li><input type="text" class="input-text" readonly="readonly" id="suilv" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退货单号</li>
                <li><input type="text" class="input-text" readonly="readonly" name="bRProcureSRProcureNo" value="${brProcureNo}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
                <li><input type="text" class="input-text"  name="bRProcureSLocationNo" id="kuwei"  required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期</li>
                <li><input type="text" class="input-text" readonly="readonly" id="baozjiqi" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
                <li><input type="text" class="input-text"  id="shengchang"  readonly="readonly" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
                <li><input type="text" class="input-text" readonly="readonly" id="yuanjia"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次号</li>
                <li><input type="text" class="input-text" readonly="readonly" name="price"></li>

            </ul><br>

            <br>
            <center>
                <input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a id="hide1" class="btn btn radius">取消</a>
            </center>
        </form:form>

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
<div id="p2">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th1" name="ordProcureNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th2"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th3"  name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退货单号</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th4"  name="" value="${brProcureNo}" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th5"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th6"  name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本数量/单位</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th7"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;包装数量/单位</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th8"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th9"  name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th10"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th11"  name="taxRate" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th12"  name="" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th13"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th14"  name="" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次号</li>
        <li><input type="text" class="input-text" readonly="readonly" id="th15"  name="price"></li>

    </ul><br>
</div>
        <div class="cl pd-5 bg-1 bk-gray mt-20"><span><button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button></span>&nbsp;&nbsp;&nbsp;&nbsp;<span> <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button></span></div>
            <%--<button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button>&nbsp;&nbsp;&nbsp;&nbsp;--%>
            <%--<button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button>--%>


        <div id="p1">
            <br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退货单号</li>
        <li><input type="text" class="input-text" name="bRProcureMRProcureNo" id="bRProcureMRProcureNo" value="${bProcureM.bRProcureMRProcureNo}" readonly="readonly"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
        <li><input type="text" class="input-text" name="bRProcureMHandbillNo" id="bRProcureMHandbillNo" value="${bProcureM.bRProcureMHandbillNo}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
        <li><input type="text" class="input-text" name="bRProcureMCreateDate" id="bRProcureMCreateDate" value="${bProcureM.bRProcureMCreateDate}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核日期</li>
        <li><input type="text" class="input-text" name="bRProcureMCheckDate" id="bRProcureMCheckDate" value="${bProcureM.bRProcureMCheckDate}" readonly></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务性质</li>
        <li><input type="text" class="input-text" name="bRProcureMServiceAttribute" id="bRProcureMServiceAttribute" value="${bProcureM.bRProcureMServiceAttribute}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
        <li><input type="text" class="input-text" name="bRProcureMPaymentAttributer" id="bRProcureMPaymentAttributer" value="${bProcureM.bRProcureMPaymentAttributer}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
        <li><input type="text" class="input-text" name="bRProcureMWarehouseKeeper" id="bRProcureMWarehouseKeeper" value="${bProcureM.tStaffByBRProcureMWarehouseKeeper.tStaffStaffName}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
        <li><input type="text" class="input-text" name="bRProcureMChecker" id="bRProcureMChecker" value="${bProcureM.tStaffByBRProcureMChecker.tStaffStaffName}" readonly></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务日期</li>
        <li><input type="text" class="input-text" name="bRProcureMModifiTime" id="bRProcureMModifiTime" value="${bProcureM.bRProcureMModifiTime}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
        <li><input type="text" class="input-text" name="bRProcureMSalesman" id="bRProcureMSalesman" value="${bProcureM.tStaffByBRProcureMSalesman.tStaffStaffName}" readonly></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货员</li>
        <li><input type="text" class="input-text" name="bRProcureMDeliverymanNo" id="bRProcureMDeliverymanNo" value="${bProcureM.tStaffByBRProcureMDeliverymanNo.tStaffStaffName}" readonly></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
        <li><input type="text" style="width: 376px" class="input-text" name="bRProcureMNotes" id="bRProcureMNotes" value="${bProcureM.bRProcureMNotes}" required></li>
    </ul><br>
        </div>

    <br>
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
                <%--<td><a href="/detail/th2/${brProcureS.bRProcureSDetailId}&${brProcureS.bRProcureSRProcureNo}">${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}</a></td>--%>
                 <td><a href="#top" onclick="showdetail('${brProcureS.bRProcureSDetailId}');$('#detail').hide(300);$('#p2').show(300);">${brProcureS.bPurchaseOrdS.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}</a></td>
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
<script type="text/javascript" src="../../../statics/lib/scrolltopcontrol.js"></script>
<script type="text/javascript" src="../../../statics/select/ansel_select.js"></script>
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
<script>
    //插件初始化配置
    $('.select').anselcfg({});
</script>
</body>
</html>
