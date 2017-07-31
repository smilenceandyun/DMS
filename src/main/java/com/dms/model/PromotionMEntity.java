package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "Promotion_m", schema = "dbo", catalog = "logistics")
public class PromotionMEntity {
    private String promotionMPromotionNo;
    private Timestamp promotionMStartDate;
    private Timestamp promotionMEndDate;
    private Timestamp promotionMCloseDate;
    private String promotionMEndReason;
    private String promotionMFactPromotionNo;
    private String promotionMPlanNo;
    private String promotionMUrl;
    private BigDecimal promotionMMoneyQuota;
    private String promotionMSalesman;
    private String promotionMCreateNo;
    private Timestamp promotionMCreateDate;
    private String promotionMModifiNo;
    private String promotionMChecker;
    private Timestamp promotionMModifiTime;
    private Timestamp promotionMCheckDate;
    private String promotionMState;
    private String promotionMNotes;
    private String promotionMGroupNodeId;
    private String promotionMIsPass;
    private Collection<PromotionClientGroupEntity> promotionClientGroupsByPromotionMPromotionNo;
    private TStaffEntity tStaffByPromotionMSalesman;
    private TStaffEntity tStaffByPromotionMCreateNo;
    private TStaffEntity tStaffByPromotionMModifiNo;
    private TStaffEntity tStaffByPromotionMChecker;
    private TOrgEntity tOrgByPromotionMGroupNodeId;
    private Collection<PromotionMProductSEntity> promotionMProductSByPromotionMPromotionNo;
    private PromotionPGroupEntity promotionPGroupByPromotionMPromotionNo;
    private Collection<BSOrderSEntity> bSOrderSByPromotionMPromotionNo;

    @Id
    @Column(name = "Promotion_m_Promotion_no", nullable = false, length = 16)
    public String getPromotionMPromotionNo() {
        return promotionMPromotionNo;
    }

