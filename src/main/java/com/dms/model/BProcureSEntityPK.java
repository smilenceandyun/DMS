package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BProcureSEntityPK implements Serializable {
    private String bProcureSProcureNo;
    private int bProcureSDetailId;

    @Column(name = "b_procure_s_procure_no", nullable = false, length = 16)
    @Id
    public String getbProcureSProcureNo() {
        return bProcureSProcureNo;
    }

    public void setbProcureSProcureNo(String bProcureSProcureNo) {
        this.bProcureSProcureNo = bProcureSProcureNo;
    }

    @Column(name = "b_procure_s_detail_id", nullable = false)
    @Id
    public int getbProcureSDetailId() {
        return bProcureSDetailId;
    }

    public void setbProcureSDetailId(int bProcureSDetailId) {
        this.bProcureSDetailId = bProcureSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BProcureSEntityPK that = (BProcureSEntityPK) o;

        if (bProcureSDetailId != that.bProcureSDetailId) return false;
        if (bProcureSProcureNo != null ? !bProcureSProcureNo.equals(that.bProcureSProcureNo) : that.bProcureSProcureNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bProcureSProcureNo != null ? bProcureSProcureNo.hashCode() : 0;
        result = 31 * result + bProcureSDetailId;
        return result;
    }
}
