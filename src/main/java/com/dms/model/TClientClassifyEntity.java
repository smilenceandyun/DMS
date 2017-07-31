package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_client_classify", schema = "dbo", catalog = "logistics")
public class TClientClassifyEntity {
    private String tClientClassifyClientClassifyNo;
    private String tClientClassifyClientClassifyName;
    private int tClientClassifyPriceControlTag;
    private String tClientClassifyRemark;
    private String tClientClassifyGroupNodeId;
    private String tClientClassifyParentId;
    private int tClientClassifyClientLevel;
    private String tClientClassifyCreateNo;
    private Timestamp tClientClassifyCreateDate;
    private String tClientClassifyModifiNo;
    private Timestamp tClientClassifyModifiTime;
    private String tClientClassifyFlag;
    private Collection<TClientEntity> tClientsByTClientClassifyClientClassifyNo;
    private TOrgEntity tOrgByTClientClassifyGroupNodeId;
    private TClientClassifyEntity tClientClassifyByTClientClassifyParentId;
    private Collection<TClientClassifyEntity> tClientClassifiesByTClientClassifyClientClassifyNo;
    private TStaffEntity tStaffByTClientClassifyCreateNo;
    private TStaffEntity tStaffByTClientClassifyModifiNo;

    @Id
    @Column(name = "t_client_classify_client_classify_no", nullable = false, length = 20)
    public String gettClientClassifyClientClassifyNo() {
        return tClientClassifyClientClassifyNo;
    }

    public void settClientClassifyClientClassifyNo(String tClientClassifyClientClassifyNo) {
        this.tClientClassifyClientClassifyNo = tClientClassifyClientClassifyNo;
    }

    @Basic
    @Column(name = "t_client_classify_client_classify_name", nullable = false, length = 100)
    public String gettClientClassifyClientClassifyName() {
        return tClientClassifyClientClassifyName;
    }

    public void settClientClassifyClientClassifyName(String tClientClassifyClientClassifyName) {
        this.tClientClassifyClientClassifyName = tClientClassifyClientClassifyName;
    }

    @Basic
    @Column(name = "t_client_classify_price_control_tag", nullable = false)
    public int gettClientClassifyPriceControlTag() {
        return tClientClassifyPriceControlTag;
    }

    public void settClientClassifyPriceControlTag(int tClientClassifyPriceControlTag) {
        this.tClientClassifyPriceControlTag = tClientClassifyPriceControlTag;
    }

    @Basic
    @Column(name = "t_client_classify_remark", nullable = true, length = 100)
    public String gettClientClassifyRemark() {
        return tClientClassifyRemark;
    }

    public void settClientClassifyRemark(String tClientClassifyRemark) {
        this.tClientClassifyRemark = tClientClassifyRemark;
    }

    @Basic
    @Column(name = "t_client_classify_group_node_id", nullable = true, length = 20)
    public String gettClientClassifyGroupNodeId() {
        return tClientClassifyGroupNodeId;
    }

    public void settClientClassifyGroupNodeId(String tClientClassifyGroupNodeId) {
        this.tClientClassifyGroupNodeId = tClientClassifyGroupNodeId;
    }

    @Basic
    @Column(name = "t_client_classify_parent_id", nullable = true, length = 20)
    public String gettClientClassifyParentId() {
        return tClientClassifyParentId;
    }

    public void settClientClassifyParentId(String tClientClassifyParentId) {
        this.tClientClassifyParentId = tClientClassifyParentId;
    }

    @Basic
    @Column(name = "t_client_classify_client_level", nullable = false)
    public int gettClientClassifyClientLevel() {
        return tClientClassifyClientLevel;
    }

    public void settClientClassifyClientLevel(int tClientClassifyClientLevel) {
        this.tClientClassifyClientLevel = tClientClassifyClientLevel;
    }

    @Basic
    @Column(name = "t_client_classify_create_no", nullable = true, length = 8)
    public String gettClientClassifyCreateNo() {
        return tClientClassifyCreateNo;
    }

    public void settClientClassifyCreateNo(String tClientClassifyCreateNo) {
        this.tClientClassifyCreateNo = tClientClassifyCreateNo;
    }

    @Basic
    @Column(name = "t_client_classify_create_date", nullable = true)
    public Timestamp gettClientClassifyCreateDate() {
        return tClientClassifyCreateDate;
    }

    public void settClientClassifyCreateDate(Timestamp tClientClassifyCreateDate) {
        this.tClientClassifyCreateDate = tClientClassifyCreateDate;
    }

    @Basic
    @Column(name = "t_client_classify_modifi_no", nullable = true, length = 8)
    public String gettClientClassifyModifiNo() {
        return tClientClassifyModifiNo;
    }

    public void settClientClassifyModifiNo(String tClientClassifyModifiNo) {
        this.tClientClassifyModifiNo = tClientClassifyModifiNo;
    }

    @Basic
    @Column(name = "t_client_classify_modifi_time", nullable = true)
    public Timestamp gettClientClassifyModifiTime() {
        return tClientClassifyModifiTime;
    }

    public void settClientClassifyModifiTime(Timestamp tClientClassifyModifiTime) {
        this.tClientClassifyModifiTime = tClientClassifyModifiTime;
    }

    @Basic
    @Column(name = "t_client_classify_flag", nullable = false, length = -1)
    public String gettClientClassifyFlag() {
        return tClientClassifyFlag;
    }

