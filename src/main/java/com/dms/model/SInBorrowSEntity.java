package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_in_borrow_s", schema = "dbo", catalog = "logistics")
public class SInBorrowSEntity {
    private String sInBorrowSInBorrowNo;
    private String sInBorrowSRoomNo;
    private String sInBorrowSLocationNo;
    private String sInBorrowSGoodsNo;
    private String sInBorrowSMfg;
    private String sInBorrowSLot;
    private BigDecimal sInBorrowSQuantity;
    private BigDecimal sInBorrowSBoxQuantity;
    private BigDecimal sInBorrowSBoxPrice;
    private BigDecimal sInBorrowSDetailMoney;
    private BigDecimal sInBorrowSTaxRate;
    private Integer sInBorrowSStock;
    private int sInBorrowSDetailId;
    private BigDecimal sInBorrowSOriginalPrice;
    private String sInBorrowSPresentationProperty;
    private Timestamp sInBorrowSInvoiceDate;
    private String sInBorrowSCreaterNo;
    private Timestamp sInBorrowSCreateDate;
    private String sInBorrowSModifiNo;
    private Timestamp sInBorrowSModifiTime;
    private String sInBorrowSChecker;
    private Timestamp sInBorrowSCheckDate;
    private String sInBorrowSIsPass;
    private TRoomEntity tRoomBySInBorrowSRoomNo;
    private StoreLocationEntity storeLocationBySInBorrowSLocationNo;
    private TGoodsEntity tGoodsBySInBorrowSGoodsNo;
    private TStaffEntity tStaffBySInBorrowSCreaterNo;
    private TStaffEntity tStaffBySInBorrowSModifiNo;
    private TStaffEntity tStaffBySInBorrowSChecker;

    @Id
    @Column(name = "s_in_borrow_s_in_borrow_no", nullable = false, length = 16)
    public String getsInBorrowSInBorrowNo() {
        return sInBorrowSInBorrowNo;
    }

