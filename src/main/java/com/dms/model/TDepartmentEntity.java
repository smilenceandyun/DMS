package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_department", schema = "dbo", catalog = "logistics_test")
public class TDepartmentEntity {
    private String tDepartmentDeptNo;
    private String tDepartmentGroupNodeId;
    private String tDepartmentDeptName;
    private String tDepartmentRemark;
    private String tDepartmentCreateNo;
    private Timestamp tDepartmentCreateDate;
    private String tDepartmentModifiNo;
    private Timestamp tDepartmentModifiTime;
    private String tDepartmentFlag;
    private TOrgEntity tOrgByTDepartmentGroupNodeId;
    private TStaffEntity tStaffByTDepartmentCreateNo;
    private TStaffEntity tStaffByTDepartmentModifiNo;
    private Collection<TStaffEntity> tStaffsByTDepartmentDeptNo;

    @Id
    @Column(name = "t_department_dept_no", nullable = false, length = 4)
    public String gettDepartmentDeptNo() {
        return tDepartmentDeptNo;
    }

    public void settDepartmentDeptNo(String tDepartmentDeptNo) {
        this.tDepartmentDeptNo = tDepartmentDeptNo;
    }

    @Basic
    @Column(name = "t_department_group_node_id", nullable = true, length = 20)
    public String gettDepartmentGroupNodeId() {
        return tDepartmentGroupNodeId;
    }

    public void settDepartmentGroupNodeId(String tDepartmentGroupNodeId) {
        this.tDepartmentGroupNodeId = tDepartmentGroupNodeId;
    }

    @Basic
    @Column(name = "t_department_dept_name", nullable = false, length = 30)
    public String gettDepartmentDeptName() {
        return tDepartmentDeptName;
    }

    public void settDepartmentDeptName(String tDepartmentDeptName) {
        this.tDepartmentDeptName = tDepartmentDeptName;
    }

    @Basic
    @Column(name = "t_department_remark", nullable = true, length = 100)
    public String gettDepartmentRemark() {
        return tDepartmentRemark;
    }

    public void settDepartmentRemark(String tDepartmentRemark) {
        this.tDepartmentRemark = tDepartmentRemark;
    }

    @Basic
    @Column(name = "t_department_create_no", nullable = true, length = 8)
    public String gettDepartmentCreateNo() {
        return tDepartmentCreateNo;
    }

    public void settDepartmentCreateNo(String tDepartmentCreateNo) {
        this.tDepartmentCreateNo = tDepartmentCreateNo;
    }

    @Basic
    @Column(name = "t_department_create_date", nullable = true)
    public Timestamp gettDepartmentCreateDate() {
        return tDepartmentCreateDate;
    }

    public void settDepartmentCreateDate(Timestamp tDepartmentCreateDate) {
        this.tDepartmentCreateDate = tDepartmentCreateDate;
    }

    @Basic
    @Column(name = "t_department_modifi_no", nullable = true, length = 8)
    public String gettDepartmentModifiNo() {
        return tDepartmentModifiNo;
    }

    public void settDepartmentModifiNo(String tDepartmentModifiNo) {
        this.tDepartmentModifiNo = tDepartmentModifiNo;
    }

    @Basic
    @Column(name = "t_department_modifi_time", nullable = true)
    public Timestamp gettDepartmentModifiTime() {
        return tDepartmentModifiTime;
    }

    public void settDepartmentModifiTime(Timestamp tDepartmentModifiTime) {
        this.tDepartmentModifiTime = tDepartmentModifiTime;
    }

    @Basic
    @Column(name = "t_department_flag", nullable = false, length = 1)
    public String gettDepartmentFlag() {
        return tDepartmentFlag;
    }

