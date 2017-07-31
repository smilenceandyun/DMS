package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionMSEntityPK implements Serializable {
    private String promotionMSPromotionNo;
    private int promotionMSIndexId;

    @Column(name = "Promotion_m_s_Promotion_no", nullable = false, length = 16)
    @Id
    public String getPromotionMSPromotionNo() {
        return promotionMSPromotionNo;
    }

    public void setPromotionMSPromotionNo(String promotionMSPromotionNo) {
        this.promotionMSPromotionNo = promotionMSPromotionNo;
    }

    @Column(name = "Promotion_m_s_index_id", nullable = false)
    @Id
    public int getPromotionMSIndexId() {
        return promotionMSIndexId;
    }

    public void setPromotionMSIndexId(int promotionMSIndexId) {
        this.promotionMSIndexId = promotionMSIndexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionMSEntityPK that = (PromotionMSEntityPK) o;

        if (promotionMSIndexId != that.promotionMSIndexId) return false;
        if (promotionMSPromotionNo != null ? !promotionMSPromotionNo.equals(that.promotionMSPromotionNo) : that.promotionMSPromotionNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMSPromotionNo != null ? promotionMSPromotionNo.hashCode() : 0;
        result = 31 * result + promotionMSIndexId;
        return result;
    }
}
