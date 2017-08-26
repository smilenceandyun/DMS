package com.dms.model.pur;

import com.dms.service.serviceImpl.Person;

import java.util.List;

/**
 * Created by laoli on 2017/7/13.
 */
public class PurOrder {
    int id;
    String  orderNo;
    String clientName;
    String storageNo;
    int advancedCharge;
    String payWay;
    Person salesMan;
    Person createMan;
    String date;
    List<PurDetail> purDetail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStorageNo() {
        return storageNo;
    }

    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo;
    }

    public int getAdvancedCharge() {
        return advancedCharge;
    }

    public void setAdvancedCharge(int advancedCharge) {
        this.advancedCharge = advancedCharge;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Person getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(Person salesMan) {
        this.salesMan = salesMan;
    }

    public Person getCreateMan() {
        return createMan;
    }

    public void setCreateMan(Person createMan) {
        this.createMan = createMan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<PurDetail> getPurDetail() {
        return purDetail;
    }

    public void setPurDetail(List<PurDetail> purDetail) {
        this.purDetail = purDetail;
    }
}
