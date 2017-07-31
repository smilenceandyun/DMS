package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_s_order_m", schema = "dbo", catalog = "logistics")
public class BSOrderMEntity {
    private String bSOrderMSOrderNo;
    private String bSOrderMClientNo;
    private String bSOrderMLinkman;
    private String bSOrderMTel;
    private String bSOrderMEMail;
    private String bSOrderMClientAddress;
    private String bSOrderMGroupNodeId;
    private String bSOrderMHandbillNo;
    private Timestamp bSOrderMOrdDate;
    private String bSOrderMOrderNo;
    private BigDecimal bSOrderMSalesDiscount;
    private BigDecimal bSOrderMSumMoney;
    private String bSOrderMSalesman;
    private String bSOrderMState;
    private String bSOrderMNotes;
    private Timestamp bSOrderMCreateDate;
    private Timestamp bSOrderMModifiTime;
    private Integer bSOrderMPrints;
    private Timestamp bSOrderMCheckDate;
    private String bSOrderMSalesTypeNo;
    private String bSOrderMChecker;
    private String bSOrderMModifiNo;
    private String bSOrderMCreateNo;
    private Timestamp bSOrderMSendDate;
    private BigDecimal bSOrderMAdPaymoney;
    private String bSOrderMIsPass;
    private Collection<BOutPresentMEntity> bOutPresentMSByBSOrderMSOrderNo;
    private TClientEntity tClientByBSOrderMClientNo;
    private TOrgEntity tOrgByBSOrderMGroupNodeId;
    private TStaffEntity tStaffByBSOrderMSalesman;
    private SalesPropertiesEntity salesPropertiesByBSOrderMSalesTypeNo;
    private TStaffEntity tStaffByBSOrderMChecker;
    private TStaffEntity tStaffByBSOrderMModifiNo;
    private TStaffEntity tStaffByBSOrderMCreateNo;
    private Collection<BSOrderSEntity> bSOrderSByBSOrderMSOrderNo;
    private Collection<BSProcureMEntity> bSProcureMSByBSOrderMSOrderNo;
    private Collection<BSalesMEntity> bSalesMSByBSOrderMSOrderNo;

    @Id
    @Column(name = "b_s_order_m_s_order_no", nullable = false, length = 16)
    public String getbSOrderMSOrderNo() {
        return bSOrderMSOrderNo;
    }

    public void setbSOrderMSOrderNo(String bSOrderMSOrderNo) {
        this.bSOrderMSOrderNo = bSOrderMSOrderNo;
    }

    @Basic
    @Column(name = "b_s_order_m_client_no", nullable = false, length = 20)
    public String getbSOrderMClientNo() {
        return bSOrderMClientNo;
    }

    public void setbSOrderMClientNo(String bSOrderMClientNo) {
        this.bSOrderMClientNo = bSOrderMClientNo;
    }

    @Basic
    @Column(name = "b_s_order_m_linkman", nullable = true, length = 50)
    public String getbSOrderMLinkman() {
        return bSOrderMLinkman;
    }

    public void setbSOrderMLinkman(String bSOrderMLinkman) {
        this.bSOrderMLinkman = bSOrderMLinkman;
    }

    @Basic
    @Column(name = "b_s_order_m_tel", nullable = true, length = 30)
    public String getbSOrderMTel() {
        return bSOrderMTel;
    }

    public void setbSOrderMTel(String bSOrderMTel) {
        this.bSOrderMTel = bSOrderMTel;
    }

    @Basic
    @Column(name = "b_s_order_m_e_mail", nullable = true, length = 100)
    public String getbSOrderMEMail() {
        return bSOrderMEMail;
    }

    public void setbSOrderMEMail(String bSOrderMEMail) {
        this.bSOrderMEMail = bSOrderMEMail;
    }

    @Basic
    @Column(name = "b_s_order_m_client_address", nullable = true, length = 200)
    public String getbSOrderMClientAddress() {
        return bSOrderMClientAddress;
    }

    public void setbSOrderMClientAddress(String bSOrderMClientAddress) {
        this.bSOrderMClientAddress = bSOrderMClientAddress;
    }

    @Basic
    @Column(name = "b_s_order_m_group_node_id", nullable = false, length = 20)
    public String getbSOrderMGroupNodeId() {
        return bSOrderMGroupNodeId;
    }

    public void setbSOrderMGroupNodeId(String bSOrderMGroupNodeId) {
        this.bSOrderMGroupNodeId = bSOrderMGroupNodeId;
    }

    @Basic
    @Column(name = "b_s_order_m_handbill_no", nullable = true, length = 20)
    public String getbSOrderMHandbillNo() {
        return bSOrderMHandbillNo;
    }

