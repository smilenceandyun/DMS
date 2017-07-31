package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SInLoanSEntityPK implements Serializable {
    private String sInLoanSInLoanLno;
    private int sInLoanSDetailId;

    @Column(name = "s_in_loan_s_in_loan_lno", nullable = false, length = 16)
    @Id
    public String getsInLoanSInLoanLno() {
        return sInLoanSInLoanLno;
    }

    public void setsInLoanSInLoanLno(String sInLoanSInLoanLno) {
        this.sInLoanSInLoanLno = sInLoanSInLoanLno;
    }

    @Column(name = "s_in_loan_s_detail_id", nullable = false)
    @Id
    public int getsInLoanSDetailId() {
        return sInLoanSDetailId;
    }

    public void setsInLoanSDetailId(int sInLoanSDetailId) {
        this.sInLoanSDetailId = sInLoanSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SInLoanSEntityPK that = (SInLoanSEntityPK) o;

        if (sInLoanSDetailId != that.sInLoanSDetailId) return false;
        if (sInLoanSInLoanLno != null ? !sInLoanSInLoanLno.equals(that.sInLoanSInLoanLno) : that.sInLoanSInLoanLno != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sInLoanSInLoanLno != null ? sInLoanSInLoanLno.hashCode() : 0;
        result = 31 * result + sInLoanSDetailId;
        return result;
    }
}
