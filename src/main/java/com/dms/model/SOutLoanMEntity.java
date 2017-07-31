package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "s_out_loan_m", schema = "dbo", catalog = "logistics")
public class SOutLoanMEntity {
    private String sOutLoanMOutLoanNo;
    private String sOutLoanMHandbillNo;
    private String sOutLoanMClientNo;
    private String sOutLoanMLendingUnit;
    private String sOutLoanMPaymentNo;
    private String sOutLoanMDeliveryDate;
    private String sOutLoanMSalesman;
    private String sOutLoanMServiceAttribute;
    private BigDecimal sOutLoanMSumMoney;
    private String sOutLoanMWarehouseKeeper;
    private String sOutLoanMCreaterNo;
    private Timestamp sOutLoanMCreateDate;
    private String sOutLoanMModifiNo;
    private Timestamp sOutLoanMModifiTime;
    private String sOutLoanMChecker;
    private Timestamp sOutLoanMCheckDate;
    private String sOutLoanMNotes;
    private String sOutLoanMState;
    private Integer sOutLoanMPrints;
    private String sOutLoanMIsPass;
    private Collection<SInLoanMEntity> sInLoanMSBySOutLoanMOutLoanNo;
    private TClientEntity tClientBySOutLoanMClientNo;
    private TPaymentEntity tPaymentBySOutLoanMPaymentNo;
    private TStaffEntity tStaffBySOutLoanMSalesman;
    private TStaffEntity tStaffBySOutLoanMWarehouseKeeper;
    private TStaffEntity tStaffBySOutLoanMCreaterNo;
    private TStaffEntity tStaffBySOutLoanMModifiNo;
    private TStaffEntity tStaffBySOutLoanMChecker;
    private Collection<SOutLoanSEntity> sOutLoanSBySOutLoanMOutLoanNo;

    @Id
    @Column(name = "s_out_loan_m_out_loan_no", nullable = false, length = 16)
    public String getsOutLoanMOutLoanNo() {
        return sOutLoanMOutLoanNo;
    }