    public void setPromotionMPromotionNo(String promotionMPromotionNo) {
        this.promotionMPromotionNo = promotionMPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_m_Start_date", nullable = false)
    public Timestamp getPromotionMStartDate() {
        return promotionMStartDate;
    }

    public void setPromotionMStartDate(Timestamp promotionMStartDate) {
        this.promotionMStartDate = promotionMStartDate;
    }

    @Basic
    @Column(name = "Promotion_m_End_date", nullable = false)
    public Timestamp getPromotionMEndDate() {
        return promotionMEndDate;
    }

    public void setPromotionMEndDate(Timestamp promotionMEndDate) {
        this.promotionMEndDate = promotionMEndDate;
    }

    @Basic
    @Column(name = "Promotion_m_Close_date", nullable = true)
    public Timestamp getPromotionMCloseDate() {
        return promotionMCloseDate;
    }

    public void setPromotionMCloseDate(Timestamp promotionMCloseDate) {
        this.promotionMCloseDate = promotionMCloseDate;
    }

    @Basic
    @Column(name = "Promotion_m_End_reason", nullable = true, length = 50)
    public String getPromotionMEndReason() {
        return promotionMEndReason;
    }

    public void setPromotionMEndReason(String promotionMEndReason) {
        this.promotionMEndReason = promotionMEndReason;
    }

    @Basic
    @Column(name = "Promotion_m_Fact_promotion_no", nullable = true, length = 30)
    public String getPromotionMFactPromotionNo() {
        return promotionMFactPromotionNo;
    }

    public void setPromotionMFactPromotionNo(String promotionMFactPromotionNo) {
        this.promotionMFactPromotionNo = promotionMFactPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_m_Plan_no", nullable = true, length = 30)
    public String getPromotionMPlanNo() {
        return promotionMPlanNo;
    }

    public void setPromotionMPlanNo(String promotionMPlanNo) {
        this.promotionMPlanNo = promotionMPlanNo;
    }

    @Basic
    @Column(name = "Promotion_m_URL", nullable = true, length = 200)
    public String getPromotionMUrl() {
        return promotionMUrl;
    }

    public void setPromotionMUrl(String promotionMUrl) {
        this.promotionMUrl = promotionMUrl;
    }

    @Basic
    @Column(name = "Promotion_m_Money_quota", nullable = true, precision = 4)
    public BigDecimal getPromotionMMoneyQuota() {
        return promotionMMoneyQuota;
    }

    public void setPromotionMMoneyQuota(BigDecimal promotionMMoneyQuota) {
        this.promotionMMoneyQuota = promotionMMoneyQuota;
    }

    @Basic
    @Column(name = "Promotion_m_salesman", nullable = true, length = 8)
    public String getPromotionMSalesman() {
        return promotionMSalesman;
    }

    public void setPromotionMSalesman(String promotionMSalesman) {
        this.promotionMSalesman = promotionMSalesman;
    }

    @Basic
    @Column(name = "Promotion_m_create_no", nullable = true, length = 8)
    public String getPromotionMCreateNo() {
        return promotionMCreateNo;
    }

    public void setPromotionMCreateNo(String promotionMCreateNo) {
        this.promotionMCreateNo = promotionMCreateNo;
    }

    @Basic
    @Column(name = "Promotion_m_create_date", nullable = true)
    public Timestamp getPromotionMCreateDate() {
        return promotionMCreateDate;
    }

    public void setPromotionMCreateDate(Timestamp promotionMCreateDate) {
        this.promotionMCreateDate = promotionMCreateDate;
    }

    @Basic
    @Column(name = "Promotion_m_modifi_no", nullable = true, length = 8)
    public String getPromotionMModifiNo() {
        return promotionMModifiNo;
    }

    public void setPromotionMModifiNo(String promotionMModifiNo) {
        this.promotionMModifiNo = promotionMModifiNo;
    }

    @Basic
    @Column(name = "Promotion_m_checker", nullable = true, length = 8)
    public String getPromotionMChecker() {
        return promotionMChecker;
    }

    public void setPromotionMChecker(String promotionMChecker) {
        this.promotionMChecker = promotionMChecker;
    }

    @Basic
    @Column(name = "Promotion_m_modifi_time", nullable = true)
    public Timestamp getPromotionMModifiTime() {
        return promotionMModifiTime;
    }

    public void setPromotionMModifiTime(Timestamp promotionMModifiTime) {
        this.promotionMModifiTime = promotionMModifiTime;
    }

    @Basic
    @Column(name = "Promotion_m_check_date", nullable = true)
    public Timestamp getPromotionMCheckDate() {
        return promotionMCheckDate;
    }

    public void setPromotionMCheckDate(Timestamp promotionMCheckDate) {
        this.promotionMCheckDate = promotionMCheckDate;
    }

    @Basic
    @Column(name = "Promotion_m_state", nullable = true, length = -1)
    public String getPromotionMState() {
        return promotionMState;
    }

    public void setPromotionMState(String promotionMState) {
        this.promotionMState = promotionMState;
    }

    @Basic
    @Column(name = "Promotion_m_notes", nullable = true, length = 200)
    public String getPromotionMNotes() {
        return promotionMNotes;
    }

    public void setPromotionMNotes(String promotionMNotes) {
        this.promotionMNotes = promotionMNotes;
    }

    @Basic
    @Column(name = "Promotion_m_group_node_id", nullable = true, length = 20)
    public String getPromotionMGroupNodeId() {
        return promotionMGroupNodeId;
    }

    public void setPromotionMGroupNodeId(String promotionMGroupNodeId) {
        this.promotionMGroupNodeId = promotionMGroupNodeId;
    }

    @Basic
    @Column(name = "Promotion_m_isPass", nullable = true, length = -1)
    public String getPromotionMIsPass() {
        return promotionMIsPass;
    }

    public void setPromotionMIsPass(String promotionMIsPass) {
        this.promotionMIsPass = promotionMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionMEntity that = (PromotionMEntity) o;

        if (promotionMPromotionNo != null ? !promotionMPromotionNo.equals(that.promotionMPromotionNo) : that.promotionMPromotionNo != null)
            return false;
        if (promotionMStartDate != null ? !promotionMStartDate.equals(that.promotionMStartDate) : that.promotionMStartDate != null)
            return false;
        if (promotionMEndDate != null ? !promotionMEndDate.equals(that.promotionMEndDate) : that.promotionMEndDate != null)
            return false;
        if (promotionMCloseDate != null ? !promotionMCloseDate.equals(that.promotionMCloseDate) : that.promotionMCloseDate != null)
            return false;
        if (promotionMEndReason != null ? !promotionMEndReason.equals(that.promotionMEndReason) : that.promotionMEndReason != null)
            return false;
        if (promotionMFactPromotionNo != null ? !promotionMFactPromotionNo.equals(that.promotionMFactPromotionNo) : that.promotionMFactPromotionNo != null)
            return false;
        if (promotionMPlanNo != null ? !promotionMPlanNo.equals(that.promotionMPlanNo) : that.promotionMPlanNo != null)
            return false;
        if (promotionMUrl != null ? !promotionMUrl.equals(that.promotionMUrl) : that.promotionMUrl != null)
            return false;
        if (promotionMMoneyQuota != null ? !promotionMMoneyQuota.equals(that.promotionMMoneyQuota) : that.promotionMMoneyQuota != null)
            return false;
        if (promotionMSalesman != null ? !promotionMSalesman.equals(that.promotionMSalesman) : that.promotionMSalesman != null)
            return false;
        if (promotionMCreateNo != null ? !promotionMCreateNo.equals(that.promotionMCreateNo) : that.promotionMCreateNo != null)
            return false;
        if (promotionMCreateDate != null ? !promotionMCreateDate.equals(that.promotionMCreateDate) : that.promotionMCreateDate != null)
            return false;
        if (promotionMModifiNo != null ? !promotionMModifiNo.equals(that.promotionMModifiNo) : that.promotionMModifiNo != null)
            return false;
        if (promotionMChecker != null ? !promotionMChecker.equals(that.promotionMChecker) : that.promotionMChecker != null)
            return false;
        if (promotionMModifiTime != null ? !promotionMModifiTime.equals(that.promotionMModifiTime) : that.promotionMModifiTime != null)
            return false;
        if (promotionMCheckDate != null ? !promotionMCheckDate.equals(that.promotionMCheckDate) : that.promotionMCheckDate != null)
            return false;
        if (promotionMState != null ? !promotionMState.equals(that.promotionMState) : that.promotionMState != null)
            return false;
        if (promotionMNotes != null ? !promotionMNotes.equals(that.promotionMNotes) : that.promotionMNotes != null)
            return false;
        if (promotionMGroupNodeId != null ? !promotionMGroupNodeId.equals(that.promotionMGroupNodeId) : that.promotionMGroupNodeId != null)
            return false;
        if (promotionMIsPass != null ? !promotionMIsPass.equals(that.promotionMIsPass) : that.promotionMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMPromotionNo != null ? promotionMPromotionNo.hashCode() : 0;
        result = 31 * result + (promotionMStartDate != null ? promotionMStartDate.hashCode() : 0);
        result = 31 * result + (promotionMEndDate != null ? promotionMEndDate.hashCode() : 0);
        result = 31 * result + (promotionMCloseDate != null ? promotionMCloseDate.hashCode() : 0);
        result = 31 * result + (promotionMEndReason != null ? promotionMEndReason.hashCode() : 0);
        result = 31 * result + (promotionMFactPromotionNo != null ? promotionMFactPromotionNo.hashCode() : 0);
        result = 31 * result + (promotionMPlanNo != null ? promotionMPlanNo.hashCode() : 0);
        result = 31 * result + (promotionMUrl != null ? promotionMUrl.hashCode() : 0);
        result = 31 * result + (promotionMMoneyQuota != null ? promotionMMoneyQuota.hashCode() : 0);
        result = 31 * result + (promotionMSalesman != null ? promotionMSalesman.hashCode() : 0);
        result = 31 * result + (promotionMCreateNo != null ? promotionMCreateNo.hashCode() : 0);
        result = 31 * result + (promotionMCreateDate != null ? promotionMCreateDate.hashCode() : 0);
        result = 31 * result + (promotionMModifiNo != null ? promotionMModifiNo.hashCode() : 0);
        result = 31 * result + (promotionMChecker != null ? promotionMChecker.hashCode() : 0);
        result = 31 * result + (promotionMModifiTime != null ? promotionMModifiTime.hashCode() : 0);
        result = 31 * result + (promotionMCheckDate != null ? promotionMCheckDate.hashCode() : 0);
        result = 31 * result + (promotionMState != null ? promotionMState.hashCode() : 0);
        result = 31 * result + (promotionMNotes != null ? promotionMNotes.hashCode() : 0);
        result = 31 * result + (promotionMGroupNodeId != null ? promotionMGroupNodeId.hashCode() : 0);
        result = 31 * result + (promotionMIsPass != null ? promotionMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "promotionMByPromotionClientGroupPromotionNo")
    public Collection<PromotionClientGroupEntity> getPromotionClientGroupsByPromotionMPromotionNo() {
        return promotionClientGroupsByPromotionMPromotionNo;
    }

    public void setPromotionClientGroupsByPromotionMPromotionNo(Collection<PromotionClientGroupEntity> promotionClientGroupsByPromotionMPromotionNo) {
        this.promotionClientGroupsByPromotionMPromotionNo = promotionClientGroupsByPromotionMPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_salesman", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMSalesman() {
        return tStaffByPromotionMSalesman;
    }

    public void settStaffByPromotionMSalesman(TStaffEntity tStaffByPromotionMSalesman) {
        this.tStaffByPromotionMSalesman = tStaffByPromotionMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMCreateNo() {
        return tStaffByPromotionMCreateNo;
    }

    public void settStaffByPromotionMCreateNo(TStaffEntity tStaffByPromotionMCreateNo) {
        this.tStaffByPromotionMCreateNo = tStaffByPromotionMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMModifiNo() {
        return tStaffByPromotionMModifiNo;
    }

    public void settStaffByPromotionMModifiNo(TStaffEntity tStaffByPromotionMModifiNo) {
        this.tStaffByPromotionMModifiNo = tStaffByPromotionMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMChecker() {
        return tStaffByPromotionMChecker;
    }

    public void settStaffByPromotionMChecker(TStaffEntity tStaffByPromotionMChecker) {
        this.tStaffByPromotionMChecker = tStaffByPromotionMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByPromotionMGroupNodeId() {
        return tOrgByPromotionMGroupNodeId;
    }

    public void settOrgByPromotionMGroupNodeId(TOrgEntity tOrgByPromotionMGroupNodeId) {
        this.tOrgByPromotionMGroupNodeId = tOrgByPromotionMGroupNodeId;
    }

    @OneToMany(mappedBy = "promotionMByPromotionMProductSPromotionNo")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByPromotionMPromotionNo() {
        return promotionMProductSByPromotionMPromotionNo;
    }

    public void setPromotionMProductSByPromotionMPromotionNo(Collection<PromotionMProductSEntity> promotionMProductSByPromotionMPromotionNo) {
        this.promotionMProductSByPromotionMPromotionNo = promotionMProductSByPromotionMPromotionNo;
    }

    @OneToOne(mappedBy = "promotionMByPromotionPGroupPromotionNo")
    public PromotionPGroupEntity getPromotionPGroupByPromotionMPromotionNo() {
        return promotionPGroupByPromotionMPromotionNo;
    }

    public void setPromotionPGroupByPromotionMPromotionNo(PromotionPGroupEntity promotionPGroupByPromotionMPromotionNo) {
        this.promotionPGroupByPromotionMPromotionNo = promotionPGroupByPromotionMPromotionNo;
    }

    @OneToMany(mappedBy = "promotionMByBSOrderSPromotionNo")
    public Collection<BSOrderSEntity> getbSOrderSByPromotionMPromotionNo() {
        return bSOrderSByPromotionMPromotionNo;
    }

    public void setbSOrderSByPromotionMPromotionNo(Collection<BSOrderSEntity> bSOrderSByPromotionMPromotionNo) {
        this.bSOrderSByPromotionMPromotionNo = bSOrderSByPromotionMPromotionNo;
    }
}
