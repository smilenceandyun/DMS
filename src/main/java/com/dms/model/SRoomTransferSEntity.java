package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_room_transfer_s", schema = "dbo", catalog = "logistics_test")
@IdClass(SRoomTransferSEntityPK.class)
public class SRoomTransferSEntity {
    private String sRoomTransferSRoomTransferNo;
    private int sRoomTransferSDetailId;
    private String sRoomTransferSOutRoomNo;
    private String sRoomTransferSOutLocationNo;
    private String sRoomTransferSInRoomNo;
    private String sRoomTransferSInLocationNo;
    private String sRoomTransferSGoodsNo;
    private String sRoomTransferSMfg;
    private String sRoomTransferSLot;
    private BigDecimal sRoomTransferSQuantity;
    private BigDecimal sRoomTransferSBoxQuantity;
    private BigDecimal sRoomTransferSOriginalPrice;
    private String sRoomTransferSPresentationProperty;
    private Timestamp sRoomTransferSInvoiceDate;
    private String sRoomTransferSCreaterNo;
    private Timestamp sRoomTransferSCreateDate;
    private String sRoomTransferSModifiNo;
    private Timestamp sRoomTransferSModifiTime;
    private String sRoomTransferSChecker;
    private Timestamp sRoomTransferSCheckDate;
    private String sRoomTransferSIsPass;
    private SRoomTransferMEntity sRoomTransferMBySRoomTransferSRoomTransferNo;
    private TRoomEntity tRoomBySRoomTransferSOutRoomNo;
    private StoreLocationEntity storeLocationBySRoomTransferSOutLocationNo;
    private TRoomEntity tRoomBySRoomTransferSInRoomNo;
    private StoreLocationEntity storeLocationBySRoomTransferSInLocationNo;
    private TStaffEntity tStaffBySRoomTransferSCreaterNo;
    private TStaffEntity tStaffBySRoomTransferSModifiNo;
    private TStaffEntity tStaffBySRoomTransferSChecker;

    @Id
    @Column(name = "s_room_transfer_s_room_transfer_no", nullable = false, length = 16)
    public String getsRoomTransferSRoomTransferNo() {
        return sRoomTransferSRoomTransferNo;
    }

    public void setsRoomTransferSRoomTransferNo(String sRoomTransferSRoomTransferNo) {
        this.sRoomTransferSRoomTransferNo = sRoomTransferSRoomTransferNo;
    }

    @Id
    @Column(name = "s_room_transfer_s_detail_id", nullable = false)
    public int getsRoomTransferSDetailId() {
        return sRoomTransferSDetailId;
    }

    public void setsRoomTransferSDetailId(int sRoomTransferSDetailId) {
        this.sRoomTransferSDetailId = sRoomTransferSDetailId;
    }

    @Basic
    @Column(name = "s_room_transfer_s_out_room_no", nullable = false, length = 8)
    public String getsRoomTransferSOutRoomNo() {
        return sRoomTransferSOutRoomNo;
    }

