package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_breakage_s", schema = "dbo", catalog = "logistics")
@IdClass(SBreakageSEntityPK.class)
public class SBreakageSEntity {
    private String sBreakageSBreakageBillno;
    private int sBreakageSDetailId;
    private String sBreakageSRoomNo;
    private String sBreakageSLocationNo;
    private String sBreakageSGoodsNo;
    private String sBreakageSMfg;
    private String sBreakageSLot;
    private BigDecimal sBreakageSQuantity;
    private BigDecimal sBreakageSBoxQuantity;
    private BigDecimal sBreakageSBoxPrice;
    private BigDecimal sBreakageSDetailMoney;
    private String sBreakageSCreaterNo;
    private Timestamp sBreakageSCreateDate;
    private String sBreakageSModifiNo;
    private Timestamp sBreakageSModifiTime;
    private String sBreakageSChecker;
    private Timestamp sBreakageSCheckDate;
    private Timestamp sBreakageSInvoiceDate;
    private String sBreakageSIsPass;
    private TRoomEntity tRoomBySBreakageSRoomNo;
    private StoreLocationEntity storeLocationBySBreakageSLocationNo;
    private TGoodsEntity tGoodsBySBreakageSGoodsNo;
    private TStaffEntity tStaffBySBreakageSCreaterNo;
    private TStaffEntity tStaffBySBreakageSModifiNo;
    private TStaffEntity tStaffBySBreakageSChecker;

    @Id
    @Column(name = "s_breakage_s_breakage_billno", nullable = false, length = 16)
    public String getsBreakageSBreakageBillno() {
        return sBreakageSBreakageBillno;
    }

    public void setsBreakageSBreakageBillno(String sBreakageSBreakageBillno) {
        this.sBreakageSBreakageBillno = sBreakageSBreakageBillno;
    }

    @Id
    @Column(name = "s_breakage_s_detail_id", nullable = false)
    public int getsBreakageSDetailId() {
        return sBreakageSDetailId;
    }

    public void setsBreakageSDetailId(int sBreakageSDetailId) {
        this.sBreakageSDetailId = sBreakageSDetailId;
    }

    @Basic
    @Column(name = "s_breakage_s_room_no", nullable = false, length = 8)
    public String getsBreakageSRoomNo() {
        return sBreakageSRoomNo;
    }

    public void setsBreakageSRoomNo(String sBreakageSRoomNo) {
        this.sBreakageSRoomNo = sBreakageSRoomNo;
    }

    @Basic
    @Column(name = "s_breakage_s_location_no", nullable = false, length = 8)
    public String getsBreakageSLocationNo() {
        return sBreakageSLocationNo;
    }

    public void setsBreakageSLocationNo(String sBreakageSLocationNo) {
        this.sBreakageSLocationNo = sBreakageSLocationNo;
    }

    @Basic
    @Column(name = "s_breakage_s_goods_no", nullable = false, length = 20)
    public String getsBreakageSGoodsNo() {
        return sBreakageSGoodsNo;
    }

    public void setsBreakageSGoodsNo(String sBreakageSGoodsNo) {
        this.sBreakageSGoodsNo = sBreakageSGoodsNo;
    }

    @Basic
    @Column(name = "s_breakage_s_MFG", nullable = false, length = 12)
    public String getsBreakageSMfg() {
        return sBreakageSMfg;
    }

    public void setsBreakageSMfg(String sBreakageSMfg) {
        this.sBreakageSMfg = sBreakageSMfg;
    }

    @Basic
    @Column(name = "s_breakage_s_LOT", nullable = false, length = 20)
    public String getsBreakageSLot() {
        return sBreakageSLot;
    }

    public void setsBreakageSLot(String sBreakageSLot) {
        this.sBreakageSLot = sBreakageSLot;
    }

    @Basic
    @Column(name = "s_breakage_s_quantity", nullable = true, precision = 4)
    public BigDecimal getsBreakageSQuantity() {
        return sBreakageSQuantity;
    }

    public void setsBreakageSQuantity(BigDecimal sBreakageSQuantity) {
        this.sBreakageSQuantity = sBreakageSQuantity;
    }

    @Basic
    @Column(name = "s_breakage_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getsBreakageSBoxQuantity() {
        return sBreakageSBoxQuantity;
    }

    public void setsBreakageSBoxQuantity(BigDecimal sBreakageSBoxQuantity) {
        this.sBreakageSBoxQuantity = sBreakageSBoxQuantity;
    }

    @Basic
    @Column(name = "s_breakage_s_box_price", nullable = true, precision = 4)
    public BigDecimal getsBreakageSBoxPrice() {
        return sBreakageSBoxPrice;
    }

    public void setsBreakageSBoxPrice(BigDecimal sBreakageSBoxPrice) {
        this.sBreakageSBoxPrice = sBreakageSBoxPrice;
    }

    @Basic
    @Column(name = "s_breakage_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getsBreakageSDetailMoney() {
        return sBreakageSDetailMoney;
    }

    public void setsBreakageSDetailMoney(BigDecimal sBreakageSDetailMoney) {
        this.sBreakageSDetailMoney = sBreakageSDetailMoney;
    }

