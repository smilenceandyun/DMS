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
        List<TStaffEntity> Staff = tStaffRepository.findAll();
        List<TClientEntity> Client = tClientRepository.findAll();
        List<TFactorysEntity> TFactorys = tFactorysRepository.findAll();
        List<SalesPropertiesEntity> SalesProperties= salesPropertiesRepository.findAll();
        List<TPaymentEntity> Payment=tPaymentRepository.findAll();

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
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个订货单，并立即刷新缓存
        bsOrderMRepository.saveAndFlush(bSOrderMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect: /detaileOrder/addS/"+bSOrderMEntity.getbSOrderMSOrderNo();
    }
    // 更新用户信息 页面
    @RequestMapping(value = "/updateMa/{id}", method = RequestMethod.GET)
    public String updatebSOrderM(@PathVariable("id") String id, ModelMap modelMap) {

        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findOne(id);

        List<TStaffEntity> Staff = tStaffRepository.findAll();//获取员工信息
        List<TClientEntity> Client = tClientRepository.findAll();//获取客户信息
        List<TPaymentEntity> Payment = tPaymentRepository.findAll();//获取付款信息
        List<SalesPropertiesEntity> SalesProperties=salesPropertiesRepository.findAll();

        // 传递给请求页面
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("Payment", Payment);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("SalesProperties",SalesProperties);
        return "/sale/dh/update_orders";
    }



    // 删除订货单
    @RequestMapping(value = "/sale_order/delete/{id}", method = RequestMethod.GET)
    public  String deleteM(@PathVariable("id") String id)
    {
        bsOrderMRepository.delete(id);
        bsOrderSRepository.deleteALLBSOrderSEntity(id);
        return "redirect:/sale_order";
    }
    // get请求，访问添加 页面

    @RequestMapping(value = "/detaileOrder/addS/{id}", method = RequestMethod.GET)
    public String addBSOrderMS(@PathVariable("id") String Id, ModelMap modelMap) {

        //查找改订单单下最大的明细ID号
        Integer detailId = (bsOrderSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findBSOrderMEntityByBSOrderMSOrderNoEquals(Id);

        List<TGoodsEntity> TGoods = tGoodsRepository.findAll();//获取商品信息
        List<TStaffEntity> Staff = tStaffRepository.findAll();//获取员工信息
        List<TClientEntity> Client = tClientRepository.findAll();
        List<TRoomEntity> TRoom = tRoomRepository.findAll();
        List<TPaymentEntity> TPayment = tPaymentRepository.findAll();
        // 传递给请求页面

        String UUID = g.getOrderNo();

        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bSOrderNo", Id);
        // 转到CPurchaseConS_add.jsp页面
        return "/sale/dh/adddetaile_orders";

    }
    // 更新销售订货 信息操作
    @RequestMapping(value = "/updateMSa", method = RequestMethod.POST)
    public String updatebSOrderMPost(BSOrderMEntity bsOrderMEntity) {
        try {
            bsOrderMEntity.setbSOrderMSendDate(new Timestamp(string2Date(bsOrderMEntity.getbSOrderMSendDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 更新用户信息
        bsOrderMRepository.updateOrder(bsOrderMEntity.getbSOrderMSalesman(), bsOrderMEntity.getbSOrderMAdPaymoney(),
                bsOrderMEntity.getbSOrderMCreateNo(),bsOrderMEntity.getbSOrderMOrderNo(), bsOrderMEntity.getbSOrderMSalesTypeNo(),bsOrderMEntity.getbSOrderMSalesDiscount(),
                bsOrderMEntity.getbSOrderMClientNo(),bsOrderMEntity.getbSOrderMSendDate(), bsOrderMEntity.getbSOrderMClientAddress(),bsOrderMEntity.getbSOrderMCreateDate(),
                bsOrderMEntity.getbSOrderMNotes(),bsOrderMEntity.getbSOrderMOrdDate(),bsOrderMEntity.getbSOrderMSOrderNo());
        bsOrderMRepository.flush(); // 刷新缓冲区
        return "redirect:/sale_order";
    }
    @RequestMapping(value = "/sale_order/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(BSOrderSEntity bsOrderSEntity) {

        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        bsOrderSRepository.saveAndFlush(bsOrderSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/sale_order/detaileOrder/" + bsOrderSEntity.getbSOrderSSOrderNo();
    }
    //******************************************************************************************
    //订单明细
    //******************************************************************************************

    @RequestMapping(value = "/sale_order/detaileOrder/{id}", method = RequestMethod.GET)
    public String showBSOrderSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        List<BSOrderSEntity> bsOrderSEntity =bsOrderSRepository.findBSOrderSEntitiesByBSOrderSSOrderNoEquals(Id);
        Integer detailId = (bsOrderSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        BSOrderMEntity bsOrderMEntity = bsOrderMRepository.findBSOrderMEntityByBSOrderMSOrderNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        List<SalesPropertiesEntity> SalesProperties=salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        String UUID = g.getOrderNo();



        // 传递给请求页面z
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("SalesPorperties",SalesProperties);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bSOrderS", bsOrderSEntity);
        modelMap.addAttribute("bSOrderM", bsOrderMEntity);
        modelMap.addAttribute("bSOrderNo", Id);

        return "/sale/dh/detaieOrder";
    }

}
