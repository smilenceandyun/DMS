package com.dms.controller.sale.dh.xsd;

import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.sale.BSOrderMRepository;
import com.dms.repository.sale.BSOrderSRepository;
import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
@Controller
public class XsdController {
    static GetOrderNumber d;
    final
    TStaffRepository tStaffRepository;

    final
    TClientRepository tClientRepository;

    final
    SalesPropertiesRepository salesPropertiesRepository;
    final
    TFactorysRepository tFactorysRepository;

    final
    TGoodsRepository tGoodsRepository;

    final
    TRoomRepository tRoomRepository;

    final
    TPaymentRepository tPaymentRepository;

    @Autowired
    public XsdController ( TStaffRepository tStaffRepository, TClientRepository tClientRepository, TFactorysRepository tFactorysRepository, TGoodsRepository tGoodsRepository, TRoomRepository tRoomRepository, TPaymentRepository tPaymentRepository, SalesPropertiesRepository salesPropertiesRepository) {

        this.tStaffRepository = tStaffRepository;
        this.tClientRepository = tClientRepository;
        this.tFactorysRepository = tFactorysRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tRoomRepository = tRoomRepository;
        this.salesPropertiesRepository = salesPropertiesRepository;
        this.tPaymentRepository = tPaymentRepository;
        d = new GetOrderNumber("XSD");
    }
    @RequestMapping(value = "/sale_xs", method = RequestMethod.GET)
    public String showAllMes(ModelMap modelMap) {
        /*// 查询 销售订货(BSOrderMEntity) 表中所有记录
        List<BSOrderMEntity> bsOrderMEntityList = bsOrderMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("bSOrder", bsOrderMEntityList);*/
        // 返回sale目录下的s_order.jsp页面
        return "/sale/xsd/xsd_orders";
    }
    @RequestMapping(value = "/sale_xs/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {

        return "/sale/xsd/adds_orders_xs";
    }

    @RequestMapping(value = "/sale_xs/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(HttpServletRequest request) {

        return "/sale/xsd/add_detaile_xsd";
        //return "redirect:/sale_xs/detaileOrder/add/" + bSOrderMEntity.getbSOrderMSOrderNo();
    }
    // get请求，访问添加 页面

   /* @RequestMapping(value = "/sale_xs/detaileOrder/add/{id}", method = RequestMethod.GET)
    public String addBPurchaseOrdSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        return "/sale/xsd/add_detaile_xsd";
    }*/

    // 更新用户信息 页面
  /*  @RequestMapping(value = "/updateMa/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public String updatebSOrderM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo, ModelMap modelMap) {


        return "/sale/xsd/update_orders_xs";
    }*/

    // 删除订货单
   /* @RequestMapping(value = "/sale_xs/delete/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public String deleteMM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo) {

        return "redirect:/sale_xs";
    }*/
    // 更新销售订货 信息操作
    // 更新用户信息 操作
/*    @RequestMapping(value = "/updateMSa", method = RequestMethod.POST)
    public String updateOrder(BSOrderMEntity bsOrderMEntity) {

        return "redirect:/sale_xs";
    }*/

    /**
     * method 将字符串类型的日期转换为一个Date（java.sql.Date）
     * dateString 需要转换为Date的字符串
     * dataTime Date
     */
    public final static java.sql.Date string2Date(String dateString)
            throws java.lang.Exception {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        dateFormat.setLenient(false);
        java.util.Date timeDate = dateFormat.parse(dateString);//util类型
        java.sql.Date dateTime = new java.sql.Date(timeDate.getTime());//sql类型
        return dateTime;
    }

    @RequestMapping(value = "/sale_xs/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(/*BSOrderSEntity bsOrderSEntity*/) {
        return "/sale/xsd/detaieOrder_xs";
        // 重定向到用户管理页面，方法为 redirect:url
       // return "redirect:/sale_xs/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }

/*    @RequestMapping(value = "/sale_xs/detaileOrder/{id}", method = RequestMethod.GET)
    public String showBSOrderSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        return "/sale/xsd/detaieOrder_xs";
    }*/


    // 更新明细信息 页面吖
 /*   @RequestMapping(value = "/sale_xs/detaileOrder/update/{detailID}&{id}", method = RequestMethod.GET)
    public String updateBSOrdSEntity(@PathVariable("detailID") Integer detailID,@PathVariable("id") String id, ModelMap modelMap) {


        return "/sale/xsd/update_detaile_Order";
    }*/
   /* // 更新明细信息 操作
    @RequestMapping(value = "/sale_xs/detaileOrder/updateP", method = RequestMethod.POST)
    public String updateBPurchaseOrdSEntityPost(BSOrderSEntity bsOrderSEntity) {

        return "redirect:/sale_xs/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }

*/

}


