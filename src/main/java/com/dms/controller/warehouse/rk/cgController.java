package com.dms.controller.warehouse.rk;

import com.dms.model.BSOrderMEntity;
import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class cgController {


    static GetOrderNumber a;


    public cgController() {

        a = new GetOrderNumber("RK");
    }

    @RequestMapping(value = "/pur_in", method = RequestMethod.GET)
    public String showAlls(/*ModelMap modelMap*/) {

        return "/warehouse/rk/cg_orders";
    }
    @RequestMapping(value = "/pur_in/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {

        return "/warehouse/rk/cg_add_orders";
    }

    @RequestMapping(value = "/pur_in/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(HttpServletRequest request) {

        return "/warehouse/rk/cg_add_detaile";

    }
    // 更新用户信息 页面
    @RequestMapping(value = "/updateMin", method = RequestMethod.GET)
    public String updatebSOrderM() {
        return "/warehouse/rk/cg_update_order";
    }
    @RequestMapping(value = "/updateMcg", method = RequestMethod.POST)
    public String updateOrder() {

        return "redirect:/pur_in";
    }
    @RequestMapping(value = "/pur_in/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(/*BSOrderSEntity bsOrderSEntity*/) {
        return "/warehouse/rk/cg_detaileOrder";
        // 重定向到用户管理页面，方法为 redirect:url
        // return "redirect:/sale_xs/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }
    // 更新明细信息 页面吖
    @RequestMapping(value = "/pur_in/detaileOrder/update", method = RequestMethod.GET)
    public String updateBSOrdSEntity() {

        return "/warehouse/rk/cg_update_detaile";
    }
    @RequestMapping(value = "/pur_in/detaileOrder", method = RequestMethod.GET)
    public String showBSOrderSEntity() {

        return "/warehouse/rk/cg_detaileOrder";
    }
}
