package com.dms.controller.pur.rk;

import com.dms.model.BProcureMEntity;
import com.dms.model.BProcureSEntity;
import com.dms.model.TStaffEntity;
import com.dms.repository.TStaffRepository;
import com.dms.repository.rk.BProcureMRepository;
import com.dms.repository.rk.BProcureSRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class ProcureController {


    final BProcureMRepository mRepository;

    final BProcureSRepository sRepository;

    final TStaffRepository tStaffRepository;//员工

    final Gson gson;

    @Autowired
    public ProcureController(BProcureMRepository bProcureMRepository, BProcureSRepository bProcureSRepository, TStaffRepository tStaffRepository) {
        this.mRepository = bProcureMRepository;
        this.sRepository = bProcureSRepository;
        this.tStaffRepository = tStaffRepository;
        this.gson = new Gson();
    }

    //采购入库所有订单查询
    @RequestMapping(value = "procure")
    public  String index(ModelMap map)
    {

        List<BProcureMEntity> list = mRepository.findAll();

        map.put("list",list);

        return "rk/index";
    }

    //采购入库 查看某条详情
    @RequestMapping(value = "procure/detail/{id}")
    public  String detail(@PathVariable("id") String id, ModelMap map)
    {
     List<BProcureSEntity> procures = sRepository.findByBProcureSProcureNoEquals(id);

     map.put("rk",procures);

     return "rk/detail";
    }

    //采购入库 获取单条详细的数据
    @RequestMapping(value = "procure/detail/one/{no}/{id}")
    public void detailOne(@PathVariable("no") String no,@PathVariable("id") Integer id, HttpServletResponse response)
    {
     List<BProcureSEntity> procures = sRepository.findByBProcureSProcureNoAndBProcureSDetailIdEquals(no,id);

        try {
            String str = gson.toJson(procures);
            response.getWriter().write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }


//     return "rk/detail";
    }

    //采购入库 添加
    @RequestMapping(value = "procure/add")
    public  String detail(ModelMap map)
    {
        List<TStaffEntity> staff = tStaffRepository.findAll();

        map.put("staff",staff);

        return "rk/add";
    }
}
