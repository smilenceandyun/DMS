<%--
  Created by IntelliJ IDEA.
  User: Krystal_wy
  Date: 2017/8/31
  Time: 13:26
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
        function goodsChangeupdate(id) {
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

        function priceupdate(id) {

            document.getElementById("s1").value =document.getElementById("bSOrderSOrdBoxQuantity").value * document.getElementById("d3").value;
            document.getElementById("s2").value = (document.getElementById("d8").value * document.getElementById("s1").value);
            document.getElementById("s3").value =(document.getElementById("d8").value * document.getElementById("s1").value)*(1+document.getElementById("d7").value);
            document.getElementById("s4").value = document.getElementById("s1").value * document.getElementById("d9").value;


        }

        function hidediv() {
            $(document).ready(function () {
                $("#hide").click(function () {
                    $("#p1").hide(300);
                });
                $("#show").click(function () {
                    $("#p1").show(300);
                });
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


    </script>

    <title>销售管理</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 销售管理 <span class="c-gray en">&gt;</span> 更新明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">

    <div class="mt-20">
        <form:form action="/sale_order/detaileOrder/updateP" method="post" role="form">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货单号</li>
                <li><input type="text" class="input-text" name="bSOrderSSOrderNo"  id="bSOrderSSOrderNo" readonly ="readonly"  value="${bSOrdS.bSOrderSSOrderNo}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                <li>
                    <select id="good1" class="input-text"  onchange="goodsChangeupdate(this.value);" name="bSOrderSGoodsNo" required>
                        <option value="${bSOrdS.bSOrderSGoodsNo}" selected>${bSOrdS.bSOrderSGoodsNo}</option>
                        <c:forEach items="${TGoods}" var="TGoods">
                            <option value="${TGoods.tGoodsGoodsNo}">${TGoods.tGoodsGoodsNo}(${TGoods.tGoodsGoodsName})</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;促销性质</li>
                <li><input type="text" class="input-text" id="bPurchaseOrdSPresentationProperty"  ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户编码</li>
                <li>
                    <select class="input-text" id="bPurchaseOrdSFactoryGoodsNo" >
                        <option value="" >选择客户编码</option>
                        <c:forEach items="${Client}" var="Client">
                            <option value="${Client.tClientClientNo}">${Client.tClientClientNo}(${Client.tClientClientName})</option>
                        </c:forEach>
                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                <li><input type="text" class="input-text" required id="d1"   name="bSOrderSGoodsSpce"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
                <li><input type="text" class="input-text" id="bSOrderSOriginalPrice" name="bSOrderSOriginalPrice" required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
                <li><input type="text" class="input-text"  id="d2"   disabled></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;库存</li>
                <li><input type="text" class="input-text"  id="bSOrderSInventory"  name="bSOrderSInventory" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
                <li><input type="text" class="input-text" name="bSOrderSUnit" id="d5" required></li>

            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
                <li><input type="text" class="input-text"  id="d4"   ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li><input type="text" class="input-text" id="d7" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;不含税单价</li>
                <li><input type="text" class="input-text"  id="d8" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
                <li>
                    <select class="input-text" name="bSOrderSRoomNo" id="bSOrderSRoomNo" required>
                        <option value="" >选择仓库编号</option>
                        <c:forEach items="${TRoom}" var="TRoom">
                            <option value="${TRoom.tRoomRoomNo}">${TRoom.tRoomRoomNo}(${TRoom.tRoomRoomName})</option>
                        </c:forEach>

                    </select>
                </li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;包装单价</li>
                <li><input type="text" class="input-text"  id="d9"  ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本单价</li>
                <li><input type="text" class="input-text" id="d10" ></li>

            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货箱数</li>
                <li><input type="text" class="input-text" onchange="priceupdate(this.value);"  id="bSOrderSOrdBoxQuantity" name=" bSOrderSOrdBoxQuantity" required value="${bSOrdS.bSOrderSOrdBoxQuantity}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保质期/月</li>
                <li><input type="text" class="input-text" required id="d6" name="bSOrderSExRequest" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实送金额</li>
                <li><input  type="text" class="input-text" id="bSOrderSRealPrice" name="bSOrderSRealPrice" value="${bSOrdS.bSOrderSRealPrice}"  required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货数量</li>
                <li><input type="text" class="input-text"  id="s1" name="bSOrderSOrdQuantity" value="${bSOrdS.bSOrderSOrdQuantity}"  required></li>
                 <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实送箱数</li>
                <li><input type="text" class="input-text"  id="bSOrderSSalesBoxquantity" name="bSOrderSSalesBoxquantity" value="${bSOrdS.bSOrderSSalesBoxquantity}" required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实送数量</li>
                <li><input type="text" class="input-text" id="bSOrderSSalesQuantity" name="bSOrderSSalesQuantity" value="${bSOrdS.bSOrderSSalesQuantity}"  required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售折扣</li>
                <li><input type="text" class="input-text"  id="zhekou"  required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;含税金额</li>
                <li><input type="text" class="input-text"  id="s3"  required></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未含税金额</li>
                <li><input type="text" class="input-text" id="s2"  required></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对账日期</li>
                <li><input type="date" class="input-text"  <%--id="bSOrderSCheckAccountDate" name="bSOrderSCheckAccountDate"--%> required value="${bSOrdS.bSOrderSCheckAccountDate}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;拿支票日期</li>
                <li><input type="date" class="input-text"  <%--id="bSOrderSTakeCheckDate" name="bSOrderSTakeCheckDate"--%> required  value="${bSOrdS.bSOrderSTakeCheckDate}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开票日期</li>
                <li><input type="date" class="input-text" <%--id="bSOrderSInvoiceDate" name="bSOrderSInvoiceDate"--%>  required value="${bSOrdS.bSOrderSInvoiceDate}"></li>
            </ul><br>
            <ul>


                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货金额</li>
                <li><input type="text" class="input-text" id="s4"  name="bSOrderSOrdPrice" required  value="${bSOrdS.bSOrderSOrdPrice}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
                <li><input type="text" class="input-text" readonly="readonly" name="bSOrderSDetailId" value="${detailID}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="width: 220px"><input type="text" class="input-text" id="" name="" ></li>
                <li><input type="hidden" class="input-text" id="d3"  name=""></li>
            </ul><br>

            <br>
            <div style="width: 900px">
                <center>
                    <input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/sale_order/detaileOrder/${bSOrdS.bSOrderSSOrderNo}"  class="btn btn radius">取消</a>
                </center>
            </div>
        </form:form>

        <div class="cl pd-5 bg-1 bk-gray mt-20"><span><button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button></span>&nbsp;&nbsp;&nbsp;&nbsp;<span> <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button></span></div>
        <%--<button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购订单</button>&nbsp;&nbsp;&nbsp;&nbsp;--%>
        <%--<button type="button" id="show" class="btn btn-primary upload-btn">显示采购订单</button>--%>


        <div id="p1">
            <br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货单号</li>
                <li><input id="bSOrderMSOrderNo" name="bSOrderMSOrderNo" type="text" class="input-text"  value="${bSOrderM.bSOrderMSOrderNo}" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
                <li><input class="input-text" name="bSOrderMSalesman" type="text" id="bSOrderMSalesman"  value="${bSOrderM.tStaffByBSOrderMSalesman.tStaffStaffName}" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款</li>
                <li><input id="bSOrderMAdPaymoney" name="bSOrderMAdPaymoney" type="text" class="input-text" value="${bSOrderM.bSOrderMAdPaymoney}" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单人</li>
                <li><input class="input-text" name="bSOrderMCreateNo" type="text"  id="bSOrderMCreateNo" value="${bSOrderM.tStaffByBSOrderMCreateNo.tStaffStaffName}" readonly="readonly"></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户单号</li>
                <li><input type="text" class="input-text" name="bSOrderMOrderNo" id="bSOrderMOrderNo" value="${bSOrderM.bSOrderMOrderNo}" readonly="readonly"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售性质</li>
                <li><input class="input-text" name="bSOrderMSalesTypeNo" id="bSOrderMSalesTypeNo" value="${bSOrderM.salesPropertiesByBSOrderMSalesTypeNo.salesPropertiesSalesPropertiesName}" readonly="readonly" type="text" ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
                <li><input type="text" class="input-text" id="bSOrderMChecker" name="bSOrderMChecker" disabled ></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售折扣</li>
                <li><input type="text" class="input-text" name="bSOrderMSalesDiscount" id="bSOrderMSalesDiscount" value="${bSOrderM.bSOrderMSalesDiscount}" readonly="readonly"></li>


            </ul><br>
            <ul>

                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称</li>
                <li><input class="input-text" name="bSOrderMClientNo" id="bSOrderMClientNo"  value="${bSOrderM.tClientByBSOrderMClientNo.tClientClientName}" readonly="readonly" type="text"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
                <li><input class="input-text" name="bPurchaseOrdSPaymentNo" id="bPurchaseOrdSPaymentNo"  readonly="readonly" type="text"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMSendDate" name="bSOrderMSendDate"   value="${bSOrderM.bSOrderMSendDate}" readonly="readonly" ></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址</li>
                <li><input style="float: left;width: 345px;" class="input-text" name="bSOrderMClientAddress"  id="bSOrderMClientAddress"  value="${bSOrderM.bSOrderMClientAddress}"  readonly="readonly" type="text"></li>
                <li></li>  <li></li>                   <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMCreateDate" name="bSOrderMCreateDate" readonly="readonly" value="${bSOrderM.bSOrderMCreateDate}"></li>

            </ul><br>

            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
                <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bSOrderMNotes" name="bSOrderMNotes" value="${bSOrderM.bSOrderMNotes}" readonly="readonly"></li>
                <li></li> <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订货日期</li>
                <li style="float: left;width: 345px;"><input type="date" class="input-text" id="bSOrderMOrdDate" name="bSOrderMOrdDate" readonly="readonly" value="${bSOrderM.bSOrderMOrdDate}" ></li>
            </ul>
            <br>
        </div>
    </div>
</div>

<!--_footer 作为公共模版分离出去-->
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