    public void setsInBorrowSInBorrowNo(String sInBorrowSInBorrowNo) {
        this.sInBorrowSInBorrowNo = sInBorrowSInBorrowNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_room_no", nullable = false, length = 8)
    public String getsInBorrowSRoomNo() {
        return sInBorrowSRoomNo;
    }

    public void setsInBorrowSRoomNo(String sInBorrowSRoomNo) {
        this.sInBorrowSRoomNo = sInBorrowSRoomNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_location_no", nullable = false, length = 8)
    public String getsInBorrowSLocationNo() {
        return sInBorrowSLocationNo;
    }

    public void setsInBorrowSLocationNo(String sInBorrowSLocationNo) {
        this.sInBorrowSLocationNo = sInBorrowSLocationNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_goods_no", nullable = false, length = 20)
    public String getsInBorrowSGoodsNo() {
        return sInBorrowSGoodsNo;
    }

    public void setsInBorrowSGoodsNo(String sInBorrowSGoodsNo) {
        this.sInBorrowSGoodsNo = sInBorrowSGoodsNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_MFG", nullable = false, length = 12)
    public String getsInBorrowSMfg() {
        return sInBorrowSMfg;
    }

    public void setsInBorrowSMfg(String sInBorrowSMfg) {
        this.sInBorrowSMfg = sInBorrowSMfg;
    }

    @Basic
    @Column(name = "s_in_borrow_s_LOT", nullable = false, length = 20)
    public String getsInBorrowSLot() {
        return sInBorrowSLot;
    }

    public void setsInBorrowSLot(String sInBorrowSLot) {
        this.sInBorrowSLot = sInBorrowSLot;
    }

    @Basic
    @Column(name = "s_in_borrow_s_quantity", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSQuantity() {
        return sInBorrowSQuantity;
    }

    public void setsInBorrowSQuantity(BigDecimal sInBorrowSQuantity) {
        this.sInBorrowSQuantity = sInBorrowSQuantity;
    }

    @Basic
    @Column(name = "s_in_borrow_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSBoxQuantity() {
        return sInBorrowSBoxQuantity;
    }

    public void setsInBorrowSBoxQuantity(BigDecimal sInBorrowSBoxQuantity) {
        this.sInBorrowSBoxQuantity = sInBorrowSBoxQuantity;
    }

    @Basic
    @Column(name = "s_in_borrow_s_box_price", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSBoxPrice() {
        return sInBorrowSBoxPrice;
    }

    public void setsInBorrowSBoxPrice(BigDecimal sInBorrowSBoxPrice) {
        this.sInBorrowSBoxPrice = sInBorrowSBoxPrice;
    }

    @Basic
    @Column(name = "s_in_borrow_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSDetailMoney() {
        return sInBorrowSDetailMoney;
    }

    public void setsInBorrowSDetailMoney(BigDecimal sInBorrowSDetailMoney) {
        this.sInBorrowSDetailMoney = sInBorrowSDetailMoney;
    }

    @Basic
    @Column(name = "s_in_borrow_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSTaxRate() {
        return sInBorrowSTaxRate;
    }

    public void setsInBorrowSTaxRate(BigDecimal sInBorrowSTaxRate) {
        this.sInBorrowSTaxRate = sInBorrowSTaxRate;
    }

    @Basic
    @Column(name = "s_in_borrow_s_Stock", nullable = true)
    public Integer getsInBorrowSStock() {
        return sInBorrowSStock;
    }

    public void setsInBorrowSStock(Integer sInBorrowSStock) {
        this.sInBorrowSStock = sInBorrowSStock;
    }

    @Basic
    @Column(name = "s_in_borrow_s_detail_id", nullable = false)
    public int getsInBorrowSDetailId() {
        return sInBorrowSDetailId;
    }

    public void setsInBorrowSDetailId(int sInBorrowSDetailId) {
        this.sInBorrowSDetailId = sInBorrowSDetailId;
    }

    @Basic
    @Column(name = "s_in_borrow_s_original_price", nullable = true, precision = 4)
    public BigDecimal getsInBorrowSOriginalPrice() {
        return sInBorrowSOriginalPrice;
    }

    public void setsInBorrowSOriginalPrice(BigDecimal sInBorrowSOriginalPrice) {
        this.sInBorrowSOriginalPrice = sInBorrowSOriginalPrice;
    }

    @Basic
    @Column(name = "s_in_borrow_s_presentation_property", nullable = true, length = 4)
    public String getsInBorrowSPresentationProperty() {
        return sInBorrowSPresentationProperty;
    }

    public void setsInBorrowSPresentationProperty(String sInBorrowSPresentationProperty) {
        this.sInBorrowSPresentationProperty = sInBorrowSPresentationProperty;
    }

    @Basic
    @Column(name = "s_in_borrow_s_invoice_date", nullable = true)
    public Timestamp getsInBorrowSInvoiceDate() {
        return sInBorrowSInvoiceDate;
    }

    public void setsInBorrowSInvoiceDate(Timestamp sInBorrowSInvoiceDate) {
        this.sInBorrowSInvoiceDate = sInBorrowSInvoiceDate;
    }

    @Basic
    @Column(name = "s_in_borrow_s_creater_no", nullable = true, length = 8)
    public String getsInBorrowSCreaterNo() {
        return sInBorrowSCreaterNo;
    }

    public void setsInBorrowSCreaterNo(String sInBorrowSCreaterNo) {
        this.sInBorrowSCreaterNo = sInBorrowSCreaterNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_create_date", nullable = true)
    public Timestamp getsInBorrowSCreateDate() {
        return sInBorrowSCreateDate;
    }

    public void setsInBorrowSCreateDate(Timestamp sInBorrowSCreateDate) {
        this.sInBorrowSCreateDate = sInBorrowSCreateDate;
    }

    @Basic
    @Column(name = "s_in_borrow_s_modifi_no", nullable = true, length = 8)
    public String getsInBorrowSModifiNo() {
        return sInBorrowSModifiNo;
    }

    public void setsInBorrowSModifiNo(String sInBorrowSModifiNo) {
        this.sInBorrowSModifiNo = sInBorrowSModifiNo;
    }

    @Basic
    @Column(name = "s_in_borrow_s_modifi_time", nullable = true)
    public Timestamp getsInBorrowSModifiTime() {
        return sInBorrowSModifiTime;
    }

    public void setsInBorrowSModifiTime(Timestamp sInBorrowSModifiTime) {
        this.sInBorrowSModifiTime = sInBorrowSModifiTime;
    }

    @Basic
    @Column(name = "s_in_borrow_s_checker", nullable = true, length = 8)
    public String getsInBorrowSChecker() {
        return sInBorrowSChecker;
    }

    public void setsInBorrowSChecker(String sInBorrowSChecker) {
        this.sInBorrowSChecker = sInBorrowSChecker;
    }

    @Basic
    @Column(name = "s_in_borrow_s_check_date", nullable = true)
    public Timestamp getsInBorrowSCheckDate() {
        return sInBorrowSCheckDate;
    }

    public void setsInBorrowSCheckDate(Timestamp sInBorrowSCheckDate) {
        this.sInBorrowSCheckDate = sInBorrowSCheckDate;
    }

    @Basic
    @Column(name = "s_in_borrow_s_isPass", nullable = true, length = -1)
    public String getsInBorrowSIsPass() {
        return sInBorrowSIsPass;
    }

    public void setsInBorrowSIsPass(String sInBorrowSIsPass) {
        this.sInBorrowSIsPass = sInBorrowSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SInBorrowSEntity that = (SInBorrowSEntity) o;

        if (sInBorrowSDetailId != that.sInBorrowSDetailId) return false;
        if (sInBorrowSInBorrowNo != null ? !sInBorrowSInBorrowNo.equals(that.sInBorrowSInBorrowNo) : that.sInBorrowSInBorrowNo != null)
            return false;
        if (sInBorrowSRoomNo != null ? !sInBorrowSRoomNo.equals(that.sInBorrowSRoomNo) : that.sInBorrowSRoomNo != null)
            return false;
        if (sInBorrowSLocationNo != null ? !sInBorrowSLocationNo.equals(that.sInBorrowSLocationNo) : that.sInBorrowSLocationNo != null)
            return false;
        if (sInBorrowSGoodsNo != null ? !sInBorrowSGoodsNo.equals(that.sInBorrowSGoodsNo) : that.sInBorrowSGoodsNo != null)
            return false;
        if (sInBorrowSMfg != null ? !sInBorrowSMfg.equals(that.sInBorrowSMfg) : that.sInBorrowSMfg != null)
            return false;
        if (sInBorrowSLot != null ? !sInBorrowSLot.equals(that.sInBorrowSLot) : that.sInBorrowSLot != null)
            return false;
        if (sInBorrowSQuantity != null ? !sInBorrowSQuantity.equals(that.sInBorrowSQuantity) : that.sInBorrowSQuantity != null)
            return false;
        if (sInBorrowSBoxQuantity != null ? !sInBorrowSBoxQuantity.equals(that.sInBorrowSBoxQuantity) : that.sInBorrowSBoxQuantity != null)
            return false;
        if (sInBorrowSBoxPrice != null ? !sInBorrowSBoxPrice.equals(that.sInBorrowSBoxPrice) : that.sInBorrowSBoxPrice != null)
            return false;
        if (sInBorrowSDetailMoney != null ? !sInBorrowSDetailMoney.equals(that.sInBorrowSDetailMoney) : that.sInBorrowSDetailMoney != null)
            return false;
        if (sInBorrowSTaxRate != null ? !sInBorrowSTaxRate.equals(that.sInBorrowSTaxRate) : that.sInBorrowSTaxRate != null)
            return false;
        if (sInBorrowSStock != null ? !sInBorrowSStock.equals(that.sInBorrowSStock) : that.sInBorrowSStock != null)
            return false;
        if (sInBorrowSOriginalPrice != null ? !sInBorrowSOriginalPrice.equals(that.sInBorrowSOriginalPrice) : that.sInBorrowSOriginalPrice != null)
            return false;
        if (sInBorrowSPresentationProperty != null ? !sInBorrowSPresentationProperty.equals(that.sInBorrowSPresentationProperty) : that.sInBorrowSPresentationProperty != null)
            return false;
        if (sInBorrowSInvoiceDate != null ? !sInBorrowSInvoiceDate.equals(that.sInBorrowSInvoiceDate) : that.sInBorrowSInvoiceDate != null)
            return false;
        if (sInBorrowSCreaterNo != null ? !sInBorrowSCreaterNo.equals(that.sInBorrowSCreaterNo) : that.sInBorrowSCreaterNo != null)
            return false;
        if (sInBorrowSCreateDate != null ? !sInBorrowSCreateDate.equals(that.sInBorrowSCreateDate) : that.sInBorrowSCreateDate != null)
            return false;
        if (sInBorrowSModifiNo != null ? !sInBorrowSModifiNo.equals(that.sInBorrowSModifiNo) : that.sInBorrowSModifiNo != null)
            return false;
        if (sInBorrowSModifiTime != null ? !sInBorrowSModifiTime.equals(that.sInBorrowSModifiTime) : that.sInBorrowSModifiTime != null)
            return false;
        if (sInBorrowSChecker != null ? !sInBorrowSChecker.equals(that.sInBorrowSChecker) : that.sInBorrowSChecker != null)
            return false;
        if (sInBorrowSCheckDate != null ? !sInBorrowSCheckDate.equals(that.sInBorrowSCheckDate) : that.sInBorrowSCheckDate != null)
            return false;
        if (sInBorrowSIsPass != null ? !sInBorrowSIsPass.equals(that.sInBorrowSIsPass) : that.sInBorrowSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sInBorrowSInBorrowNo != null ? sInBorrowSInBorrowNo.hashCode() : 0;
        result = 31 * result + (sInBorrowSRoomNo != null ? sInBorrowSRoomNo.hashCode() : 0);
        result = 31 * result + (sInBorrowSLocationNo != null ? sInBorrowSLocationNo.hashCode() : 0);
        result = 31 * result + (sInBorrowSGoodsNo != null ? sInBorrowSGoodsNo.hashCode() : 0);
        result = 31 * result + (sInBorrowSMfg != null ? sInBorrowSMfg.hashCode() : 0);
        result = 31 * result + (sInBorrowSLot != null ? sInBorrowSLot.hashCode() : 0);
        result = 31 * result + (sInBorrowSQuantity != null ? sInBorrowSQuantity.hashCode() : 0);
        result = 31 * result + (sInBorrowSBoxQuantity != null ? sInBorrowSBoxQuantity.hashCode() : 0);
        result = 31 * result + (sInBorrowSBoxPrice != null ? sInBorrowSBoxPrice.hashCode() : 0);
        result = 31 * result + (sInBorrowSDetailMoney != null ? sInBorrowSDetailMoney.hashCode() : 0);
        result = 31 * result + (sInBorrowSTaxRate != null ? sInBorrowSTaxRate.hashCode() : 0);
        result = 31 * result + (sInBorrowSStock != null ? sInBorrowSStock.hashCode() : 0);
        result = 31 * result + sInBorrowSDetailId;
        result = 31 * result + (sInBorrowSOriginalPrice != null ? sInBorrowSOriginalPrice.hashCode() : 0);
        result = 31 * result + (sInBorrowSPresentationProperty != null ? sInBorrowSPresentationProperty.hashCode() : 0);
        result = 31 * result + (sInBorrowSInvoiceDate != null ? sInBorrowSInvoiceDate.hashCode() : 0);
        result = 31 * result + (sInBorrowSCreaterNo != null ? sInBorrowSCreaterNo.hashCode() : 0);
        result = 31 * result + (sInBorrowSCreateDate != null ? sInBorrowSCreateDate.hashCode() : 0);
        result = 31 * result + (sInBorrowSModifiNo != null ? sInBorrowSModifiNo.hashCode() : 0);
        result = 31 * result + (sInBorrowSModifiTime != null ? sInBorrowSModifiTime.hashCode() : 0);
        result = 31 * result + (sInBorrowSChecker != null ? sInBorrowSChecker.hashCode() : 0);
        result = 31 * result + (sInBorrowSCheckDate != null ? sInBorrowSCheckDate.hashCode() : 0);
        result = 31 * result + (sInBorrowSIsPass != null ? sInBorrowSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_room_no", referencedColumnName = "t_room_room_no", nullable = false,insertable = false, updatable = false)
    public TRoomEntity gettRoomBySInBorrowSRoomNo() {
        return tRoomBySInBorrowSRoomNo;
    }

    public void settRoomBySInBorrowSRoomNo(TRoomEntity tRoomBySInBorrowSRoomNo) {
        this.tRoomBySInBorrowSRoomNo = tRoomBySInBorrowSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_location_no", referencedColumnName = "store_location_location_no", nullable = false,insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationBySInBorrowSLocationNo() {
        return storeLocationBySInBorrowSLocationNo;
    }

    public void setStoreLocationBySInBorrowSLocationNo(StoreLocationEntity storeLocationBySInBorrowSLocationNo) {
        this.storeLocationBySInBorrowSLocationNo = storeLocationBySInBorrowSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsBySInBorrowSGoodsNo() {
        return tGoodsBySInBorrowSGoodsNo;
    }

    public void settGoodsBySInBorrowSGoodsNo(TGoodsEntity tGoodsBySInBorrowSGoodsNo) {
        this.tGoodsBySInBorrowSGoodsNo = tGoodsBySInBorrowSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInBorrowSCreaterNo() {
        return tStaffBySInBorrowSCreaterNo;
    }

    public void settStaffBySInBorrowSCreaterNo(TStaffEntity tStaffBySInBorrowSCreaterNo) {
        this.tStaffBySInBorrowSCreaterNo = tStaffBySInBorrowSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInBorrowSModifiNo() {
        return tStaffBySInBorrowSModifiNo;
    }

    public void settStaffBySInBorrowSModifiNo(TStaffEntity tStaffBySInBorrowSModifiNo) {
        this.tStaffBySInBorrowSModifiNo = tStaffBySInBorrowSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_borrow_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffBySInBorrowSChecker() {
        return tStaffBySInBorrowSChecker;
    }

    public void settStaffBySInBorrowSChecker(TStaffEntity tStaffBySInBorrowSChecker) {
        this.tStaffBySInBorrowSChecker = tStaffBySInBorrowSChecker;
    }
}
