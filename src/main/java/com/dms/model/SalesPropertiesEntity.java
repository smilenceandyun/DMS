package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "sales_properties", schema = "dbo", catalog = "logistics")
public class SalesPropertiesEntity {
    private String salesPropertiesSalesTypeNo;
    private String salesPropertiesSalesPropertiesName;
    private String salesPropertiesRemark;
    private String salesPropertiesGroupNodeId;
    private Timestamp salesPropertiesCreateDate;
    private String salesPropertiesCreateNo;
    private String salesPropertiesModifiNo;
    private Timestamp salesPropertiesModifiTime;
    private String salesPropertiesFlag;
    private Collection<BSConMEntity> bSConMSBySalesPropertiesSalesTypeNo;
    private Collection<BSOrderMEntity> bSOrderMSBySalesPropertiesSalesTypeNo;
    private TOrgEntity tOrgBySalesPropertiesGroupNodeId;
    private TStaffEntity tStaffBySalesPropertiesCreateNo;
    private TStaffEntity tStaffBySalesPropertiesModifiNo;

    @Id
    @Column(name = "sales_properties_sales_type_no", nullable = false, length = 6)
    public String getSalesPropertiesSalesTypeNo() {
        return salesPropertiesSalesTypeNo;
    }

    public void setSalesPropertiesSalesTypeNo(String salesPropertiesSalesTypeNo) {
        this.salesPropertiesSalesTypeNo = salesPropertiesSalesTypeNo;
    }

    @Basic
    @Column(name = "sales_properties_sales_properties_name", nullable = false, length = 50)
    public String getSalesPropertiesSalesPropertiesName() {
        return salesPropertiesSalesPropertiesName;
    }

    public void setSalesPropertiesSalesPropertiesName(String salesPropertiesSalesPropertiesName) {
        this.salesPropertiesSalesPropertiesName = salesPropertiesSalesPropertiesName;
    }

    @Basic
    @Column(name = "sales_properties_remark", nullable = true, length = 100)
    public String getSalesPropertiesRemark() {
        return salesPropertiesRemark;
    }

    public void setSalesPropertiesRemark(String salesPropertiesRemark) {
        this.salesPropertiesRemark = salesPropertiesRemark;
    }

    @Basic
    @Column(name = "sales_properties_group_node_id", nullable = true, length = 20)
    public String getSalesPropertiesGroupNodeId() {
        return salesPropertiesGroupNodeId;
    }

    public void setSalesPropertiesGroupNodeId(String salesPropertiesGroupNodeId) {
        this.salesPropertiesGroupNodeId = salesPropertiesGroupNodeId;
    }

    @Basic
    @Column(name = "sales_properties_create_date", nullable = true)
    public Timestamp getSalesPropertiesCreateDate() {
        return salesPropertiesCreateDate;
    }

    public void setSalesPropertiesCreateDate(Timestamp salesPropertiesCreateDate) {
        this.salesPropertiesCreateDate = salesPropertiesCreateDate;
    }

    @Basic
    @Column(name = "sales_properties_create_no", nullable = true, length = 8)
    public String getSalesPropertiesCreateNo() {
        return salesPropertiesCreateNo;
    }

    public void setSalesPropertiesCreateNo(String salesPropertiesCreateNo) {
        this.salesPropertiesCreateNo = salesPropertiesCreateNo;
    }

    @Basic
    @Column(name = "sales_properties_modifi_no", nullable = true, length = 8)
    public String getSalesPropertiesModifiNo() {
        return salesPropertiesModifiNo;
    }

    public void setSalesPropertiesModifiNo(String salesPropertiesModifiNo) {
        this.salesPropertiesModifiNo = salesPropertiesModifiNo;
    }

    @Basic
    @Column(name = "sales_properties_modifi_time", nullable = true)
    public Timestamp getSalesPropertiesModifiTime() {
        return salesPropertiesModifiTime;
    }

    public void setSalesPropertiesModifiTime(Timestamp salesPropertiesModifiTime) {
        this.salesPropertiesModifiTime = salesPropertiesModifiTime;
    }

    @Basic
    @Column(name = "sales_properties_flag", nullable = false, length = -1)
    public String getSalesPropertiesFlag() {
        return salesPropertiesFlag;
    }

