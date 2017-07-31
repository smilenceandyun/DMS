package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_sales_promotion", schema = "dbo", catalog = "logistics")
public class TSalesPromotionEntity {
    private String tSalesPromotionSalesPromotionNo;
    private String tSalesPromotionSalesPromotionName;
    private String tSalesPromotionPromotionPropertyNo;
    private int tSalesPromotionQty;
    private int tSalesPromotionZQty;
    private String tSalesPromotionRemark;
    private String tSalesPromotionGroupNodeId;
    private Timestamp tSalesPromotionCreateDate;
    private String tSalesPromotionCreateNo;
    private String tSalesPromotionModifiNo;
    private Timestamp tSalesPromotionModifiTime;
    private String tSalesPromotionFlag;
    private Collection<PromotionMProductSEntity> promotionMProductSByTSalesPromotionSalesPromotionNo;
    private PromotionPropertyEntity promotionPropertyByTSalesPromotionPromotionPropertyNo;
    private TOrgEntity tOrgByTSalesPromotionGroupNodeId;
    private TStaffEntity tStaffByTSalesPromotionCreateNo;
    private TStaffEntity tStaffByTSalesPromotionModifiNo;

    @Id
    @Column(name = "t_sales_promotion_sales_promotion_no", nullable = false, length = 4)
    public String gettSalesPromotionSalesPromotionNo() {
        return tSalesPromotionSalesPromotionNo;
    }

    public void settSalesPromotionSalesPromotionNo(String tSalesPromotionSalesPromotionNo) {
        this.tSalesPromotionSalesPromotionNo = tSalesPromotionSalesPromotionNo;
    }

    @Basic
    @Column(name = "t_sales_promotion_sales_promotion_name", nullable = false, length = 50)
    public String gettSalesPromotionSalesPromotionName() {
        return tSalesPromotionSalesPromotionName;
    }

    public void settSalesPromotionSalesPromotionName(String tSalesPromotionSalesPromotionName) {
        this.tSalesPromotionSalesPromotionName = tSalesPromotionSalesPromotionName;
    }

    @Basic
    @Column(name = "t_sales_promotion_promotion_property_no", nullable = false, length = 4)
    public String gettSalesPromotionPromotionPropertyNo() {
        return tSalesPromotionPromotionPropertyNo;
    }

    public void settSalesPromotionPromotionPropertyNo(String tSalesPromotionPromotionPropertyNo) {
        this.tSalesPromotionPromotionPropertyNo = tSalesPromotionPromotionPropertyNo;
    }

    @Basic
    @Column(name = "t_sales_promotion_qty", nullable = false)
    public int gettSalesPromotionQty() {
        return tSalesPromotionQty;
    }

    public void settSalesPromotionQty(int tSalesPromotionQty) {
        this.tSalesPromotionQty = tSalesPromotionQty;
    }

    @Basic
    @Column(name = "t_sales_promotion_z_qty", nullable = false)
    public int gettSalesPromotionZQty() {
        return tSalesPromotionZQty;
    }

    public void settSalesPromotionZQty(int tSalesPromotionZQty) {
        this.tSalesPromotionZQty = tSalesPromotionZQty;
    }

    @Basic
    @Column(name = "t_sales_promotion_remark", nullable = true, length = 100)
    public String gettSalesPromotionRemark() {
        return tSalesPromotionRemark;
    }

    public void settSalesPromotionRemark(String tSalesPromotionRemark) {
        this.tSalesPromotionRemark = tSalesPromotionRemark;
    }

    @Basic
    @Column(name = "t_sales_promotion_group_node_id", nullable = false, length = 20)
    public String gettSalesPromotionGroupNodeId() {
        return tSalesPromotionGroupNodeId;
    }

    public void settSalesPromotionGroupNodeId(String tSalesPromotionGroupNodeId) {
        this.tSalesPromotionGroupNodeId = tSalesPromotionGroupNodeId;
    }

