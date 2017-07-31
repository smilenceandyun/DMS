package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BAgentRsalesSEntityPK implements Serializable {
    private String bAgentRsalesSAgentRsalesNo;
    private int bAgentRsalesSDetailId;

    @Column(name = "b_agent_rsales_s_agent_rsales_no", nullable = false, length = 16)
    @Id
    public String getbAgentRsalesSAgentRsalesNo() {
        return bAgentRsalesSAgentRsalesNo;
    }

    public void setbAgentRsalesSAgentRsalesNo(String bAgentRsalesSAgentRsalesNo) {
        this.bAgentRsalesSAgentRsalesNo = bAgentRsalesSAgentRsalesNo;
    }

    @Column(name = "b_agent_rsales_s_detail_id", nullable = false)
    @Id
    public int getbAgentRsalesSDetailId() {
        return bAgentRsalesSDetailId;
    }

    public void setbAgentRsalesSDetailId(int bAgentRsalesSDetailId) {
        this.bAgentRsalesSDetailId = bAgentRsalesSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentRsalesSEntityPK that = (BAgentRsalesSEntityPK) o;

        if (bAgentRsalesSDetailId != that.bAgentRsalesSDetailId) return false;
        if (bAgentRsalesSAgentRsalesNo != null ? !bAgentRsalesSAgentRsalesNo.equals(that.bAgentRsalesSAgentRsalesNo) : that.bAgentRsalesSAgentRsalesNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentRsalesSAgentRsalesNo != null ? bAgentRsalesSAgentRsalesNo.hashCode() : 0;
        result = 31 * result + bAgentRsalesSDetailId;
        return result;
    }
}
