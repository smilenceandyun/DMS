package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BOutPresentSEntityPK implements Serializable {
    private String bOutPresentSOutPresentNo;
    private int bOutPresentSDetailId;

    @Column(name = "b_out_present_s_out_present_no", nullable = false, length = 16)
    @Id
    public String getbOutPresentSOutPresentNo() {
        return bOutPresentSOutPresentNo;
    }

    public void setbOutPresentSOutPresentNo(String bOutPresentSOutPresentNo) {
        this.bOutPresentSOutPresentNo = bOutPresentSOutPresentNo;
    }

    @Column(name = "b_out_present_s_detail_id", nullable = false)
    @Id
    public int getbOutPresentSDetailId() {
        return bOutPresentSDetailId;
    }

    public void setbOutPresentSDetailId(int bOutPresentSDetailId) {
        this.bOutPresentSDetailId = bOutPresentSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BOutPresentSEntityPK that = (BOutPresentSEntityPK) o;

        if (bOutPresentSDetailId != that.bOutPresentSDetailId) return false;
        if (bOutPresentSOutPresentNo != null ? !bOutPresentSOutPresentNo.equals(that.bOutPresentSOutPresentNo) : that.bOutPresentSOutPresentNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bOutPresentSOutPresentNo != null ? bOutPresentSOutPresentNo.hashCode() : 0;
        result = 31 * result + bOutPresentSDetailId;
        return result;
    }
}