    public void setSalesPropertiesFlag(String salesPropertiesFlag) {
        this.salesPropertiesFlag = salesPropertiesFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesPropertiesEntity that = (SalesPropertiesEntity) o;

        if (salesPropertiesSalesTypeNo != null ? !salesPropertiesSalesTypeNo.equals(that.salesPropertiesSalesTypeNo) : that.salesPropertiesSalesTypeNo != null)
            return false;
        if (salesPropertiesSalesPropertiesName != null ? !salesPropertiesSalesPropertiesName.equals(that.salesPropertiesSalesPropertiesName) : that.salesPropertiesSalesPropertiesName != null)
            return false;
        if (salesPropertiesRemark != null ? !salesPropertiesRemark.equals(that.salesPropertiesRemark) : that.salesPropertiesRemark != null)
            return false;
        if (salesPropertiesGroupNodeId != null ? !salesPropertiesGroupNodeId.equals(that.salesPropertiesGroupNodeId) : that.salesPropertiesGroupNodeId != null)
            return false;
        if (salesPropertiesCreateDate != null ? !salesPropertiesCreateDate.equals(that.salesPropertiesCreateDate) : that.salesPropertiesCreateDate != null)
            return false;
        if (salesPropertiesCreateNo != null ? !salesPropertiesCreateNo.equals(that.salesPropertiesCreateNo) : that.salesPropertiesCreateNo != null)
            return false;
        if (salesPropertiesModifiNo != null ? !salesPropertiesModifiNo.equals(that.salesPropertiesModifiNo) : that.salesPropertiesModifiNo != null)
            return false;
        if (salesPropertiesModifiTime != null ? !salesPropertiesModifiTime.equals(that.salesPropertiesModifiTime) : that.salesPropertiesModifiTime != null)
            return false;
        if (salesPropertiesFlag != null ? !salesPropertiesFlag.equals(that.salesPropertiesFlag) : that.salesPropertiesFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salesPropertiesSalesTypeNo != null ? salesPropertiesSalesTypeNo.hashCode() : 0;
        result = 31 * result + (salesPropertiesSalesPropertiesName != null ? salesPropertiesSalesPropertiesName.hashCode() : 0);
        result = 31 * result + (salesPropertiesRemark != null ? salesPropertiesRemark.hashCode() : 0);
        result = 31 * result + (salesPropertiesGroupNodeId != null ? salesPropertiesGroupNodeId.hashCode() : 0);
        result = 31 * result + (salesPropertiesCreateDate != null ? salesPropertiesCreateDate.hashCode() : 0);
        result = 31 * result + (salesPropertiesCreateNo != null ? salesPropertiesCreateNo.hashCode() : 0);
        result = 31 * result + (salesPropertiesModifiNo != null ? salesPropertiesModifiNo.hashCode() : 0);
        result = 31 * result + (salesPropertiesModifiTime != null ? salesPropertiesModifiTime.hashCode() : 0);
        result = 31 * result + (salesPropertiesFlag != null ? salesPropertiesFlag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "salesPropertiesByBSConMSalesTypeNo")
    public Collection<BSConMEntity> getbSConMSBySalesPropertiesSalesTypeNo() {
        return bSConMSBySalesPropertiesSalesTypeNo;
    }

    public void setbSConMSBySalesPropertiesSalesTypeNo(Collection<BSConMEntity> bSConMSBySalesPropertiesSalesTypeNo) {
        this.bSConMSBySalesPropertiesSalesTypeNo = bSConMSBySalesPropertiesSalesTypeNo;
    }

    @OneToMany(mappedBy = "salesPropertiesByBSOrderMSalesTypeNo")
    public Collection<BSOrderMEntity> getbSOrderMSBySalesPropertiesSalesTypeNo() {
        return bSOrderMSBySalesPropertiesSalesTypeNo;
    }

    public void setbSOrderMSBySalesPropertiesSalesTypeNo(Collection<BSOrderMEntity> bSOrderMSBySalesPropertiesSalesTypeNo) {
        this.bSOrderMSBySalesPropertiesSalesTypeNo = bSOrderMSBySalesPropertiesSalesTypeNo;
    }

    @ManyToOne
    @JoinColumn(name = "sales_properties_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgBySalesPropertiesGroupNodeId() {
        return tOrgBySalesPropertiesGroupNodeId;
    }

    public void settOrgBySalesPropertiesGroupNodeId(TOrgEntity tOrgBySalesPropertiesGroupNodeId) {
        this.tOrgBySalesPropertiesGroupNodeId = tOrgBySalesPropertiesGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "sales_properties_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySalesPropertiesCreateNo() {
        return tStaffBySalesPropertiesCreateNo;
    }

    public void settStaffBySalesPropertiesCreateNo(TStaffEntity tStaffBySalesPropertiesCreateNo) {
        this.tStaffBySalesPropertiesCreateNo = tStaffBySalesPropertiesCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "sales_properties_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySalesPropertiesModifiNo() {
        return tStaffBySalesPropertiesModifiNo;
    }

    public void settStaffBySalesPropertiesModifiNo(TStaffEntity tStaffBySalesPropertiesModifiNo) {
        this.tStaffBySalesPropertiesModifiNo = tStaffBySalesPropertiesModifiNo;
    }
}
