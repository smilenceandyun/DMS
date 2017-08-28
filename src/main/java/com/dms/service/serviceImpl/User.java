package com.dms.service.serviceImpl;

/**
 * Created by laoli on 2017/7/6.
 */
public class User {
    String name;
    int sex;

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    int[] list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
