package com.dms.controller.pur.th;

import com.dms.model.*;
import com.dms.repository.*;
import com.dms.repository.dd.BPurchaseOrdMRepository;
import com.dms.repository.dd.BPurchaseOrdSRepository;
import com.dms.repository.rk.BProcureMRepository;
import com.dms.repository.th.BRProcureMRepository;
import com.dms.repository.th.BRProcureSRepository;
import com.dms.service.informationbase.*;
import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import static com.dms.controller.pur.rk.ProcureController.string2Date;

/**
 * Created by Alex on 2017/8/3.
 */

@Controller
public class ReturnController {

    //==================================================================================================================

    static GetOrderNumber t;

    final
    BRProcureMRepository  brProcureMRepository;//退货

    final
    BRProcureSRepository brProcureSRepository;//退货明细

    final TStaffRepository tStaffRepository;//员工

    final TGoodsRepository tGoodsRepository;//商品

    final TFactorysRepository tFactorysRepository;//厂家

    final TRoomRepository tRoomRepository;//仓库

    final BPurchaseOrdMRepository bPurchaseOrdMRepository;//采购订单

    final TClientRepository tClientRepository;

    final TPaymentRepository tPaymentRepository;

    final BPurchaseOrdSRepository bPurchaseOrdSRepository;

    public ReturnController(BRProcureMRepository brProcureMRepository, BRProcureSRepository brProcureSRepository, TStaffRepository tStaffRepository, TGoodsRepository tGoodsRepository, TFactorysRepository tFactorysRepository, TRoomRepository tRoomRepository, BPurchaseOrdMRepository bPurchaseOrdMRepository, TClientRepository tClientRepository, TPaymentRepository tPaymentRepository, BPurchaseOrdSRepository bPurchaseOrdSRepository) {
        this.brProcureMRepository = brProcureMRepository;
        this.brProcureSRepository = brProcureSRepository;
        this.tStaffRepository = tStaffRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tFactorysRepository = tFactorysRepository;
        this.tRoomRepository = tRoomRepository;
        this.bPurchaseOrdMRepository = bPurchaseOrdMRepository;
        this.tClientRepository = tClientRepository;
        this.tPaymentRepository = tPaymentRepository;
        this.bPurchaseOrdSRepository = bPurchaseOrdSRepository;
        t = new GetOrderNumber("t");
    }

    //==================================================================================================================

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


    @RequestMapping(value = "/BRProM_order", method = RequestMethod.GET)
    public String showAllBRPorM(ModelMap modelMap) {
        // 查询 BRProcureMEntity 表中所有记录
        List<BRProcureMEntity> brProcureMEntityList = brProcureMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面
        modelMap.addAttribute("brProcureM", brProcureMEntityList);

        // 返回th目录下的BRProcureM.jsp页面
        return "th/BRProcureM";
    }

    //======添加采购退货================================================================================================

    // get请求，访问添加 页面
    @RequestMapping(value = "/addR", method = RequestMethod.GET)
    public String addBRProcureM(ModelMap modelMap){

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TFactorysEntity> Factorys = tFactorysCacheService.findAll(tFactorysRepository);//获取厂家信息
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntities = bPurchaseOrdMRepository.findAll();
        String UUID = t.getOrderNo();//获取UUID

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdMEntities", bPurchaseOrdMEntities);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Factorys", Factorys);
        modelMap.addAttribute("UUID", UUID);

