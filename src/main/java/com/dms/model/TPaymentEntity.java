package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_payment", schema = "dbo", catalog = "logistics_test")
public class TPaymentEntity {
    private String tPaymentPaymentNo;
    private String tPaymentPaymentName;
    private String tPaymentBriefCode;
    private String tPaymentPaymentSymbol;
    private long tPaymentPaymentDays;
    private String tPaymentRemark;
    private String tPaymentCreateNo;
    private Timestamp tPaymentCreateDate;
    private String tPaymentModifiNo;
    private Timestamp tPaymentModifiTime;
    private String tPaymentFlag;
    private String tPaymentGroupNodeId;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByTPaymentPaymentNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTPaymentPaymentNo;
    private Collection<BSConSEntity> bSConSByTPaymentPaymentNo;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTPaymentPaymentNo;
    private Collection<SOutLoanMEntity> sOutLoanMSByTPaymentPaymentNo;
    private TStaffEntity tStaffByTPaymentCreateNo;
    private TStaffEntity tStaffByTPaymentModifiNo;
    private TOrgEntity tOrgByTPaymentGroupNodeId;

    @Id
    @Column(name = "t_payment_payment_no", nullable = false, length = 4)
    public String gettPaymentPaymentNo() {
        return tPaymentPaymentNo;
    }

    public void settPaymentPaymentNo(String tPaymentPaymentNo) {
        this.tPaymentPaymentNo = tPaymentPaymentNo;
    }

    @Basic
    @Column(name = "t_payment_payment_name", nullable = false, length = 50)
    public String gettPaymentPaymentName() {
        return tPaymentPaymentName;
    }

    public void settPaymentPaymentName(String tPaymentPaymentName) {
        this.tPaymentPaymentName = tPaymentPaymentName;
    }

    @Basic
    @Column(name = "t_payment_brief_code", nullable = true, length = 50)
    public String gettPaymentBriefCode() {
        return tPaymentBriefCode;
    }

    public void settPaymentBriefCode(String tPaymentBriefCode) {
        this.tPaymentBriefCode = tPaymentBriefCode;
    }

    @Basic
    @Column(name = "t_payment_payment_symbol", nullable = true, length = 2)
    public String gettPaymentPaymentSymbol() {
        return tPaymentPaymentSymbol;
    }

    public void settPaymentPaymentSymbol(String tPaymentPaymentSymbol) {
        this.tPaymentPaymentSymbol = tPaymentPaymentSymbol;
    }

    @Basic
    @Column(name = "t_payment_payment_days", nullable = false)
    public long gettPaymentPaymentDays() {
        return tPaymentPaymentDays;
    }

    public void settPaymentPaymentDays(long tPaymentPaymentDays) {
        this.tPaymentPaymentDays = tPaymentPaymentDays;
    }

    @Basic
    @Column(name = "t_payment_remark", nullable = true, length = 100)
    public String gettPaymentRemark() {
        return tPaymentRemark;
    }

    public void settPaymentRemark(String tPaymentRemark) {
        this.tPaymentRemark = tPaymentRemark;
    }

    @Basic
    @Column(name = "t_payment_create_no", nullable = true, length = 8)
    public String gettPaymentCreateNo() {
        return tPaymentCreateNo;
    }

    public void settPaymentCreateNo(String tPaymentCreateNo) {
        this.tPaymentCreateNo = tPaymentCreateNo;
    }

    @Basic
    @Column(name = "t_payment_create_date", nullable = true)
    public Timestamp gettPaymentCreateDate() {
        return tPaymentCreateDate;
    }

    public void settPaymentCreateDate(Timestamp tPaymentCreateDate) {
        this.tPaymentCreateDate = tPaymentCreateDate;
    }

    @Basic
    @Column(name = "t_payment_modifi_no", nullable = true, length = 8)
    public String gettPaymentModifiNo() {
        return tPaymentModifiNo;
    }

    public void settPaymentModifiNo(String tPaymentModifiNo) {
        this.tPaymentModifiNo = tPaymentModifiNo;
    }

    @Basic
    @Column(name = "t_payment_modifi_time", nullable = true)
    public Timestamp gettPaymentModifiTime() {
        return tPaymentModifiTime;
    }

    public void settPaymentModifiTime(Timestamp tPaymentModifiTime) {
        this.tPaymentModifiTime = tPaymentModifiTime;
    }

    @Basic
    @Column(name = "t_payment_flag", nullable = false, length = 1)
    public String gettPaymentFlag() {
        return tPaymentFlag;
    }

    public void settPaymentFlag(String tPaymentFlag) {
        this.tPaymentFlag = tPaymentFlag;
    }

    @Basic
    @Column(name = "t_payment_group_node_id", nullable = true, length = 20)
    public String gettPaymentGroupNodeId() {
        return tPaymentGroupNodeId;
    }

