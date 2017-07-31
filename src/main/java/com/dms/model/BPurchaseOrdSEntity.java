package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_purchase_ord_s", schema = "dbo", catalog = "logistics")
@IdClass(BPurchaseOrdSEntityPK.class)
public class BPurchaseOrdSEntity {
    private String bPurchaseOrdSOrdProcureNo;
    private String bPurchaseOrdSLocationNo;
    private String bPurchaseOrdSRoomNo;
    private String bPurchaseOrdSGoodsNo;
    private String bPurchaseOrdSMfg;
    private String bPurchaseOrdSExp;
    private String bPurchaseOrdSPaymentNo;
    private String bPurchaseOrdSLot;
    private BigDecimal bPurchaseOrdSQuantity;
    private BigDecimal bPurchaseOrdSBoxQuantity;
    private BigDecimal bPurchaseOrdSPrice;
    private BigDecimal bPurchaseOrdSBoxPrice;
    private BigDecimal bPurchaseOrdSTaxRate;
    private BigDecimal bPurchaseOrdSDetailMoney;
    private BigDecimal bPurchaseOrdSOriginalPrice;
    private String bPurchaseOrdSPresentationProperty;
    private Timestamp bPurchaseOrdSAccountCheckDate;
    private String bPurchaseOrdSPurchasConNo;
    private String bPurchaseOrdSCreateNo;
    private Timestamp bPurchaseOrdSCreateDate;
    private String bPurchaseOrdSModifiNo;
    private Timestamp bPurchaseOrdSModifiTime;
    private int bPurchaseOrdSDetailId;
    private String bPurchaseOrdSGroupNodeId;
    private String bPurchaseOrdSFactoryGoodsNo;
    private Timestamp bPurchaseOrdSOrdDate;
    private String bPurchaseOrdSChecker;
    private Timestamp bPurchaseOrdSCheckDate;
    private String bPurchaseOrdSIsPass;
    private StoreLocationEntity storeLocationByBPurchaseOrdSLocationNo;
    private TRoomEntity tRoomByBPurchaseOrdSRoomNo;
    private TGoodsEntity tGoodsByBPurchaseOrdSGoodsNo;
    private TPaymentEntity tPaymentByBPurchaseOrdSPaymentNo;
    private CPurchaseConMEntity cPurchaseConMByBPurchaseOrdSPurchasConNo;
    private TStaffEntity tStaffByBPurchaseOrdSCreateNo;
    private TStaffEntity tStaffByBPurchaseOrdSModifiNo;
    private TOrgEntity tOrgByBPurchaseOrdSGroupNodeId;
    private TFactorysEntity tFactorysByBPurchaseOrdSFactoryGoodsNo;
    private TStaffEntity tStaffByBPurchaseOrdSChecker;
    private Collection<BRProcureSEntity> bRProcureS;

    @Id
    @Column(name = "b_purchase_ord_s_ord_procure_no", nullable = false, length = 16)
    public String getbPurchaseOrdSOrdProcureNo() {
        return bPurchaseOrdSOrdProcureNo;
    }