    @Basic
    @Column(name = "t_sales_promotion_create_date", nullable = true)
    public Timestamp gettSalesPromotionCreateDate() {
        return tSalesPromotionCreateDate;
    }

    public void settSalesPromotionCreateDate(Timestamp tSalesPromotionCreateDate) {
        this.tSalesPromotionCreateDate = tSalesPromotionCreateDate;
    }

    @Basic
    @Column(name = "t_sales_promotion_create_no", nullable = true, length = 8)
    public String gettSalesPromotionCreateNo() {
        return tSalesPromotionCreateNo;
    }

    public void settSalesPromotionCreateNo(String tSalesPromotionCreateNo) {
        this.tSalesPromotionCreateNo = tSalesPromotionCreateNo;
    }

    @Basic
    @Column(name = "t_sales_promotion_modifi_no", nullable = true, length = 8)
    public String gettSalesPromotionModifiNo() {
        return tSalesPromotionModifiNo;
    }

    public void settSalesPromotionModifiNo(String tSalesPromotionModifiNo) {
        this.tSalesPromotionModifiNo = tSalesPromotionModifiNo;
    }

    @Basic
    @Column(name = "t_sales_promotion_modifi_time", nullable = true)
    public Timestamp gettSalesPromotionModifiTime() {
        return tSalesPromotionModifiTime;
    }

    public void settSalesPromotionModifiTime(Timestamp tSalesPromotionModifiTime) {
        this.tSalesPromotionModifiTime = tSalesPromotionModifiTime;
    }

    @Basic
    @Column(name = "t_sales_promotion_flag", nullable = false, length = -1)
    public String gettSalesPromotionFlag() {
        return tSalesPromotionFlag;
    }