    public void settPaymentGroupNodeId(String tPaymentGroupNodeId) {
        this.tPaymentGroupNodeId = tPaymentGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPaymentEntity that = (TPaymentEntity) o;

        if (tPaymentPaymentDays != that.tPaymentPaymentDays) return false;
        if (tPaymentPaymentNo != null ? !tPaymentPaymentNo.equals(that.tPaymentPaymentNo) : that.tPaymentPaymentNo != null)
            return false;
        if (tPaymentPaymentName != null ? !tPaymentPaymentName.equals(that.tPaymentPaymentName) : that.tPaymentPaymentName != null)
            return false;
        if (tPaymentBriefCode != null ? !tPaymentBriefCode.equals(that.tPaymentBriefCode) : that.tPaymentBriefCode != null)
            return false;
        if (tPaymentPaymentSymbol != null ? !tPaymentPaymentSymbol.equals(that.tPaymentPaymentSymbol) : that.tPaymentPaymentSymbol != null)
            return false;
        if (tPaymentRemark != null ? !tPaymentRemark.equals(that.tPaymentRemark) : that.tPaymentRemark != null)
            return false;
        if (tPaymentCreateNo != null ? !tPaymentCreateNo.equals(that.tPaymentCreateNo) : that.tPaymentCreateNo != null)
            return false;
        if (tPaymentCreateDate != null ? !tPaymentCreateDate.equals(that.tPaymentCreateDate) : that.tPaymentCreateDate != null)
            return false;
        if (tPaymentModifiNo != null ? !tPaymentModifiNo.equals(that.tPaymentModifiNo) : that.tPaymentModifiNo != null)
            return false;
        if (tPaymentModifiTime != null ? !tPaymentModifiTime.equals(that.tPaymentModifiTime) : that.tPaymentModifiTime != null)
            return false;
        if (tPaymentFlag != null ? !tPaymentFlag.equals(that.tPaymentFlag) : that.tPaymentFlag != null) return false;
        if (tPaymentGroupNodeId != null ? !tPaymentGroupNodeId.equals(that.tPaymentGroupNodeId) : that.tPaymentGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tPaymentPaymentNo != null ? tPaymentPaymentNo.hashCode() : 0;
        result = 31 * result + (tPaymentPaymentName != null ? tPaymentPaymentName.hashCode() : 0);
        result = 31 * result + (tPaymentBriefCode != null ? tPaymentBriefCode.hashCode() : 0);
        result = 31 * result + (tPaymentPaymentSymbol != null ? tPaymentPaymentSymbol.hashCode() : 0);
        result = 31 * result + (int) (tPaymentPaymentDays ^ (tPaymentPaymentDays >>> 32));
        result = 31 * result + (tPaymentRemark != null ? tPaymentRemark.hashCode() : 0);
        result = 31 * result + (tPaymentCreateNo != null ? tPaymentCreateNo.hashCode() : 0);
        result = 31 * result + (tPaymentCreateDate != null ? tPaymentCreateDate.hashCode() : 0);
        result = 31 * result + (tPaymentModifiNo != null ? tPaymentModifiNo.hashCode() : 0);
        result = 31 * result + (tPaymentModifiTime != null ? tPaymentModifiTime.hashCode() : 0);
        result = 31 * result + (tPaymentFlag != null ? tPaymentFlag.hashCode() : 0);
        result = 31 * result + (tPaymentGroupNodeId != null ? tPaymentGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tPaymentByBAgentRsalesSPaymentNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByTPaymentPaymentNo() {
        return bAgentRsalesSESByTPaymentPaymentNo;
    }

    public void setbAgentRsalesSESByTPaymentPaymentNo(Collection<BAgentRsalesSEntity> bAgentRsalesSESByTPaymentPaymentNo) {
        this.bAgentRsalesSESByTPaymentPaymentNo = bAgentRsalesSESByTPaymentPaymentNo;
    }

    @OneToMany(mappedBy = "tPaymentByBPurchaseOrdSPaymentNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTPaymentPaymentNo() {
        return bPurchaseOrdSByTPaymentPaymentNo;
    }

    public void setbPurchaseOrdSByTPaymentPaymentNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTPaymentPaymentNo) {
        this.bPurchaseOrdSByTPaymentPaymentNo = bPurchaseOrdSByTPaymentPaymentNo;
    }

    @OneToMany(mappedBy = "tPaymentByBSConSPaymentNo")
    public Collection<BSConSEntity> getbSConSByTPaymentPaymentNo() {
        return bSConSByTPaymentPaymentNo;
    }

    public void setbSConSByTPaymentPaymentNo(Collection<BSConSEntity> bSConSByTPaymentPaymentNo) {
        this.bSConSByTPaymentPaymentNo = bSConSByTPaymentPaymentNo;
    }

    @OneToMany(mappedBy = "tPaymentByCPurchaseConSPaymentNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTPaymentPaymentNo() {
        return cPurchaseConSByTPaymentPaymentNo;
    }

    public void setcPurchaseConSByTPaymentPaymentNo(Collection<CPurchaseConSEntity> cPurchaseConSByTPaymentPaymentNo) {
        this.cPurchaseConSByTPaymentPaymentNo = cPurchaseConSByTPaymentPaymentNo;
    }

    @OneToMany(mappedBy = "tPaymentBySOutLoanMPaymentNo")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTPaymentPaymentNo() {
        return sOutLoanMSByTPaymentPaymentNo;
    }

    public void setsOutLoanMSByTPaymentPaymentNo(Collection<SOutLoanMEntity> sOutLoanMSByTPaymentPaymentNo) {
        this.sOutLoanMSByTPaymentPaymentNo = sOutLoanMSByTPaymentPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_payment_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPaymentCreateNo() {
        return tStaffByTPaymentCreateNo;
    }

    public void settStaffByTPaymentCreateNo(TStaffEntity tStaffByTPaymentCreateNo) {
        this.tStaffByTPaymentCreateNo = tStaffByTPaymentCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_payment_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPaymentModifiNo() {
        return tStaffByTPaymentModifiNo;
    }

    public void settStaffByTPaymentModifiNo(TStaffEntity tStaffByTPaymentModifiNo) {
        this.tStaffByTPaymentModifiNo = tStaffByTPaymentModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_payment_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTPaymentGroupNodeId() {
        return tOrgByTPaymentGroupNodeId;
    }

    public void settOrgByTPaymentGroupNodeId(TOrgEntity tOrgByTPaymentGroupNodeId) {
        this.tOrgByTPaymentGroupNodeId = tOrgByTPaymentGroupNodeId;
    }
}
