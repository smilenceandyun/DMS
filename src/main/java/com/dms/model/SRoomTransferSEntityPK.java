package com.dms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SRoomTransferSEntityPK implements Serializable {
    private String sRoomTransferSRoomTransferNo;
    private int sRoomTransferSDetailId;

    @Column(name = "s_room_transfer_s_room_transfer_no", nullable = false, length = 16)
    @Id
    public String getsRoomTransferSRoomTransferNo() {
        return sRoomTransferSRoomTransferNo;
    }

    public void setsRoomTransferSRoomTransferNo(String sRoomTransferSRoomTransferNo) {
        this.sRoomTransferSRoomTransferNo = sRoomTransferSRoomTransferNo;
    }

    @Column(name = "s_room_transfer_s_detail_id", nullable = false)
    @Id
    public int getsRoomTransferSDetailId() {
        return sRoomTransferSDetailId;
    }

    public void setsRoomTransferSDetailId(int sRoomTransferSDetailId) {
        this.sRoomTransferSDetailId = sRoomTransferSDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SRoomTransferSEntityPK that = (SRoomTransferSEntityPK) o;

        if (sRoomTransferSDetailId != that.sRoomTransferSDetailId) return false;
        if (sRoomTransferSRoomTransferNo != null ? !sRoomTransferSRoomTransferNo.equals(that.sRoomTransferSRoomTransferNo) : that.sRoomTransferSRoomTransferNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sRoomTransferSRoomTransferNo != null ? sRoomTransferSRoomTransferNo.hashCode() : 0;
        result = 31 * result + sRoomTransferSDetailId;
        return result;
    }
}
