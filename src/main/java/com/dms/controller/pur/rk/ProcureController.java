package com.dms.controller.pur.rk;

import com.dms.model.*;
import com.dms.repository.StoreLocationRepository;
import com.dms.repository.TGoodsRepository;
import com.dms.repository.TRoomRepository;
import com.dms.repository.TStaffRepository;
import com.dms.repository.dd.BPurchaseOrdMRepository;
import com.dms.repository.rk.BProcureMRepository;
import com.dms.repository.rk.BProcureSRepository;
import com.dms.serviceImpl.GetOrderNumber;
import com.google.gson.Gson;
import org.springframework.aop.AopInvocationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class ProcureController {


    final BProcureMRepository mRepository;
    final BProcureSRepository sRepository;
    final BPurchaseOrdMRepository mOrdRepository;//订单
    final TGoodsRepository tGoodsRepository;//商品资料
    final TStaffRepository tStaffRepository;//员工
    final TRoomRepository tRoomRepository;//仓库
    final StoreLocationRepository storeLocationRepository;//库位
    static GetOrderNumber getNo; //生成NO
    final Gson gson;

    @Autowired
    public ProcureController(BProcureMRepository bProcureMRepository, BProcureSRepository bProcureSRepository, BPurchaseOrdMRepository mOrdRepository, TGoodsRepository tGoodsRepository, TRoomRepository tRoomRepository, TStaffRepository tStaffRepository, StoreLocationRepository storeLocationRepository) {
        this.mRepository = bProcureMRepository;
        this.sRepository = bProcureSRepository;
        this.mOrdRepository = mOrdRepository;
        this.tGoodsRepository = tGoodsRepository;
        this.tRoomRepository = tRoomRepository;
        this.tStaffRepository = tStaffRepository;
        this.storeLocationRepository = storeLocationRepository;
        this.gson = new Gson();
        getNo = new GetOrderNumber("R");
    }

    //采购入库所有订单查询
    @RequestMapping(value = "procure")
    public  String index(ModelMap map)
    {

        List<BProcureMEntity> list = mRepository.findAll();

        map.addAttribute("list",list);

        return "rk/index";
    }

    //采购入库 查看某条详情
    @RequestMapping(value = "procure/detail/{id}")
    public  String detail(@PathVariable("id") String id, ModelMap map)
    {
         List<BProcureSEntity> procures = sRepository.findByBProcureSProcureNoEquals(id);

         map.addAttribute("procures",procures);

         BProcureMEntity mEntity = mRepository.findOne(id);
         map.addAttribute("mpur",mEntity);

         return "rk/detail";
    }

    //采购入库 获取单条详细的数据
    @RequestMapping(value = "procure/detailone/{no}&{id}")
    public String detailOne(@PathVariable("no") String no,@PathVariable("id") Integer id,ModelMap map)
    {
        //获取该no下所有明细
        List<BProcureSEntity> procures = sRepository.findByBProcureSProcureNoEquals(no);

        map.addAttribute("procures",procures);

        //获取该DetailId下的详情
         List<BProcureSEntity> pros = sRepository.findByBProcureSProcureNoAndBProcureSDetailIdEquals(no,id);
         BProcureSEntity pro = pros.get(0);
         map.addAttribute("pro",pro);

         //获取订单号
        BProcureMEntity pm = mRepository.findOne(no);
        map.addAttribute("mpur",pm);

        return "rk/detail1";
    }

    //采购入库 添加
    @RequestMapping(value = "procure/add")
    public  String add(ModelMap map)
    {
        //获取No
        String no = getNo.getOrderNo();
        map.addAttribute("no",no);
        //获取员工
        List<TStaffEntity> staff = tStaffRepository.findAll();
        map.addAttribute("staff",staff);
        //获取所有订单
        List<BPurchaseOrdMEntity> purchaseOrdMEntityList = mOrdRepository.findAll();
        map.addAttribute("purOrds",purchaseOrdMEntityList);

        return "rk/add";
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

    //采购入库 保存单据头
    @RequestMapping(value = "procure/adddb",method = RequestMethod.POST)
    public String adddb(HttpServletRequest request)
    {
        BProcureMEntity procure = new BProcureMEntity();
        //获取页面传来的数据
        procure.setbProcureMProcureNo(request.getParameter("bProcureMProcureNo"));
        procure.setbProcureMOrdProcureNo(request.getParameter("bProcureMOrdProcureNo"));
        procure.setbProcureMHandbillNo(request.getParameter("bProcureMHandbillNo"));
        procure.setbProcureMHandbillNo(request.getParameter("bProcureMHandbillNo"));
        procure.setbProcureMWarehouseKep(request.getParameter("bProcureMWarehouseKep"));
        procure.setbProcureMNotes(request.getParameter("bProcureMNotes"));
        try {
            procure.setbProcureMCreateDate(new Timestamp(string2Date(request.getParameter("bProcureMCreateDate")).getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //创建人
        procure.setbProcureMCreateNo(procure.getbProcureMWarehouseKep()); //！！！！创建人先用仓管员代替，到时候改为登陆用户

        //修改人及日期
//        procure.setbProcureMModifiNo(procure.getbProcureMWarehouseKep());
//        procure.setbProcureMModifiTime();

        //打印次数
        procure.setbProcureMPrints(0);

        mRepository.saveAndFlush(procure);

        return "redirect:/procure/detail/"+procure.getbProcureMProcureNo();
    }

    //采购入库 添加明细
    @RequestMapping(value = "procure/addDetail/{no}")
    public  String addDetail(@PathVariable("no") String no,ModelMap map)
    {

        //获取采购单信息
        BProcureMEntity procure = mRepository.findOne(no);
        map.addAttribute("procure",procure);

        //获取商品资料
        List<TGoodsEntity> goods = tGoodsRepository.findAll();
        map.addAttribute("goods",goods);

        //获取所有仓库及库位信息
        List<TRoomEntity> roomes = tRoomRepository.findAll();
        List<StoreLocationEntity> stores = storeLocationRepository.findAll();
        map.addAttribute("rooms",roomes);
        map.addAttribute("stores",stores);

        return "rk/addDetail";
    }

    //采购入库 修改明细
    @RequestMapping(value = "procure/updateDetail/{no}&{id}")
    public  String updateDetail(@PathVariable("no") String no,@PathVariable("id") int id,ModelMap map)
    {

        //获取采购单信息
        BProcureMEntity procure = mRepository.findOne(no);
        map.addAttribute("procure",procure);

        //获取商品资料
        List<TGoodsEntity> goods = tGoodsRepository.findAll();
        map.addAttribute("goods",goods);

        //获取所有仓库及库位信息
        List<TRoomEntity> roomes = tRoomRepository.findAll();
        List<StoreLocationEntity> stores = storeLocationRepository.findAll();
        map.addAttribute("rooms",roomes);
        map.addAttribute("stores",stores);

        //获取该明细详情
        List<BProcureSEntity> spurs = sRepository.findByBProcureSProcureNoAndBProcureSDetailIdEquals(no,id);
        BProcureSEntity spur = spurs.get(0);
        map.addAttribute("spur",spur);

        return "rk/addDetail";
    }

    //采购入库 添加明细到数据库
    @RequestMapping(value = "procure/addDetaildb",method = RequestMethod.POST)
    public  String addDetaildb(BProcureSEntity sEntity,HttpServletRequest request)
    {
        //设置创建人
//        sEntity.setbProcureSCreateNo();  //!!设置为登录用户
        sEntity.setbProcureSCreateDate(new Timestamp(new Date().getTime()));

        //设置DeatilID
        String str1 = request.getParameter("bProcureSDetailId");
        if(str1 == null) {
            int detailID = 0;
            try {
                detailID = sRepository.findMaxDetailID(sEntity.getbProcureSProcureNo());
            } catch (AopInvocationException e) { //数据库无明细，无返回产生的异常
                e.printStackTrace();
            }
            detailID++;
            sEntity.setbProcureSDetailId(detailID);
        }

        //!!!数据库 到期日期 不能为空？？ hibernate错误如下：
//        org.hibernate.PropertyValueException: not-null property references a null or transient value : com.dms.model.BProcureSEntity.bProcureSExp
        sEntity.setbProcureSExp("0000-00-00");
//        机构编号、生产日期也是？？
        sEntity.setbProcureSGroupNodeId("01");
        sEntity.setbProcureSMfg("0000-00-00");

        sRepository.saveAndFlush(sEntity);


        return "redirect:/procure/detail/"+ sEntity.getbProcureSProcureNo();
    }

    //采购入库 删除明细
    @RequestMapping(value = "procure/deteleDetail/{no}&{id}")
    public  String deteleDetail(@PathVariable("no") String no,@PathVariable("id") int id ,ModelMap map)
    {

        int resutl = sRepository.deleteByBProcureSProcureNoAndBProcureSDetailIdEquals(no,id);

        map.addAttribute("reslut",resutl);
        return "redirect:/procure/detail/"+ no;
    }

    //采购入库 删除单据
    @RequestMapping(value = "procure/detele/{no}")
    public  String detele(@PathVariable("no") String no,ModelMap map)
    {
        mRepository.delete(no);
        sRepository.deleteAllByBProcureSProcureNoEquals(no);

        return "redirect:/procure";
    }
}
