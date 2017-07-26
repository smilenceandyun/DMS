package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "age_analysis", schema = "dbo", catalog = "logistics_test")
public class AgeAnalysisEntity {
    private String ageAnalysisAgeAnalysisNo;
    private String ageAnalysisAgeAnalysisDescribe;
    private short ageAnalysisMinDays;
    private short ageAnalysisMaxDays;
    private String ageAnalysisRemark;
    private String ageAnalysisGroupNodeId;
    private String ageAnalysisCreaterNo;
    private Timestamp ageAnalysisCreateDate;
    private String ageAnalysisModifiNo;
    private Timestamp ageAnalysisModifiTime;
    private String ageAnalysisFlag;
    private TOrgEntity tOrgByAgeAnalysisGroupNodeId;
    private TStaffEntity tStaffByAgeAnalysisCreaterNo;
    private TStaffEntity tStaffByAgeAnalysisModifiNo;

    @Id
    @Column(name = "age_analysis_age_analysis_no", nullable = false, length = 4)
    public String getAgeAnalysisAgeAnalysisNo() {
        return ageAnalysisAgeAnalysisNo;
    }

    public void setAgeAnalysisAgeAnalysisNo(String ageAnalysisAgeAnalysisNo) {
        this.ageAnalysisAgeAnalysisNo = ageAnalysisAgeAnalysisNo;
    }

    @Basic
    @Column(name = "age_analysis_age_analysis_describe", nullable = false, length = 50)
    public String getAgeAnalysisAgeAnalysisDescribe() {
        return ageAnalysisAgeAnalysisDescribe;
    }

    public void setAgeAnalysisAgeAnalysisDescribe(String ageAnalysisAgeAnalysisDescribe) {
        this.ageAnalysisAgeAnalysisDescribe = ageAnalysisAgeAnalysisDescribe;
    }

    @Basic
    @Column(name = "age_analysis_min_days", nullable = false)
    public short getAgeAnalysisMinDays() {
        return ageAnalysisMinDays;
    }

    public void setAgeAnalysisMinDays(short ageAnalysisMinDays) {
        this.ageAnalysisMinDays = ageAnalysisMinDays;
    }

    @Basic
    @Column(name = "age_analysis_max_days", nullable = false)
    public short getAgeAnalysisMaxDays() {
        return ageAnalysisMaxDays;
    }

    public void setAgeAnalysisMaxDays(short ageAnalysisMaxDays) {
        this.ageAnalysisMaxDays = ageAnalysisMaxDays;
    }

    @Basic
    @Column(name = "age_analysis_remark", nullable = true, length = 100)
    public String getAgeAnalysisRemark() {
        return ageAnalysisRemark;
    }

    public void setAgeAnalysisRemark(String ageAnalysisRemark) {
        this.ageAnalysisRemark = ageAnalysisRemark;
    }

    @Basic
    @Column(name = "age_analysis_group_node_id", nullable = true, length = 20)
    public String getAgeAnalysisGroupNodeId() {
        return ageAnalysisGroupNodeId;
    }

    public void setAgeAnalysisGroupNodeId(String ageAnalysisGroupNodeId) {
        this.ageAnalysisGroupNodeId = ageAnalysisGroupNodeId;
    }

    @Basic
    @Column(name = "age_analysis_creater_no", nullable = true, length = 8)
    public String getAgeAnalysisCreaterNo() {
        return ageAnalysisCreaterNo;
    }

    public void setAgeAnalysisCreaterNo(String ageAnalysisCreaterNo) {
        this.ageAnalysisCreaterNo = ageAnalysisCreaterNo;
    }

    @Basic
    @Column(name = "age_analysis_create_date", nullable = true)
    public Timestamp getAgeAnalysisCreateDate() {
        return ageAnalysisCreateDate;
    }

    public void setAgeAnalysisCreateDate(Timestamp ageAnalysisCreateDate) {
        this.ageAnalysisCreateDate = ageAnalysisCreateDate;
    }

    @Basic
    @Column(name = "age_analysis_modifi_no", nullable = true, length = 8)
    public String getAgeAnalysisModifiNo() {
        return ageAnalysisModifiNo;
    }

    public void setAgeAnalysisModifiNo(String ageAnalysisModifiNo) {
        this.ageAnalysisModifiNo = ageAnalysisModifiNo;
    }

    @Basic
    @Column(name = "age_analysis_modifi_time", nullable = true)
    public Timestamp getAgeAnalysisModifiTime() {
        return ageAnalysisModifiTime;
    }

    public void setAgeAnalysisModifiTime(Timestamp ageAnalysisModifiTime) {
        this.ageAnalysisModifiTime = ageAnalysisModifiTime;
    }

