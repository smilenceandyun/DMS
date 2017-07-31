package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_goods_classify", schema = "dbo", catalog = "logistics")
public class TGoodsClassifyEntity {
    private String tGoodsClassifyGoodsClassifyNo;
    private String tGoodsClassifyParent;
    private String tGoodsClassifyGoodsClassifyName;
    private String tGoodsClassifyRemark;
    private Integer tGoodsClassifyLevel;
    private String tGoodsClassifyCreateNo;
    private Timestamp tGoodsClassifyCreateDate;
    private String tGoodsClassifyModifiNo;
    private Timestamp tGoodsClassifyModifiTime;
    private String tGoodsClassifyFlag;
    private String tGoodsClassifyGroupNodeId;
    private Collection<TGoodsEntity> tGoodsByTGoodsClassifyGoodsClassifyNo;
    private TGoodsClassifyEntity tGoodsClassifyByTGoodsClassifyParent;
    private Collection<TGoodsClassifyEntity> tGoodsClassifiesByTGoodsClassifyGoodsClassifyNo;
    private TStaffEntity tStaffByTGoodsClassifyCreateNo;
    private TStaffEntity tStaffByTGoodsClassifyModifiNo;
    private TOrgEntity tOrgByTGoodsClassifyGroupNodeId;

    @Id
    @Column(name = "t_goods_classify_goods_classify_no", nullable = false, length = 20)
    public String gettGoodsClassifyGoodsClassifyNo() {
        return tGoodsClassifyGoodsClassifyNo;
    }

    public void settGoodsClassifyGoodsClassifyNo(String tGoodsClassifyGoodsClassifyNo) {
        this.tGoodsClassifyGoodsClassifyNo = tGoodsClassifyGoodsClassifyNo;
    }

    @Basic
    @Column(name = "t_goods_classify_parent", nullable = true, length = 20)
    public String gettGoodsClassifyParent() {
        return tGoodsClassifyParent;
    }

    public void settGoodsClassifyParent(String tGoodsClassifyParent) {
        this.tGoodsClassifyParent = tGoodsClassifyParent;
    }

    @Basic
    @Column(name = "t_goods_classify_goods_classify_name", nullable = false, length = 50)
    public String gettGoodsClassifyGoodsClassifyName() {
        return tGoodsClassifyGoodsClassifyName;
    }

    public void settGoodsClassifyGoodsClassifyName(String tGoodsClassifyGoodsClassifyName) {
        this.tGoodsClassifyGoodsClassifyName = tGoodsClassifyGoodsClassifyName;
    }

    @Basic
    @Column(name = "t_goods_classify_remark", nullable = true, length = 100)
    public String gettGoodsClassifyRemark() {
        return tGoodsClassifyRemark;
    }

    public void settGoodsClassifyRemark(String tGoodsClassifyRemark) {
        this.tGoodsClassifyRemark = tGoodsClassifyRemark;
    }

    @Basic
    @Column(name = "t_goods_classify_level", nullable = true)
    public Integer gettGoodsClassifyLevel() {
        return tGoodsClassifyLevel;
    }

    public void settGoodsClassifyLevel(Integer tGoodsClassifyLevel) {
        this.tGoodsClassifyLevel = tGoodsClassifyLevel;
    }

    @Basic
    @Column(name = "t_goods_classify_create_no", nullable = true, length = 8)
    public String gettGoodsClassifyCreateNo() {
        return tGoodsClassifyCreateNo;
    }

    public void settGoodsClassifyCreateNo(String tGoodsClassifyCreateNo) {
        this.tGoodsClassifyCreateNo = tGoodsClassifyCreateNo;
    }

    @Basic
    @Column(name = "t_goods_classify_create_date", nullable = true)
    public Timestamp gettGoodsClassifyCreateDate() {
        return tGoodsClassifyCreateDate;
    }

