package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_brand", schema = "dbo", catalog = "logistics_test")
public class TBrandEntity {
    private String tBrandBrandNo;
    private String tBrandGroupNodeId;
    private String tBrandBrandName;
    private String tBrandRemark;
    private Timestamp tBrandCreateDate;
    private String tBrandCreateNo;
    private String tBrandModifiNo;
    private Timestamp tBrandModifiTime;
    private String tBrandFlag;
    private TOrgEntity tOrgByTBrandGroupNodeId;
    private TStaffEntity tStaffByTBrandCreateNo;
    private TStaffEntity tStaffByTBrandModifiNo;
    private Collection<TGoodsEntity> tGoodsByTBrandBrandNo;

    @Id
    @Column(name = "t_brand_brand_no", nullable = false, length = 3)
    public String gettBrandBrandNo() {
        return tBrandBrandNo;
    }

    public void settBrandBrandNo(String tBrandBrandNo) {
        this.tBrandBrandNo = tBrandBrandNo;
    }

    @Basic
    @Column(name = "t_brand_group_node_id", nullable = true, length = 20)
    public String gettBrandGroupNodeId() {
        return tBrandGroupNodeId;
    }

    public void settBrandGroupNodeId(String tBrandGroupNodeId) {
        this.tBrandGroupNodeId = tBrandGroupNodeId;
    }

    @Basic
    @Column(name = "t_brand_brand_name", nullable = false, length = 50)
    public String gettBrandBrandName() {
        return tBrandBrandName;
    }

    public void settBrandBrandName(String tBrandBrandName) {
        this.tBrandBrandName = tBrandBrandName;
    }

    @Basic
    @Column(name = "t_brand_remark", nullable = true, length = 100)
    public String gettBrandRemark() {
        return tBrandRemark;
    }

    public void settBrandRemark(String tBrandRemark) {
        this.tBrandRemark = tBrandRemark;
    }

    @Basic
    @Column(name = "t_brand_create_date", nullable = true)
    public Timestamp gettBrandCreateDate() {
        return tBrandCreateDate;
    }

    public void settBrandCreateDate(Timestamp tBrandCreateDate) {
        this.tBrandCreateDate = tBrandCreateDate;
    }

    @Basic
    @Column(name = "t_brand_create_no", nullable = true, length = 8)
    public String gettBrandCreateNo() {
        return tBrandCreateNo;
    }

    public void settBrandCreateNo(String tBrandCreateNo) {
        this.tBrandCreateNo = tBrandCreateNo;
    }

    @Basic
    @Column(name = "t_brand_modifi_no", nullable = true, length = 8)
    public String gettBrandModifiNo() {
        return tBrandModifiNo;
    }

    public void settBrandModifiNo(String tBrandModifiNo) {
        this.tBrandModifiNo = tBrandModifiNo;
    }

    @Basic
    @Column(name = "t_brand_modifi_time", nullable = true)
    public Timestamp gettBrandModifiTime() {
        return tBrandModifiTime;
    }

    public void settBrandModifiTime(Timestamp tBrandModifiTime) {
        this.tBrandModifiTime = tBrandModifiTime;
    }

    @Basic
    @Column(name = "t_brand_flag", nullable = false, length = 1)
    public String gettBrandFlag() {
        return tBrandFlag;
    }

    public void settBrandFlag(String tBrandFlag) {
        this.tBrandFlag = tBrandFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBrandEntity that = (TBrandEntity) o;

        if (tBrandBrandNo != null ? !tBrandBrandNo.equals(that.tBrandBrandNo) : that.tBrandBrandNo != null)
            return false;
        if (tBrandGroupNodeId != null ? !tBrandGroupNodeId.equals(that.tBrandGroupNodeId) : that.tBrandGroupNodeId != null)
            return false;
        if (tBrandBrandName != null ? !tBrandBrandName.equals(that.tBrandBrandName) : that.tBrandBrandName != null)
            return false;
        if (tBrandRemark != null ? !tBrandRemark.equals(that.tBrandRemark) : that.tBrandRemark != null) return false;
        if (tBrandCreateDate != null ? !tBrandCreateDate.equals(that.tBrandCreateDate) : that.tBrandCreateDate != null)
            return false;
        if (tBrandCreateNo != null ? !tBrandCreateNo.equals(that.tBrandCreateNo) : that.tBrandCreateNo != null)
            return false;
        if (tBrandModifiNo != null ? !tBrandModifiNo.equals(that.tBrandModifiNo) : that.tBrandModifiNo != null)
            return false;
        if (tBrandModifiTime != null ? !tBrandModifiTime.equals(that.tBrandModifiTime) : that.tBrandModifiTime != null)
            return false;
        if (tBrandFlag != null ? !tBrandFlag.equals(that.tBrandFlag) : that.tBrandFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tBrandBrandNo != null ? tBrandBrandNo.hashCode() : 0;
        result = 31 * result + (tBrandGroupNodeId != null ? tBrandGroupNodeId.hashCode() : 0);
        result = 31 * result + (tBrandBrandName != null ? tBrandBrandName.hashCode() : 0);
        result = 31 * result + (tBrandRemark != null ? tBrandRemark.hashCode() : 0);
        result = 31 * result + (tBrandCreateDate != null ? tBrandCreateDate.hashCode() : 0);
        result = 31 * result + (tBrandCreateNo != null ? tBrandCreateNo.hashCode() : 0);
        result = 31 * result + (tBrandModifiNo != null ? tBrandModifiNo.hashCode() : 0);
        result = 31 * result + (tBrandModifiTime != null ? tBrandModifiTime.hashCode() : 0);
        result = 31 * result + (tBrandFlag != null ? tBrandFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "t_brand_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTBrandGroupNodeId() {
        return tOrgByTBrandGroupNodeId;
    }

    public void settOrgByTBrandGroupNodeId(TOrgEntity tOrgByTBrandGroupNodeId) {
        this.tOrgByTBrandGroupNodeId = tOrgByTBrandGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_brand_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTBrandCreateNo() {
        return tStaffByTBrandCreateNo;
    }

    public void settStaffByTBrandCreateNo(TStaffEntity tStaffByTBrandCreateNo) {
        this.tStaffByTBrandCreateNo = tStaffByTBrandCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_brand_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTBrandModifiNo() {
        return tStaffByTBrandModifiNo;
    }

    public void settStaffByTBrandModifiNo(TStaffEntity tStaffByTBrandModifiNo) {
        this.tStaffByTBrandModifiNo = tStaffByTBrandModifiNo;
    }

    @OneToMany(mappedBy = "tBrandByTGoodsBrandNo")
    public Collection<TGoodsEntity> gettGoodsByTBrandBrandNo() {
        return tGoodsByTBrandBrandNo;
    }

    public void settGoodsByTBrandBrandNo(Collection<TGoodsEntity> tGoodsByTBrandBrandNo) {
        this.tGoodsByTBrandBrandNo = tGoodsByTBrandBrandNo;
    }
}
