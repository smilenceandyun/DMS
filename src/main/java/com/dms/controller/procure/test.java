//package com.dms.controller.procure;
//
//import com.dms.service.dd.getOrderNo;
//import com.dms.serviceImpl.GetOrderNumber;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class test implements getOrderNo {
//
//    public String  beforetime = "qq";
//    public String  lasttime;
//    public Integer num;
//    public String orderNo;
//
//
//    @Override
//    public String getOrderNo(){
//
//        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
//        lasttime = df.format(new Date()).toString();
////        if (beforetime == null){
////            num = 0000;
////            getUniqueID();
////        }
//        if (beforetime.equals(lasttime)){
//
//            getUniqueID();
//
//        }
//        else {
//            beforetime = null;
//            num = 0000;
//            getUniqueID();
//        }
//        //System.out.println(orderNo+"------------------");
//        beforetime = lasttime;
//        return orderNo;
//    }
//
//
//    public String getUniqueID(){
//
//        if (num == 0000){
//            num = 0001;
//            String a=String.format("%04d",num);
//            orderNo = "O"+lasttime + num ;
//
//        }
//        else{
//            num++;
//            orderNo = "O"+ lasttime + num ;
//        }
//        return lasttime ;
//    }
//
//    public static void main(String[] args) {
//        GetOrderNumber c;
//
//        c=new GetOrderNumber();
//
//        c.getOrderNo();
//        System.out.println(c);
//    }
//}
