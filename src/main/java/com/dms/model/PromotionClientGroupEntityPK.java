package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionClientGroupEntityPK implements Serializable {
    private String promotionClientGroupPromotionNo;
    private int promotionClientGroupIndexId;

    @Column(name = "Promotion_client_group_Promotion_no", nullable = false, length = 16)
    @Id
    public String getPromotionClientGroupPromotionNo() {
        return promotionClientGroupPromotionNo;
    }

    public void setPromotionClientGroupPromotionNo(String promotionClientGroupPromotionNo) {
        this.promotionClientGroupPromotionNo = promotionClientGroupPromotionNo;
    }

    @Column(name = "Promotion_client_group_index_id", nullable = false)
    @Id
    public int getPromotionClientGroupIndexId() {
        return promotionClientGroupIndexId;
    }

    public void setPromotionClientGroupIndexId(int promotionClientGroupIndexId) {
        this.promotionClientGroupIndexId = promotionClientGroupIndexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionClientGroupEntityPK that = (PromotionClientGroupEntityPK) o;

        if (promotionClientGroupIndexId != that.promotionClientGroupIndexId) return false;
        if (promotionClientGroupPromotionNo != null ? !promotionClientGroupPromotionNo.equals(that.promotionClientGroupPromotionNo) : that.promotionClientGroupPromotionNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionClientGroupPromotionNo != null ? promotionClientGroupPromotionNo.hashCode() : 0;
        result = 31 * result + promotionClientGroupIndexId;
        return result;
    }
}