    public void setsRoomTransferSOutRoomNo(String sRoomTransferSOutRoomNo) {
        this.sRoomTransferSOutRoomNo = sRoomTransferSOutRoomNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_out_location_no", nullable = false, length = 8)
    public String getsRoomTransferSOutLocationNo() {
        return sRoomTransferSOutLocationNo;
    }

    public void setsRoomTransferSOutLocationNo(String sRoomTransferSOutLocationNo) {
        this.sRoomTransferSOutLocationNo = sRoomTransferSOutLocationNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_in_room_no", nullable = false, length = 8)
    public String getsRoomTransferSInRoomNo() {
        return sRoomTransferSInRoomNo;
    }

    public void setsRoomTransferSInRoomNo(String sRoomTransferSInRoomNo) {
        this.sRoomTransferSInRoomNo = sRoomTransferSInRoomNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_in_location_no", nullable = false, length = 8)
    public String getsRoomTransferSInLocationNo() {
        return sRoomTransferSInLocationNo;
    }

    public void setsRoomTransferSInLocationNo(String sRoomTransferSInLocationNo) {
        this.sRoomTransferSInLocationNo = sRoomTransferSInLocationNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_goods_no", nullable = false, length = 20)
    public String getsRoomTransferSGoodsNo() {
        return sRoomTransferSGoodsNo;
    }

    public void setsRoomTransferSGoodsNo(String sRoomTransferSGoodsNo) {
        this.sRoomTransferSGoodsNo = sRoomTransferSGoodsNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_MFG", nullable = false, length = 12)
    public String getsRoomTransferSMfg() {
        return sRoomTransferSMfg;
    }

    public void setsRoomTransferSMfg(String sRoomTransferSMfg) {
        this.sRoomTransferSMfg = sRoomTransferSMfg;
    }

    @Basic
    @Column(name = "s_room_transfer_s_LOT", nullable = false, length = 20)
    public String getsRoomTransferSLot() {
        return sRoomTransferSLot;
    }

    public void setsRoomTransferSLot(String sRoomTransferSLot) {
        this.sRoomTransferSLot = sRoomTransferSLot;
    }

    @Basic
    @Column(name = "s_room_transfer_s_quantity", nullable = true, precision = 4)
    public BigDecimal getsRoomTransferSQuantity() {
        return sRoomTransferSQuantity;
    }

    public void setsRoomTransferSQuantity(BigDecimal sRoomTransferSQuantity) {
        this.sRoomTransferSQuantity = sRoomTransferSQuantity;
    }

    @Basic
    @Column(name = "s_room_transfer_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getsRoomTransferSBoxQuantity() {
        return sRoomTransferSBoxQuantity;
    }

    public void setsRoomTransferSBoxQuantity(BigDecimal sRoomTransferSBoxQuantity) {
        this.sRoomTransferSBoxQuantity = sRoomTransferSBoxQuantity;
    }

    @Basic
    @Column(name = "s_room_transfer_s_original_price", nullable = true, precision = 4)
    public BigDecimal getsRoomTransferSOriginalPrice() {
        return sRoomTransferSOriginalPrice;
    }

    public void setsRoomTransferSOriginalPrice(BigDecimal sRoomTransferSOriginalPrice) {
        this.sRoomTransferSOriginalPrice = sRoomTransferSOriginalPrice;
    }

    @Basic
    @Column(name = "s_room_transfer_s_presentation_property", nullable = true, length = 4)
    public String getsRoomTransferSPresentationProperty() {
        return sRoomTransferSPresentationProperty;
    }

    public void setsRoomTransferSPresentationProperty(String sRoomTransferSPresentationProperty) {
        this.sRoomTransferSPresentationProperty = sRoomTransferSPresentationProperty;
    }

    @Basic
    @Column(name = "s_room_transfer_s_invoice_date", nullable = true)
    public Timestamp getsRoomTransferSInvoiceDate() {
        return sRoomTransferSInvoiceDate;
    }

    public void setsRoomTransferSInvoiceDate(Timestamp sRoomTransferSInvoiceDate) {
        this.sRoomTransferSInvoiceDate = sRoomTransferSInvoiceDate;
    }

    @Basic
    @Column(name = "s_room_transfer_s_creater_no", nullable = true, length = 8)
    public String getsRoomTransferSCreaterNo() {
        return sRoomTransferSCreaterNo;
    }

    public void setsRoomTransferSCreaterNo(String sRoomTransferSCreaterNo) {
        this.sRoomTransferSCreaterNo = sRoomTransferSCreaterNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_create_date", nullable = true)
    public Timestamp getsRoomTransferSCreateDate() {
        return sRoomTransferSCreateDate;
    }

    public void setsRoomTransferSCreateDate(Timestamp sRoomTransferSCreateDate) {
        this.sRoomTransferSCreateDate = sRoomTransferSCreateDate;
    }

    @Basic
    @Column(name = "s_room_transfer_s_modifi_no", nullable = true, length = 8)
    public String getsRoomTransferSModifiNo() {
        return sRoomTransferSModifiNo;
    }

    public void setsRoomTransferSModifiNo(String sRoomTransferSModifiNo) {
        this.sRoomTransferSModifiNo = sRoomTransferSModifiNo;
    }

    @Basic
    @Column(name = "s_room_transfer_s_modifi_time", nullable = true)
    public Timestamp getsRoomTransferSModifiTime() {
        return sRoomTransferSModifiTime;
    }

    public void setsRoomTransferSModifiTime(Timestamp sRoomTransferSModifiTime) {
        this.sRoomTransferSModifiTime = sRoomTransferSModifiTime;
    }

    @Basic
    @Column(name = "s_room_transfer_s_checker", nullable = true, length = 8)
    public String getsRoomTransferSChecker() {
        return sRoomTransferSChecker;
    }

    public void setsRoomTransferSChecker(String sRoomTransferSChecker) {
        this.sRoomTransferSChecker = sRoomTransferSChecker;
    }

    @Basic
    @Column(name = "s_room_transfer_s_check_date", nullable = true)
    public Timestamp getsRoomTransferSCheckDate() {
        return sRoomTransferSCheckDate;
    }

    public void setsRoomTransferSCheckDate(Timestamp sRoomTransferSCheckDate) {
        this.sRoomTransferSCheckDate = sRoomTransferSCheckDate;
    }

    @Basic
    @Column(name = "s_room_transfer_s_isPass", nullable = true, length = 1)
    public String getsRoomTransferSIsPass() {
        return sRoomTransferSIsPass;
    }

    public void setsRoomTransferSIsPass(String sRoomTransferSIsPass) {
        this.sRoomTransferSIsPass = sRoomTransferSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SRoomTransferSEntity that = (SRoomTransferSEntity) o;

        if (sRoomTransferSDetailId != that.sRoomTransferSDetailId) return false;
        if (sRoomTransferSRoomTransferNo != null ? !sRoomTransferSRoomTransferNo.equals(that.sRoomTransferSRoomTransferNo) : that.sRoomTransferSRoomTransferNo != null)
            return false;
        if (sRoomTransferSOutRoomNo != null ? !sRoomTransferSOutRoomNo.equals(that.sRoomTransferSOutRoomNo) : that.sRoomTransferSOutRoomNo != null)
            return false;
        if (sRoomTransferSOutLocationNo != null ? !sRoomTransferSOutLocationNo.equals(that.sRoomTransferSOutLocationNo) : that.sRoomTransferSOutLocationNo != null)
            return false;
        if (sRoomTransferSInRoomNo != null ? !sRoomTransferSInRoomNo.equals(that.sRoomTransferSInRoomNo) : that.sRoomTransferSInRoomNo != null)
            return false;
        if (sRoomTransferSInLocationNo != null ? !sRoomTransferSInLocationNo.equals(that.sRoomTransferSInLocationNo) : that.sRoomTransferSInLocationNo != null)
            return false;
        if (sRoomTransferSGoodsNo != null ? !sRoomTransferSGoodsNo.equals(that.sRoomTransferSGoodsNo) : that.sRoomTransferSGoodsNo != null)
            return false;
        if (sRoomTransferSMfg != null ? !sRoomTransferSMfg.equals(that.sRoomTransferSMfg) : that.sRoomTransferSMfg != null)
            return false;
        if (sRoomTransferSLot != null ? !sRoomTransferSLot.equals(that.sRoomTransferSLot) : that.sRoomTransferSLot != null)
            return false;
        if (sRoomTransferSQuantity != null ? !sRoomTransferSQuantity.equals(that.sRoomTransferSQuantity) : that.sRoomTransferSQuantity != null)
            return false;
        if (sRoomTransferSBoxQuantity != null ? !sRoomTransferSBoxQuantity.equals(that.sRoomTransferSBoxQuantity) : that.sRoomTransferSBoxQuantity != null)
            return false;
        if (sRoomTransferSOriginalPrice != null ? !sRoomTransferSOriginalPrice.equals(that.sRoomTransferSOriginalPrice) : that.sRoomTransferSOriginalPrice != null)
            return false;
        if (sRoomTransferSPresentationProperty != null ? !sRoomTransferSPresentationProperty.equals(that.sRoomTransferSPresentationProperty) : that.sRoomTransferSPresentationProperty != null)
            return false;
        if (sRoomTransferSInvoiceDate != null ? !sRoomTransferSInvoiceDate.equals(that.sRoomTransferSInvoiceDate) : that.sRoomTransferSInvoiceDate != null)
            return false;
        if (sRoomTransferSCreaterNo != null ? !sRoomTransferSCreaterNo.equals(that.sRoomTransferSCreaterNo) : that.sRoomTransferSCreaterNo != null)
            return false;
        if (sRoomTransferSCreateDate != null ? !sRoomTransferSCreateDate.equals(that.sRoomTransferSCreateDate) : that.sRoomTransferSCreateDate != null)
            return false;
        if (sRoomTransferSModifiNo != null ? !sRoomTransferSModifiNo.equals(that.sRoomTransferSModifiNo) : that.sRoomTransferSModifiNo != null)
            return false;
        if (sRoomTransferSModifiTime != null ? !sRoomTransferSModifiTime.equals(that.sRoomTransferSModifiTime) : that.sRoomTransferSModifiTime != null)
            return false;
        if (sRoomTransferSChecker != null ? !sRoomTransferSChecker.equals(that.sRoomTransferSChecker) : that.sRoomTransferSChecker != null)
            return false;
        if (sRoomTransferSCheckDate != null ? !sRoomTransferSCheckDate.equals(that.sRoomTransferSCheckDate) : that.sRoomTransferSCheckDate != null)
            return false;
        if (sRoomTransferSIsPass != null ? !sRoomTransferSIsPass.equals(that.sRoomTransferSIsPass) : that.sRoomTransferSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sRoomTransferSRoomTransferNo != null ? sRoomTransferSRoomTransferNo.hashCode() : 0;
        result = 31 * result + sRoomTransferSDetailId;
        result = 31 * result + (sRoomTransferSOutRoomNo != null ? sRoomTransferSOutRoomNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSOutLocationNo != null ? sRoomTransferSOutLocationNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSInRoomNo != null ? sRoomTransferSInRoomNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSInLocationNo != null ? sRoomTransferSInLocationNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSGoodsNo != null ? sRoomTransferSGoodsNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSMfg != null ? sRoomTransferSMfg.hashCode() : 0);
        result = 31 * result + (sRoomTransferSLot != null ? sRoomTransferSLot.hashCode() : 0);
        result = 31 * result + (sRoomTransferSQuantity != null ? sRoomTransferSQuantity.hashCode() : 0);
        result = 31 * result + (sRoomTransferSBoxQuantity != null ? sRoomTransferSBoxQuantity.hashCode() : 0);
        result = 31 * result + (sRoomTransferSOriginalPrice != null ? sRoomTransferSOriginalPrice.hashCode() : 0);
        result = 31 * result + (sRoomTransferSPresentationProperty != null ? sRoomTransferSPresentationProperty.hashCode() : 0);
        result = 31 * result + (sRoomTransferSInvoiceDate != null ? sRoomTransferSInvoiceDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferSCreaterNo != null ? sRoomTransferSCreaterNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSCreateDate != null ? sRoomTransferSCreateDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferSModifiNo != null ? sRoomTransferSModifiNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferSModifiTime != null ? sRoomTransferSModifiTime.hashCode() : 0);
        result = 31 * result + (sRoomTransferSChecker != null ? sRoomTransferSChecker.hashCode() : 0);
        result = 31 * result + (sRoomTransferSCheckDate != null ? sRoomTransferSCheckDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferSIsPass != null ? sRoomTransferSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_room_transfer_no", referencedColumnName = "s_room_transfer_m_room_transfer_no", nullable = false)
    public SRoomTransferMEntity getsRoomTransferMBySRoomTransferSRoomTransferNo() {
        return sRoomTransferMBySRoomTransferSRoomTransferNo;
    }

    public void setsRoomTransferMBySRoomTransferSRoomTransferNo(SRoomTransferMEntity sRoomTransferMBySRoomTransferSRoomTransferNo) {
        this.sRoomTransferMBySRoomTransferSRoomTransferNo = sRoomTransferMBySRoomTransferSRoomTransferNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_out_room_no", referencedColumnName = "t_room_room_no", nullable = false)
    public TRoomEntity gettRoomBySRoomTransferSOutRoomNo() {
        return tRoomBySRoomTransferSOutRoomNo;
    }

    public void settRoomBySRoomTransferSOutRoomNo(TRoomEntity tRoomBySRoomTransferSOutRoomNo) {
        this.tRoomBySRoomTransferSOutRoomNo = tRoomBySRoomTransferSOutRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_out_location_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationBySRoomTransferSOutLocationNo() {
        return storeLocationBySRoomTransferSOutLocationNo;
    }

    public void setStoreLocationBySRoomTransferSOutLocationNo(StoreLocationEntity storeLocationBySRoomTransferSOutLocationNo) {
        this.storeLocationBySRoomTransferSOutLocationNo = storeLocationBySRoomTransferSOutLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_in_room_no", referencedColumnName = "t_room_room_no", nullable = false)
    public TRoomEntity gettRoomBySRoomTransferSInRoomNo() {
        return tRoomBySRoomTransferSInRoomNo;
    }

    public void settRoomBySRoomTransferSInRoomNo(TRoomEntity tRoomBySRoomTransferSInRoomNo) {
        this.tRoomBySRoomTransferSInRoomNo = tRoomBySRoomTransferSInRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_in_location_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationBySRoomTransferSInLocationNo() {
        return storeLocationBySRoomTransferSInLocationNo;
    }

    public void setStoreLocationBySRoomTransferSInLocationNo(StoreLocationEntity storeLocationBySRoomTransferSInLocationNo) {
        this.storeLocationBySRoomTransferSInLocationNo = storeLocationBySRoomTransferSInLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferSCreaterNo() {
        return tStaffBySRoomTransferSCreaterNo;
    }

    public void settStaffBySRoomTransferSCreaterNo(TStaffEntity tStaffBySRoomTransferSCreaterNo) {
        this.tStaffBySRoomTransferSCreaterNo = tStaffBySRoomTransferSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferSModifiNo() {
        return tStaffBySRoomTransferSModifiNo;
    }

    public void settStaffBySRoomTransferSModifiNo(TStaffEntity tStaffBySRoomTransferSModifiNo) {
        this.tStaffBySRoomTransferSModifiNo = tStaffBySRoomTransferSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferSChecker() {
        return tStaffBySRoomTransferSChecker;
    }

    public void settStaffBySRoomTransferSChecker(TStaffEntity tStaffBySRoomTransferSChecker) {
        this.tStaffBySRoomTransferSChecker = tStaffBySRoomTransferSChecker;
    }
}
