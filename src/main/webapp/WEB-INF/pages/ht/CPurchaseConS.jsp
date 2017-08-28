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
                    document.getElementById("shangpinmingcheng").value = "";  //商品名称
                    document.getElementById("zongjinli").value = "";  //总经理
                    document.getElementById("shuilv").value = "";  //税率
                    document.getElementById("shangpintiaoma").value = "";  //商品条码
                    document.getElementById("xiangjia").value = "";  //箱价
                    document.getElementById("danjia").value = ""; //单价
                    document.getElementById("shangpinbianma").value = ""; //商品编码
                    document.getElementById("danwei").value = ""; //单位
                    document.getElementById("guigexinghao").value = "";  // 规格型号
                    document.getElementById("hetongshuliang").value = "";  //合同数量
                    break;
                <c:forEach items="${cPurchaseConS}" var="detail">
                case "${detail.cPurchaseConSDetailId}":
                    document.getElementById("shangpinmingcheng").value = "${detail.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsName}";  //商品名称
                    document.getElementById("zongjinli").value = "${detail.cPurchaseConSManagerNo}";  //总经理
//                    document.getElementById("zongjinli").value = "11111111";  //总经理
                    document.getElementById("shuilv").value = "${detail.cPurchaseConSTaxRate}";  //税率
                    document.getElementById("shangpintiaoma").value = "${detail.tGoodsByCPurchaseConSGoodsNo.tGoodsBoxBarcode}";  //商品条码
                    document.getElementById("xiangjia").value = "${detail.cPurchaseConSBoxPrice}";  //箱价
                    document.getElementById("danjia").value = "${detail.cPurchaseConSPrice}"; //单价
                    document.getElementById("shangpinbianma").value = "${detail.cPurchaseConSGoodsNo}"; //商品编码
                    document.getElementById("danwei").value = "${detail.tGoodsByCPurchaseConSGoodsNo.tGoodsUnit}"; //单位
                    document.getElementById("guigexinghao").value = "${detail.tGoodsByCPurchaseConSGoodsNo.tGoodsSPrice}";  // 规格型号
                    document.getElementById("hetongshuliang").value = "${detail.cPurchaseConSConQuantity}";  //合同数量
                    break;
                </c:forEach>
            }
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
                    break;
                <c:forEach items="${Goods}" var="Goods">
                case "${Goods.tGoodsGoodsNo}":
                    document.getElementById("d1").value = "${Goods.tGoodsBoxBarcode}";
                    document.getElementById("d2").value = "${Goods.tGoodsPackQuantity * Goods.tGoodsSPrice}";
                    document.getElementById("d3").value = "${Goods.tGoodsSPrice}";
                    document.getElementById("d4").value = "${Goods.tGoodsGoodsNo}";
                    document.getElementById("d5").value = "${Goods.tGoodsUnit}";
                    document.getElementById("d6").value = "${Goods.tGoodsGoodsSpce}";
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
    ul {
        width:1300px; height:20px; size: 20px;
    }
    li {
        width:125px; height:20px; float:left;
    }