    @Basic
    @Column(name = "s_breakage_s_creater_no", nullable = true, length = 8)
    public String getsBreakageSCreaterNo() {
        return sBreakageSCreaterNo;
    }

    public void setsBreakageSCreaterNo(String sBreakageSCreaterNo) {
        this.sBreakageSCreaterNo = sBreakageSCreaterNo;
    }

    @Basic
    @Column(name = "s_breakage_s_create_date", nullable = true)
    public Timestamp getsBreakageSCreateDate() {
        return sBreakageSCreateDate;
    }

    public void setsBreakageSCreateDate(Timestamp sBreakageSCreateDate) {
        this.sBreakageSCreateDate = sBreakageSCreateDate;
    }

    @Basic
    @Column(name = "s_breakage_s_modifi_no", nullable = true, length = 8)
    public String getsBreakageSModifiNo() {
        return sBreakageSModifiNo;
    }

    public void setsBreakageSModifiNo(String sBreakageSModifiNo) {
        this.sBreakageSModifiNo = sBreakageSModifiNo;
    }

    @Basic
    @Column(name = "s_breakage_s_modifi_time", nullable = true)
    public Timestamp getsBreakageSModifiTime() {
        return sBreakageSModifiTime;
    }

    public void setsBreakageSModifiTime(Timestamp sBreakageSModifiTime) {
        this.sBreakageSModifiTime = sBreakageSModifiTime;
    }

    @Basic
    @Column(name = "s_breakage_s_checker", nullable = true, length = 8)
    public String getsBreakageSChecker() {
        return sBreakageSChecker;
    }

    public void setsBreakageSChecker(String sBreakageSChecker) {
        this.sBreakageSChecker = sBreakageSChecker;
    }

    @Basic
    @Column(name = "s_breakage_s_check_date", nullable = true)
    public Timestamp getsBreakageSCheckDate() {
        return sBreakageSCheckDate;
    }

    public void setsBreakageSCheckDate(Timestamp sBreakageSCheckDate) {
        this.sBreakageSCheckDate = sBreakageSCheckDate;
    }

    @Basic
    @Column(name = "s_breakage_s_invoice_date", nullable = true)
    public Timestamp getsBreakageSInvoiceDate() {
        return sBreakageSInvoiceDate;
    }

    public void setsBreakageSInvoiceDate(Timestamp sBreakageSInvoiceDate) {
        this.sBreakageSInvoiceDate = sBreakageSInvoiceDate;
    }

    @Basic
    @Column(name = "s_breakage_s_isPass", nullable = true, length = -1)
    public String getsBreakageSIsPass() {
        return sBreakageSIsPass;
    }

