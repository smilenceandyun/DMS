package com.dms.controller.sale.dh.zp;

import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.sale.BOutPresentMRepository;
import com.dms.repository.sale.BOutPresentSRepository;
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

@Controller
public class ZpController {

    static GetOrderNumber d;
    final
    BOutPresentMRepository bOutPresentMRepository;//销售订货

    final
    BOutPresentSRepository bOutPresentSRepository;//销售订货明细
    final
    TStaffRepository tStaffRepository;

    final
    TClientRepository tClientRepository;

    final
    SalesPropertiesRepository salesPropertiesRepository;
    final
    DeliverymanRepository deliverymanRepository;

    final
    TGoodsRepository tGoodsRepository;

    final
    TRoomRepository tRoomRepository;

    final
    TPaymentRepository tPaymentRepository;

    @Autowired
    public ZpController( BOutPresentMRepository bOutPresentMRepository,  BOutPresentSRepository bOutPresentSRepository, TStaffRepository tStaffRepository, TClientRepository tClientRepository, DeliverymanRepository deliverymanRepository, TGoodsRepository tGoodsRepository, TRoomRepository tRoomRepository, TPaymentRepository tPaymentRepository, SalesPropertiesRepository salesPropertiesRepository) {
        this.bOutPresentMRepository = bOutPresentMRepository;
        this.bOutPresentSRepository = bOutPresentSRepository;
        this.tStaffRepository = tStaffRepository;
        this.tClientRepository = tClientRepository;
        this.deliverymanRepository = deliverymanRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tRoomRepository = tRoomRepository;
        this.salesPropertiesRepository = salesPropertiesRepository;
        this.tPaymentRepository = tPaymentRepository;
        d = new GetOrderNumber("ZP");
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
    private DeliverymanCacheService deliverymanCacheService;
    @Autowired
    private TGoodsCacheService tGoodsCacheService;
    @Autowired
    private TOrgCacheService tOrgCacheService;
    @Autowired
    private SalesPorpertiesCacheService salesPorpertiesCacheService;

    //intivhv
    @RequestMapping(value = "/zp_order", method = RequestMethod.GET)
    public String showAllMes(ModelMap modelMap) {
        // 查询 销售订货(BSOrderMEntity) 表中所有记录
        List<BOutPresentMEntity> bOutPresentMEntityList = bOutPresentMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("bOutPreM", bOutPresentMEntityList);
        // 返回sale目录下的s_order.jsp页面
        return "/sale/zp/zp_orders";
    }
    @RequestMapping(value = "/zp_order/add", method = RequestMethod.GET)
    public String addBOutPresentM(ModelMap modelMap) {
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<DeliverymanEntity> Deliver=deliverymanCacheService.findAll(deliverymanRepository);
        String UUID = d.getOrderNo();

        modelMap.addAttribute("Client",Client);
        modelMap.addAttribute("Staff",Staff);
        modelMap.addAttribute("UUID",UUID);
        modelMap.addAttribute("Deliver",Deliver);
        return "/sale/zp/addzp_orders";
    }
    @RequestMapping(value = "/zp_order/addP", method = RequestMethod.POST)
    public String addBOutPresentMPost(BOutPresentMEntity bOutPresentMEntity) {

        bOutPresentMEntity.setbOutPresentMState("0");
        bOutPresentMEntity.setbOutPresentMGroupNodeId("01");

        // 数据库中添加一个订货单，并立即刷新缓存
       bOutPresentMRepository.saveAndFlush(bOutPresentMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/zp_order/detaileOrder/add/"+ bOutPresentMEntity.getbOutPresentMOutPresentNo();
    }
    // 更新用户信息 页面
    @RequestMapping(value = "/upda_order/{id}", method = RequestMethod.GET)
    public String updatebSOrderM(@PathVariable("id") String id, ModelMap modelMap) {

        BOutPresentMEntity bOutPresentMEntity = bOutPresentMRepository.findOne(id);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TPaymentEntity> Payment = tPaymentCacheService.findAll(tPaymentRepository);//获取付款信息
        List<SalesPropertiesEntity> SalesProperties = salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        List<DeliverymanEntity> Deliver=deliverymanCacheService.findAll(deliverymanRepository);
        // 传递给请求页面
        modelMap.addAttribute("bOutPresentM", bOutPresentMEntity);
        modelMap.addAttribute("Payment", Payment);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("SalesProperties", SalesProperties);
        modelMap.addAttribute("Deliver", Deliver);
        return "/sale/zp/zp_update_orders";
    }
    // 更新用户信息  操作
    @RequestMapping(value = "/upda_order", method = RequestMethod.POST)
    public String updateOrder(BOutPresentMEntity bOutPresentMEntity) {
       BOutPresentMEntity c = bOutPresentMRepository.findOne(bOutPresentMEntity.getbOutPresentMOutPresentNo());
        bOutPresentMEntity.setbOutPresentMState(c.getbOutPresentMState());
       bOutPresentMEntity.setbOutPresentMGroupNodeId("01");
      /*  try {
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
        }*/
        bOutPresentMRepository.saveAndFlush(bOutPresentMEntity);
        return "redirect:/zp_order";
    }
    // get请求，访问添加 页面

    @RequestMapping(value = "/zp_order/detaileOrder/add/{id}", method = RequestMethod.GET)
    public String addBPOUTSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        Integer detailId = (bOutPresentSRepository.findMaxDetailId(Id));

        if (detailId == null) {
            detailId = 1;
        } else {
            detailId += 1;
        }
        BOutPresentMEntity bOutPresentMEntity = bOutPresentMRepository.findBOutPresentMEntityByBOutPresentMOutPresentNoEquals(Id);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = d.getOrderNo();

        modelMap.addAttribute("bOutPresentM", bOutPresentMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);

        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("OutP", Id);
        // 转到addOrder.jsp页面
        return "/sale/zp/addzp_detaile";
    }
    @RequestMapping(value = "/zp_order/detaileOrder/addP", method = RequestMethod.POST)
    public String addBSOrderSEntityPost(BOutPresentSEntity bOutPresentSEntity) {
        //bOutPresentSEntity.setbSOrderSMfg("2016");
        bOutPresentSEntity.setbOutPresentSGroupNodeId("01");
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 数据库中添加一个用户，并立即刷新缓存
        bOutPresentSRepository.saveAndFlush(bOutPresentSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/zp_order/detaileOrder/" + bOutPresentSEntity.getbOutPresentSOutPresentNo();
    }
    @RequestMapping(value = "/zp_order/detaileOrder/{id}", method = RequestMethod.GET)
    public String showBOutEntity(@PathVariable("id") String Id, ModelMap modelMap) {
        List<BOutPresentSEntity> bOutPresentSEntity = bOutPresentSRepository.findBOutPresentSEntitiesByBOutPresentSOutPresentNoEquals(Id);
        Integer detailId = (bOutPresentSRepository.findMaxDetailId(Id));
        if (detailId == null) {
            detailId = 1;
        } else {
            detailId += 1;
        }
       BOutPresentMEntity bOutPresentMEntity = bOutPresentMRepository.findBOutPresentMEntityByBOutPresentMOutPresentNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<SalesPropertiesEntity> SaleProperries = salesPorpertiesCacheService.findAll(salesPropertiesRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = d.getOrderNo();

        // 传递给请求页面
        modelMap.addAttribute("bOutPresentM", bOutPresentMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("SaleProperries", SaleProperries);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bOutPresentS", bOutPresentSEntity);
        modelMap.addAttribute("ordOutNo", Id);

        return "/sale/zp/zp_dateieOrder";
    }
    // 删除订货单
    @RequestMapping(value = "/zp_order/delete/{id}", method = RequestMethod.GET)
    public String deleteMM(@PathVariable("id") String id) {
       bOutPresentMRepository.delete(id);
       bOutPresentMRepository.flush();
        return "redirect:/zp_order";
    }
    // 删除一条明细
    @RequestMapping(value = "/zp_order/detaileOrder/delete/{detailID}&{id}", method = RequestMethod.GET)
    public void deleteBPOutSEntity(@PathVariable("detailID") Integer detailID, @PathVariable("id") String Id, HttpServletResponse response) {

        // 删除id为Id的用户
        bOutPresentSRepository.deleteBOutPresentSEntity(Id, detailID);
        // 立即刷新
        bOutPresentSRepository.flush();

        try {
            response.sendRedirect("/zp_order/detaileOrder/" + Id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 更新明细信息 页面
    @RequestMapping(value = "/zp_order/detaileOrder/update/{detailID}&{id}", method = RequestMethod.GET)
    public String updateBSOrdSEntity(@PathVariable("detailID") Integer detailID,@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BOutPresentMEntity bOutPresentMEntity = bOutPresentMRepository.findBOutPresentMEntityByBOutPresentMOutPresentNoEquals(id);
        BOutPresentSEntity bOutPresentSEntity = bOutPresentSRepository.findBOutPresentSEntitiesByBOutPresentSOutPresentNoAndAndBOutPresentSDetailIdEquals(id,detailID);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);

        // 传递给请求页面
        modelMap.addAttribute("bOutPresentM",bOutPresentMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailID", detailID);
        modelMap.addAttribute("bOutPresentS", bOutPresentSEntity);
        return "/sale/zp/update_zp_detaile";
    }
    // 更新明细信息 操作
    @RequestMapping(value = "/zp_order/detaileOrder/updateP", method = RequestMethod.POST)
    public String updateBPurSEntityPost(BOutPresentSEntity bOutPresentSEntity) {
       BOutPresentSEntity c = bOutPresentSRepository.findBOutPresentSEntitiesByBOutPresentSOutPresentNoAndAndBOutPresentSDetailIdEquals(bOutPresentSEntity.getbOutPresentSOutPresentNo(),bOutPresentSEntity.getbOutPresentSDetailId());
       bOutPresentSEntity.setbOutPresentSGroupNodeId(c.getbOutPresentSGroupNodeId());

        bOutPresentSRepository.saveAndFlush(bOutPresentSEntity); // 刷新缓冲区
        return "redirect:/zp_order/detaileOrder/" + bOutPresentSEntity.getbOutPresentSOutPresentNo();
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

}