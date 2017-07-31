package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "s_in_loan_m", schema = "dbo", catalog = "logistics")
public class SInLoanMEntity {
    private String sInLoanMInLoanLno;
    private String sInLoanMOutLoanNo;
    private String sInLoanMHandbillNo;
    private String sInLoanMReturnUnit;
    private String sInLoanMDeliveryDate;
    private String sInLoanMSalesman;
    private String sInLoanMServiceAttribute;
    private String sInLoanMPaymentAttributer;
    private BigDecimal sInLoanMAdPaymoney;
    private BigDecimal sInLoanMDiscount;
    private BigDecimal sInLoanMSumMoney;
    private String sInLoanMReturnPeople;
    private String sInLoanMWarehouseKeeper;
    private String sInLoanMCreaterNo;
    private Timestamp sInLoanMCreateDate;
    private String sInLoanMModifiNo;
    private Timestamp sInLoanMModifiTime;
    private String sInLoanMChecker;
    private Timestamp sInLoanMCheckDate;
    private String sInLoanMGroupNodeId;
    private String sInLoanMNotes;
    private String sInLoanMState;
    private int sInLoanMPrints;
    private String sInLoanMIsPass;
    private SOutLoanMEntity sOutLoanMBySInLoanMOutLoanNo;
    private TStaffEntity tStaffBySInLoanMSalesman;
    private TStaffEntity tStaffBySInLoanMWarehouseKeeper;
    private TStaffEntity tStaffBySInLoanMCreaterNo;
    private TStaffEntity tStaffBySInLoanMModifiNo;
    private TStaffEntity tStaffBySInLoanMChecker;
    private TOrgEntity tOrgBySInLoanMGroupNodeId;
    private Collection<SInLoanSEntity> sInLoanSBySInLoanMInLoanLno;

    @Id
    @Column(name = "s_in_loan_m_in_loan_lno", nullable = false, length = 16)
    public String getsInLoanMInLoanLno() {
        return sInLoanMInLoanLno;
    }

    public void setsInLoanMInLoanLno(String sInLoanMInLoanLno) {
        this.sInLoanMInLoanLno = sInLoanMInLoanLno;
    }

    @Basic
    @Column(name = "s_in_loan_m_out_loan_no", nullable = false, length = 16)
    public String getsInLoanMOutLoanNo() {
        return sInLoanMOutLoanNo;
    }

    public void setsInLoanMOutLoanNo(String sInLoanMOutLoanNo) {
        this.sInLoanMOutLoanNo = sInLoanMOutLoanNo;
    }

    @Basic
    @Column(name = "s_in_loan_m_handbill_no", nullable = false, length = 20)
    public String getsInLoanMHandbillNo() {
        return sInLoanMHandbillNo;
    }

    public void setsInLoanMHandbillNo(String sInLoanMHandbillNo) {
        this.sInLoanMHandbillNo = sInLoanMHandbillNo;
    }

    @Basic
    @Column(name = "s_in_loan_m_return_unit", nullable = false, length = 20)
    public String getsInLoanMReturnUnit() {
        return sInLoanMReturnUnit;
    }

    public void setsInLoanMReturnUnit(String sInLoanMReturnUnit) {
        this.sInLoanMReturnUnit = sInLoanMReturnUnit;
    }

    @Basic
    @Column(name = "s_in_loan_m_delivery_date", nullable = false, length = 12)
    public String getsInLoanMDeliveryDate() {
        return sInLoanMDeliveryDate;
    }

    public void setsInLoanMDeliveryDate(String sInLoanMDeliveryDate) {
        this.sInLoanMDeliveryDate = sInLoanMDeliveryDate;
    }

    @Basic
    @Column(name = "s_in_loan_m_salesman", nullable = false, length = 8)
    public String getsInLoanMSalesman() {
        return sInLoanMSalesman;
    }

    public void setsInLoanMSalesman(String sInLoanMSalesman) {
        this.sInLoanMSalesman = sInLoanMSalesman;
    }

