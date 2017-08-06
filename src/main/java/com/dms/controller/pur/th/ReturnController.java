package com.dms.controller.pur.th;

import com.dms.model.BRProcureMEntity;
import com.dms.model.BRProcureSEntity;
import com.dms.repository.th.BRProcureMRepository;
import com.dms.repository.th.BRProcureSRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Alex on 2017/8/3.
 */

@Controller
public class ReturnController {

    //==================================================================================================================

    final
    BRProcureMRepository  brProcureMRepository;

    final
    BRProcureSRepository brProcureSRepository;

    public ReturnController(BRProcureMRepository brProcureMRepository, BRProcureSRepository brProcureSRepository) {
        this.brProcureMRepository = brProcureMRepository;
        this.brProcureSRepository = brProcureSRepository;
    }

    //==================================================================================================================

    @RequestMapping(value = "/BRProM_order", method = RequestMethod.GET)
    public String showAllBRPorM(ModelMap modelMap) {
        // 查询 CPurchaseConMEntity 表中所有记录
        List<BRProcureMEntity> brProcureMEntityList = brProcureMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在cPurchaseConMEntityList当中
        modelMap.addAttribute("brProcureM", brProcureMEntityList);

        // 返回pages目录下的CPurchaseCon/CPurCon_order.jsp页面
        return "th/BRProcureM";
    }

    //======添加采购退货================================================================================================

    // get请求，访问添加 页面
    @RequestMapping(value = "/addR", method = RequestMethod.GET)
    public String addBRProcureM() {
        // 转到addOrder.jsp页面
        return "th/BRProcureM_add";
    }

    @RequestMapping(value = "/addRE", method = RequestMethod.POST)
    public String addBRProcureMPost(BRProcureMEntity brProcureMEntity) {

        // 数据库中添加一个订单合同，并立即刷新缓存
       brProcureMRepository.saveAndFlush(brProcureMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/ht/CPurchaseConM";
    }
}
