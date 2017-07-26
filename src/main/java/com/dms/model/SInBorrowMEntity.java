package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_in_borrow_m", schema = "dbo", catalog = "logistics_test")
public class SInBorrowMEntity {
    private String sInBorrowMInBorrowNo;
    private String sInBorrowMHandbillNo;
    private String sInBorrowMClientNo;
    private String sInBorrowMPaymentAttributer;
    private BigDecimal sInBorrowMAdPaymoney;
    private BigDecimal sInBorrowMDiscount;
    private String sInBorrowMBorrowUnit;
    private String sInBorrowMDeliveryDate;
    private String sInBorrowMSalesman;
    private String sInBorrowMServiceAttribute;
    private BigDecimal sInBorrowMSumMoney;
    private String sInBorrowMWarehouseKeeper;
    private String sInBorrowMCreaterNo;
    private Timestamp sInBorrowMCreateDate;
    private String sInBorrowMModifiNo;
    private Timestamp sInBorrowMModifiTime;
    private String sInBorrowMChecker;
    private Timestamp sInBorrowMCheckDate;
    private String sInBorrowMGroupNodeId;
    private Integer sInBorrowMPrints;
    private String sInBorrowMState;
    private String sInBorrowMNotes;
    private String sInBorrowMIsPass;
    private TClientEntity tClientBySInBorrowMClientNo;
    private TStaffEntity tStaffBySInBorrowMSalesman;
    private TStaffEntity tStaffBySInBorrowMWarehouseKeeper;
    private TStaffEntity tStaffBySInBorrowMCreaterNo;
    private TStaffEntity tStaffBySInBorrowMModifiNo;
    private TStaffEntity tStaffBySInBorrowMChecker;
    private TOrgEntity tOrgBySInBorrowMGroupNodeId;

    @Id
    @Column(name = "s_in_borrow_m_in_borrow_no", nullable = false, length = 16)
    public String getsInBorrowMInBorrowNo() {
        return sInBorrowMInBorrowNo;
    }

    public void setsInBorrowMInBorrowNo(String sInBorrowMInBorrowNo) {
        this.sInBorrowMInBorrowNo = sInBorrowMInBorrowNo;
    }

    @Basic
    @Column(name = "s_in_borrow_m_handbill_no", nullable = true, length = 20)
    public String getsInBorrowMHandbillNo() {
        return sInBorrowMHandbillNo;
    }

    public void setsInBorrowMHandbillNo(String sInBorrowMHandbillNo) {
        this.sInBorrowMHandbillNo = sInBorrowMHandbillNo;
    }

    @Basic
    @Column(name = "s_in_borrow_m_client_no", nullable = true, length = 20)
    public String getsInBorrowMClientNo() {
        return sInBorrowMClientNo;
    }

    public void setsInBorrowMClientNo(String sInBorrowMClientNo) {
        this.sInBorrowMClientNo = sInBorrowMClientNo;
    }

    @Basic
    @Column(name = "s_in_borrow_m_payment_attributer", nullable = false, length = 20)
    public String getsInBorrowMPaymentAttributer() {
        return sInBorrowMPaymentAttributer;
    }

    public void setsInBorrowMPaymentAttributer(String sInBorrowMPaymentAttributer) {
        this.sInBorrowMPaymentAttributer = sInBorrowMPaymentAttributer;
    }

    @Basic
    @Column(name = "s_in_borrow_m_ad_paymoney", nullable = false, precision = 4)
    public BigDecimal getsInBorrowMAdPaymoney() {
        return sInBorrowMAdPaymoney;
    }

    public void setsInBorrowMAdPaymoney(BigDecimal sInBorrowMAdPaymoney) {
        this.sInBorrowMAdPaymoney = sInBorrowMAdPaymoney;
    }

    @Basic
    @Column(name = "s_in_borrow_m_discount", nullable = false, precision = 6)
    public BigDecimal getsInBorrowMDiscount() {
        return sInBorrowMDiscount;
    }

