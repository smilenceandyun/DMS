package com.dms.model.procure;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BProcureSEntityPK implements Serializable {
    private String procureNo;
    private int detailId;

    @Column(name = "procure_no")
    @Id
    public String getProcureNo() {
        return procureNo;
    }

    public void setProcureNo(String procureNo) {
        this.procureNo = procureNo;
    }

    @Column(name = "detail_id")
    @Id
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BProcureSEntityPK that = (BProcureSEntityPK) o;

        if (detailId != that.detailId) return false;
        if (procureNo != null ? !procureNo.equals(that.procureNo) : that.procureNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = procureNo != null ? procureNo.hashCode() : 0;
        result = 31 * result + detailId;
        return result;
    }
}