    public void setsBreakageSIsPass(String sBreakageSIsPass) {
        this.sBreakageSIsPass = sBreakageSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SBreakageSEntity that = (SBreakageSEntity) o;

        if (sBreakageSDetailId != that.sBreakageSDetailId) return false;
        if (sBreakageSBreakageBillno != null ? !sBreakageSBreakageBillno.equals(that.sBreakageSBreakageBillno) : that.sBreakageSBreakageBillno != null)
            return false;
        if (sBreakageSRoomNo != null ? !sBreakageSRoomNo.equals(that.sBreakageSRoomNo) : that.sBreakageSRoomNo != null)
            return false;
        if (sBreakageSLocationNo != null ? !sBreakageSLocationNo.equals(that.sBreakageSLocationNo) : that.sBreakageSLocationNo != null)
            return false;
        if (sBreakageSGoodsNo != null ? !sBreakageSGoodsNo.equals(that.sBreakageSGoodsNo) : that.sBreakageSGoodsNo != null)
            return false;
        if (sBreakageSMfg != null ? !sBreakageSMfg.equals(that.sBreakageSMfg) : that.sBreakageSMfg != null)
            return false;
        if (sBreakageSLot != null ? !sBreakageSLot.equals(that.sBreakageSLot) : that.sBreakageSLot != null)
            return false;
        if (sBreakageSQuantity != null ? !sBreakageSQuantity.equals(that.sBreakageSQuantity) : that.sBreakageSQuantity != null)
            return false;
        if (sBreakageSBoxQuantity != null ? !sBreakageSBoxQuantity.equals(that.sBreakageSBoxQuantity) : that.sBreakageSBoxQuantity != null)
            return false;
        if (sBreakageSBoxPrice != null ? !sBreakageSBoxPrice.equals(that.sBreakageSBoxPrice) : that.sBreakageSBoxPrice != null)
            return false;
        if (sBreakageSDetailMoney != null ? !sBreakageSDetailMoney.equals(that.sBreakageSDetailMoney) : that.sBreakageSDetailMoney != null)
            return false;
        if (sBreakageSCreaterNo != null ? !sBreakageSCreaterNo.equals(that.sBreakageSCreaterNo) : that.sBreakageSCreaterNo != null)
            return false;
        if (sBreakageSCreateDate != null ? !sBreakageSCreateDate.equals(that.sBreakageSCreateDate) : that.sBreakageSCreateDate != null)
            return false;
        if (sBreakageSModifiNo != null ? !sBreakageSModifiNo.equals(that.sBreakageSModifiNo) : that.sBreakageSModifiNo != null)
            return false;
        if (sBreakageSModifiTime != null ? !sBreakageSModifiTime.equals(that.sBreakageSModifiTime) : that.sBreakageSModifiTime != null)
            return false;
        if (sBreakageSChecker != null ? !sBreakageSChecker.equals(that.sBreakageSChecker) : that.sBreakageSChecker != null)
            return false;
        if (sBreakageSCheckDate != null ? !sBreakageSCheckDate.equals(that.sBreakageSCheckDate) : that.sBreakageSCheckDate != null)
            return false;
        if (sBreakageSInvoiceDate != null ? !sBreakageSInvoiceDate.equals(that.sBreakageSInvoiceDate) : that.sBreakageSInvoiceDate != null)
            return false;
        if (sBreakageSIsPass != null ? !sBreakageSIsPass.equals(that.sBreakageSIsPass) : that.sBreakageSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sBreakageSBreakageBillno != null ? sBreakageSBreakageBillno.hashCode() : 0;
        result = 31 * result + sBreakageSDetailId;
        result = 31 * result + (sBreakageSRoomNo != null ? sBreakageSRoomNo.hashCode() : 0);
        result = 31 * result + (sBreakageSLocationNo != null ? sBreakageSLocationNo.hashCode() : 0);
        result = 31 * result + (sBreakageSGoodsNo != null ? sBreakageSGoodsNo.hashCode() : 0);
        result = 31 * result + (sBreakageSMfg != null ? sBreakageSMfg.hashCode() : 0);
        result = 31 * result + (sBreakageSLot != null ? sBreakageSLot.hashCode() : 0);
        result = 31 * result + (sBreakageSQuantity != null ? sBreakageSQuantity.hashCode() : 0);
        result = 31 * result + (sBreakageSBoxQuantity != null ? sBreakageSBoxQuantity.hashCode() : 0);
        result = 31 * result + (sBreakageSBoxPrice != null ? sBreakageSBoxPrice.hashCode() : 0);
        result = 31 * result + (sBreakageSDetailMoney != null ? sBreakageSDetailMoney.hashCode() : 0);
        result = 31 * result + (sBreakageSCreaterNo != null ? sBreakageSCreaterNo.hashCode() : 0);
        result = 31 * result + (sBreakageSCreateDate != null ? sBreakageSCreateDate.hashCode() : 0);
        result = 31 * result + (sBreakageSModifiNo != null ? sBreakageSModifiNo.hashCode() : 0);
        result = 31 * result + (sBreakageSModifiTime != null ? sBreakageSModifiTime.hashCode() : 0);
        result = 31 * result + (sBreakageSChecker != null ? sBreakageSChecker.hashCode() : 0);
        result = 31 * result + (sBreakageSCheckDate != null ? sBreakageSCheckDate.hashCode() : 0);
        result = 31 * result + (sBreakageSInvoiceDate != null ? sBreakageSInvoiceDate.hashCode() : 0);
        result = 31 * result + (sBreakageSIsPass != null ? sBreakageSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_room_no", referencedColumnName = "t_room_room_no", nullable = false,insertable = false, updatable = false)
    public TRoomEntity gettRoomBySBreakageSRoomNo() {
        return tRoomBySBreakageSRoomNo;
    }

    public void settRoomBySBreakageSRoomNo(TRoomEntity tRoomBySBreakageSRoomNo) {
        this.tRoomBySBreakageSRoomNo = tRoomBySBreakageSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_location_no", referencedColumnName = "store_location_location_no", nullable = false,insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationBySBreakageSLocationNo() {
        return storeLocationBySBreakageSLocationNo;
    }

    public void setStoreLocationBySBreakageSLocationNo(StoreLocationEntity storeLocationBySBreakageSLocationNo) {
        this.storeLocationBySBreakageSLocationNo = storeLocationBySBreakageSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsBySBreakageSGoodsNo() {
        return tGoodsBySBreakageSGoodsNo;
    }

    public void settGoodsBySBreakageSGoodsNo(TGoodsEntity tGoodsBySBreakageSGoodsNo) {
        this.tGoodsBySBreakageSGoodsNo = tGoodsBySBreakageSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySBreakageSCreaterNo() {
        return tStaffBySBreakageSCreaterNo;
    }

    public void settStaffBySBreakageSCreaterNo(TStaffEntity tStaffBySBreakageSCreaterNo) {
        this.tStaffBySBreakageSCreaterNo = tStaffBySBreakageSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySBreakageSModifiNo() {
        return tStaffBySBreakageSModifiNo;
    }

    public void settStaffBySBreakageSModifiNo(TStaffEntity tStaffBySBreakageSModifiNo) {
        this.tStaffBySBreakageSModifiNo = tStaffBySBreakageSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySBreakageSChecker() {
        return tStaffBySBreakageSChecker;
    }

    public void settStaffBySBreakageSChecker(TStaffEntity tStaffBySBreakageSChecker) {
        this.tStaffBySBreakageSChecker = tStaffBySBreakageSChecker;
    }
}
