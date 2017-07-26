package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_route", schema = "dbo", catalog = "logistics_test")
public class TRouteEntity {
    private String tRouteRouteNo;
    private String tRouteRouteName;
    private String tRouteRemark;
    private String tRouteGroupNodeId;
    private String tRouteCreaterNo;
    private Timestamp tRouteCreateDate;
    private String tRouteModifiNo;
    private Timestamp tRouteModifiTime;
    private String tRouteFlag;
    private TOrgEntity tOrgByTRouteGroupNodeId;
    private TStaffEntity tStaffByTRouteCreaterNo;
    private TStaffEntity tStaffByTRouteModifiNo;

    @Id
    @Column(name = "t_route_route_no", nullable = false, length = 4)
    public String gettRouteRouteNo() {
        return tRouteRouteNo;
    }

    public void settRouteRouteNo(String tRouteRouteNo) {
        this.tRouteRouteNo = tRouteRouteNo;
    }

    @Basic
    @Column(name = "t_route_route_name", nullable = false, length = 50)
    public String gettRouteRouteName() {
        return tRouteRouteName;
    }

    public void settRouteRouteName(String tRouteRouteName) {
        this.tRouteRouteName = tRouteRouteName;
    }

    @Basic
    @Column(name = "t_route_remark", nullable = true, length = 100)
    public String gettRouteRemark() {
        return tRouteRemark;
    }

    public void settRouteRemark(String tRouteRemark) {
        this.tRouteRemark = tRouteRemark;
    }

    @Basic
    @Column(name = "t_route_group_node_id", nullable = false, length = 20)
    public String gettRouteGroupNodeId() {
        return tRouteGroupNodeId;
    }

    public void settRouteGroupNodeId(String tRouteGroupNodeId) {
        this.tRouteGroupNodeId = tRouteGroupNodeId;
    }

    @Basic
    @Column(name = "t_route_creater_no", nullable = true, length = 8)
    public String gettRouteCreaterNo() {
        return tRouteCreaterNo;
    }

    public void settRouteCreaterNo(String tRouteCreaterNo) {
        this.tRouteCreaterNo = tRouteCreaterNo;
    }

    @Basic
    @Column(name = "t_route_create_date", nullable = true)
    public Timestamp gettRouteCreateDate() {
        return tRouteCreateDate;
    }

    public void settRouteCreateDate(Timestamp tRouteCreateDate) {
        this.tRouteCreateDate = tRouteCreateDate;
    }

    @Basic
    @Column(name = "t_route_modifi_no", nullable = true, length = 8)
    public String gettRouteModifiNo() {
        return tRouteModifiNo;
    }

    public void settRouteModifiNo(String tRouteModifiNo) {
        this.tRouteModifiNo = tRouteModifiNo;
    }

    @Basic
    @Column(name = "t_route_modifi_time", nullable = true)
    public Timestamp gettRouteModifiTime() {
        return tRouteModifiTime;
    }

    public void settRouteModifiTime(Timestamp tRouteModifiTime) {
        this.tRouteModifiTime = tRouteModifiTime;
    }

    @Basic
    @Column(name = "t_route_flag", nullable = false, length = 1)
    public String gettRouteFlag() {
        return tRouteFlag;
    }

    public void settRouteFlag(String tRouteFlag) {
        this.tRouteFlag = tRouteFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRouteEntity that = (TRouteEntity) o;

        if (tRouteRouteNo != null ? !tRouteRouteNo.equals(that.tRouteRouteNo) : that.tRouteRouteNo != null)
            return false;
        if (tRouteRouteName != null ? !tRouteRouteName.equals(that.tRouteRouteName) : that.tRouteRouteName != null)
            return false;
        if (tRouteRemark != null ? !tRouteRemark.equals(that.tRouteRemark) : that.tRouteRemark != null) return false;
        if (tRouteGroupNodeId != null ? !tRouteGroupNodeId.equals(that.tRouteGroupNodeId) : that.tRouteGroupNodeId != null)
            return false;
        if (tRouteCreaterNo != null ? !tRouteCreaterNo.equals(that.tRouteCreaterNo) : that.tRouteCreaterNo != null)
            return false;
        if (tRouteCreateDate != null ? !tRouteCreateDate.equals(that.tRouteCreateDate) : that.tRouteCreateDate != null)
            return false;
        if (tRouteModifiNo != null ? !tRouteModifiNo.equals(that.tRouteModifiNo) : that.tRouteModifiNo != null)
            return false;
        if (tRouteModifiTime != null ? !tRouteModifiTime.equals(that.tRouteModifiTime) : that.tRouteModifiTime != null)
            return false;
        if (tRouteFlag != null ? !tRouteFlag.equals(that.tRouteFlag) : that.tRouteFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tRouteRouteNo != null ? tRouteRouteNo.hashCode() : 0;
        result = 31 * result + (tRouteRouteName != null ? tRouteRouteName.hashCode() : 0);
        result = 31 * result + (tRouteRemark != null ? tRouteRemark.hashCode() : 0);
        result = 31 * result + (tRouteGroupNodeId != null ? tRouteGroupNodeId.hashCode() : 0);
        result = 31 * result + (tRouteCreaterNo != null ? tRouteCreaterNo.hashCode() : 0);
        result = 31 * result + (tRouteCreateDate != null ? tRouteCreateDate.hashCode() : 0);
        result = 31 * result + (tRouteModifiNo != null ? tRouteModifiNo.hashCode() : 0);
        result = 31 * result + (tRouteModifiTime != null ? tRouteModifiTime.hashCode() : 0);
        result = 31 * result + (tRouteFlag != null ? tRouteFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "t_route_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByTRouteGroupNodeId() {
        return tOrgByTRouteGroupNodeId;
    }

    public void settOrgByTRouteGroupNodeId(TOrgEntity tOrgByTRouteGroupNodeId) {
        this.tOrgByTRouteGroupNodeId = tOrgByTRouteGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_route_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTRouteCreaterNo() {
        return tStaffByTRouteCreaterNo;
    }

    public void settStaffByTRouteCreaterNo(TStaffEntity tStaffByTRouteCreaterNo) {
        this.tStaffByTRouteCreaterNo = tStaffByTRouteCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_route_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTRouteModifiNo() {
        return tStaffByTRouteModifiNo;
    }

    public void settStaffByTRouteModifiNo(TStaffEntity tStaffByTRouteModifiNo) {
        this.tStaffByTRouteModifiNo = tStaffByTRouteModifiNo;
    }
}
