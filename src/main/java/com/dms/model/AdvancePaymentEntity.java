package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "advance_payment", schema = "dbo", catalog = "logistics_test")
public class AdvancePaymentEntity {
    private String advancePaymentAdvancePaymentNo;
    private String advancePaymentTSStaffNo;
    private String advancePaymentAdvancePaymentDescribe;
    private String advancePaymentRemark;
    private String advancePaymentGroupNodeId;
    private String advancePaymentCreaterNo;
    private Timestamp advancePaymentCreateDate;
    private String advancePaymentModifiNo;
    private Timestamp advancePaymentModifiTime;
    private String advancePaymentFlag;
    private TStaffEntity tStaffByAdvancePaymentTSStaffNo;
    private TOrgEntity tOrgByAdvancePaymentGroupNodeId;
    private TStaffEntity tStaffByAdvancePaymentModifiNo;

    @Id
    @Column(name = "advance_payment_advance_payment_no", nullable = false, length = 4)
    public String getAdvancePaymentAdvancePaymentNo() {
        return advancePaymentAdvancePaymentNo;
    }

    public void setAdvancePaymentAdvancePaymentNo(String advancePaymentAdvancePaymentNo) {
        this.advancePaymentAdvancePaymentNo = advancePaymentAdvancePaymentNo;
    }

    @Basic
    @Column(name = "advance_payment_t_s_staff_no", nullable = true, length = 8)
    public String getAdvancePaymentTSStaffNo() {
        return advancePaymentTSStaffNo;
    }

    public void setAdvancePaymentTSStaffNo(String advancePaymentTSStaffNo) {
        this.advancePaymentTSStaffNo = advancePaymentTSStaffNo;
    }

    @Basic
    @Column(name = "advance_payment_advance_payment_describe", nullable = false, length = 50)
    public String getAdvancePaymentAdvancePaymentDescribe() {
        return advancePaymentAdvancePaymentDescribe;
    }

    public void setAdvancePaymentAdvancePaymentDescribe(String advancePaymentAdvancePaymentDescribe) {
        this.advancePaymentAdvancePaymentDescribe = advancePaymentAdvancePaymentDescribe;
    }

    @Basic
    @Column(name = "advance_payment_remark", nullable = true, length = 100)
    public String getAdvancePaymentRemark() {
        return advancePaymentRemark;
    }

    public void setAdvancePaymentRemark(String advancePaymentRemark) {
        this.advancePaymentRemark = advancePaymentRemark;
    }

    @Basic
    @Column(name = "advance_payment_group_node_id", nullable = true, length = 20)
    public String getAdvancePaymentGroupNodeId() {
        return advancePaymentGroupNodeId;
    }

    public void setAdvancePaymentGroupNodeId(String advancePaymentGroupNodeId) {
        this.advancePaymentGroupNodeId = advancePaymentGroupNodeId;
    }

    @Basic
    @Column(name = "advance_payment_creater_no", nullable = true, length = 8)
    public String getAdvancePaymentCreaterNo() {
        return advancePaymentCreaterNo;
    }

    public void setAdvancePaymentCreaterNo(String advancePaymentCreaterNo) {
        this.advancePaymentCreaterNo = advancePaymentCreaterNo;
    }

    @Basic
    @Column(name = "advance_payment_create_date", nullable = true)
    public Timestamp getAdvancePaymentCreateDate() {
        return advancePaymentCreateDate;
    }

    public void setAdvancePaymentCreateDate(Timestamp advancePaymentCreateDate) {
        this.advancePaymentCreateDate = advancePaymentCreateDate;
    }

    @Basic
    @Column(name = "advance_payment_modifi_no", nullable = true, length = 8)
    public String getAdvancePaymentModifiNo() {
        return advancePaymentModifiNo;
    }

    public void setAdvancePaymentModifiNo(String advancePaymentModifiNo) {
        this.advancePaymentModifiNo = advancePaymentModifiNo;
    }

    @Basic
    @Column(name = "advance_payment_modifi_time", nullable = true)
    public Timestamp getAdvancePaymentModifiTime() {
        return advancePaymentModifiTime;
    }

    public void setAdvancePaymentModifiTime(Timestamp advancePaymentModifiTime) {
        this.advancePaymentModifiTime = advancePaymentModifiTime;
    }

    @Basic
    @Column(name = "advance_payment_flag", nullable = false, length = 1)
    public String getAdvancePaymentFlag() {
        return advancePaymentFlag;
    }