</style>
<body onload="hidediv();hideform();hidefirst();top();">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 采购管理 <span class="c-gray en">&gt;</span> 采购合同 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">

    <div class="cl pd-5 bg-1 bk-gray mt-20"><span><a id="show1" class="btn btn-success radius" onclick="hideform()"  >新增明细</a></span></div>

   <div class="mt-20">
        <c:if test="${empty cPurchaseConS}">
            <table class="table table-border table-bordered table-bg">
                <thead>
                <tr class="text-c">
                    <th width="80">提示</th>
                </tr>
                </thead>
                <tbody>
                <tr class="text-c">
                    <td >没有添加明细，请添加</td>
                        <%--<td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('明细编辑','index2.html','1')" href="/pur_order/detaileOrder/update/${detail.detaileId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> </td>--%>
                        <%--<a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="/pur_order/detaileOrder/delete/${detail.detaileId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>--%>
                </tr>
                </tbody>
            </table>
            <%--<div class="cl pd-5 bg-1 bk-gray mt-20">&nbsp;&nbsp;&nbsp;&nbsp;<span><a href="/addS/${cPurchaseConSPurchasConNo}" class="btn btn-success radius">新增明细</a></span></div>--%>
        </c:if>

<%--========================================================================================================================--%>
<%--添加明细--%>

       <form:form name="detail" id="detail" action="/addSS" method="post" role="form">
           <ul>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
               <li>
                   <select class="input-text" name="" id="good1" onchange="goodsChange(this.value);" required>
                       <option value=""></option>
                       <c:forEach items="${Goods}" var="Goods">
                           <option value="${Goods.tGoodsGoodsNo}">${Goods.tGoodsGoodsName}</option>
                       </c:forEach>
                   </select>
               </li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总经理</li>
               <li>
                   <select class="input-text" name="cPurchaseConSManagerNo" id="cPurchaseConSManagerNo" required >
                       <option value=""></option>
                       <c:forEach items="${Staff}" var="Staff">
                           <option value="${Staff.tStaffStaffNo}">${Staff.tStaffStaffName}</option>
                       </c:forEach>
                   </select>
               </li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
               <li><input type="text" class="input-text" name="cPurchaseConSTaxRate" id="cPurchaseConSTaxRate" required ></li>
           </ul><br>
           <ul>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
               <li><input type="text" class="input-text" name="" id="d1" required></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱价</li>
               <li><input type="text" class="input-text" name="cPurchaseConSBoxPrice" id="d2" required></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单价</li>
               <li><input type="text" class="input-text" name="cPurchaseConSPrice" id="d3" required></li>
           </ul><br>
           <ul>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
               <li><input type="text" class="input-text" name="cPurchaseConSGoodsNo" id="d4" required></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
               <li><input type="text" class="input-text" name="" id="d5" required></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
               <li><input type="text" class="input-text" name="" id="d6" required></li>
           </ul><br>
           <ul>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
               <li><input type="text" class="input-text" name="cPurchaseConSPurchasConNo" readonly ="readonly"  value="${cPurchaseConSPurchasConNo}"></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明细ID</li>
               <li><input type="text" class="input-text" name="cPurchaseConSDetailId" value="${detailId}" readonly ="readonly"></li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同数量</li>
               <li><input type="text" class="input-text" name="cPurchaseConSConQuantity" id="cPurchaseConSConQuantity" required></li>
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
       <br/>

<%--========================================================================================================================--%>
<%--显示明细 --%>

       <c:if test="${!empty cPurchaseConS}">
           <div id="p2">
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="shangpinmingcheng" id='shangpinmingcheng' readonly="readonly"  value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总经理</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="zongjinli" id="zongjinli" readonly="readonly" value="111111111"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;税率</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="shuilv" id="shuilv" readonly="readonly" value=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品条码</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="shangpintiaoma" id="shangpintiaoma" readonly="readonly" value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱价</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="xiangjia" id="xiangjia" readonly="readonly" value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单价</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5"  name="danjia" id="danjia" readonly="readonly" value=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品编码</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="shangpinbianma" id="shangpinbianma" readonly="readonly" value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;单位</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="danwei" id="danwei" readonly="readonly" value=""></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;规格型号</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="guigexinghao" id="guigexinghao" readonly="readonly" value=""></li>
            </ul><br>
            <ul>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="" readonly ="readonly" value="${cPurchaseConSPurchasConNo}"></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同数量</li>
                <li><input type="text" class="input-text" style="background-color: #F5F5F5" name="hetongshuliang" id="hetongshuliang" readonly="readonly" value=""></li>
            </ul><br>
           </div>
       </c:if>

<%--========================================================================================================================--%>
<%--显示采购合同--%>

       <div class="cl pd-5 bg-1 bk-gray mt-20"><span><button type="button" id="show" class="btn btn-primary upload-btn">显示采购合同</button></span>&nbsp;&nbsp;&nbsp;&nbsp;<span> <button type="button" id="hide" class="btn btn-primary upload-btn">隐藏采购合同</button></span></div>
       <div id="p1">
           <br/>
       <ul>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同编号</li>
           <li><input type="text" class="input-text" name="cPurchaseConMPurchasConNo" id="cPurchaseConMPurchasConNo" value="${cPurchaseConM.cPurchaseConMPurchasConNo}" readonly="readonly"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称</li>
           <li><input type="text" class="input-text" name="cPurchaseConMClientNo" id="cPurchaseConMClientNo" value="${cPurchaseConM.tClientByCPurchaseConMClientNo.tClientClientName}" readonly="readonly">
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合同日期</li>
           <li><input type="text" class="input-text" name="cPurchaseConMConDate" id="cPurchaseConMConDate" readonly="readonly" value="${cPurchaseConM.cPurchaseConMConDate}"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人</li>
           <li><input type="text" class="input-text" name="cPurchaseConMChecker" id="cPurchaseConMChecker" readonly="readonly" value="${cPurchaseConM.tStaffByCPurchaseConMChecker.tStaffStaffName}"></li>
       </ul><br>
       <ul>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制单人</li>
           <li><input type="text" class="input-text" name="cPurchaseConMCreateNo" id="cPurchaseConMCreateNo" readonly="readonly" value="${cPurchaseConM.tStaffByCPurchaseConMCreateNo.tStaffStaffName}"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结算方式</li>
           <li><input type="text" class="input-text" name="cPurchaseConMGrossMode" id="cPurchaseConMGrossMode" readonly="readonly" value="${cPurchaseConM.cPurchaseConMGrossMode}"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业务员</li>
           <li><input type="text" class="input-text" name="cPurchaseConMSalesman" id="cPurchaseConMSalesman" readonly="readonly" value="${cPurchaseConM.tStaffByCPurchaseConMSalesman.tStaffStaffName}"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;厂家编码</li>
           <li><input type="text" class="input-text" name="cPurchaseConMFactoryGoodsNo" id="cPurchaseConMFactoryGoodsNo" readonly="readonly" value="${cPurchaseConM.tFactorysByCPurchaseConMFactoryGoodsNo.tFactorysFactoryGoodsNo}(${cPurchaseConM.tFactorysByCPurchaseConMFactoryGoodsNo.tFactorysFactoryGoodsName})"></li>
       </ul><br>
       <ul>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注</li>
           <li ><input type="text" class="input-text" name="cPurchaseConMNotes" id="cPurchaseConMNotes" style="width: 378px" readonly="readonly" value="${cPurchaseConM.cPurchaseConMNotes}"></li>
           <li></li><li></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户业务员</li>
           <li><input type="text" class="input-text" name="cPurchaseConMCustomerSalesmanName" id="cPurchaseConMCustomerSalesmanName" readonly="readonly" value="${cPurchaseConM.cPurchaseConMCustomerSalesmanName}"></li>
           <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有效期</li>
           <li><input type="text" class="input-text" name="cPurchaseConMValidity" id="cPurchaseConMValidity" readonly="readonly" value="${cPurchaseConM.cPurchaseConMValidity}"></li>
       </ul>
       <br>
       </div>

<%--========================================================================================================================--%>
       <c:if test="${!empty cPurchaseConS}">
       <%--<div class="cl pd-5 mt-20 bg-1 bk-gray" style="height:32px;"> <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><span class="l"><a href="" class="btn btn-success radius">保存</a></span><span class="l">&nbsp;&nbsp;&nbsp;<a href="/addS/${cPurchaseConSPurchasConNo}" class="btn btn-success radius">新增明细</a></span></c:if></div>--%>
            <br>
            <table class="table table-border table-bordered table-bg table-sort">
                <thead>
                <tr class="text-c">
                    <th width="25">选择</th>
                    <th width="30">ID</th>
                    <th width="80">商品名称</th>
                    <th width="80">规格型号</th>
                    <th width="80">单位</th>
                    <th width="80">税率</th>
                    <th width="80">单价</th>
                    <th width="80">箱价</th>
                    <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><th width="40">操作</th></c:if>
                </tr>
                </thead>
                <tbody>
                <%
                    int i = 1;
                %>
                <c:forEach items="${cPurchaseConS}" var="cPurchaseConS">
                    <tr class="text-c">
                        <td><input name="id" type="checkbox"></td>
                        <td><%=i %><% i++; %></td>
                        <td><a href="#top" onclick="showdetail('${cPurchaseConS.cPurchaseConSDetailId}');$('#detail').hide(300);$('#p2').show(300);">${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsName}</a></td>
                        <%--<td><a href="/detail2/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}">${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsName}</a></td>--%>
                        <td>${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsGoodsSpce}</td>
                        <td>${cPurchaseConS.cPurchaseConSTaxRate}</td>
                        <td>${cPurchaseConS.tGoodsByCPurchaseConSGoodsNo.tGoodsUnit}</td>
                        <td>${cPurchaseConS.cPurchaseConSPrice}</td>
                        <td>${cPurchaseConS.cPurchaseConSBoxPrice}</td>
                        <c:if test="${cPurchaseConM.cPurchaseConMState == \"0\"}"><td class="f-14 product-brand-manage"><a style="text-decoration:none" onClick="product_brand_edit('订单编辑','index2.html','1')" href="/updateS/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onclick="if(!confirm('确定删除？')) return false;" href="/deleteS/${cPurchaseConS.cPurchaseConSPurchasConNo} & ${cPurchaseConS.cPurchaseConSDetailId}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td></c:if>
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
