package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BSOrderSEntityPK implements Serializable {
    private String bSOrderSSOrderNo;
    private int bSOrderSDetailId;

    @Column(name = "b_s_order_s_s_order_no", nullable = false, length = 16)
    @Id
    public String getbSOrderSSOrderNo() {
        return bSOrderSSOrderNo;
    }

    public void setbSOrderSSOrderNo(String bSOrderSSOrderNo) {
        this.bSOrderSSOrderNo = bSOrderSSOrderNo;
    }

    @Column(name = "b_s_order_s_detail_id", nullable = false)
    @Id
    public int getbSOrderSDetailId() {
        return bSOrderSDetailId;
    }

    public void setbSOrderSDetailId(int bSOrderSDetailId) {
        this.bSOrderSDetailId = bSOrderSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSOrderSEntityPK that = (BSOrderSEntityPK) o;

        if (bSOrderSDetailId != that.bSOrderSDetailId) return false;
        if (bSOrderSSOrderNo != null ? !bSOrderSSOrderNo.equals(that.bSOrderSSOrderNo) : that.bSOrderSSOrderNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSOrderSSOrderNo != null ? bSOrderSSOrderNo.hashCode() : 0;
        result = 31 * result + bSOrderSDetailId;
        return result;
    }
}
