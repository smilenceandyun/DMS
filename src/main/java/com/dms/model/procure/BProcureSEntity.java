package com.dms.model.procure;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_procure_s", schema = "dbo", catalog = "logistics_test")
@IdClass(BProcureSEntityPK.class)
public class BProcureSEntity {
    private String procureNo;
    private String locationNo;
    private String roomNo;
    private BigDecimal quantity;
    private String mfg;
    private String exp;
    private String lot;
    private Timestamp createDate;
    private Timestamp modifiTime;
    private int detailId;

    public BProcureSEntity(){ }
    @Id
    @Column(name = "procure_no")
    public String getProcureNo() {
        return procureNo;
    }

    public void setProcureNo(String procureNo) {
        this.procureNo = procureNo;
    }

    @Basic
    @Column(name = "location_no")
    public String getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    @Basic
    @Column(name = "room_no")
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Basic
    @Column(name = "quantity")
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "MFG")
    public String getMfg() {
        return mfg;
    }

    public void setMfg(String mfg) {
        this.mfg = mfg;
    }

    @Basic
    @Column(name = "EXP")
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "LOT")
    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifi_time")
    public Timestamp getModifiTime() {
        return modifiTime;
    }

    public void setModifiTime(Timestamp modifiTime) {
        this.modifiTime = modifiTime;
    }

    @Id
    @Column(name = "detail_id")
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

        BProcureSEntity that = (BProcureSEntity) o;

        if (detailId != that.detailId) return false;
        if (procureNo != null ? !procureNo.equals(that.procureNo) : that.procureNo != null) return false;
        if (locationNo != null ? !locationNo.equals(that.locationNo) : that.locationNo != null) return false;
        if (roomNo != null ? !roomNo.equals(that.roomNo) : that.roomNo != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (mfg != null ? !mfg.equals(that.mfg) : that.mfg != null) return false;
        if (exp != null ? !exp.equals(that.exp) : that.exp != null) return false;
        if (lot != null ? !lot.equals(that.lot) : that.lot != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifiTime != null ? !modifiTime.equals(that.modifiTime) : that.modifiTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = procureNo != null ? procureNo.hashCode() : 0;
        result = 31 * result + (locationNo != null ? locationNo.hashCode() : 0);
        result = 31 * result + (roomNo != null ? roomNo.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (mfg != null ? mfg.hashCode() : 0);
        result = 31 * result + (exp != null ? exp.hashCode() : 0);
        result = 31 * result + (lot != null ? lot.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifiTime != null ? modifiTime.hashCode() : 0);
        result = 31 * result + detailId;
        return result;
    }
}
