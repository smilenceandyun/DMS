package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "f_stock_adjus_s", schema = "dbo", catalog = "logistics_test")
@IdClass(FStockAdjusSEntityPK.class)
public class FStockAdjusSEntity {
    private String fStockAdjusSStockAdjustNo;
    private int fStockAdjusSDetailId;
    private String fStockAdjusSRoomNo;
    private String fStockAdjusSLocationNo;
    private String fStockAdjusSGoodsNo;
    private String fStockAdjusSMfg;
    private String fStockAdjusSLot;
    private BigDecimal fStockAdjusSQuantity;
    private BigDecimal fStockAdjusSBoxQuantity;
    private BigDecimal fStockAdjusSBoxPrice;
    private Integer fStockAdjusSStock;
    private String fStockAdjusSCreaterNo;
    private Timestamp fStockAdjusSCreateDate;
    private String fStockAdjusSModifiNo;
    private Timestamp fStockAdjusSModifiTime;
    private String fStockAdjusSChecker;
    private Timestamp fStockAdjusSCheckDate;
    private Timestamp fStockAdjusSInvoiceDate;
    private String fStockAdjusSIsPass;
    private TRoomEntity tRoomByFStockAdjusSRoomNo;
    private StoreLocationEntity storeLocationByFStockAdjusSLocationNo;
    private TGoodsEntity tGoodsByFStockAdjusSGoodsNo;
    private TStaffEntity tStaffByFStockAdjusSCreaterNo;
    private TStaffEntity tStaffByFStockAdjusSModifiNo;
    private TStaffEntity tStaffByFStockAdjusSChecker;

    @Id
    @Column(name = "f_stock_adjus_s_stock_adjust_no", nullable = false, length = 16)
    public String getfStockAdjusSStockAdjustNo() {
        return fStockAdjusSStockAdjustNo;
    }

    public void setfStockAdjusSStockAdjustNo(String fStockAdjusSStockAdjustNo) {
        this.fStockAdjusSStockAdjustNo = fStockAdjusSStockAdjustNo;
    }

    @Id
    @Column(name = "f_stock_adjus_s_detail_id", nullable = false)
    public int getfStockAdjusSDetailId() {
        return fStockAdjusSDetailId;
    }

