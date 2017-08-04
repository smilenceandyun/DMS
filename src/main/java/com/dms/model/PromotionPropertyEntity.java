package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "promotion_property", schema = "dbo", catalog = "logistics")
public class PromotionPropertyEntity {
    private String promotionPropertyPromotionPropertyNo;
    private String promotionPropertyPromotionProperty;
    private String promotionPropertyRemark;
    private String promotionPropertyGroupNodeId;
    private Timestamp promotionPropertyCreateDate;
    private String promotionPropertyCreateNo;
    private String promotionPropertyModifiNo;
    private Timestamp promotionPropertyModifiTime;
    private String promotionPropertyFlag;
    private TOrgEntity tOrgByPromotionPropertyGroupNodeId;
    private TStaffEntity tStaffByPromotionPropertyCreateNo;
    private TStaffEntity tStaffByPromotionPropertyModifiNo;
    private Collection<TSalesPromotionEntity> tSalesPromotionsByPromotionPropertyPromotionPropertyNo;

    @Id
    @Column(name = "promotion_property_promotion_property_no", nullable = false, length = 4)
    public String getPromotionPropertyPromotionPropertyNo() {
        return promotionPropertyPromotionPropertyNo;
    }

    public void setPromotionPropertyPromotionPropertyNo(String promotionPropertyPromotionPropertyNo) {
        this.promotionPropertyPromotionPropertyNo = promotionPropertyPromotionPropertyNo;
    }

    @Basic
    @Column(name = "promotion_property_promotion_property", nullable = false, length = 50)
    public String getPromotionPropertyPromotionProperty() {
        return promotionPropertyPromotionProperty;
    }

    public void setPromotionPropertyPromotionProperty(String promotionPropertyPromotionProperty) {
        this.promotionPropertyPromotionProperty = promotionPropertyPromotionProperty;
    }

    @Basic
    @Column(name = "promotion_property_remark", nullable = false, length = 100)
    public String getPromotionPropertyRemark() {
        return promotionPropertyRemark;
    }

    public void setPromotionPropertyRemark(String promotionPropertyRemark) {
        this.promotionPropertyRemark = promotionPropertyRemark;
    }

    @Basic
    @Column(name = "promotion_property_group_node_id", nullable = true, length = 20)
    public String getPromotionPropertyGroupNodeId() {
        return promotionPropertyGroupNodeId;
    }

    public void setPromotionPropertyGroupNodeId(String promotionPropertyGroupNodeId) {
        this.promotionPropertyGroupNodeId = promotionPropertyGroupNodeId;
    }

    @Basic
    @Column(name = "promotion_property_create_date", nullable = true)
    public Timestamp getPromotionPropertyCreateDate() {
        return promotionPropertyCreateDate;
    }

    public void setPromotionPropertyCreateDate(Timestamp promotionPropertyCreateDate) {
        this.promotionPropertyCreateDate = promotionPropertyCreateDate;
    }

    @Basic
    @Column(name = "promotion_property_create_no", nullable = true, length = 8)
    public String getPromotionPropertyCreateNo() {
        return promotionPropertyCreateNo;
    }

    public void setPromotionPropertyCreateNo(String promotionPropertyCreateNo) {
        this.promotionPropertyCreateNo = promotionPropertyCreateNo;
    }

    @Basic
    @Column(name = "promotion_property_modifi_no", nullable = true, length = 8)
    public String getPromotionPropertyModifiNo() {
        return promotionPropertyModifiNo;
    }

    public void setPromotionPropertyModifiNo(String promotionPropertyModifiNo) {
        this.promotionPropertyModifiNo = promotionPropertyModifiNo;
    }

    @Basic
    @Column(name = "promotion_property_modifi_time", nullable = true)
    public Timestamp getPromotionPropertyModifiTime() {
        return promotionPropertyModifiTime;
    }

    public void setPromotionPropertyModifiTime(Timestamp promotionPropertyModifiTime) {
        this.promotionPropertyModifiTime = promotionPropertyModifiTime;
    }

    @Basic
    @Column(name = "promotion_property_flag", nullable = false, length = -1)
    public String getPromotionFlag() {
        return promotionPropertyFlag;
    }

