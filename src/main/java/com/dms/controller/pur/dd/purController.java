package com.dms.controller.pur.dd;
import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.dd.*;
//import com.dms.repository.T01Repository;
import com.dms.service.informationbase.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.Locale;

import  com.dms.service.serviceImpl.GetOrderNumber;

import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by 家铭 on 2017/7/21.
 */
@Controller
public class purController {

    //*************************************************************************************

    static GetOrderNumber c;

    final
    BPurchaseOrdMRepository bPurchaseOrdMRepository;

    final
    BPurchaseOrdSRepository bPurchaseOrdSRepository;

    final
    TStaffRepository tStaffRepository;

    final
    TClientRepository tClientRepository;

    final
    TFactorysRepository tFactorysRepository;

    final
    TGoodsRepository tGoodsRepository;

    final
    TRoomRepository tRoomRepository;

    final
    TPaymentRepository tPaymentRepository;

    @Autowired
    public purController(BPurchaseOrdMRepository bPurchaseOrdMRepository, BPurchaseOrdSRepository bPurchaseOrdSRepository, TStaffRepository tStaffRepository, TClientRepository tClientRepository, TFactorysRepository tFactorysRepository, TGoodsRepository tGoodsRepository, TRoomRepository tRoomRepository, TPaymentRepository tPaymentRepository) {
        this.bPurchaseOrdMRepository = bPurchaseOrdMRepository;
        this.bPurchaseOrdSRepository = bPurchaseOrdSRepository;
        this.tStaffRepository = tStaffRepository;
        this.tClientRepository = tClientRepository;
        this.tFactorysRepository = tFactorysRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tRoomRepository = tRoomRepository;
        this.tPaymentRepository = tPaymentRepository;
        c = new GetOrderNumber("O");
    }
    //============================================================================================

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
    private StoreLocationCacheService storeLocationCacheService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index2() {
        return "index";
    }

    //============================================================================================
    @RequestMapping(value = "/text11", method = RequestMethod.GET)
    public String index3(ModelMap modelMap) {
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);

        String UUID = c.getOrderNo();

        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        return "test/result";
    }


    @RequestMapping(value = "/pur_order", method = RequestMethod.GET)
    public String showAllMes(ModelMap modelMap) {
        // 查询 BPurchaseOrdMEntity 表中所有记录
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntiyList = bPurchaseOrdMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在bPurchaseOrdMEntiyList当中
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntiyList);


        // 返回pages目录下的pur_order.jsp页面
        return "pur_order";
    }
    //====================================================================================
    @RequestMapping(value = "/pur_order/login", method = RequestMethod.GET)
    public String displaylog() {
        return  "login";
    }