    public void settGoodsClassifyCreateDate(Timestamp tGoodsClassifyCreateDate) {
        this.tGoodsClassifyCreateDate = tGoodsClassifyCreateDate;
    }

    @Basic
    @Column(name = "t_goods_classify_modifi_no", nullable = true, length = 8)
    public String gettGoodsClassifyModifiNo() {
        return tGoodsClassifyModifiNo;
    }

    public void settGoodsClassifyModifiNo(String tGoodsClassifyModifiNo) {
        this.tGoodsClassifyModifiNo = tGoodsClassifyModifiNo;
    }

    @Basic
    @Column(name = "t_goods_classify_modifi_time", nullable = true)
    public Timestamp gettGoodsClassifyModifiTime() {
        return tGoodsClassifyModifiTime;
    }

    public void settGoodsClassifyModifiTime(Timestamp tGoodsClassifyModifiTime) {
        this.tGoodsClassifyModifiTime = tGoodsClassifyModifiTime;
    }

    @Basic
    @Column(name = "t_goods_classify_flag", nullable = false, length = -1)
    public String gettGoodsClassifyFlag() {
        return tGoodsClassifyFlag;
    }

    public void settGoodsClassifyFlag(String tGoodsClassifyFlag) {
        this.tGoodsClassifyFlag = tGoodsClassifyFlag;
    }

    @Basic
    @Column(name = "t_goods_classify_group_node_id", nullable = true, length = 20)
    public String gettGoodsClassifyGroupNodeId() {
        return tGoodsClassifyGroupNodeId;
    }

