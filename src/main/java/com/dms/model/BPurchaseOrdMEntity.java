package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_purchase_ord_m", schema = "dbo", catalog = "logistics")
public class BPurchaseOrdMEntity {
    private String bPurchaseOrdMOrdProcureNo;
    private String bPurchaseOrdMFactoryBillno;
    private String bPurchaseOrdMHandbillNo;
    private String bPurchaseOrdMClientNo;
    private BigDecimal bPurchaseOrdMAdPaymoney;
    private String bPurchaseOrdMPaymentAttributer;
    private String bPurchaseOrdMPaymentType;
    private Timestamp bPurchaseOrdMOrdDate;
    private String bPurchaseOrdMDeliveryDate;
    private String bPurchaseOrdMFactoryGoodsNo;
    private String bPurchaseOrdMSalesman;
    private BigDecimal bPurchaseOrdMDiscount;
    private String bPurchaseOrdMServiceAttribute;
    private BigDecimal bPurchaseOrdMSumMoney;
    private String bPurchaseOrdMCreateNo;
    private Timestamp bPurchaseOrdMCreateDate;
    private String bPurchaseOrdMModifiNo;
    private Timestamp bPurchaseOrdMModifiTime;
    private String bPurchaseOrdMChecker;
    private Timestamp bPurchaseOrdMCheckDate;
    private String bPurchaseOrdMState;
    private String bPurchaseOrdMNotes;
    private Integer bPurchaseOrdMPrints;
    private String bPurchaseOrdMManagerNo;
    private String bPurchaseOrdMGroupNodeId;
    private String bPurchaseOrdMIsPass;
    private Collection<BAgentInstockMEntity> bAgentInstockMSByBPurchaseOrdMOrdProcureNo;
    private Collection<BProcureMEntity> bProcureMSByBPurchaseOrdMOrdProcureNo;
    private Collection<BProcureMEntity> bProcureMSByBPurchaseOrdMOrdProcureNo_0;
    private TClientEntity tClientByBPurchaseOrdMClientNo;
    private TFactorysEntity tFactorysByBPurchaseOrdMFactoryGoodsNo;
    private TStaffEntity tStaffByBPurchaseOrdMSalesman;
    private TStaffEntity tStaffByBPurchaseOrdMCreateNo;
    private TStaffEntity tStaffByBPurchaseOrdMModifiNo;
    private TStaffEntity tStaffByBPurchaseOrdMChecker;
    private TStaffEntity tStaffByBPurchaseOrdMManagerNo;
    private TOrgEntity tOrgByBPurchaseOrdMGroupNodeId;

    @Id
    @Column(name = "b_purchase_ord_m_ord_procure_no", nullable = false, length = 16)
    public String getbPurchaseOrdMOrdProcureNo() {
        return bPurchaseOrdMOrdProcureNo;
    }

