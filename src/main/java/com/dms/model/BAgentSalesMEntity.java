package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_agent_sales_m", schema = "dbo", catalog = "logistics_test")
public class BAgentSalesMEntity {
    private String bAgentSalesMAgentSalesNo;
    private String bAgentSalesMNotificationNo;
    private String bAgentSalesMEntrustClientNo;
    private String bAgentSalesMEntrustClientName;
    private Timestamp bAgentSalesMEntrustDate;
    private String bAgentSalesMEntrustLinkman;
    private String bAgentSalesMEntrustTel;
    private String bAgentSalesMClientNo;
    private String bAgentSalesMHandbillNo;
    private Timestamp bAgentSalesMOrdDate;
    private String bAgentSalesMOrderNo;
    private BigDecimal bAgentSalesMSalesDiscount;
    private BigDecimal bAgentSalesMSumMoney;
    private String bAgentSalesMSalesman;
    private String bAgentSalesMState;
    private String bAgentSalesMCreaterNo;
    private Timestamp bAgentSalesMCreateDate;
    private String bAgentSalesMModifiNo;
    private Timestamp bAgentSalesMModifiTime;
    private String bAgentSalesMChecker;
    private Timestamp bAgentSalesMCheckDate;
    private String bAgentSalesMGroupNodeId;
    private String bAgentSalesMNotes;
    private Integer bAgentSalesMPrints;
    private Timestamp bAgentSalesMOccurrenceDate;
    private String bAgentSalesMIsPass;
    private BAgentRsalesMEntity bAgentRsalesMByBAgentSalesMAgentSalesNo;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByBAgentSalesMAgentSalesNo;
    private TClientEntity tClientByBAgentSalesMClientNo;
    private TStaffEntity tStaffByBAgentSalesMSalesman;
    private TStaffEntity tStaffByBAgentSalesMCreaterNo;
    private TStaffEntity tStaffByBAgentSalesMModifiNo;
    private TStaffEntity tStaffByBAgentSalesMChecker;
    private TOrgEntity tOrgByBAgentSalesMGroupNodeId;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByBAgentSalesMAgentSalesNo;

    @Id
    @Column(name = "b_agent_sales_m_agent_sales_no", nullable = false, length = 16)
    public String getbAgentSalesMAgentSalesNo() {
        return bAgentSalesMAgentSalesNo;
    }

