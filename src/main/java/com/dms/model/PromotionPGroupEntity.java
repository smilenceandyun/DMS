package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Promotion_p_group", schema = "dbo", catalog = "logistics")
public class PromotionPGroupEntity {
    private String promotionPGroupPromotionNo;
    private String promotionPGroupGoodsNo;
    private BigDecimal promotionPGroupSalesQuantity;
    private String promotionPGroupUnit;
    private String promotionPGroupPromotionProperty;
    private PromotionMEntity promotionMByPromotionPGroupPromotionNo;
    private TGoodsEntity tGoodsByPromotionPGroupGoodsNo;

    @Id
    @Column(name = "Promotion_p_group_Promotion_no", nullable = false, length = 16)
    public String getPromotionPGroupPromotionNo() {
        return promotionPGroupPromotionNo;
    }

    public void setPromotionPGroupPromotionNo(String promotionPGroupPromotionNo) {
        this.promotionPGroupPromotionNo = promotionPGroupPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_p_group_goods_no", nullable = true, length = 20)
    public String getPromotionPGroupGoodsNo() {
        return promotionPGroupGoodsNo;
    }

    public void setPromotionPGroupGoodsNo(String promotionPGroupGoodsNo) {
        this.promotionPGroupGoodsNo = promotionPGroupGoodsNo;
    }

    @Basic
    @Column(name = "Promotion_p_group_sales_quantity", nullable = true, precision = 6)
    public BigDecimal getPromotionPGroupSalesQuantity() {
        return promotionPGroupSalesQuantity;
    }

    public void setPromotionPGroupSalesQuantity(BigDecimal promotionPGroupSalesQuantity) {
        this.promotionPGroupSalesQuantity = promotionPGroupSalesQuantity;
    }

    @Basic
    @Column(name = "Promotion_p_group_unit", nullable = true, length = 10)
    public String getPromotionPGroupUnit() {
        return promotionPGroupUnit;
    }

    public void setPromotionPGroupUnit(String promotionPGroupUnit) {
        this.promotionPGroupUnit = promotionPGroupUnit;
    }

    @Basic
    @Column(name = "Promotion_p_group_Promotion_property", nullable = true, length = 40)
    public String getPromotionPGroupPromotionProperty() {
        return promotionPGroupPromotionProperty;
    }

    public void setPromotionPGroupPromotionProperty(String promotionPGroupPromotionProperty) {
        this.promotionPGroupPromotionProperty = promotionPGroupPromotionProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionPGroupEntity that = (PromotionPGroupEntity) o;

        if (promotionPGroupPromotionNo != null ? !promotionPGroupPromotionNo.equals(that.promotionPGroupPromotionNo) : that.promotionPGroupPromotionNo != null)
            return false;
        if (promotionPGroupGoodsNo != null ? !promotionPGroupGoodsNo.equals(that.promotionPGroupGoodsNo) : that.promotionPGroupGoodsNo != null)
            return false;
        if (promotionPGroupSalesQuantity != null ? !promotionPGroupSalesQuantity.equals(that.promotionPGroupSalesQuantity) : that.promotionPGroupSalesQuantity != null)
            return false;
        if (promotionPGroupUnit != null ? !promotionPGroupUnit.equals(that.promotionPGroupUnit) : that.promotionPGroupUnit != null)
            return false;
        if (promotionPGroupPromotionProperty != null ? !promotionPGroupPromotionProperty.equals(that.promotionPGroupPromotionProperty) : that.promotionPGroupPromotionProperty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionPGroupPromotionNo != null ? promotionPGroupPromotionNo.hashCode() : 0;
        result = 31 * result + (promotionPGroupGoodsNo != null ? promotionPGroupGoodsNo.hashCode() : 0);
        result = 31 * result + (promotionPGroupSalesQuantity != null ? promotionPGroupSalesQuantity.hashCode() : 0);
        result = 31 * result + (promotionPGroupUnit != null ? promotionPGroupUnit.hashCode() : 0);
        result = 31 * result + (promotionPGroupPromotionProperty != null ? promotionPGroupPromotionProperty.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "Promotion_p_group_Promotion_no", referencedColumnName = "Promotion_m_Promotion_no", nullable = false,insertable = false, updatable = false)
    public PromotionMEntity getPromotionMByPromotionPGroupPromotionNo() {
        return promotionMByPromotionPGroupPromotionNo;
    }

    public void setPromotionMByPromotionPGroupPromotionNo(PromotionMEntity promotionMByPromotionPGroupPromotionNo) {
        this.promotionMByPromotionPGroupPromotionNo = promotionMByPromotionPGroupPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_p_group_goods_no", referencedColumnName = "t_goods_goods_no",insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByPromotionPGroupGoodsNo() {
        return tGoodsByPromotionPGroupGoodsNo;
    }

    public void settGoodsByPromotionPGroupGoodsNo(TGoodsEntity tGoodsByPromotionPGroupGoodsNo) {
        this.tGoodsByPromotionPGroupGoodsNo = tGoodsByPromotionPGroupGoodsNo;
    }
}
