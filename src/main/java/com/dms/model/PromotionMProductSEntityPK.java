package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionMProductSEntityPK implements Serializable {
    private String promotionMProductSPromotionNo;
    private int promotionMProductSIndexId;

    @Column(name = "Promotion_m_product_s_Promotion_no", nullable = false, length = 16)
    @Id
    public String getPromotionMProductSPromotionNo() {
        return promotionMProductSPromotionNo;
    }

    public void setPromotionMProductSPromotionNo(String promotionMProductSPromotionNo) {
        this.promotionMProductSPromotionNo = promotionMProductSPromotionNo;
    }

    @Column(name = "Promotion_m_product_s_index_id", nullable = false)
    @Id
    public int getPromotionMProductSIndexId() {
        return promotionMProductSIndexId;
    }

    public void setPromotionMProductSIndexId(int promotionMProductSIndexId) {
        this.promotionMProductSIndexId = promotionMProductSIndexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionMProductSEntityPK that = (PromotionMProductSEntityPK) o;

        if (promotionMProductSIndexId != that.promotionMProductSIndexId) return false;
        if (promotionMProductSPromotionNo != null ? !promotionMProductSPromotionNo.equals(that.promotionMProductSPromotionNo) : that.promotionMProductSPromotionNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMProductSPromotionNo != null ? promotionMProductSPromotionNo.hashCode() : 0;
        result = 31 * result + promotionMProductSIndexId;
        return result;
    }
}
