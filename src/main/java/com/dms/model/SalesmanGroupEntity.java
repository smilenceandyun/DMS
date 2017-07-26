package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "salesman_group", schema = "dbo", catalog = "logistics_test")
public class SalesmanGroupEntity {
    private String salesmanGroupSalesmanGroupNo;
    private String salesmanGroupSalesmanGroupName;
    private String salesmanGroupRemark;
    private String salesmanGroupGroupNodeId;
    private String salesmanGroupCreaterNo;
    private Timestamp salesmanGroupCreateDate;
    private String salesmanGroupModifiNo;
    private Timestamp salesmanGroupModifiTime;
    private String salesmanGroupFlag;
    private TOrgEntity tOrgBySalesmanGroupGroupNodeId;
    private TStaffEntity tStaffBySalesmanGroupCreaterNo;
    private TStaffEntity tStaffBySalesmanGroupModifiNo;

    @Id
    @Column(name = "salesman_group_salesman_group_no", nullable = false, length = 4)
    public String getSalesmanGroupSalesmanGroupNo() {
        return salesmanGroupSalesmanGroupNo;
    }

    public void setSalesmanGroupSalesmanGroupNo(String salesmanGroupSalesmanGroupNo) {
        this.salesmanGroupSalesmanGroupNo = salesmanGroupSalesmanGroupNo;
    }

    @Basic
    @Column(name = "salesman_group_salesman_group_name", nullable = false, length = 50)
    public String getSalesmanGroupSalesmanGroupName() {
        return salesmanGroupSalesmanGroupName;
    }

    public void setSalesmanGroupSalesmanGroupName(String salesmanGroupSalesmanGroupName) {
        this.salesmanGroupSalesmanGroupName = salesmanGroupSalesmanGroupName;
    }

    @Basic
    @Column(name = "salesman_group_remark", nullable = true, length = 100)
    public String getSalesmanGroupRemark() {
        return salesmanGroupRemark;
    }

    public void setSalesmanGroupRemark(String salesmanGroupRemark) {
        this.salesmanGroupRemark = salesmanGroupRemark;
    }

    @Basic
    @Column(name = "salesman_group_group_node_id", nullable = false, length = 20)
    public String getSalesmanGroupGroupNodeId() {
        return salesmanGroupGroupNodeId;
    }

    public void setSalesmanGroupGroupNodeId(String salesmanGroupGroupNodeId) {
        this.salesmanGroupGroupNodeId = salesmanGroupGroupNodeId;
    }

    @Basic
    @Column(name = "salesman_group_creater_no", nullable = true, length = 8)
    public String getSalesmanGroupCreaterNo() {
        return salesmanGroupCreaterNo;
    }

    public void setSalesmanGroupCreaterNo(String salesmanGroupCreaterNo) {
        this.salesmanGroupCreaterNo = salesmanGroupCreaterNo;
    }

    @Basic
    @Column(name = "salesman_group_create_date", nullable = true)
    public Timestamp getSalesmanGroupCreateDate() {
        return salesmanGroupCreateDate;
    }

    public void setSalesmanGroupCreateDate(Timestamp salesmanGroupCreateDate) {
        this.salesmanGroupCreateDate = salesmanGroupCreateDate;
    }

    @Basic
    @Column(name = "salesman_group_modifi_no", nullable = true, length = 8)
    public String getSalesmanGroupModifiNo() {
        return salesmanGroupModifiNo;
    }

    public void setSalesmanGroupModifiNo(String salesmanGroupModifiNo) {
        this.salesmanGroupModifiNo = salesmanGroupModifiNo;
    }

    @Basic
    @Column(name = "salesman_group_modifi_time", nullable = true)
    public Timestamp getSalesmanGroupModifiTime() {
        return salesmanGroupModifiTime;
    }

    public void setSalesmanGroupModifiTime(Timestamp salesmanGroupModifiTime) {
        this.salesmanGroupModifiTime = salesmanGroupModifiTime;
    }

    @Basic
    @Column(name = "salesman_group_flag", nullable = true, length = 1)
    public String getSalesmanGroupFlag() {
        return salesmanGroupFlag;
    }