    public void setsOutLoanMOutLoanNo(String sOutLoanMOutLoanNo) {
        this.sOutLoanMOutLoanNo = sOutLoanMOutLoanNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_handbill_no", nullable = true, length = 20)
    public String getsOutLoanMHandbillNo() {
        return sOutLoanMHandbillNo;
    }

    public void setsOutLoanMHandbillNo(String sOutLoanMHandbillNo) {
        this.sOutLoanMHandbillNo = sOutLoanMHandbillNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_client_no", nullable = true, length = 20)
    public String getsOutLoanMClientNo() {
        return sOutLoanMClientNo;
    }

    public void setsOutLoanMClientNo(String sOutLoanMClientNo) {
        this.sOutLoanMClientNo = sOutLoanMClientNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_lending_unit", nullable = true, length = 80)
    public String getsOutLoanMLendingUnit() {
        return sOutLoanMLendingUnit;
    }

    public void setsOutLoanMLendingUnit(String sOutLoanMLendingUnit) {
        this.sOutLoanMLendingUnit = sOutLoanMLendingUnit;
    }

    @Basic
    @Column(name = "s_out_loan_m_payment_no", nullable = true, length = 4)
    public String getsOutLoanMPaymentNo() {
        return sOutLoanMPaymentNo;
    }

    public void setsOutLoanMPaymentNo(String sOutLoanMPaymentNo) {
        this.sOutLoanMPaymentNo = sOutLoanMPaymentNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_delivery_date", nullable = true, length = 12)
    public String getsOutLoanMDeliveryDate() {
        return sOutLoanMDeliveryDate;
    }

    public void setsOutLoanMDeliveryDate(String sOutLoanMDeliveryDate) {
        this.sOutLoanMDeliveryDate = sOutLoanMDeliveryDate;
    }

    @Basic
    @Column(name = "s_out_loan_m_salesman", nullable = true, length = 8)
    public String getsOutLoanMSalesman() {
        return sOutLoanMSalesman;
    }

    public void setsOutLoanMSalesman(String sOutLoanMSalesman) {
        this.sOutLoanMSalesman = sOutLoanMSalesman;
    }

    @Basic
    @Column(name = "s_out_loan_m_service_attribute", nullable = true, length = 4)
    public String getsOutLoanMServiceAttribute() {
        return sOutLoanMServiceAttribute;
    }

    public void setsOutLoanMServiceAttribute(String sOutLoanMServiceAttribute) {
        this.sOutLoanMServiceAttribute = sOutLoanMServiceAttribute;
    }

    @Basic
    @Column(name = "s_out_loan_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getsOutLoanMSumMoney() {
        return sOutLoanMSumMoney;
    }

    public void setsOutLoanMSumMoney(BigDecimal sOutLoanMSumMoney) {
        this.sOutLoanMSumMoney = sOutLoanMSumMoney;
    }

    @Basic
    @Column(name = "s_out_loan_m_warehouse_keeper", nullable = true, length = 8)
    public String getsOutLoanMWarehouseKeeper() {
        return sOutLoanMWarehouseKeeper;
    }

    public void setsOutLoanMWarehouseKeeper(String sOutLoanMWarehouseKeeper) {
        this.sOutLoanMWarehouseKeeper = sOutLoanMWarehouseKeeper;
    }

    @Basic
    @Column(name = "s_out_loan_m_creater_no", nullable = true, length = 8)
    public String getsOutLoanMCreaterNo() {
        return sOutLoanMCreaterNo;
    }

    public void setsOutLoanMCreaterNo(String sOutLoanMCreaterNo) {
        this.sOutLoanMCreaterNo = sOutLoanMCreaterNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_create_date", nullable = true)
    public Timestamp getsOutLoanMCreateDate() {
        return sOutLoanMCreateDate;
    }

    public void setsOutLoanMCreateDate(Timestamp sOutLoanMCreateDate) {
        this.sOutLoanMCreateDate = sOutLoanMCreateDate;
    }

    @Basic
    @Column(name = "s_out_loan_m_modifi_no", nullable = true, length = 8)
    public String getsOutLoanMModifiNo() {
        return sOutLoanMModifiNo;
    }

    public void setsOutLoanMModifiNo(String sOutLoanMModifiNo) {
        this.sOutLoanMModifiNo = sOutLoanMModifiNo;
    }

    @Basic
    @Column(name = "s_out_loan_m_modifi_time", nullable = true)
    public Timestamp getsOutLoanMModifiTime() {
        return sOutLoanMModifiTime;
    }

    public void setsOutLoanMModifiTime(Timestamp sOutLoanMModifiTime) {
        this.sOutLoanMModifiTime = sOutLoanMModifiTime;
    }

    @Basic
    @Column(name = "s_out_loan_m_checker", nullable = true, length = 8)
    public String getsOutLoanMChecker() {
        return sOutLoanMChecker;
    }

    public void setsOutLoanMChecker(String sOutLoanMChecker) {
        this.sOutLoanMChecker = sOutLoanMChecker;
    }

    @Basic
    @Column(name = "s_out_loan_m_check_date", nullable = true)
    public Timestamp getsOutLoanMCheckDate() {
        return sOutLoanMCheckDate;
    }

    public void setsOutLoanMCheckDate(Timestamp sOutLoanMCheckDate) {
        this.sOutLoanMCheckDate = sOutLoanMCheckDate;
    }

    @Basic
    @Column(name = "s_out_loan_m_notes", nullable = true, length = 200)
    public String getsOutLoanMNotes() {
        return sOutLoanMNotes;
    }

    public void setsOutLoanMNotes(String sOutLoanMNotes) {
        this.sOutLoanMNotes = sOutLoanMNotes;
    }

    @Basic
    @Column(name = "s_out_loan_m_state", nullable = true, length = -1)
    public String getsOutLoanMState() {
        return sOutLoanMState;
    }

    public void setsOutLoanMState(String sOutLoanMState) {
        this.sOutLoanMState = sOutLoanMState;
    }

    @Basic
    @Column(name = "s_out_loan_m_prints", nullable = true)
    public Integer getsOutLoanMPrints() {
        return sOutLoanMPrints;
    }

    public void setsOutLoanMPrints(Integer sOutLoanMPrints) {
        this.sOutLoanMPrints = sOutLoanMPrints;
    }

    @Basic
    @Column(name = "s_out_loan_m_isPass", nullable = true, length = -1)
    public String getsOutLoanMIsPass() {
        return sOutLoanMIsPass;
    }

    public void setsOutLoanMIsPass(String sOutLoanMIsPass) {
        this.sOutLoanMIsPass = sOutLoanMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SOutLoanMEntity that = (SOutLoanMEntity) o;

        if (sOutLoanMOutLoanNo != null ? !sOutLoanMOutLoanNo.equals(that.sOutLoanMOutLoanNo) : that.sOutLoanMOutLoanNo != null)
            return false;
        if (sOutLoanMHandbillNo != null ? !sOutLoanMHandbillNo.equals(that.sOutLoanMHandbillNo) : that.sOutLoanMHandbillNo != null)
            return false;
        if (sOutLoanMClientNo != null ? !sOutLoanMClientNo.equals(that.sOutLoanMClientNo) : that.sOutLoanMClientNo != null)
            return false;
        if (sOutLoanMLendingUnit != null ? !sOutLoanMLendingUnit.equals(that.sOutLoanMLendingUnit) : that.sOutLoanMLendingUnit != null)
            return false;
        if (sOutLoanMPaymentNo != null ? !sOutLoanMPaymentNo.equals(that.sOutLoanMPaymentNo) : that.sOutLoanMPaymentNo != null)
            return false;
        if (sOutLoanMDeliveryDate != null ? !sOutLoanMDeliveryDate.equals(that.sOutLoanMDeliveryDate) : that.sOutLoanMDeliveryDate != null)
            return false;
        if (sOutLoanMSalesman != null ? !sOutLoanMSalesman.equals(that.sOutLoanMSalesman) : that.sOutLoanMSalesman != null)
            return false;
        if (sOutLoanMServiceAttribute != null ? !sOutLoanMServiceAttribute.equals(that.sOutLoanMServiceAttribute) : that.sOutLoanMServiceAttribute != null)
            return false;
        if (sOutLoanMSumMoney != null ? !sOutLoanMSumMoney.equals(that.sOutLoanMSumMoney) : that.sOutLoanMSumMoney != null)
            return false;
        if (sOutLoanMWarehouseKeeper != null ? !sOutLoanMWarehouseKeeper.equals(that.sOutLoanMWarehouseKeeper) : that.sOutLoanMWarehouseKeeper != null)
            return false;
        if (sOutLoanMCreaterNo != null ? !sOutLoanMCreaterNo.equals(that.sOutLoanMCreaterNo) : that.sOutLoanMCreaterNo != null)
            return false;
        if (sOutLoanMCreateDate != null ? !sOutLoanMCreateDate.equals(that.sOutLoanMCreateDate) : that.sOutLoanMCreateDate != null)
            return false;
        if (sOutLoanMModifiNo != null ? !sOutLoanMModifiNo.equals(that.sOutLoanMModifiNo) : that.sOutLoanMModifiNo != null)
            return false;
        if (sOutLoanMModifiTime != null ? !sOutLoanMModifiTime.equals(that.sOutLoanMModifiTime) : that.sOutLoanMModifiTime != null)
            return false;
        if (sOutLoanMChecker != null ? !sOutLoanMChecker.equals(that.sOutLoanMChecker) : that.sOutLoanMChecker != null)
            return false;
        if (sOutLoanMCheckDate != null ? !sOutLoanMCheckDate.equals(that.sOutLoanMCheckDate) : that.sOutLoanMCheckDate != null)
            return false;
        if (sOutLoanMNotes != null ? !sOutLoanMNotes.equals(that.sOutLoanMNotes) : that.sOutLoanMNotes != null)
            return false;
        if (sOutLoanMState != null ? !sOutLoanMState.equals(that.sOutLoanMState) : that.sOutLoanMState != null)
            return false;
        if (sOutLoanMPrints != null ? !sOutLoanMPrints.equals(that.sOutLoanMPrints) : that.sOutLoanMPrints != null)
            return false;
        if (sOutLoanMIsPass != null ? !sOutLoanMIsPass.equals(that.sOutLoanMIsPass) : that.sOutLoanMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sOutLoanMOutLoanNo != null ? sOutLoanMOutLoanNo.hashCode() : 0;
        result = 31 * result + (sOutLoanMHandbillNo != null ? sOutLoanMHandbillNo.hashCode() : 0);
        result = 31 * result + (sOutLoanMClientNo != null ? sOutLoanMClientNo.hashCode() : 0);
        result = 31 * result + (sOutLoanMLendingUnit != null ? sOutLoanMLendingUnit.hashCode() : 0);
        result = 31 * result + (sOutLoanMPaymentNo != null ? sOutLoanMPaymentNo.hashCode() : 0);
        result = 31 * result + (sOutLoanMDeliveryDate != null ? sOutLoanMDeliveryDate.hashCode() : 0);
        result = 31 * result + (sOutLoanMSalesman != null ? sOutLoanMSalesman.hashCode() : 0);
        result = 31 * result + (sOutLoanMServiceAttribute != null ? sOutLoanMServiceAttribute.hashCode() : 0);
        result = 31 * result + (sOutLoanMSumMoney != null ? sOutLoanMSumMoney.hashCode() : 0);
        result = 31 * result + (sOutLoanMWarehouseKeeper != null ? sOutLoanMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (sOutLoanMCreaterNo != null ? sOutLoanMCreaterNo.hashCode() : 0);
        result = 31 * result + (sOutLoanMCreateDate != null ? sOutLoanMCreateDate.hashCode() : 0);
        result = 31 * result + (sOutLoanMModifiNo != null ? sOutLoanMModifiNo.hashCode() : 0);
        result = 31 * result + (sOutLoanMModifiTime != null ? sOutLoanMModifiTime.hashCode() : 0);
        result = 31 * result + (sOutLoanMChecker != null ? sOutLoanMChecker.hashCode() : 0);
        result = 31 * result + (sOutLoanMCheckDate != null ? sOutLoanMCheckDate.hashCode() : 0);
        result = 31 * result + (sOutLoanMNotes != null ? sOutLoanMNotes.hashCode() : 0);
        result = 31 * result + (sOutLoanMState != null ? sOutLoanMState.hashCode() : 0);
        result = 31 * result + (sOutLoanMPrints != null ? sOutLoanMPrints.hashCode() : 0);
        result = 31 * result + (sOutLoanMIsPass != null ? sOutLoanMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sOutLoanMBySInLoanMOutLoanNo")
    public Collection<SInLoanMEntity> getsInLoanMSBySOutLoanMOutLoanNo() {
        return sInLoanMSBySOutLoanMOutLoanNo;
    }

    public void setsInLoanMSBySOutLoanMOutLoanNo(Collection<SInLoanMEntity> sInLoanMSBySOutLoanMOutLoanNo) {
        this.sInLoanMSBySOutLoanMOutLoanNo = sInLoanMSBySOutLoanMOutLoanNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_client_no", referencedColumnName = "t_client_client_no",insertable = false, updatable = false)
    public TClientEntity gettClientBySOutLoanMClientNo() {
        return tClientBySOutLoanMClientNo;
    }

    public void settClientBySOutLoanMClientNo(TClientEntity tClientBySOutLoanMClientNo) {
        this.tClientBySOutLoanMClientNo = tClientBySOutLoanMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_payment_no", referencedColumnName = "t_payment_payment_no",insertable = false, updatable = false)
    public TPaymentEntity gettPaymentBySOutLoanMPaymentNo() {
        return tPaymentBySOutLoanMPaymentNo;
    }

    public void settPaymentBySOutLoanMPaymentNo(TPaymentEntity tPaymentBySOutLoanMPaymentNo) {
        this.tPaymentBySOutLoanMPaymentNo = tPaymentBySOutLoanMPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_salesman", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySOutLoanMSalesman() {
        return tStaffBySOutLoanMSalesman;
    }

    public void settStaffBySOutLoanMSalesman(TStaffEntity tStaffBySOutLoanMSalesman) {
        this.tStaffBySOutLoanMSalesman = tStaffBySOutLoanMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySOutLoanMWarehouseKeeper() {
        return tStaffBySOutLoanMWarehouseKeeper;
    }

    public void settStaffBySOutLoanMWarehouseKeeper(TStaffEntity tStaffBySOutLoanMWarehouseKeeper) {
        this.tStaffBySOutLoanMWarehouseKeeper = tStaffBySOutLoanMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySOutLoanMCreaterNo() {
        return tStaffBySOutLoanMCreaterNo;
    }

    public void settStaffBySOutLoanMCreaterNo(TStaffEntity tStaffBySOutLoanMCreaterNo) {
        this.tStaffBySOutLoanMCreaterNo = tStaffBySOutLoanMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySOutLoanMModifiNo() {
        return tStaffBySOutLoanMModifiNo;
    }

    public void settStaffBySOutLoanMModifiNo(TStaffEntity tStaffBySOutLoanMModifiNo) {
        this.tStaffBySOutLoanMModifiNo = tStaffBySOutLoanMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySOutLoanMChecker() {
        return tStaffBySOutLoanMChecker;
    }

    public void settStaffBySOutLoanMChecker(TStaffEntity tStaffBySOutLoanMChecker) {
        this.tStaffBySOutLoanMChecker = tStaffBySOutLoanMChecker;
    }

    @OneToMany(mappedBy = "sOutLoanMBySOutLoanSOutLoanNo")
    public Collection<SOutLoanSEntity> getsOutLoanSBySOutLoanMOutLoanNo() {
        return sOutLoanSBySOutLoanMOutLoanNo;
    }

    public void setsOutLoanSBySOutLoanMOutLoanNo(Collection<SOutLoanSEntity> sOutLoanSBySOutLoanMOutLoanNo) {
        this.sOutLoanSBySOutLoanMOutLoanNo = sOutLoanSBySOutLoanMOutLoanNo;
    }
}
