package com.dms.controller.warehouse.rk;

import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class jyController {


    static GetOrderNumber e;


    public jyController() {

        e = new GetOrderNumber("JY");
    }

    @RequestMapping(value = "/pur_injy", method = RequestMethod.GET)
    public String showAlls(/*ModelMap modelMap*/) {
        // 查询 销售订货(BSOrderMEntity) 表中所有记录
        // List<BSOrderMEntity> bsOrderMEntityList = bsOrderMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        //modelMap.addAttribute("bSOrder", bsOrderMEntityList);
        // 返回sale目录下的s_order.jsp页面
        return "/warehouse/rk/jy_orders";
    }
    @RequestMapping(value = "/pur_injy/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {

        return "/warehouse/rk/jy_add_orders";
    }

    @RequestMapping(value = "/pur_injy/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(HttpServletRequest request) {

        return "/warehouse/rk/jy_add_detaile";

    }
    // 更新用户信息 页面
    @RequestMapping(value = "/updateMjyin", method = RequestMethod.GET)
    public String updatebSOrderM()
    {
        return "/warehouse/rk/jy_update_order";
    }
    @RequestMapping(value = "/updateMjy", method = RequestMethod.POST)
    public String updateOrder() {

        return "redirect:/pur_injy";
    }
    @RequestMapping(value = "/pur_injy/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(/*BSOrderSEntity bsOrderSEntity*/) {
        return "/warehouse/rk/jy_detaileOrder";
        // 重定向到用户管理页面，方法为 redirect:url
        // return "redirect:/sale_xs/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }
    // 更新明细信息 页面吖
    @RequestMapping(value = "/pur_injy/detaileOrder/update", method = RequestMethod.GET)
    public String updateBSOrdSEntity() {

        return "/warehouse/rk/jy_update_detaile";
    }
    @RequestMapping(value = "/pur_injy/detaileOrder", method = RequestMethod.GET)
    public String showBSOrderSEntity() {

        return "/warehouse/rk/jy_detaileOrder";
    }
}
