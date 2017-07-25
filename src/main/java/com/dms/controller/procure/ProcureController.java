package com.dms.controller.procure;

import com.dms.model.procure.BProcureMEntity;
import com.dms.model.procure.BProcureSEntity;
import com.dms.repository.procure.BProcureMRepository;
import com.dms.repository.procure.BProcureSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProcureController {


    final BProcureMRepository mRepository;

    final BProcureSRepository sRepository;

    @Autowired
    public ProcureController(BProcureMRepository bProcureMRepository, BProcureSRepository bProcureSRepository) {
        this.mRepository = bProcureMRepository;
        this.sRepository = bProcureSRepository;
    }

    @RequestMapping(value = "procure")
    public  String index(ModelMap map)
    {

        List<BProcureMEntity> list = mRepository.findAll();

        map.put("list",list);

        return "procure/index";
    }
    @RequestMapping(value = "procure/detail/{id}")
    public  String detail(@PathVariable("id") String id, ModelMap map)
    {
     List<BProcureSEntity> procures = sRepository.findById(id);

     map.put("procure",procures);

     return "procure/detail";
    }
}