    public void setsInBorrowMDiscount(BigDecimal sInBorrowMDiscount) {
        this.sInBorrowMDiscount = sInBorrowMDiscount;
    }

    @Basic
    @Column(name = "s_in_borrow_m_borrow_unit", nullable = true, length = 10)
    public String getsInBorrowMBorrowUnit() {
        return sInBorrowMBorrowUnit;
    }

    public void setsInBorrowMBorrowUnit(String sInBorrowMBorrowUnit) {
        this.sInBorrowMBorrowUnit = sInBorrowMBorrowUnit;
    }

    @Basic
    @Column(name = "s_in_borrow_m_delivery_date", nullable = true, length = 12)
    public String getsInBorrowMDeliveryDate() {
        return sInBorrowMDeliveryDate;
    }

    public void setsInBorrowMDeliveryDate(String sInBorrowMDeliveryDate) {
        this.sInBorrowMDeliveryDate = sInBorrowMDeliveryDate;
    }

    @Basic
    @Column(name = "s_in_borrow_m_salesman", nullable = true, length = 8)
    public String getsInBorrowMSalesman() {
        return sInBorrowMSalesman;
    }

    public void setsInBorrowMSalesman(String sInBorrowMSalesman) {
        this.sInBorrowMSalesman = sInBorrowMSalesman;
    }

    @Basic
    @Column(name = "s_in_borrow_m_service_attribute", nullable = true, length = 4)
    public String getsInBorrowMServiceAttribute() {
        return sInBorrowMServiceAttribute;
    }

    public void setsInBorrowMServiceAttribute(String sInBorrowMServiceAttribute) {
        this.sInBorrowMServiceAttribute = sInBorrowMServiceAttribute;
    }

    @Basic
    @Column(name = "s_in_borrow_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getsInBorrowMSumMoney() {
        return sInBorrowMSumMoney;
    }

    public void setsInBorrowMSumMoney(BigDecimal sInBorrowMSumMoney) {
        this.sInBorrowMSumMoney = sInBorrowMSumMoney;
    }

    @Basic
    @Column(name = "s_in_borrow_m_warehouse_keeper", nullable = true, length = 8)
    public String getsInBorrowMWarehouseKeeper() {
        return sInBorrowMWarehouseKeeper;
    }

    public void setsInBorrowMWarehouseKeeper(String sInBorrowMWarehouseKeeper) {
        this.sInBorrowMWarehouseKeeper = sInBorrowMWarehouseKeeper;
    }

    @Basic
    @Column(name = "s_in_borrow_m_creater_no", nullable = false, length = 8)
    public String getsInBorrowMCreaterNo() {
        return sInBorrowMCreaterNo;
    }

    public void setsInBorrowMCreaterNo(String sInBorrowMCreaterNo) {
        this.sInBorrowMCreaterNo = sInBorrowMCreaterNo;
    }

    @Basic
    @Column(name = "s_in_borrow_m_create_date", nullable = false)
    public Timestamp getsInBorrowMCreateDate() {
        return sInBorrowMCreateDate;
    }

    public void setsInBorrowMCreateDate(Timestamp sInBorrowMCreateDate) {
        this.sInBorrowMCreateDate = sInBorrowMCreateDate;
    }

    @Basic
    @Column(name = "s_in_borrow_m_modifi_no", nullable = false, length = 8)
    public String getsInBorrowMModifiNo() {
        return sInBorrowMModifiNo;
    }

    public void setsInBorrowMModifiNo(String sInBorrowMModifiNo) {
        this.sInBorrowMModifiNo = sInBorrowMModifiNo;
    }

    @Basic
    @Column(name = "s_in_borrow_m_modifi_time", nullable = false)
    public Timestamp getsInBorrowMModifiTime() {
        return sInBorrowMModifiTime;
    }

    public void setsInBorrowMModifiTime(Timestamp sInBorrowMModifiTime) {
        this.sInBorrowMModifiTime = sInBorrowMModifiTime;
    }

