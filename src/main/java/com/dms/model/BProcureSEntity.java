package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_procure_s", schema = "dbo", catalog = "logistics")
@IdClass(BProcureSEntityPK.class)
public class BProcureSEntity {
    private String bProcureSProcureNo;
    private String bProcureSLocationNo;
    private String bProcureSRoomNo;
    private String bProcureSGoodsNo;
    private BigDecimal bProcureSQuantity;
    private String bProcureSMfg;
    private String bProcureSExp;
    private String bProcureSLot;
    private String bProcureSModifiNo;
    private Timestamp bProcureSCreateDate;
    private String bProcureSCreateNo;
    private Timestamp bProcureSModifiTime;
    private String bProcureSGroupNodeId;
    private int bProcureSDetailId;
    private String bProcureSChecker;
    private Timestamp bProcureSCheckDate;
    private String bProcureSIsPass;
    private TGoodsEntity tGoodsByBProcureSGoodsNo;
    private TStaffEntity tStaffByBProcureSModifiNo;
    private TStaffEntity tStaffByBProcureSCreateNo;
    private TOrgEntity tOrgByBProcureSGroupNodeId;
    private TStaffEntity tStaffByBProcureSChecker;

    @Id
    @Column(name = "b_procure_s_procure_no", nullable = false, length = 16)
    public String getbProcureSProcureNo() {
        return bProcureSProcureNo;
    }

    public void setbProcureSProcureNo(String bProcureSProcureNo) {
        this.bProcureSProcureNo = bProcureSProcureNo;
    }

    @Basic
    @Column(name = "b_procure_s_location_no", nullable = false, length = 8)
    public String getbProcureSLocationNo() {
        return bProcureSLocationNo;
    }

    public void setbProcureSLocationNo(String bProcureSLocationNo) {
        this.bProcureSLocationNo = bProcureSLocationNo;
    }

    @Basic
    @Column(name = "b_procure_s_room_no", nullable = false, length = 8)
    public String getbProcureSRoomNo() {
        return bProcureSRoomNo;
    }

    public void setbProcureSRoomNo(String bProcureSRoomNo) {
        this.bProcureSRoomNo = bProcureSRoomNo;
    }

    @Basic
    @Column(name = "b_procure_s_goods_no", nullable = false, length = 20)
    public String getbProcureSGoodsNo() {
        return bProcureSGoodsNo;
    }

    public void setbProcureSGoodsNo(String bProcureSGoodsNo) {
        this.bProcureSGoodsNo = bProcureSGoodsNo;
    }

    @Basic
    @Column(name = "b_procure_s_quantity", nullable = false, precision = 6)
    public BigDecimal getbProcureSQuantity() {
        return bProcureSQuantity;
    }

    public void setbProcureSQuantity(BigDecimal bProcureSQuantity) {
        this.bProcureSQuantity = bProcureSQuantity;
    }

    @Basic
    @Column(name = "b_procure_s_MFG", nullable = false, length = 12)
    public String getbProcureSMfg() {
        return bProcureSMfg;
    }

    public void setbProcureSMfg(String bProcureSMfg) {
        this.bProcureSMfg = bProcureSMfg;
    }

    @Basic
    @Column(name = "b_procure_s_EXP", nullable = false, length = 12)
    public String getbProcureSExp() {
        return bProcureSExp;
    }

    public void setbProcureSExp(String bProcureSExp) {
        this.bProcureSExp = bProcureSExp;
    }

    @Basic
    @Column(name = "b_procure_s_LOT", nullable = true, length = 20)
    public String getbProcureSLot() {
        return bProcureSLot;
    }

    public void setbProcureSLot(String bProcureSLot) {
        this.bProcureSLot = bProcureSLot;
    }

    @Basic
    @Column(name = "b_procure_s_modifi_no", nullable = true, length = 8)
    public String getbProcureSModifiNo() {
        return bProcureSModifiNo;
    }

    public void setbProcureSModifiNo(String bProcureSModifiNo) {
        this.bProcureSModifiNo = bProcureSModifiNo;
    }

    @Basic
    @Column(name = "b_procure_s_create_date", nullable = true)
    public Timestamp getbProcureSCreateDate() {
        return bProcureSCreateDate;
    }

