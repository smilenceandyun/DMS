package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CPurchaseConSEntityPK implements Serializable {
    private String cPurchaseConSPurchasConNo;
    private int cPurchaseConSDetailId;

    @Column(name = "c_purchase_con_s_purchas_con_no", nullable = false, length = 16)
    @Id
    public String getcPurchaseConSPurchasConNo() {
        return cPurchaseConSPurchasConNo;
    }

    public void setcPurchaseConSPurchasConNo(String cPurchaseConSPurchasConNo) {
        this.cPurchaseConSPurchasConNo = cPurchaseConSPurchasConNo;
    }

    @Column(name = "c_purchase_con_s_detail_id", nullable = false)
    @Id
    public int getcPurchaseConSDetailId() {
        return cPurchaseConSDetailId;
    }

    public void setcPurchaseConSDetailId(int cPurchaseConSDetailId) {
        this.cPurchaseConSDetailId = cPurchaseConSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPurchaseConSEntityPK that = (CPurchaseConSEntityPK) o;

        if (cPurchaseConSDetailId != that.cPurchaseConSDetailId) return false;
        if (cPurchaseConSPurchasConNo != null ? !cPurchaseConSPurchasConNo.equals(that.cPurchaseConSPurchasConNo) : that.cPurchaseConSPurchasConNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cPurchaseConSPurchasConNo != null ? cPurchaseConSPurchasConNo.hashCode() : 0;
        result = 31 * result + cPurchaseConSDetailId;
        return result;
    }
}