    @Basic
    @Column(name = "s_in_borrow_m_checker", nullable = false, length = 8)
    public String getsInBorrowMChecker() {
        return sInBorrowMChecker;
    }

    public void setsInBorrowMChecker(String sInBorrowMChecker) {
        this.sInBorrowMChecker = sInBorrowMChecker;
    }

    @Basic
    @Column(name = "s_in_borrow_m_check_date", nullable = false)
    public Timestamp getsInBorrowMCheckDate() {
        return sInBorrowMCheckDate;
    }

    public void setsInBorrowMCheckDate(Timestamp sInBorrowMCheckDate) {
        this.sInBorrowMCheckDate = sInBorrowMCheckDate;
    }

    @Basic
    @Column(name = "s_in_borrow_m_group_node_id", nullable = false, length = 20)
    public String getsInBorrowMGroupNodeId() {
        return sInBorrowMGroupNodeId;
    }

    public void setsInBorrowMGroupNodeId(String sInBorrowMGroupNodeId) {
        this.sInBorrowMGroupNodeId = sInBorrowMGroupNodeId;
    }

    @Basic
    @Column(name = "s_in_borrow_m_prints", nullable = true)
    public Integer getsInBorrowMPrints() {
        return sInBorrowMPrints;
    }

    public void setsInBorrowMPrints(Integer sInBorrowMPrints) {
        this.sInBorrowMPrints = sInBorrowMPrints;
    }

    @Basic
    @Column(name = "s_in_borrow_m_state", nullable = true, length = 1)
    public String getsInBorrowMState() {
        return sInBorrowMState;
    }

    public void setsInBorrowMState(String sInBorrowMState) {
        this.sInBorrowMState = sInBorrowMState;
    }

    @Basic
    @Column(name = "s_in_borrow_m_notes", nullable = true, length = 200)
    public String getsInBorrowMNotes() {
        return sInBorrowMNotes;
    }

    public void setsInBorrowMNotes(String sInBorrowMNotes) {
        this.sInBorrowMNotes = sInBorrowMNotes;
    }

    @Basic
    @Column(name = "s_in_borrow_m_isPass", nullable = true, length = 1)
    public String getsInBorrowMIsPass() {
        return sInBorrowMIsPass;
    }