    public void setAdvancePaymentFlag(String advancePaymentFlag) {
        this.advancePaymentFlag = advancePaymentFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvancePaymentEntity that = (AdvancePaymentEntity) o;

        if (advancePaymentAdvancePaymentNo != null ? !advancePaymentAdvancePaymentNo.equals(that.advancePaymentAdvancePaymentNo) : that.advancePaymentAdvancePaymentNo != null)
            return false;
        if (advancePaymentTSStaffNo != null ? !advancePaymentTSStaffNo.equals(that.advancePaymentTSStaffNo) : that.advancePaymentTSStaffNo != null)
            return false;
        if (advancePaymentAdvancePaymentDescribe != null ? !advancePaymentAdvancePaymentDescribe.equals(that.advancePaymentAdvancePaymentDescribe) : that.advancePaymentAdvancePaymentDescribe != null)
            return false;
        if (advancePaymentRemark != null ? !advancePaymentRemark.equals(that.advancePaymentRemark) : that.advancePaymentRemark != null)
            return false;
        if (advancePaymentGroupNodeId != null ? !advancePaymentGroupNodeId.equals(that.advancePaymentGroupNodeId) : that.advancePaymentGroupNodeId != null)
            return false;
        if (advancePaymentCreaterNo != null ? !advancePaymentCreaterNo.equals(that.advancePaymentCreaterNo) : that.advancePaymentCreaterNo != null)
            return false;
        if (advancePaymentCreateDate != null ? !advancePaymentCreateDate.equals(that.advancePaymentCreateDate) : that.advancePaymentCreateDate != null)
            return false;
        if (advancePaymentModifiNo != null ? !advancePaymentModifiNo.equals(that.advancePaymentModifiNo) : that.advancePaymentModifiNo != null)
            return false;
        if (advancePaymentModifiTime != null ? !advancePaymentModifiTime.equals(that.advancePaymentModifiTime) : that.advancePaymentModifiTime != null)
            return false;
        if (advancePaymentFlag != null ? !advancePaymentFlag.equals(that.advancePaymentFlag) : that.advancePaymentFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = advancePaymentAdvancePaymentNo != null ? advancePaymentAdvancePaymentNo.hashCode() : 0;
        result = 31 * result + (advancePaymentTSStaffNo != null ? advancePaymentTSStaffNo.hashCode() : 0);
        result = 31 * result + (advancePaymentAdvancePaymentDescribe != null ? advancePaymentAdvancePaymentDescribe.hashCode() : 0);
        result = 31 * result + (advancePaymentRemark != null ? advancePaymentRemark.hashCode() : 0);
        result = 31 * result + (advancePaymentGroupNodeId != null ? advancePaymentGroupNodeId.hashCode() : 0);
        result = 31 * result + (advancePaymentCreaterNo != null ? advancePaymentCreaterNo.hashCode() : 0);
        result = 31 * result + (advancePaymentCreateDate != null ? advancePaymentCreateDate.hashCode() : 0);
        result = 31 * result + (advancePaymentModifiNo != null ? advancePaymentModifiNo.hashCode() : 0);
        result = 31 * result + (advancePaymentModifiTime != null ? advancePaymentModifiTime.hashCode() : 0);
        result = 31 * result + (advancePaymentFlag != null ? advancePaymentFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "advance_payment_t_s_staff_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByAdvancePaymentTSStaffNo() {
        return tStaffByAdvancePaymentTSStaffNo;
    }

    public void settStaffByAdvancePaymentTSStaffNo(TStaffEntity tStaffByAdvancePaymentTSStaffNo) {
        this.tStaffByAdvancePaymentTSStaffNo = tStaffByAdvancePaymentTSStaffNo;
    }

    @ManyToOne
    @JoinColumn(name = "advance_payment_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByAdvancePaymentGroupNodeId() {
        return tOrgByAdvancePaymentGroupNodeId;
    }

    public void settOrgByAdvancePaymentGroupNodeId(TOrgEntity tOrgByAdvancePaymentGroupNodeId) {
        this.tOrgByAdvancePaymentGroupNodeId = tOrgByAdvancePaymentGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "advance_payment_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByAdvancePaymentModifiNo() {
        return tStaffByAdvancePaymentModifiNo;
    }

    public void settStaffByAdvancePaymentModifiNo(TStaffEntity tStaffByAdvancePaymentModifiNo) {
        this.tStaffByAdvancePaymentModifiNo = tStaffByAdvancePaymentModifiNo;
    }
}
