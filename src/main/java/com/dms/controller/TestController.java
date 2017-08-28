//package com.dms.controller;
//
//import com.dms.model.pur.PurDetailList;
//import com.dms.model.pur.PurOrder;
//import com.dms.service.serviceImpl.Person;
//import com.dms.service.serviceImpl.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by laoli on 2017/7/6. 参数绑定测试
// * Tips：理论上，Springmvc所有的数据绑定，都可以自动完成，只要页面上标签的name属性与方法参数名或对象属性名可意义对上即可
// * 但是，由于数据复杂，对象多，有时需要定制的参数传递方式，一下则为几种常用的参数传递方式
// * 所有的绑定 request.getParameter("name") 与 setName（name） 一一对应
// */
//@Controller
//public class TestController {
//
//    @RequestMapping(value = "submit")
//    public  String index()
//    {
//       return "test/submit";
//
//    }
//    @RequestMapping(value = "submit2")
//    public  String index2()
//    {
//        return "submit";
//
//    }
//
////    通过url请求获取参数，自动封装，测试地址 http://localhost:8081/test1?p1=2
//    @RequestMapping(value = "test1")
//    public  void get0(String p1, ModelMap modelMap)
//    {
//        modelMap.addAttribute("p1",p1);
//
//    }
//    //    通过url请求获取参数，由@RequestParam进行指定封装，测试地址 http://localhost:8081/test2?p2=2
//    @RequestMapping(value = "test2",method = RequestMethod.GET)
//    public  String get1(@RequestParam(value = "p2",required = true) String p1, ModelMap modelMap)
//    {
//        modelMap.addAttribute("p2",p1);
//        return "test/result";
//    }
//
//    //    将对象数据传递给页面使用，ModelMap.addAttribute()方法，测试地址http://localhost:8081/test3
//    @RequestMapping(value = "test3",method = RequestMethod.GET)
//    public  String test1(ModelMap modelMap)
//    {
//        Person person=new Person();
//        person.setName("lin");
//        person.setSex(1);
//
//        modelMap.addAttribute("p",person);
//        return "test/result";
//    }
//
//    //    对象内包含数组，页面调用时加上数组下标即可，测试地址http://localhost:8081/test4
//    @RequestMapping(value = "test4",method = RequestMethod.GET)
//    public  String test2(ModelMap modelMap)
//    {
//        Person person=new Person();
//        person.setName("lin");
//        person.setSex(1);
//        int[] a=new int[]{1,2,3};
//        person.setList(a);
//        modelMap.addAttribute("p4",person);
//        return "test/result";
//    }
//
//    //    同名参数绑定，如类Person跟类User中均有属性 name，使用initbinder工具类。需先从上一页面传递参数过来。测试地址http://localhost:8081/submit
//    @InitBinder("person")
//    public void initPersonBinder(WebDataBinder binder) {
//        binder.setFieldDefaultPrefix("per."); //页面中使用这一个标识，如per.name
//    }
//
//    @InitBinder("user")
//    public void initUserBinder(WebDataBinder binder) {
//        binder.setFieldDefaultPrefix("user.");
//    }
//    @RequestMapping(value = "test5",method = RequestMethod.POST)
//    public  String test3(@ModelAttribute("person") Person person,@ModelAttribute( "user")User user,ModelMap modelMap)
//    {
//        System.out.println(user.getName());
//        System.out.println(person.getName());
//
//        return "test/result";
//    }
//
//    //绑定类中类,若该类中类包含1对多关系，需要新建一个超类，专门用于包含该List，如下PurDetailList，即可获取参数，重新复制即可（line100）。springmvc中不允许直接传递list<class>对象12121
//    @RequestMapping(value = "test6",method = RequestMethod.POST)
//    public  String test9(PurOrder purOrder, ModelMap modelMap, PurDetailList purDetail)
//    {
//
//        purOrder.setPurDetail(purDetail.getPurDetail());
//        modelMap.addAttribute("p1",purOrder);
//
//        return "test1";
//    }
//
//    //绑定数组 Integer[] list, 定义数组名，与页面name属性对应即可
//    @RequestMapping(value = "test7",method = RequestMethod.GET)
//    public  String test3(Integer[] list)
//    {
//        return "test/result";
//    }
//
//    //绑定数组 Integer[] list, 定义数组名，与页面name属性对应即可
//    @RequestMapping(value = "test20",method = RequestMethod.POST)
//    public  String test10(@ModelAttribute("command") User user,ModelMap modelMap)
//    {
//        modelMap.addAttribute("p1",user);
//
//        return "test/result2";
//    }
//
//
//}