    @Basic
    @Column(name = "age_analysis_flag", nullable = false, length = 1)
    public String getAgeAnalysisFlag() {
        return ageAnalysisFlag;
    }

    public void setAgeAnalysisFlag(String ageAnalysisFlag) {
        this.ageAnalysisFlag = ageAnalysisFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgeAnalysisEntity that = (AgeAnalysisEntity) o;

        if (ageAnalysisMinDays != that.ageAnalysisMinDays) return false;
        if (ageAnalysisMaxDays != that.ageAnalysisMaxDays) return false;
        if (ageAnalysisAgeAnalysisNo != null ? !ageAnalysisAgeAnalysisNo.equals(that.ageAnalysisAgeAnalysisNo) : that.ageAnalysisAgeAnalysisNo != null)
            return false;
        if (ageAnalysisAgeAnalysisDescribe != null ? !ageAnalysisAgeAnalysisDescribe.equals(that.ageAnalysisAgeAnalysisDescribe) : that.ageAnalysisAgeAnalysisDescribe != null)
            return false;
        if (ageAnalysisRemark != null ? !ageAnalysisRemark.equals(that.ageAnalysisRemark) : that.ageAnalysisRemark != null)
            return false;
        if (ageAnalysisGroupNodeId != null ? !ageAnalysisGroupNodeId.equals(that.ageAnalysisGroupNodeId) : that.ageAnalysisGroupNodeId != null)
            return false;
        if (ageAnalysisCreaterNo != null ? !ageAnalysisCreaterNo.equals(that.ageAnalysisCreaterNo) : that.ageAnalysisCreaterNo != null)
            return false;
        if (ageAnalysisCreateDate != null ? !ageAnalysisCreateDate.equals(that.ageAnalysisCreateDate) : that.ageAnalysisCreateDate != null)
            return false;
        if (ageAnalysisModifiNo != null ? !ageAnalysisModifiNo.equals(that.ageAnalysisModifiNo) : that.ageAnalysisModifiNo != null)
            return false;
        if (ageAnalysisModifiTime != null ? !ageAnalysisModifiTime.equals(that.ageAnalysisModifiTime) : that.ageAnalysisModifiTime != null)
            return false;
        if (ageAnalysisFlag != null ? !ageAnalysisFlag.equals(that.ageAnalysisFlag) : that.ageAnalysisFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ageAnalysisAgeAnalysisNo != null ? ageAnalysisAgeAnalysisNo.hashCode() : 0;
        result = 31 * result + (ageAnalysisAgeAnalysisDescribe != null ? ageAnalysisAgeAnalysisDescribe.hashCode() : 0);
        result = 31 * result + (int) ageAnalysisMinDays;
        result = 31 * result + (int) ageAnalysisMaxDays;
        result = 31 * result + (ageAnalysisRemark != null ? ageAnalysisRemark.hashCode() : 0);
        result = 31 * result + (ageAnalysisGroupNodeId != null ? ageAnalysisGroupNodeId.hashCode() : 0);
        result = 31 * result + (ageAnalysisCreaterNo != null ? ageAnalysisCreaterNo.hashCode() : 0);
        result = 31 * result + (ageAnalysisCreateDate != null ? ageAnalysisCreateDate.hashCode() : 0);
        result = 31 * result + (ageAnalysisModifiNo != null ? ageAnalysisModifiNo.hashCode() : 0);
        result = 31 * result + (ageAnalysisModifiTime != null ? ageAnalysisModifiTime.hashCode() : 0);
        result = 31 * result + (ageAnalysisFlag != null ? ageAnalysisFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "age_analysis_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByAgeAnalysisGroupNodeId() {
        return tOrgByAgeAnalysisGroupNodeId;
    }

    public void settOrgByAgeAnalysisGroupNodeId(TOrgEntity tOrgByAgeAnalysisGroupNodeId) {
        this.tOrgByAgeAnalysisGroupNodeId = tOrgByAgeAnalysisGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "age_analysis_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByAgeAnalysisCreaterNo() {
        return tStaffByAgeAnalysisCreaterNo;
    }

    public void settStaffByAgeAnalysisCreaterNo(TStaffEntity tStaffByAgeAnalysisCreaterNo) {
        this.tStaffByAgeAnalysisCreaterNo = tStaffByAgeAnalysisCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "age_analysis_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByAgeAnalysisModifiNo() {
        return tStaffByAgeAnalysisModifiNo;
    }

    public void settStaffByAgeAnalysisModifiNo(TStaffEntity tStaffByAgeAnalysisModifiNo) {
        this.tStaffByAgeAnalysisModifiNo = tStaffByAgeAnalysisModifiNo;
    }
}
