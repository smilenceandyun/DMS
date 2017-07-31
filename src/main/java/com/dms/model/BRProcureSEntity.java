package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_r_procure_s", schema = "dbo", catalog = "logistics")
@IdClass(BRProcureSEntityPK.class)
public class BRProcureSEntity {
    private String bRProcureSRProcureNo;
    private String bRProcureSOrdProcureNo;
    private String bRProcureSLocationNo;
    private int bRProcureSDetailId;
    private BigDecimal bRProcureSQuantity;
    private BigDecimal bRProcureSBoxQuantity;
    private String bRProcureSRoomNo;
    private String bRProcureSGoodsNo;
    private BigDecimal bRProcureSDetailMoney;
    private Timestamp bRProcureSCreateDate;
    private String bRProcureSCreateNo;
    private String bRProcureSModifiNo;
    private Timestamp bRProcureSModifiTime;
    private String bRProcureSChecker;
    private Timestamp bRProcureSCheckDate;
    private String bRProcureSIsPass;
    private BPurchaseOrdSEntity bPurchaseOrdS;
    private TStaffEntity tStaffByBRProcureSCreateNo;
    private TStaffEntity tStaffByBRProcureSModifiNo;
    private TStaffEntity tStaffByBRProcureSChecker;

    @Id
    @Column(name = "b_r_procure_s_r_procure_no", nullable = false, length = 16)
    public String getbRProcureSRProcureNo() {
        return bRProcureSRProcureNo;
    }

