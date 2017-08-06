package com.dms.controller.pur.th;

import com.dms.model.*;
import com.dms.repository.TFactorysRepository;
import com.dms.repository.TGoodsRepository;
import com.dms.repository.TRoomRepository;
import com.dms.repository.TStaffRepository;
import com.dms.repository.dd.BPurchaseOrdMRepository;
import com.dms.repository.th.BRProcureMRepository;
import com.dms.repository.th.BRProcureSRepository;
import com.dms.serviceImpl.GetOrderNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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

    public ReturnController(BRProcureMRepository brProcureMRepository, BRProcureSRepository brProcureSRepository, TStaffRepository tStaffRepository, TGoodsRepository tGoodsRepository, TFactorysRepository tFactorysRepository, TRoomRepository tRoomRepository, BPurchaseOrdMRepository bPurchaseOrdMRepository) {
        this.brProcureMRepository = brProcureMRepository;
        this.brProcureSRepository = brProcureSRepository;
        this.tStaffRepository = tStaffRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tFactorysRepository = tFactorysRepository;
        this.tRoomRepository = tRoomRepository;
        this.bPurchaseOrdMRepository = bPurchaseOrdMRepository;
        t = new GetOrderNumber("t");
    }

    //==================================================================================================================

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

        List<TStaffEntity> Staff = tStaffRepository.findAll();//获取员工信息
        List<TFactorysEntity> Factorys = tFactorysRepository.findAll();//获取厂家信息
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
}