    @Basic
    @Column(name = "s_in_loan_m_service_attribute", nullable = false, length = 4)
    public String getsInLoanMServiceAttribute() {
        return sInLoanMServiceAttribute;
    }

    public void setsInLoanMServiceAttribute(String sInLoanMServiceAttribute) {
        this.sInLoanMServiceAttribute = sInLoanMServiceAttribute;
    }

    @Basic
    @Column(name = "s_in_loan_m_payment_attributer", nullable = false, length = 20)
    public String getsInLoanMPaymentAttributer() {
        return sInLoanMPaymentAttributer;
    }

    public void setsInLoanMPaymentAttributer(String sInLoanMPaymentAttributer) {
        this.sInLoanMPaymentAttributer = sInLoanMPaymentAttributer;
    }

    @Basic
    @Column(name = "s_in_loan_m_ad_paymoney", nullable = false, precision = 4)
    public BigDecimal getsInLoanMAdPaymoney() {
        return sInLoanMAdPaymoney;
    }

    public void setsInLoanMAdPaymoney(BigDecimal sInLoanMAdPaymoney) {
        this.sInLoanMAdPaymoney = sInLoanMAdPaymoney;
    }

    @Basic
    @Column(name = "s_in_loan_m_discount", nullable = false, precision = 6)
    public BigDecimal getsInLoanMDiscount() {
        return sInLoanMDiscount;
    }

    public void setsInLoanMDiscount(BigDecimal sInLoanMDiscount) {
        this.sInLoanMDiscount = sInLoanMDiscount;
    }

    @Basic
    @Column(name = "s_in_loan_m_sum_money", nullable = false, precision = 4)
    public BigDecimal getsInLoanMSumMoney() {
        return sInLoanMSumMoney;
    }

    public void setsInLoanMSumMoney(BigDecimal sInLoanMSumMoney) {
        this.sInLoanMSumMoney = sInLoanMSumMoney;
    }

    @Basic
    @Column(name = "s_in_loan_m_return_people", nullable = false, length = 20)
    public String getsInLoanMReturnPeople() {
        return sInLoanMReturnPeople;
    }

    public void setsInLoanMReturnPeople(String sInLoanMReturnPeople) {
        this.sInLoanMReturnPeople = sInLoanMReturnPeople;
    }

    @Basic
    @Column(name = "s_in_loan_m_warehouse_keeper", nullable = false, length = 8)
    public String getsInLoanMWarehouseKeeper() {
        return sInLoanMWarehouseKeeper;
    }

    public void setsInLoanMWarehouseKeeper(String sInLoanMWarehouseKeeper) {
        this.sInLoanMWarehouseKeeper = sInLoanMWarehouseKeeper;
    }

    @Basic
    @Column(name = "s_in_loan_m_creater_no", nullable = false, length = 8)
    public String getsInLoanMCreaterNo() {
        return sInLoanMCreaterNo;
    }

    public void setsInLoanMCreaterNo(String sInLoanMCreaterNo) {
        this.sInLoanMCreaterNo = sInLoanMCreaterNo;
    }

    @Basic
    @Column(name = "s_in_loan_m_create_date", nullable = false)
    public Timestamp getsInLoanMCreateDate() {
        return sInLoanMCreateDate;
    }

    public void setsInLoanMCreateDate(Timestamp sInLoanMCreateDate) {
        this.sInLoanMCreateDate = sInLoanMCreateDate;
    }

    @Basic
    @Column(name = "s_in_loan_m_modifi_no", nullable = false, length = 8)
    public String getsInLoanMModifiNo() {
        return sInLoanMModifiNo;
    }

    public void setsInLoanMModifiNo(String sInLoanMModifiNo) {
        this.sInLoanMModifiNo = sInLoanMModifiNo;
    }

    @Basic
    @Column(name = "s_in_loan_m_modifi_time", nullable = false)
    public Timestamp getsInLoanMModifiTime() {
        return sInLoanMModifiTime;
    }

    public void setsInLoanMModifiTime(Timestamp sInLoanMModifiTime) {
        this.sInLoanMModifiTime = sInLoanMModifiTime;
    }

