package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_in_product_m", schema = "dbo", catalog = "logistics_test")
public class BInProductMEntity {
    private String bInProductMProducStorageNo;
    private String bInProductMHandbillNo;
    private String bInProductMProductionAccountingNo;
    private String bInProductMSupplier;
    private String bInProductMPaymentAttributer;
    private String bInProductMServiceAttribute;
    private BigDecimal bInProductMAdPaymoney;
    private Timestamp bInProductMWarehouseDate;
    private BigDecimal bInProductMDiscount;
    private String bInProductMWarehouseKeeper;
    private String bInProductMSalesman;
    private BigDecimal bInProductMSumMoney;
    private String bInProductMClientNo;
    private String bInProductMCreaterNo;
    private Timestamp bInProductMCreateDate;
    private String bInProductMModifiNo;
    private Timestamp bInProductMModifiTime;
    private String bInProductMChecker;
    private Timestamp bInProductMCheckDate;
    private String bInProductMGroupNodeId;
    private String bInProductMRemark;
    private String bInProductMState;
    private String bInProductMIsPass;
    private TStaffEntity tStaffByBInProductMWarehouseKeeper;
    private TStaffEntity tStaffByBInProductMCreaterNo;
    private TStaffEntity tStaffByBInProductMModifiNo;
    private TStaffEntity tStaffByBInProductMChecker;
    private TOrgEntity tOrgByBInProductMGroupNodeId;
    private Collection<BInProductSEntity> bInProductSByBInProductMProducStorageNo;

    @Id
    @Column(name = "b_in_product_m_producStorage_no", nullable = false, length = 20)
    public String getbInProductMProducStorageNo() {
        return bInProductMProducStorageNo;
    }

    public void setbInProductMProducStorageNo(String bInProductMProducStorageNo) {
        this.bInProductMProducStorageNo = bInProductMProducStorageNo;
    }

    @Basic
    @Column(name = "b_in_product_m_handbill_no", nullable = true, length = 20)
    public String getbInProductMHandbillNo() {
        return bInProductMHandbillNo;
    }

    public void setbInProductMHandbillNo(String bInProductMHandbillNo) {
        this.bInProductMHandbillNo = bInProductMHandbillNo;
    }

    @Basic
    @Column(name = "b_in_product_m_productionAccounting_no", nullable = true, length = 20)
    public String getbInProductMProductionAccountingNo() {
        return bInProductMProductionAccountingNo;
    }

    public void setbInProductMProductionAccountingNo(String bInProductMProductionAccountingNo) {
        this.bInProductMProductionAccountingNo = bInProductMProductionAccountingNo;
    }

    @Basic
    @Column(name = "b_in_product_m_supplier", nullable = true, length = 20)
    public String getbInProductMSupplier() {
        return bInProductMSupplier;
    }

    public void setbInProductMSupplier(String bInProductMSupplier) {
        this.bInProductMSupplier = bInProductMSupplier;
    }

    @Basic
    @Column(name = "b_in_product_m_payment_attributer", nullable = true, length = 20)
    public String getbInProductMPaymentAttributer() {
        return bInProductMPaymentAttributer;
    }

    public void setbInProductMPaymentAttributer(String bInProductMPaymentAttributer) {
        this.bInProductMPaymentAttributer = bInProductMPaymentAttributer;
    }

    @Basic
    @Column(name = "b_in_product_m_service_attribute", nullable = true, length = 4)
    public String getbInProductMServiceAttribute() {
        return bInProductMServiceAttribute;
    }

    public void setbInProductMServiceAttribute(String bInProductMServiceAttribute) {
        this.bInProductMServiceAttribute = bInProductMServiceAttribute;
    }

    @Basic
    @Column(name = "b_in_product_m_ad_paymoney", nullable = false, precision = 4)
    public BigDecimal getbInProductMAdPaymoney() {
        return bInProductMAdPaymoney;
    }

    public void setbInProductMAdPaymoney(BigDecimal bInProductMAdPaymoney) {
        this.bInProductMAdPaymoney = bInProductMAdPaymoney;
    }

    @Basic
    @Column(name = "b_in_product_m_warehouse_date", nullable = true)
    public Timestamp getbInProductMWarehouseDate() {
        return bInProductMWarehouseDate;
    }

    public void setbInProductMWarehouseDate(Timestamp bInProductMWarehouseDate) {
        this.bInProductMWarehouseDate = bInProductMWarehouseDate;
    }