    public void setsInBorrowMIsPass(String sInBorrowMIsPass) {
        this.sInBorrowMIsPass = sInBorrowMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SInBorrowMEntity that = (SInBorrowMEntity) o;

        if (sInBorrowMInBorrowNo != null ? !sInBorrowMInBorrowNo.equals(that.sInBorrowMInBorrowNo) : that.sInBorrowMInBorrowNo != null)
            return false;
        if (sInBorrowMHandbillNo != null ? !sInBorrowMHandbillNo.equals(that.sInBorrowMHandbillNo) : that.sInBorrowMHandbillNo != null)
            return false;
        if (sInBorrowMClientNo != null ? !sInBorrowMClientNo.equals(that.sInBorrowMClientNo) : that.sInBorrowMClientNo != null)
            return false;
        if (sInBorrowMPaymentAttributer != null ? !sInBorrowMPaymentAttributer.equals(that.sInBorrowMPaymentAttributer) : that.sInBorrowMPaymentAttributer != null)
            return false;
        if (sInBorrowMAdPaymoney != null ? !sInBorrowMAdPaymoney.equals(that.sInBorrowMAdPaymoney) : that.sInBorrowMAdPaymoney != null)
            return false;
        if (sInBorrowMDiscount != null ? !sInBorrowMDiscount.equals(that.sInBorrowMDiscount) : that.sInBorrowMDiscount != null)
            return false;
        if (sInBorrowMBorrowUnit != null ? !sInBorrowMBorrowUnit.equals(that.sInBorrowMBorrowUnit) : that.sInBorrowMBorrowUnit != null)
            return false;
        if (sInBorrowMDeliveryDate != null ? !sInBorrowMDeliveryDate.equals(that.sInBorrowMDeliveryDate) : that.sInBorrowMDeliveryDate != null)
            return false;
        if (sInBorrowMSalesman != null ? !sInBorrowMSalesman.equals(that.sInBorrowMSalesman) : that.sInBorrowMSalesman != null)
            return false;
        if (sInBorrowMServiceAttribute != null ? !sInBorrowMServiceAttribute.equals(that.sInBorrowMServiceAttribute) : that.sInBorrowMServiceAttribute != null)
            return false;
        if (sInBorrowMSumMoney != null ? !sInBorrowMSumMoney.equals(that.sInBorrowMSumMoney) : that.sInBorrowMSumMoney != null)
            return false;
        if (sInBorrowMWarehouseKeeper != null ? !sInBorrowMWarehouseKeeper.equals(that.sInBorrowMWarehouseKeeper) : that.sInBorrowMWarehouseKeeper != null)
            return false;
        if (sInBorrowMCreaterNo != null ? !sInBorrowMCreaterNo.equals(that.sInBorrowMCreaterNo) : that.sInBorrowMCreaterNo != null)
            return false;
        if (sInBorrowMCreateDate != null ? !sInBorrowMCreateDate.equals(that.sInBorrowMCreateDate) : that.sInBorrowMCreateDate != null)
            return false;
        if (sInBorrowMModifiNo != null ? !sInBorrowMModifiNo.equals(that.sInBorrowMModifiNo) : that.sInBorrowMModifiNo != null)
            return false;
        if (sInBorrowMModifiTime != null ? !sInBorrowMModifiTime.equals(that.sInBorrowMModifiTime) : that.sInBorrowMModifiTime != null)
            return false;
        if (sInBorrowMChecker != null ? !sInBorrowMChecker.equals(that.sInBorrowMChecker) : that.sInBorrowMChecker != null)
            return false;
        if (sInBorrowMCheckDate != null ? !sInBorrowMCheckDate.equals(that.sInBorrowMCheckDate) : that.sInBorrowMCheckDate != null)
            return false;
        if (sInBorrowMGroupNodeId != null ? !sInBorrowMGroupNodeId.equals(that.sInBorrowMGroupNodeId) : that.sInBorrowMGroupNodeId != null)
            return false;
        if (sInBorrowMPrints != null ? !sInBorrowMPrints.equals(that.sInBorrowMPrints) : that.sInBorrowMPrints != null)
            return false;
        if (sInBorrowMState != null ? !sInBorrowMState.equals(that.sInBorrowMState) : that.sInBorrowMState != null)
            return false;
        if (sInBorrowMNotes != null ? !sInBorrowMNotes.equals(that.sInBorrowMNotes) : that.sInBorrowMNotes != null)
            return false;
        if (sInBorrowMIsPass != null ? !sInBorrowMIsPass.equals(that.sInBorrowMIsPass) : that.sInBorrowMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sInBorrowMInBorrowNo != null ? sInBorrowMInBorrowNo.hashCode() : 0;
        result = 31 * result + (sInBorrowMHandbillNo != null ? sInBorrowMHandbillNo.hashCode() : 0);
        result = 31 * result + (sInBorrowMClientNo != null ? sInBorrowMClientNo.hashCode() : 0);
        result = 31 * result + (sInBorrowMPaymentAttributer != null ? sInBorrowMPaymentAttributer.hashCode() : 0);
        result = 31 * result + (sInBorrowMAdPaymoney != null ? sInBorrowMAdPaymoney.hashCode() : 0);
        result = 31 * result + (sInBorrowMDiscount != null ? sInBorrowMDiscount.hashCode() : 0);
        result = 31 * result + (sInBorrowMBorrowUnit != null ? sInBorrowMBorrowUnit.hashCode() : 0);
        result = 31 * result + (sInBorrowMDeliveryDate != null ? sInBorrowMDeliveryDate.hashCode() : 0);
        result = 31 * result + (sInBorrowMSalesman != null ? sInBorrowMSalesman.hashCode() : 0);
        result = 31 * result + (sInBorrowMServiceAttribute != null ? sInBorrowMServiceAttribute.hashCode() : 0);
        result = 31 * result + (sInBorrowMSumMoney != null ? sInBorrowMSumMoney.hashCode() : 0);
        result = 31 * result + (sInBorrowMWarehouseKeeper != null ? sInBorrowMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (sInBorrowMCreaterNo != null ? sInBorrowMCreaterNo.hashCode() : 0);
        result = 31 * result + (sInBorrowMCreateDate != null ? sInBorrowMCreateDate.hashCode() : 0);
        result = 31 * result + (sInBorrowMModifiNo != null ? sInBorrowMModifiNo.hashCode() : 0);
        result = 31 * result + (sInBorrowMModifiTime != null ? sInBorrowMModifiTime.hashCode() : 0);
        result = 31 * result + (sInBorrowMChecker != null ? sInBorrowMChecker.hashCode() : 0);
        result = 31 * result + (sInBorrowMCheckDate != null ? sInBorrowMCheckDate.hashCode() : 0);
        result = 31 * result + (sInBorrowMGroupNodeId != null ? sInBorrowMGroupNodeId.hashCode() : 0);
        result = 31 * result + (sInBorrowMPrints != null ? sInBorrowMPrints.hashCode() : 0);
        result = 31 * result + (sInBorrowMState != null ? sInBorrowMState.hashCode() : 0);
        result = 31 * result + (sInBorrowMNotes != null ? sInBorrowMNotes.hashCode() : 0);
        result = 31 * result + (sInBorrowMIsPass != null ? sInBorrowMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_client_no", referencedColumnName = "t_client_client_no")
    public TClientEntity gettClientBySInBorrowMClientNo() {
        return tClientBySInBorrowMClientNo;
    }

    public void settClientBySInBorrowMClientNo(TClientEntity tClientBySInBorrowMClientNo) {
        this.tClientBySInBorrowMClientNo = tClientBySInBorrowMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySInBorrowMSalesman() {
        return tStaffBySInBorrowMSalesman;
    }

    public void settStaffBySInBorrowMSalesman(TStaffEntity tStaffBySInBorrowMSalesman) {
        this.tStaffBySInBorrowMSalesman = tStaffBySInBorrowMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySInBorrowMWarehouseKeeper() {
        return tStaffBySInBorrowMWarehouseKeeper;
    }

    public void settStaffBySInBorrowMWarehouseKeeper(TStaffEntity tStaffBySInBorrowMWarehouseKeeper) {
        this.tStaffBySInBorrowMWarehouseKeeper = tStaffBySInBorrowMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_creater_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySInBorrowMCreaterNo() {
        return tStaffBySInBorrowMCreaterNo;
    }

    public void settStaffBySInBorrowMCreaterNo(TStaffEntity tStaffBySInBorrowMCreaterNo) {
        this.tStaffBySInBorrowMCreaterNo = tStaffBySInBorrowMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_modifi_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySInBorrowMModifiNo() {
        return tStaffBySInBorrowMModifiNo;
    }

    public void settStaffBySInBorrowMModifiNo(TStaffEntity tStaffBySInBorrowMModifiNo) {
        this.tStaffBySInBorrowMModifiNo = tStaffBySInBorrowMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_checker", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySInBorrowMChecker() {
        return tStaffBySInBorrowMChecker;
    }

    public void settStaffBySInBorrowMChecker(TStaffEntity tStaffBySInBorrowMChecker) {
        this.tStaffBySInBorrowMChecker = tStaffBySInBorrowMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySInBorrowMGroupNodeId() {
        return tOrgBySInBorrowMGroupNodeId;
    }

    public void settOrgBySInBorrowMGroupNodeId(TOrgEntity tOrgBySInBorrowMGroupNodeId) {
        this.tOrgBySInBorrowMGroupNodeId = tOrgBySInBorrowMGroupNodeId;
    }
}
