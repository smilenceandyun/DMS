package com.dms.controller.sale.dh.dh;

import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.sale.BSOrderMRepository;
import com.dms.repository.sale.BSOrderSRepository;
import com.dms.service.informationbase.*;
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
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.dms.controller.pur.rk.ProcureController.string2Date;

@Controller
public class DhController {


    static GetOrderNumber g;
    final
    BSOrderMRepository bsOrderMRepository;//销售订货

    final
    BSOrderSRepository bsOrderSRepository;//销售订货明细
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
    public DhController(BSOrderMRepository bsOrderMRepository, BSOrderSRepository bsOrderSRepository, TStaffRepository tStaffRepository, TClientRepository tClientRepository, TFactorysRepository tFactorysRepository, TGoodsRepository tGoodsRepository, TRoomRepository tRoomRepository, TPaymentRepository tPaymentRepository, SalesPropertiesRepository salesPropertiesRepository) {
        this.bsOrderMRepository = bsOrderMRepository;
        this.bsOrderSRepository = bsOrderSRepository;
        this.tStaffRepository = tStaffRepository;
        this.tClientRepository = tClientRepository;
        this.tFactorysRepository = tFactorysRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tRoomRepository = tRoomRepository;
        this.salesPropertiesRepository = salesPropertiesRepository;
        this.tPaymentRepository = tPaymentRepository;
        g = new GetOrderNumber("DH");
    }

    //intivhv
    @RequestMapping(value = "/sale_order", method = RequestMethod.GET)
    public String showAllMes(ModelMap modelMap) {
        // 查询 销售订货(BSOrderMEntity) 表中所有记录
        List<BSOrderMEntity> bsOrderMEntityList = bsOrderMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("bSOrder", bsOrderMEntityList);
        // 返回sale目录下的s_order.jsp页面
        return "/sale/dh/xs_orders";
    }

    @Autowired
    private TStaffCacheService tStaffCacheService;
    @Autowired
    private TClientCacheService tClientCacheService;
    @Autowired
    private TPaymentCacheService tPaymentCacheService;
    @Autowired
    private TRoomCacheService tRoomCacheService;
    @Autowired
    private TFactorysCacheService tFactorysCacheService;
    @Autowired
    private TGoodsCacheService tGoodsCacheService;
    @Autowired
    private TOrgCacheService tOrgCacheService;
    @Autowired
    private SalesPorpertiesCacheService salesPorpertiesCacheService;

    @RequestMapping(value = "/sale_order/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<SalesPropertiesEntity> SalesProperties = salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        List<TPaymentEntity> Payment = tPaymentCacheService.findAll(tPaymentRepository);

        String UUID = g.getOrderNo();

        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("SalesProperties", SalesProperties);
        modelMap.addAttribute("Payment", Payment);

        // 转到addOrder.jsp页面
        return "/sale/dh/adds_orders";
    }

