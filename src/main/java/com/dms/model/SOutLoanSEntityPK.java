package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SOutLoanSEntityPK implements Serializable {
    private String sOutLoanSOutLoanNo;
    private int sOutLoanSDetailId;

    @Column(name = "s_out_loan_s_out_loan_no", nullable = false, length = 16)
    @Id
    public String getsOutLoanSOutLoanNo() {
        return sOutLoanSOutLoanNo;
    }

    public void setsOutLoanSOutLoanNo(String sOutLoanSOutLoanNo) {
        this.sOutLoanSOutLoanNo = sOutLoanSOutLoanNo;
    }

    @Column(name = "s_out_loan_s_detail_id", nullable = false)
    @Id
    public int getsOutLoanSDetailId() {
        return sOutLoanSDetailId;
    }

    public void setsOutLoanSDetailId(int sOutLoanSDetailId) {
        this.sOutLoanSDetailId = sOutLoanSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SOutLoanSEntityPK that = (SOutLoanSEntityPK) o;

        if (sOutLoanSDetailId != that.sOutLoanSDetailId) return false;
        if (sOutLoanSOutLoanNo != null ? !sOutLoanSOutLoanNo.equals(that.sOutLoanSOutLoanNo) : that.sOutLoanSOutLoanNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sOutLoanSOutLoanNo != null ? sOutLoanSOutLoanNo.hashCode() : 0;
        result = 31 * result + sOutLoanSDetailId;
        return result;
    }
}