    public void setbSOrderMHandbillNo(String bSOrderMHandbillNo) {
        this.bSOrderMHandbillNo = bSOrderMHandbillNo;
    }

    @Basic
    @Column(name = "b_s_order_m_ord_date", nullable = true)
    public Timestamp getbSOrderMOrdDate() {
        return bSOrderMOrdDate;
    }

    public void setbSOrderMOrdDate(Timestamp bSOrderMOrdDate) {
        this.bSOrderMOrdDate = bSOrderMOrdDate;
    }

    @Basic
    @Column(name = "b_s_order_m_order_no", nullable = true, length = 20)
    public String getbSOrderMOrderNo() {
        return bSOrderMOrderNo;
    }

    public void setbSOrderMOrderNo(String bSOrderMOrderNo) {
        this.bSOrderMOrderNo = bSOrderMOrderNo;
    }

    @Basic
    @Column(name = "b_s_order_m_sales_discount", nullable = true, precision = 4)
    public BigDecimal getbSOrderMSalesDiscount() {
        return bSOrderMSalesDiscount;
    }

    public void setbSOrderMSalesDiscount(BigDecimal bSOrderMSalesDiscount) {
        this.bSOrderMSalesDiscount = bSOrderMSalesDiscount;
    }

    @Basic
    @Column(name = "b_s_order_m_sum_money", nullable = true, precision = 6)
    public BigDecimal getbSOrderMSumMoney() {
        return bSOrderMSumMoney;
    }

    public void setbSOrderMSumMoney(BigDecimal bSOrderMSumMoney) {
        this.bSOrderMSumMoney = bSOrderMSumMoney;
    }

    @Basic
    @Column(name = "b_s_order_m_salesman", nullable = true, length = 8)
    public String getbSOrderMSalesman() {
        return bSOrderMSalesman;
    }

    public void setbSOrderMSalesman(String bSOrderMSalesman) {
        this.bSOrderMSalesman = bSOrderMSalesman;
    }

    @Basic
    @Column(name = "b_s_order_m_state", nullable = true, length = -1)
    public String getbSOrderMState() {
        return bSOrderMState;
    }

    public void setbSOrderMState(String bSOrderMState) {
        this.bSOrderMState = bSOrderMState;
    }

    @Basic
    @Column(name = "b_s_order_m_notes", nullable = true, length = 200)
    public String getbSOrderMNotes() {
        return bSOrderMNotes;
    }

    public void setbSOrderMNotes(String bSOrderMNotes) {
        this.bSOrderMNotes = bSOrderMNotes;
    }

    @Basic
    @Column(name = "b_s_order_m_create_date", nullable = true)
    public Timestamp getbSOrderMCreateDate() {
        return bSOrderMCreateDate;
    }

    public void setbSOrderMCreateDate(Timestamp bSOrderMCreateDate) {
        this.bSOrderMCreateDate = bSOrderMCreateDate;
    }

    @Basic
    @Column(name = "b_s_order_m_modifi_time", nullable = true)
    public Timestamp getbSOrderMModifiTime() {
        return bSOrderMModifiTime;
    }

    public void setbSOrderMModifiTime(Timestamp bSOrderMModifiTime) {
        this.bSOrderMModifiTime = bSOrderMModifiTime;
    }

    @Basic
    @Column(name = "b_s_order_m_prints", nullable = true)
    public Integer getbSOrderMPrints() {
        return bSOrderMPrints;
    }

    public void setbSOrderMPrints(Integer bSOrderMPrints) {
        this.bSOrderMPrints = bSOrderMPrints;
    }

    @Basic
    @Column(name = "b_s_order_m_check_date", nullable = true)
    public Timestamp getbSOrderMCheckDate() {
        return bSOrderMCheckDate;
    }

    public void setbSOrderMCheckDate(Timestamp bSOrderMCheckDate) {
        this.bSOrderMCheckDate = bSOrderMCheckDate;
    }

    @Basic
    @Column(name = "b_s_order_m_sales_type_no", nullable = true, length = 6)
    public String getbSOrderMSalesTypeNo() {
        return bSOrderMSalesTypeNo;
    }

    public void setbSOrderMSalesTypeNo(String bSOrderMSalesTypeNo) {
        this.bSOrderMSalesTypeNo = bSOrderMSalesTypeNo;
    }

    @Basic
    @Column(name = "b_s_order_m_checker", nullable = true, length = 8)
    public String getbSOrderMChecker() {
        return bSOrderMChecker;
    }