    public void setbPurchaseOrdSOrdProcureNo(String bPurchaseOrdSOrdProcureNo) {
        this.bPurchaseOrdSOrdProcureNo = bPurchaseOrdSOrdProcureNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_location_no", nullable = true, length = 8)
    public String getbPurchaseOrdSLocationNo() {
        return bPurchaseOrdSLocationNo;
    }

    public void setbPurchaseOrdSLocationNo(String bPurchaseOrdSLocationNo) {
        this.bPurchaseOrdSLocationNo = bPurchaseOrdSLocationNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_room_no", nullable = true, length = 8)
    public String getbPurchaseOrdSRoomNo() {
        return bPurchaseOrdSRoomNo;
    }

    public void setbPurchaseOrdSRoomNo(String bPurchaseOrdSRoomNo) {
        this.bPurchaseOrdSRoomNo = bPurchaseOrdSRoomNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_goods_no", nullable = false, length = 20)
    public String getbPurchaseOrdSGoodsNo() {
        return bPurchaseOrdSGoodsNo;
    }

    public void setbPurchaseOrdSGoodsNo(String bPurchaseOrdSGoodsNo) {
        this.bPurchaseOrdSGoodsNo = bPurchaseOrdSGoodsNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_MFG", nullable = true, length = 12)
    public String getbPurchaseOrdSMfg() {
        return bPurchaseOrdSMfg;
    }

    public void setbPurchaseOrdSMfg(String bPurchaseOrdSMfg) {
        this.bPurchaseOrdSMfg = bPurchaseOrdSMfg;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_EXP", nullable = true, length = 12)
    public String getbPurchaseOrdSExp() {
        return bPurchaseOrdSExp;
    }

    public void setbPurchaseOrdSExp(String bPurchaseOrdSExp) {
        this.bPurchaseOrdSExp = bPurchaseOrdSExp;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_payment_no", nullable = true, length = 4)
    public String getbPurchaseOrdSPaymentNo() {
        return bPurchaseOrdSPaymentNo;
    }

    public void setbPurchaseOrdSPaymentNo(String bPurchaseOrdSPaymentNo) {
        this.bPurchaseOrdSPaymentNo = bPurchaseOrdSPaymentNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_LOT", nullable = true, length = 20)
    public String getbPurchaseOrdSLot() {
        return bPurchaseOrdSLot;
    }

    public void setbPurchaseOrdSLot(String bPurchaseOrdSLot) {
        this.bPurchaseOrdSLot = bPurchaseOrdSLot;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_quantity", nullable = false, precision = 6)
    public BigDecimal getbPurchaseOrdSQuantity() {
        return bPurchaseOrdSQuantity;
    }

    public void setbPurchaseOrdSQuantity(BigDecimal bPurchaseOrdSQuantity) {
        this.bPurchaseOrdSQuantity = bPurchaseOrdSQuantity;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_box_quantity", nullable = false, precision = 6)
    public BigDecimal getbPurchaseOrdSBoxQuantity() {
        return bPurchaseOrdSBoxQuantity;
    }

    public void setbPurchaseOrdSBoxQuantity(BigDecimal bPurchaseOrdSBoxQuantity) {
        this.bPurchaseOrdSBoxQuantity = bPurchaseOrdSBoxQuantity;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_price", nullable = false, precision = 6)
    public BigDecimal getbPurchaseOrdSPrice() {
        return bPurchaseOrdSPrice;
    }

    public void setbPurchaseOrdSPrice(BigDecimal bPurchaseOrdSPrice) {
        this.bPurchaseOrdSPrice = bPurchaseOrdSPrice;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_box_price", nullable = false, precision = 6)
    public BigDecimal getbPurchaseOrdSBoxPrice() {
        return bPurchaseOrdSBoxPrice;
    }

    public void setbPurchaseOrdSBoxPrice(BigDecimal bPurchaseOrdSBoxPrice) {
        this.bPurchaseOrdSBoxPrice = bPurchaseOrdSBoxPrice;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbPurchaseOrdSTaxRate() {
        return bPurchaseOrdSTaxRate;
    }

    public void setbPurchaseOrdSTaxRate(BigDecimal bPurchaseOrdSTaxRate) {
        this.bPurchaseOrdSTaxRate = bPurchaseOrdSTaxRate;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_detail_money", nullable = false, precision = 6)
    public BigDecimal getbPurchaseOrdSDetailMoney() {
        return bPurchaseOrdSDetailMoney;
    }

    public void setbPurchaseOrdSDetailMoney(BigDecimal bPurchaseOrdSDetailMoney) {
        this.bPurchaseOrdSDetailMoney = bPurchaseOrdSDetailMoney;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_original_price", nullable = true, precision = 6)
    public BigDecimal getbPurchaseOrdSOriginalPrice() {
        return bPurchaseOrdSOriginalPrice;
    }

    public void setbPurchaseOrdSOriginalPrice(BigDecimal bPurchaseOrdSOriginalPrice) {
        this.bPurchaseOrdSOriginalPrice = bPurchaseOrdSOriginalPrice;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_presentation_property", nullable = true, length = 4)
    public String getbPurchaseOrdSPresentationProperty() {
        return bPurchaseOrdSPresentationProperty;
    }

    public void setbPurchaseOrdSPresentationProperty(String bPurchaseOrdSPresentationProperty) {
        this.bPurchaseOrdSPresentationProperty = bPurchaseOrdSPresentationProperty;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_account_check_date", nullable = true)
    public Timestamp getbPurchaseOrdSAccountCheckDate() {
        return bPurchaseOrdSAccountCheckDate;
    }

    public void setbPurchaseOrdSAccountCheckDate(Timestamp bPurchaseOrdSAccountCheckDate) {
        this.bPurchaseOrdSAccountCheckDate = bPurchaseOrdSAccountCheckDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_purchas_con_no", nullable = true, length = 16)
    public String getbPurchaseOrdSPurchasConNo() {
        return bPurchaseOrdSPurchasConNo;
    }

    public void setbPurchaseOrdSPurchasConNo(String bPurchaseOrdSPurchasConNo) {
        this.bPurchaseOrdSPurchasConNo = bPurchaseOrdSPurchasConNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_create_no", nullable = true, length = 8)
    public String getbPurchaseOrdSCreateNo() {
        return bPurchaseOrdSCreateNo;
    }

    public void setbPurchaseOrdSCreateNo(String bPurchaseOrdSCreateNo) {
        this.bPurchaseOrdSCreateNo = bPurchaseOrdSCreateNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_create_date", nullable = true)
    public Timestamp getbPurchaseOrdSCreateDate() {
        return bPurchaseOrdSCreateDate;
    }

    public void setbPurchaseOrdSCreateDate(Timestamp bPurchaseOrdSCreateDate) {
        this.bPurchaseOrdSCreateDate = bPurchaseOrdSCreateDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_modifi_no", nullable = true, length = 8)
    public String getbPurchaseOrdSModifiNo() {
        return bPurchaseOrdSModifiNo;
    }

    public void setbPurchaseOrdSModifiNo(String bPurchaseOrdSModifiNo) {
        this.bPurchaseOrdSModifiNo = bPurchaseOrdSModifiNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_modifi_time", nullable = true)
    public Timestamp getbPurchaseOrdSModifiTime() {
        return bPurchaseOrdSModifiTime;
    }

    public void setbPurchaseOrdSModifiTime(Timestamp bPurchaseOrdSModifiTime) {
        this.bPurchaseOrdSModifiTime = bPurchaseOrdSModifiTime;
    }

    @Id
    @Column(name = "b_purchase_ord_s_detail_id", nullable = false)
    public int getbPurchaseOrdSDetailId() {
        return bPurchaseOrdSDetailId;
    }

    public void setbPurchaseOrdSDetailId(int bPurchaseOrdSDetailId) {
        this.bPurchaseOrdSDetailId = bPurchaseOrdSDetailId;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_group_node_id", nullable = true, length = 20)
    public String getbPurchaseOrdSGroupNodeId() {
        return bPurchaseOrdSGroupNodeId;
    }

    public void setbPurchaseOrdSGroupNodeId(String bPurchaseOrdSGroupNodeId) {
        this.bPurchaseOrdSGroupNodeId = bPurchaseOrdSGroupNodeId;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_factory_goods_no", nullable = true, length = 80)
    public String getbPurchaseOrdSFactoryGoodsNo() {
        return bPurchaseOrdSFactoryGoodsNo;
    }

    public void setbPurchaseOrdSFactoryGoodsNo(String bPurchaseOrdSFactoryGoodsNo) {
        this.bPurchaseOrdSFactoryGoodsNo = bPurchaseOrdSFactoryGoodsNo;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_ord_date", nullable = true)
    public Timestamp getbPurchaseOrdSOrdDate() {
        return bPurchaseOrdSOrdDate;
    }

    public void setbPurchaseOrdSOrdDate(Timestamp bPurchaseOrdSOrdDate) {
        this.bPurchaseOrdSOrdDate = bPurchaseOrdSOrdDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_checker", nullable = true, length = 8)
    public String getbPurchaseOrdSChecker() {
        return bPurchaseOrdSChecker;
    }

    public void setbPurchaseOrdSChecker(String bPurchaseOrdSChecker) {
        this.bPurchaseOrdSChecker = bPurchaseOrdSChecker;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_check_date", nullable = true)
    public Timestamp getbPurchaseOrdSCheckDate() {
        return bPurchaseOrdSCheckDate;
    }

    public void setbPurchaseOrdSCheckDate(Timestamp bPurchaseOrdSCheckDate) {
        this.bPurchaseOrdSCheckDate = bPurchaseOrdSCheckDate;
    }

    @Basic
    @Column(name = "b_purchase_ord_s_isPass", nullable = true, length = -1)
    public String getbPurchaseOrdSIsPass() {
        return bPurchaseOrdSIsPass;
    }

    public void setbPurchaseOrdSIsPass(String bPurchaseOrdSIsPass) {
        this.bPurchaseOrdSIsPass = bPurchaseOrdSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BPurchaseOrdSEntity that = (BPurchaseOrdSEntity) o;

        if (bPurchaseOrdSDetailId != that.bPurchaseOrdSDetailId) return false;
        if (bPurchaseOrdSOrdProcureNo != null ? !bPurchaseOrdSOrdProcureNo.equals(that.bPurchaseOrdSOrdProcureNo) : that.bPurchaseOrdSOrdProcureNo != null)
            return false;
        if (bPurchaseOrdSLocationNo != null ? !bPurchaseOrdSLocationNo.equals(that.bPurchaseOrdSLocationNo) : that.bPurchaseOrdSLocationNo != null)
            return false;
        if (bPurchaseOrdSRoomNo != null ? !bPurchaseOrdSRoomNo.equals(that.bPurchaseOrdSRoomNo) : that.bPurchaseOrdSRoomNo != null)
            return false;
        if (bPurchaseOrdSGoodsNo != null ? !bPurchaseOrdSGoodsNo.equals(that.bPurchaseOrdSGoodsNo) : that.bPurchaseOrdSGoodsNo != null)
            return false;
        if (bPurchaseOrdSMfg != null ? !bPurchaseOrdSMfg.equals(that.bPurchaseOrdSMfg) : that.bPurchaseOrdSMfg != null)
            return false;
        if (bPurchaseOrdSExp != null ? !bPurchaseOrdSExp.equals(that.bPurchaseOrdSExp) : that.bPurchaseOrdSExp != null)
            return false;
        if (bPurchaseOrdSPaymentNo != null ? !bPurchaseOrdSPaymentNo.equals(that.bPurchaseOrdSPaymentNo) : that.bPurchaseOrdSPaymentNo != null)
            return false;
        if (bPurchaseOrdSLot != null ? !bPurchaseOrdSLot.equals(that.bPurchaseOrdSLot) : that.bPurchaseOrdSLot != null)
            return false;
        if (bPurchaseOrdSQuantity != null ? !bPurchaseOrdSQuantity.equals(that.bPurchaseOrdSQuantity) : that.bPurchaseOrdSQuantity != null)
            return false;
        if (bPurchaseOrdSBoxQuantity != null ? !bPurchaseOrdSBoxQuantity.equals(that.bPurchaseOrdSBoxQuantity) : that.bPurchaseOrdSBoxQuantity != null)
            return false;
        if (bPurchaseOrdSPrice != null ? !bPurchaseOrdSPrice.equals(that.bPurchaseOrdSPrice) : that.bPurchaseOrdSPrice != null)
            return false;
        if (bPurchaseOrdSBoxPrice != null ? !bPurchaseOrdSBoxPrice.equals(that.bPurchaseOrdSBoxPrice) : that.bPurchaseOrdSBoxPrice != null)
            return false;
        if (bPurchaseOrdSTaxRate != null ? !bPurchaseOrdSTaxRate.equals(that.bPurchaseOrdSTaxRate) : that.bPurchaseOrdSTaxRate != null)
            return false;
        if (bPurchaseOrdSDetailMoney != null ? !bPurchaseOrdSDetailMoney.equals(that.bPurchaseOrdSDetailMoney) : that.bPurchaseOrdSDetailMoney != null)
            return false;
        if (bPurchaseOrdSOriginalPrice != null ? !bPurchaseOrdSOriginalPrice.equals(that.bPurchaseOrdSOriginalPrice) : that.bPurchaseOrdSOriginalPrice != null)
            return false;
        if (bPurchaseOrdSPresentationProperty != null ? !bPurchaseOrdSPresentationProperty.equals(that.bPurchaseOrdSPresentationProperty) : that.bPurchaseOrdSPresentationProperty != null)
            return false;
        if (bPurchaseOrdSAccountCheckDate != null ? !bPurchaseOrdSAccountCheckDate.equals(that.bPurchaseOrdSAccountCheckDate) : that.bPurchaseOrdSAccountCheckDate != null)
            return false;
        if (bPurchaseOrdSPurchasConNo != null ? !bPurchaseOrdSPurchasConNo.equals(that.bPurchaseOrdSPurchasConNo) : that.bPurchaseOrdSPurchasConNo != null)
            return false;
        if (bPurchaseOrdSCreateNo != null ? !bPurchaseOrdSCreateNo.equals(that.bPurchaseOrdSCreateNo) : that.bPurchaseOrdSCreateNo != null)
            return false;
        if (bPurchaseOrdSCreateDate != null ? !bPurchaseOrdSCreateDate.equals(that.bPurchaseOrdSCreateDate) : that.bPurchaseOrdSCreateDate != null)
            return false;
        if (bPurchaseOrdSModifiNo != null ? !bPurchaseOrdSModifiNo.equals(that.bPurchaseOrdSModifiNo) : that.bPurchaseOrdSModifiNo != null)
            return false;
        if (bPurchaseOrdSModifiTime != null ? !bPurchaseOrdSModifiTime.equals(that.bPurchaseOrdSModifiTime) : that.bPurchaseOrdSModifiTime != null)
            return false;
        if (bPurchaseOrdSGroupNodeId != null ? !bPurchaseOrdSGroupNodeId.equals(that.bPurchaseOrdSGroupNodeId) : that.bPurchaseOrdSGroupNodeId != null)
            return false;
        if (bPurchaseOrdSFactoryGoodsNo != null ? !bPurchaseOrdSFactoryGoodsNo.equals(that.bPurchaseOrdSFactoryGoodsNo) : that.bPurchaseOrdSFactoryGoodsNo != null)
            return false;
        if (bPurchaseOrdSOrdDate != null ? !bPurchaseOrdSOrdDate.equals(that.bPurchaseOrdSOrdDate) : that.bPurchaseOrdSOrdDate != null)
            return false;
        if (bPurchaseOrdSChecker != null ? !bPurchaseOrdSChecker.equals(that.bPurchaseOrdSChecker) : that.bPurchaseOrdSChecker != null)
            return false;
        if (bPurchaseOrdSCheckDate != null ? !bPurchaseOrdSCheckDate.equals(that.bPurchaseOrdSCheckDate) : that.bPurchaseOrdSCheckDate != null)
            return false;
        if (bPurchaseOrdSIsPass != null ? !bPurchaseOrdSIsPass.equals(that.bPurchaseOrdSIsPass) : that.bPurchaseOrdSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bPurchaseOrdSOrdProcureNo != null ? bPurchaseOrdSOrdProcureNo.hashCode() : 0;
        result = 31 * result + (bPurchaseOrdSLocationNo != null ? bPurchaseOrdSLocationNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSRoomNo != null ? bPurchaseOrdSRoomNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSGoodsNo != null ? bPurchaseOrdSGoodsNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSMfg != null ? bPurchaseOrdSMfg.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSExp != null ? bPurchaseOrdSExp.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSPaymentNo != null ? bPurchaseOrdSPaymentNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSLot != null ? bPurchaseOrdSLot.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSQuantity != null ? bPurchaseOrdSQuantity.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSBoxQuantity != null ? bPurchaseOrdSBoxQuantity.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSPrice != null ? bPurchaseOrdSPrice.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSBoxPrice != null ? bPurchaseOrdSBoxPrice.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSTaxRate != null ? bPurchaseOrdSTaxRate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSDetailMoney != null ? bPurchaseOrdSDetailMoney.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSOriginalPrice != null ? bPurchaseOrdSOriginalPrice.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSPresentationProperty != null ? bPurchaseOrdSPresentationProperty.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSAccountCheckDate != null ? bPurchaseOrdSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSPurchasConNo != null ? bPurchaseOrdSPurchasConNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSCreateNo != null ? bPurchaseOrdSCreateNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSCreateDate != null ? bPurchaseOrdSCreateDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSModifiNo != null ? bPurchaseOrdSModifiNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSModifiTime != null ? bPurchaseOrdSModifiTime.hashCode() : 0);
        result = 31 * result + bPurchaseOrdSDetailId;
        result = 31 * result + (bPurchaseOrdSGroupNodeId != null ? bPurchaseOrdSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSFactoryGoodsNo != null ? bPurchaseOrdSFactoryGoodsNo.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSOrdDate != null ? bPurchaseOrdSOrdDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSChecker != null ? bPurchaseOrdSChecker.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSCheckDate != null ? bPurchaseOrdSCheckDate.hashCode() : 0);
        result = 31 * result + (bPurchaseOrdSIsPass != null ? bPurchaseOrdSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_location_no", referencedColumnName = "store_location_location_no",insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationByBPurchaseOrdSLocationNo() {
        return storeLocationByBPurchaseOrdSLocationNo;
    }

    public void setStoreLocationByBPurchaseOrdSLocationNo(StoreLocationEntity storeLocationByBPurchaseOrdSLocationNo) {
        this.storeLocationByBPurchaseOrdSLocationNo = storeLocationByBPurchaseOrdSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_room_no", referencedColumnName = "t_room_room_no",insertable = false, updatable = false)
    public TRoomEntity gettRoomByBPurchaseOrdSRoomNo() {
        return tRoomByBPurchaseOrdSRoomNo;
    }

    public void settRoomByBPurchaseOrdSRoomNo(TRoomEntity tRoomByBPurchaseOrdSRoomNo) {
        this.tRoomByBPurchaseOrdSRoomNo = tRoomByBPurchaseOrdSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByBPurchaseOrdSGoodsNo() {
        return tGoodsByBPurchaseOrdSGoodsNo;
    }

    public void settGoodsByBPurchaseOrdSGoodsNo(TGoodsEntity tGoodsByBPurchaseOrdSGoodsNo) {
        this.tGoodsByBPurchaseOrdSGoodsNo = tGoodsByBPurchaseOrdSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_payment_no", referencedColumnName = "t_payment_payment_no",insertable = false, updatable = false)
    public TPaymentEntity gettPaymentByBPurchaseOrdSPaymentNo() {
        return tPaymentByBPurchaseOrdSPaymentNo;
    }

    public void settPaymentByBPurchaseOrdSPaymentNo(TPaymentEntity tPaymentByBPurchaseOrdSPaymentNo) {
        this.tPaymentByBPurchaseOrdSPaymentNo = tPaymentByBPurchaseOrdSPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_purchas_con_no", referencedColumnName = "c_purchase_con_m_purchas_con_no",insertable = false, updatable = false)
    public CPurchaseConMEntity getcPurchaseConMByBPurchaseOrdSPurchasConNo() {
        return cPurchaseConMByBPurchaseOrdSPurchasConNo;
    }

    public void setcPurchaseConMByBPurchaseOrdSPurchasConNo(CPurchaseConMEntity cPurchaseConMByBPurchaseOrdSPurchasConNo) {
        this.cPurchaseConMByBPurchaseOrdSPurchasConNo = cPurchaseConMByBPurchaseOrdSPurchasConNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdSCreateNo() {
        return tStaffByBPurchaseOrdSCreateNo;
    }

    public void settStaffByBPurchaseOrdSCreateNo(TStaffEntity tStaffByBPurchaseOrdSCreateNo) {
        this.tStaffByBPurchaseOrdSCreateNo = tStaffByBPurchaseOrdSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdSModifiNo() {
        return tStaffByBPurchaseOrdSModifiNo;
    }

    public void settStaffByBPurchaseOrdSModifiNo(TStaffEntity tStaffByBPurchaseOrdSModifiNo) {
        this.tStaffByBPurchaseOrdSModifiNo = tStaffByBPurchaseOrdSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByBPurchaseOrdSGroupNodeId() {
        return tOrgByBPurchaseOrdSGroupNodeId;
    }

    public void settOrgByBPurchaseOrdSGroupNodeId(TOrgEntity tOrgByBPurchaseOrdSGroupNodeId) {
        this.tOrgByBPurchaseOrdSGroupNodeId = tOrgByBPurchaseOrdSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_factory_goods_no", referencedColumnName = "t_factorys_factory_goods_no",insertable = false, updatable = false)
    public TFactorysEntity gettFactorysByBPurchaseOrdSFactoryGoodsNo() {
        return tFactorysByBPurchaseOrdSFactoryGoodsNo;
    }

    public void settFactorysByBPurchaseOrdSFactoryGoodsNo(TFactorysEntity tFactorysByBPurchaseOrdSFactoryGoodsNo) {
        this.tFactorysByBPurchaseOrdSFactoryGoodsNo = tFactorysByBPurchaseOrdSFactoryGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_purchase_ord_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBPurchaseOrdSChecker() {
        return tStaffByBPurchaseOrdSChecker;
    }

    public void settStaffByBPurchaseOrdSChecker(TStaffEntity tStaffByBPurchaseOrdSChecker) {
        this.tStaffByBPurchaseOrdSChecker = tStaffByBPurchaseOrdSChecker;
    }

    @OneToMany(mappedBy = "bPurchaseOrdS")
    public Collection<BRProcureSEntity> getbRProcureS() {
        return bRProcureS;
    }

    public void setbRProcureS(Collection<BRProcureSEntity> bRProcureS) {
        this.bRProcureS = bRProcureS;
    }
}
