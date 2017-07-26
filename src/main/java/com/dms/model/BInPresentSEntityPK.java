package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BInPresentSEntityPK implements Serializable {
    private String bInPresentSInPresentNo;
    private int bInPresentSDetailId;

    @Column(name = "b_in_present_s_in_present_no", nullable = false, length = 16)
    @Id
    public String getbInPresentSInPresentNo() {
        return bInPresentSInPresentNo;
    }

    public void setbInPresentSInPresentNo(String bInPresentSInPresentNo) {
        this.bInPresentSInPresentNo = bInPresentSInPresentNo;
    }

    @Column(name = "b_in_present_s_detail_id", nullable = false)
    @Id
    public int getbInPresentSDetailId() {
        return bInPresentSDetailId;
    }

    public void setbInPresentSDetailId(int bInPresentSDetailId) {
        this.bInPresentSDetailId = bInPresentSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInPresentSEntityPK that = (BInPresentSEntityPK) o;

        if (bInPresentSDetailId != that.bInPresentSDetailId) return false;
        if (bInPresentSInPresentNo != null ? !bInPresentSInPresentNo.equals(that.bInPresentSInPresentNo) : that.bInPresentSInPresentNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInPresentSInPresentNo != null ? bInPresentSInPresentNo.hashCode() : 0;
        result = 31 * result + bInPresentSDetailId;
        return result;
    }
}
