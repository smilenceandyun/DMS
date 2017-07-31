package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BPurchaseOrdSEntityPK implements Serializable {
    private String bPurchaseOrdSOrdProcureNo;
    private int bPurchaseOrdSDetailId;

    @Column(name = "b_purchase_ord_s_ord_procure_no", nullable = false, length = 16)
    @Id
    public String getbPurchaseOrdSOrdProcureNo() {
        return bPurchaseOrdSOrdProcureNo;
    }

    public void setbPurchaseOrdSOrdProcureNo(String bPurchaseOrdSOrdProcureNo) {
        this.bPurchaseOrdSOrdProcureNo = bPurchaseOrdSOrdProcureNo;
    }

    @Column(name = "b_purchase_ord_s_detail_id", nullable = false)
    @Id
    public int getbPurchaseOrdSDetailId() {
        return bPurchaseOrdSDetailId;
    }

    public void setbPurchaseOrdSDetailId(int bPurchaseOrdSDetailId) {
        this.bPurchaseOrdSDetailId = bPurchaseOrdSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BPurchaseOrdSEntityPK that = (BPurchaseOrdSEntityPK) o;

        if (bPurchaseOrdSDetailId != that.bPurchaseOrdSDetailId) return false;
        if (bPurchaseOrdSOrdProcureNo != null ? !bPurchaseOrdSOrdProcureNo.equals(that.bPurchaseOrdSOrdProcureNo) : that.bPurchaseOrdSOrdProcureNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bPurchaseOrdSOrdProcureNo != null ? bPurchaseOrdSOrdProcureNo.hashCode() : 0;
        result = 31 * result + bPurchaseOrdSDetailId;
        return result;
    }
}