    public void setbSOrderMChecker(String bSOrderMChecker) {
        this.bSOrderMChecker = bSOrderMChecker;
    }

    @Basic
    @Column(name = "b_s_order_m_modifi_no", nullable = true, length = 8)
    public String getbSOrderMModifiNo() {
        return bSOrderMModifiNo;
    }

    public void setbSOrderMModifiNo(String bSOrderMModifiNo) {
        this.bSOrderMModifiNo = bSOrderMModifiNo;
    }

    @Basic
    @Column(name = "b_s_order_m_create_no", nullable = true, length = 8)
    public String getbSOrderMCreateNo() {
        return bSOrderMCreateNo;
    }

    public void setbSOrderMCreateNo(String bSOrderMCreateNo) {
        this.bSOrderMCreateNo = bSOrderMCreateNo;
    }

    @Basic
    @Column(name = "b_s_order_m_send_date", nullable = true)
    public Timestamp getbSOrderMSendDate() {
        return bSOrderMSendDate;
    }

    public void setbSOrderMSendDate(Timestamp bSOrderMSendDate) {
        this.bSOrderMSendDate = bSOrderMSendDate;
    }

    @Basic
    @Column(name = "b_s_order_m_ad_paymoney", nullable = true, precision = 4)
    public BigDecimal getbSOrderMAdPaymoney() {
        return bSOrderMAdPaymoney;
    }

    public void setbSOrderMAdPaymoney(BigDecimal bSOrderMAdPaymoney) {
        this.bSOrderMAdPaymoney = bSOrderMAdPaymoney;
    }

    @Basic
    @Column(name = "b_s_order_m_isPass", nullable = true, length = -1)
    public String getbSOrderMIsPass() {
        return bSOrderMIsPass;
    }

