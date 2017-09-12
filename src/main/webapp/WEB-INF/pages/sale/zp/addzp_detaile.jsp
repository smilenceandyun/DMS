<%--
  Created by IntelliJ IDEA.
  User: Krystal_wy
  Date: 2017/9/7
  Time: 12:00
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
                    document.getElementById("d1").value = "";
                    document.getElementById("d2").value = "";
                    document.getElementById("d3").value = "";
                    document.getElementById("d4").value = "";


                    break;
                <c:forEach items="${TGoods}" var="TGoods">
                case "${TGoods.tGoodsGoodsNo}":
                    document.getElementById("d1").value = "${TGoods.tGoodsGoodsSpce}";
                    document.getElementById("d2").value = "${TGoods.tGoodsBarcode}";
                    document.getElementById("d3").value = "${TGoods.tGoodsInTax}";
                    document.getElementById("d4").value = "${TGoods.tGoodsGoodsName}";
                    break;
                </c:forEach>
            }
        }

        /*function price(id) {

            document.getElementById("s1").value =document.getElementById("bSOrderSOrdBoxQuantity").value * document.getElementById("d3").value;
            document.getElementById("s2").value = (document.getElementById("d8").value * document.getElementById("s1").value);
            document.getElementById("s3").value =(document.getElementById("d8").value * document.getElementById("s1").value)*(1+document.getElementById("d7").value);
            document.getElementById("s4").value = document.getElementById("s1").value * document.getElementById("d9").value;


        }*/

        function hidediv(){
            $(document).ready(function(){
                $("#hide").click(function(){
                    $("#p1").hide(500);
                });
                $("#show").click(function(){
                    $("#p1").show(500);
                });
            });
        }

    </script>

    <title>采购入库</title>
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
<body onload="hidediv()">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 销售管理 <span class="c-gray en">&gt;</span> 赠品出库新增明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">

    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel1()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>1</strong> 条</span> </div>--%>
    <%--&lt;%&ndash;<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>&ndash;%&gt;--%>
    <%--<div class="mt-20">--%>
    <form:form id="detail" name="detail" action="/zp_order/detaileOrder/addP" method="post" role="form" >

        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出库单号</li>
            <li><input type="text" class="input-text" name="bOutPresentSOutPresentNo"  id="bOutPresentSOutPresentNo" readonly ="readonly"  value="${OutP}"></li>

            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本数量</li>
            <li><input type="text" class="input-text" id="bOutPresentSBasicQuantity" name="bOutPresentSBasicQuantity" ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
            <li><input type="text" class="input-text" required id="d1"   name="b"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
            <li>
                <select id="good1" class="input-text"  onchange="goodsChange(this.value);" name="bOutPresentSGoodsNo" required>
                    <option value="" selected>选择商品编号</option>
                    <c:forEach items="${TGoods}" var="TGoods">
                        <option value="${TGoods.tGoodsGoodsNo}">${TGoods.tGoodsGoodsNo}(${TGoods.tGoodsGoodsName})</option>
                    </c:forEach>
                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户内码</li>
            <li>
                <select class="input-text" id="bPurchaseOrdSFactoryGoodsNo" >
                    <option value="" >选择客户编码</option>
                    <c:forEach items="${Client}" var="Client">
                        <option value="${Client.tClientClientNo}">${Client.tClientClientNo}(${Client.tClientClientName})</option>
                    </c:forEach>
                </select>
            </li>

            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批次</li>
            <li><input type="text" class="input-text" id="bOutPresentSLot"  name="bOutPresentSLot" required></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
            <li><input type="text" class="input-text"  id="d2"   disabled></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库</li>
            <li><input type="text" class="input-text"  id="bSOrventory"  name="bSOrventory" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
            <li><input type="text" class="input-text" id="d3" required></li>

        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
            <li><input type="text" class="input-text"  id="d4"   ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
            <li><input type="date" class="input-text" id="bOutPresentSMfg" name="bOutPresentSMfg"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到期日期</li>
            <li><input type="date" class="input-text"  id="bOutPresentSExp" name="bOutPresentSExp"></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主商品编号</li>
            <li>
                <select class="input-text" name="bOutPresentSMainGoodsNo" id="bOutPresentSMainGoodsNo" required>
                    <option value="" >选择仓库编号</option>
                    <c:forEach items="${TGoods}" var="TGoods">
                        <option value="${TGoods.tGoodsGoodsNo}">${TGoods.tGoodsGoodsNo}(${TGoods.tGoodsGoodsName})</option>
                    </c:forEach>

                </select>
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;包装数量</li>
            <li><input type="text" class="input-text"  id="bOutPresentSPackNum" name="bOutPresentSPackNum" ></li>
          <%--  <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本单价</li>
            <li><input type="text" class="input-text" id="d10" ></li>--%>

        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对账日期</li>
            <li><input type="date" class="input-text"  id=" bSOrderSCheckAccountDate" name=" bSOrd" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;拿支票日期</li>
            <li><input type="date" class="input-text"  id="bSOrderSTakeCheckDate" name="keCheckDate" required></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开票日期</li>
            <li><input type="date" class="input-text" id="bSOrderSInvoiceDate" name="biceDate"  required></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
            <li><input type="text" class="input-text" readonly="readonly" name="bOutPresentSDetailId" value="${detailId}"></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
            <li style="width: 220px"><input type="text" class="input-text" id="bOutPresentSNotes" name="bOutPresentSNotes" ></li>
        </ul><br>

        <br>
        <center>
            <input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/zp_order"  class="btn btn radius">取消</a>
        </center>
    </form:form>
    <br>

    <%--//======================================================================================================================================================--%>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏订货单</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" id="show" class="btn btn-primary upload-btn">显示订货单</button>


    <div id="p1">
        <br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠品出库单号</li>
            <li><input id="bOutPresentMOutPresentNo" name="bOutPresentMOutPresentNo" type="text" class="input-text"  value="${bOutPresentM.bOutPresentMOutPresentNo}" readonly="readonly" ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
            <li>
                <input class="input-text" name=""  id="67" required readonly="readonly" >
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;送货员</li>
            <li>
                <input class="input-text" name="bOutPresentMDeliverymanNo" id="bOutPresentMDeliverymanNo"value="${bOutPresentM.deliverymanByBOutPresentMDeliverymanNo.deliverymanDeliverymanName}" readonly="readonly">
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单人</li>
            <li><input class="input-text" name="bOutPresentMCreateNo"  id="bOutPresentMCreateNo" value="${bOutPresentM.tStaffByBOutPresentMCreateNo.tStaffStaffName}" readonly="readonly">
            </li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售订单号</li>
            <li><input type="text" class="input-text" name="bOutPresentMSOrderNo" id="bOutPresentMSOrderNo" value="${bOutPresentM.bOutPresentMSOrderNo}" readonly="readonly"  ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称</li>
            <li>
                <input class="input-text" name="" id="678" readonly="readonly"  >
            </li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓管员</li>
            <li><input type="text" class="input-text" name=" bOutPresentMWarehouseKeeper" id=" bOutPresentMWarehouseKeeper" value="${bOutPresentM.tStaffByBOutPresentMWarehouseKeeper.tStaffStaffName}" readonly="readonly"  ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
            <li><input type="text" class="input-text" id="bOutPresentMChecker" name="bOutPresentMChecker" disabled ></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务日期</li>
            <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bOutPresentMServiceDate" name="bOutPresentMServiceDate" value="${bOutPresentM.bOutPresentMServiceDate}" readonly="readonly" ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;仓库出库日期</li>
            <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bOutPresentMRoomOutDate" name="bOutPresentMRoomOutDate" value="${bOutPresentM.bOutPresentMRoomOutDate}" readonly="readonly" ></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址</li>
            <li>
                <input style="float: left;width: 390px;" class="input-text" name=""  id="45" readonly="readonly" >
            </li>

            <li></li>    <li></li>                 <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单日期</li>
            <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bOutPresentMCreateDate" name="bOutPresentMCreateDate" value="${bOutPresentM.bOutPresentMCreateDate}" readonly="readonly" ></li>
        </ul><br>
        <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
            <li style="float: left;width: 390px;"><input type="text" class="input-text" id="bOutPresentMNotes" name="bOutPresentMNotes" value="${bOutPresentM.bOutPresentMNotes}" readonly="readonly" ></li>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回单日期</li>
            <li style="float: left;width: 345px;"><input type="text" class="input-text" id="bOutPresentMDeliveryDate" name="bOutPresentMDeliveryDate" value="${bOutPresentM.bOutPresentMDeliveryDate}" readonly="readonly" ></li>
        </ul>
    </div>
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
<script type="text/javascript" src="../../../statics/jss/houtaifanduan.js"></script>
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

