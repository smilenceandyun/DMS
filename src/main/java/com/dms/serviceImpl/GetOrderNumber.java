package com.dms.serviceImpl;

import com.dms.service.dd.getOrderNo;
import java.text.SimpleDateFormat;
import java.util.*;

public class GetOrderNumber implements getOrderNo {

    public String  beforetime = "19961130";
    public String  lasttime;
    public Integer num;
    public String orderNo;
    public String No;


    //@Override
    public GetOrderNumber(String No){
        this.No = No;
    }
    public String getOrderNo(){

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        lasttime = df.format(new Date()).toString();
//        if (beforetime == null){
//            num = 0000;
//            getUniqueID();
//        }
        //boolean a=beforetime.equals(lasttime);
         if (beforetime.equals(lasttime)){

             getUniqueID();

         }
         else {

             beforetime = null;
             num = 0000;
             getUniqueID();
         }
        //System.out.println(orderNo+"------------------");
        beforetime = lasttime;
        return orderNo;
    }


    public String getUniqueID(){

        if (num == 0000){
            num = 0001;
            String num2= String.format("%04d",num);
            orderNo = No + lasttime + num2 ;


        }
        else{
            num++;
            String num3= String.format("%04d",num);
            orderNo = No + lasttime + num3;
        }
        return lasttime ;
    }

}
