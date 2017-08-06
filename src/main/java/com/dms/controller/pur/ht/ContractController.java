package com.dms.controller.pur.ht;

import com.dms.model.*;
import com.dms.repository.TClientRepository;
import com.dms.repository.TGoodsRepository;
import com.dms.repository.TStaffRepository;
import com.dms.repository.ht.CPurchaseConMRepository;
import com.dms.repository.ht.CPurchaseConSRepository;
import com.dms.serviceImpl.GetOrderNumber;
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

    final
    CPurchaseConMRepository cPurchaseConMRepository;

    final
    CPurchaseConSRepository cPurchaseConSRepository;

    final TClientRepository tClientRepository;

    final TStaffRepository tStaffRepository;

    final TGoodsRepository tGoodsRepository;

    @Autowired
    public ContractController(CPurchaseConMRepository cPurchaseConMRepository, CPurchaseConSRepository cPurchaseConSRepository, TClientRepository tClientRepository, TStaffRepository tStaffRepository, TGoodsRepository tGoodsRepository) {
        this.cPurchaseConMRepository = cPurchaseConMRepository;
        this.cPurchaseConSRepository = cPurchaseConSRepository;
        this.tClientRepository = tClientRepository;
        this.tStaffRepository = tStaffRepository;
        this.tGoodsRepository = tGoodsRepository;
        h = new GetOrderNumber("I");
    }

    //==================================================================================================================


    //==================================================================================================================

    @RequestMapping(value = "/CPurCon_order", method = RequestMethod.GET)
    public String showAllCPurConM(ModelMap modelMap) {
        // 查询 CPurchaseConMEntity 表中所有记录
        List<CPurchaseConMEntity> cPurchaseConMEntityList = cPurchaseConMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntityList);

        // 返回pages目录下的CPurchaseCon/CPurCon_order.jsp页面
        return "ht/CPurchaseConM";
    }

    //======采购订单详情================================================================================================

    @RequestMapping(value = "/detail/{cPurchaseConSPurchasConNo}", method = RequestMethod.GET)
    public String showCPurchaseConS(ModelMap modelMap, @PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo) {

        // 找到detaileId所表示的订单明细
        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("cPurchaseConSPurchasConNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS";
    }

    //======采购订单详情2===============================================================================================

    @RequestMapping(value = "/detail2/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String showCPurchaseConS2(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid, ModelMap modelMap ) {

        // 找到detaileId所表示的订单明细
        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);

        CPurchaseConSEntity detail = cPurchaseConSRepository.findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(cPurchaseConSPurchasConNo,detailid);

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("ordProcureNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS2";
    }


    //======添加采购合同================================================================================================

    // get请求，访问添加 页面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCPurchaseConM(ModelMap modelMap) {

        List<TStaffEntity> Staff = tStaffRepository.findAll();
        List<TClientEntity> Client = tClientRepository.findAll();

        String UUID = h.getOrderNo();
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);
        modelMap.addAttribute("UUID", UUID);

        // 转到addOrder.jsp页面
        return "ht/CPurchaseConM_add";
    }

    @RequestMapping(value = "/addM", method = RequestMethod.POST)
    public String addCPurhaseConMPost(CPurchaseConMEntity cPurchaseConMEntity, HttpServletRequest request) {

        try {
            cPurchaseConMEntity.setcPurchaseConMConDate(new Timestamp(string2Date(request.getParameter("cPurchaseConMConDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        cPurchaseConMEntity.setcPurchaseConMState("0");

        // 数据库中添加一个订单合同，并立即刷新缓存
        cPurchaseConMRepository.saveAndFlush(cPurchaseConMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/CPurCon_order";
    }

    //======添加采购明细合同================================================================================================

    // get请求，访问添加 页面
    @RequestMapping(value = "/addSS/{cPurchaseConSPurchasConNo}", method = RequestMethod.GET)
    public String addCPurchaseSonM(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, ModelMap modelMap) {

        List<CPurchaseConSEntity> cPurchaseConSEntitylist = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);
        Integer detailId = (cPurchaseConSRepository.findMaxDetailId(cPurchaseConSPurchasConNo));

        if(detailId == null){
            detailId = 1;
        }
        else {
            detailId += 1;
        }
        List<TGoodsEntity> Goods = tGoodsRepository.findAll();

        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntitylist);
        modelMap.addAttribute("Goods", Goods);
        modelMap.addAttribute("detailId", detailId);
        modelMap.addAttribute("PurchasConNo", cPurchaseConSPurchasConNo);

        // 转到addOrder.jsp页面
        return "ht/CPurchaseConS_add";
    }

    //======修改采购合同================================================================================================

    // 更新采购合同信息 页面
    @RequestMapping(value = "/updateM/{cPurchaseConMPurchasConNo}", method = RequestMethod.GET)
    public String updateCPurchaseConM(@PathVariable("cPurchaseConMPurchasConNo") String cPurchaseConMPurchasConNo, ModelMap modelMap) {

        // 找到相应合同号所表示的合同
        CPurchaseConMEntity cPurchaseConMEntity = cPurchaseConMRepository.findOne(cPurchaseConMPurchasConNo);
        List<TStaffEntity> Staff = tStaffRepository.findAll();
        List<TClientEntity> Client = tClientRepository.findAll();

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConM", cPurchaseConMEntity);
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("Client", Client);

        return "ht/CPurchaseConM_update";
    }

    // 更新用户信息 操作
//    @RequestMapping(value = "/updateMM", method = RequestMethod.POST)
//    public String updateCPurchaseConMPost(CPurchaseConMEntity cPurchaseConMEntity) {
//
//        // 更新用户信息
//        cPurchaseConMRepository.updateCPurchaseConM(cPurchaseConMEntity.getFactoryBillno(), cPurchaseConMEntity.getAdPaymoney(),
//                cPurchaseConMEntity.getPaymentAttributer(), cPurchaseConMEntity.getServiceAttribute(), cPurchaseConMEntity.getSumMoney(),
//                cPurchaseConMEntity.getCheckDate(), cPurchaseConMEntity.getOrdProcureNo());
//        cPurchaseConMRepository.flush(); // 刷新缓冲区
//        return "redirect:/CPurchaseCon/CPurchaseConM";
//    }

    //======修改采购合同明细=============================================================================================

    // 更新采购合同明细信息 页面
    @RequestMapping(value = "/updateS/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String updateCPurchaseConS(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid, ModelMap modelMap ) {

        // 找到相应合同明细
        List<CPurchaseConSEntity> cPurchaseConSEntity = cPurchaseConSRepository.findBypurchasConNo(cPurchaseConSPurchasConNo);;
        CPurchaseConSEntity detail = cPurchaseConSRepository.findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(cPurchaseConSPurchasConNo,detailid);

        // 传递给请求页面
        modelMap.addAttribute("cPurchaseConS", cPurchaseConSEntity);
        modelMap.addAttribute("detail", detail);
        modelMap.addAttribute("ordProcureNo", cPurchaseConSPurchasConNo);

        return "ht/CPurchaseConS_update";
    }

    //======删除采购合同================================================================================================

    @RequestMapping(value = "/deleteM/{cPurchaseConMPurchasConNo}", method = RequestMethod.GET)
    public String deleteCPurchaseConMEntity(@PathVariable("cPurchaseConMPurchasConNo") String cPurchaseConMPurchasConNo) {

        // 删除id为Id的用户
        cPurchaseConMRepository.delete(cPurchaseConMPurchasConNo);
        // 立即刷新
        cPurchaseConMRepository.flush();
        return "redirect:/ht/CPurchaseConM";
    }

    //======删除采购合同明细=============================================================================================

    @RequestMapping(value = "/deleteS/{cPurchaseConSPurchasConNo}&{detailid}", method = RequestMethod.GET)
    public String deleteCPurchaseConEntity(@PathVariable("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @PathVariable("detailid") Integer detailid) {

        // 删除id为Id的用户
        cPurchaseConSRepository.deleteCPurchaseConSEntity(cPurchaseConSPurchasConNo, detailid);
        // 立即刷新
        cPurchaseConSRepository.flush();
        return "redirect:/ht/CPurchaseConM";
    }

    //===============================================================================================================


}