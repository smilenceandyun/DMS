package com.dms.controller.sale.dh;

import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.sale.BSOrderMRepository;
import com.dms.repository.sale.BSOrderSRepository;
import com.dms.service.informationbase.*;
import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        g = new GetOrderNumber("O");
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
        List<SalesPropertiesEntity> SalesProperties= salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        List<TPaymentEntity> Payment=tPaymentCacheService.findAll(tPaymentRepository);

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
    // 更新用户信息 页面
    @RequestMapping(value = "/updateMa/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public String updatebSOrderM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo, ModelMap modelMap) {

        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findOne(bSOrderMSOrderNo);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client =tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TPaymentEntity> Payment = tPaymentCacheService.findAll(tPaymentRepository);//获取付款信息
        List<SalesPropertiesEntity> SalesProperties=salesPorpertiesCacheService.findAll(salesPropertiesRepository);

        // 传递给请求页面
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("Payment", Payment);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("SalesProperties",SalesProperties);
        return "/sale/dh/update_orders";
    }
    // 删除订货单
    @RequestMapping(value = "/sale_order/delete/{bSOrderMSOrderNo}", method = RequestMethod.GET)
    public  String deleteMM(@PathVariable("bSOrderMSOrderNo") String bSOrderMSOrderNo)
    {
        bsOrderMRepository.delete(bSOrderMSOrderNo);
        bsOrderSRepository.deleteALLBybSOrderMSOrderNoEquals(bSOrderMSOrderNo);
        return "redirect:/sale_order";
    }
    // 更新销售订货 信息操作
    @RequestMapping(value = "/updateMSa", method = RequestMethod.POST)
    public String updatebSOrderMPost(BSOrderMEntity bsOrderMEntity) {
        try {
            bsOrderMEntity.setbSOrderMSendDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMSendDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderMEntity.setbSOrderMCreateDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMCreateDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bsOrderMEntity.setbSOrderMOrdDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMOrdDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        BSOrderMEntity c=bsOrderMRepository.findOne(bsOrderMEntity.getbSOrderMSOrderNo());
        bsOrderMEntity.setbSOrderMState(c.getbSOrderMState());
        bsOrderMEntity.setbSOrderMGroupNodeId("01");
        bsOrderMRepository.saveAndFlush(bsOrderMEntity);
        return "redirect:/sale_order";
    }
    /**
     *method 将字符串类型的日期转换为一个Date（java.sql.Date）
     dateString 需要转换为Date的字符串
     dataTime Date
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
        return "redirect: /detaileOrder/addS/"+bSOrderMEntity.getbSOrderMSOrderNo();
    }

    // get请求，访问添加 页面

    @RequestMapping(value = "/detaileOrder/addS/{bSOrderSSOrderNo}", method = RequestMethod.GET)
    public String addBSOrderMS(@PathVariable("bSOrderSSOrderNo") String bSOrderSSOrderNo, ModelMap modelMap) {

         BSOrderMEntity bsOrderMEntitylist =bsOrderMRepository.findOne(bSOrderSSOrderNo);
        List<BSOrderSEntity> bsOrderSEntitylist=bsOrderSRepository.findBybSOrderS(bSOrderSSOrderNo);
        //查找改订单单下最大的明细ID号
        Integer detailId = (bsOrderSRepository.findMaxDetailId(bSOrderSSOrderNo));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }

        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);//获取商品信息
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        // 传递给请求页面

        modelMap.addAttribute("bSOrderM", bsOrderMEntitylist);
        modelMap.addAttribute("bSOrderS", bsOrderSEntitylist);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TPayment ",TPayment );
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bSOrderNo", bSOrderSSOrderNo);
        // 转到CPurchaseConS_add.jsp页面
        return "/sale/dh/adddetaile_orders";
    }


    @RequestMapping(value = "/sale_order/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(BSOrderSEntity bsOrderSEntity) {

        bsOrderSEntity.setbSOrderSMfg("2016");
        bsOrderSEntity.setbSOrderSGroupNodeId("01");
        // 数据库中添加一个用户，并立即刷新缓存
        bsOrderSRepository.saveAndFlush(bsOrderSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/sale_order/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }
    //******************************************************************************************
    //订单明细
    //******************************************************************************************

    @RequestMapping(value = "/sale_order/detaileOrder/{bSOrderSSOrderNo}", method = RequestMethod.GET)
    public String showBSOrderSEntity(@PathVariable("bSOrderSSOrderNo") String bSOrderSSOrderNo, ModelMap modelMap) {

        List<BSOrderSEntity> bsOrderSEntity =bsOrderSRepository.findBybSOrderS(bSOrderSSOrderNo);
        BSOrderMEntity bsOrderMEntity=bsOrderMRepository.findOne(bSOrderSSOrderNo);
        Integer detailId = (bsOrderSRepository.findMaxDetailId(bSOrderSSOrderNo));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        List<SalesPropertiesEntity> SalesProperties=salesPorpertiesCacheService.findAll(salesPropertiesRepository);



        // 传递给请求页面z
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("SalesPorperties",SalesProperties);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bSOrderS", bsOrderSEntity);
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("bSOrderNo", bSOrderSSOrderNo);

        return "/sale/dh/detaieOrder";
    }

}
