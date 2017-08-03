package com.dms.controller.dd;
import com.dms.model.BPurchaseOrdMEntity;
import com.dms.model.BPurchaseOrdSEntity;
import com.dms.model.TStaffEntity;
import com.dms.repository.TStaffRepository;
import com.dms.repository.dd.BPurchaseOrdMRepository;
import com.dms.repository.dd.BPurchaseOrdSRepository;
//import com.dms.repository.T01Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import  com.dms.serviceImpl.GetOrderNumber;

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

    final TStaffRepository tStaffRepository;

    @Autowired
    public purController(BPurchaseOrdMRepository bPurchaseOrdMRepository, BPurchaseOrdSRepository bPurchaseOrdSRepository, TStaffRepository tStaffRepository) {
        this.bPurchaseOrdMRepository = bPurchaseOrdMRepository;
        this.bPurchaseOrdSRepository = bPurchaseOrdSRepository;
        this.tStaffRepository = tStaffRepository;
        c = new GetOrderNumber();
    }
    //============================================================================================

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //============================================================================================

    @RequestMapping(value = "/pur_order", method = RequestMethod.GET)
    public String showAllMes(ModelMap modelMap) {
        // 查询 BPurchaseOrdMEntity 表中所有记录
        List<BPurchaseOrdMEntity> bPurchaseOrdMEntiyList = bPurchaseOrdMRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在bPurchaseOrdMEntiyList当中
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntiyList);


        // 返回pages目录下的pur_order.jsp页面
        return "pur_order";
    }
    //============================================================================================
    // get请求，访问添加 页面
    @RequestMapping(value = "/pur_order/add", method = RequestMethod.GET)
    public String addBPurchaseOrdM(ModelMap modelMap) {
        List<TStaffEntity> Staff = tStaffRepository.findAll();


        String UUID = c.getOrderNo();
        modelMap.addAttribute("Staff", Staff);
        modelMap.addAttribute("UUID", UUID);

        // 转到addOrder.jsp页面
        return "/dd/addOrder";
    }
    //==========================================================
    @RequestMapping(value = "/pur_order/check", method = RequestMethod.GET)
    public void check(HttpServletRequest request){
        String a = request.getParameter("OrdProcureNo");
        System.out.println(a);
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
    }
    //============================================================================================
    @RequestMapping(value = "/pur_order/addP", method = RequestMethod.POST)
    public String addBPurchaseOrdMPost(BPurchaseOrdMEntity bPurchaseOrdMEntity) {

        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        bPurchaseOrdMRepository.saveAndFlush(bPurchaseOrdMEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/pur_order";
    }
    //============================================================================================
    // 更新用户信息 页面
    @RequestMapping(value = "/pur_order/update/{id}", method = RequestMethod.GET)
    public String updateBPurchaseOrdM(@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BPurchaseOrdMEntity bPurchaseOrdMEntity = bPurchaseOrdMRepository.findOne(id);

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdM", bPurchaseOrdMEntity);
        return "/dd/updateOrder";
    }
    //============================================================================================
//    // 更新用户信息 操作
//    @RequestMapping(value = "/pur_order/updateP", method = RequestMethod.POST)
//    public String updateOrderPost(PurorderEntity purorderEntity) {
//
//        // 更新用户信息
//        myRepository.updatePurOrder(purorderEntity.getOrderNo(), purorderEntity.getClientName(),
//                purorderEntity.getStorageNo(), purorderEntity.getAdvancedCharge(),purorderEntity.getPayWay(),purorderEntity.getSalesMan(),
//                purorderEntity.getCreateMan(),purorderEntity.getPurDetail(),purorderEntity.getId());
//        myRepository.flush(); // 刷新缓冲区
//        return "redirect:/pur_order";
//    }
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
        // 传递给请求页面
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
        return "redirect:/pur_order";
    }

    // 更新明细信息 页面
    @RequestMapping(value = "/pur_order/detaileOrder/update/{id}", method = RequestMethod.GET)
    public String updateBPurchaseOrdSEntity(@PathVariable("id") String id, ModelMap modelMap) {

        // 找到userId所表示的用户
        BPurchaseOrdSEntity bPurchaseOrdSEntity = bPurchaseOrdSRepository.findOne(id);

        // 传递给请求页面
        modelMap.addAttribute("bPurchaseOrdS", bPurchaseOrdSEntity);
        return "/dd/updateDetaileOrder";
    }

    //==============================================================================================

//    // 更新明细信息 操作
//    @RequestMapping(value = "/pur_order/detaileOrder/updateP", method = RequestMethod.POST)
//    public String updateBPurchaseOrdSEntityPost(DetaileEntity detaileEntity) {
//
//        // 更新用户信息
//        detaileRepository.updatePurOrder(detaileEntity.getDetaile1(), detaileEntity.getDetaile2(),
//                detaileEntity.getDetaile3(), detaileEntity.getDetaile4(),detaileEntity.getDetaileId());
//        detaileRepository.flush(); // 刷新缓冲区
//        return "redirect:/pur_order";
//    }

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
        return "/dd/detaileOrder";
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
