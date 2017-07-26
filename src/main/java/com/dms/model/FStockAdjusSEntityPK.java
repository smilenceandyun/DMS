package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FStockAdjusSEntityPK implements Serializable {
    private String fStockAdjusSStockAdjustNo;
    private int fStockAdjusSDetailId;

    @Column(name = "f_stock_adjus_s_stock_adjust_no", nullable = false, length = 16)
    @Id
    public String getfStockAdjusSStockAdjustNo() {
        return fStockAdjusSStockAdjustNo;
    }

    public void setfStockAdjusSStockAdjustNo(String fStockAdjusSStockAdjustNo) {
        this.fStockAdjusSStockAdjustNo = fStockAdjusSStockAdjustNo;
    }

    @Column(name = "f_stock_adjus_s_detail_id", nullable = false)
    @Id
    public int getfStockAdjusSDetailId() {
        return fStockAdjusSDetailId;
    }

    public void setfStockAdjusSDetailId(int fStockAdjusSDetailId) {
        this.fStockAdjusSDetailId = fStockAdjusSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FStockAdjusSEntityPK that = (FStockAdjusSEntityPK) o;

        if (fStockAdjusSDetailId != that.fStockAdjusSDetailId) return false;
        if (fStockAdjusSStockAdjustNo != null ? !fStockAdjusSStockAdjustNo.equals(that.fStockAdjusSStockAdjustNo) : that.fStockAdjusSStockAdjustNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fStockAdjusSStockAdjustNo != null ? fStockAdjusSStockAdjustNo.hashCode() : 0;
        result = 31 * result + fStockAdjusSDetailId;
        return result;
    }
}