    public void setfStockAdjusSDetailId(int fStockAdjusSDetailId) {
        this.fStockAdjusSDetailId = fStockAdjusSDetailId;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_room_no", nullable = false, length = 8)
    public String getfStockAdjusSRoomNo() {
        return fStockAdjusSRoomNo;
    }

    public void setfStockAdjusSRoomNo(String fStockAdjusSRoomNo) {
        this.fStockAdjusSRoomNo = fStockAdjusSRoomNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_location_no", nullable = false, length = 8)
    public String getfStockAdjusSLocationNo() {
        return fStockAdjusSLocationNo;
    }

    public void setfStockAdjusSLocationNo(String fStockAdjusSLocationNo) {
        this.fStockAdjusSLocationNo = fStockAdjusSLocationNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_goods_no", nullable = false, length = 20)
    public String getfStockAdjusSGoodsNo() {
        return fStockAdjusSGoodsNo;
    }

    public void setfStockAdjusSGoodsNo(String fStockAdjusSGoodsNo) {
        this.fStockAdjusSGoodsNo = fStockAdjusSGoodsNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_MFG", nullable = false, length = 12)
    public String getfStockAdjusSMfg() {
        return fStockAdjusSMfg;
    }

    public void setfStockAdjusSMfg(String fStockAdjusSMfg) {
        this.fStockAdjusSMfg = fStockAdjusSMfg;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_LOT", nullable = false, length = 20)
    public String getfStockAdjusSLot() {
        return fStockAdjusSLot;
    }

    public void setfStockAdjusSLot(String fStockAdjusSLot) {
        this.fStockAdjusSLot = fStockAdjusSLot;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_quantity", nullable = true, precision = 4)
    public BigDecimal getfStockAdjusSQuantity() {
        return fStockAdjusSQuantity;
    }

    public void setfStockAdjusSQuantity(BigDecimal fStockAdjusSQuantity) {
        this.fStockAdjusSQuantity = fStockAdjusSQuantity;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getfStockAdjusSBoxQuantity() {
        return fStockAdjusSBoxQuantity;
    }

    public void setfStockAdjusSBoxQuantity(BigDecimal fStockAdjusSBoxQuantity) {
        this.fStockAdjusSBoxQuantity = fStockAdjusSBoxQuantity;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_box_price", nullable = true, precision = 4)
    public BigDecimal getfStockAdjusSBoxPrice() {
        return fStockAdjusSBoxPrice;
    }

    public void setfStockAdjusSBoxPrice(BigDecimal fStockAdjusSBoxPrice) {
        this.fStockAdjusSBoxPrice = fStockAdjusSBoxPrice;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_Stock", nullable = true)
    public Integer getfStockAdjusSStock() {
        return fStockAdjusSStock;
    }

    public void setfStockAdjusSStock(Integer fStockAdjusSStock) {
        this.fStockAdjusSStock = fStockAdjusSStock;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_creater_no", nullable = true, length = 8)
    public String getfStockAdjusSCreaterNo() {
        return fStockAdjusSCreaterNo;
    }

    public void setfStockAdjusSCreaterNo(String fStockAdjusSCreaterNo) {
        this.fStockAdjusSCreaterNo = fStockAdjusSCreaterNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_create_date", nullable = true)
    public Timestamp getfStockAdjusSCreateDate() {
        return fStockAdjusSCreateDate;
    }

    public void setfStockAdjusSCreateDate(Timestamp fStockAdjusSCreateDate) {
        this.fStockAdjusSCreateDate = fStockAdjusSCreateDate;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_modifi_no", nullable = true, length = 8)
    public String getfStockAdjusSModifiNo() {
        return fStockAdjusSModifiNo;
    }

    public void setfStockAdjusSModifiNo(String fStockAdjusSModifiNo) {
        this.fStockAdjusSModifiNo = fStockAdjusSModifiNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_modifi_time", nullable = true)
    public Timestamp getfStockAdjusSModifiTime() {
        return fStockAdjusSModifiTime;
    }

    public void setfStockAdjusSModifiTime(Timestamp fStockAdjusSModifiTime) {
        this.fStockAdjusSModifiTime = fStockAdjusSModifiTime;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_checker", nullable = true, length = 8)
    public String getfStockAdjusSChecker() {
        return fStockAdjusSChecker;
    }

    public void setfStockAdjusSChecker(String fStockAdjusSChecker) {
        this.fStockAdjusSChecker = fStockAdjusSChecker;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_check_date", nullable = true)
    public Timestamp getfStockAdjusSCheckDate() {
        return fStockAdjusSCheckDate;
    }

    public void setfStockAdjusSCheckDate(Timestamp fStockAdjusSCheckDate) {
        this.fStockAdjusSCheckDate = fStockAdjusSCheckDate;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_invoice_date", nullable = true)
    public Timestamp getfStockAdjusSInvoiceDate() {
        return fStockAdjusSInvoiceDate;
    }

    public void setfStockAdjusSInvoiceDate(Timestamp fStockAdjusSInvoiceDate) {
        this.fStockAdjusSInvoiceDate = fStockAdjusSInvoiceDate;
    }

    @Basic
    @Column(name = "f_stock_adjus_s_isPass", nullable = true, length = 1)
    public String getfStockAdjusSIsPass() {
        return fStockAdjusSIsPass;
    }

    public void setfStockAdjusSIsPass(String fStockAdjusSIsPass) {
        this.fStockAdjusSIsPass = fStockAdjusSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FStockAdjusSEntity that = (FStockAdjusSEntity) o;

        if (fStockAdjusSDetailId != that.fStockAdjusSDetailId) return false;
        if (fStockAdjusSStockAdjustNo != null ? !fStockAdjusSStockAdjustNo.equals(that.fStockAdjusSStockAdjustNo) : that.fStockAdjusSStockAdjustNo != null)
            return false;
        if (fStockAdjusSRoomNo != null ? !fStockAdjusSRoomNo.equals(that.fStockAdjusSRoomNo) : that.fStockAdjusSRoomNo != null)
            return false;
        if (fStockAdjusSLocationNo != null ? !fStockAdjusSLocationNo.equals(that.fStockAdjusSLocationNo) : that.fStockAdjusSLocationNo != null)
            return false;
        if (fStockAdjusSGoodsNo != null ? !fStockAdjusSGoodsNo.equals(that.fStockAdjusSGoodsNo) : that.fStockAdjusSGoodsNo != null)
            return false;
        if (fStockAdjusSMfg != null ? !fStockAdjusSMfg.equals(that.fStockAdjusSMfg) : that.fStockAdjusSMfg != null)
            return false;
        if (fStockAdjusSLot != null ? !fStockAdjusSLot.equals(that.fStockAdjusSLot) : that.fStockAdjusSLot != null)
            return false;
        if (fStockAdjusSQuantity != null ? !fStockAdjusSQuantity.equals(that.fStockAdjusSQuantity) : that.fStockAdjusSQuantity != null)
            return false;
        if (fStockAdjusSBoxQuantity != null ? !fStockAdjusSBoxQuantity.equals(that.fStockAdjusSBoxQuantity) : that.fStockAdjusSBoxQuantity != null)
            return false;
        if (fStockAdjusSBoxPrice != null ? !fStockAdjusSBoxPrice.equals(that.fStockAdjusSBoxPrice) : that.fStockAdjusSBoxPrice != null)
            return false;
        if (fStockAdjusSStock != null ? !fStockAdjusSStock.equals(that.fStockAdjusSStock) : that.fStockAdjusSStock != null)
            return false;
        if (fStockAdjusSCreaterNo != null ? !fStockAdjusSCreaterNo.equals(that.fStockAdjusSCreaterNo) : that.fStockAdjusSCreaterNo != null)
            return false;
        if (fStockAdjusSCreateDate != null ? !fStockAdjusSCreateDate.equals(that.fStockAdjusSCreateDate) : that.fStockAdjusSCreateDate != null)
            return false;
        if (fStockAdjusSModifiNo != null ? !fStockAdjusSModifiNo.equals(that.fStockAdjusSModifiNo) : that.fStockAdjusSModifiNo != null)
            return false;
        if (fStockAdjusSModifiTime != null ? !fStockAdjusSModifiTime.equals(that.fStockAdjusSModifiTime) : that.fStockAdjusSModifiTime != null)
            return false;
        if (fStockAdjusSChecker != null ? !fStockAdjusSChecker.equals(that.fStockAdjusSChecker) : that.fStockAdjusSChecker != null)
            return false;
        if (fStockAdjusSCheckDate != null ? !fStockAdjusSCheckDate.equals(that.fStockAdjusSCheckDate) : that.fStockAdjusSCheckDate != null)
            return false;
        if (fStockAdjusSInvoiceDate != null ? !fStockAdjusSInvoiceDate.equals(that.fStockAdjusSInvoiceDate) : that.fStockAdjusSInvoiceDate != null)
            return false;
        if (fStockAdjusSIsPass != null ? !fStockAdjusSIsPass.equals(that.fStockAdjusSIsPass) : that.fStockAdjusSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fStockAdjusSStockAdjustNo != null ? fStockAdjusSStockAdjustNo.hashCode() : 0;
        result = 31 * result + fStockAdjusSDetailId;
        result = 31 * result + (fStockAdjusSRoomNo != null ? fStockAdjusSRoomNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusSLocationNo != null ? fStockAdjusSLocationNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusSGoodsNo != null ? fStockAdjusSGoodsNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusSMfg != null ? fStockAdjusSMfg.hashCode() : 0);
        result = 31 * result + (fStockAdjusSLot != null ? fStockAdjusSLot.hashCode() : 0);
        result = 31 * result + (fStockAdjusSQuantity != null ? fStockAdjusSQuantity.hashCode() : 0);
        result = 31 * result + (fStockAdjusSBoxQuantity != null ? fStockAdjusSBoxQuantity.hashCode() : 0);
        result = 31 * result + (fStockAdjusSBoxPrice != null ? fStockAdjusSBoxPrice.hashCode() : 0);
        result = 31 * result + (fStockAdjusSStock != null ? fStockAdjusSStock.hashCode() : 0);
        result = 31 * result + (fStockAdjusSCreaterNo != null ? fStockAdjusSCreaterNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusSCreateDate != null ? fStockAdjusSCreateDate.hashCode() : 0);
        result = 31 * result + (fStockAdjusSModifiNo != null ? fStockAdjusSModifiNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusSModifiTime != null ? fStockAdjusSModifiTime.hashCode() : 0);
        result = 31 * result + (fStockAdjusSChecker != null ? fStockAdjusSChecker.hashCode() : 0);
        result = 31 * result + (fStockAdjusSCheckDate != null ? fStockAdjusSCheckDate.hashCode() : 0);
        result = 31 * result + (fStockAdjusSInvoiceDate != null ? fStockAdjusSInvoiceDate.hashCode() : 0);
        result = 31 * result + (fStockAdjusSIsPass != null ? fStockAdjusSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_room_no", referencedColumnName = "t_room_room_no", nullable = false)
    public TRoomEntity gettRoomByFStockAdjusSRoomNo() {
        return tRoomByFStockAdjusSRoomNo;
    }

    public void settRoomByFStockAdjusSRoomNo(TRoomEntity tRoomByFStockAdjusSRoomNo) {
        this.tRoomByFStockAdjusSRoomNo = tRoomByFStockAdjusSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_location_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationByFStockAdjusSLocationNo() {
        return storeLocationByFStockAdjusSLocationNo;
    }

    public void setStoreLocationByFStockAdjusSLocationNo(StoreLocationEntity storeLocationByFStockAdjusSLocationNo) {
        this.storeLocationByFStockAdjusSLocationNo = storeLocationByFStockAdjusSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false)
    public TGoodsEntity gettGoodsByFStockAdjusSGoodsNo() {
        return tGoodsByFStockAdjusSGoodsNo;
    }

    public void settGoodsByFStockAdjusSGoodsNo(TGoodsEntity tGoodsByFStockAdjusSGoodsNo) {
        this.tGoodsByFStockAdjusSGoodsNo = tGoodsByFStockAdjusSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFStockAdjusSCreaterNo() {
        return tStaffByFStockAdjusSCreaterNo;
    }

    public void settStaffByFStockAdjusSCreaterNo(TStaffEntity tStaffByFStockAdjusSCreaterNo) {
        this.tStaffByFStockAdjusSCreaterNo = tStaffByFStockAdjusSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFStockAdjusSModifiNo() {
        return tStaffByFStockAdjusSModifiNo;
    }

    public void settStaffByFStockAdjusSModifiNo(TStaffEntity tStaffByFStockAdjusSModifiNo) {
        this.tStaffByFStockAdjusSModifiNo = tStaffByFStockAdjusSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFStockAdjusSChecker() {
        return tStaffByFStockAdjusSChecker;
    }

    public void settStaffByFStockAdjusSChecker(TStaffEntity tStaffByFStockAdjusSChecker) {
        this.tStaffByFStockAdjusSChecker = tStaffByFStockAdjusSChecker;
    }
}
