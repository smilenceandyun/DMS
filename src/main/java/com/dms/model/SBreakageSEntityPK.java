package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SBreakageSEntityPK implements Serializable {
    private String sBreakageSBreakageBillno;
    private int sBreakageSDetailId;

    @Column(name = "s_breakage_s_breakage_billno", nullable = false, length = 16)
    @Id
    public String getsBreakageSBreakageBillno() {
        return sBreakageSBreakageBillno;
    }

    public void setsBreakageSBreakageBillno(String sBreakageSBreakageBillno) {
        this.sBreakageSBreakageBillno = sBreakageSBreakageBillno;
    }

    @Column(name = "s_breakage_s_detail_id", nullable = false)
    @Id
    public int getsBreakageSDetailId() {
        return sBreakageSDetailId;
    }

    public void setsBreakageSDetailId(int sBreakageSDetailId) {
        this.sBreakageSDetailId = sBreakageSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SBreakageSEntityPK that = (SBreakageSEntityPK) o;

        if (sBreakageSDetailId != that.sBreakageSDetailId) return false;
        if (sBreakageSBreakageBillno != null ? !sBreakageSBreakageBillno.equals(that.sBreakageSBreakageBillno) : that.sBreakageSBreakageBillno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sBreakageSBreakageBillno != null ? sBreakageSBreakageBillno.hashCode() : 0;
        result = 31 * result + sBreakageSDetailId;
        return result;
    }
}
