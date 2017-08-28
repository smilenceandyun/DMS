package com.dms.controller.pur.ht;

import com.dms.model.*;
import com.dms.repository.TClientRepository;
import com.dms.repository.TFactorysRepository;
import com.dms.repository.TGoodsRepository;
import com.dms.repository.TStaffRepository;
import com.dms.repository.ht.CPurchaseConMRepository;
import com.dms.repository.ht.CPurchaseConSRepository;
import com.dms.service.informationbase.*;
import com.dms.service.serviceImpl.GetOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

import static com.dms.controller.pur.rk.ProcureController.string2Date;

/**
 * Created by Alex on 2017/8/2.
 */

@Controller
public class ContractController {

    //==================================================================================================================

    static GetOrderNumber h;

    final CPurchaseConMRepository cPurchaseConMRepository;//采购合同

    final CPurchaseConSRepository cPurchaseConSRepository;//采购合同明细

    final TClientRepository tClientRepository;//客户

    final TStaffRepository tStaffRepository;//员工

    final TGoodsRepository tGoodsRepository;//商品

    final TFactorysRepository tFactorysRepository;//厂家

    @Autowired
    public ContractController(CPurchaseConMRepository cPurchaseConMRepository, CPurchaseConSRepository cPurchaseConSRepository, TClientRepository tClientRepository, TStaffRepository tStaffRepository, TGoodsRepository tGoodsRepository, TFactorysRepository tFactorysRepository) {
        this.cPurchaseConMRepository = cPurchaseConMRepository;
        this.cPurchaseConSRepository = cPurchaseConSRepository;
        this.tClientRepository = tClientRepository;
        this.tStaffRepository = tStaffRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tFactorysRepository = tFactorysRepository;
        h = new GetOrderNumber("I");
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
    //==================================================================================================================

    @RequestMapping(value = "/CPurCon_order", method = RequestMethod.GET)
    public String showAllCPurConM(ModelMap modelMap) {

        // 查询 采购合同(CPurchaseConMEntity) 表中所有记录
        List<CPurchaseConMEntity> cPurchaseConMEntityList = cPurchaseConMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntityList);

        // 返回ht目录下的CPurchaseConM.jsp页面
        return "ht/CPurchaseConM";
    }

    //======采购订单详情================================================================================================
    //===============================================================================================================

    @RequestMapping(value = "/detail/{cPurchaseConSPurchasConNo}", method = RequestMethod.GET)
    public String showCPurchaseConS(ModelMap modelMap, @PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo) {

        // 找到采购合同号(cPurchaseConSPurchasConNo)下所有的采购合同明细
        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        //通过采购合同号查询一条采购合同
        CPurchaseConMEntity cPurchaseConMEntitylist = cPurchaseConMRepository.findOne(cPurchaseConSPurchasConNo);

        //查找改订单合同下最大的明细ID号
        Integer detailId = (cPurchaseConSRepository.findMaxDetailId(cPurchaseConSPurchasConNo));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TFactorysEntity> Factorys =tFactorysCacheService.findAll(tFactorysRepository);//获取厂家信息
        List<TGoodsEntity> Goods = tGoodsCacheService.findAll(tGoodsRepository);//获取商品信息

        // 传递给请求页面
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Factorys", Factorys);
        modelMap.addAttribute("Goods", Goods);

        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntitylist);
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("cPurchaseConSPurchasConNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS";
    }

    //===============================================================================================================
    //======采购订单详情2===============================================================================================

    @RequestMapping(value = "/detail2/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String showCPurchaseConS2(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid, ModelMap modelMap ) {

        //通过采购合同号查询一条采购合同
        CPurchaseConMEntity cPurchaseConMEntitylist = cPurchaseConMRepository.findOne(cPurchaseConSPurchasConNo);

        // 找到cPurchaseConSPurchasConNo所表示的订单明细
        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        //获取该detailId下的详情
        CPurchaseConSEntity detail = cPurchaseConSRepository.findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(cPurchaseConSPurchasConNo,detailid);

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntitylist);
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("ordProcureNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS2";
    }


    //======添加采购合同================================================================================================

