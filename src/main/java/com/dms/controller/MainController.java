package com.dms.controller;

import com.dms.model.pur.PurDetail;
import com.dms.model.pur.PurOrder;
import com.dms.serviceImpl.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * Created by Lin on 2017/6/27.
 */
@Controller
public class MainController {
    @Autowired
//    private UserService userService;
//    List<PurOrder> purOrderList = initial();


    List<PurOrder> initial(){
         List<PurOrder> purOrderList=new LinkedList<>();
        for(int i=0;i<10 ;i++)
        {
            PurOrder p=new PurOrder();
            p.setAdvancedCharge(1+i);
            p.setClientName("Client"+i);
            Person creatorMan=new Person();
            creatorMan.setName("creator"+i);
            p.setCreateMan(creatorMan);
            p.setDate("2017-7-"+(i+1));
            p.setId(i);
            p.setOrderNo("350181"+i);
            p.setPayWay("PayWay"+i);
            Person saleMan=new Person();
            saleMan.setName("saleMan"+i);
            p.setSalesMan(saleMan);
            p.setStorageNo("仓库"+i);
            p.setAdvancedCharge(1000+i);
            PurDetail purDetail=new PurDetail();
            purDetail.setCount(10+i);
            purDetail.setFactoryCode("Factory"+i);
            purDetail.setId(i);
            purDetail.setLifeTime(10+i);
            purDetail.setOrderNo(i);
            purDetail.setProductName("Product"+i);
            purDetail.setTotal(32+i);
            purDetail.setUnit("箱");
            List<PurDetail> purDetailList=new LinkedList<>();
            purDetailList.add(purDetail);
            p.setPurDetail(purDetailList);
            purOrderList.add(p);
        }
        return purOrderList;
    }

//    @RequestMapping(value = "index2", method = RequestMethod.GET)
//    public String index2(ModelMap modelMap) {
//        List<Person> personList2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Person person1 = new Person();
//            person1.setSex(i);
//            person1.setName("lin" + i);
//            personList2.add(person1);
//
//        }
//
//        modelMap.addAttribute("personList", personList2);
//        return "index2";
//
//    }

//    @RequestMapping(value = "index3",method = RequestMethod.POST)
//    public String index3(ModelMap modelMap, @ModelAttribute("p") Person p, Integer[] id)
//            {
//        System.out.println(id.length);
//
//        modelMap.addAttribute("p",p);
//
//        return "index3";
//    }

//    @RequestMapping(value = "/pur_order/pur_search",method = RequestMethod.POST)
//    public String purSearch( @RequestParam(value = "search") String search) {
//        purOrderList=initial();
//        return "index2";
//    }
//    @RequestMapping(value = "/pur_order/delete",method = RequestMethod.POST)
//    public String purDelete( @RequestParam(value = "qid[]") String[] id) {
//        int count=0;
//        for(String i:id)
//        {
//            int index=Integer.parseInt(i)-count;
//            purOrderList.remove(index);
//            count++;
//        }
//        return "index2";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test10", method = RequestMethod.GET)
    public String test3() {
        return "test3";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
        return "index2";
    }



    //    @RequestMapping(value = "pur_order", method = RequestMethod.GET)
//    public String pur_order(ModelMap modelMap, Integer[] checked_id) {
//        List<PurOrder> purOrderList = initial();
////        System.out.println(checked_id[0]);
//
////        这里以后转换为数据库CRUD操作，如  findAll（）;
//        for (int i = 0; i < 100; i++) {
//            Person person = new Person();
//            person.setSex(i);
//            person.setName("lin" + i);
//            personList.add(person);
//        }
//
//        modelMap.addAttribute("personList", personList);
//        return "pur_order";
//    }
//    @RequestMapping(value = "/pur_order", method = RequestMethod.GET)
//    public String pur_order(ModelMap modelMap) {
//
////        System.out.println(checked_id[0]);
//        modelMap.addAttribute("purOrderList", purOrderList);
//        return "pur_order";
//    }



}
