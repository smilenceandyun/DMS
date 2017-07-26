package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_position", schema = "dbo", catalog = "logistics_test")
public class TPositionEntity {
    private String tPositionPotitionNo;
    private String tPositionGroupNodeId;
    private String tPositionPotitionName;
    private String tPositionRemark;
    private String tPositionCreateNo;
    private Timestamp tPositionCreateDate;
    private String tPositionModifiNo;
    private Timestamp tPositionModifiTime;
    private String tPositionFlag;
    private TOrgEntity tOrgByTPositionGroupNodeId;
    private TStaffEntity tStaffByTPositionCreateNo;
    private TStaffEntity tStaffByTPositionModifiNo;
    private Collection<TStaffEntity> tStaffsByTPositionPotitionNo;

    @Id
    @Column(name = "t_position_potition_no", nullable = false, length = 4)
    public String gettPositionPotitionNo() {
        return tPositionPotitionNo;
    }

    public void settPositionPotitionNo(String tPositionPotitionNo) {
        this.tPositionPotitionNo = tPositionPotitionNo;
    }

    @Basic
    @Column(name = "t_position_group_node_id", nullable = true, length = 20)
    public String gettPositionGroupNodeId() {
        return tPositionGroupNodeId;
    }

    public void settPositionGroupNodeId(String tPositionGroupNodeId) {
        this.tPositionGroupNodeId = tPositionGroupNodeId;
    }

    @Basic
    @Column(name = "t_position_potition_name", nullable = false, length = 50)
    public String gettPositionPotitionName() {
        return tPositionPotitionName;
    }

    public void settPositionPotitionName(String tPositionPotitionName) {
        this.tPositionPotitionName = tPositionPotitionName;
    }

    @Basic
    @Column(name = "t_position_remark", nullable = true, length = 100)
    public String gettPositionRemark() {
        return tPositionRemark;
    }

    public void settPositionRemark(String tPositionRemark) {
        this.tPositionRemark = tPositionRemark;
    }

    @Basic
    @Column(name = "t_position_create_no", nullable = true, length = 8)
    public String gettPositionCreateNo() {
        return tPositionCreateNo;
    }

    public void settPositionCreateNo(String tPositionCreateNo) {
        this.tPositionCreateNo = tPositionCreateNo;
    }

    @Basic
    @Column(name = "t_position_create_date", nullable = true)
    public Timestamp gettPositionCreateDate() {
        return tPositionCreateDate;
    }

    public void settPositionCreateDate(Timestamp tPositionCreateDate) {
        this.tPositionCreateDate = tPositionCreateDate;
    }

    @Basic
    @Column(name = "t_position_modifi_no", nullable = true, length = 8)
    public String gettPositionModifiNo() {
        return tPositionModifiNo;
    }

    public void settPositionModifiNo(String tPositionModifiNo) {
        this.tPositionModifiNo = tPositionModifiNo;
    }

    @Basic
    @Column(name = "t_position_modifi_time", nullable = true)
    public Timestamp gettPositionModifiTime() {
        return tPositionModifiTime;
    }

    public void settPositionModifiTime(Timestamp tPositionModifiTime) {
        this.tPositionModifiTime = tPositionModifiTime;
    }

    @Basic
    @Column(name = "t_position_flag", nullable = true, length = 1)
    public String gettPositionFlag() {
        return tPositionFlag;
    }

    public void settPositionFlag(String tPositionFlag) {
        this.tPositionFlag = tPositionFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPositionEntity that = (TPositionEntity) o;

        if (tPositionPotitionNo != null ? !tPositionPotitionNo.equals(that.tPositionPotitionNo) : that.tPositionPotitionNo != null)
            return false;
        if (tPositionGroupNodeId != null ? !tPositionGroupNodeId.equals(that.tPositionGroupNodeId) : that.tPositionGroupNodeId != null)
            return false;
        if (tPositionPotitionName != null ? !tPositionPotitionName.equals(that.tPositionPotitionName) : that.tPositionPotitionName != null)
            return false;
        if (tPositionRemark != null ? !tPositionRemark.equals(that.tPositionRemark) : that.tPositionRemark != null)
            return false;
        if (tPositionCreateNo != null ? !tPositionCreateNo.equals(that.tPositionCreateNo) : that.tPositionCreateNo != null)
            return false;
        if (tPositionCreateDate != null ? !tPositionCreateDate.equals(that.tPositionCreateDate) : that.tPositionCreateDate != null)
            return false;
        if (tPositionModifiNo != null ? !tPositionModifiNo.equals(that.tPositionModifiNo) : that.tPositionModifiNo != null)
            return false;
        if (tPositionModifiTime != null ? !tPositionModifiTime.equals(that.tPositionModifiTime) : that.tPositionModifiTime != null)
            return false;
        if (tPositionFlag != null ? !tPositionFlag.equals(that.tPositionFlag) : that.tPositionFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tPositionPotitionNo != null ? tPositionPotitionNo.hashCode() : 0;
        result = 31 * result + (tPositionGroupNodeId != null ? tPositionGroupNodeId.hashCode() : 0);
        result = 31 * result + (tPositionPotitionName != null ? tPositionPotitionName.hashCode() : 0);
        result = 31 * result + (tPositionRemark != null ? tPositionRemark.hashCode() : 0);
        result = 31 * result + (tPositionCreateNo != null ? tPositionCreateNo.hashCode() : 0);
        result = 31 * result + (tPositionCreateDate != null ? tPositionCreateDate.hashCode() : 0);
        result = 31 * result + (tPositionModifiNo != null ? tPositionModifiNo.hashCode() : 0);
        result = 31 * result + (tPositionModifiTime != null ? tPositionModifiTime.hashCode() : 0);
        result = 31 * result + (tPositionFlag != null ? tPositionFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "t_position_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTPositionGroupNodeId() {
        return tOrgByTPositionGroupNodeId;
    }

    public void settOrgByTPositionGroupNodeId(TOrgEntity tOrgByTPositionGroupNodeId) {
        this.tOrgByTPositionGroupNodeId = tOrgByTPositionGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_position_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPositionCreateNo() {
        return tStaffByTPositionCreateNo;
    }

    public void settStaffByTPositionCreateNo(TStaffEntity tStaffByTPositionCreateNo) {
        this.tStaffByTPositionCreateNo = tStaffByTPositionCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_position_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTPositionModifiNo() {
        return tStaffByTPositionModifiNo;
    }

    public void settStaffByTPositionModifiNo(TStaffEntity tStaffByTPositionModifiNo) {
        this.tStaffByTPositionModifiNo = tStaffByTPositionModifiNo;
    }

    @OneToMany(mappedBy = "tPositionByTStaffPotitionNo")
    public Collection<TStaffEntity> gettStaffsByTPositionPotitionNo() {
        return tStaffsByTPositionPotitionNo;
    }

    public void settStaffsByTPositionPotitionNo(Collection<TStaffEntity> tStaffsByTPositionPotitionNo) {
        this.tStaffsByTPositionPotitionNo = tStaffsByTPositionPotitionNo;
    }
}
