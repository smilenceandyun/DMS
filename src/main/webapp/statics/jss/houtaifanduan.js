/*后台页面的前端判断js
*
 */
function test(){
    document.getElementById("select0").style.display= "none";
    document.getElementById("select1").style.display= "block";
}

function checkinput(form) {
    if (form.bPurchaseOrdMOrdProcureNo.value == "") {
        form.bPurchaseOrdMOrdProcureNo.focus();
        layer.msg('您还没有填写“订单货号”');
        return false;
    }

    ////ajax
    // else{
    //     var date = {OrdProcureNo:form.bPurchaseOrdMOrdProcureNo.value};
    //     $.ajax(
    //         {
    //             type: "post",
    //             url: "/pur_order/check",
    //             date: date,
    //             cache: false,
    //             async: false,
    //             //dataType: "json",
    //             success: function (data, textStatus, jqXHR) {
    //                 {
    //                     if ("true" == data.flag) {
    //                         alert("合法！");
    //                         return true;
    //                     } else {
    //                         alert("不合法！错误信息如下：" + data.errorMsg);
    //                         layer.msg('检测到数据库中已有该订单货号，请重新输入');
    //                         return false;
    //                     }
    //                 }
    //             }
    //         });
    //     }

    if (form.select0.value == "") {
        form.select0.focus();
        layer.msg('您还没有选择“业务员”');
        return false;
    }
    if (form.bPurchaseOrdMAdPaymoney.value == "") {
        form.bPurchaseOrdMAdPaymoney.focus();
        layer.msg('您还没有填写“预付款”');
        return false;
    }
}