package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pay_type", schema = "dbo", catalog = "logistics")
public class PayTypeEntity {
    private String payTypePayTypeNo;
    private String payTypePaymentName;
    private String payTypeRemark;
    private String payTypeGroupNodeId;
    private String payTypeCreaterNo;
    private Timestamp payTypeCreateDate;
    private String payTypeModifiNo;
    private Timestamp payTypeModifiTime;
    private String payTypeFlag;
    private TOrgEntity tOrgByPayTypeGroupNodeId;
    private TStaffEntity tStaffByPayTypeCreaterNo;
    private TStaffEntity tStaffByPayTypeModifiNo;

    @Id
    @Column(name = "pay_type_pay_type_no", nullable = false, length = 6)
    public String getPayTypePayTypeNo() {
        return payTypePayTypeNo;
    }

    public void setPayTypePayTypeNo(String payTypePayTypeNo) {
        this.payTypePayTypeNo = payTypePayTypeNo;
    }

    @Basic
    @Column(name = "pay_type_payment_name", nullable = false, length = 50)
    public String getPayTypePaymentName() {
        return payTypePaymentName;
    }

    public void setPayTypePaymentName(String payTypePaymentName) {
        this.payTypePaymentName = payTypePaymentName;
    }

    @Basic
    @Column(name = "pay_type_remark", nullable = true, length = 100)
    public String getPayTypeRemark() {
        return payTypeRemark;
    }

    public void setPayTypeRemark(String payTypeRemark) {
        this.payTypeRemark = payTypeRemark;
    }

    @Basic
    @Column(name = "pay_type_group_node_id", nullable = false, length = 20)
    public String getPayTypeGroupNodeId() {
        return payTypeGroupNodeId;
    }

    public void setPayTypeGroupNodeId(String payTypeGroupNodeId) {
        this.payTypeGroupNodeId = payTypeGroupNodeId;
    }

    @Basic
    @Column(name = "pay_type_creater_no", nullable = true, length = 8)
    public String getPayTypeCreaterNo() {
        return payTypeCreaterNo;
    }

    public void setPayTypeCreaterNo(String payTypeCreaterNo) {
        this.payTypeCreaterNo = payTypeCreaterNo;
    }

    @Basic
    @Column(name = "pay_type_create_date", nullable = true)
    public Timestamp getPayTypeCreateDate() {
        return payTypeCreateDate;
    }

    public void setPayTypeCreateDate(Timestamp payTypeCreateDate) {
        this.payTypeCreateDate = payTypeCreateDate;
    }

    @Basic
    @Column(name = "pay_type_modifi_no", nullable = true, length = 8)
    public String getPayTypeModifiNo() {
        return payTypeModifiNo;
    }

    public void setPayTypeModifiNo(String payTypeModifiNo) {
        this.payTypeModifiNo = payTypeModifiNo;
    }

    @Basic
    @Column(name = "pay_type_modifi_time", nullable = true)
    public Timestamp getPayTypeModifiTime() {
        return payTypeModifiTime;
    }

    public void setPayTypeModifiTime(Timestamp payTypeModifiTime) {
        this.payTypeModifiTime = payTypeModifiTime;
    }

    @Basic
    @Column(name = "pay_type_flag", nullable = false, length = -1)
    public String getPayTypeFlag() {
        return payTypeFlag;
    }

    public void setPayTypeFlag(String payTypeFlag) {
        this.payTypeFlag = payTypeFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayTypeEntity that = (PayTypeEntity) o;

        if (payTypePayTypeNo != null ? !payTypePayTypeNo.equals(that.payTypePayTypeNo) : that.payTypePayTypeNo != null)
            return false;
        if (payTypePaymentName != null ? !payTypePaymentName.equals(that.payTypePaymentName) : that.payTypePaymentName != null)
            return false;
        if (payTypeRemark != null ? !payTypeRemark.equals(that.payTypeRemark) : that.payTypeRemark != null)
            return false;
        if (payTypeGroupNodeId != null ? !payTypeGroupNodeId.equals(that.payTypeGroupNodeId) : that.payTypeGroupNodeId != null)
            return false;
        if (payTypeCreaterNo != null ? !payTypeCreaterNo.equals(that.payTypeCreaterNo) : that.payTypeCreaterNo != null)
            return false;
        if (payTypeCreateDate != null ? !payTypeCreateDate.equals(that.payTypeCreateDate) : that.payTypeCreateDate != null)
            return false;
        if (payTypeModifiNo != null ? !payTypeModifiNo.equals(that.payTypeModifiNo) : that.payTypeModifiNo != null)
            return false;
        if (payTypeModifiTime != null ? !payTypeModifiTime.equals(that.payTypeModifiTime) : that.payTypeModifiTime != null)
            return false;
        if (payTypeFlag != null ? !payTypeFlag.equals(that.payTypeFlag) : that.payTypeFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payTypePayTypeNo != null ? payTypePayTypeNo.hashCode() : 0;
        result = 31 * result + (payTypePaymentName != null ? payTypePaymentName.hashCode() : 0);
        result = 31 * result + (payTypeRemark != null ? payTypeRemark.hashCode() : 0);
        result = 31 * result + (payTypeGroupNodeId != null ? payTypeGroupNodeId.hashCode() : 0);
        result = 31 * result + (payTypeCreaterNo != null ? payTypeCreaterNo.hashCode() : 0);
        result = 31 * result + (payTypeCreateDate != null ? payTypeCreateDate.hashCode() : 0);
        result = 31 * result + (payTypeModifiNo != null ? payTypeModifiNo.hashCode() : 0);
        result = 31 * result + (payTypeModifiTime != null ? payTypeModifiTime.hashCode() : 0);
        result = 31 * result + (payTypeFlag != null ? payTypeFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "pay_type_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByPayTypeGroupNodeId() {
        return tOrgByPayTypeGroupNodeId;
    }

    public void settOrgByPayTypeGroupNodeId(TOrgEntity tOrgByPayTypeGroupNodeId) {
        this.tOrgByPayTypeGroupNodeId = tOrgByPayTypeGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "pay_type_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPayTypeCreaterNo() {
        return tStaffByPayTypeCreaterNo;
    }

    public void settStaffByPayTypeCreaterNo(TStaffEntity tStaffByPayTypeCreaterNo) {
        this.tStaffByPayTypeCreaterNo = tStaffByPayTypeCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "pay_type_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPayTypeModifiNo() {
        return tStaffByPayTypeModifiNo;
    }

    public void settStaffByPayTypeModifiNo(TStaffEntity tStaffByPayTypeModifiNo) {
        this.tStaffByPayTypeModifiNo = tStaffByPayTypeModifiNo;
    }
}