    @Basic
    @Column(name = "s_in_loan_m_checker", nullable = false, length = 8)
    public String getsInLoanMChecker() {
        return sInLoanMChecker;
    }

    public void setsInLoanMChecker(String sInLoanMChecker) {
        this.sInLoanMChecker = sInLoanMChecker;
    }

    @Basic
    @Column(name = "s_in_loan_m_check_date", nullable = false)
    public Timestamp getsInLoanMCheckDate() {
        return sInLoanMCheckDate;
    }

    public void setsInLoanMCheckDate(Timestamp sInLoanMCheckDate) {
        this.sInLoanMCheckDate = sInLoanMCheckDate;
    }

    @Basic
    @Column(name = "s_in_loan_m_group_node_id", nullable = false, length = 20)
    public String getsInLoanMGroupNodeId() {
        return sInLoanMGroupNodeId;
    }

    public void setsInLoanMGroupNodeId(String sInLoanMGroupNodeId) {
        this.sInLoanMGroupNodeId = sInLoanMGroupNodeId;
    }

    @Basic
    @Column(name = "s_in_loan_m_notes", nullable = false, length = 200)
    public String getsInLoanMNotes() {
        return sInLoanMNotes;
    }

    public void setsInLoanMNotes(String sInLoanMNotes) {
        this.sInLoanMNotes = sInLoanMNotes;
    }

    @Basic
    @Column(name = "s_in_loan_m_state", nullable = false, length = -1)
    public String getsInLoanMState() {
        return sInLoanMState;
    }

    public void setsInLoanMState(String sInLoanMState) {
        this.sInLoanMState = sInLoanMState;
    }

    @Basic
    @Column(name = "s_in_loan_m_prints", nullable = false)
    public int getsInLoanMPrints() {
        return sInLoanMPrints;
    }

    public void setsInLoanMPrints(int sInLoanMPrints) {
        this.sInLoanMPrints = sInLoanMPrints;
    }

    @Basic
    @Column(name = "s_in_loan_m_isPass", nullable = true, length = -1)
    public String getsInLoanMIsPass() {
        return sInLoanMIsPass;
    }