        // 转到BRProcureM_add.jsp页面
        return "th/BRProcureM_add";
    }

    @RequestMapping(value = "/addRE", method = RequestMethod.POST)
    public String addBRProcureMPost(HttpServletRequest request) {

        BRProcureMEntity brProcureMEntity = new BRProcureMEntity();

        //获取页面传来的数据
        brProcureMEntity.setbRProcureMRProcureNo(request.getParameter("bRProcureMRProcureNo"));
        brProcureMEntity.setbRProcureMHandbillNo(request.getParameter("bRProcureMHandbillNo"));
        brProcureMEntity.setbRProcureMServiceAttribute(request.getParameter("bRProcureMServiceAttribute"));
        brProcureMEntity.setbRProcureMPaymentAttributer(request.getParameter("bRProcureMPaymentAttributer"));
        brProcureMEntity.setbRProcureMSalesman(request.getParameter("bRProcureMSalesman"));
        brProcureMEntity.setbRProcureMWarehouseKeeper(request.getParameter("bRProcureMWarehouseKeeper"));
        brProcureMEntity.setbRProcureMChecker(request.getParameter("bRProcureMChecker"));
        brProcureMEntity.setbRProcureMDeliverymanNo(request.getParameter("bRProcureMDeliverymanNo"));
        brProcureMEntity.setbRProcureMNotes(request.getParameter("bRProcureMNotes"));
        brProcureMEntity.setbRProcureMState("0");

        try {
            brProcureMEntity.setbRProcureMCheckDate(new Timestamp(string2Date(request.getParameter("bRProcureMCheckDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            brProcureMEntity.setbRProcureMCreateDate(new Timestamp(string2Date(request.getParameter("bRProcureMCreateDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            brProcureMEntity.setbRProcureMModifiTime(new Timestamp(string2Date(request.getParameter("bRProcureMModifiTime")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 数据库中添加一个采购退货单，并立即刷新缓存
        brProcureMRepository.saveAndFlush(brProcureMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/BRProM_order";
    }

    //======修改采购退货================================================================================================

    // 更新采购合同信息 页面
    @RequestMapping(value = "/updateR/{bRProcureMRProcureNo}", method = RequestMethod.GET)
    public String updatebRProcureM(@PathVariable("bRProcureMRProcureNo") String bRProcureMRProcureNo, ModelMap modelMap) {

        // 找到相应采购退货单
        BRProcureMEntity brProcureMEntity = brProcureMRepository.findOne(bRProcureMRProcureNo);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TFactorysEntity> Factorys = tFactorysCacheService.findAll(tFactorysRepository);//获取厂家信息

        // 传递给请求页面
        modelMap.addAttribute("bRProcureM", brProcureMEntity);
        modelMap.addAttribute("Factorys", Factorys);
        modelMap.addAttribute("Staff", Staff);

        return "th/BRProcureM_update";
    }

    // 更新采购退货 信息操作
    @RequestMapping(value = "/updateRE", method = RequestMethod.POST)
    public String updatebRProcureMPost(BRProcureMEntity brProcureMEntity) {

        //读取原state数据，bProcureMEntity
        BRProcureMEntity b = brProcureMRepository.findOne(brProcureMEntity.getbRProcureMRProcureNo());
        brProcureMEntity.setbRProcureMState(b.getbRProcureMState());

        // 修改，并立即刷新缓存
        brProcureMRepository.saveAndFlush(brProcureMEntity);

        return "redirect:/BRProM_order";
    }

    //======删除采购退货================================================================================================

    @RequestMapping(value = "/deleteRM/{bRProcureMRProcureNo}", method = RequestMethod.GET)
    public  String deleteM(@PathVariable("bRProcureMRProcureNo") String bRProcureMRProcureNo)
    {

        brProcureMRepository.delete(bRProcureMRProcureNo);
//        brProcureSRepository.

        return "redirect:/BRProM_order";
    }



    //明细
    //******************************************************************************************

    @RequestMapping(value = "/detail/th/{id}", method = RequestMethod.GET)
    public String showBPurchaseOrdSEntity(@PathVariable("id") String Id, ModelMap modelMap) {

        // 找到detaileId所表示的订单明细
        // int id2=Integer.parseInt(Id);
        //BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne("01");
        List<BRProcureSEntity> brProcureSEntitie = brProcureSRepository.findBRProcureSEntitiesBybRProcureSRProcureNoEquals(Id);
        // 传递给请求页面

        Integer detailId = (brProcureSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }


        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        List<BPurchaseOrdSEntity> bPurchaseOrdSEntities = bPurchaseOrdSRepository.findAll();
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntities = bPurchaseOrdMRepository.findAll();
        BRProcureMEntity bProcureM = brProcureMRepository.findBRProcureMEntityByBRProcureMRProcureNoEquals(Id);

        modelMap.addAttribute("bProcureM", bProcureM);
        modelMap.addAttribute("bPurchaseOrdMEntities", bPurchaseOrdMEntities);
        modelMap.addAttribute("bPurchaseOrdSEntities", bPurchaseOrdSEntities);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("brProcureS", brProcureSEntitie);
        modelMap.addAttribute("brProcureNo", Id);

        return "/th/detaileProcureS";
    }

    @RequestMapping(value = "/detail/th2/{detailID}&{id}", method = RequestMethod.GET)
    public String showBrprocureSDetail(@PathVariable("detailID") Integer detailID,@PathVariable("id") String Id, ModelMap modelMap) {

        // 找到detaileId所表示的订单明细
        // int id2=Integer.parseInt(Id);
        //BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne("01");
        List<BRProcureSEntity> brProcureSEntitie = brProcureSRepository.findBRProcureSEntitiesBybRProcureSRProcureNoEquals(Id);
        BRProcureSEntity detail = brProcureSRepository.findBRProcureSEntitiesBybRProcureSRProcureNoAndBRProcureSDetailIdEquals(Id,detailID);
        // 传递给请求页面
        modelMap.addAttribute("brProcureS", brProcureSEntitie);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("brProcureNo", Id);

        return "/th/detaileProcureS2";
    }
//
    // get请求，访问添加 页面

    @RequestMapping(value = "/th/detail/add/{id}", method = RequestMethod.GET)
    public String add_detail(@PathVariable("id") String Id, ModelMap modelMap) {

        Integer detailId = (brProcureSRepository.findMaxDetailId(Id));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }


        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);
        List<BPurchaseOrdSEntity> bPurchaseOrdSEntities = bPurchaseOrdSRepository.findAll();
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntities = bPurchaseOrdMRepository.findAll();

        modelMap.addAttribute("bPurchaseOrdMEntities", bPurchaseOrdMEntities);
        modelMap.addAttribute("bPurchaseOrdSEntities", bPurchaseOrdSEntities);
        modelMap.addAttribute("TPayment", TPayment);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("ordProcureNo", Id);
        // 转到addOrder.jsp页面
        return "/th/adddetaileProcureS";
    }


    @RequestMapping(value = "/th/detail/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdSEntityPost(BRProcureSEntity brProcureSEntity) {

        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        brProcureSRepository.saveAndFlush(brProcureSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/detail/th/"+ brProcureSEntity.getbRProcureSRProcureNo();
    }

    // 更新明细信息 页面
    @RequestMapping(value = "/th/detaileOrder/update/{detailID}&{id}", method = RequestMethod.GET)
    public String updateBPurchaseOrdSEntity(@PathVariable("detailID") Integer detailID,@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BRProcureSEntity brProcureSEntity = brProcureSRepository.findBRProcureSEntitiesBybRProcureSRProcureNoAndBRProcureSDetailIdEquals(id,detailID);
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntities = bPurchaseOrdMRepository.findAll();
        List<BPurchaseOrdSEntity> bPurchaseOrdSEntities = bPurchaseOrdSRepository.findAll();
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);
        List<TFactorysEntity> TFactorys = tFactorysCacheService.findAll(tFactorysRepository);
        List<TGoodsEntity> TGoods = tGoodsCacheService.findAll(tGoodsRepository);
        List<TRoomEntity> TRoom = tRoomCacheService.findAll(tRoomRepository);
        List<TPaymentEntity> TPayment = tPaymentCacheService.findAll(tPaymentRepository);

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdMEntities", bPurchaseOrdMEntities);
        modelMap.addAttribute("bPurchaseOrdSEntities", bPurchaseOrdSEntities);
        modelMap.addAttribute("TRoom", TRoom);
        modelMap.addAttribute("TGoods", TGoods);
        modelMap.addAttribute("TFactorys", TFactorys);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("detailID", detailID);
        modelMap.addAttribute("brProcureSEntity", brProcureSEntity);
        modelMap.addAttribute("ordProcureNo", id);
        return "/th/updatedetaileProcureS";
    }
    //
//    //==============================================================================================
//
//    // 更新明细信息 操作
//    @RequestMapping(value = "/pur_order/detaileOrder/updateP", method = RequestMethod.POST)
//    public String updateBPurchaseOrdSEntityPost(BPurchaseOrdSEntity bPurchaseOrdSEntity) {
//
//        // 更新用户信息
//        bPurchaseOrdSRepository.updateDetailOrder(bPurchaseOrdSEntity.getbPurchaseOrdSFactoryGoodsNo(), bPurchaseOrdSEntity.getbPurchaseOrdSPresentationProperty(),
//                bPurchaseOrdSEntity.getbPurchaseOrdSGoodsNo(), bPurchaseOrdSEntity.getbPurchaseOrdSOriginalPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSTaxRate(),bPurchaseOrdSEntity.getbPurchaseOrdSRoomNo(),
//                bPurchaseOrdSEntity.getbPurchaseOrdSPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSQuantity(),bPurchaseOrdSEntity.getbPurchaseOrdSDetailMoney(),bPurchaseOrdSEntity.getbPurchaseOrdSBoxQuantity(),
//                bPurchaseOrdSEntity.getbPurchaseOrdSBoxPrice(),bPurchaseOrdSEntity.getbPurchaseOrdSPaymentNo(),bPurchaseOrdSEntity.getbPurchaseOrdSMfg(),bPurchaseOrdSEntity.getbPurchaseOrdSExp(),bPurchaseOrdSEntity.getbPurchaseOrdSDetailId(),
//                bPurchaseOrdSEntity.getbPurchaseOrdSOrdProcureNo());
//        bPurchaseOrdSRepository.flush(); // 刷新缓冲区
//        return "redirect:/pur_order/detaileOrder/" + bPurchaseOrdSEntity.getbPurchaseOrdSOrdProcureNo();
//    }
//
//    //================================================================================================
//
    // 删除一条明细
    @RequestMapping(value = "/th/delete/{detailID}&{id}", method = RequestMethod.GET)
    public void deleteBPurchaseOrdSEntity(@PathVariable("detailID") Integer detailID, @PathVariable("id") String Id , HttpServletResponse response) {

        // 删除id为Id的用户
        brProcureSRepository.deleteBRProcureSEntity(Id,detailID);
        // 立即刷新
        brProcureSRepository.flush();

        try {
            response.sendRedirect("/detail/th/"+Id);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return "/dd/detaileOrder";
    }
//
//    //================================================================================================
//
//    // 删除所有明细
//    @RequestMapping(value = "/pur_order/detaileOrder/deleteall/{id}", method = RequestMethod.GET)
//    public String deleteALLBPurchaseOrdSEntity(@PathVariable("id") String Id) {
//
//        // 删除id为Id的用户
//        bPurchaseOrdSRepository.deleteALLBPurchaseOrdSEntity(Id);
//        // 立即刷新
//        bPurchaseOrdSRepository.flush();
//        return "redirect:/pur_order/detaileOrder/" + Id;
//    }


    //-------------------------------------------------------------------------------------------------
}