    public void setbPurchaseOrdMOrdProcureNo(String bPurchaseOrdMOrdProcureNo) {
        this.bPurchaseOrdMOrdProcureNo = bPurchaseOrdMOrdProcureNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_factory_billno", nullable = true, length = 30)
    public String getbPurchaseOrdMFactoryBillno() {
        return bPurchaseOrdMFactoryBillno;
    }

    public void setbPurchaseOrdMFactoryBillno(String bPurchaseOrdMFactoryBillno) {
        this.bPurchaseOrdMFactoryBillno = bPurchaseOrdMFactoryBillno;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_handbill_no", nullable = true, length = 20)
    public String getbPurchaseOrdMHandbillNo() {
        return bPurchaseOrdMHandbillNo;
    }

    public void setbPurchaseOrdMHandbillNo(String bPurchaseOrdMHandbillNo) {
        this.bPurchaseOrdMHandbillNo = bPurchaseOrdMHandbillNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_client_no", nullable = false, length = 20)
    public String getbPurchaseOrdMClientNo() {
        return bPurchaseOrdMClientNo;
    }

    public void setbPurchaseOrdMClientNo(String bPurchaseOrdMClientNo) {
        this.bPurchaseOrdMClientNo = bPurchaseOrdMClientNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_ad_paymoney", nullable = true, precision = 6)
    public BigDecimal getbPurchaseOrdMAdPaymoney() {
        return bPurchaseOrdMAdPaymoney;
    }

    public void setbPurchaseOrdMAdPaymoney(BigDecimal bPurchaseOrdMAdPaymoney) {
        this.bPurchaseOrdMAdPaymoney = bPurchaseOrdMAdPaymoney;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_payment_attributer", nullable = true, length = 20)
    public String getbPurchaseOrdMPaymentAttributer() {
        return bPurchaseOrdMPaymentAttributer;
    }

    public void setbPurchaseOrdMPaymentAttributer(String bPurchaseOrdMPaymentAttributer) {
        this.bPurchaseOrdMPaymentAttributer = bPurchaseOrdMPaymentAttributer;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_payment_type", nullable = true, length = 10)
    public String getbPurchaseOrdMPaymentType() {
        return bPurchaseOrdMPaymentType;
    }

    public void setbPurchaseOrdMPaymentType(String bPurchaseOrdMPaymentType) {
        this.bPurchaseOrdMPaymentType = bPurchaseOrdMPaymentType;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_ord_date", nullable = true)
    public Timestamp getbPurchaseOrdMOrdDate() {
        return bPurchaseOrdMOrdDate;
    }

    public void setbPurchaseOrdMOrdDate(Timestamp bPurchaseOrdMOrdDate) {
        this.bPurchaseOrdMOrdDate = bPurchaseOrdMOrdDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_delivery_date", nullable = true, length = 12)
    public String getbPurchaseOrdMDeliveryDate() {
        return bPurchaseOrdMDeliveryDate;
    }

    public void setbPurchaseOrdMDeliveryDate(String bPurchaseOrdMDeliveryDate) {
        this.bPurchaseOrdMDeliveryDate = bPurchaseOrdMDeliveryDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_factory_goods_no", nullable = true, length = 80)
    public String getbPurchaseOrdMFactoryGoodsNo() {
        return bPurchaseOrdMFactoryGoodsNo;
    }

    public void setbPurchaseOrdMFactoryGoodsNo(String bPurchaseOrdMFactoryGoodsNo) {
        this.bPurchaseOrdMFactoryGoodsNo = bPurchaseOrdMFactoryGoodsNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_salesman", nullable = true, length = 8)
    public String getbPurchaseOrdMSalesman() {
        return bPurchaseOrdMSalesman;
    }

    public void setbPurchaseOrdMSalesman(String bPurchaseOrdMSalesman) {
        this.bPurchaseOrdMSalesman = bPurchaseOrdMSalesman;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_discount", nullable = true, precision = 6)
    public BigDecimal getbPurchaseOrdMDiscount() {
        return bPurchaseOrdMDiscount;
    }

    public void setbPurchaseOrdMDiscount(BigDecimal bPurchaseOrdMDiscount) {
        this.bPurchaseOrdMDiscount = bPurchaseOrdMDiscount;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_service_attribute", nullable = true, length = 4)
    public String getbPurchaseOrdMServiceAttribute() {
        return bPurchaseOrdMServiceAttribute;
    }

    public void setbPurchaseOrdMServiceAttribute(String bPurchaseOrdMServiceAttribute) {
        this.bPurchaseOrdMServiceAttribute = bPurchaseOrdMServiceAttribute;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_sum_money", nullable = true, precision = 6)
    public BigDecimal getbPurchaseOrdMSumMoney() {
        return bPurchaseOrdMSumMoney;
    }

    public void setbPurchaseOrdMSumMoney(BigDecimal bPurchaseOrdMSumMoney) {
        this.bPurchaseOrdMSumMoney = bPurchaseOrdMSumMoney;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_create_no", nullable = true, length = 8)
    public String getbPurchaseOrdMCreateNo() {
        return bPurchaseOrdMCreateNo;
    }

    public void setbPurchaseOrdMCreateNo(String bPurchaseOrdMCreateNo) {
        this.bPurchaseOrdMCreateNo = bPurchaseOrdMCreateNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_create_date", nullable = true)
    public Timestamp getbPurchaseOrdMCreateDate() {
        return bPurchaseOrdMCreateDate;
    }

    public void setbPurchaseOrdMCreateDate(Timestamp bPurchaseOrdMCreateDate) {
        this.bPurchaseOrdMCreateDate = bPurchaseOrdMCreateDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_modifi_no", nullable = true, length = 8)
    public String getbPurchaseOrdMModifiNo() {
        return bPurchaseOrdMModifiNo;
    }

    public void setbPurchaseOrdMModifiNo(String bPurchaseOrdMModifiNo) {
        this.bPurchaseOrdMModifiNo = bPurchaseOrdMModifiNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_modifi_time", nullable = true)
    public Timestamp getbPurchaseOrdMModifiTime() {
        return bPurchaseOrdMModifiTime;
    }

    public void setbPurchaseOrdMModifiTime(Timestamp bPurchaseOrdMModifiTime) {
        this.bPurchaseOrdMModifiTime = bPurchaseOrdMModifiTime;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_checker", nullable = true, length = 8)
    public String getbPurchaseOrdMChecker() {
        return bPurchaseOrdMChecker;
    }

    public void setbPurchaseOrdMChecker(String bPurchaseOrdMChecker) {
        this.bPurchaseOrdMChecker = bPurchaseOrdMChecker;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_check_date", nullable = true)
    public Timestamp getbPurchaseOrdMCheckDate() {
        return bPurchaseOrdMCheckDate;
    }

    public void setbPurchaseOrdMCheckDate(Timestamp bPurchaseOrdMCheckDate) {
        this.bPurchaseOrdMCheckDate = bPurchaseOrdMCheckDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_state", nullable = false, length = -1)
    public String getbPurchaseOrdMState() {
        return bPurchaseOrdMState;
    }

    public void setbPurchaseOrdMState(String bPurchaseOrdMState) {
        this.bPurchaseOrdMState = bPurchaseOrdMState;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_notes", nullable = true, length = 200)
    public String getbPurchaseOrdMNotes() {
        return bPurchaseOrdMNotes;
    }

    public void setbPurchaseOrdMNotes(String bPurchaseOrdMNotes) {
        this.bPurchaseOrdMNotes = bPurchaseOrdMNotes;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_prints", nullable = true)
    public Integer getbPurchaseOrdMPrints() {
        return bPurchaseOrdMPrints;
    }

    public void setbPurchaseOrdMPrints(Integer bPurchaseOrdMPrints) {
        this.bPurchaseOrdMPrints = bPurchaseOrdMPrints;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_manager_no", nullable = true, length = 8)
    public String getbPurchaseOrdMManagerNo() {
        return bPurchaseOrdMManagerNo;
    }

    public void setbPurchaseOrdMManagerNo(String bPurchaseOrdMManagerNo) {
        this.bPurchaseOrdMManagerNo = bPurchaseOrdMManagerNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_group_node_id", nullable = true, length = 20)
    public String getbPurchaseOrdMGroupNodeId() {
        return bPurchaseOrdMGroupNodeId;
    }

    public void setbPurchaseOrdMGroupNodeId(String bPurchaseOrdMGroupNodeId) {
        this.bPurchaseOrdMGroupNodeId = bPurchaseOrdMGroupNodeId;
    }

    @Basic
    @Column(name = "b_purchase_ord_m_isPass", nullable = true, length = -1)
    public String getbPurchaseOrdMIsPass() {
        return bPurchaseOrdMIsPass;
    }

    public void setbPurchaseOrdMIsPass(String bPurchaseOrdMIsPass) {
        this.bPurchaseOrdMIsPass = bPurchaseOrdMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BPurchaseOrdMEntity that = (BPurchaseOrdMEntity) o;

        if (bPurchaseOrdMOrdProcureNo != null ? !bPurchaseOrdMOrdProcureNo.equals(that.bPurchaseOrdMOrdProcureNo) : that.bPurchaseOrdMOrdProcureNo != null)
            return false;
        if (bPurchaseOrdMFactoryBillno != null ? !bPurchaseOrdMFactoryBillno.equals(that.bPurchaseOrdMFactoryBillno) : that.bPurchaseOrdMFactoryBillno != null)
            return false;
        if (bPurchaseOrdMHandbillNo != null ? !bPurchaseOrdMHandbillNo.equals(that.bPurchaseOrdMHandbillNo) : that.bPurchaseOrdMHandbillNo != null)
            return false;
        if (bPurchaseOrdMClientNo != null ? !bPurchaseOrdMClientNo.equals(that.bPurchaseOrdMClientNo) : that.bPurchaseOrdMClientNo != null)
            return false;
        if (bPurchaseOrdMAdPaymoney != null ? !bPurchaseOrdMAdPaymoney.equals(that.bPurchaseOrdMAdPaymoney) : that.bPurchaseOrdMAdPaymoney != null)
            return false;
        if (bPurchaseOrdMPaymentAttributer != null ? !bPurchaseOrdMPaymentAttributer.equals(that.bPurchaseOrdMPaymentAttributer) : that.bPurchaseOrdMPaymentAttributer != null)
            return false;
        if (bPurchaseOrdMPaymentType != null ? !bPurchaseOrdMPaymentType.equals(that.bPurchaseOrdMPaymentType) : that.bPurchaseOrdMPaymentType != null)
            return false;
        if (bPurchaseOrdMOrdDate != null ? !bPurchaseOrdMOrdDate.equals(that.bPurchaseOrdMOrdDate) : that.bPurchaseOrdMOrdDate != null)
            return false;
        if (bPurchaseOrdMDeliveryDate != null ? !bPurchaseOrdMDeliveryDate.equals(that.bPurchaseOrdMDeliveryDate) : that.bPurchaseOrdMDeliveryDate != null)
            return false;
        if (bPurchaseOrdMFactoryGoodsNo != null ? !bPurchaseOrdMFactoryGoodsNo.equals(that.bPurchaseOrdMFactoryGoodsNo) : that.bPurchaseOrdMFactoryGoodsNo != null)
            return false;
        if (bPurchaseOrdMSalesman != null ? !bPurchaseOrdMSalesman.equals(that.bPurchaseOrdMSalesman) : that.bPurchaseOrdMSalesman != null)
            return false;
        if (bPurchaseOrdMDiscount != null ? !bPurchaseOrdMDiscount.equals(that.bPurchaseOrdMDiscount) : that.bPurchaseOrdMDiscount != null)
            return false;
        if (bPurchaseOrdMServiceAttribute != null ? !bPurchaseOrdMServiceAttribute.equals(that.bPurchaseOrdMServiceAttribute) : that.bPurchaseOrdMServiceAttribute != null)
            return false;
        if (bPurchaseOrdMSumMoney != null ? !bPurchaseOrdMSumMoney.equals(that.bPurchaseOrdMSumMoney) : that.bPurchaseOrdMSumMoney != null)
            return false;
        if (bPurchaseOrdMCreateNo != null ? !bPurchaseOrdMCreateNo.equals(that.bPurchaseOrdMCreateNo) : that.bPurchaseOrdMCreateNo != null)
            return false;
        if (bPurchaseOrdMCreateDate != null ? !bPurchaseOrdMCreateDate.equals(that.bPurchaseOrdMCreateDate) : that.bPurchaseOrdMCreateDate != null)
            return false;
        if (bPurchaseOrdMModifiNo != null ? !bPurchaseOrdMModifiNo.equals(that.bPurchaseOrdMModifiNo) : that.bPurchaseOrdMModifiNo != null)
            return false;
        if (bPurchaseOrdMModifiTime != null ? !bPurchaseOrdMModifiTime.equals(that.bPurchaseOrdMModifiTime) : that.bPurchaseOrdMModifiTime != null)
            return false;
        if (bPurchaseOrdMChecker != null ? !bPurchaseOrdMChecker.equals(that.bPurchaseOrdMChecker) : that.bPurchaseOrdMChecker != null)
            return false;
        if (bPurchaseOrdMCheckDate != null ? !bPurchaseOrdMCheckDate.equals(that.bPurchaseOrdMCheckDate) : that.bPurchaseOrdMCheckDate != null)
            return false;
        if (bPurchaseOrdMState != null ? !bPurchaseOrdMState.equals(that.bPurchaseOrdMState) : that.bPurchaseOrdMState != null)
            return false;
        if (bPurchaseOrdMNotes != null ? !bPurchaseOrdMNotes.equals(that.bPurchaseOrdMNotes) : that.bPurchaseOrdMNotes != null)
            return false;
        if (bPurchaseOrdMPrints != null ? !bPurchaseOrdMPrints.equals(that.bPurchaseOrdMPrints) : that.bPurchaseOrdMPrints != null)
            return false;
        if (bPurchaseOrdMManagerNo != null ? !bPurchaseOrdMManagerNo.equals(that.bPurchaseOrdMManagerNo) : that.bPurchaseOrdMManagerNo != null)
            return false;
        if (bPurchaseOrdMGroupNodeId != null ? !bPurchaseOrdMGroupNodeId.equals(that.bPurchaseOrdMGroupNodeId) : that.bPurchaseOrdMGroupNodeId != null)
            return false;
        if (bPurchaseOrdMIsPass != null ? !bPurchaseOrdMIsPass.equals(that.bPurchaseOrdMIsPass) : that.bPurchaseOrdMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bPurchaseOrdMOrdProcureNo != null ? bPurchaseOrdMOrdProcureNo.hashCode() : 0;
        result = 31 * result + (bPurchaseOrdMFactoryBillno != null ? bPurchaseOrdMFactoryBillno.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMHandbillNo != null ? bPurchaseOrdMHandbillNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMClientNo != null ? bPurchaseOrdMClientNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMAdPaymoney != null ? bPurchaseOrdMAdPaymoney.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMPaymentAttributer != null ? bPurchaseOrdMPaymentAttributer.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMPaymentType != null ? bPurchaseOrdMPaymentType.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMOrdDate != null ? bPurchaseOrdMOrdDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMDeliveryDate != null ? bPurchaseOrdMDeliveryDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMFactoryGoodsNo != null ? bPurchaseOrdMFactoryGoodsNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMSalesman != null ? bPurchaseOrdMSalesman.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMDiscount != null ? bPurchaseOrdMDiscount.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMServiceAttribute != null ? bPurchaseOrdMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMSumMoney != null ? bPurchaseOrdMSumMoney.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMCreateNo != null ? bPurchaseOrdMCreateNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMCreateDate != null ? bPurchaseOrdMCreateDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMModifiNo != null ? bPurchaseOrdMModifiNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMModifiTime != null ? bPurchaseOrdMModifiTime.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMChecker != null ? bPurchaseOrdMChecker.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMCheckDate != null ? bPurchaseOrdMCheckDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMState != null ? bPurchaseOrdMState.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMNotes != null ? bPurchaseOrdMNotes.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMPrints != null ? bPurchaseOrdMPrints.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMManagerNo != null ? bPurchaseOrdMManagerNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMGroupNodeId != null ? bPurchaseOrdMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdMIsPass != null ? bPurchaseOrdMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bPurchaseOrdMByBAgentInstockMOrdProcureNo")
    public Collection<BAgentInstockMEntity> getbAgentInstockMSByBPurchaseOrdMOrdProcureNo() {
        return bAgentInstockMSByBPurchaseOrdMOrdProcureNo;
    }

    public void setbAgentInstockMSByBPurchaseOrdMOrdProcureNo(Collection<BAgentInstockMEntity> bAgentInstockMSByBPurchaseOrdMOrdProcureNo) {
        this.bAgentInstockMSByBPurchaseOrdMOrdProcureNo = bAgentInstockMSByBPurchaseOrdMOrdProcureNo;
    }

    @OneToMany(mappedBy = "bPurchaseOrdMByBProcureMOrdProcureNo")
    public Collection<BProcureMEntity> getbProcureMSByBPurchaseOrdMOrdProcureNo() {
        return bProcureMSByBPurchaseOrdMOrdProcureNo;
    }

    public void setbProcureMSByBPurchaseOrdMOrdProcureNo(Collection<BProcureMEntity> bProcureMSByBPurchaseOrdMOrdProcureNo) {
        this.bProcureMSByBPurchaseOrdMOrdProcureNo = bProcureMSByBPurchaseOrdMOrdProcureNo;
    }

    @OneToMany(mappedBy = "bPurchaseOrdMByBProcureMOrdProcureNo_0")
    public Collection<BProcureMEntity> getbProcureMSByBPurchaseOrdMOrdProcureNo_0() {
        return bProcureMSByBPurchaseOrdMOrdProcureNo_0;
    }

    public void setbProcureMSByBPurchaseOrdMOrdProcureNo_0(Collection<BProcureMEntity> bProcureMSByBPurchaseOrdMOrdProcureNo_0) {
        this.bProcureMSByBPurchaseOrdMOrdProcureNo_0 = bProcureMSByBPurchaseOrdMOrdProcureNo_0;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_client_no", referencedColumnName = "t_client_client_no", nullable = false,insertable = false, updatable = false)
    public TClientEntity gettClientByBPurchaseOrdMClientNo() {
        return tClientByBPurchaseOrdMClientNo;
    }

    public void settClientByBPurchaseOrdMClientNo(TClientEntity tClientByBPurchaseOrdMClientNo) {
        this.tClientByBPurchaseOrdMClientNo = tClientByBPurchaseOrdMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_factory_goods_no", referencedColumnName = "t_factorys_factory_goods_no",insertable = false, updatable = false)
    public TFactorysEntity gettFactorysByBPurchaseOrdMFactoryGoodsNo() {
        return tFactorysByBPurchaseOrdMFactoryGoodsNo;
    }

    public void settFactorysByBPurchaseOrdMFactoryGoodsNo(TFactorysEntity tFactorysByBPurchaseOrdMFactoryGoodsNo) {
        this.tFactorysByBPurchaseOrdMFactoryGoodsNo = tFactorysByBPurchaseOrdMFactoryGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_salesman", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdMSalesman() {
        return tStaffByBPurchaseOrdMSalesman;
    }

    public void settStaffByBPurchaseOrdMSalesman(TStaffEntity tStaffByBPurchaseOrdMSalesman) {
        this.tStaffByBPurchaseOrdMSalesman = tStaffByBPurchaseOrdMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdMCreateNo() {
        return tStaffByBPurchaseOrdMCreateNo;
    }

    public void settStaffByBPurchaseOrdMCreateNo(TStaffEntity tStaffByBPurchaseOrdMCreateNo) {
        this.tStaffByBPurchaseOrdMCreateNo = tStaffByBPurchaseOrdMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdMModifiNo() {
        return tStaffByBPurchaseOrdMModifiNo;
    }

    public void settStaffByBPurchaseOrdMModifiNo(TStaffEntity tStaffByBPurchaseOrdMModifiNo) {
        this.tStaffByBPurchaseOrdMModifiNo = tStaffByBPurchaseOrdMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdMChecker() {
        return tStaffByBPurchaseOrdMChecker;
    }

    public void settStaffByBPurchaseOrdMChecker(TStaffEntity tStaffByBPurchaseOrdMChecker) {
        this.tStaffByBPurchaseOrdMChecker = tStaffByBPurchaseOrdMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_manager_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdMManagerNo() {
        return tStaffByBPurchaseOrdMManagerNo;
    }

    public void settStaffByBPurchaseOrdMManagerNo(TStaffEntity tStaffByBPurchaseOrdMManagerNo) {
        this.tStaffByBPurchaseOrdMManagerNo = tStaffByBPurchaseOrdMManagerNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_m_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByBPurchaseOrdMGroupNodeId() {
        return tOrgByBPurchaseOrdMGroupNodeId;
    }

    public void settOrgByBPurchaseOrdMGroupNodeId(TOrgEntity tOrgByBPurchaseOrdMGroupNodeId) {
        this.tOrgByBPurchaseOrdMGroupNodeId = tOrgByBPurchaseOrdMGroupNodeId;
    }
}