    public void setsInLoanMIsPass(String sInLoanMIsPass) {
        this.sInLoanMIsPass = sInLoanMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SInLoanMEntity that = (SInLoanMEntity) o;

        if (sInLoanMPrints != that.sInLoanMPrints) return false;
        if (sInLoanMInLoanLno != null ? !sInLoanMInLoanLno.equals(that.sInLoanMInLoanLno) : that.sInLoanMInLoanLno != null)
            return false;
        if (sInLoanMOutLoanNo != null ? !sInLoanMOutLoanNo.equals(that.sInLoanMOutLoanNo) : that.sInLoanMOutLoanNo != null)
            return false;
        if (sInLoanMHandbillNo != null ? !sInLoanMHandbillNo.equals(that.sInLoanMHandbillNo) : that.sInLoanMHandbillNo != null)
            return false;
        if (sInLoanMReturnUnit != null ? !sInLoanMReturnUnit.equals(that.sInLoanMReturnUnit) : that.sInLoanMReturnUnit != null)
            return false;
        if (sInLoanMDeliveryDate != null ? !sInLoanMDeliveryDate.equals(that.sInLoanMDeliveryDate) : that.sInLoanMDeliveryDate != null)
            return false;
        if (sInLoanMSalesman != null ? !sInLoanMSalesman.equals(that.sInLoanMSalesman) : that.sInLoanMSalesman != null)
            return false;
        if (sInLoanMServiceAttribute != null ? !sInLoanMServiceAttribute.equals(that.sInLoanMServiceAttribute) : that.sInLoanMServiceAttribute != null)
            return false;
        if (sInLoanMPaymentAttributer != null ? !sInLoanMPaymentAttributer.equals(that.sInLoanMPaymentAttributer) : that.sInLoanMPaymentAttributer != null)
            return false;
        if (sInLoanMAdPaymoney != null ? !sInLoanMAdPaymoney.equals(that.sInLoanMAdPaymoney) : that.sInLoanMAdPaymoney != null)
            return false;
        if (sInLoanMDiscount != null ? !sInLoanMDiscount.equals(that.sInLoanMDiscount) : that.sInLoanMDiscount != null)
            return false;
        if (sInLoanMSumMoney != null ? !sInLoanMSumMoney.equals(that.sInLoanMSumMoney) : that.sInLoanMSumMoney != null)
            return false;
        if (sInLoanMReturnPeople != null ? !sInLoanMReturnPeople.equals(that.sInLoanMReturnPeople) : that.sInLoanMReturnPeople != null)
            return false;
        if (sInLoanMWarehouseKeeper != null ? !sInLoanMWarehouseKeeper.equals(that.sInLoanMWarehouseKeeper) : that.sInLoanMWarehouseKeeper != null)
            return false;
        if (sInLoanMCreaterNo != null ? !sInLoanMCreaterNo.equals(that.sInLoanMCreaterNo) : that.sInLoanMCreaterNo != null)
            return false;
        if (sInLoanMCreateDate != null ? !sInLoanMCreateDate.equals(that.sInLoanMCreateDate) : that.sInLoanMCreateDate != null)
            return false;
        if (sInLoanMModifiNo != null ? !sInLoanMModifiNo.equals(that.sInLoanMModifiNo) : that.sInLoanMModifiNo != null)
            return false;
        if (sInLoanMModifiTime != null ? !sInLoanMModifiTime.equals(that.sInLoanMModifiTime) : that.sInLoanMModifiTime != null)
            return false;
        if (sInLoanMChecker != null ? !sInLoanMChecker.equals(that.sInLoanMChecker) : that.sInLoanMChecker != null)
            return false;
        if (sInLoanMCheckDate != null ? !sInLoanMCheckDate.equals(that.sInLoanMCheckDate) : that.sInLoanMCheckDate != null)
            return false;
        if (sInLoanMGroupNodeId != null ? !sInLoanMGroupNodeId.equals(that.sInLoanMGroupNodeId) : that.sInLoanMGroupNodeId != null)
            return false;
        if (sInLoanMNotes != null ? !sInLoanMNotes.equals(that.sInLoanMNotes) : that.sInLoanMNotes != null)
            return false;
        if (sInLoanMState != null ? !sInLoanMState.equals(that.sInLoanMState) : that.sInLoanMState != null)
            return false;
        if (sInLoanMIsPass != null ? !sInLoanMIsPass.equals(that.sInLoanMIsPass) : that.sInLoanMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sInLoanMInLoanLno != null ? sInLoanMInLoanLno.hashCode() : 0;
        result = 31 * result + (sInLoanMOutLoanNo != null ? sInLoanMOutLoanNo.hashCode() : 0);
        result = 31 * result + (sInLoanMHandbillNo != null ? sInLoanMHandbillNo.hashCode() : 0);
        result = 31 * result + (sInLoanMReturnUnit != null ? sInLoanMReturnUnit.hashCode() : 0);
        result = 31 * result + (sInLoanMDeliveryDate != null ? sInLoanMDeliveryDate.hashCode() : 0);
        result = 31 * result + (sInLoanMSalesman != null ? sInLoanMSalesman.hashCode() : 0);
        result = 31 * result + (sInLoanMServiceAttribute != null ? sInLoanMServiceAttribute.hashCode() : 0);
        result = 31 * result + (sInLoanMPaymentAttributer != null ? sInLoanMPaymentAttributer.hashCode() : 0);
        result = 31 * result + (sInLoanMAdPaymoney != null ? sInLoanMAdPaymoney.hashCode() : 0);
        result = 31 * result + (sInLoanMDiscount != null ? sInLoanMDiscount.hashCode() : 0);
        result = 31 * result + (sInLoanMSumMoney != null ? sInLoanMSumMoney.hashCode() : 0);
        result = 31 * result + (sInLoanMReturnPeople != null ? sInLoanMReturnPeople.hashCode() : 0);
        result = 31 * result + (sInLoanMWarehouseKeeper != null ? sInLoanMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (sInLoanMCreaterNo != null ? sInLoanMCreaterNo.hashCode() : 0);
        result = 31 * result + (sInLoanMCreateDate != null ? sInLoanMCreateDate.hashCode() : 0);
        result = 31 * result + (sInLoanMModifiNo != null ? sInLoanMModifiNo.hashCode() : 0);
        result = 31 * result + (sInLoanMModifiTime != null ? sInLoanMModifiTime.hashCode() : 0);
        result = 31 * result + (sInLoanMChecker != null ? sInLoanMChecker.hashCode() : 0);
        result = 31 * result + (sInLoanMCheckDate != null ? sInLoanMCheckDate.hashCode() : 0);
        result = 31 * result + (sInLoanMGroupNodeId != null ? sInLoanMGroupNodeId.hashCode() : 0);
        result = 31 * result + (sInLoanMNotes != null ? sInLoanMNotes.hashCode() : 0);
        result = 31 * result + (sInLoanMState != null ? sInLoanMState.hashCode() : 0);
        result = 31 * result + sInLoanMPrints;
        result = 31 * result + (sInLoanMIsPass != null ? sInLoanMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_out_loan_no", referencedColumnName = "s_out_loan_m_out_loan_no", nullable = false,insertable = false, updatable = false)
    public SOutLoanMEntity getsOutLoanMBySInLoanMOutLoanNo() {
        return sOutLoanMBySInLoanMOutLoanNo;
    }

    public void setsOutLoanMBySInLoanMOutLoanNo(SOutLoanMEntity sOutLoanMBySInLoanMOutLoanNo) {
        this.sOutLoanMBySInLoanMOutLoanNo = sOutLoanMBySInLoanMOutLoanNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_salesman", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInLoanMSalesman() {
        return tStaffBySInLoanMSalesman;
    }

    public void settStaffBySInLoanMSalesman(TStaffEntity tStaffBySInLoanMSalesman) {
        this.tStaffBySInLoanMSalesman = tStaffBySInLoanMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInLoanMWarehouseKeeper() {
        return tStaffBySInLoanMWarehouseKeeper;
    }

    public void settStaffBySInLoanMWarehouseKeeper(TStaffEntity tStaffBySInLoanMWarehouseKeeper) {
        this.tStaffBySInLoanMWarehouseKeeper = tStaffBySInLoanMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_creater_no", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInLoanMCreaterNo() {
        return tStaffBySInLoanMCreaterNo;
    }

    public void settStaffBySInLoanMCreaterNo(TStaffEntity tStaffBySInLoanMCreaterNo) {
        this.tStaffBySInLoanMCreaterNo = tStaffBySInLoanMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_modifi_no", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInLoanMModifiNo() {
        return tStaffBySInLoanMModifiNo;
    }

    public void settStaffBySInLoanMModifiNo(TStaffEntity tStaffBySInLoanMModifiNo) {
        this.tStaffBySInLoanMModifiNo = tStaffBySInLoanMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_checker", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInLoanMChecker() {
        return tStaffBySInLoanMChecker;
    }

    public void settStaffBySInLoanMChecker(TStaffEntity tStaffBySInLoanMChecker) {
        this.tStaffBySInLoanMChecker = tStaffBySInLoanMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgBySInLoanMGroupNodeId() {
        return tOrgBySInLoanMGroupNodeId;
    }

    public void settOrgBySInLoanMGroupNodeId(TOrgEntity tOrgBySInLoanMGroupNodeId) {
        this.tOrgBySInLoanMGroupNodeId = tOrgBySInLoanMGroupNodeId;
    }

    @OneToMany(mappedBy = "sInLoanMBySInLoanSInLoanLno")
    public Collection<SInLoanSEntity> getsInLoanSBySInLoanMInLoanLno() {
        return sInLoanSBySInLoanMInLoanLno;
    }

    public void setsInLoanSBySInLoanMInLoanLno(Collection<SInLoanSEntity> sInLoanSBySInLoanMInLoanLno) {
        this.sInLoanSBySInLoanMInLoanLno = sInLoanSBySInLoanMInLoanLno;
    }
}
