package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BAgentSalesSEntityPK implements Serializable {
    private String bAgentSalesSAgentSalesNo;
    private int bAgentSalesSDetailId;

    @Column(name = "b_agent_sales_s_agent_sales_no", nullable = false, length = 16)
    @Id
    public String getbAgentSalesSAgentSalesNo() {
        return bAgentSalesSAgentSalesNo;
    }

    public void setbAgentSalesSAgentSalesNo(String bAgentSalesSAgentSalesNo) {
        this.bAgentSalesSAgentSalesNo = bAgentSalesSAgentSalesNo;
    }

    @Column(name = "b_agent_sales_s_detail_id", nullable = false)
    @Id
    public int getbAgentSalesSDetailId() {
        return bAgentSalesSDetailId;
    }

    public void setbAgentSalesSDetailId(int bAgentSalesSDetailId) {
        this.bAgentSalesSDetailId = bAgentSalesSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentSalesSEntityPK that = (BAgentSalesSEntityPK) o;

        if (bAgentSalesSDetailId != that.bAgentSalesSDetailId) return false;
        if (bAgentSalesSAgentSalesNo != null ? !bAgentSalesSAgentSalesNo.equals(that.bAgentSalesSAgentSalesNo) : that.bAgentSalesSAgentSalesNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentSalesSAgentSalesNo != null ? bAgentSalesSAgentSalesNo.hashCode() : 0;
        result = 31 * result + bAgentSalesSDetailId;
        return result;
    }
}
