package com.dms.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

public class TimestampConverter  implements Converter<String,Timestamp>{

    @Override
    public Timestamp convert(String arg0) {
        // TODO Auto-generated method stub
        if(StringUtils.isNotEmpty(arg0.trim())){

            try {
                Timestamp timestamp=new  Timestamp(string2Date(arg0).getTime());

                return timestamp;

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return null;

    }

    public final static java.sql.Date string2Date(String dateString)
            throws java.lang.Exception {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        dateFormat.setLenient(false);
        java.util.Date timeDate = dateFormat.parse(dateString);//util类型
        java.sql.Date dateTime = new java.sql.Date(timeDate.getTime());//sql类型
        return dateTime;
    }


}
