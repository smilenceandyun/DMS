package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bill_type", schema = "dbo", catalog = "logistics")
public class BillTypeEntity {
    private String billTypeBillTypeNo;
    private String billTypeInvoiceTypeName;
    private String billTypeRemark;
    private String billTypeGroupNodeId;
    private String billTypeCreaterNo;
    private Timestamp billTypeCreateDate;
    private String billTypeModifiNo;
    private Timestamp billTypeModifiTime;
    private String billTypeFlag;
    private TOrgEntity tOrgByBillTypeGroupNodeId;
    private TStaffEntity tStaffByBillTypeCreaterNo;
    private TStaffEntity tStaffByBillTypeModifiNo;

    @Id
    @Column(name = "bill_type_bill_type_no", nullable = false, length = 4)
    public String getBillTypeBillTypeNo() {
        return billTypeBillTypeNo;
    }

    public void setBillTypeBillTypeNo(String billTypeBillTypeNo) {
        this.billTypeBillTypeNo = billTypeBillTypeNo;
    }

    @Basic
    @Column(name = "bill_type_invoice_type_name", nullable = false, length = 50)
    public String getBillTypeInvoiceTypeName() {
        return billTypeInvoiceTypeName;
    }

    public void setBillTypeInvoiceTypeName(String billTypeInvoiceTypeName) {
        this.billTypeInvoiceTypeName = billTypeInvoiceTypeName;
    }

    @Basic
    @Column(name = "bill_type_remark", nullable = true, length = 100)
    public String getBillTypeRemark() {
        return billTypeRemark;
    }

    public void setBillTypeRemark(String billTypeRemark) {
        this.billTypeRemark = billTypeRemark;
    }

    @Basic
    @Column(name = "bill_type_group_node_id", nullable = true, length = 20)
    public String getBillTypeGroupNodeId() {
        return billTypeGroupNodeId;
    }

    public void setBillTypeGroupNodeId(String billTypeGroupNodeId) {
        this.billTypeGroupNodeId = billTypeGroupNodeId;
    }

    @Basic
    @Column(name = "bill_type_creater_no", nullable = true, length = 8)
    public String getBillTypeCreaterNo() {
        return billTypeCreaterNo;
    }

    public void setBillTypeCreaterNo(String billTypeCreaterNo) {
        this.billTypeCreaterNo = billTypeCreaterNo;
    }

    @Basic
    @Column(name = "bill_type_create_date", nullable = true)
    public Timestamp getBillTypeCreateDate() {
        return billTypeCreateDate;
    }

    public void setBillTypeCreateDate(Timestamp billTypeCreateDate) {
        this.billTypeCreateDate = billTypeCreateDate;
    }

    @Basic
    @Column(name = "bill_type_modifi_no", nullable = true, length = 8)
    public String getBillTypeModifiNo() {
        return billTypeModifiNo;
    }

    public void setBillTypeModifiNo(String billTypeModifiNo) {
        this.billTypeModifiNo = billTypeModifiNo;
    }

    @Basic
    @Column(name = "bill_type_modifi_time", nullable = true)
    public Timestamp getBillTypeModifiTime() {
        return billTypeModifiTime;
    }

    public void setBillTypeModifiTime(Timestamp billTypeModifiTime) {
        this.billTypeModifiTime = billTypeModifiTime;
    }

    @Basic
    @Column(name = "bill_type_flag", nullable = false, length = -1)
    public String getBillTypeFlag() {
        return billTypeFlag;
    }

    public void setBillTypeFlag(String billTypeFlag) {
        this.billTypeFlag = billTypeFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillTypeEntity that = (BillTypeEntity) o;

        if (billTypeBillTypeNo != null ? !billTypeBillTypeNo.equals(that.billTypeBillTypeNo) : that.billTypeBillTypeNo != null)
            return false;
        if (billTypeInvoiceTypeName != null ? !billTypeInvoiceTypeName.equals(that.billTypeInvoiceTypeName) : that.billTypeInvoiceTypeName != null)
            return false;
        if (billTypeRemark != null ? !billTypeRemark.equals(that.billTypeRemark) : that.billTypeRemark != null)
            return false;
        if (billTypeGroupNodeId != null ? !billTypeGroupNodeId.equals(that.billTypeGroupNodeId) : that.billTypeGroupNodeId != null)
            return false;
        if (billTypeCreaterNo != null ? !billTypeCreaterNo.equals(that.billTypeCreaterNo) : that.billTypeCreaterNo != null)
            return false;
        if (billTypeCreateDate != null ? !billTypeCreateDate.equals(that.billTypeCreateDate) : that.billTypeCreateDate != null)
            return false;
        if (billTypeModifiNo != null ? !billTypeModifiNo.equals(that.billTypeModifiNo) : that.billTypeModifiNo != null)
            return false;
        if (billTypeModifiTime != null ? !billTypeModifiTime.equals(that.billTypeModifiTime) : that.billTypeModifiTime != null)
            return false;
        if (billTypeFlag != null ? !billTypeFlag.equals(that.billTypeFlag) : that.billTypeFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billTypeBillTypeNo != null ? billTypeBillTypeNo.hashCode() : 0;
        result = 31 * result + (billTypeInvoiceTypeName != null ? billTypeInvoiceTypeName.hashCode() : 0);
        result = 31 * result + (billTypeRemark != null ? billTypeRemark.hashCode() : 0);
        result = 31 * result + (billTypeGroupNodeId != null ? billTypeGroupNodeId.hashCode() : 0);
        result = 31 * result + (billTypeCreaterNo != null ? billTypeCreaterNo.hashCode() : 0);
        result = 31 * result + (billTypeCreateDate != null ? billTypeCreateDate.hashCode() : 0);
        result = 31 * result + (billTypeModifiNo != null ? billTypeModifiNo.hashCode() : 0);
        result = 31 * result + (billTypeModifiTime != null ? billTypeModifiTime.hashCode() : 0);
        result = 31 * result + (billTypeFlag != null ? billTypeFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "bill_type_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByBillTypeGroupNodeId() {
        return tOrgByBillTypeGroupNodeId;
    }

    public void settOrgByBillTypeGroupNodeId(TOrgEntity tOrgByBillTypeGroupNodeId) {
        this.tOrgByBillTypeGroupNodeId = tOrgByBillTypeGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "bill_type_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBillTypeCreaterNo() {
        return tStaffByBillTypeCreaterNo;
    }

    public void settStaffByBillTypeCreaterNo(TStaffEntity tStaffByBillTypeCreaterNo) {
        this.tStaffByBillTypeCreaterNo = tStaffByBillTypeCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "bill_type_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBillTypeModifiNo() {
        return tStaffByBillTypeModifiNo;
    }

    public void settStaffByBillTypeModifiNo(TStaffEntity tStaffByBillTypeModifiNo) {
        this.tStaffByBillTypeModifiNo = tStaffByBillTypeModifiNo;
    }
}