    public void setbProcureSCreateDate(Timestamp bProcureSCreateDate) {
        this.bProcureSCreateDate = bProcureSCreateDate;
    }

    @Basic
    @Column(name = "b_procure_s_create_no", nullable = true, length = 8)
    public String getbProcureSCreateNo() {
        return bProcureSCreateNo;
    }

    public void setbProcureSCreateNo(String bProcureSCreateNo) {
        this.bProcureSCreateNo = bProcureSCreateNo;
    }

    @Basic
    @Column(name = "b_procure_s_modifi_time", nullable = true)
    public Timestamp getbProcureSModifiTime() {
        return bProcureSModifiTime;
    }

    public void setbProcureSModifiTime(Timestamp bProcureSModifiTime) {
        this.bProcureSModifiTime = bProcureSModifiTime;
    }

    @Basic
    @Column(name = "b_procure_s_group_node_id", nullable = false, length = 20)
    public String getbProcureSGroupNodeId() {
        return bProcureSGroupNodeId;
    }

    public void setbProcureSGroupNodeId(String bProcureSGroupNodeId) {
        this.bProcureSGroupNodeId = bProcureSGroupNodeId;
    }

    @Id
    @Column(name = "b_procure_s_detail_id", nullable = false)
    public int getbProcureSDetailId() {
        return bProcureSDetailId;
    }

    public void setbProcureSDetailId(int bProcureSDetailId) {
        this.bProcureSDetailId = bProcureSDetailId;
    }

    @Basic
    @Column(name = "b_procure_s_checker", nullable = true, length = 8)
    public String getbProcureSChecker() {
        return bProcureSChecker;
    }

    public void setbProcureSChecker(String bProcureSChecker) {
        this.bProcureSChecker = bProcureSChecker;
    }

    @Basic
    @Column(name = "b_procure_s_check_date", nullable = true)
    public Timestamp getbProcureSCheckDate() {
        return bProcureSCheckDate;
    }

    public void setbProcureSCheckDate(Timestamp bProcureSCheckDate) {
        this.bProcureSCheckDate = bProcureSCheckDate;
    }

    @Basic
    @Column(name = "b_procure_s_isPass", nullable = true, length = -1)
    public String getbProcureSIsPass() {
        return bProcureSIsPass;
    }