    // get请求，访问添加采购合同页面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCPurchaseConM(ModelMap modelMap) {

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TFactorysEntity> Factorys = tFactorysCacheService.findAll(tFactorysRepository);//获取厂家信息
        String UUID = h.getOrderNo();//获取UUID

        // 传递给请求页面
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("Factorys", Factorys);
        modelMap.addAttribute("UUID", UUID);

        // 转到CPurchaseConM_add.jsp页面
        return "ht/CPurchaseConM_add";
    }

    @RequestMapping(value = "/addM", method = RequestMethod.POST)
    public String addCPurhaseConMPost(HttpServletRequest request) {

            CPurchaseConMEntity cPurchaseConMEntity = new CPurchaseConMEntity();

            //获取页面传来的数据
            cPurchaseConMEntity.setcPurchaseConMPurchasConNo(request.getParameter("cPurchaseConMPurchasConNo"));
            cPurchaseConMEntity.setcPurchaseConMClientNo(request.getParameter("cPurchaseConMClientNo"));
            cPurchaseConMEntity.setcPurchaseConMChecker(request.getParameter("cPurchaseConMChecker"));
            cPurchaseConMEntity.setcPurchaseConMCreateNo(request.getParameter("cPurchaseConMCreateNo"));
            cPurchaseConMEntity.setcPurchaseConMGrossMode(request.getParameter("cPurchaseConMGrossMode"));
            cPurchaseConMEntity.setcPurchaseConMSalesman(request.getParameter("cPurchaseConMSalesman"));
            cPurchaseConMEntity.setcPurchaseConMNotes(request.getParameter("cPurchaseConMNotes"));
            cPurchaseConMEntity.setcPurchaseConMCustomerSalesmanName(request.getParameter("cPurchaseConMCustomerSalesmanName"));
            cPurchaseConMEntity.setcPurchaseConMValidity(new Integer(request.getParameter("cPurchaseConMValidity")));
            cPurchaseConMEntity.setcPurchaseConMFactoryGoodsNo(request.getParameter("cPurchaseConMFactoryGoodsNo"));
            cPurchaseConMEntity.setcPurchaseConMState("0");
        try {
            cPurchaseConMEntity.setcPurchaseConMConDate(new Timestamp(string2Date(request.getParameter("cPurchaseConMConDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 数据库中添加一个订单合同，并立即刷新缓存
        cPurchaseConMRepository.saveAndFlush(cPurchaseConMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/CPurCon_order";
    }

    //======添加采购明细合同================================================================================================

    // get请求，访问添加采购明细合同页面
    @RequestMapping(value = "/addS/{cPurchaseConSPurchasConNo}", method = RequestMethod.GET)
    public String addCPurchaseSonM(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, ModelMap modelMap) {

        //通过采购合同号查询一条采购合同
        CPurchaseConMEntity cPurchaseConMEntitylist = cPurchaseConMRepository.findOne(cPurchaseConSPurchasConNo);

        //通过采购合同明细号查询一条采购合同明细
        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        //查找改订单合同下最大的明细ID号
        Integer detailId = (cPurchaseConSRepository.findMaxDetailId(cPurchaseConSPurchasConNo));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }

        List<TGoodsEntity> Goods = tGoodsCacheService.findAll(tGoodsRepository);//获取商品信息
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntitylist);
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Goods", Goods);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("PurchasConNo", cPurchaseConSPurchasConNo);

        // 转到CPurchaseConS_add.jsp页面
        return "ht/CPurchaseConS_add";
    }

    @RequestMapping(value = "/addSS", method = RequestMethod.POST)
    public String addCPurhaseConSPost(CPurchaseConSEntity cPurchaseConSEntity) {

        cPurchaseConSEntity.setcPurchaseConSGroupNodeId("01");
        cPurchaseConSEntity.setcPurchaseConSFlag("1");

        // 数据库中添加一个订单合同，并立即刷新缓存
        cPurchaseConSRepository.saveAndFlush(cPurchaseConSEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/detail/"+cPurchaseConSEntity.getcPurchaseConSPurchasConNo();
    }

    //======修改采购合同================================================================================================

    // 更新采购合同信息 页面
    @RequestMapping(value = "/updateM/{cPurchaseConMPurchasConNo}", method = RequestMethod.GET)
    public String updateCPurchaseConM(@PathVariable("cPurchaseConMPurchasConNo") String cPurchaseConMPurchasConNo, ModelMap modelMap) {

        // 找到相应合同号所表示的合同
        CPurchaseConMEntity cPurchaseConMEntity = cPurchaseConMRepository.findOne(cPurchaseConMPurchasConNo);

        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息
        List<TClientEntity> Client = tClientCacheService.findAll(tClientRepository);//获取客户信息
        List<TFactorysEntity> Factorys = tFactorysCacheService.findAll(tFactorysRepository);//获取厂家信息

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntity);
        modelMap.addAttribute("Factorys", Factorys);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);

        return "ht/CPurchaseConM_update";
    }

    // 更新采购合同 信息操作
    @RequestMapping(value = "/updateMM", method = RequestMethod.POST)
    public String updateCPurchaseConMPost(CPurchaseConMEntity cPurchaseConMEntity) {

        //读取原state数据，赋值给cPurchaseConMEntity
        CPurchaseConMEntity c = cPurchaseConMRepository.findOne(cPurchaseConMEntity.getcPurchaseConMPurchasConNo());
        cPurchaseConMEntity.setcPurchaseConMState(c.getcPurchaseConMState());

        // 修改，并立即刷新缓存
        cPurchaseConMRepository.saveAndFlush(cPurchaseConMEntity);

        return "redirect:/CPurCon_order";
    }

    //======修改采购合同明细=============================================================================================

    // 更新采购合同明细信息 页面
    @RequestMapping(value = "/updateS/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String updateCPurchaseConS(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid, ModelMap modelMap ) {

        // 找到相应合同明细
        List<CPurchaseConSEntity> cPurchaseConSEntity = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        //通过采购合同号和采购合同明细号，定位一条明细
        CPurchaseConSEntity detail = cPurchaseConSRepository.findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(cPurchaseConSPurchasConNo,detailid);

        List<TGoodsEntity> Goods = tGoodsCacheService.findAll(tGoodsRepository);//获取商品信息
        List<TStaffEntity> Staff = tStaffCacheService.findAll(tStaffRepository);//获取员工信息

        // 传递给请求页面
        modelMap.addAttribute("Goods", Goods);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntity);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("ordProcureNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS_update";
    }

    // 更新采购合同明细 信息操作
    @RequestMapping(value = "/updateSS", method = RequestMethod.POST)
    public String updateCPurchaseConSPost(CPurchaseConSEntity cPurchaseConSEntity) {

        //读取原GroupNodeld, Flag数据，赋值给cPurchaseConSEntity
        CPurchaseConSEntity c = cPurchaseConSRepository.findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(cPurchaseConSEntity.getcPurchaseConSPurchasConNo(),cPurchaseConSEntity.getcPurchaseConSDetailId());
        cPurchaseConSEntity.setcPurchaseConSGroupNodeId(c.getcPurchaseConSGroupNodeId());
        cPurchaseConSEntity.setcPurchaseConSFlag(c.getcPurchaseConSFlag());

        // 修改，并立即刷新缓存
        cPurchaseConSRepository.saveAndFlush(cPurchaseConSEntity);

        return "redirect:/detail/"+cPurchaseConSEntity.getcPurchaseConSPurchasConNo();
    }

    //======删除采购合同明细=============================================================================================

    @RequestMapping(value = "/deleteS/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String deleteS(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid) {

        // 删除id为Id的用户
        cPurchaseConSRepository.deleteCPurchaseConSEntity(cPurchaseConSPurchasConNo, detailid);
        // 立即刷新
        cPurchaseConSRepository.flush();

        return "redirect:/detail/"+cPurchaseConSPurchasConNo;
    }

    //======删除采购合同=================================================================================================

    @RequestMapping(value = "/deleteM/{cPurchaseConMPurchasConNo}", method = RequestMethod.GET)
    public  String deleteM(@PathVariable("cPurchaseConMPurchasConNo") String cPurchaseConMPurchasConNo)
    {
        cPurchaseConMRepository.delete(cPurchaseConMPurchasConNo);
        cPurchaseConSRepository.deleteAllBycPurchaseConMPurchasConNoEquals(cPurchaseConMPurchasConNo);

        return "redirect:/CPurCon_order";
    }

}