    public void setbAgentSalesMAgentSalesNo(String bAgentSalesMAgentSalesNo) {
        this.bAgentSalesMAgentSalesNo = bAgentSalesMAgentSalesNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_notification_no", nullable = true, length = 50)
    public String getbAgentSalesMNotificationNo() {
        return bAgentSalesMNotificationNo;
    }

    public void setbAgentSalesMNotificationNo(String bAgentSalesMNotificationNo) {
        this.bAgentSalesMNotificationNo = bAgentSalesMNotificationNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_entrust_client_no", nullable = false, length = 20)
    public String getbAgentSalesMEntrustClientNo() {
        return bAgentSalesMEntrustClientNo;
    }

    public void setbAgentSalesMEntrustClientNo(String bAgentSalesMEntrustClientNo) {
        this.bAgentSalesMEntrustClientNo = bAgentSalesMEntrustClientNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_entrust_client_name", nullable = true, length = 200)
    public String getbAgentSalesMEntrustClientName() {
        return bAgentSalesMEntrustClientName;
    }

    public void setbAgentSalesMEntrustClientName(String bAgentSalesMEntrustClientName) {
        this.bAgentSalesMEntrustClientName = bAgentSalesMEntrustClientName;
    }

    @Basic
    @Column(name = "b_agent_sales_m_entrust_date", nullable = true)
    public Timestamp getbAgentSalesMEntrustDate() {
        return bAgentSalesMEntrustDate;
    }

    public void setbAgentSalesMEntrustDate(Timestamp bAgentSalesMEntrustDate) {
        this.bAgentSalesMEntrustDate = bAgentSalesMEntrustDate;
    }

    @Basic
    @Column(name = "b_agent_sales_m_entrust_linkman", nullable = true, length = 50)
    public String getbAgentSalesMEntrustLinkman() {
        return bAgentSalesMEntrustLinkman;
    }

    public void setbAgentSalesMEntrustLinkman(String bAgentSalesMEntrustLinkman) {
        this.bAgentSalesMEntrustLinkman = bAgentSalesMEntrustLinkman;
    }

    @Basic
    @Column(name = "b_agent_sales_m_entrust_tel", nullable = true, length = 30)
    public String getbAgentSalesMEntrustTel() {
        return bAgentSalesMEntrustTel;
    }

    public void setbAgentSalesMEntrustTel(String bAgentSalesMEntrustTel) {
        this.bAgentSalesMEntrustTel = bAgentSalesMEntrustTel;
    }

    @Basic
    @Column(name = "b_agent_sales_m_client_no", nullable = false, length = 20)
    public String getbAgentSalesMClientNo() {
        return bAgentSalesMClientNo;
    }

    public void setbAgentSalesMClientNo(String bAgentSalesMClientNo) {
        this.bAgentSalesMClientNo = bAgentSalesMClientNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_handbill_no", nullable = true, length = 20)
    public String getbAgentSalesMHandbillNo() {
        return bAgentSalesMHandbillNo;
    }

    public void setbAgentSalesMHandbillNo(String bAgentSalesMHandbillNo) {
        this.bAgentSalesMHandbillNo = bAgentSalesMHandbillNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_ord_date", nullable = true)
    public Timestamp getbAgentSalesMOrdDate() {
        return bAgentSalesMOrdDate;
    }

    public void setbAgentSalesMOrdDate(Timestamp bAgentSalesMOrdDate) {
        this.bAgentSalesMOrdDate = bAgentSalesMOrdDate;
    }

    @Basic
    @Column(name = "b_agent_sales_m_order_no", nullable = true, length = 20)
    public String getbAgentSalesMOrderNo() {
        return bAgentSalesMOrderNo;
    }

    public void setbAgentSalesMOrderNo(String bAgentSalesMOrderNo) {
        this.bAgentSalesMOrderNo = bAgentSalesMOrderNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_sales_discount", nullable = true, precision = 4)
    public BigDecimal getbAgentSalesMSalesDiscount() {
        return bAgentSalesMSalesDiscount;
    }

    public void setbAgentSalesMSalesDiscount(BigDecimal bAgentSalesMSalesDiscount) {
        this.bAgentSalesMSalesDiscount = bAgentSalesMSalesDiscount;
    }

    @Basic
    @Column(name = "b_agent_sales_m_sum_money", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesMSumMoney() {
        return bAgentSalesMSumMoney;
    }

    public void setbAgentSalesMSumMoney(BigDecimal bAgentSalesMSumMoney) {
        this.bAgentSalesMSumMoney = bAgentSalesMSumMoney;
    }

    @Basic
    @Column(name = "b_agent_sales_m_salesman", nullable = true, length = 8)
    public String getbAgentSalesMSalesman() {
        return bAgentSalesMSalesman;
    }

    public void setbAgentSalesMSalesman(String bAgentSalesMSalesman) {
        this.bAgentSalesMSalesman = bAgentSalesMSalesman;
    }

    @Basic
    @Column(name = "b_agent_sales_m_state", nullable = true, length = 1)
    public String getbAgentSalesMState() {
        return bAgentSalesMState;
    }

    public void setbAgentSalesMState(String bAgentSalesMState) {
        this.bAgentSalesMState = bAgentSalesMState;
    }

    @Basic
    @Column(name = "b_agent_sales_m_creater_no", nullable = true, length = 8)
    public String getbAgentSalesMCreaterNo() {
        return bAgentSalesMCreaterNo;
    }

    public void setbAgentSalesMCreaterNo(String bAgentSalesMCreaterNo) {
        this.bAgentSalesMCreaterNo = bAgentSalesMCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_create_date", nullable = true)
    public Timestamp getbAgentSalesMCreateDate() {
        return bAgentSalesMCreateDate;
    }

    public void setbAgentSalesMCreateDate(Timestamp bAgentSalesMCreateDate) {
        this.bAgentSalesMCreateDate = bAgentSalesMCreateDate;
    }

    @Basic
    @Column(name = "b_agent_sales_m_modifi_no", nullable = true, length = 8)
    public String getbAgentSalesMModifiNo() {
        return bAgentSalesMModifiNo;
    }

    public void setbAgentSalesMModifiNo(String bAgentSalesMModifiNo) {
        this.bAgentSalesMModifiNo = bAgentSalesMModifiNo;
    }

    @Basic
    @Column(name = "b_agent_sales_m_modifi_time", nullable = true)
    public Timestamp getbAgentSalesMModifiTime() {
        return bAgentSalesMModifiTime;
    }

    public void setbAgentSalesMModifiTime(Timestamp bAgentSalesMModifiTime) {
        this.bAgentSalesMModifiTime = bAgentSalesMModifiTime;
    }

    @Basic
    @Column(name = "b_agent_sales_m_checker", nullable = true, length = 8)
    public String getbAgentSalesMChecker() {
        return bAgentSalesMChecker;
    }

    public void setbAgentSalesMChecker(String bAgentSalesMChecker) {
        this.bAgentSalesMChecker = bAgentSalesMChecker;
    }

    @Basic
    @Column(name = "b_agent_sales_m_check_date", nullable = true)
    public Timestamp getbAgentSalesMCheckDate() {
        return bAgentSalesMCheckDate;
    }

    public void setbAgentSalesMCheckDate(Timestamp bAgentSalesMCheckDate) {
        this.bAgentSalesMCheckDate = bAgentSalesMCheckDate;
    }

    @Basic
    @Column(name = "b_agent_sales_m_group_node_id", nullable = false, length = 20)
    public String getbAgentSalesMGroupNodeId() {
        return bAgentSalesMGroupNodeId;
    }

    public void setbAgentSalesMGroupNodeId(String bAgentSalesMGroupNodeId) {
        this.bAgentSalesMGroupNodeId = bAgentSalesMGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_sales_m_notes", nullable = true, length = 200)
    public String getbAgentSalesMNotes() {
        return bAgentSalesMNotes;
    }

    public void setbAgentSalesMNotes(String bAgentSalesMNotes) {
        this.bAgentSalesMNotes = bAgentSalesMNotes;
    }

    @Basic
    @Column(name = "b_agent_sales_m_prints", nullable = true)
    public Integer getbAgentSalesMPrints() {
        return bAgentSalesMPrints;
    }

    public void setbAgentSalesMPrints(Integer bAgentSalesMPrints) {
        this.bAgentSalesMPrints = bAgentSalesMPrints;
    }

    @Basic
    @Column(name = "b_agent_sales_m_occurrence_date", nullable = true)
    public Timestamp getbAgentSalesMOccurrenceDate() {
        return bAgentSalesMOccurrenceDate;
    }

    public void setbAgentSalesMOccurrenceDate(Timestamp bAgentSalesMOccurrenceDate) {
        this.bAgentSalesMOccurrenceDate = bAgentSalesMOccurrenceDate;
    }

    @Basic
    @Column(name = "b_agent_sales_m_isPass", nullable = true, length = 1)
    public String getbAgentSalesMIsPass() {
        return bAgentSalesMIsPass;
    }

    public void setbAgentSalesMIsPass(String bAgentSalesMIsPass) {
        this.bAgentSalesMIsPass = bAgentSalesMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentSalesMEntity that = (BAgentSalesMEntity) o;

        if (bAgentSalesMAgentSalesNo != null ? !bAgentSalesMAgentSalesNo.equals(that.bAgentSalesMAgentSalesNo) : that.bAgentSalesMAgentSalesNo != null)
            return false;
        if (bAgentSalesMNotificationNo != null ? !bAgentSalesMNotificationNo.equals(that.bAgentSalesMNotificationNo) : that.bAgentSalesMNotificationNo != null)
            return false;
        if (bAgentSalesMEntrustClientNo != null ? !bAgentSalesMEntrustClientNo.equals(that.bAgentSalesMEntrustClientNo) : that.bAgentSalesMEntrustClientNo != null)
            return false;
        if (bAgentSalesMEntrustClientName != null ? !bAgentSalesMEntrustClientName.equals(that.bAgentSalesMEntrustClientName) : that.bAgentSalesMEntrustClientName != null)
            return false;
        if (bAgentSalesMEntrustDate != null ? !bAgentSalesMEntrustDate.equals(that.bAgentSalesMEntrustDate) : that.bAgentSalesMEntrustDate != null)
            return false;
        if (bAgentSalesMEntrustLinkman != null ? !bAgentSalesMEntrustLinkman.equals(that.bAgentSalesMEntrustLinkman) : that.bAgentSalesMEntrustLinkman != null)
            return false;
        if (bAgentSalesMEntrustTel != null ? !bAgentSalesMEntrustTel.equals(that.bAgentSalesMEntrustTel) : that.bAgentSalesMEntrustTel != null)
            return false;
        if (bAgentSalesMClientNo != null ? !bAgentSalesMClientNo.equals(that.bAgentSalesMClientNo) : that.bAgentSalesMClientNo != null)
            return false;
        if (bAgentSalesMHandbillNo != null ? !bAgentSalesMHandbillNo.equals(that.bAgentSalesMHandbillNo) : that.bAgentSalesMHandbillNo != null)
            return false;
        if (bAgentSalesMOrdDate != null ? !bAgentSalesMOrdDate.equals(that.bAgentSalesMOrdDate) : that.bAgentSalesMOrdDate != null)
            return false;
        if (bAgentSalesMOrderNo != null ? !bAgentSalesMOrderNo.equals(that.bAgentSalesMOrderNo) : that.bAgentSalesMOrderNo != null)
            return false;
        if (bAgentSalesMSalesDiscount != null ? !bAgentSalesMSalesDiscount.equals(that.bAgentSalesMSalesDiscount) : that.bAgentSalesMSalesDiscount != null)
            return false;
        if (bAgentSalesMSumMoney != null ? !bAgentSalesMSumMoney.equals(that.bAgentSalesMSumMoney) : that.bAgentSalesMSumMoney != null)
            return false;
        if (bAgentSalesMSalesman != null ? !bAgentSalesMSalesman.equals(that.bAgentSalesMSalesman) : that.bAgentSalesMSalesman != null)
            return false;
        if (bAgentSalesMState != null ? !bAgentSalesMState.equals(that.bAgentSalesMState) : that.bAgentSalesMState != null)
            return false;
        if (bAgentSalesMCreaterNo != null ? !bAgentSalesMCreaterNo.equals(that.bAgentSalesMCreaterNo) : that.bAgentSalesMCreaterNo != null)
            return false;
        if (bAgentSalesMCreateDate != null ? !bAgentSalesMCreateDate.equals(that.bAgentSalesMCreateDate) : that.bAgentSalesMCreateDate != null)
            return false;
        if (bAgentSalesMModifiNo != null ? !bAgentSalesMModifiNo.equals(that.bAgentSalesMModifiNo) : that.bAgentSalesMModifiNo != null)
            return false;
        if (bAgentSalesMModifiTime != null ? !bAgentSalesMModifiTime.equals(that.bAgentSalesMModifiTime) : that.bAgentSalesMModifiTime != null)
            return false;
        if (bAgentSalesMChecker != null ? !bAgentSalesMChecker.equals(that.bAgentSalesMChecker) : that.bAgentSalesMChecker != null)
            return false;
        if (bAgentSalesMCheckDate != null ? !bAgentSalesMCheckDate.equals(that.bAgentSalesMCheckDate) : that.bAgentSalesMCheckDate != null)
            return false;
        if (bAgentSalesMGroupNodeId != null ? !bAgentSalesMGroupNodeId.equals(that.bAgentSalesMGroupNodeId) : that.bAgentSalesMGroupNodeId != null)
            return false;
        if (bAgentSalesMNotes != null ? !bAgentSalesMNotes.equals(that.bAgentSalesMNotes) : that.bAgentSalesMNotes != null)
            return false;
        if (bAgentSalesMPrints != null ? !bAgentSalesMPrints.equals(that.bAgentSalesMPrints) : that.bAgentSalesMPrints != null)
            return false;
        if (bAgentSalesMOccurrenceDate != null ? !bAgentSalesMOccurrenceDate.equals(that.bAgentSalesMOccurrenceDate) : that.bAgentSalesMOccurrenceDate != null)
            return false;
        if (bAgentSalesMIsPass != null ? !bAgentSalesMIsPass.equals(that.bAgentSalesMIsPass) : that.bAgentSalesMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentSalesMAgentSalesNo != null ? bAgentSalesMAgentSalesNo.hashCode() : 0;
        result = 31 * result + (bAgentSalesMNotificationNo != null ? bAgentSalesMNotificationNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMEntrustClientNo != null ? bAgentSalesMEntrustClientNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMEntrustClientName != null ? bAgentSalesMEntrustClientName.hashCode() : 0);
        result = 31 * result + (bAgentSalesMEntrustDate != null ? bAgentSalesMEntrustDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesMEntrustLinkman != null ? bAgentSalesMEntrustLinkman.hashCode() : 0);
        result = 31 * result + (bAgentSalesMEntrustTel != null ? bAgentSalesMEntrustTel.hashCode() : 0);
        result = 31 * result + (bAgentSalesMClientNo != null ? bAgentSalesMClientNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMHandbillNo != null ? bAgentSalesMHandbillNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMOrdDate != null ? bAgentSalesMOrdDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesMOrderNo != null ? bAgentSalesMOrderNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMSalesDiscount != null ? bAgentSalesMSalesDiscount.hashCode() : 0);
        result = 31 * result + (bAgentSalesMSumMoney != null ? bAgentSalesMSumMoney.hashCode() : 0);
        result = 31 * result + (bAgentSalesMSalesman != null ? bAgentSalesMSalesman.hashCode() : 0);
        result = 31 * result + (bAgentSalesMState != null ? bAgentSalesMState.hashCode() : 0);
        result = 31 * result + (bAgentSalesMCreaterNo != null ? bAgentSalesMCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMCreateDate != null ? bAgentSalesMCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesMModifiNo != null ? bAgentSalesMModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesMModifiTime != null ? bAgentSalesMModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentSalesMChecker != null ? bAgentSalesMChecker.hashCode() : 0);
        result = 31 * result + (bAgentSalesMCheckDate != null ? bAgentSalesMCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesMGroupNodeId != null ? bAgentSalesMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentSalesMNotes != null ? bAgentSalesMNotes.hashCode() : 0);
        result = 31 * result + (bAgentSalesMPrints != null ? bAgentSalesMPrints.hashCode() : 0);
        result = 31 * result + (bAgentSalesMOccurrenceDate != null ? bAgentSalesMOccurrenceDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesMIsPass != null ? bAgentSalesMIsPass.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "bAgentSalesMByBAgentRsalesMAgentRsalesNo")
    public BAgentRsalesMEntity getbAgentRsalesMByBAgentSalesMAgentSalesNo() {
        return bAgentRsalesMByBAgentSalesMAgentSalesNo;
    }

    public void setbAgentRsalesMByBAgentSalesMAgentSalesNo(BAgentRsalesMEntity bAgentRsalesMByBAgentSalesMAgentSalesNo) {
        this.bAgentRsalesMByBAgentSalesMAgentSalesNo = bAgentRsalesMByBAgentSalesMAgentSalesNo;
    }

    @OneToMany(mappedBy = "bAgentSalesMByBAgentRsalesSAgentRsalesNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByBAgentSalesMAgentSalesNo() {
        return bAgentRsalesSESByBAgentSalesMAgentSalesNo;
    }

    public void setbAgentRsalesSESByBAgentSalesMAgentSalesNo(Collection<BAgentRsalesSEntity> bAgentRsalesSESByBAgentSalesMAgentSalesNo) {
        this.bAgentRsalesSESByBAgentSalesMAgentSalesNo = bAgentRsalesSESByBAgentSalesMAgentSalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_client_no", referencedColumnName = "t_client_client_no", nullable = false)
    public TClientEntity gettClientByBAgentSalesMClientNo() {
        return tClientByBAgentSalesMClientNo;
    }

    public void settClientByBAgentSalesMClientNo(TClientEntity tClientByBAgentSalesMClientNo) {
        this.tClientByBAgentSalesMClientNo = tClientByBAgentSalesMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesMSalesman() {
        return tStaffByBAgentSalesMSalesman;
    }

    public void settStaffByBAgentSalesMSalesman(TStaffEntity tStaffByBAgentSalesMSalesman) {
        this.tStaffByBAgentSalesMSalesman = tStaffByBAgentSalesMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesMCreaterNo() {
        return tStaffByBAgentSalesMCreaterNo;
    }

    public void settStaffByBAgentSalesMCreaterNo(TStaffEntity tStaffByBAgentSalesMCreaterNo) {
        this.tStaffByBAgentSalesMCreaterNo = tStaffByBAgentSalesMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesMModifiNo() {
        return tStaffByBAgentSalesMModifiNo;
    }

    public void settStaffByBAgentSalesMModifiNo(TStaffEntity tStaffByBAgentSalesMModifiNo) {
        this.tStaffByBAgentSalesMModifiNo = tStaffByBAgentSalesMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesMChecker() {
        return tStaffByBAgentSalesMChecker;
    }

    public void settStaffByBAgentSalesMChecker(TStaffEntity tStaffByBAgentSalesMChecker) {
        this.tStaffByBAgentSalesMChecker = tStaffByBAgentSalesMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBAgentSalesMGroupNodeId() {
        return tOrgByBAgentSalesMGroupNodeId;
    }

    public void settOrgByBAgentSalesMGroupNodeId(TOrgEntity tOrgByBAgentSalesMGroupNodeId) {
        this.tOrgByBAgentSalesMGroupNodeId = tOrgByBAgentSalesMGroupNodeId;
    }

    @OneToMany(mappedBy = "bAgentSalesMByBAgentSalesSAgentSalesNo")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByBAgentSalesMAgentSalesNo() {
        return bAgentSalesSESByBAgentSalesMAgentSalesNo;
    }

    public void setbAgentSalesSESByBAgentSalesMAgentSalesNo(Collection<BAgentSalesSEntity> bAgentSalesSESByBAgentSalesMAgentSalesNo) {
        this.bAgentSalesSESByBAgentSalesMAgentSalesNo = bAgentSalesSESByBAgentSalesMAgentSalesNo;
    }
}