    public void settClientClassifyFlag(String tClientClassifyFlag) {
        this.tClientClassifyFlag = tClientClassifyFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TClientClassifyEntity that = (TClientClassifyEntity) o;

        if (tClientClassifyPriceControlTag != that.tClientClassifyPriceControlTag) return false;
        if (tClientClassifyClientLevel != that.tClientClassifyClientLevel) return false;
        if (tClientClassifyClientClassifyNo != null ? !tClientClassifyClientClassifyNo.equals(that.tClientClassifyClientClassifyNo) : that.tClientClassifyClientClassifyNo != null)
            return false;
        if (tClientClassifyClientClassifyName != null ? !tClientClassifyClientClassifyName.equals(that.tClientClassifyClientClassifyName) : that.tClientClassifyClientClassifyName != null)
            return false;
        if (tClientClassifyRemark != null ? !tClientClassifyRemark.equals(that.tClientClassifyRemark) : that.tClientClassifyRemark != null)
            return false;
        if (tClientClassifyGroupNodeId != null ? !tClientClassifyGroupNodeId.equals(that.tClientClassifyGroupNodeId) : that.tClientClassifyGroupNodeId != null)
            return false;
        if (tClientClassifyParentId != null ? !tClientClassifyParentId.equals(that.tClientClassifyParentId) : that.tClientClassifyParentId != null)
            return false;
        if (tClientClassifyCreateNo != null ? !tClientClassifyCreateNo.equals(that.tClientClassifyCreateNo) : that.tClientClassifyCreateNo != null)
            return false;
        if (tClientClassifyCreateDate != null ? !tClientClassifyCreateDate.equals(that.tClientClassifyCreateDate) : that.tClientClassifyCreateDate != null)
            return false;
        if (tClientClassifyModifiNo != null ? !tClientClassifyModifiNo.equals(that.tClientClassifyModifiNo) : that.tClientClassifyModifiNo != null)
            return false;
        if (tClientClassifyModifiTime != null ? !tClientClassifyModifiTime.equals(that.tClientClassifyModifiTime) : that.tClientClassifyModifiTime != null)
            return false;
        if (tClientClassifyFlag != null ? !tClientClassifyFlag.equals(that.tClientClassifyFlag) : that.tClientClassifyFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tClientClassifyClientClassifyNo != null ? tClientClassifyClientClassifyNo.hashCode() : 0;
        result = 31 * result + (tClientClassifyClientClassifyName != null ? tClientClassifyClientClassifyName.hashCode() : 0);
        result = 31 * result + tClientClassifyPriceControlTag;
        result = 31 * result + (tClientClassifyRemark != null ? tClientClassifyRemark.hashCode() : 0);
        result = 31 * result + (tClientClassifyGroupNodeId != null ? tClientClassifyGroupNodeId.hashCode() : 0);
        result = 31 * result + (tClientClassifyParentId != null ? tClientClassifyParentId.hashCode() : 0);
        result = 31 * result + tClientClassifyClientLevel;
        result = 31 * result + (tClientClassifyCreateNo != null ? tClientClassifyCreateNo.hashCode() : 0);
        result = 31 * result + (tClientClassifyCreateDate != null ? tClientClassifyCreateDate.hashCode() : 0);
        result = 31 * result + (tClientClassifyModifiNo != null ? tClientClassifyModifiNo.hashCode() : 0);
        result = 31 * result + (tClientClassifyModifiTime != null ? tClientClassifyModifiTime.hashCode() : 0);
        result = 31 * result + (tClientClassifyFlag != null ? tClientClassifyFlag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tClientClassifyByTClientClientClassifyNo")
    public Collection<TClientEntity> gettClientsByTClientClassifyClientClassifyNo() {
        return tClientsByTClientClassifyClientClassifyNo;
    }

    public void settClientsByTClientClassifyClientClassifyNo(Collection<TClientEntity> tClientsByTClientClassifyClientClassifyNo) {
        this.tClientsByTClientClassifyClientClassifyNo = tClientsByTClientClassifyClientClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_classify_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByTClientClassifyGroupNodeId() {
        return tOrgByTClientClassifyGroupNodeId;
    }

    public void settOrgByTClientClassifyGroupNodeId(TOrgEntity tOrgByTClientClassifyGroupNodeId) {
        this.tOrgByTClientClassifyGroupNodeId = tOrgByTClientClassifyGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_classify_parent_id", referencedColumnName = "t_client_classify_client_classify_no",insertable = false, updatable = false)
    public TClientClassifyEntity gettClientClassifyByTClientClassifyParentId() {
        return tClientClassifyByTClientClassifyParentId;
    }

    public void settClientClassifyByTClientClassifyParentId(TClientClassifyEntity tClientClassifyByTClientClassifyParentId) {
        this.tClientClassifyByTClientClassifyParentId = tClientClassifyByTClientClassifyParentId;
    }

    @OneToMany(mappedBy = "tClientClassifyByTClientClassifyParentId")
    public Collection<TClientClassifyEntity> gettClientClassifiesByTClientClassifyClientClassifyNo() {
        return tClientClassifiesByTClientClassifyClientClassifyNo;
    }

    public void settClientClassifiesByTClientClassifyClientClassifyNo(Collection<TClientClassifyEntity> tClientClassifiesByTClientClassifyClientClassifyNo) {
        this.tClientClassifiesByTClientClassifyClientClassifyNo = tClientClassifiesByTClientClassifyClientClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_classify_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTClientClassifyCreateNo() {
        return tStaffByTClientClassifyCreateNo;
    }

    public void settStaffByTClientClassifyCreateNo(TStaffEntity tStaffByTClientClassifyCreateNo) {
        this.tStaffByTClientClassifyCreateNo = tStaffByTClientClassifyCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_classify_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTClientClassifyModifiNo() {
        return tStaffByTClientClassifyModifiNo;
    }

    public void settStaffByTClientClassifyModifiNo(TStaffEntity tStaffByTClientClassifyModifiNo) {
        this.tStaffByTClientClassifyModifiNo = tStaffByTClientClassifyModifiNo;
    }
}