    public void setbSOrderMIsPass(String bSOrderMIsPass) {
        this.bSOrderMIsPass = bSOrderMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSOrderMEntity that = (BSOrderMEntity) o;

        if (bSOrderMSOrderNo != null ? !bSOrderMSOrderNo.equals(that.bSOrderMSOrderNo) : that.bSOrderMSOrderNo != null)
            return false;
        if (bSOrderMClientNo != null ? !bSOrderMClientNo.equals(that.bSOrderMClientNo) : that.bSOrderMClientNo != null)
            return false;
        if (bSOrderMLinkman != null ? !bSOrderMLinkman.equals(that.bSOrderMLinkman) : that.bSOrderMLinkman != null)
            return false;
        if (bSOrderMTel != null ? !bSOrderMTel.equals(that.bSOrderMTel) : that.bSOrderMTel != null) return false;
        if (bSOrderMEMail != null ? !bSOrderMEMail.equals(that.bSOrderMEMail) : that.bSOrderMEMail != null)
            return false;
        if (bSOrderMClientAddress != null ? !bSOrderMClientAddress.equals(that.bSOrderMClientAddress) : that.bSOrderMClientAddress != null)
            return false;
        if (bSOrderMGroupNodeId != null ? !bSOrderMGroupNodeId.equals(that.bSOrderMGroupNodeId) : that.bSOrderMGroupNodeId != null)
            return false;
        if (bSOrderMHandbillNo != null ? !bSOrderMHandbillNo.equals(that.bSOrderMHandbillNo) : that.bSOrderMHandbillNo != null)
            return false;
        if (bSOrderMOrdDate != null ? !bSOrderMOrdDate.equals(that.bSOrderMOrdDate) : that.bSOrderMOrdDate != null)
            return false;
        if (bSOrderMOrderNo != null ? !bSOrderMOrderNo.equals(that.bSOrderMOrderNo) : that.bSOrderMOrderNo != null)
            return false;
        if (bSOrderMSalesDiscount != null ? !bSOrderMSalesDiscount.equals(that.bSOrderMSalesDiscount) : that.bSOrderMSalesDiscount != null)
            return false;
        if (bSOrderMSumMoney != null ? !bSOrderMSumMoney.equals(that.bSOrderMSumMoney) : that.bSOrderMSumMoney != null)
            return false;
        if (bSOrderMSalesman != null ? !bSOrderMSalesman.equals(that.bSOrderMSalesman) : that.bSOrderMSalesman != null)
            return false;
        if (bSOrderMState != null ? !bSOrderMState.equals(that.bSOrderMState) : that.bSOrderMState != null)
            return false;
        if (bSOrderMNotes != null ? !bSOrderMNotes.equals(that.bSOrderMNotes) : that.bSOrderMNotes != null)
            return false;
        if (bSOrderMCreateDate != null ? !bSOrderMCreateDate.equals(that.bSOrderMCreateDate) : that.bSOrderMCreateDate != null)
            return false;
        if (bSOrderMModifiTime != null ? !bSOrderMModifiTime.equals(that.bSOrderMModifiTime) : that.bSOrderMModifiTime != null)
            return false;
        if (bSOrderMPrints != null ? !bSOrderMPrints.equals(that.bSOrderMPrints) : that.bSOrderMPrints != null)
            return false;
        if (bSOrderMCheckDate != null ? !bSOrderMCheckDate.equals(that.bSOrderMCheckDate) : that.bSOrderMCheckDate != null)
            return false;
        if (bSOrderMSalesTypeNo != null ? !bSOrderMSalesTypeNo.equals(that.bSOrderMSalesTypeNo) : that.bSOrderMSalesTypeNo != null)
            return false;
        if (bSOrderMChecker != null ? !bSOrderMChecker.equals(that.bSOrderMChecker) : that.bSOrderMChecker != null)
            return false;
        if (bSOrderMModifiNo != null ? !bSOrderMModifiNo.equals(that.bSOrderMModifiNo) : that.bSOrderMModifiNo != null)
            return false;
        if (bSOrderMCreateNo != null ? !bSOrderMCreateNo.equals(that.bSOrderMCreateNo) : that.bSOrderMCreateNo != null)
            return false;
        if (bSOrderMSendDate != null ? !bSOrderMSendDate.equals(that.bSOrderMSendDate) : that.bSOrderMSendDate != null)
            return false;
        if (bSOrderMAdPaymoney != null ? !bSOrderMAdPaymoney.equals(that.bSOrderMAdPaymoney) : that.bSOrderMAdPaymoney != null)
            return false;
        if (bSOrderMIsPass != null ? !bSOrderMIsPass.equals(that.bSOrderMIsPass) : that.bSOrderMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSOrderMSOrderNo != null ? bSOrderMSOrderNo.hashCode() : 0;
        result = 31 * result + (bSOrderMClientNo != null ? bSOrderMClientNo.hashCode() : 0);
        result = 31 * result + (bSOrderMLinkman != null ? bSOrderMLinkman.hashCode() : 0);
        result = 31 * result + (bSOrderMTel != null ? bSOrderMTel.hashCode() : 0);
        result = 31 * result + (bSOrderMEMail != null ? bSOrderMEMail.hashCode() : 0);
        result = 31 * result + (bSOrderMClientAddress != null ? bSOrderMClientAddress.hashCode() : 0);
        result = 31 * result + (bSOrderMGroupNodeId != null ? bSOrderMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSOrderMHandbillNo != null ? bSOrderMHandbillNo.hashCode() : 0);
        result = 31 * result + (bSOrderMOrdDate != null ? bSOrderMOrdDate.hashCode() : 0);
        result = 31 * result + (bSOrderMOrderNo != null ? bSOrderMOrderNo.hashCode() : 0);
        result = 31 * result + (bSOrderMSalesDiscount != null ? bSOrderMSalesDiscount.hashCode() : 0);
        result = 31 * result + (bSOrderMSumMoney != null ? bSOrderMSumMoney.hashCode() : 0);
        result = 31 * result + (bSOrderMSalesman != null ? bSOrderMSalesman.hashCode() : 0);
        result = 31 * result + (bSOrderMState != null ? bSOrderMState.hashCode() : 0);
        result = 31 * result + (bSOrderMNotes != null ? bSOrderMNotes.hashCode() : 0);
        result = 31 * result + (bSOrderMCreateDate != null ? bSOrderMCreateDate.hashCode() : 0);
        result = 31 * result + (bSOrderMModifiTime != null ? bSOrderMModifiTime.hashCode() : 0);
        result = 31 * result + (bSOrderMPrints != null ? bSOrderMPrints.hashCode() : 0);
        result = 31 * result + (bSOrderMCheckDate != null ? bSOrderMCheckDate.hashCode() : 0);
        result = 31 * result + (bSOrderMSalesTypeNo != null ? bSOrderMSalesTypeNo.hashCode() : 0);
        result = 31 * result + (bSOrderMChecker != null ? bSOrderMChecker.hashCode() : 0);
        result = 31 * result + (bSOrderMModifiNo != null ? bSOrderMModifiNo.hashCode() : 0);
        result = 31 * result + (bSOrderMCreateNo != null ? bSOrderMCreateNo.hashCode() : 0);
        result = 31 * result + (bSOrderMSendDate != null ? bSOrderMSendDate.hashCode() : 0);
        result = 31 * result + (bSOrderMAdPaymoney != null ? bSOrderMAdPaymoney.hashCode() : 0);
        result = 31 * result + (bSOrderMIsPass != null ? bSOrderMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bSOrderMByBOutPresentMSOrderNo")
    public Collection<BOutPresentMEntity> getbOutPresentMSByBSOrderMSOrderNo() {
        return bOutPresentMSByBSOrderMSOrderNo;
    }

    public void setbOutPresentMSByBSOrderMSOrderNo(Collection<BOutPresentMEntity> bOutPresentMSByBSOrderMSOrderNo) {
        this.bOutPresentMSByBSOrderMSOrderNo = bOutPresentMSByBSOrderMSOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_client_no", referencedColumnName = "t_client_client_no", nullable = false,insertable = false, updatable = false)
    public TClientEntity gettClientByBSOrderMClientNo() {
        return tClientByBSOrderMClientNo;
    }

    public void settClientByBSOrderMClientNo(TClientEntity tClientByBSOrderMClientNo) {
        this.tClientByBSOrderMClientNo = tClientByBSOrderMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBSOrderMGroupNodeId() {
        return tOrgByBSOrderMGroupNodeId;
    }

    public void settOrgByBSOrderMGroupNodeId(TOrgEntity tOrgByBSOrderMGroupNodeId) {
        this.tOrgByBSOrderMGroupNodeId = tOrgByBSOrderMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_salesman", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSOrderMSalesman() {
        return tStaffByBSOrderMSalesman;
    }

    public void settStaffByBSOrderMSalesman(TStaffEntity tStaffByBSOrderMSalesman) {
        this.tStaffByBSOrderMSalesman = tStaffByBSOrderMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_sales_type_no", referencedColumnName = "sales_properties_sales_type_no",insertable = false, updatable = false)
    public SalesPropertiesEntity getSalesPropertiesByBSOrderMSalesTypeNo() {
        return salesPropertiesByBSOrderMSalesTypeNo;
    }

    public void setSalesPropertiesByBSOrderMSalesTypeNo(SalesPropertiesEntity salesPropertiesByBSOrderMSalesTypeNo) {
        this.salesPropertiesByBSOrderMSalesTypeNo = salesPropertiesByBSOrderMSalesTypeNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSOrderMChecker() {
        return tStaffByBSOrderMChecker;
    }

    public void settStaffByBSOrderMChecker(TStaffEntity tStaffByBSOrderMChecker) {
        this.tStaffByBSOrderMChecker = tStaffByBSOrderMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSOrderMModifiNo() {
        return tStaffByBSOrderMModifiNo;
    }

    public void settStaffByBSOrderMModifiNo(TStaffEntity tStaffByBSOrderMModifiNo) {
        this.tStaffByBSOrderMModifiNo = tStaffByBSOrderMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_m_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSOrderMCreateNo() {
        return tStaffByBSOrderMCreateNo;
    }

    public void settStaffByBSOrderMCreateNo(TStaffEntity tStaffByBSOrderMCreateNo) {
        this.tStaffByBSOrderMCreateNo = tStaffByBSOrderMCreateNo;
    }

    @OneToMany(mappedBy = "bSOrderMByBSOrderSSOrderNo")
    public Collection<BSOrderSEntity> getbSOrderSByBSOrderMSOrderNo() {
        return bSOrderSByBSOrderMSOrderNo;
    }

    public void setbSOrderSByBSOrderMSOrderNo(Collection<BSOrderSEntity> bSOrderSByBSOrderMSOrderNo) {
        this.bSOrderSByBSOrderMSOrderNo = bSOrderSByBSOrderMSOrderNo;
    }

    @OneToMany(mappedBy = "bSOrderMByBSProcureMSOrderNo")
    public Collection<BSProcureMEntity> getbSProcureMSByBSOrderMSOrderNo() {
        return bSProcureMSByBSOrderMSOrderNo;
    }

    public void setbSProcureMSByBSOrderMSOrderNo(Collection<BSProcureMEntity> bSProcureMSByBSOrderMSOrderNo) {
        this.bSProcureMSByBSOrderMSOrderNo = bSProcureMSByBSOrderMSOrderNo;
    }

    @OneToMany(mappedBy = "bSOrderMByBSalesMSOrderNo")
    public Collection<BSalesMEntity> getbSalesMSByBSOrderMSOrderNo() {
        return bSalesMSByBSOrderMSOrderNo;
    }

    public void setbSalesMSByBSOrderMSOrderNo(Collection<BSalesMEntity> bSalesMSByBSOrderMSOrderNo) {
        this.bSalesMSByBSOrderMSOrderNo = bSalesMSByBSOrderMSOrderNo;
    }
}
