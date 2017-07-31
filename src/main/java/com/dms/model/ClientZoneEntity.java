package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "client_zone", schema = "dbo", catalog = "logistics")
public class ClientZoneEntity {
    private String clientZoneClientZoneNo;
    private String clientZoneClientZoneName;
    private String clientZoneGroupNodeId;
    private String clientZoneRemark;
    private String clientZoneCreateNo;
    private Timestamp clientZoneCreateDate;
    private String clientZoneModifiNo;
    private Timestamp clientZoneModifiTime;
    private String clientZoneFlag;
    private TOrgEntity tOrgByClientZoneGroupNodeId;
    private TStaffEntity tStaffByClientZoneCreateNo;
    private TStaffEntity tStaffByClientZoneModifiNo;
    private Collection<TClientEntity> tClientsByClientZoneClientZoneNo;

    @Id
    @Column(name = "client_zone_client_zone_no", nullable = false, length = 4)
    public String getClientZoneClientZoneNo() {
        return clientZoneClientZoneNo;
    }

    public void setClientZoneClientZoneNo(String clientZoneClientZoneNo) {
        this.clientZoneClientZoneNo = clientZoneClientZoneNo;
    }

    @Basic
    @Column(name = "client_zone_client_zone_name", nullable = false, length = 50)
    public String getClientZoneClientZoneName() {
        return clientZoneClientZoneName;
    }

    public void setClientZoneClientZoneName(String clientZoneClientZoneName) {
        this.clientZoneClientZoneName = clientZoneClientZoneName;
    }

    @Basic
    @Column(name = "client_zone_group_node_id", nullable = true, length = 20)
    public String getClientZoneGroupNodeId() {
        return clientZoneGroupNodeId;
    }

    public void setClientZoneGroupNodeId(String clientZoneGroupNodeId) {
        this.clientZoneGroupNodeId = clientZoneGroupNodeId;
    }

    @Basic
    @Column(name = "client_zone_remark", nullable = true, length = 100)
    public String getClientZoneRemark() {
        return clientZoneRemark;
    }

    public void setClientZoneRemark(String clientZoneRemark) {
        this.clientZoneRemark = clientZoneRemark;
    }

    @Basic
    @Column(name = "client_zone_create_no", nullable = true, length = 8)
    public String getClientZoneCreateNo() {
        return clientZoneCreateNo;
    }

    public void setClientZoneCreateNo(String clientZoneCreateNo) {
        this.clientZoneCreateNo = clientZoneCreateNo;
    }

    @Basic
    @Column(name = "client_zone_create_date", nullable = true)
    public Timestamp getClientZoneCreateDate() {
        return clientZoneCreateDate;
    }

    public void setClientZoneCreateDate(Timestamp clientZoneCreateDate) {
        this.clientZoneCreateDate = clientZoneCreateDate;
    }

    @Basic
    @Column(name = "client_zone_modifi_no", nullable = true, length = 8)
    public String getClientZoneModifiNo() {
        return clientZoneModifiNo;
    }

    public void setClientZoneModifiNo(String clientZoneModifiNo) {
        this.clientZoneModifiNo = clientZoneModifiNo;
    }

    @Basic
    @Column(name = "client_zone_modifi_time", nullable = true)
    public Timestamp getClientZoneModifiTime() {
        return clientZoneModifiTime;
    }

    public void setClientZoneModifiTime(Timestamp clientZoneModifiTime) {
        this.clientZoneModifiTime = clientZoneModifiTime;
    }

    @Basic
    @Column(name = "client_zone_flag", nullable = false, length = -1)
    public String getClientZoneFlag() {
        return clientZoneFlag;
    }

    public void setClientZoneFlag(String clientZoneFlag) {
        this.clientZoneFlag = clientZoneFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientZoneEntity that = (ClientZoneEntity) o;

        if (clientZoneClientZoneNo != null ? !clientZoneClientZoneNo.equals(that.clientZoneClientZoneNo) : that.clientZoneClientZoneNo != null)
            return false;
        if (clientZoneClientZoneName != null ? !clientZoneClientZoneName.equals(that.clientZoneClientZoneName) : that.clientZoneClientZoneName != null)
            return false;
        if (clientZoneGroupNodeId != null ? !clientZoneGroupNodeId.equals(that.clientZoneGroupNodeId) : that.clientZoneGroupNodeId != null)
            return false;
        if (clientZoneRemark != null ? !clientZoneRemark.equals(that.clientZoneRemark) : that.clientZoneRemark != null)
            return false;
        if (clientZoneCreateNo != null ? !clientZoneCreateNo.equals(that.clientZoneCreateNo) : that.clientZoneCreateNo != null)
            return false;
        if (clientZoneCreateDate != null ? !clientZoneCreateDate.equals(that.clientZoneCreateDate) : that.clientZoneCreateDate != null)
            return false;
        if (clientZoneModifiNo != null ? !clientZoneModifiNo.equals(that.clientZoneModifiNo) : that.clientZoneModifiNo != null)
            return false;
        if (clientZoneModifiTime != null ? !clientZoneModifiTime.equals(that.clientZoneModifiTime) : that.clientZoneModifiTime != null)
            return false;
        if (clientZoneFlag != null ? !clientZoneFlag.equals(that.clientZoneFlag) : that.clientZoneFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientZoneClientZoneNo != null ? clientZoneClientZoneNo.hashCode() : 0;
        result = 31 * result + (clientZoneClientZoneName != null ? clientZoneClientZoneName.hashCode() : 0);
        result = 31 * result + (clientZoneGroupNodeId != null ? clientZoneGroupNodeId.hashCode() : 0);
        result = 31 * result + (clientZoneRemark != null ? clientZoneRemark.hashCode() : 0);
        result = 31 * result + (clientZoneCreateNo != null ? clientZoneCreateNo.hashCode() : 0);
        result = 31 * result + (clientZoneCreateDate != null ? clientZoneCreateDate.hashCode() : 0);
        result = 31 * result + (clientZoneModifiNo != null ? clientZoneModifiNo.hashCode() : 0);
        result = 31 * result + (clientZoneModifiTime != null ? clientZoneModifiTime.hashCode() : 0);
        result = 31 * result + (clientZoneFlag != null ? clientZoneFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "client_zone_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByClientZoneGroupNodeId() {
        return tOrgByClientZoneGroupNodeId;
    }

    public void settOrgByClientZoneGroupNodeId(TOrgEntity tOrgByClientZoneGroupNodeId) {
        this.tOrgByClientZoneGroupNodeId = tOrgByClientZoneGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "client_zone_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByClientZoneCreateNo() {
        return tStaffByClientZoneCreateNo;
    }

    public void settStaffByClientZoneCreateNo(TStaffEntity tStaffByClientZoneCreateNo) {
        this.tStaffByClientZoneCreateNo = tStaffByClientZoneCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "client_zone_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByClientZoneModifiNo() {
        return tStaffByClientZoneModifiNo;
    }

    public void settStaffByClientZoneModifiNo(TStaffEntity tStaffByClientZoneModifiNo) {
        this.tStaffByClientZoneModifiNo = tStaffByClientZoneModifiNo;
    }

    @OneToMany(mappedBy = "clientZoneByTClientClientZoneNo")
    public Collection<TClientEntity> gettClientsByClientZoneClientZoneNo() {
        return tClientsByClientZoneClientZoneNo;
    }

    public void settClientsByClientZoneClientZoneNo(Collection<TClientEntity> tClientsByClientZoneClientZoneNo) {
        this.tClientsByClientZoneClientZoneNo = tClientsByClientZoneClientZoneNo;
    }
}
