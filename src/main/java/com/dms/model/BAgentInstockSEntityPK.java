package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BAgentInstockSEntityPK implements Serializable {
    private String bAgentInstockSAgentInstockNo;
    private int bAgentInstockSDetailId;

    @Column(name = "b_agent_instock_s_agent_instock_no", nullable = false, length = 16)
    @Id
    public String getbAgentInstockSAgentInstockNo() {
        return bAgentInstockSAgentInstockNo;
    }

    public void setbAgentInstockSAgentInstockNo(String bAgentInstockSAgentInstockNo) {
        this.bAgentInstockSAgentInstockNo = bAgentInstockSAgentInstockNo;
    }

    @Column(name = "b_agent_instock_s_detail_id", nullable = false)
    @Id
    public int getbAgentInstockSDetailId() {
        return bAgentInstockSDetailId;
    }

    public void setbAgentInstockSDetailId(int bAgentInstockSDetailId) {
        this.bAgentInstockSDetailId = bAgentInstockSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentInstockSEntityPK that = (BAgentInstockSEntityPK) o;

        if (bAgentInstockSDetailId != that.bAgentInstockSDetailId) return false;
        if (bAgentInstockSAgentInstockNo != null ? !bAgentInstockSAgentInstockNo.equals(that.bAgentInstockSAgentInstockNo) : that.bAgentInstockSAgentInstockNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentInstockSAgentInstockNo != null ? bAgentInstockSAgentInstockNo.hashCode() : 0;
        result = 31 * result + bAgentInstockSDetailId;
        return result;
    }
}