    @Basic
    @Column(name = "b_in_product_m_discount", nullable = false, precision = 6)
    public BigDecimal getbInProductMDiscount() {
        return bInProductMDiscount;
    }

    public void setbInProductMDiscount(BigDecimal bInProductMDiscount) {
        this.bInProductMDiscount = bInProductMDiscount;
    }

    @Basic
    @Column(name = "b_in_product_m_warehouse_keeper", nullable = true, length = 8)
    public String getbInProductMWarehouseKeeper() {
        return bInProductMWarehouseKeeper;
    }

    public void setbInProductMWarehouseKeeper(String bInProductMWarehouseKeeper) {
        this.bInProductMWarehouseKeeper = bInProductMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_in_product_m_salesman", nullable = true, length = 8)
    public String getbInProductMSalesman() {
        return bInProductMSalesman;
    }

    public void setbInProductMSalesman(String bInProductMSalesman) {
        this.bInProductMSalesman = bInProductMSalesman;
    }

    @Basic
    @Column(name = "b_in_product_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getbInProductMSumMoney() {
        return bInProductMSumMoney;
    }

    public void setbInProductMSumMoney(BigDecimal bInProductMSumMoney) {
        this.bInProductMSumMoney = bInProductMSumMoney;
    }

    @Basic
    @Column(name = "b_in_product_m_client_no", nullable = true, length = 20)
    public String getbInProductMClientNo() {
        return bInProductMClientNo;
    }

    public void setbInProductMClientNo(String bInProductMClientNo) {
        this.bInProductMClientNo = bInProductMClientNo;
    }

    @Basic
    @Column(name = "b_in_product_m_creater_no", nullable = false, length = 8)
    public String getbInProductMCreaterNo() {
        return bInProductMCreaterNo;
    }

    public void setbInProductMCreaterNo(String bInProductMCreaterNo) {
        this.bInProductMCreaterNo = bInProductMCreaterNo;
    }

    @Basic
    @Column(name = "b_in_product_m_create_date", nullable = false)
    public Timestamp getbInProductMCreateDate() {
        return bInProductMCreateDate;
    }

    public void setbInProductMCreateDate(Timestamp bInProductMCreateDate) {
        this.bInProductMCreateDate = bInProductMCreateDate;
    }

    @Basic
    @Column(name = "b_in_product_m_modifi_no", nullable = false, length = 8)
    public String getbInProductMModifiNo() {
        return bInProductMModifiNo;
    }

    public void setbInProductMModifiNo(String bInProductMModifiNo) {
        this.bInProductMModifiNo = bInProductMModifiNo;
    }

    @Basic
    @Column(name = "b_in_product_m_modifi_time", nullable = false)
    public Timestamp getbInProductMModifiTime() {
        return bInProductMModifiTime;
    }

    public void setbInProductMModifiTime(Timestamp bInProductMModifiTime) {
        this.bInProductMModifiTime = bInProductMModifiTime;
    }

    @Basic
    @Column(name = "b_in_product_m_checker", nullable = false, length = 8)
    public String getbInProductMChecker() {
        return bInProductMChecker;
    }

    public void setbInProductMChecker(String bInProductMChecker) {
        this.bInProductMChecker = bInProductMChecker;
    }

    @Basic
    @Column(name = "b_in_product_m_check_date", nullable = false)
    public Timestamp getbInProductMCheckDate() {
        return bInProductMCheckDate;
    }

    public void setbInProductMCheckDate(Timestamp bInProductMCheckDate) {
        this.bInProductMCheckDate = bInProductMCheckDate;
    }

    @Basic
    @Column(name = "b_in_product_m_group_node_id", nullable = false, length = 20)
    public String getbInProductMGroupNodeId() {
        return bInProductMGroupNodeId;
    }

    public void setbInProductMGroupNodeId(String bInProductMGroupNodeId) {
        this.bInProductMGroupNodeId = bInProductMGroupNodeId;
    }

    @Basic
    @Column(name = "b_in_product_m_remark", nullable = true, length = 200)
    public String getbInProductMRemark() {
        return bInProductMRemark;
    }

    public void setbInProductMRemark(String bInProductMRemark) {
        this.bInProductMRemark = bInProductMRemark;
    }

    @Basic
    @Column(name = "b_in_product_m_state", nullable = true, length = 1)
    public String getbInProductMState() {
        return bInProductMState;
    }

    public void setbInProductMState(String bInProductMState) {
        this.bInProductMState = bInProductMState;
    }

    @Basic
    @Column(name = "b_in_product_m_isPass", nullable = true, length = 1)
    public String getbInProductMIsPass() {
        return bInProductMIsPass;
    }

    public void setbInProductMIsPass(String bInProductMIsPass) {
        this.bInProductMIsPass = bInProductMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInProductMEntity that = (BInProductMEntity) o;

        if (bInProductMProducStorageNo != null ? !bInProductMProducStorageNo.equals(that.bInProductMProducStorageNo) : that.bInProductMProducStorageNo != null)
            return false;
        if (bInProductMHandbillNo != null ? !bInProductMHandbillNo.equals(that.bInProductMHandbillNo) : that.bInProductMHandbillNo != null)
            return false;
        if (bInProductMProductionAccountingNo != null ? !bInProductMProductionAccountingNo.equals(that.bInProductMProductionAccountingNo) : that.bInProductMProductionAccountingNo != null)
            return false;
        if (bInProductMSupplier != null ? !bInProductMSupplier.equals(that.bInProductMSupplier) : that.bInProductMSupplier != null)
            return false;
        if (bInProductMPaymentAttributer != null ? !bInProductMPaymentAttributer.equals(that.bInProductMPaymentAttributer) : that.bInProductMPaymentAttributer != null)
            return false;
        if (bInProductMServiceAttribute != null ? !bInProductMServiceAttribute.equals(that.bInProductMServiceAttribute) : that.bInProductMServiceAttribute != null)
            return false;
        if (bInProductMAdPaymoney != null ? !bInProductMAdPaymoney.equals(that.bInProductMAdPaymoney) : that.bInProductMAdPaymoney != null)
            return false;
        if (bInProductMWarehouseDate != null ? !bInProductMWarehouseDate.equals(that.bInProductMWarehouseDate) : that.bInProductMWarehouseDate != null)
            return false;
        if (bInProductMDiscount != null ? !bInProductMDiscount.equals(that.bInProductMDiscount) : that.bInProductMDiscount != null)
            return false;
        if (bInProductMWarehouseKeeper != null ? !bInProductMWarehouseKeeper.equals(that.bInProductMWarehouseKeeper) : that.bInProductMWarehouseKeeper != null)
            return false;
        if (bInProductMSalesman != null ? !bInProductMSalesman.equals(that.bInProductMSalesman) : that.bInProductMSalesman != null)
            return false;
        if (bInProductMSumMoney != null ? !bInProductMSumMoney.equals(that.bInProductMSumMoney) : that.bInProductMSumMoney != null)
            return false;
        if (bInProductMClientNo != null ? !bInProductMClientNo.equals(that.bInProductMClientNo) : that.bInProductMClientNo != null)
            return false;
        if (bInProductMCreaterNo != null ? !bInProductMCreaterNo.equals(that.bInProductMCreaterNo) : that.bInProductMCreaterNo != null)
            return false;
        if (bInProductMCreateDate != null ? !bInProductMCreateDate.equals(that.bInProductMCreateDate) : that.bInProductMCreateDate != null)
            return false;
        if (bInProductMModifiNo != null ? !bInProductMModifiNo.equals(that.bInProductMModifiNo) : that.bInProductMModifiNo != null)
            return false;
        if (bInProductMModifiTime != null ? !bInProductMModifiTime.equals(that.bInProductMModifiTime) : that.bInProductMModifiTime != null)
            return false;
        if (bInProductMChecker != null ? !bInProductMChecker.equals(that.bInProductMChecker) : that.bInProductMChecker != null)
            return false;
        if (bInProductMCheckDate != null ? !bInProductMCheckDate.equals(that.bInProductMCheckDate) : that.bInProductMCheckDate != null)
            return false;
        if (bInProductMGroupNodeId != null ? !bInProductMGroupNodeId.equals(that.bInProductMGroupNodeId) : that.bInProductMGroupNodeId != null)
            return false;
        if (bInProductMRemark != null ? !bInProductMRemark.equals(that.bInProductMRemark) : that.bInProductMRemark != null)
            return false;
        if (bInProductMState != null ? !bInProductMState.equals(that.bInProductMState) : that.bInProductMState != null)
            return false;
        if (bInProductMIsPass != null ? !bInProductMIsPass.equals(that.bInProductMIsPass) : that.bInProductMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInProductMProducStorageNo != null ? bInProductMProducStorageNo.hashCode() : 0;
        result = 31 * result + (bInProductMHandbillNo != null ? bInProductMHandbillNo.hashCode() : 0);
        result = 31 * result + (bInProductMProductionAccountingNo != null ? bInProductMProductionAccountingNo.hashCode() : 0);
        result = 31 * result + (bInProductMSupplier != null ? bInProductMSupplier.hashCode() : 0);
        result = 31 * result + (bInProductMPaymentAttributer != null ? bInProductMPaymentAttributer.hashCode() : 0);
        result = 31 * result + (bInProductMServiceAttribute != null ? bInProductMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bInProductMAdPaymoney != null ? bInProductMAdPaymoney.hashCode() : 0);
        result = 31 * result + (bInProductMWarehouseDate != null ? bInProductMWarehouseDate.hashCode() : 0);
        result = 31 * result + (bInProductMDiscount != null ? bInProductMDiscount.hashCode() : 0);
        result = 31 * result + (bInProductMWarehouseKeeper != null ? bInProductMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bInProductMSalesman != null ? bInProductMSalesman.hashCode() : 0);
        result = 31 * result + (bInProductMSumMoney != null ? bInProductMSumMoney.hashCode() : 0);
        result = 31 * result + (bInProductMClientNo != null ? bInProductMClientNo.hashCode() : 0);
        result = 31 * result + (bInProductMCreaterNo != null ? bInProductMCreaterNo.hashCode() : 0);
        result = 31 * result + (bInProductMCreateDate != null ? bInProductMCreateDate.hashCode() : 0);
        result = 31 * result + (bInProductMModifiNo != null ? bInProductMModifiNo.hashCode() : 0);
        result = 31 * result + (bInProductMModifiTime != null ? bInProductMModifiTime.hashCode() : 0);
        result = 31 * result + (bInProductMChecker != null ? bInProductMChecker.hashCode() : 0);
        result = 31 * result + (bInProductMCheckDate != null ? bInProductMCheckDate.hashCode() : 0);
        result = 31 * result + (bInProductMGroupNodeId != null ? bInProductMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bInProductMRemark != null ? bInProductMRemark.hashCode() : 0);
        result = 31 * result + (bInProductMState != null ? bInProductMState.hashCode() : 0);
        result = 31 * result + (bInProductMIsPass != null ? bInProductMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBInProductMWarehouseKeeper() {
        return tStaffByBInProductMWarehouseKeeper;
    }

    public void settStaffByBInProductMWarehouseKeeper(TStaffEntity tStaffByBInProductMWarehouseKeeper) {
        this.tStaffByBInProductMWarehouseKeeper = tStaffByBInProductMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_m_creater_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffByBInProductMCreaterNo() {
        return tStaffByBInProductMCreaterNo;
    }

    public void settStaffByBInProductMCreaterNo(TStaffEntity tStaffByBInProductMCreaterNo) {
        this.tStaffByBInProductMCreaterNo = tStaffByBInProductMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_m_modifi_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffByBInProductMModifiNo() {
        return tStaffByBInProductMModifiNo;
    }

    public void settStaffByBInProductMModifiNo(TStaffEntity tStaffByBInProductMModifiNo) {
        this.tStaffByBInProductMModifiNo = tStaffByBInProductMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_m_checker", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffByBInProductMChecker() {
        return tStaffByBInProductMChecker;
    }

    public void settStaffByBInProductMChecker(TStaffEntity tStaffByBInProductMChecker) {
        this.tStaffByBInProductMChecker = tStaffByBInProductMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBInProductMGroupNodeId() {
        return tOrgByBInProductMGroupNodeId;
    }

    public void settOrgByBInProductMGroupNodeId(TOrgEntity tOrgByBInProductMGroupNodeId) {
        this.tOrgByBInProductMGroupNodeId = tOrgByBInProductMGroupNodeId;
    }

    @OneToMany(mappedBy = "bInProductMByBInProductSProducStorageNo")
    public Collection<BInProductSEntity> getbInProductSByBInProductMProducStorageNo() {
        return bInProductSByBInProductMProducStorageNo;
    }

    public void setbInProductSByBInProductMProducStorageNo(Collection<BInProductSEntity> bInProductSByBInProductMProducStorageNo) {
        this.bInProductSByBInProductMProducStorageNo = bInProductSByBInProductMProducStorageNo;
    }
}
