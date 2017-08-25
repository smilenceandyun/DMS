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

        function showdetail(detailid) {

            switch (detailid){
                case  "":
                    document.getElementById("bPurchaseOrdSFactoryGoodsNo1").value = "";  //厂家编码
                    document.getElementById("bPurchaseOrdSPresentationProperty1").value = "";  //赠送性质
                    document.getElementById("tiaoma1").value = "";  //商品条码
                    document.getElementById("guige1").value = "";  //规格型号
                    document.getElementById("bPurchaseOrdSOriginalPrice1").value = "";  //交易原价
                    document.getElementById("bPurchaseOrdSGoodsNo1").value = ""; //商品编码
                    document.getElementById("kucun1").value = ""; //库存
                    document.getElementById("mingcheng1").value = ""; //商品名称
                    document.getElementById("suilv1").value = "";  // 税率
                    document.getElementById("bPurchaseOrdSRoomNo1").value = "";  //仓库
                    document.getElementById("dangwei1").value = ""; // 单位
                    document.getElementById("danjia1").value = ""; // 单价
                    document.getElementById("shuliang1").value = ""; // 数量/箱
                    document.getElementById("baozjiqi1").value = ""; //  保质期
                    document.getElementById("bPurchaseOrdSBoxQuantity1").value = ""; //箱数
                    document.getElementById("bPurchaseOrdSMfg1").value = ""; //生产日期
                    document.getElementById("bPurchaseOrdSExp1").value = ""; //过期日期
                    document.getElementById("bPurchaseOrdSBoxPrice1").value = ""; //箱价
                    document.getElementById("bPurchaseOrdSPaymentNo1").value = ""; //结算方式
                    document.getElementById("hansui1").value = ""; //  含税金额
                    document.getElementById("weihansui1").value = ""; //  未含税金额
                    document.getElementById("jinger1").value = ""; //  金额
                    break;
                <c:forEach items="${bPurchaseOrdS}" var="detail">
                case "${detail.bPurchaseOrdSDetailId}":
                    document.getElementById("bPurchaseOrdSFactoryGoodsNo1").value = "${detail.bPurchaseOrdSFactoryGoodsNo}(${detail.tFactorysByBPurchaseOrdSFactoryGoodsNo.tFactorysFactoryGoodsName})";  //厂家编码
                    document.getElementById("bPurchaseOrdSPresentationProperty1").value = "${detail.bPurchaseOrdSPresentationProperty}";  //赠送性质
                    document.getElementById("tiaoma1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsBarcode}";  //商品条码
                    document.getElementById("guige1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsSpce}";  //规格型号
                    document.getElementById("bPurchaseOrdSOriginalPrice1").value = "${detail.bPurchaseOrdSOriginalPrice}";  //交易原价
                    document.getElementById("bPurchaseOrdSGoodsNo1").value = "${detail.bPurchaseOrdSGoodsNo}"; //商品编码
                    document.getElementById("kucun1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsPackQuantity}"; //库存
                    document.getElementById("mingcheng1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}"; //商品名称
                    document.getElementById("suilv1").value = "${detail.bPurchaseOrdSTaxRate}";  // 税率
                    document.getElementById("bPurchaseOrdSRoomNo1").value = "${detail.tRoomByBPurchaseOrdSRoomNo.tRoomRoomName}";  //仓库
                    document.getElementById("dangwei1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsUnit}"; // 单位
                    document.getElementById("danjia1").value = "${detail.bPurchaseOrdSPrice}"; // 单价
                    document.getElementById("shuliang1").value = "${detail.bPurchaseOrdSQuantity}"; // 数量/箱
                    document.getElementById("baozjiqi1").value = "${detail.tGoodsByBPurchaseOrdSGoodsNo.tGoodsExDay/30}"; //  保质期
                    document.getElementById("bPurchaseOrdSBoxQuantity1").value = "${detail.bPurchaseOrdSBoxQuantity}"; //箱数
                    document.getElementById("bPurchaseOrdSMfg1").value = "${detail.bPurchaseOrdSMfg}"; //生产日期
                    document.getElementById("bPurchaseOrdSExp1").value = "${detail.bPurchaseOrdSExp}"; //过期日期
                    document.getElementById("bPurchaseOrdSBoxPrice1").value = "${detail.bPurchaseOrdSBoxPrice}"; //箱价
                    document.getElementById("bPurchaseOrdSPaymentNo1").value = "${detail.tPaymentByBPurchaseOrdSPaymentNo.tPaymentPaymentName}"; //结算方式
                    document.getElementById("hansui1").value = "${detail.bPurchaseOrdSDetailMoney *(1 + detail.bPurchaseOrdSTaxRate)}"; //  含税金额
                    document.getElementById("weihansui1").value = "${detail.bPurchaseOrdSDetailMoney}"; //  未含税金额
                    document.getElementById("jinger1").value = "${detail.bPurchaseOrdSDetailMoney *(1 + detail.bPurchaseOrdSTaxRate)}"; //  金额
                    break;
                </c:forEach>
            }


//            document.getElementById("hansui").value =document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;
//            document.getElementById("weihansui").value = (document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value) / (( 1 + document.getElementById("suilv").value)/10);
//            document.getElementById("jinger").value = document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;
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
                    //打开添加明细
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

        function goodsChange(id) {
            switch (id){
                case  "":
                    document.getElementById("guige").value = "";
                    document.getElementById("tiaoma").value = "";
                    document.getElementById("kucun").value = "";
                    document.getElementById("mingcheng").value = "";
                    document.getElementById("dangwei").value = "";
                    document.getElementById("baozjiqi").value = "";
                    document.getElementById("suilv").value = "";
                    document.getElementById("danjia").value = "";
                    document.getElementById("shuliang").value = "";
                    document.getElementById("bPurchaseOrdSBoxPrice").value = "";

                    break;
                <c:forEach items="${TGoods}" var="TGoods">
                case "${TGoods.tGoodsGoodsNo}":
                    document.getElementById("guige").value = "${TGoods.tGoodsGoodsSpce}";
                    document.getElementById("tiaoma").value = "${TGoods.tGoodsBarcode}";
                    document.getElementById("kucun").value = "${TGoods.tGoodsPackQuantity}";
                    document.getElementById("mingcheng").value = "${TGoods.tGoodsGoodsName}";
                    document.getElementById("dangwei").value = "${TGoods.tGoodsUnit}";
                    document.getElementById("baozjiqi").value = "${TGoods.tGoodsExDay/30}";
                    document.getElementById("suilv").value = "${TGoods.tGoodsInTax}";
                    document.getElementById("danjia").value = "${TGoods.tGoodsSPrice}";
                    document.getElementById("shuliang").value = "${TGoods.tGoodsPackQuantity}";
                    document.getElementById("bPurchaseOrdSBoxPrice").value = "${TGoods.tGoodsPackQuantity * TGoods.tGoodsInTaxprice}";
                    break;
                </c:forEach>
            }
        }

        function price(id) {

            document.getElementById("hansui").value =document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;
            document.getElementById("weihansui").value = (document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value) / (( 1 + document.getElementById("suilv").value)/10);
            document.getElementById("jinger").value = document.getElementById("bPurchaseOrdSBoxPrice").value * document.getElementById("bPurchaseOrdSBoxQuantity").value;

        }

        function top() {
            $(function () {
                $(".top").click(//定义返回顶部点击向上滚动的动画
                    function () {
                        $('html,body').animate({ scrollTop: 0 }, 700);
                    });
                $(".bottom").click(//定义返回顶部点击向上滚动的动画
                    function () {
                        $('html,body').animate({ scrollTop: document.body.clientHeight }, 700);
                    });
            })
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <%--<div -class="cl p; d-5 bg-1 bk-gray mt-20"><span><a id="show1" href="/pur_order/detaileOrder/add/${ordProcureNo}" class="btn btn-success radius" onclick="hideform()">新增明细</a></span></div>--%>
        <div class="cl pd-5 bg-1 bk-gray mt-20"><span><a id="show1" class="btn btn-success radius" onclick="hideform()"  >新增明细</a></span></div>

    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">

<c:if test="${empty bPurchaseOrdS}">
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
        </tr><br>

        </tbody>
    </table>
</c:if>
        <form:form id="detail" name="detail" action="/pur_order/detaileOrder/addP" method="post" role="form" >

            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
                <li><input type="text" class="input-text" id="bPurchaseOrdSOrdProcureNo" name="bPurchaseOrdSOrdProcureNo" value="${ordProcureNo}" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
                    <%--<li><input type="text" class="input-text" id="bPurchaseOrdSFactoryGoodsNo"  name="bPurchaseOrdSFactoryGoodsNo" ></li>--%>
                <li>
                    <select class="input-text" name="bPurchaseOrdSFactoryGoodsNo" id="bPurchaseOrdSFactoryGoodsNo" required>
                        <option value="" >选择厂家编号</option>
                        <c:forEach items="${TFactorys}" var="TFactorys">
                            <option value="${TFactorys.tFactorysFactoryGoodsNo}">${TFactorys.tFactorysFactoryGoodsNo}(${TFactorys.tFactorysFactoryGoodsName})</option>
                        </c:forEach>

                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
                <li><input type="text" class="input-text" id="bPurchaseOrdSPresentationProperty" name="bPurchaseOrdSPresentationProperty" onmousedown="return lichanged()"></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                    <%--<li><input type="text" class="input-text" readonly="readonly" name="" ></li>--%>
                <li>
                        <%--<select class="input-text" name="bPurchaseOrdSGoodsNo" id="bPurchaseOrdSGoodsNo" onchange="lichanged()">--%>
                        <%--<option value="1" selected>选择商品编号</option>--%>
                        <%--<c:forEach items="${TGoods}" var="TGoods">--%>
                        <%--<option value="${TGoods.tGoodsBrandNo}">${TGoods.tGoodsBrandNo}(${TGoods.tGoodsGoodsName})</option>--%>
                        <%--</c:forEach>--%>

                        <%--</select>--%>

                    <select id="good1" class="input-text" required onchange="goodsChange(this.value);" name="bPurchaseOrdSGoodsNo" required>
                        <option value="" selected>选择商品编号</option>
                        <c:forEach items="${TGoods}" var="TGoods">
                            <option value="${TGoods.tGoodsGoodsNo}">${TGoods.tGoodsGoodsNo}(${TGoods.tGoodsGoodsName})</option>
                        </c:forEach>
                    </select>
                </li>

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                <li><input type="text" class="input-text" required id="guige" readonly="readonly" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
                <li><input type="text" class="input-text" id="bPurchaseOrdSOriginalPrice" name="bPurchaseOrdSOriginalPrice" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
                <li><input type="text" class="input-text" required id="tiaoma" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库存</li>
                <li><input type="text" class="input-text" required id="kucun" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;含税金额</li>
                <li><input type="text" class="input-text" readonly="readonly"  required id="hansui" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
                <li><input type="text" class="input-text" required id="mingcheng" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li><input type="text" class="input-text" id="suilv" name="bPurchaseOrdSTaxRate" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未含税金额</li>
                <li><input type="text" class="input-text" readonly="readonly" id="weihansui" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
                <li>
                    <select class="input-text" name="bPurchaseOrdSRoomNo" id="bPurchaseOrdSRoomNo" required>
                        <option value="" >选择仓库编号</option>
                        <c:forEach items="${TRoom}" var="TRoom">
                            <option value="${TRoom.tRoomRoomNo}">${TRoom.tRoomRoomNo}(${TRoom.tRoomRoomName})</option>
                        </c:forEach>

                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
                <li><input type="text" class="input-text" required id="dangwei" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单价</li>
                <li><input type="text" class="input-text" id="danjia" name="bPurchaseOrdSPrice" readonly="readonly" required></li>

            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量/箱</li>
                <li><input type="text" class="input-text" id="shuliang" name="bPurchaseOrdSQuantity" readonly="readonly" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/月</li>
                <li><input type="text" class="input-text" required id="baozjiqi" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总金额</li>
                <li><input  type="text" class="input-text" id="jinger" name="bPurchaseOrdSDetailMoney"  readonly="readonly" required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱数</li>
                <li><input type="text" class="input-text" required onchange="price(this.value);" id="bPurchaseOrdSBoxQuantity" name="bPurchaseOrdSBoxQuantity" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱价</li>
                <li><input type="text" class="input-text"  id="bPurchaseOrdSBoxPrice" name="bPurchaseOrdSBoxPrice" readonly="readonly" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
                <li>
                    <select class="input-text" name="bPurchaseOrdSPaymentNo" id="bPurchaseOrdSPaymentNo" required>
                        <option value="" >选择结算方式</option>
                        <c:forEach items="${TPayment}" var="TPayment">
                            <option value="${TPayment.tPaymentPaymentNo}">${TPayment.tPaymentPaymentName}</option>
                        </c:forEach>

                    </select>
                </li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
                <li><input type="date" class="input-text"  id="bPurchaseOrdSMfg" name="bPurchaseOrdSMfg" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;过期日期</li>
                <li><input type="date" class="input-text" id="bPurchaseOrdSExp" name="bPurchaseOrdSExp" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
                <li><input type="text" class="input-text" readonly="readonly" name="bPurchaseOrdSDetailId" value="${detailId}"></li>
                    <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>--%>
                    <%--<li style="float: left;width: 650px;"><input type="text" class="input-text" readonly="readonly" name="" value="${detail.}"></li>--%>
            </ul><br>

            <br>
            <div style="width: 900px">
                <center>
                <input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input  class="btn btn radius" type="reset" name="reset" value="清除数据">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a id="hide1" class="btn btn radius">取消</a>
                </center>
            </div>
        </form:form>
        <br>
<%--//====================================================================================================--%>
        <c:if test="${!empty bPurchaseOrdS}">
<div id="p2">
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
        <li><input type="text" class="input-text" readonly="readonly" value="${ordProcureNo}" name="bPurchaseOrdSOrdProcureNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSFactoryGoodsNo1" name="bPurchaseOrdSFactoryGoodsNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSPresentationProperty1" name="bPurchaseOrdSPresentationProperty" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="tiaoma1" name="tiaoma" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
        <li><input type="text" class="input-text" readonly="readonly" id="guige1" name="guige" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSOriginalPrice1" name="bPurchaseOrdSOriginalPrice" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSGoodsNo1" name="bPurchaseOrdSGoodsNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库存</li>
        <li><input type="text" class="input-text" readonly="readonly" id="kucun1" name="kucun" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;含税金额</li>
        <li><input type="text" class="input-text" readonly="readonly" id="hansui1" name="hansui" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
        <li><input type="text" class="input-text" readonly="readonly" id="mingcheng1" name="mingcheng" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
        <li><input type="text" class="input-text" readonly="readonly" id="suilv1" name="suilv" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未含税金额</li>
        <li><input type="text" class="input-text" readonly="readonly" id="weihansui1" name="weihansui" ></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSRoomNo1" name="bPurchaseOrdSRoomNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
        <li><input type="text" class="input-text" readonly="readonly" id="dangwei1" name="dangwei" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单价</li>
        <li><input type="text" class="input-text" readonly="readonly" id="danjia1" name="danjia"></li>

    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量/箱</li>
        <li><input type="text" class="input-text" readonly="readonly" id="shuliang1" name="shuliang"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/月</li>
        <li><input type="text" class="input-text" readonly="readonly" id="baozjiqi1" name="baozjiqi"></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总金额</li>
        <li><input type="text" class="input-text" readonly="readonly" id="jinger1" name="jinger"></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱数</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSBoxQuantity1" name="bPurchaseOrdSBoxQuantity" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSMfg1" name="bPurchaseOrdSMfg" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;过期日期</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSExp1" name="bPurchaseOrdSExp" ></li>
            <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>--%>
            <%--<li style="float: left;width: 650px;"><input type="text" class="input-text" readonly="readonly" name="" value="${detail.}"></li>--%>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱价</li>
        <li><input type="text" class="input-text"  id="bPurchaseOrdSBoxPrice1" name="bPurchaseOrdSBoxPrice" readonly="readonly" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
        <li><input type="text" class="input-text" readonly="readonly" id="bPurchaseOrdSPaymentNo1" name="bPurchaseOrdSPaymentNo" ></li>
    </ul><br>

</div>
        </c:if>
    <%--//======================================================================================================================================================--%>
    <%--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--%>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span><button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button></span>&nbsp;&nbsp;&nbsp;&nbsp;<span> <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button></span></div>
    <%--<button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button>&nbsp;&nbsp;&nbsp;&nbsp;--%>
    <%--<button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button>--%>


    <div id="p1">
        <br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
            <li><input id="bPurchaseOrdMOrdProcureNo" name="bPurchaseOrdMOrdProcureNo" type="text" class="input-text"  value="${bPurchaseOrdM.bPurchaseOrdMOrdProcureNo}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
            <li><input id="bPurchaseOrdMSalesman" name="bPurchaseOrdMSalesman" type="text" class="input-text"  value="${bPurchaseOrdM.tStaffByBPurchaseOrdMSalesman.tStaffStaffName}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款</li>
            <li><input id="bPurchaseOrdMAdPaymoney" name="bPurchaseOrdMAdPaymoney" type="text" class="input-text" value="${bPurchaseOrdM.bPurchaseOrdMAdPaymoney}" readonly="readonly"></li>
                <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算性质</li>--%>
                <%--<li><input type="text" class="input-text" name=""></li>--%>
                <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>--%>
                <%--<li><input type="text" class="input-text" name=""></li>--%>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单人</li>
            <li><input type="text" class="input-text" id="bPurchaseOrdMCreateNo" name="bPurchaseOrdMCreateNo" value="${bPurchaseOrdM.tStaffByBPurchaseOrdMCreateNo.tStaffStaffName}" readonly="readonly"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手工单号</li>
            <li><input type="text" class="input-text" name="bPurchaseOrdMHandbillNo" id="bPurchaseOrdMHandbillNo" value="${bPurchaseOrdM.bPurchaseOrdMHandbillNo}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务属性</li>
            <li><input type="text" class="input-text" id="bPurchaseOrdMServiceAttribute" name="bPurchaseOrdMServiceAttribute" value="${bPurchaseOrdM.bPurchaseOrdMServiceAttribute}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货日期</li>
            <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bPurchaseOrdMOrdDate" name="bPurchaseOrdMOrdDate" value="${bPurchaseOrdM.bPurchaseOrdMOrdDate}" readonly="readonly"></li>

        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;付款性质</li>
            <li><input type="text" class="input-text" name="bPurchaseOrdMPaymentType" id="bPurchaseOrdMPaymentType" value="${bPurchaseOrdM.bPurchaseOrdMPaymentType}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家名称</li>
            <li><input type="text" class="input-text" name="bPurchaseOrdMFactoryGoodsNo" id="bPurchaseOrdMFactoryGoodsNo" value="${bPurchaseOrdM.tFactorysByBPurchaseOrdMFactoryGoodsNo.tFactorysFactoryGoodsName}" readonly="readonly"></li>

            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到货期期</li>
            <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bPurchaseOrdMDeliveryDate" name="bPurchaseOrdMDeliveryDate" value="${bPurchaseOrdM.bPurchaseOrdMDeliveryDate}" readonly="readonly"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户编号</li>
            <li><input type="text" class="input-text" name="bPurchaseOrdMClientNo" id="bPurchaseOrdMClientNo" value="${bPurchaseOrdM.bPurchaseOrdMClientNo}(${bPurchaseOrdM.tClientByBPurchaseOrdMClientNo.tClientClientShortname})" readonly="readonly"></li>
                <%--<li><input type="text" class="input-text" id="bPurchaseOrdMClientNo" name="bPurchaseOrdMClientNo" readonly="readonly" ></li>--%>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
            <li><input type="text" class="input-text" id="bPurchaseOrdMChecker" name="bPurchaseOrdMChecker" value="${bPurchaseOrdM.tStaffByBPurchaseOrdMChecker.tStaffStaffName}" readonly="readonly"></li>
                <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核日期</li>--%>
                <%--<li style="float: left;width: 345px;"><input type="date" class="input-text" id="bPurchaseOrdMCheckDate" name="bPurchaseOrdMCheckDate" readonly="readonly"></li>--%>

        </ul><br>

        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
            <li style="float: left;width: 420px;"><input type="text" class="input-text" id="bPurchaseOrdMNotes" name="bPurchaseOrdMNotes" value="${bPurchaseOrdM.bPurchaseOrdMNotes}" readonly="readonly"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总经理</li>
            <li><input type="text" class="input-text" id="bPurchaseOrdMManagerNo" name="bPurchaseOrdMManagerNo" value="${bPurchaseOrdM.tStaffByBPurchaseOrdMManagerNo.tStaffStaffName}" readonly="readonly"></li>
                <%--<li>--%>
                <%--<select class="input-text" name="bPurchaseOrdMManagerNo"  id="bPurchaseOrdMManagerNo">--%>
                <%--<option value="" >添加总经理</option>--%>
                <%--<c:forEach items="${Staff}" var="Staff">--%>
                <%--<option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>--%>
                <%--</c:forEach>--%>
                <%--</select>--%>
                <%--</li>--%>
        </ul>
        <br>
    </div>
        <c:if test="${!empty bPurchaseOrdS}">
    <%--//======================================================================================================================================================--%>
    <table class="table table-border table-bordered table-bg table-sort">
        <br>
        <thead>
        <br>
        <tr class="text-c">
            <th width="25">选择</th>
            <th width="30">ID</th>
            <th width="70">商品名称</th>
                <%--<th width="80">排序</th>--%>
            <th width="80">仓库</th>
            <th width="80">单位</th>
            <th width="80">单价</th>
            <th width="80">数量/箱</th>
            <th width="80">箱数</th>
            <th width="80">保质期/月</th>
            <th width="80">总金额</th>
            <th width="40">操作</th>
        </tr>
        </thead>
        <tbody>
        <%
            int i = 1;
        %>
        <c:forEach items="${bPurchaseOrdS}" var="purOrder">
            <tr  class="text-c" >
                    <td><input name="id" type="checkbox"></td>
                <td ><%=i %><% i++; %></td>
                    <%--<td><a href="/pur_order/detaileOrder/${purOrder.bPurchaseOrdSOrdProcureNo}">${purOrder.bPurchaseOrdSOrdProcureNo}</a></td>--%>
                <%--<td><a href="/pur_order/detaileOrderDetail/${purOrder.bPurchaseOrdSDetailId}&${purOrder.bPurchaseOrdSOrdProcureNo}">${purOrder.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}</a></td>--%>
                <td><a href="#top" onclick="showdetail('${purOrder.bPurchaseOrdSDetailId}');$('#detail').hide(300);$('#p2').show(300);">${purOrder.tGoodsByBPurchaseOrdSGoodsNo.tGoodsGoodsName}</a></td>
                <td >${purOrder.tRoomByBPurchaseOrdSRoomNo.tRoomRoomName}</td>
                <td >${purOrder.tGoodsByBPurchaseOrdSGoodsNo.tGoodsUnit}</td>
                <td >${purOrder.bPurchaseOrdSPrice}</td>
                <td >${purOrder.bPurchaseOrdSQuantity}</td>
                <td >${purOrder.bPurchaseOrdSBoxQuantity}</td>
                <td >${purOrder.bPurchaseOrdSMfg}</td>
                <td >${purOrder.bPurchaseOrdSDetailMoney}</td>
                <td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/pur_order/detaileOrder/update/${purOrder.bPurchaseOrdSDetailId}&${purOrder.bPurchaseOrdSOrdProcureNo}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/pur_order/detaileOrder/delete/${purOrder.bPurchaseOrdSDetailId}&${purOrder.bPurchaseOrdSOrdProcureNo}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
