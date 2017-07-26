package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BSConSEntityPK implements Serializable {
    private String bSConSSConBillno;
    private int bSConSDetailId;

    @Column(name = "b_s_con_s_s_con_billno", nullable = false, length = 16)
    @Id
    public String getbSConSSConBillno() {
        return bSConSSConBillno;
    }

    public void setbSConSSConBillno(String bSConSSConBillno) {
        this.bSConSSConBillno = bSConSSConBillno;
    }

    @Column(name = "b_s_con_s_detail_id", nullable = false)
    @Id
    public int getbSConSDetailId() {
        return bSConSDetailId;
    }

    public void setbSConSDetailId(int bSConSDetailId) {
        this.bSConSDetailId = bSConSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSConSEntityPK that = (BSConSEntityPK) o;

        if (bSConSDetailId != that.bSConSDetailId) return false;
        if (bSConSSConBillno != null ? !bSConSSConBillno.equals(that.bSConSSConBillno) : that.bSConSSConBillno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSConSSConBillno != null ? bSConSSConBillno.hashCode() : 0;
        result = 31 * result + bSConSDetailId;
        return result;
    }
}