    public void settSalesPromotionFlag(String tSalesPromotionFlag) {
        this.tSalesPromotionFlag = tSalesPromotionFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSalesPromotionEntity that = (TSalesPromotionEntity) o;

        if (tSalesPromotionQty != that.tSalesPromotionQty) return false;
        if (tSalesPromotionZQty != that.tSalesPromotionZQty) return false;
        if (tSalesPromotionSalesPromotionNo != null ? !tSalesPromotionSalesPromotionNo.equals(that.tSalesPromotionSalesPromotionNo) : that.tSalesPromotionSalesPromotionNo != null)
            return false;
        if (tSalesPromotionSalesPromotionName != null ? !tSalesPromotionSalesPromotionName.equals(that.tSalesPromotionSalesPromotionName) : that.tSalesPromotionSalesPromotionName != null)
            return false;
        if (tSalesPromotionPromotionPropertyNo != null ? !tSalesPromotionPromotionPropertyNo.equals(that.tSalesPromotionPromotionPropertyNo) : that.tSalesPromotionPromotionPropertyNo != null)
            return false;
        if (tSalesPromotionRemark != null ? !tSalesPromotionRemark.equals(that.tSalesPromotionRemark) : that.tSalesPromotionRemark != null)
            return false;
        if (tSalesPromotionGroupNodeId != null ? !tSalesPromotionGroupNodeId.equals(that.tSalesPromotionGroupNodeId) : that.tSalesPromotionGroupNodeId != null)
            return false;
        if (tSalesPromotionCreateDate != null ? !tSalesPromotionCreateDate.equals(that.tSalesPromotionCreateDate) : that.tSalesPromotionCreateDate != null)
            return false;
        if (tSalesPromotionCreateNo != null ? !tSalesPromotionCreateNo.equals(that.tSalesPromotionCreateNo) : that.tSalesPromotionCreateNo != null)
            return false;
        if (tSalesPromotionModifiNo != null ? !tSalesPromotionModifiNo.equals(that.tSalesPromotionModifiNo) : that.tSalesPromotionModifiNo != null)
            return false;
        if (tSalesPromotionModifiTime != null ? !tSalesPromotionModifiTime.equals(that.tSalesPromotionModifiTime) : that.tSalesPromotionModifiTime != null)
            return false;
        if (tSalesPromotionFlag != null ? !tSalesPromotionFlag.equals(that.tSalesPromotionFlag) : that.tSalesPromotionFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tSalesPromotionSalesPromotionNo != null ? tSalesPromotionSalesPromotionNo.hashCode() : 0;
        result = 31 * result + (tSalesPromotionSalesPromotionName != null ? tSalesPromotionSalesPromotionName.hashCode() : 0);
        result = 31 * result + (tSalesPromotionPromotionPropertyNo != null ? tSalesPromotionPromotionPropertyNo.hashCode() : 0);
        result = 31 * result + tSalesPromotionQty;
        result = 31 * result + tSalesPromotionZQty;
        result = 31 * result + (tSalesPromotionRemark != null ? tSalesPromotionRemark.hashCode() : 0);
        result = 31 * result + (tSalesPromotionGroupNodeId != null ? tSalesPromotionGroupNodeId.hashCode() : 0);
        result = 31 * result + (tSalesPromotionCreateDate != null ? tSalesPromotionCreateDate.hashCode() : 0);
        result = 31 * result + (tSalesPromotionCreateNo != null ? tSalesPromotionCreateNo.hashCode() : 0);
        result = 31 * result + (tSalesPromotionModifiNo != null ? tSalesPromotionModifiNo.hashCode() : 0);
        result = 31 * result + (tSalesPromotionModifiTime != null ? tSalesPromotionModifiTime.hashCode() : 0);
        result = 31 * result + (tSalesPromotionFlag != null ? tSalesPromotionFlag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tSalesPromotionByPromotionMProductSSalesPromotionNo")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByTSalesPromotionSalesPromotionNo() {
        return promotionMProductSByTSalesPromotionSalesPromotionNo;
    }

    public void setPromotionMProductSByTSalesPromotionSalesPromotionNo(Collection<PromotionMProductSEntity> promotionMProductSByTSalesPromotionSalesPromotionNo) {
        this.promotionMProductSByTSalesPromotionSalesPromotionNo = promotionMProductSByTSalesPromotionSalesPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_sales_promotion_promotion_property_no", referencedColumnName = "promotion_property_promotion_property_no", nullable = false,insertable = false, updatable = false)
    public PromotionPropertyEntity getPromotionPropertyByTSalesPromotionPromotionPropertyNo() {
        return promotionPropertyByTSalesPromotionPromotionPropertyNo;
    }

    public void setPromotionPropertyByTSalesPromotionPromotionPropertyNo(PromotionPropertyEntity promotionPropertyByTSalesPromotionPromotionPropertyNo) {
        this.promotionPropertyByTSalesPromotionPromotionPropertyNo = promotionPropertyByTSalesPromotionPromotionPropertyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_sales_promotion_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByTSalesPromotionGroupNodeId() {
        return tOrgByTSalesPromotionGroupNodeId;
    }

    public void settOrgByTSalesPromotionGroupNodeId(TOrgEntity tOrgByTSalesPromotionGroupNodeId) {
        this.tOrgByTSalesPromotionGroupNodeId = tOrgByTSalesPromotionGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_sales_promotion_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTSalesPromotionCreateNo() {
        return tStaffByTSalesPromotionCreateNo;
    }

    public void settStaffByTSalesPromotionCreateNo(TStaffEntity tStaffByTSalesPromotionCreateNo) {
        this.tStaffByTSalesPromotionCreateNo = tStaffByTSalesPromotionCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_sales_promotion_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTSalesPromotionModifiNo() {
        return tStaffByTSalesPromotionModifiNo;
    }

    public void settStaffByTSalesPromotionModifiNo(TStaffEntity tStaffByTSalesPromotionModifiNo) {
        this.tStaffByTSalesPromotionModifiNo = tStaffByTSalesPromotionModifiNo;
    }
}
