package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_present", schema = "dbo", catalog = "logistics_test")
public class TPresentEntity {
    private String tPresentPresentNo;
    private String tPresentPresentName;
    private String tPresentRemark;
    private String tPresentGroupNodeId;
    private String tPresentCreaterNo;
    private Timestamp tPresentCreateDate;
    private String tPresentModifiNo;
    private Timestamp tPresentModifiTime;
    private String tPresentFlag;
    private TOrgEntity tOrgByTPresentGroupNodeId;
    private TStaffEntity tStaffByTPresentCreaterNo;
    private TStaffEntity tStaffByTPresentModifiNo;

    @Id
    @Column(name = "t_present_present_no", nullable = false, length = 8)
    public String gettPresentPresentNo() {
        return tPresentPresentNo;
    }

    public void settPresentPresentNo(String tPresentPresentNo) {
        this.tPresentPresentNo = tPresentPresentNo;
    }

    @Basic
    @Column(name = "t_present_present_name", nullable = false, length = 50)
    public String gettPresentPresentName() {
        return tPresentPresentName;
    }

    public void settPresentPresentName(String tPresentPresentName) {
        this.tPresentPresentName = tPresentPresentName;
    }

    @Basic
    @Column(name = "t_present_remark", nullable = true, length = 100)
    public String gettPresentRemark() {
        return tPresentRemark;
    }

    public void settPresentRemark(String tPresentRemark) {
        this.tPresentRemark = tPresentRemark;
    }

    @Basic
    @Column(name = "t_present_group_node_id", nullable = false, length = 20)
    public String gettPresentGroupNodeId() {
        return tPresentGroupNodeId;
    }

    public void settPresentGroupNodeId(String tPresentGroupNodeId) {
        this.tPresentGroupNodeId = tPresentGroupNodeId;
    }

    @Basic
    @Column(name = "t_present_creater_no", nullable = true, length = 8)
    public String gettPresentCreaterNo() {
        return tPresentCreaterNo;
    }

    public void settPresentCreaterNo(String tPresentCreaterNo) {
        this.tPresentCreaterNo = tPresentCreaterNo;
    }

    @Basic
    @Column(name = "t_present_create_date", nullable = true)
    public Timestamp gettPresentCreateDate() {
        return tPresentCreateDate;
    }

    public void settPresentCreateDate(Timestamp tPresentCreateDate) {
        this.tPresentCreateDate = tPresentCreateDate;
    }

    @Basic
    @Column(name = "t_present_modifi_no", nullable = true, length = 8)
    public String gettPresentModifiNo() {
        return tPresentModifiNo;
    }

    public void settPresentModifiNo(String tPresentModifiNo) {
        this.tPresentModifiNo = tPresentModifiNo;
    }

    @Basic
    @Column(name = "t_present_modifi_time", nullable = true)
    public Timestamp gettPresentModifiTime() {
        return tPresentModifiTime;
    }

    public void settPresentModifiTime(Timestamp tPresentModifiTime) {
        this.tPresentModifiTime = tPresentModifiTime;
    }

    @Basic
    @Column(name = "t_present_flag", nullable = false, length = 1)
    public String gettPresentFlag() {
        return tPresentFlag;
    }

    public void settPresentFlag(String tPresentFlag) {
        this.tPresentFlag = tPresentFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPresentEntity that = (TPresentEntity) o;

        if (tPresentPresentNo != null ? !tPresentPresentNo.equals(that.tPresentPresentNo) : that.tPresentPresentNo != null)
            return false;
        if (tPresentPresentName != null ? !tPresentPresentName.equals(that.tPresentPresentName) : that.tPresentPresentName != null)
            return false;
        if (tPresentRemark != null ? !tPresentRemark.equals(that.tPresentRemark) : that.tPresentRemark != null)
            return false;
        if (tPresentGroupNodeId != null ? !tPresentGroupNodeId.equals(that.tPresentGroupNodeId) : that.tPresentGroupNodeId != null)
            return false;
        if (tPresentCreaterNo != null ? !tPresentCreaterNo.equals(that.tPresentCreaterNo) : that.tPresentCreaterNo != null)
            return false;
        if (tPresentCreateDate != null ? !tPresentCreateDate.equals(that.tPresentCreateDate) : that.tPresentCreateDate != null)
            return false;
        if (tPresentModifiNo != null ? !tPresentModifiNo.equals(that.tPresentModifiNo) : that.tPresentModifiNo != null)
            return false;
        if (tPresentModifiTime != null ? !tPresentModifiTime.equals(that.tPresentModifiTime) : that.tPresentModifiTime != null)
            return false;
        if (tPresentFlag != null ? !tPresentFlag.equals(that.tPresentFlag) : that.tPresentFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tPresentPresentNo != null ? tPresentPresentNo.hashCode() : 0;
        result = 31 * result + (tPresentPresentName != null ? tPresentPresentName.hashCode() : 0);
        result = 31 * result + (tPresentRemark != null ? tPresentRemark.hashCode() : 0);
        result = 31 * result + (tPresentGroupNodeId != null ? tPresentGroupNodeId.hashCode() : 0);
        result = 31 * result + (tPresentCreaterNo != null ? tPresentCreaterNo.hashCode() : 0);
        result = 31 * result + (tPresentCreateDate != null ? tPresentCreateDate.hashCode() : 0);
        result = 31 * result + (tPresentModifiNo != null ? tPresentModifiNo.hashCode() : 0);
        result = 31 * result + (tPresentModifiTime != null ? tPresentModifiTime.hashCode() : 0);
        result = 31 * result + (tPresentFlag != null ? tPresentFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "t_present_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByTPresentGroupNodeId() {
        return tOrgByTPresentGroupNodeId;
    }

    public void settOrgByTPresentGroupNodeId(TOrgEntity tOrgByTPresentGroupNodeId) {
        this.tOrgByTPresentGroupNodeId = tOrgByTPresentGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_present_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPresentCreaterNo() {
        return tStaffByTPresentCreaterNo;
    }

    public void settStaffByTPresentCreaterNo(TStaffEntity tStaffByTPresentCreaterNo) {
        this.tStaffByTPresentCreaterNo = tStaffByTPresentCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_present_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPresentModifiNo() {
        return tStaffByTPresentModifiNo;
    }

    public void settStaffByTPresentModifiNo(TStaffEntity tStaffByTPresentModifiNo) {
        this.tStaffByTPresentModifiNo = tStaffByTPresentModifiNo;
    }
}