    public void settDepartmentFlag(String tDepartmentFlag) {
        this.tDepartmentFlag = tDepartmentFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDepartmentEntity that = (TDepartmentEntity) o;

        if (tDepartmentDeptNo != null ? !tDepartmentDeptNo.equals(that.tDepartmentDeptNo) : that.tDepartmentDeptNo != null)
            return false;
        if (tDepartmentGroupNodeId != null ? !tDepartmentGroupNodeId.equals(that.tDepartmentGroupNodeId) : that.tDepartmentGroupNodeId != null)
            return false;
        if (tDepartmentDeptName != null ? !tDepartmentDeptName.equals(that.tDepartmentDeptName) : that.tDepartmentDeptName != null)
            return false;
        if (tDepartmentRemark != null ? !tDepartmentRemark.equals(that.tDepartmentRemark) : that.tDepartmentRemark != null)
            return false;
        if (tDepartmentCreateNo != null ? !tDepartmentCreateNo.equals(that.tDepartmentCreateNo) : that.tDepartmentCreateNo != null)
            return false;
        if (tDepartmentCreateDate != null ? !tDepartmentCreateDate.equals(that.tDepartmentCreateDate) : that.tDepartmentCreateDate != null)
            return false;
        if (tDepartmentModifiNo != null ? !tDepartmentModifiNo.equals(that.tDepartmentModifiNo) : that.tDepartmentModifiNo != null)
            return false;
        if (tDepartmentModifiTime != null ? !tDepartmentModifiTime.equals(that.tDepartmentModifiTime) : that.tDepartmentModifiTime != null)
            return false;
        if (tDepartmentFlag != null ? !tDepartmentFlag.equals(that.tDepartmentFlag) : that.tDepartmentFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tDepartmentDeptNo != null ? tDepartmentDeptNo.hashCode() : 0;
        result = 31 * result + (tDepartmentGroupNodeId != null ? tDepartmentGroupNodeId.hashCode() : 0);
        result = 31 * result + (tDepartmentDeptName != null ? tDepartmentDeptName.hashCode() : 0);
        result = 31 * result + (tDepartmentRemark != null ? tDepartmentRemark.hashCode() : 0);
        result = 31 * result + (tDepartmentCreateNo != null ? tDepartmentCreateNo.hashCode() : 0);
        result = 31 * result + (tDepartmentCreateDate != null ? tDepartmentCreateDate.hashCode() : 0);
        result = 31 * result + (tDepartmentModifiNo != null ? tDepartmentModifiNo.hashCode() : 0);
        result = 31 * result + (tDepartmentModifiTime != null ? tDepartmentModifiTime.hashCode() : 0);
        result = 31 * result + (tDepartmentFlag != null ? tDepartmentFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "t_department_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTDepartmentGroupNodeId() {
        return tOrgByTDepartmentGroupNodeId;
    }

    public void settOrgByTDepartmentGroupNodeId(TOrgEntity tOrgByTDepartmentGroupNodeId) {
        this.tOrgByTDepartmentGroupNodeId = tOrgByTDepartmentGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_department_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTDepartmentCreateNo() {
        return tStaffByTDepartmentCreateNo;
    }

    public void settStaffByTDepartmentCreateNo(TStaffEntity tStaffByTDepartmentCreateNo) {
        this.tStaffByTDepartmentCreateNo = tStaffByTDepartmentCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_department_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTDepartmentModifiNo() {
        return tStaffByTDepartmentModifiNo;
    }

    public void settStaffByTDepartmentModifiNo(TStaffEntity tStaffByTDepartmentModifiNo) {
        this.tStaffByTDepartmentModifiNo = tStaffByTDepartmentModifiNo;
    }

    @OneToMany(mappedBy = "tDepartmentByTStaffDeptNo")
    public Collection<TStaffEntity> gettStaffsByTDepartmentDeptNo() {
        return tStaffsByTDepartmentDeptNo;
    }

    public void settStaffsByTDepartmentDeptNo(Collection<TStaffEntity> tStaffsByTDepartmentDeptNo) {
        this.tStaffsByTDepartmentDeptNo = tStaffsByTDepartmentDeptNo;
    }
}
