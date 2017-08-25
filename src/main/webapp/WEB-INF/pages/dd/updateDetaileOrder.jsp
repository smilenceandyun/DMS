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


    </script>

    <title>采购管理</title>
</head>
<style>
    .display-none {
        display:none;
    }
</style>
<style type="text/css">
    ul{width:900px; height:20px;  size: 20px; color: rgba(0,0,0,0.5); font-weight: 600; font-size: inherit;}
    li{width:150px; height:20px; float:left;}
</style>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 更新明细 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <%--<div class="text-c">--%>
        <%--<form class="Huiform" method="post" action="" target="_self">--%>
            <%--<input type="text" placeholder="请输入订单号" name="search" id="search" value="" class="input-text" style="width:120px">--%>
            <%--<span class="select-box" style="width:150px">--%>
			<%--<select class="select"  name="brandclass" size="1">--%>
                <%--<option value="" disabled selected  class="display-none">选择厂家</option>--%>
				<%--<option value="1" selected>厂家名称 </option>--%>
				<%--<option value="0">厂家2</option>--%>
			<%--</select>--%>
			<%--</span>--%>
            <%--</span><button type="button" class="btn btn-success" id="" name="" onClick="purSearch()"><i class="Hui-iconfont">&#xe600;</i> 查询</button>--%>
            <%--<span class="btn-upload form-group">--%>
			<%--<input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly style="width:200px">--%>
			<%--<a href="javascript:void(0);" class="btn btn-primary upload-btn"><i class="Hui-iconfont">&#xe642;</i> 上传文件</a>--%>
			<%--<input type="file" multiple name="file-2" class="input-file">--%>
			<%--</span>--%>
            <%--&lt;%&ndash;<button type="button" class="btn btn-success" id="" name="" onClick="picture_colume_add(this);"><i class="Hui-iconfont">&#xe600;</i> 添加</button>&ndash;%&gt;--%>
        <%--</form>--%>
    <%--</div>--%>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"><span class="r">共有数据：<strong>1</strong> 条</span> </div>--%>
    <%--<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datasearch()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 查询</a></span>  </div>--%>
    <div class="mt-20">
        <form:form action="/pur_order/detaileOrder/updateP" method="post" role="form">
                <ul>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单货号</li>
                    <li><input type="text" class="input-text" id="bPurchaseOrdSOrdProcureNo" name="bPurchaseOrdSOrdProcureNo" value="${bPurchaseOrdS.bPurchaseOrdSOrdProcureNo}" readonly="readonly"></li>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
                        <%--<li><input type="text" class="input-text" id="bPurchaseOrdSFactoryGoodsNo"  name="bPurchaseOrdSFactoryGoodsNo" ></li>--%>
                    <li>
                        <select class="input-text" name="bPurchaseOrdSFactoryGoodsNo" id="bPurchaseOrdSFactoryGoodsNo" required>
                            <option value="${bPurchaseOrdS.bPurchaseOrdSFactoryGoodsNo}" selected>${bPurchaseOrdS.bPurchaseOrdSFactoryGoodsNo}(修改前)</option>
                            <c:forEach items="${TFactorys}" var="TFactorys">
                                <option value="${TFactorys.tFactorysFactoryGoodsNo}">${TFactorys.tFactorysFactoryGoodsNo}(${TFactorys.tFactorysFactoryGoodsName})</option>
                            </c:forEach>

                        </select>
                    </li>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赠送性质</li>
                    <li><input type="text" class="input-text" id="bPurchaseOrdSPresentationProperty" name="bPurchaseOrdSPresentationProperty" value="${bPurchaseOrdS.bPurchaseOrdSPresentationProperty}"></li>
                </ul><br>
                <ul>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                        <%--<li><input type="text" class="input-text" readonly="readonly" name="" ></li>--%>
                    <li>

                        <select id="good1" class="input-text" required onchange="goodsChange(this.value);" name="bPurchaseOrdSGoodsNo" required>
                            <option value="${bPurchaseOrdS.bPurchaseOrdSGoodsNo}" selected>${bPurchaseOrdS.bPurchaseOrdSGoodsNo}(修改前)</option>
                            <c:forEach items="${TGoods}" var="TGoods">
                                <option value="${TGoods.tGoodsGoodsNo}">${TGoods.tGoodsGoodsNo}(${TGoods.tGoodsGoodsName})</option>
                            </c:forEach>
                        </select>
                    </li>

                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                    <li><input type="text" class="input-text" required id="guige" readonly="readonly" ></li>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交易原价</li>
                    <li><input type="text" class="input-text" id="bPurchaseOrdSOriginalPrice" name="bPurchaseOrdSOriginalPrice" value="${bPurchaseOrdS.bPurchaseOrdSOriginalPrice}" ></li>
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
                            <option value="${bPurchaseOrdS.bPurchaseOrdSRoomNo}" selected>${bPurchaseOrdS.bPurchaseOrdSRoomNo}(修改前)</option>
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
                            <option value="${bPurchaseOrdS.bPurchaseOrdSPaymentNo}" selected>${bPurchaseOrdS.bPurchaseOrdSPaymentNo}(修改前结算方式编号)</option>
                            <c:forEach items="${TPayment}" var="TPayment">
                                <option value="${TPayment.tPaymentPaymentNo}">${TPayment.tPaymentPaymentName}</option>
                            </c:forEach>

                        </select>
                    </li>
                </ul><br>
                <ul>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生产日期</li>
                    <li><input type="date" class="input-text"  id="bPurchaseOrdSMfg" name="bPurchaseOrdSMfg" value="${bPurchaseOrdS.bPurchaseOrdSMfg}" required></li>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;过期日期</li>
                    <li><input type="date" class="input-text" id="bPurchaseOrdSExp" name="bPurchaseOrdSExp" value="${bPurchaseOrdS.bPurchaseOrdSExp}" required></li>
                    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
                    <li><input type="text" class="input-text" readonly="readonly" name="bPurchaseOrdSDetailId" value="${detailID}"></li>
                        <%--<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>--%>
                        <%--<li style="float: left;width: 650px;"><input type="text" class="input-text" readonly="readonly" name="" value="${detail.}"></li>--%>
                </ul><br>

                <br>
                <center>
                    <input class="btn btn-primary upload-btn" type="submit" name="submit" value="确定修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/pur_order"  class="btn btn radius">取消</a>
                </center>
            </form:form>
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
