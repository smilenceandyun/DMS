package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FConSEntityPK implements Serializable {
    private String fConSSConBillno;
    private int fConSDetailId;

    @Column(name = "f_con_s_s_con_billno", nullable = false, length = 16)
    @Id
    public String getfConSSConBillno() {
        return fConSSConBillno;
    }

    public void setfConSSConBillno(String fConSSConBillno) {
        this.fConSSConBillno = fConSSConBillno;
    }

    @Column(name = "f_con_s_detail_id", nullable = false)
    @Id
    public int getfConSDetailId() {
        return fConSDetailId;
    }

    public void setfConSDetailId(int fConSDetailId) {
        this.fConSDetailId = fConSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FConSEntityPK that = (FConSEntityPK) o;

        if (fConSDetailId != that.fConSDetailId) return false;
        if (fConSSConBillno != null ? !fConSSConBillno.equals(that.fConSSConBillno) : that.fConSSConBillno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fConSSConBillno != null ? fConSSConBillno.hashCode() : 0;
        result = 31 * result + fConSDetailId;
        return result;
    }
}