    public void settGoodsClassifyGroupNodeId(String tGoodsClassifyGroupNodeId) {
        this.tGoodsClassifyGroupNodeId = tGoodsClassifyGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TGoodsClassifyEntity that = (TGoodsClassifyEntity) o;

        if (tGoodsClassifyGoodsClassifyNo != null ? !tGoodsClassifyGoodsClassifyNo.equals(that.tGoodsClassifyGoodsClassifyNo) : that.tGoodsClassifyGoodsClassifyNo != null)
            return false;
        if (tGoodsClassifyParent != null ? !tGoodsClassifyParent.equals(that.tGoodsClassifyParent) : that.tGoodsClassifyParent != null)
            return false;
        if (tGoodsClassifyGoodsClassifyName != null ? !tGoodsClassifyGoodsClassifyName.equals(that.tGoodsClassifyGoodsClassifyName) : that.tGoodsClassifyGoodsClassifyName != null)
            return false;
        if (tGoodsClassifyRemark != null ? !tGoodsClassifyRemark.equals(that.tGoodsClassifyRemark) : that.tGoodsClassifyRemark != null)
            return false;
        if (tGoodsClassifyLevel != null ? !tGoodsClassifyLevel.equals(that.tGoodsClassifyLevel) : that.tGoodsClassifyLevel != null)
            return false;
        if (tGoodsClassifyCreateNo != null ? !tGoodsClassifyCreateNo.equals(that.tGoodsClassifyCreateNo) : that.tGoodsClassifyCreateNo != null)
            return false;
        if (tGoodsClassifyCreateDate != null ? !tGoodsClassifyCreateDate.equals(that.tGoodsClassifyCreateDate) : that.tGoodsClassifyCreateDate != null)
            return false;
        if (tGoodsClassifyModifiNo != null ? !tGoodsClassifyModifiNo.equals(that.tGoodsClassifyModifiNo) : that.tGoodsClassifyModifiNo != null)
            return false;
        if (tGoodsClassifyModifiTime != null ? !tGoodsClassifyModifiTime.equals(that.tGoodsClassifyModifiTime) : that.tGoodsClassifyModifiTime != null)
            return false;
        if (tGoodsClassifyFlag != null ? !tGoodsClassifyFlag.equals(that.tGoodsClassifyFlag) : that.tGoodsClassifyFlag != null)
            return false;
        if (tGoodsClassifyGroupNodeId != null ? !tGoodsClassifyGroupNodeId.equals(that.tGoodsClassifyGroupNodeId) : that.tGoodsClassifyGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tGoodsClassifyGoodsClassifyNo != null ? tGoodsClassifyGoodsClassifyNo.hashCode() : 0;
        result = 31 * result + (tGoodsClassifyParent != null ? tGoodsClassifyParent.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyGoodsClassifyName != null ? tGoodsClassifyGoodsClassifyName.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyRemark != null ? tGoodsClassifyRemark.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyLevel != null ? tGoodsClassifyLevel.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyCreateNo != null ? tGoodsClassifyCreateNo.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyCreateDate != null ? tGoodsClassifyCreateDate.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyModifiNo != null ? tGoodsClassifyModifiNo.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyModifiTime != null ? tGoodsClassifyModifiTime.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyFlag != null ? tGoodsClassifyFlag.hashCode() : 0);
        result = 31 * result + (tGoodsClassifyGroupNodeId != null ? tGoodsClassifyGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tGoodsClassifyByTGoodsGoodsClassifyNo")
    public Collection<TGoodsEntity> gettGoodsByTGoodsClassifyGoodsClassifyNo() {
        return tGoodsByTGoodsClassifyGoodsClassifyNo;
    }

    public void settGoodsByTGoodsClassifyGoodsClassifyNo(Collection<TGoodsEntity> tGoodsByTGoodsClassifyGoodsClassifyNo) {
        this.tGoodsByTGoodsClassifyGoodsClassifyNo = tGoodsByTGoodsClassifyGoodsClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_classify_parent", referencedColumnName = "t_goods_classify_goods_classify_no",insertable = false, updatable = false)
    public TGoodsClassifyEntity gettGoodsClassifyByTGoodsClassifyParent() {
        return tGoodsClassifyByTGoodsClassifyParent;
    }

    public void settGoodsClassifyByTGoodsClassifyParent(TGoodsClassifyEntity tGoodsClassifyByTGoodsClassifyParent) {
        this.tGoodsClassifyByTGoodsClassifyParent = tGoodsClassifyByTGoodsClassifyParent;
    }

    @OneToMany(mappedBy = "tGoodsClassifyByTGoodsClassifyParent")
    public Collection<TGoodsClassifyEntity> gettGoodsClassifiesByTGoodsClassifyGoodsClassifyNo() {
        return tGoodsClassifiesByTGoodsClassifyGoodsClassifyNo;
    }

    public void settGoodsClassifiesByTGoodsClassifyGoodsClassifyNo(Collection<TGoodsClassifyEntity> tGoodsClassifiesByTGoodsClassifyGoodsClassifyNo) {
        this.tGoodsClassifiesByTGoodsClassifyGoodsClassifyNo = tGoodsClassifiesByTGoodsClassifyGoodsClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_classify_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTGoodsClassifyCreateNo() {
        return tStaffByTGoodsClassifyCreateNo;
    }

    public void settStaffByTGoodsClassifyCreateNo(TStaffEntity tStaffByTGoodsClassifyCreateNo) {
        this.tStaffByTGoodsClassifyCreateNo = tStaffByTGoodsClassifyCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_classify_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTGoodsClassifyModifiNo() {
        return tStaffByTGoodsClassifyModifiNo;
    }

    public void settStaffByTGoodsClassifyModifiNo(TStaffEntity tStaffByTGoodsClassifyModifiNo) {
        this.tStaffByTGoodsClassifyModifiNo = tStaffByTGoodsClassifyModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_classify_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByTGoodsClassifyGroupNodeId() {
        return tOrgByTGoodsClassifyGroupNodeId;
    }

    public void settOrgByTGoodsClassifyGroupNodeId(TOrgEntity tOrgByTGoodsClassifyGroupNodeId) {
        this.tOrgByTGoodsClassifyGroupNodeId = tOrgByTGoodsClassifyGroupNodeId;
    }
}
