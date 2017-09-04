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
                    document.getElementById("g1").value = "";  //客户编码
                    document.getElementById("g2").value = "";  //促销性质
                    document.getElementById("g3").value = "";  //商品条码
                    document.getElementById("g4").value = "";  //规格型号
                    document.getElementById("g5").value = "";  //交易原价
                    document.getElementById("g6").value = ""; //商品编码
                    document.getElementById("g7").value = ""; //库存
                    document.getElementById("g8").value = ""; //含税金额
                    document.getElementById("g9").value = "";  // 商品名称
                    document.getElementById("10").value = "";  //税率
                    document.getElementById("g11").value = ""; // 未含税金额
                    document.getElementById("g12").value = ""; // 仓库
                    document.getElementById("g13").value = ""; // 单位
                    document.getElementById("g14").value = ""; //  基本单价
                    document.getElementById("g15").value = ""; //订货数量
                    document.getElementById("g16").value = ""; //销售折扣
                    document.getElementById("g17").value = ""; //包装单价
                    document.getElementById("g18").value = ""; //实送数量
                    document.getElementById("g19").value = ""; //订货金额
                    document.getElementById("gg2").value = ""; //  实送金额
                    document.getElementById("gg3").value = ""; //  备注
                    break;
                <c:forEach items="${bSOrderS}" var="detail">
                case "${detail.bSOrderSDetailId}":
                    document.getElementById("g1").value = "${null}";  //客户编码
                    document.getElementById("g2").value = "${null}";  //促销性质
                    document.getElementById("g3").value = "${detail.tGoodsByBSOrderSGoodsNo.tGoodsBarcode}";  //商品条码
                    document.getElementById("g4").value = "${detail.bSOrderSGoodsSpce}";  //规格型号
                    document.getElementById("g5").value = "${detail.bSOrderSOriginalPrice}";  //交易原价
                    document.getElementById("g6").value = "${detail.bSOrderSGoodsNo}"; //商品编码
                    document.getElementById("g7").value = "${detail.bSOrderSInventory}"; //库存
                    document.getElementById("g8").value = "${null}"; //含税金额
                    document.getElementById("g9").value = "${detail.tGoodsByBSOrderSGoodsNo.tGoodsGoodsName}";  // 商品名称
                    document.getElementById("g10").value = "${detail.tGoodsByBSOrderSGoodsNo.tGoodsInTax}";  //税率
                    document.getElementById("g11").value = "${null}"; // 未含税金额
                    document.getElementById("g12").value = "${detail.tRoomByBSOrderSRoomNo.tRoomRoomName}"; //仓库
                    document.getElementById("g13").value = "${detail.bSOrderSUnit}"; // 单位
                    document.getElementById("g14").value = "${null}"; // 基本单价
                    document.getElementById("g15").value = "${detail.bSOrderSOrdQuantity}"; //订货数量
                    document.getElementById("g16").value = "${null}"; //销售折扣
                    document.getElementById("g17").value = "${null}"; //包装单价
                    document.getElementById("g18").value = "${null}"; //实送数量
                    document.getElementById("g19").value = "${detail.bSOrderSOrdPrice}"; //订货金额
                    document.getElementById("gg2").value = "${detail.bSOrderSRealPrice}"; //  实送金额
                    document.getElementById("gg3").value = "${null}"; // 备注

                    break;
                </c:forEach>
            }
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
        function goodsChange(id) {
            switch (id){
                case  "":
                    document.getElementById("d1").value = "";
                    document.getElementById("d2").value = "";
                    document.getElementById("d3").value = "";
                    document.getElementById("d4").value = "";
                    document.getElementById("d5").value = "";
                    document.getElementById("d6").value = "";
                    document.getElementById("d7").value = "";
                    document.getElementById("d8").value = "";
                    document.getElementById("d9").value = "";
                    document.getElementById("d10").value = "";

                    break;
                <c:forEach items="${TGoods}" var="TGoods">
                case "${TGoods.tGoodsGoodsNo}":
                    document.getElementById("d1").value = "${TGoods.tGoodsGoodsSpce}";
                    document.getElementById("d2").value = "${TGoods.tGoodsBarcode}";
                    document.getElementById("d3").value = "${TGoods.tGoodsPackQuantity}";
                    document.getElementById("d4").value = "${TGoods.tGoodsGoodsName}";
                    document.getElementById("d5").value = "${TGoods.tGoodsUnit}";
                    document.getElementById("d6").value = "${TGoods.tGoodsExDay/30}";
                    document.getElementById("d7").value = "${TGoods.tGoodsInTax}";
                    document.getElementById("d8").value = "${TGoods.tGoodsSPrice}";
                    document.getElementById("d9").value = "${TGoods.tGoodsInPrice}";
                    document.getElementById("d10").value = "${TGoods.tGoodsInTaxprice}";
                    break;
                </c:forEach>
            }
        }

        function price(id) {
            document.getElementById("s1").value =document.getElementById("bSOrderSOrdBoxQuantity").value * document.getElementById("d3").value;
            document.getElementById("s2").value = (document.getElementById("d8").value * document.getElementById("s1").value);
            document.getElementById("s3").value =(document.getElementById("d8").value * document.getElementById("s1").value)*(1+document.getElementById("d7").value);
            document.getElementById("s4").value = document.getElementById("s1").value * document.getElementById("d9").value;



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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 销售管理 <span class="c-gray en">&gt;</span> 销售单明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <%--<div -class="cl p; d-5 bg-1 bk-gray mt-20"><span><a id="show1" href="/pur_order/detaileOrder/add/${ordProcureNo}" class="btn btn-success radius" onclick="hideform()">新增明细</a></span></div>--%>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span><a id="show1" class="btn btn-success radius" onclick="hideform()"  >新增明细</a></span></div>

    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">

     <%--   <c:if test="${empty bSOrderS}">
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
                         </tr><br>

                </tbody>
            </table>
        </c:if>--%>
        <form:form id="detail" name="detail" action="/sale_xs/detaileOrder/addP" method="post" role="form" >

            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售单号</li>
                <li><input type="text" class="input-text" name="bSOrderSSOrderNo"  id="bSOrderSSOrderNo" readonly ="readonly"  value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货单号</li>
                <li>
                    <input id="good1" class="input-text"  onchange="goodsChange(this.value);" name="bSOrderSGoodsNo" required>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
                <li><input type="text" class="input-text" id="bPurchaseOrdSPresentationProperty"  ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
                <li>
                    <select class="input-text" id="bPurchaseOrdSFactoryGoodsNo" >
                        <option value="" >选择客户编码</option>
                        <c:forEach items="${null}" var="Client">
                            <option value="${Client.tClientClientNo}">${Client.tClientClientNo}(${Client.tClientClientName})</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次号</li>
                <li><input type="text" class="input-text" required id="d1"   name="bSOrderSGoodsSpce"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
                <li><input type="text" class="input-text" id="bSOrderSOriginalPrice" name="bSOrderSOriginalPrice" required></li>
            </ul><br>
            <ul>  <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售价</li>
                <li><input type="text" class="input-text" name="bSOrderSUnit" id="d5" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售数量</li>
                <li><input type="text" class="input-text"  id="bSOrderSInventory"  name="bSOrderSInventory" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到期日期</li>
                <li><input type="text" class="input-text"  id="d2"  ></li>

            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
                <li><input type="text" class="input-text"  id="d4"   ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;协议编号</li>
                <li><input type="text" class="input-text" id="d7" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
                <li><input type="text" class="input-text"  id="d8" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li>
                    <input class="input-text" name="bSOrderSRoomNo" id="bSOrderSRoomNo" required>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
                <li><input type="text" class="input-text" readonly="readonly" name="bSOrderSDetailId" value=""></li>
            </ul><br>
            <ul>

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="width: 340px"><input type="text" class="input-text" id="sss" name="" ></li>
                <li><input type="hidden" class="input-text" id="d3"  name=""></li>
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
    <%--    <c:if test="${!empty null}">--%>
 <div id="p2">
     <ul>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售单号</li>
         <li><input type="text" class="input-text" name="bSOrderSSOrderNo"  id="a1" readonly ="readonly"  value="${null}"></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货单号</li>
         <li>
             <input id="" class="input-text"  onchange="goodsChange(this.value);" name="bSOrderSGoodsNo" required>
         </li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
         <li><input type="text" class="input-text" id="a2"  ></li>
     </ul><br>
     <ul>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库位编号</li>
         <li>
             <select class="input-text" id="a3" >
                 <option value="" >选择客户编码</option>
                 <c:forEach items="${null}" var="Client">
                     <option value="${Client.tClientClientNo}">${Client.tClientClientNo}(${Client.tClientClientName})</option>
                 </c:forEach>
             </select>
         </li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次号</li>
         <li><input type="text" class="input-text" required id="a4"   name="bSOrderSGoodsSpce"></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
         <li><input type="text" class="input-text" id="a5" name="bSOrderSOriginalPrice" required></li>
     </ul><br>
     <ul>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到期日期</li>
         <li><input type="text" class="input-text"  id="a6"   disabled></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售数量</li>
         <li><input type="text" class="input-text"  id="a7"  name="bSOrderSInventory" required></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售价</li>
         <li><input type="text" class="input-text" name="bSOrderSUnit" id="a8" required></li>

     </ul><br>
     <ul>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
         <li><input type="text" class="input-text"  id="a9"   ></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;协议编号</li>
         <li><input type="text" class="input-text" id="a10" ></li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
         <li><input type="text" class="input-text"  id="a11" ></li>
     </ul><br>
     <ul>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
         <li>
             <input class="input-text" name="bSOrderSRoomNo" id="a12" required>
         </li>
         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
         <li><input type="text" class="input-text" readonly="readonly" name="bSOrderSDetailId" value="${null}"></li>
     </ul><br>
     <ul>

         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
         <li style="width: 280px"><input type="text" class="input-text" id="a13" name="ryr" ></li>
         <li><input type="hidden" class="input-text" id="a14"  name="rtrry"></li>
     </ul><br>

</div>
     <%--   </c:if>--%>
        <%--//======================================================================================================================================================--%>
        <%--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--%>
        <div class="cl pd-5 bg-1 bk-gray mt-20"><span><button type="button" id="show" class="btn btn-primary upload-btn">显示订货单</button></span>
            &nbsp;&nbsp;&nbsp;&nbsp;<span> <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏订货单</button></span></div>

<div id="p1">
            <br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售单号</li>
        <li><input id="bSOrderMSOrderNo" name="bSOrderMSOrderNo" type="text" class="input-text"  value="${UUID}" readonly="readonly" required></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
        <li>
            <select class="input-text" name="bSOrderMSalesman"  id="bSOrderMSalesman" >
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
            <select class="input-text" name="bSOrderMCreateNo"  id="bSOrderMCreateNo" >
                <option value="" >选择制单人</option>
                <c:forEach items="${Staff}" var="Staff">
                    <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                </c:forEach>
            </select>
        </li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货单号</li>
        <li><input type="text" class="input-text" name="bSOrderMOrderNo" id="bSOrderMOrderNo" ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户编码</li>
        <li><select class="input-text" name="bSOrderMSalesTypeNo" id="bSOrderMSalesTypeNo" >
            <option value="" >选择客户编码</option>
            <c:forEach items="${SalesProperties}" var="SalesProperties">
                <option value="${SalesProperties.salesPropertiesSalesTypeNo}">${SalesProperties.salesPropertiesSalesPropertiesName}</option>
            </c:forEach>
        </select></li>

        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货单号</li>
        <li><input type="text" class="input-text" id="bSOrderMChecker" name="bSOrderMChecker" disabled ></li>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售金额</li>
        <li><input type="text" class="input-text" name="bSOrderMSalesDiscount" id="bSOrderMSalesDiscount" ></li>
    </ul><br>
    <ul>

        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家名称</li>
        <li >
            <select style="float: left;width: 345px;" class="input-text" name="bSOrderMClientNo" id="bSOrderMClientNo" >
                <option value="" >选择厂家</option>
                <c:forEach items="${Client}" var="Client">
                    <option value="${Client.tClientClientNo}">${Client.tClientClientName}</option>
                </c:forEach>
            </select>
        </li>

        <li></li><li></li> <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售日期</li>
        <li style="float: left;width: 320px;"><input type="date" class="input-text" id="bSOrderMSendDate" name="bSOrderMSendDate" required></li>
    </ul><br>
    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货地址</li>
        <li>
            <select style="float: left;width: 390px;" class="input-text" name="bSOrderMClientAddress"  id="bSOrderMClientAddress">
                <option value="" >选择地址</option>
                <c:forEach items="${Client}" var="Client">
                    <option value="${Client.tClientClientAddress}">${Client.tClientClientAddress}</option>
                </c:forEach>
            </select>
        </li>

    </ul><br>

    <ul>
        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
        <li style="float: left;width: 390px;"><input type="text" class="input-text" id="bSOrderMNotes" name="bSOrderMNotes" ></li>
    </ul><br>
 </div>
      <%--  <c:if test="${!empty bSOrderS}">--%>
            <%--//======================================================================================================================================================--%>
            <table class="table table-border table-bordered table-bg table-sort">
                <br>
                <thead>
                <br>
                <tr class="text-c">
                    <th width="25">选择</th>
                    <th width="30">ID</th>
                    <th width="70">批次号</th>
                        <%--<th width="80">排序</th>--%>
                    <th width="80">仓库</th>
                    <th width="80">生产日期</th>
                    <th width="80">销售价</th>
                    <th width="80">销售数量</th>
                    <th width="80">到期日期</th>
                    <th width="80">结算方式</th>
                    <th width="40">操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int i = 1;
                %>
                <c:forEach items="${bSOrderS}" var="bSOrderS">
                    <tr  class="text-c" >
                        <td><input name="id" type="checkbox"></td>
                        <td ><%=i %><% i++; %></td>
                             <td><a href="#top" onclick="showdetail('${bSOrderS.bSOrderSDetailId}');$('#detail').hide(300);$('#p2').show(300);">${bSOrderS.tGoodsByBSOrderSGoodsNo.tGoodsGoodsName}</a></td>
                        <td >${bSOrderS.tRoomByBSOrderSRoomNo.tRoomRoomName}</td>
                        <td >${bSOrderS.tGoodsByBSOrderSGoodsNo.tGoodsUnit}</td>
                        <td >${null}</td>
                        <td >${bSOrderS.bSOrderSInventory}</td>
                        <td >${null}</td>
                        <td >${bSOrderS.bSOrderSOrdQuantity}</td>
                        <td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/sale_order/detaileOrder/update/${bSOrderS.bSOrderSDetailId}&${bSOrderS.bSOrderSSOrderNo}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/sale_order/detaileOrder/delete/${bSOrderS.bSOrderSDetailId}&${bSOrderS.bSOrderSSOrderNo}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
       <%-- </c:if>--%>
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
