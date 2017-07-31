package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BInProductSEntityPK implements Serializable {
    private String bInProductSProducStorageNo;
    private int bInProductSDetailId;

    @Column(name = "b_in_product_s_producStorage_no", nullable = false, length = 20)
    @Id
    public String getbInProductSProducStorageNo() {
        return bInProductSProducStorageNo;
    }

    public void setbInProductSProducStorageNo(String bInProductSProducStorageNo) {
        this.bInProductSProducStorageNo = bInProductSProducStorageNo;
    }

    @Column(name = "b_in_product_s_detail_id", nullable = false)
    @Id
    public int getbInProductSDetailId() {
        return bInProductSDetailId;
    }

    public void setbInProductSDetailId(int bInProductSDetailId) {
        this.bInProductSDetailId = bInProductSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInProductSEntityPK that = (BInProductSEntityPK) o;

        if (bInProductSDetailId != that.bInProductSDetailId) return false;
        if (bInProductSProducStorageNo != null ? !bInProductSProducStorageNo.equals(that.bInProductSProducStorageNo) : that.bInProductSProducStorageNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInProductSProducStorageNo != null ? bInProductSProducStorageNo.hashCode() : 0;
        result = 31 * result + bInProductSDetailId;
        return result;
    }
}