    public void setbProcureSIsPass(String bProcureSIsPass) {
        this.bProcureSIsPass = bProcureSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BProcureSEntity that = (BProcureSEntity) o;

        if (bProcureSDetailId != that.bProcureSDetailId) return false;
        if (bProcureSProcureNo != null ? !bProcureSProcureNo.equals(that.bProcureSProcureNo) : that.bProcureSProcureNo != null)
            return false;
        if (bProcureSLocationNo != null ? !bProcureSLocationNo.equals(that.bProcureSLocationNo) : that.bProcureSLocationNo != null)
            return false;
        if (bProcureSRoomNo != null ? !bProcureSRoomNo.equals(that.bProcureSRoomNo) : that.bProcureSRoomNo != null)
            return false;
        if (bProcureSGoodsNo != null ? !bProcureSGoodsNo.equals(that.bProcureSGoodsNo) : that.bProcureSGoodsNo != null)
            return false;
        if (bProcureSQuantity != null ? !bProcureSQuantity.equals(that.bProcureSQuantity) : that.bProcureSQuantity != null)
            return false;
        if (bProcureSMfg != null ? !bProcureSMfg.equals(that.bProcureSMfg) : that.bProcureSMfg != null) return false;
        if (bProcureSExp != null ? !bProcureSExp.equals(that.bProcureSExp) : that.bProcureSExp != null) return false;
        if (bProcureSLot != null ? !bProcureSLot.equals(that.bProcureSLot) : that.bProcureSLot != null) return false;
        if (bProcureSModifiNo != null ? !bProcureSModifiNo.equals(that.bProcureSModifiNo) : that.bProcureSModifiNo != null)
            return false;
        if (bProcureSCreateDate != null ? !bProcureSCreateDate.equals(that.bProcureSCreateDate) : that.bProcureSCreateDate != null)
            return false;
        if (bProcureSCreateNo != null ? !bProcureSCreateNo.equals(that.bProcureSCreateNo) : that.bProcureSCreateNo != null)
            return false;
        if (bProcureSModifiTime != null ? !bProcureSModifiTime.equals(that.bProcureSModifiTime) : that.bProcureSModifiTime != null)
            return false;
        if (bProcureSGroupNodeId != null ? !bProcureSGroupNodeId.equals(that.bProcureSGroupNodeId) : that.bProcureSGroupNodeId != null)
            return false;
        if (bProcureSChecker != null ? !bProcureSChecker.equals(that.bProcureSChecker) : that.bProcureSChecker != null)
            return false;
        if (bProcureSCheckDate != null ? !bProcureSCheckDate.equals(that.bProcureSCheckDate) : that.bProcureSCheckDate != null)
            return false;
        if (bProcureSIsPass != null ? !bProcureSIsPass.equals(that.bProcureSIsPass) : that.bProcureSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bProcureSProcureNo != null ? bProcureSProcureNo.hashCode() : 0;
        result = 31 * result + (bProcureSLocationNo != null ? bProcureSLocationNo.hashCode() : 0);
        result = 31 * result + (bProcureSRoomNo != null ? bProcureSRoomNo.hashCode() : 0);
        result = 31 * result + (bProcureSGoodsNo != null ? bProcureSGoodsNo.hashCode() : 0);
        result = 31 * result + (bProcureSQuantity != null ? bProcureSQuantity.hashCode() : 0);
        result = 31 * result + (bProcureSMfg != null ? bProcureSMfg.hashCode() : 0);
        result = 31 * result + (bProcureSExp != null ? bProcureSExp.hashCode() : 0);
        result = 31 * result + (bProcureSLot != null ? bProcureSLot.hashCode() : 0);
        result = 31 * result + (bProcureSModifiNo != null ? bProcureSModifiNo.hashCode() : 0);
        result = 31 * result + (bProcureSCreateDate != null ? bProcureSCreateDate.hashCode() : 0);
        result = 31 * result + (bProcureSCreateNo != null ? bProcureSCreateNo.hashCode() : 0);
        result = 31 * result + (bProcureSModifiTime != null ? bProcureSModifiTime.hashCode() : 0);
        result = 31 * result + (bProcureSGroupNodeId != null ? bProcureSGroupNodeId.hashCode() : 0);
        result = 31 * result + bProcureSDetailId;
        result = 31 * result + (bProcureSChecker != null ? bProcureSChecker.hashCode() : 0);
        result = 31 * result + (bProcureSCheckDate != null ? bProcureSCheckDate.hashCode() : 0);
        result = 31 * result + (bProcureSIsPass != null ? bProcureSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByBProcureSGoodsNo() {
        return tGoodsByBProcureSGoodsNo;
    }

    public void settGoodsByBProcureSGoodsNo(TGoodsEntity tGoodsByBProcureSGoodsNo) {
        this.tGoodsByBProcureSGoodsNo = tGoodsByBProcureSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBProcureSModifiNo() {
        return tStaffByBProcureSModifiNo;
    }

    public void settStaffByBProcureSModifiNo(TStaffEntity tStaffByBProcureSModifiNo) {
        this.tStaffByBProcureSModifiNo = tStaffByBProcureSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBProcureSCreateNo() {
        return tStaffByBProcureSCreateNo;
    }

    public void settStaffByBProcureSCreateNo(TStaffEntity tStaffByBProcureSCreateNo) {
        this.tStaffByBProcureSCreateNo = tStaffByBProcureSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBProcureSGroupNodeId() {
        return tOrgByBProcureSGroupNodeId;
    }

    public void settOrgByBProcureSGroupNodeId(TOrgEntity tOrgByBProcureSGroupNodeId) {
        this.tOrgByBProcureSGroupNodeId = tOrgByBProcureSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBProcureSChecker() {
        return tStaffByBProcureSChecker;
    }

    public void settStaffByBProcureSChecker(TStaffEntity tStaffByBProcureSChecker) {
        this.tStaffByBProcureSChecker = tStaffByBProcureSChecker;
    }
}