    public void setSalesmanGroupFlag(String salesmanGroupFlag) {
        this.salesmanGroupFlag = salesmanGroupFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesmanGroupEntity that = (SalesmanGroupEntity) o;

        if (salesmanGroupSalesmanGroupNo != null ? !salesmanGroupSalesmanGroupNo.equals(that.salesmanGroupSalesmanGroupNo) : that.salesmanGroupSalesmanGroupNo != null)
            return false;
        if (salesmanGroupSalesmanGroupName != null ? !salesmanGroupSalesmanGroupName.equals(that.salesmanGroupSalesmanGroupName) : that.salesmanGroupSalesmanGroupName != null)
            return false;
        if (salesmanGroupRemark != null ? !salesmanGroupRemark.equals(that.salesmanGroupRemark) : that.salesmanGroupRemark != null)
            return false;
        if (salesmanGroupGroupNodeId != null ? !salesmanGroupGroupNodeId.equals(that.salesmanGroupGroupNodeId) : that.salesmanGroupGroupNodeId != null)
            return false;
        if (salesmanGroupCreaterNo != null ? !salesmanGroupCreaterNo.equals(that.salesmanGroupCreaterNo) : that.salesmanGroupCreaterNo != null)
            return false;
        if (salesmanGroupCreateDate != null ? !salesmanGroupCreateDate.equals(that.salesmanGroupCreateDate) : that.salesmanGroupCreateDate != null)
            return false;
        if (salesmanGroupModifiNo != null ? !salesmanGroupModifiNo.equals(that.salesmanGroupModifiNo) : that.salesmanGroupModifiNo != null)
            return false;
        if (salesmanGroupModifiTime != null ? !salesmanGroupModifiTime.equals(that.salesmanGroupModifiTime) : that.salesmanGroupModifiTime != null)
            return false;
        if (salesmanGroupFlag != null ? !salesmanGroupFlag.equals(that.salesmanGroupFlag) : that.salesmanGroupFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salesmanGroupSalesmanGroupNo != null ? salesmanGroupSalesmanGroupNo.hashCode() : 0;
        result = 31 * result + (salesmanGroupSalesmanGroupName != null ? salesmanGroupSalesmanGroupName.hashCode() : 0);
        result = 31 * result + (salesmanGroupRemark != null ? salesmanGroupRemark.hashCode() : 0);
        result = 31 * result + (salesmanGroupGroupNodeId != null ? salesmanGroupGroupNodeId.hashCode() : 0);
        result = 31 * result + (salesmanGroupCreaterNo != null ? salesmanGroupCreaterNo.hashCode() : 0);
        result = 31 * result + (salesmanGroupCreateDate != null ? salesmanGroupCreateDate.hashCode() : 0);
        result = 31 * result + (salesmanGroupModifiNo != null ? salesmanGroupModifiNo.hashCode() : 0);
        result = 31 * result + (salesmanGroupModifiTime != null ? salesmanGroupModifiTime.hashCode() : 0);
        result = 31 * result + (salesmanGroupFlag != null ? salesmanGroupFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "salesman_group_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySalesmanGroupGroupNodeId() {
        return tOrgBySalesmanGroupGroupNodeId;
    }

    public void settOrgBySalesmanGroupGroupNodeId(TOrgEntity tOrgBySalesmanGroupGroupNodeId) {
        this.tOrgBySalesmanGroupGroupNodeId = tOrgBySalesmanGroupGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "salesman_group_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySalesmanGroupCreaterNo() {
        return tStaffBySalesmanGroupCreaterNo;
    }

    public void settStaffBySalesmanGroupCreaterNo(TStaffEntity tStaffBySalesmanGroupCreaterNo) {
        this.tStaffBySalesmanGroupCreaterNo = tStaffBySalesmanGroupCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "salesman_group_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySalesmanGroupModifiNo() {
        return tStaffBySalesmanGroupModifiNo;
    }

    public void settStaffBySalesmanGroupModifiNo(TStaffEntity tStaffBySalesmanGroupModifiNo) {
        this.tStaffBySalesmanGroupModifiNo = tStaffBySalesmanGroupModifiNo;
    }
}