    @RequestMapping(value = "/sale_order/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(HttpServletRequest request) {

        BSOrderMEntity bSOrderMEntity = new BSOrderMEntity();

        bSOrderMEntity.setbSOrderMSOrderNo(request.getParameter("bSOrderMSOrderNo"));
        bSOrderMEntity.setbSOrderMSalesman(request.getParameter("bSOrderMSalesman"));
        bSOrderMEntity.setbSOrderMAdPaymoney(new BigDecimal(request.getParameter("bSOrderMAdPaymoney")));
        bSOrderMEntity.setbSOrderMCreateNo(request.getParameter("bSOrderMCreateNo"));

        bSOrderMEntity.setbSOrderMOrderNo(request.getParameter("bSOrderMOrderNo"));
        bSOrderMEntity.setbSOrderMSalesTypeNo(request.getParameter("bSOrderMSalesTypeNo"));
        bSOrderMEntity.setbSOrderMChecker(request.getParameter("bSOrderMChecker"));
        bSOrderMEntity.setbSOrderMSalesDiscount(new BigDecimal(request.getParameter("bSOrderMSalesDiscount")));

        bSOrderMEntity.setbSOrderMClientNo(request.getParameter("bSOrderMClientNo"));
        try {
            bSOrderMEntity.setbSOrderMSendDate(new Timestamp(string2Date(request.getParameter("bSOrderMSendDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bSOrderMEntity.setbSOrderMClientAddress(request.getParameter("bSOrderMClientAddress"));
        //bSOrderMEntity.setbSOrderMSOrderNo(request.getParameter("bSOrderMSOrderNo"));//缺少结算方式
        try {
            bSOrderMEntity.setbSOrderMCreateDate(new Timestamp(string2Date(request.getParameter("bSOrderMCreateDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        bSOrderMEntity.setbSOrderMNotes(request.getParameter("bSOrderMNotes"));
        try {
            bSOrderMEntity.setbSOrderMOrdDate(new Timestamp(string2Date(request.getParameter("bSOrderMOrdDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bSOrderMEntity.setbSOrderMState("0");
        bSOrderMEntity.setbSOrderMGroupNodeId("01");

        // 数据库中添加一个订货单，并立即刷新缓存
        bsOrderMRepository.saveAndFlush(bSOrderMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/sale_order/detaileOrder/add/" + bSOrderMEntity.getbSOrderMSOrderNo();
    }
    // get请求，访问添加 页面

    @RequestMapping(value = "/sale_order/detaileOrder/add/{id}", method = RequestMethod.GET)
    public String addBPurchaseOrdSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        Integer detailId = (bsOrderSRepository.findMaxDetailId(Id));

        if (detailId == null) {
            detailId = 1;
        } else {
            detailId += 1;
        }
        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findBSOrderMEntityByBSOrderMSOrderNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);

        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = g.getOrderNo();

        modelMap.addAttribute("bsOrderM", bsOrderMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);

        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("orderS", Id);
        // 转到addOrder.jsp页面
        return "/sale/dh/adddetaile_orders";
    }

    // 更新用户信息 页面
    @RequestMapping(value = "/updateMa/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public String updatebSOrderM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo, ModelMap modelMap) {

        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findOne(bSOrderMSOrderNo);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TPaymentEntity> Payment = tPaymentCacheService.findAll(tPaymentRepository);//获取付款信息
        List<SalesPropertiesEntity> SalesProperties = salesPorpertiesCacheService.findAll(salesPropertiesRepository);

        // 传递给请求页面
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("Payment", Payment);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("SalesProperties", SalesProperties);
        return "/sale/dh/update_orders";
    }

    // 删除订货单
    @RequestMapping(value = "/sale_order/delete/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public String deleteMM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo) {
        bsOrderMRepository.delete(bSOrderMSOrderNo);
        bsOrderMRepository.flush();
        return "redirect:/sale_order";
    }
    // 更新销售订货 信息操作
    // 更新用户信息  操作
    @RequestMapping(value = "/updateMSa", method = RequestMethod.POST)
    public String updateOrder(BSOrderMEntity bsOrderMEntity) {
        BSOrderMEntity c = bsOrderMRepository.findOne(bsOrderMEntity.getbSOrderMSOrderNo());
        bsOrderMEntity.setbSOrderMState(c.getbSOrderMState());
        bsOrderMEntity.setbSOrderMGroupNodeId("01");
        try {
            bsOrderMEntity.setbSOrderMSendDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMSendDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderMEntity.setbSOrderMOrdDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMOrdDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderMEntity.setbSOrderMCreateDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMCreateDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bsOrderMRepository.saveAndFlush(bsOrderMEntity);
        return "redirect:/sale_order";
    }

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

    @RequestMapping(value = "/sale_order/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(BSOrderSEntity bsOrderSEntity) {
        bsOrderSEntity.setbSOrderSMfg("2016");
        bsOrderSEntity.setbSOrderSGroupNodeId("01");
        try {
            bsOrderSEntity.setbSOrderSInvoiceDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSInvoiceDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
           bsOrderSEntity.setbSOrderSTakeCheckDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSTakeCheckDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderSEntity.setbSOrderSCheckAccountDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSCheckAccountDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 数据库中添加一个用户，并立即刷新缓存
        bsOrderSRepository.saveAndFlush(bsOrderSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/sale_order/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }

    @RequestMapping(value = "/sale_order/detaileOrder/{id}", method = RequestMethod.GET)
    public String showBSOrderSEntity(@PathVariable("id") String Id, ModelMap modelMap) {
        List<BSOrderSEntity> bSOrderSEntity = bsOrderSRepository.findBSOrderSEntitiesByBSOrderSSOrderNoEquals(Id);
        Integer detailId = (bsOrderSRepository.findMaxDetailId(Id));
        if (detailId == null) {
            detailId = 1;
        } else {
            detailId += 1;
        }
        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findBSOrderMEntityByBSOrderMSOrderNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<SalesPropertiesEntity> SaleProperries = salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = g.getOrderNo();

        // 传递给请求页面
        modelMap.addAttribute("bsOrderM", bsOrderMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("SaleProperries", SaleProperries);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bSOrderS", bSOrderSEntity);
        modelMap.addAttribute("ordOrderNo", Id);

        return "/sale/dh/detaieOrder";
    }

    // 删除一条明细
    @RequestMapping(value = "/sale_order/detaileOrder/delete/{detailID}&{id}", method = RequestMethod.GET)
    public void deleteBPurchaseOrdSEntity(@PathVariable("detailID") Integer detailID, @PathVariable("id") String Id, HttpServletResponse response) {

        // 删除id为Id的用户
        bsOrderSRepository.deleteBSOrderSEntity(Id, detailID);
        // 立即刷新
        bsOrderSRepository.flush();

        try {
            response.sendRedirect("/sale_order/detaileOrder/" + Id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 删除所有明细
    @RequestMapping(value = "/sale_order/detaileOrder/deleteall/{id}", method = RequestMethod.GET)
    public String deleteALLBSOrdSEntity(@PathVariable("id") String Id) {

        // 删除id为Id的用户
       bsOrderSRepository.deleteAllBSOrderSEntity(Id);
        // 立即刷新
       bsOrderSRepository.flush();
        return "redirect:/pur_order/detaileOrder/" + Id;
    }
    // 更新明细信息 页面
    @RequestMapping(value = "/sale_order/detaileOrder/update/{detailID}&{id}", method = RequestMethod.GET)
    public String updateBSOrdSEntity(@PathVariable("detailID") Integer detailID,@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findBSOrderMEntityByBSOrderMSOrderNoEquals(id);
        BSOrderSEntity bsOrderSEntity = bsOrderSRepository.findBSOrderSEntitiesByBSOrderSSOrderNoAndBSOrderSDetailIdEquals(id,detailID);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);

        // 传递给请求页面
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailID", detailID);
        modelMap.addAttribute("bSOrdS", bsOrderSEntity);
        return "/sale/dh/update_detaileOrder";
    }
    // 更新明细信息 操作
    @RequestMapping(value = "/sale_order/detaileOrder/updateP", method = RequestMethod.POST)
    public String updateBPurchaseOrdSEntityPost(BSOrderSEntity bsOrderSEntity) {
        BSOrderSEntity c = bsOrderSRepository.findBSOrderSEntitiesByBSOrderSSOrderNoAndBSOrderSDetailIdEquals(bsOrderSEntity.getbSOrderSSOrderNo(),bsOrderSEntity.getbSOrderSDetailId());
        bsOrderSEntity.setbSOrderSGroupNodeId(c.getbSOrderSGroupNodeId());
       bsOrderSEntity.setbSOrderSMfg(c.getbSOrderSMfg());
        try {
            bsOrderSEntity.setbSOrderSInvoiceDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSInvoiceDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderSEntity.setbSOrderSTakeCheckDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSTakeCheckDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderSEntity.setbSOrderSCheckAccountDate(new Timestamp(string2Date(bsOrderSEntity.getbSOrderSCheckAccountDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bsOrderSRepository.saveAndFlush(bsOrderSEntity); // 刷新缓冲区
        return "redirect:/sale_order/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }



    @InitBinder
    public void InitBinder(HttpServletRequest request,
                           ServletRequestDataBinder binder) {
        // 不要删除下行注释!!! 将来"yyyy-MM-dd"将配置到properties文件中
        // SimpleDateFormat dateFormat = new
        // SimpleDateFormat(getText("date.format", request.getLocale()));
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, null, new CustomDateEditor(
                dateFormat, true));
    }
}