    public void setbRProcureSRProcureNo(String bRProcureSRProcureNo) {
        this.bRProcureSRProcureNo = bRProcureSRProcureNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_ord_procure_no", nullable = true, length = 16)
    public String getbRProcureSOrdProcureNo() {
        return bRProcureSOrdProcureNo;
    }

    public void setbRProcureSOrdProcureNo(String bRProcureSOrdProcureNo) {
        this.bRProcureSOrdProcureNo = bRProcureSOrdProcureNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_location_no", nullable = true, length = 8)
    public String getbRProcureSLocationNo() {
        return bRProcureSLocationNo;
    }

    public void setbRProcureSLocationNo(String bRProcureSLocationNo) {
        this.bRProcureSLocationNo = bRProcureSLocationNo;
    }

    @Id
    @Column(name = "b_r_procure_s_detail_id", nullable = false)
    public int getbRProcureSDetailId() {
        return bRProcureSDetailId;
    }

    public void setbRProcureSDetailId(int bRProcureSDetailId) {
        this.bRProcureSDetailId = bRProcureSDetailId;
    }

    @Basic
    @Column(name = "b_r_procure_s_quantity", nullable = false, precision = 6)
    public BigDecimal getbRProcureSQuantity() {
        return bRProcureSQuantity;
    }

    public void setbRProcureSQuantity(BigDecimal bRProcureSQuantity) {
        this.bRProcureSQuantity = bRProcureSQuantity;
    }

    @Basic
    @Column(name = "b_r_procure_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getbRProcureSBoxQuantity() {
        return bRProcureSBoxQuantity;
    }

    public void setbRProcureSBoxQuantity(BigDecimal bRProcureSBoxQuantity) {
        this.bRProcureSBoxQuantity = bRProcureSBoxQuantity;
    }

    @Basic
    @Column(name = "b_r_procure_s_room_no", nullable = true, length = 8)
    public String getbRProcureSRoomNo() {
        return bRProcureSRoomNo;
    }

    public void setbRProcureSRoomNo(String bRProcureSRoomNo) {
        this.bRProcureSRoomNo = bRProcureSRoomNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_goods_no", nullable = true, length = 20)
    public String getbRProcureSGoodsNo() {
        return bRProcureSGoodsNo;
    }

    public void setbRProcureSGoodsNo(String bRProcureSGoodsNo) {
        this.bRProcureSGoodsNo = bRProcureSGoodsNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getbRProcureSDetailMoney() {
        return bRProcureSDetailMoney;
    }

    public void setbRProcureSDetailMoney(BigDecimal bRProcureSDetailMoney) {
        this.bRProcureSDetailMoney = bRProcureSDetailMoney;
    }

    @Basic
    @Column(name = "b_r_procure_s_create_date", nullable = true)
    public Timestamp getbRProcureSCreateDate() {
        return bRProcureSCreateDate;
    }

    public void setbRProcureSCreateDate(Timestamp bRProcureSCreateDate) {
        this.bRProcureSCreateDate = bRProcureSCreateDate;
    }

    @Basic
    @Column(name = "b_r_procure_s_create_no", nullable = true, length = 8)
    public String getbRProcureSCreateNo() {
        return bRProcureSCreateNo;
    }

    public void setbRProcureSCreateNo(String bRProcureSCreateNo) {
        this.bRProcureSCreateNo = bRProcureSCreateNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_modifi_no", nullable = true, length = 8)
    public String getbRProcureSModifiNo() {
        return bRProcureSModifiNo;
    }

    public void setbRProcureSModifiNo(String bRProcureSModifiNo) {
        this.bRProcureSModifiNo = bRProcureSModifiNo;
    }

    @Basic
    @Column(name = "b_r_procure_s_modifi_time", nullable = true)
    public Timestamp getbRProcureSModifiTime() {
        return bRProcureSModifiTime;
    }

    public void setbRProcureSModifiTime(Timestamp bRProcureSModifiTime) {
        this.bRProcureSModifiTime = bRProcureSModifiTime;
    }

    @Basic
    @Column(name = "b_r_procure_s_checker", nullable = true, length = 8)
    public String getbRProcureSChecker() {
        return bRProcureSChecker;
    }

    public void setbRProcureSChecker(String bRProcureSChecker) {
        this.bRProcureSChecker = bRProcureSChecker;
    }

    @Basic
    @Column(name = "b_r_procure_s_check_date", nullable = true)
    public Timestamp getbRProcureSCheckDate() {
        return bRProcureSCheckDate;
    }

    public void setbRProcureSCheckDate(Timestamp bRProcureSCheckDate) {
        this.bRProcureSCheckDate = bRProcureSCheckDate;
    }

    @Basic
    @Column(name = "b_r_procure_s_isPass", nullable = true, length = -1)
    public String getbRProcureSIsPass() {
        return bRProcureSIsPass;
    }

    public void setbRProcureSIsPass(String bRProcureSIsPass) {
        this.bRProcureSIsPass = bRProcureSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BRProcureSEntity that = (BRProcureSEntity) o;

        if (bRProcureSDetailId != that.bRProcureSDetailId) return false;
        if (bRProcureSRProcureNo != null ? !bRProcureSRProcureNo.equals(that.bRProcureSRProcureNo) : that.bRProcureSRProcureNo != null)
            return false;
        if (bRProcureSOrdProcureNo != null ? !bRProcureSOrdProcureNo.equals(that.bRProcureSOrdProcureNo) : that.bRProcureSOrdProcureNo != null)
            return false;
        if (bRProcureSLocationNo != null ? !bRProcureSLocationNo.equals(that.bRProcureSLocationNo) : that.bRProcureSLocationNo != null)
            return false;
        if (bRProcureSQuantity != null ? !bRProcureSQuantity.equals(that.bRProcureSQuantity) : that.bRProcureSQuantity != null)
            return false;
        if (bRProcureSBoxQuantity != null ? !bRProcureSBoxQuantity.equals(that.bRProcureSBoxQuantity) : that.bRProcureSBoxQuantity != null)
            return false;
        if (bRProcureSRoomNo != null ? !bRProcureSRoomNo.equals(that.bRProcureSRoomNo) : that.bRProcureSRoomNo != null)
            return false;
        if (bRProcureSGoodsNo != null ? !bRProcureSGoodsNo.equals(that.bRProcureSGoodsNo) : that.bRProcureSGoodsNo != null)
            return false;
        if (bRProcureSDetailMoney != null ? !bRProcureSDetailMoney.equals(that.bRProcureSDetailMoney) : that.bRProcureSDetailMoney != null)
            return false;
        if (bRProcureSCreateDate != null ? !bRProcureSCreateDate.equals(that.bRProcureSCreateDate) : that.bRProcureSCreateDate != null)
            return false;
        if (bRProcureSCreateNo != null ? !bRProcureSCreateNo.equals(that.bRProcureSCreateNo) : that.bRProcureSCreateNo != null)
            return false;
        if (bRProcureSModifiNo != null ? !bRProcureSModifiNo.equals(that.bRProcureSModifiNo) : that.bRProcureSModifiNo != null)
            return false;
        if (bRProcureSModifiTime != null ? !bRProcureSModifiTime.equals(that.bRProcureSModifiTime) : that.bRProcureSModifiTime != null)
            return false;
        if (bRProcureSChecker != null ? !bRProcureSChecker.equals(that.bRProcureSChecker) : that.bRProcureSChecker != null)
            return false;
        if (bRProcureSCheckDate != null ? !bRProcureSCheckDate.equals(that.bRProcureSCheckDate) : that.bRProcureSCheckDate != null)
            return false;
        if (bRProcureSIsPass != null ? !bRProcureSIsPass.equals(that.bRProcureSIsPass) : that.bRProcureSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bRProcureSRProcureNo != null ? bRProcureSRProcureNo.hashCode() : 0;
        result = 31 * result + (bRProcureSOrdProcureNo != null ? bRProcureSOrdProcureNo.hashCode() : 0);
        result = 31 * result + (bRProcureSLocationNo != null ? bRProcureSLocationNo.hashCode() : 0);
        result = 31 * result + bRProcureSDetailId;
        result = 31 * result + (bRProcureSQuantity != null ? bRProcureSQuantity.hashCode() : 0);
        result = 31 * result + (bRProcureSBoxQuantity != null ? bRProcureSBoxQuantity.hashCode() : 0);
        result = 31 * result + (bRProcureSRoomNo != null ? bRProcureSRoomNo.hashCode() : 0);
        result = 31 * result + (bRProcureSGoodsNo != null ? bRProcureSGoodsNo.hashCode() : 0);
        result = 31 * result + (bRProcureSDetailMoney != null ? bRProcureSDetailMoney.hashCode() : 0);
        result = 31 * result + (bRProcureSCreateDate != null ? bRProcureSCreateDate.hashCode() : 0);
        result = 31 * result + (bRProcureSCreateNo != null ? bRProcureSCreateNo.hashCode() : 0);
        result = 31 * result + (bRProcureSModifiNo != null ? bRProcureSModifiNo.hashCode() : 0);
        result = 31 * result + (bRProcureSModifiTime != null ? bRProcureSModifiTime.hashCode() : 0);
        result = 31 * result + (bRProcureSChecker != null ? bRProcureSChecker.hashCode() : 0);
        result = 31 * result + (bRProcureSCheckDate != null ? bRProcureSCheckDate.hashCode() : 0);
        result = 31 * result + (bRProcureSIsPass != null ? bRProcureSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "b_r_procure_s_ord_procure_no", referencedColumnName = "b_purchase_ord_s_ord_procure_no", nullable = false,insertable = false, updatable = false), @JoinColumn(name = "b_r_procure_s_detail_id", referencedColumnName = "b_purchase_ord_s_detail_id", nullable = false,insertable = false, updatable = false)})
    public BPurchaseOrdSEntity getbPurchaseOrdS() {
        return bPurchaseOrdS;
    }

    public void setbPurchaseOrdS(BPurchaseOrdSEntity bPurchaseOrdS) {
        this.bPurchaseOrdS = bPurchaseOrdS;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBRProcureSCreateNo() {
        return tStaffByBRProcureSCreateNo;
    }

    public void settStaffByBRProcureSCreateNo(TStaffEntity tStaffByBRProcureSCreateNo) {
        this.tStaffByBRProcureSCreateNo = tStaffByBRProcureSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBRProcureSModifiNo() {
        return tStaffByBRProcureSModifiNo;
    }

    public void settStaffByBRProcureSModifiNo(TStaffEntity tStaffByBRProcureSModifiNo) {
        this.tStaffByBRProcureSModifiNo = tStaffByBRProcureSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBRProcureSChecker() {
        return tStaffByBRProcureSChecker;
    }

    public void settStaffByBRProcureSChecker(TStaffEntity tStaffByBRProcureSChecker) {
        this.tStaffByBRProcureSChecker = tStaffByBRProcureSChecker;
    }
}
