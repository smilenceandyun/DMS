package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BRProcureSEntityPK implements Serializable {
    private String bRProcureSRProcureNo;
    private int bRProcureSDetailId;

    @Column(name = "b_r_procure_s_r_procure_no", nullable = false, length = 16)
    @Id
    public String getbRProcureSRProcureNo() {
        return bRProcureSRProcureNo;
    }

    public void setbRProcureSRProcureNo(String bRProcureSRProcureNo) {
        this.bRProcureSRProcureNo = bRProcureSRProcureNo;
    }

    @Column(name = "b_r_procure_s_detail_id", nullable = false)
    @Id
    public int getbRProcureSDetailId() {
        return bRProcureSDetailId;
    }

    public void setbRProcureSDetailId(int bRProcureSDetailId) {
        this.bRProcureSDetailId = bRProcureSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BRProcureSEntityPK that = (BRProcureSEntityPK) o;

        if (bRProcureSDetailId != that.bRProcureSDetailId) return false;
        if (bRProcureSRProcureNo != null ? !bRProcureSRProcureNo.equals(that.bRProcureSRProcureNo) : that.bRProcureSRProcureNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bRProcureSRProcureNo != null ? bRProcureSRProcureNo.hashCode() : 0;
        result = 31 * result + bRProcureSDetailId;
        return result;
    }
}