//====================================================================================
    @RequestMapping(value = "/pur_order/loginP", method = RequestMethod.POST)
    public void chkPSD(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response) {
        String user = request.getParameter("a_name");
        String psd = request.getParameter("a_password");

        boolean f1;
        if(user.equals("superadmin")&&psd.equals("superadmin")) {
            try {
                f1 = true;
                List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
                List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
                List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
                List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
                List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
                List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
                response.sendRedirect("/index");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else {

            try {
                f1 = false;
                response.sendRedirect("/?f1=0");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }



    //============================================================================================
    // get请求，访问添加 页面
    @RequestMapping(value = "/pur_order/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);

        String UUID = c.getOrderNo();

        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);

        // 转到addOrder.jsp页面
        return "/dd/addOrder";
    }
    //==========================================================
//    @RequestMapping(value = "/pur_order/check", method = RequestMethod.GET)
//    public void check(HttpServletRequest request){
//        String a = request.getParameter("OrdProcureNo");
//
//        Map<String,String> result = new HashMap<String,String>();
//        boolean flag = false;
//        try{
//            String para= getPara("para");
//            //校验 代码...
//            result.put("flag", "true");
//            renderJson(result);//返回json数据
//        }catch(Exception e){
//            result.put("flag", flag+"");
//            result.put("errorMsg", e.getMessage());
//            renderJson(result);//返回json数据
//            e.printStackTrace();
//        }
//    }
    //============================================================================================
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

    @RequestMapping(value = "/pur_order/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(HttpServletRequest request) {

        BPurchaseOrdMEntity bPurchaseOrdMEntity = new BPurchaseOrdMEntity();

        bPurchaseOrdMEntity.setbPurchaseOrdMOrdProcureNo(request.getParameter("bPurchaseOrdMOrdProcureNo"));
        //bPurchaseOrdMEntity.setbPurchaseOrdMFactoryBillno(request.getParameter("bProcureMProcureNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMSalesman(request.getParameter("bPurchaseOrdMSalesman"));
        bPurchaseOrdMEntity.setbPurchaseOrdMAdPaymoney(new BigDecimal(request.getParameter("bPurchaseOrdMAdPaymoney")));
        bPurchaseOrdMEntity.setbPurchaseOrdMCreateNo(request.getParameter("bPurchaseOrdMCreateNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMHandbillNo(request.getParameter("bPurchaseOrdMHandbillNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMPaymentAttributer(request.getParameter("bPurchaseOrdMServiceAttribute"));
        try {
            bPurchaseOrdMEntity.setbPurchaseOrdMOrdDate(new Timestamp(string2Date(request.getParameter("bPurchaseOrdMOrdDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bPurchaseOrdMEntity.setbPurchaseOrdMPaymentType(request.getParameter("bPurchaseOrdMPaymentType"));
        bPurchaseOrdMEntity.setbPurchaseOrdMFactoryGoodsNo(request.getParameter("bPurchaseOrdMFactoryGoodsNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMDeliveryDate(request.getParameter("bPurchaseOrdMDeliveryDate"));
        bPurchaseOrdMEntity.setbPurchaseOrdMClientNo(request.getParameter("bPurchaseOrdMClientNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMChecker(request.getParameter("bPurchaseOrdMChecker"));
        bPurchaseOrdMEntity.setbPurchaseOrdMNotes(request.getParameter("bPurchaseOrdMNotes"));
        //bPurchaseOrdMEntity.setbPurchaseOrdMManagerNo(request.getParameter("bPurchaseOrdMManagerNo"));
        bPurchaseOrdMEntity.setbPurchaseOrdMIsPass(request.getParameter("bPurchaseOrdMIsPass"));
        bPurchaseOrdMEntity.setbPurchaseOrdMState(request.getParameter("bPurchaseOrdMState"));

        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        bPurchaseOrdMRepository.saveAndFlush(bPurchaseOrdMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/pur_order/detaileOrder/add/"+bPurchaseOrdMEntity.getbPurchaseOrdMOrdProcureNo();
    }
    //============================================================================================
    // 更新用户信息 页面
    @RequestMapping(value = "/pur_order/update/{id}", method = RequestMethod.GET)
    public String updateBPurchaseOrdM(@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BPurchaseOrdMEntity bPurchaseOrdMEntity = bPurchaseOrdMRepository.findOne(id);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);

        // 传递给请求页面
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntity);
        return "/dd/updateOrder";
    }
    //============================================================================================
    // 更新用户信息 操作
    @RequestMapping(value = "/pur_order/updateP", method = RequestMethod.POST)
    public String updateOrder(BPurchaseOrdMEntity bPurchaseOrdMEntity) {

        try {
            bPurchaseOrdMEntity.setbPurchaseOrdMOrdDate(new Timestamp(string2Date(bPurchaseOrdMEntity.getbPurchaseOrdMOrdDate().toString()).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 更新用户信息
        bPurchaseOrdMRepository.updateOrder(bPurchaseOrdMEntity.getbPurchaseOrdMSalesman(), bPurchaseOrdMEntity.getbPurchaseOrdMAdPaymoney(),bPurchaseOrdMEntity.getbPurchaseOrdMCreateNo(),bPurchaseOrdMEntity.getbPurchaseOrdMHandbillNo(),
                bPurchaseOrdMEntity.getbPurchaseOrdMServiceAttribute(),bPurchaseOrdMEntity.getbPurchaseOrdMOrdDate(),bPurchaseOrdMEntity.getbPurchaseOrdMPaymentType(),bPurchaseOrdMEntity.getbPurchaseOrdMFactoryGoodsNo(),
                bPurchaseOrdMEntity.getbPurchaseOrdMDeliveryDate(),bPurchaseOrdMEntity.getbPurchaseOrdMClientNo(),bPurchaseOrdMEntity.getbPurchaseOrdMNotes(),bPurchaseOrdMEntity.getbPurchaseOrdMOrdProcureNo());
        bPurchaseOrdMRepository.flush(); // 刷新缓冲区
        return "redirect:/pur_order";
    }
    //============================================================================================
    // 删除用户
    @RequestMapping(value = "/pur_order/delete/{id}", method = RequestMethod.GET)
    public String deleteBPurchaseOrdM(@PathVariable("id") String Id) {
        // 删除id为Id的用户
        bPurchaseOrdMRepository.delete(Id);
        //detaileRepository.delete(Id);
        // 立即刷新
        bPurchaseOrdMRepository.flush();
        //detaileRepository.flush();
        return "redirect:/pur_order";
    }
    //******************************************************************************************
    //订单明细
    //******************************************************************************************

    @RequestMapping(value = "/pur_order/detaileOrder/{id}", method = RequestMethod.GET)
    public String showBPurchaseOrdSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        // 找到detaileId所表示的订单明细
        // int id2=Integer.parseInt(Id);
        //BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne("01");
        List<BPurchaseOrdSEntity> bPurchaseOrdSEntity = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoEquals(Id);
        Integer detailId = (bPurchaseOrdSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        BPurchaseOrdMEntity bPurchaseOrdMEntity = bPurchaseOrdMRepository.findBPurchaseOrdMEntityByBPurchaseOrdMOrdProcureNoEquals(Id);
        //List<BPurchaseOrdSEntity> bPurchaseOrdSEntity = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = c.getOrderNo();

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("bPurchaseOrdS", bPurchaseOrdSEntity);
        modelMap.addAttribute("ordProcureNo", Id);

        return "/dd/detaileOrder";
    }

    @RequestMapping(value = "/pur_order/detaileOrderDetail/{detailID}&{id}", method = RequestMethod.GET)
    public String showBPurchaseOrdSEntityDetail(@PathVariable("detailID") Integer detailID,@PathVariable("id") String Id, ModelMap modelMap) {

        // 找到detaileId所表示的订单明细
        // int id2=Integer.parseInt(Id);
        //BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne("01");
        List<BPurchaseOrdSEntity> bPurchaseOrdSEntity = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoEquals(Id);
        BPurchaseOrdSEntity detail = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoAndBPurchaseOrdSDetailIdEquals(Id,detailID);
        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdS", bPurchaseOrdSEntity);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("ordProcureNo", Id);

        return "/dd/detaileOrder2";
    }

    // get请求，访问添加 页面

    @RequestMapping(value = "/pur_order/detaileOrder/add/{id}", method = RequestMethod.GET)
    public String addBPurchaseOrdSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        Integer detailId = (bPurchaseOrdSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        BPurchaseOrdMEntity bPurchaseOrdMEntity = bPurchaseOrdMRepository.findBPurchaseOrdMEntityByBPurchaseOrdMOrdProcureNoEquals(Id);
        //List<BPurchaseOrdSEntity> bPurchaseOrdSEntity = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoEquals(Id);
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        String UUID = c.getOrderNo();

        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("ordProcureNo", Id);
        // 转到addOrder.jsp页面
        return "/dd/addDetaileOrder";
    }


    @RequestMapping(value = "/pur_order/detaileOrder/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdSEntityPost(BPurchaseOrdSEntity bPurchaseOrdSEntity) {

        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        bPurchaseOrdSRepository.saveAndFlush(bPurchaseOrdSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/pur_order/detaileOrder/" + bPurchaseOrdSEntity.getbPurchaseOrdSOrdProcureNo();
    }

    // 更新明细信息 页面
    @RequestMapping(value = "/pur_order/detaileOrder/update/{detailID}&{id}", method = RequestMethod.GET)
    public String updateBPurchaseOrdSEntity(@PathVariable("detailID") Integer detailID,@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BPurchaseOrdMEntity bPurchaseOrdMEntity = bPurchaseOrdMRepository.findBPurchaseOrdMEntityByBPurchaseOrdMOrdProcureNoEquals(id);
        BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoAndBPurchaseOrdSDetailIdEquals(id,detailID);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntity);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailID", detailID);
        modelMap.addAttribute("bPurchaseOrdS", bPurchaseOrdSEntity);
        return "/dd/updateDetaileOrder";
    }

    //==============================================================================================

    // 更新明细信息 操作
    @RequestMapping(value = "/pur_order/detaileOrder/updateP", method = RequestMethod.POST)
    public String updateBPurchaseOrdSEntityPost(BPurchaseOrdSEntity bPurchaseOrdSEntity) {

        // 更新用户信息
        bPurchaseOrdSRepository.updateDetailOrder(bPurchaseOrdSEntity.getbPurchaseOrdSFactoryGoodsNo(), bPurchaseOrdSEntity.getbPurchaseOrdSPresentationProperty(),
                bPurchaseOrdSEntity.getbPurchaseOrdSGoodsNo(), bPurchaseOrdSEntity.getbPurchaseOrdSOriginalPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSTaxRate(),bPurchaseOrdSEntity.getbPurchaseOrdSRoomNo(),
                bPurchaseOrdSEntity.getbPurchaseOrdSPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSQuantity(),bPurchaseOrdSEntity.getbPurchaseOrdSDetailMoney(),bPurchaseOrdSEntity.getbPurchaseOrdSBoxQuantity(),
                bPurchaseOrdSEntity.getbPurchaseOrdSBoxPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSPaymentNo(),bPurchaseOrdSEntity.getbPurchaseOrdSMfg(),bPurchaseOrdSEntity.getbPurchaseOrdSExp(),bPurchaseOrdSEntity.getbPurchaseOrdSDetailId(),
                bPurchaseOrdSEntity.getbPurchaseOrdSOrdProcureNo());
        bPurchaseOrdSRepository.flush(); // 刷新缓冲区
        return "redirect:/pur_order/detaileOrder/" + bPurchaseOrdSEntity.getbPurchaseOrdSOrdProcureNo();
    }

    //================================================================================================

    // 删除一条明细
    @RequestMapping(value = "/pur_order/detaileOrder/delete/{detailID}&{id}", method = RequestMethod.GET)
    public void deleteBPurchaseOrdSEntity(@PathVariable("detailID") Integer detailID, @PathVariable("id") String Id , HttpServletResponse response) {

        // 删除id为Id的用户
        bPurchaseOrdSRepository.deleteBPurchaseOrdSEntity(Id,detailID);
        // 立即刷新
        bPurchaseOrdSRepository.flush();

        try {
            response.sendRedirect("/pur_order/detaileOrder/"+Id);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return "/dd/detaileOrder";
    }

    //================================================================================================

    // 删除所有明细
    @RequestMapping(value = "/pur_order/detaileOrder/deleteall/{id}", method = RequestMethod.GET)
    public String deleteALLBPurchaseOrdSEntity(@PathVariable("id") String Id) {

        // 删除id为Id的用户
        bPurchaseOrdSRepository.deleteALLBPurchaseOrdSEntity(Id);
        // 立即刷新
        bPurchaseOrdSRepository.flush();
        return "redirect:/pur_order/detaileOrder/" + Id;
    }


    //-------------------------------------------------------------------------------------------------

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
    //========================================查询员工资料===========

    //========================================test


//    @RequestMapping(value = "/bb/{id}", method = RequestMethod.GET)
//    public String ss(@PathVariable("id") Integer Id, ModelMap modelMap) {
//
//        // 找到detaileId所表示的订单明细
//        // int id2=Integer.parseInt(Id);
//        //BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne("01");
//        List<T01Entity> list = t01Repository.findBySex_T02Id(Id);
//        // 传递给请求页面
//        System.out.println(list.size());
//        System.out.println(list.get(0).getT01Name());
//        System.out.println(list.get(0).getSex().getT02Name());
//
//        modelMap.addAttribute("list", list);
//
//        return "detaileOrder";
//    }
}
