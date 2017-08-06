package com.dms.controller.pur.xy;

import com.dms.model.*;
import com.dms.repository.StoreLocationRepository;
import com.dms.repository.TGoodsRepository;
import com.dms.repository.TStaffRepository;
import com.dms.repository.ht.CPurchaseConMRepository;
import com.dms.repository.xy.PromotionMProductSRepository;
import com.dms.repository.xy.PromotionMRepository;
import com.dms.repository.xy.PromotionMSRepository;
import com.dms.serviceImpl.GetOrderNumber;
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
public class PromotionController {

    final PromotionMRepository mRepository;//协议主表
    final PromotionMSRepository sRepository;//协议明细表
    final PromotionMProductSRepository pRepository;//协议商品表
    final CPurchaseConMRepository conMRepository;//合同主表
    final TStaffRepository tStaffRepository;//员工
    final TGoodsRepository tGoodsRepository;//商品
    final StoreLocationRepository storeLocationRepository;//仓库
    final GetOrderNumber getNO;

    @Autowired
    public PromotionController(PromotionMRepository mRepository, PromotionMSRepository sRepository, PromotionMProductSRepository pRepository, CPurchaseConMRepository conMRepository, TStaffRepository tStaffRepository, TGoodsRepository tGoodsRepository, StoreLocationRepository storeLocationRepository) {
        this.mRepository = mRepository;
        this.sRepository = sRepository;
        this.pRepository = pRepository;
        this.conMRepository = conMRepository;
        this.tStaffRepository = tStaffRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.storeLocationRepository = storeLocationRepository;
        this.getNO = new GetOrderNumber("P");
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

    //采购协议所有
    @RequestMapping(value = "promotion")
    public  String index(ModelMap map)
    {

        List<PromotionMEntity> list = mRepository.findAll();

        map.addAttribute("list",list);

        return "xy/index";
    }

    //采购协议 添加单据
    @RequestMapping(value = "promotion/add")
    public  String add(ModelMap map)
    {
        //获得no
        map.addAttribute("no",getNO.getOrderNo());

        List<TStaffEntity> staffs = tStaffRepository.findAll();
        map.addAttribute("staffs",staffs);

        return "xy/add";
    }

    //采购协议  添加到数据库
    @RequestMapping(value = "promotion/adddb",method = RequestMethod.POST)
    public  String adddb(HttpServletRequest request)
    {

        PromotionMEntity entity = new PromotionMEntity();

        entity.setPromotionMPromotionNo(request.getParameter("promotionMPromotionNo"));
        entity.setPromotionMCreateNo(request.getParameter("promotionMCreateNo"));
        entity.setPromotionMPlanNo(request.getParameter("promotionMPlanNo"));
        entity.setPromotionMChecker(request.getParameter("promotionMChecker"));
        entity.setPromotionMSalesman(request.getParameter("promotionMSalesman"));
        entity.setPromotionMUrl(request.getParameter("promotionMUrl"));
        entity.setPromotionMFactPromotionNo(request.getParameter("promotionMFactPromotionNo"));
        entity.setPromotionMNotes(request.getParameter("promotionMNotes"));
        try {
            entity.setPromotionMStartDate(new Timestamp(string2Date(request.getParameter("promotionMStartDate")).getTime()));
            entity.setPromotionMEndDate(new Timestamp(string2Date(request.getParameter("promotionMEndDate")).getTime()));
            entity.setPromotionMCreateDate(new Timestamp(string2Date(request.getParameter("promotionMCreateDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        mRepository.saveAndFlush(entity);

        return "redirect:/promotion";
    }

    //采购协议明细
    @RequestMapping(value = "/promotion/detail/{no}")
    public  String detail(@PathVariable("no") String No, ModelMap map)
    {
        map.addAttribute("NO",No);
        List<PromotionMProductSEntity> mpros = pRepository.findAll();
        map.addAttribute("mpros",mpros);

        return "xy/detail";
    }

    //采购协议明细详情
    @RequestMapping(value = "/promotion/detailone/{no}&{id}")
    public  String detailone(@PathVariable("no") String No,@PathVariable("id") int id, ModelMap map)
    {
        map.addAttribute("NO",No);
        //获取所有明细
        List<PromotionMProductSEntity> mpros = pRepository.findAll();
        map.addAttribute("mpros",mpros);
        //该条详细
        PromotionMProductSEntity pro = pRepository.findByPromotionMProductSPromotionNoAndAndPromotionMProductSIndexIdEquals(No,id);
        map.addAttribute("pro",pro);
        return "xy/detail1";
    }

    //采购协议 添加明细
    @RequestMapping(value = "promotion/addDetail/{no}")
    public  String addDetail(@PathVariable("no") String No,ModelMap map)
    {
        //获得no
        map.addAttribute("no",No);

        //获取所有商品
        List<TGoodsEntity> goods = tGoodsRepository.findAll();
        map.addAttribute("goods",goods);

        //获取所有仓库
        List<StoreLocationEntity> stores = storeLocationRepository.findAll();
        map.addAttribute("stores",stores);

        return "xy/addDetail";
    }

    //采购协议 添加明细到数据库
    @RequestMapping(value = "promotion/addDetaildb")
    public  String addDetaildb(PromotionMProductSEntity entity,HttpServletRequest request)
    {

        entity.setPromotionMProductSDemandNumber(new BigDecimal("200.00"));
        entity.setPromotionMProductSGroupNodeId("01");

        String str_indexId = request.getParameter("promotionMProductSIndexId");
        if(str_indexId == null) {
            int indexid = 0;
            try {
                indexid = pRepository.findMaxIndexID(entity.getPromotionMProductSPromotionNo());
            } catch (Exception e) {
                e.printStackTrace();
            }
            indexid++;
            entity.setPromotionMProductSIndexId(indexid);
        }

        pRepository.saveAndFlush(entity);

        return "redirect:/promotion/detail/"+entity.getPromotionMProductSPromotionNo();
    }

    //删除明细
    @RequestMapping(value = "promotion/deleteDetail/{no}&{id}")
    public String deleteDetail(@PathVariable("no") String no,@PathVariable("id") int id)
    {
        pRepository.deleteByPromotionMProductSPromotionNoAndPromotionMProductSIndexIdEquals(no,id);

        return "redirect:/promotion/detail/"+no;
    }

    //删除单据
    @RequestMapping(value = "promotion/delete/{no}")
    public  String deleteDetail(@PathVariable("no") String no)
    {

        mRepository.delete(no);
        pRepository.deleteByPromotionMProductSPromotionNoanEquals(no);

        return "redirect:/promotion";
    }

    //更新单据
    @RequestMapping(value = "promotion/update/{no}")
    public String update(@PathVariable("no") String no,ModelMap map){

        PromotionMEntity entity = mRepository.findOne(no);
        map.addAttribute("mpro",entity);
        //获取所有员工
        List<TStaffEntity> staffs = tStaffRepository.findAll();
        map.addAttribute("staffs",staffs);

        return "xy/update";
    }

    //更新单据
    @RequestMapping(value = "promotion/updateDetail/{no}&{id}")
    public String updateDetail(@PathVariable("no") String no,@PathVariable("id") int id,ModelMap map){


        //获取所有商品
        List<TGoodsEntity> goods = tGoodsRepository.findAll();
        map.addAttribute("goods",goods);

        //获取所有仓库
        List<StoreLocationEntity> stores = storeLocationRepository.findAll();
        map.addAttribute("stores",stores);

        PromotionMProductSEntity productSEntity = pRepository.findByPromotionMProductSPromotionNoAndAndPromotionMProductSIndexIdEquals(no,id);
        map.addAttribute("product",productSEntity);
        map.addAttribute("no",productSEntity.getPromotionMProductSPromotionNo());

        return "xy/addDetail";
    }
}
