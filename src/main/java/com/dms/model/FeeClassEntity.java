package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "fee_class", schema = "dbo", catalog = "logistics")
public class FeeClassEntity {
    private String feeClassFeeNo;
    private String feeClassFeeProperty;
    private Integer feeClassFeeAfterTag;
    private String feeClassRemark;
    private String feeClassGroupNodeId;
    private Timestamp feeClassCreateDate;
    private String feeClassCreateNo;
    private String feeClassModifiNo;
    private Timestamp feeClassModifiTime;
    private String feeClassFlag;
    private Collection<FConSEntity> fConSByFeeClassFeeNo;
    private TOrgEntity tOrgByFeeClassGroupNodeId;
    private TStaffEntity tStaffByFeeClassCreateNo;
    private TStaffEntity tStaffByFeeClassModifiNo;

    @Id
    @Column(name = "fee_class_fee_no", nullable = false, length = 4)
    public String getFeeClassFeeNo() {
        return feeClassFeeNo;
    }

    public void setFeeClassFeeNo(String feeClassFeeNo) {
        this.feeClassFeeNo = feeClassFeeNo;
    }

    @Basic
    @Column(name = "fee_class_fee_property", nullable = false, length = 50)
    public String getFeeClassFeeProperty() {
        return feeClassFeeProperty;
    }

    public void setFeeClassFeeProperty(String feeClassFeeProperty) {
        this.feeClassFeeProperty = feeClassFeeProperty;
    }

    @Basic
    @Column(name = "fee_class_fee_after_tag", nullable = true)
    public Integer getFeeClassFeeAfterTag() {
        return feeClassFeeAfterTag;
    }

    public void setFeeClassFeeAfterTag(Integer feeClassFeeAfterTag) {
        this.feeClassFeeAfterTag = feeClassFeeAfterTag;
    }

    @Basic
    @Column(name = "fee_class_remark", nullable = true, length = 100)
    public String getFeeClassRemark() {
        return feeClassRemark;
    }

    public void setFeeClassRemark(String feeClassRemark) {
        this.feeClassRemark = feeClassRemark;
    }

    @Basic
    @Column(name = "fee_class_group_node_id", nullable = true, length = 20)
    public String getFeeClassGroupNodeId() {
        return feeClassGroupNodeId;
    }

    public void setFeeClassGroupNodeId(String feeClassGroupNodeId) {
        this.feeClassGroupNodeId = feeClassGroupNodeId;
    }

    @Basic
    @Column(name = "fee_class_create_date", nullable = true)
    public Timestamp getFeeClassCreateDate() {
        return feeClassCreateDate;
    }

    public void setFeeClassCreateDate(Timestamp feeClassCreateDate) {
        this.feeClassCreateDate = feeClassCreateDate;
    }

    @Basic
    @Column(name = "fee_class_create_no", nullable = true, length = 8)
    public String getFeeClassCreateNo() {
        return feeClassCreateNo;
    }

    public void setFeeClassCreateNo(String feeClassCreateNo) {
        this.feeClassCreateNo = feeClassCreateNo;
    }

    @Basic
    @Column(name = "fee_class_modifi_no", nullable = true, length = 8)
    public String getFeeClassModifiNo() {
        return feeClassModifiNo;
    }

    public void setFeeClassModifiNo(String feeClassModifiNo) {
        this.feeClassModifiNo = feeClassModifiNo;
    }

    @Basic
    @Column(name = "fee_class_modifi_time", nullable = true)
    public Timestamp getFeeClassModifiTime() {
        return feeClassModifiTime;
    }

    public void setFeeClassModifiTime(Timestamp feeClassModifiTime) {
        this.feeClassModifiTime = feeClassModifiTime;
    }

    @Basic
    @Column(name = "fee_class_flag", nullable = false, length = -1)
    public String getFeeClassFlag() {
        return feeClassFlag;
    }