    public void setPromotionFlag(String promotionFlag) {
        this.promotionPropertyFlag = promotionFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionPropertyEntity that = (PromotionPropertyEntity) o;

        if (promotionPropertyPromotionPropertyNo != null ? !promotionPropertyPromotionPropertyNo.equals(that.promotionPropertyPromotionPropertyNo) : that.promotionPropertyPromotionPropertyNo != null)
            return false;
        if (promotionPropertyPromotionProperty != null ? !promotionPropertyPromotionProperty.equals(that.promotionPropertyPromotionProperty) : that.promotionPropertyPromotionProperty != null)
            return false;
        if (promotionPropertyRemark != null ? !promotionPropertyRemark.equals(that.promotionPropertyRemark) : that.promotionPropertyRemark != null)
            return false;
        if (promotionPropertyGroupNodeId != null ? !promotionPropertyGroupNodeId.equals(that.promotionPropertyGroupNodeId) : that.promotionPropertyGroupNodeId != null)
            return false;
        if (promotionPropertyCreateDate != null ? !promotionPropertyCreateDate.equals(that.promotionPropertyCreateDate) : that.promotionPropertyCreateDate != null)
            return false;
        if (promotionPropertyCreateNo != null ? !promotionPropertyCreateNo.equals(that.promotionPropertyCreateNo) : that.promotionPropertyCreateNo != null)
            return false;
        if (promotionPropertyModifiNo != null ? !promotionPropertyModifiNo.equals(that.promotionPropertyModifiNo) : that.promotionPropertyModifiNo != null)
            return false;
        if (promotionPropertyModifiTime != null ? !promotionPropertyModifiTime.equals(that.promotionPropertyModifiTime) : that.promotionPropertyModifiTime != null)
            return false;
        if (promotionPropertyFlag != null ? !promotionPropertyFlag.equals(that.promotionPropertyFlag) : that.promotionPropertyFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionPropertyPromotionPropertyNo != null ? promotionPropertyPromotionPropertyNo.hashCode() : 0;
        result = 31 * result + (promotionPropertyPromotionProperty != null ? promotionPropertyPromotionProperty.hashCode() : 0);
        result = 31 * result + (promotionPropertyRemark != null ? promotionPropertyRemark.hashCode() : 0);
        result = 31 * result + (promotionPropertyGroupNodeId != null ? promotionPropertyGroupNodeId.hashCode() : 0);
        result = 31 * result + (promotionPropertyCreateDate != null ? promotionPropertyCreateDate.hashCode() : 0);
        result = 31 * result + (promotionPropertyCreateNo != null ? promotionPropertyCreateNo.hashCode() : 0);
        result = 31 * result + (promotionPropertyModifiNo != null ? promotionPropertyModifiNo.hashCode() : 0);
        result = 31 * result + (promotionPropertyModifiTime != null ? promotionPropertyModifiTime.hashCode() : 0);
        result = 31 * result + (promotionPropertyFlag != null ? promotionPropertyFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "promotion_property_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByPromotionPropertyGroupNodeId() {
        return tOrgByPromotionPropertyGroupNodeId;
    }

    public void settOrgByPromotionPropertyGroupNodeId(TOrgEntity tOrgByPromotionPropertyGroupNodeId) {
        this.tOrgByPromotionPropertyGroupNodeId = tOrgByPromotionPropertyGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "promotion_property_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionPropertyCreateNo() {
        return tStaffByPromotionPropertyCreateNo;
    }

    public void settStaffByPromotionPropertyCreateNo(TStaffEntity tStaffByPromotionPropertyCreateNo) {
        this.tStaffByPromotionPropertyCreateNo = tStaffByPromotionPropertyCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "promotion_property_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionPropertyModifiNo() {
        return tStaffByPromotionPropertyModifiNo;
    }

    public void settStaffByPromotionPropertyModifiNo(TStaffEntity tStaffByPromotionPropertyModifiNo) {
        this.tStaffByPromotionPropertyModifiNo = tStaffByPromotionPropertyModifiNo;
    }

    @OneToMany(mappedBy = "promotionPropertyByTSalesPromotionPromotionPropertyNo")
    public Collection<TSalesPromotionEntity> gettSalesPromotionsByPromotionPropertyPromotionPropertyNo() {
        return tSalesPromotionsByPromotionPropertyPromotionPropertyNo;
    }

    public void settSalesPromotionsByPromotionPropertyPromotionPropertyNo(Collection<TSalesPromotionEntity> tSalesPromotionsByPromotionPropertyPromotionPropertyNo) {
        this.tSalesPromotionsByPromotionPropertyPromotionPropertyNo = tSalesPromotionsByPromotionPropertyPromotionPropertyNo;
    }
}