    public void setFeeClassFlag(String feeClassFlag) {
        this.feeClassFlag = feeClassFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeeClassEntity that = (FeeClassEntity) o;

        if (feeClassFeeNo != null ? !feeClassFeeNo.equals(that.feeClassFeeNo) : that.feeClassFeeNo != null)
            return false;
        if (feeClassFeeProperty != null ? !feeClassFeeProperty.equals(that.feeClassFeeProperty) : that.feeClassFeeProperty != null)
            return false;
        if (feeClassFeeAfterTag != null ? !feeClassFeeAfterTag.equals(that.feeClassFeeAfterTag) : that.feeClassFeeAfterTag != null)
            return false;
        if (feeClassRemark != null ? !feeClassRemark.equals(that.feeClassRemark) : that.feeClassRemark != null)
            return false;
        if (feeClassGroupNodeId != null ? !feeClassGroupNodeId.equals(that.feeClassGroupNodeId) : that.feeClassGroupNodeId != null)
            return false;
        if (feeClassCreateDate != null ? !feeClassCreateDate.equals(that.feeClassCreateDate) : that.feeClassCreateDate != null)
            return false;
        if (feeClassCreateNo != null ? !feeClassCreateNo.equals(that.feeClassCreateNo) : that.feeClassCreateNo != null)
            return false;
        if (feeClassModifiNo != null ? !feeClassModifiNo.equals(that.feeClassModifiNo) : that.feeClassModifiNo != null)
            return false;
        if (feeClassModifiTime != null ? !feeClassModifiTime.equals(that.feeClassModifiTime) : that.feeClassModifiTime != null)
            return false;
        if (feeClassFlag != null ? !feeClassFlag.equals(that.feeClassFlag) : that.feeClassFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feeClassFeeNo != null ? feeClassFeeNo.hashCode() : 0;
        result = 31 * result + (feeClassFeeProperty != null ? feeClassFeeProperty.hashCode() : 0);
        result = 31 * result + (feeClassFeeAfterTag != null ? feeClassFeeAfterTag.hashCode() : 0);
        result = 31 * result + (feeClassRemark != null ? feeClassRemark.hashCode() : 0);
        result = 31 * result + (feeClassGroupNodeId != null ? feeClassGroupNodeId.hashCode() : 0);
        result = 31 * result + (feeClassCreateDate != null ? feeClassCreateDate.hashCode() : 0);
        result = 31 * result + (feeClassCreateNo != null ? feeClassCreateNo.hashCode() : 0);
        result = 31 * result + (feeClassModifiNo != null ? feeClassModifiNo.hashCode() : 0);
        result = 31 * result + (feeClassModifiTime != null ? feeClassModifiTime.hashCode() : 0);
        result = 31 * result + (feeClassFlag != null ? feeClassFlag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "feeClassByFConSFeeNo")
    public Collection<FConSEntity> getfConSByFeeClassFeeNo() {
        return fConSByFeeClassFeeNo;
    }

    public void setfConSByFeeClassFeeNo(Collection<FConSEntity> fConSByFeeClassFeeNo) {
        this.fConSByFeeClassFeeNo = fConSByFeeClassFeeNo;
    }

    @ManyToOne
    @JoinColumn(name = "fee_class_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByFeeClassGroupNodeId() {
        return tOrgByFeeClassGroupNodeId;
    }

    public void settOrgByFeeClassGroupNodeId(TOrgEntity tOrgByFeeClassGroupNodeId) {
        this.tOrgByFeeClassGroupNodeId = tOrgByFeeClassGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "fee_class_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByFeeClassCreateNo() {
        return tStaffByFeeClassCreateNo;
    }

    public void settStaffByFeeClassCreateNo(TStaffEntity tStaffByFeeClassCreateNo) {
        this.tStaffByFeeClassCreateNo = tStaffByFeeClassCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "fee_class_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByFeeClassModifiNo() {
        return tStaffByFeeClassModifiNo;
    }

    public void settStaffByFeeClassModifiNo(TStaffEntity tStaffByFeeClassModifiNo) {
        this.tStaffByFeeClassModifiNo = tStaffByFeeClassModifiNo;
    }
}
