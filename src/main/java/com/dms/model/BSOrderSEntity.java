package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_s_order_s", schema = "dbo", catalog = "logistics_test")
@IdClass(BSOrderSEntityPK.class)
public class BSOrderSEntity {
    private String bSOrderSSOrderNo;
    private String bSOrderSGoodsNo;
    private String bSOrderSExRequest;
    private String bSOrderSMfg;
    private String bSOrderSGoodsSpce;
    private String bSOrderSUnit;
    private BigDecimal bSOrderSOrdQuantity;
    private BigDecimal bSOrderSOrdBoxQuantity;
    private BigDecimal bSOrderSSalesQuantity;
    private String bSOrderSLot;
    private BigDecimal bSOrderSSalesBoxquantity;
    private BigDecimal bSOrderSRetailPrice;
    private String bSOrderSSConBillno;
    private Timestamp bSOrderSCreateDate;
    private Timestamp bSOrderSModifiTime;
    private int bSOrderSDetailId;
    private String bSOrderSGroupNodeId;
    private Timestamp bSOrderSCheckDate;
    private String bSOrderSPromotionNo;
    private String bSOrderSCreateNo;
    private String bSOrderSModifiNo;
    private String bSOrderSChecker;
    private String bSOrderSLocationNo;
    private String bSOrderSRoomNo;
    private Integer bSOrderSInventory;
    private BigDecimal bSOrderSOrdPrice;
    private BigDecimal bSOrderSRealPrice;
    private BigDecimal bSOrderSOriginalPrice;
    private Timestamp bSOrderSInvoiceDate;
    private Timestamp bSOrderSTakeCheckDate;
    private Timestamp bSOrderSCheckAccountDate;
    private String bSOrderSIsPass;
    private BSOrderMEntity bSOrderMByBSOrderSSOrderNo;
    private TGoodsEntity tGoodsByBSOrderSGoodsNo;
    private BSConMEntity bSConMByBSOrderSSConBillno;
    private PromotionMEntity promotionMByBSOrderSPromotionNo;
    private TStaffEntity tStaffByBSOrderSCreateNo;
    private TStaffEntity tStaffByBSOrderSModifiNo;
    private TStaffEntity tStaffByBSOrderSChecker;
    private StoreLocationEntity storeLocationByBSOrderSLocationNo;
    private TRoomEntity tRoomByBSOrderSRoomNo;

    @Id
    @Column(name = "b_s_order_s_s_order_no", nullable = false, length = 16)
    public String getbSOrderSSOrderNo() {
        return bSOrderSSOrderNo;
    }

    public void setbSOrderSSOrderNo(String bSOrderSSOrderNo) {
        this.bSOrderSSOrderNo = bSOrderSSOrderNo;
    }

    @Basic
    @Column(name = "b_s_order_s_goods_no", nullable = false, length = 20)
    public String getbSOrderSGoodsNo() {
        return bSOrderSGoodsNo;
    }

    public void setbSOrderSGoodsNo(String bSOrderSGoodsNo) {
        this.bSOrderSGoodsNo = bSOrderSGoodsNo;
    }

    @Basic
    @Column(name = "b_s_order_s_ex_request", nullable = true, length = 80)
    public String getbSOrderSExRequest() {
        return bSOrderSExRequest;
    }

    public void setbSOrderSExRequest(String bSOrderSExRequest) {
        this.bSOrderSExRequest = bSOrderSExRequest;
    }

    @Basic
    @Column(name = "b_s_order_s_MFG", nullable = false, length = 12)
    public String getbSOrderSMfg() {
        return bSOrderSMfg;
    }

    public void setbSOrderSMfg(String bSOrderSMfg) {
        this.bSOrderSMfg = bSOrderSMfg;
    }

    @Basic
    @Column(name = "b_s_order_s_goods_spce", nullable = true, length = 100)
    public String getbSOrderSGoodsSpce() {
        return bSOrderSGoodsSpce;
    }

    public void setbSOrderSGoodsSpce(String bSOrderSGoodsSpce) {
        this.bSOrderSGoodsSpce = bSOrderSGoodsSpce;
    }

    @Basic
    @Column(name = "b_s_order_s_unit", nullable = true, length = 10)
    public String getbSOrderSUnit() {
        return bSOrderSUnit;
    }

    public void setbSOrderSUnit(String bSOrderSUnit) {
        this.bSOrderSUnit = bSOrderSUnit;
    }

    @Basic
    @Column(name = "b_s_order_s_ord_quantity", nullable = true, precision = 6)
    public BigDecimal getbSOrderSOrdQuantity() {
        return bSOrderSOrdQuantity;
    }

    public void setbSOrderSOrdQuantity(BigDecimal bSOrderSOrdQuantity) {
        this.bSOrderSOrdQuantity = bSOrderSOrdQuantity;
    }

    @Basic
    @Column(name = "b_s_order_s_ord_box_quantity", nullable = true, precision = 6)
    public BigDecimal getbSOrderSOrdBoxQuantity() {
        return bSOrderSOrdBoxQuantity;
    }

    public void setbSOrderSOrdBoxQuantity(BigDecimal bSOrderSOrdBoxQuantity) {
        this.bSOrderSOrdBoxQuantity = bSOrderSOrdBoxQuantity;
    }

    @Basic
    @Column(name = "b_s_order_s_sales_quantity", nullable = true, precision = 6)
    public BigDecimal getbSOrderSSalesQuantity() {
        return bSOrderSSalesQuantity;
    }

    public void setbSOrderSSalesQuantity(BigDecimal bSOrderSSalesQuantity) {
        this.bSOrderSSalesQuantity = bSOrderSSalesQuantity;
    }

    @Basic
    @Column(name = "b_s_order_s_LOT", nullable = true, length = 20)
    public String getbSOrderSLot() {
        return bSOrderSLot;
    }

    public void setbSOrderSLot(String bSOrderSLot) {
        this.bSOrderSLot = bSOrderSLot;
    }

    @Basic
    @Column(name = "b_s_order_s_sales_boxquantity", nullable = true, precision = 6)
    public BigDecimal getbSOrderSSalesBoxquantity() {
        return bSOrderSSalesBoxquantity;
    }

    public void setbSOrderSSalesBoxquantity(BigDecimal bSOrderSSalesBoxquantity) {
        this.bSOrderSSalesBoxquantity = bSOrderSSalesBoxquantity;
    }

    @Basic
    @Column(name = "b_s_order_s_retail_price", nullable = true, precision = 6)
    public BigDecimal getbSOrderSRetailPrice() {
        return bSOrderSRetailPrice;
    }

    public void setbSOrderSRetailPrice(BigDecimal bSOrderSRetailPrice) {
        this.bSOrderSRetailPrice = bSOrderSRetailPrice;
    }

    @Basic
    @Column(name = "b_s_order_s_s_con_billno", nullable = true, length = 16)
    public String getbSOrderSSConBillno() {
        return bSOrderSSConBillno;
    }

    public void setbSOrderSSConBillno(String bSOrderSSConBillno) {
        this.bSOrderSSConBillno = bSOrderSSConBillno;
    }

    @Basic
    @Column(name = "b_s_order_s_create_date", nullable = true)
    public Timestamp getbSOrderSCreateDate() {
        return bSOrderSCreateDate;
    }

    public void setbSOrderSCreateDate(Timestamp bSOrderSCreateDate) {
        this.bSOrderSCreateDate = bSOrderSCreateDate;
    }

    @Basic
    @Column(name = "b_s_order_s_modifi_time", nullable = true)
    public Timestamp getbSOrderSModifiTime() {
        return bSOrderSModifiTime;
    }

    public void setbSOrderSModifiTime(Timestamp bSOrderSModifiTime) {
        this.bSOrderSModifiTime = bSOrderSModifiTime;
    }

    @Id
    @Column(name = "b_s_order_s_detail_id", nullable = false)
    public int getbSOrderSDetailId() {
        return bSOrderSDetailId;
    }

    public void setbSOrderSDetailId(int bSOrderSDetailId) {
        this.bSOrderSDetailId = bSOrderSDetailId;
    }

    @Basic
    @Column(name = "b_s_order_s_group_node_id", nullable = false, length = 20)
    public String getbSOrderSGroupNodeId() {
        return bSOrderSGroupNodeId;
    }

    public void setbSOrderSGroupNodeId(String bSOrderSGroupNodeId) {
        this.bSOrderSGroupNodeId = bSOrderSGroupNodeId;
    }

    @Basic
    @Column(name = "b_s_order_s_check_date", nullable = true)
    public Timestamp getbSOrderSCheckDate() {
        return bSOrderSCheckDate;
    }

    public void setbSOrderSCheckDate(Timestamp bSOrderSCheckDate) {
        this.bSOrderSCheckDate = bSOrderSCheckDate;
    }

    @Basic
    @Column(name = "b_s_order_s_Promotion_no", nullable = true, length = 16)
    public String getbSOrderSPromotionNo() {
        return bSOrderSPromotionNo;
    }

    public void setbSOrderSPromotionNo(String bSOrderSPromotionNo) {
        this.bSOrderSPromotionNo = bSOrderSPromotionNo;
    }

    @Basic
    @Column(name = "b_s_order_s_create_no", nullable = true, length = 8)
    public String getbSOrderSCreateNo() {
        return bSOrderSCreateNo;
    }

    public void setbSOrderSCreateNo(String bSOrderSCreateNo) {
        this.bSOrderSCreateNo = bSOrderSCreateNo;
    }

    @Basic
    @Column(name = "b_s_order_s_modifi_no", nullable = true, length = 8)
    public String getbSOrderSModifiNo() {
        return bSOrderSModifiNo;
    }

    public void setbSOrderSModifiNo(String bSOrderSModifiNo) {
        this.bSOrderSModifiNo = bSOrderSModifiNo;
    }

    @Basic
    @Column(name = "b_s_order_s_checker", nullable = true, length = 8)
    public String getbSOrderSChecker() {
        return bSOrderSChecker;
    }

    public void setbSOrderSChecker(String bSOrderSChecker) {
        this.bSOrderSChecker = bSOrderSChecker;
    }

    @Basic
    @Column(name = "b_s_order_s_location_no", nullable = true, length = 8)
    public String getbSOrderSLocationNo() {
        return bSOrderSLocationNo;
    }

    public void setbSOrderSLocationNo(String bSOrderSLocationNo) {
        this.bSOrderSLocationNo = bSOrderSLocationNo;
    }

    @Basic
    @Column(name = "b_s_order_s_room_no", nullable = true, length = 8)
    public String getbSOrderSRoomNo() {
        return bSOrderSRoomNo;
    }

    public void setbSOrderSRoomNo(String bSOrderSRoomNo) {
        this.bSOrderSRoomNo = bSOrderSRoomNo;
    }

    @Basic
    @Column(name = "b_s_order_s_inventory", nullable = true)
    public Integer getbSOrderSInventory() {
        return bSOrderSInventory;
    }

    public void setbSOrderSInventory(Integer bSOrderSInventory) {
        this.bSOrderSInventory = bSOrderSInventory;
    }

    @Basic
    @Column(name = "b_s_order_s_ord_price", nullable = true, precision = 6)
    public BigDecimal getbSOrderSOrdPrice() {
        return bSOrderSOrdPrice;
    }

    public void setbSOrderSOrdPrice(BigDecimal bSOrderSOrdPrice) {
        this.bSOrderSOrdPrice = bSOrderSOrdPrice;
    }

    @Basic
    @Column(name = "b_s_order_s_real_price", nullable = true, precision = 6)
    public BigDecimal getbSOrderSRealPrice() {
        return bSOrderSRealPrice;
    }

    public void setbSOrderSRealPrice(BigDecimal bSOrderSRealPrice) {
        this.bSOrderSRealPrice = bSOrderSRealPrice;
    }

    @Basic
    @Column(name = "b_s_order_s_original_price", nullable = true, precision = 6)
    public BigDecimal getbSOrderSOriginalPrice() {
        return bSOrderSOriginalPrice;
    }

    public void setbSOrderSOriginalPrice(BigDecimal bSOrderSOriginalPrice) {
        this.bSOrderSOriginalPrice = bSOrderSOriginalPrice;
    }

    @Basic
    @Column(name = "b_s_order_s_invoice_date", nullable = true)
    public Timestamp getbSOrderSInvoiceDate() {
        return bSOrderSInvoiceDate;
    }

    public void setbSOrderSInvoiceDate(Timestamp bSOrderSInvoiceDate) {
        this.bSOrderSInvoiceDate = bSOrderSInvoiceDate;
    }

    @Basic
    @Column(name = "b_s_order_s_take_check_date", nullable = true)
    public Timestamp getbSOrderSTakeCheckDate() {
        return bSOrderSTakeCheckDate;
    }

    public void setbSOrderSTakeCheckDate(Timestamp bSOrderSTakeCheckDate) {
        this.bSOrderSTakeCheckDate = bSOrderSTakeCheckDate;
    }

    @Basic
    @Column(name = "b_s_order_s_check_account_date", nullable = true)
    public Timestamp getbSOrderSCheckAccountDate() {
        return bSOrderSCheckAccountDate;
    }

    public void setbSOrderSCheckAccountDate(Timestamp bSOrderSCheckAccountDate) {
        this.bSOrderSCheckAccountDate = bSOrderSCheckAccountDate;
    }

    @Basic
    @Column(name = "b_s_order_s_isPass", nullable = true, length = 1)
    public String getbSOrderSIsPass() {
        return bSOrderSIsPass;
    }

    public void setbSOrderSIsPass(String bSOrderSIsPass) {
        this.bSOrderSIsPass = bSOrderSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSOrderSEntity that = (BSOrderSEntity) o;

        if (bSOrderSDetailId != that.bSOrderSDetailId) return false;
        if (bSOrderSSOrderNo != null ? !bSOrderSSOrderNo.equals(that.bSOrderSSOrderNo) : that.bSOrderSSOrderNo != null)
            return false;
        if (bSOrderSGoodsNo != null ? !bSOrderSGoodsNo.equals(that.bSOrderSGoodsNo) : that.bSOrderSGoodsNo != null)
            return false;
        if (bSOrderSExRequest != null ? !bSOrderSExRequest.equals(that.bSOrderSExRequest) : that.bSOrderSExRequest != null)
            return false;
        if (bSOrderSMfg != null ? !bSOrderSMfg.equals(that.bSOrderSMfg) : that.bSOrderSMfg != null) return false;
        if (bSOrderSGoodsSpce != null ? !bSOrderSGoodsSpce.equals(that.bSOrderSGoodsSpce) : that.bSOrderSGoodsSpce != null)
            return false;
        if (bSOrderSUnit != null ? !bSOrderSUnit.equals(that.bSOrderSUnit) : that.bSOrderSUnit != null) return false;
        if (bSOrderSOrdQuantity != null ? !bSOrderSOrdQuantity.equals(that.bSOrderSOrdQuantity) : that.bSOrderSOrdQuantity != null)
            return false;
        if (bSOrderSOrdBoxQuantity != null ? !bSOrderSOrdBoxQuantity.equals(that.bSOrderSOrdBoxQuantity) : that.bSOrderSOrdBoxQuantity != null)
            return false;
        if (bSOrderSSalesQuantity != null ? !bSOrderSSalesQuantity.equals(that.bSOrderSSalesQuantity) : that.bSOrderSSalesQuantity != null)
            return false;
        if (bSOrderSLot != null ? !bSOrderSLot.equals(that.bSOrderSLot) : that.bSOrderSLot != null) return false;
        if (bSOrderSSalesBoxquantity != null ? !bSOrderSSalesBoxquantity.equals(that.bSOrderSSalesBoxquantity) : that.bSOrderSSalesBoxquantity != null)
            return false;
        if (bSOrderSRetailPrice != null ? !bSOrderSRetailPrice.equals(that.bSOrderSRetailPrice) : that.bSOrderSRetailPrice != null)
            return false;
        if (bSOrderSSConBillno != null ? !bSOrderSSConBillno.equals(that.bSOrderSSConBillno) : that.bSOrderSSConBillno != null)
            return false;
        if (bSOrderSCreateDate != null ? !bSOrderSCreateDate.equals(that.bSOrderSCreateDate) : that.bSOrderSCreateDate != null)
            return false;
        if (bSOrderSModifiTime != null ? !bSOrderSModifiTime.equals(that.bSOrderSModifiTime) : that.bSOrderSModifiTime != null)
            return false;
        if (bSOrderSGroupNodeId != null ? !bSOrderSGroupNodeId.equals(that.bSOrderSGroupNodeId) : that.bSOrderSGroupNodeId != null)
            return false;
        if (bSOrderSCheckDate != null ? !bSOrderSCheckDate.equals(that.bSOrderSCheckDate) : that.bSOrderSCheckDate != null)
            return false;
        if (bSOrderSPromotionNo != null ? !bSOrderSPromotionNo.equals(that.bSOrderSPromotionNo) : that.bSOrderSPromotionNo != null)
            return false;
        if (bSOrderSCreateNo != null ? !bSOrderSCreateNo.equals(that.bSOrderSCreateNo) : that.bSOrderSCreateNo != null)
            return false;
        if (bSOrderSModifiNo != null ? !bSOrderSModifiNo.equals(that.bSOrderSModifiNo) : that.bSOrderSModifiNo != null)
            return false;
        if (bSOrderSChecker != null ? !bSOrderSChecker.equals(that.bSOrderSChecker) : that.bSOrderSChecker != null)
            return false;
        if (bSOrderSLocationNo != null ? !bSOrderSLocationNo.equals(that.bSOrderSLocationNo) : that.bSOrderSLocationNo != null)
            return false;
        if (bSOrderSRoomNo != null ? !bSOrderSRoomNo.equals(that.bSOrderSRoomNo) : that.bSOrderSRoomNo != null)
            return false;
        if (bSOrderSInventory != null ? !bSOrderSInventory.equals(that.bSOrderSInventory) : that.bSOrderSInventory != null)
            return false;
        if (bSOrderSOrdPrice != null ? !bSOrderSOrdPrice.equals(that.bSOrderSOrdPrice) : that.bSOrderSOrdPrice != null)
            return false;
        if (bSOrderSRealPrice != null ? !bSOrderSRealPrice.equals(that.bSOrderSRealPrice) : that.bSOrderSRealPrice != null)
            return false;
        if (bSOrderSOriginalPrice != null ? !bSOrderSOriginalPrice.equals(that.bSOrderSOriginalPrice) : that.bSOrderSOriginalPrice != null)
            return false;
        if (bSOrderSInvoiceDate != null ? !bSOrderSInvoiceDate.equals(that.bSOrderSInvoiceDate) : that.bSOrderSInvoiceDate != null)
            return false;
        if (bSOrderSTakeCheckDate != null ? !bSOrderSTakeCheckDate.equals(that.bSOrderSTakeCheckDate) : that.bSOrderSTakeCheckDate != null)
            return false;
        if (bSOrderSCheckAccountDate != null ? !bSOrderSCheckAccountDate.equals(that.bSOrderSCheckAccountDate) : that.bSOrderSCheckAccountDate != null)
            return false;
        if (bSOrderSIsPass != null ? !bSOrderSIsPass.equals(that.bSOrderSIsPass) : that.bSOrderSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSOrderSSOrderNo != null ? bSOrderSSOrderNo.hashCode() : 0;
        result = 31 * result + (bSOrderSGoodsNo != null ? bSOrderSGoodsNo.hashCode() : 0);
        result = 31 * result + (bSOrderSExRequest != null ? bSOrderSExRequest.hashCode() : 0);
        result = 31 * result + (bSOrderSMfg != null ? bSOrderSMfg.hashCode() : 0);
        result = 31 * result + (bSOrderSGoodsSpce != null ? bSOrderSGoodsSpce.hashCode() : 0);
        result = 31 * result + (bSOrderSUnit != null ? bSOrderSUnit.hashCode() : 0);
        result = 31 * result + (bSOrderSOrdQuantity != null ? bSOrderSOrdQuantity.hashCode() : 0);
        result = 31 * result + (bSOrderSOrdBoxQuantity != null ? bSOrderSOrdBoxQuantity.hashCode() : 0);
        result = 31 * result + (bSOrderSSalesQuantity != null ? bSOrderSSalesQuantity.hashCode() : 0);
        result = 31 * result + (bSOrderSLot != null ? bSOrderSLot.hashCode() : 0);
        result = 31 * result + (bSOrderSSalesBoxquantity != null ? bSOrderSSalesBoxquantity.hashCode() : 0);
        result = 31 * result + (bSOrderSRetailPrice != null ? bSOrderSRetailPrice.hashCode() : 0);
        result = 31 * result + (bSOrderSSConBillno != null ? bSOrderSSConBillno.hashCode() : 0);
        result = 31 * result + (bSOrderSCreateDate != null ? bSOrderSCreateDate.hashCode() : 0);
        result = 31 * result + (bSOrderSModifiTime != null ? bSOrderSModifiTime.hashCode() : 0);
        result = 31 * result + bSOrderSDetailId;
        result = 31 * result + (bSOrderSGroupNodeId != null ? bSOrderSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSOrderSCheckDate != null ? bSOrderSCheckDate.hashCode() : 0);
        result = 31 * result + (bSOrderSPromotionNo != null ? bSOrderSPromotionNo.hashCode() : 0);
        result = 31 * result + (bSOrderSCreateNo != null ? bSOrderSCreateNo.hashCode() : 0);
        result = 31 * result + (bSOrderSModifiNo != null ? bSOrderSModifiNo.hashCode() : 0);
        result = 31 * result + (bSOrderSChecker != null ? bSOrderSChecker.hashCode() : 0);
        result = 31 * result + (bSOrderSLocationNo != null ? bSOrderSLocationNo.hashCode() : 0);
        result = 31 * result + (bSOrderSRoomNo != null ? bSOrderSRoomNo.hashCode() : 0);
        result = 31 * result + (bSOrderSInventory != null ? bSOrderSInventory.hashCode() : 0);
        result = 31 * result + (bSOrderSOrdPrice != null ? bSOrderSOrdPrice.hashCode() : 0);
        result = 31 * result + (bSOrderSRealPrice != null ? bSOrderSRealPrice.hashCode() : 0);
        result = 31 * result + (bSOrderSOriginalPrice != null ? bSOrderSOriginalPrice.hashCode() : 0);
        result = 31 * result + (bSOrderSInvoiceDate != null ? bSOrderSInvoiceDate.hashCode() : 0);
        result = 31 * result + (bSOrderSTakeCheckDate != null ? bSOrderSTakeCheckDate.hashCode() : 0);
        result = 31 * result + (bSOrderSCheckAccountDate != null ? bSOrderSCheckAccountDate.hashCode() : 0);
        result = 31 * result + (bSOrderSIsPass != null ? bSOrderSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_s_order_no", referencedColumnName = "b_s_order_m_s_order_no", nullable = false)
    public BSOrderMEntity getbSOrderMByBSOrderSSOrderNo() {
        return bSOrderMByBSOrderSSOrderNo;
    }

    public void setbSOrderMByBSOrderSSOrderNo(BSOrderMEntity bSOrderMByBSOrderSSOrderNo) {
        this.bSOrderMByBSOrderSSOrderNo = bSOrderMByBSOrderSSOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false)
    public TGoodsEntity gettGoodsByBSOrderSGoodsNo() {
        return tGoodsByBSOrderSGoodsNo;
    }

    public void settGoodsByBSOrderSGoodsNo(TGoodsEntity tGoodsByBSOrderSGoodsNo) {
        this.tGoodsByBSOrderSGoodsNo = tGoodsByBSOrderSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_s_con_billno", referencedColumnName = "b_s_con_m_s_con_billno")
    public BSConMEntity getbSConMByBSOrderSSConBillno() {
        return bSConMByBSOrderSSConBillno;
    }

    public void setbSConMByBSOrderSSConBillno(BSConMEntity bSConMByBSOrderSSConBillno) {
        this.bSConMByBSOrderSSConBillno = bSConMByBSOrderSSConBillno;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_Promotion_no", referencedColumnName = "Promotion_m_Promotion_no")
    public PromotionMEntity getPromotionMByBSOrderSPromotionNo() {
        return promotionMByBSOrderSPromotionNo;
    }

    public void setPromotionMByBSOrderSPromotionNo(PromotionMEntity promotionMByBSOrderSPromotionNo) {
        this.promotionMByBSOrderSPromotionNo = promotionMByBSOrderSPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSOrderSCreateNo() {
        return tStaffByBSOrderSCreateNo;
    }

    public void settStaffByBSOrderSCreateNo(TStaffEntity tStaffByBSOrderSCreateNo) {
        this.tStaffByBSOrderSCreateNo = tStaffByBSOrderSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSOrderSModifiNo() {
        return tStaffByBSOrderSModifiNo;
    }

    public void settStaffByBSOrderSModifiNo(TStaffEntity tStaffByBSOrderSModifiNo) {
        this.tStaffByBSOrderSModifiNo = tStaffByBSOrderSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSOrderSChecker() {
        return tStaffByBSOrderSChecker;
    }

    public void settStaffByBSOrderSChecker(TStaffEntity tStaffByBSOrderSChecker) {
        this.tStaffByBSOrderSChecker = tStaffByBSOrderSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_location_no", referencedColumnName = "store_location_location_no")
    public StoreLocationEntity getStoreLocationByBSOrderSLocationNo() {
        return storeLocationByBSOrderSLocationNo;
    }

    public void setStoreLocationByBSOrderSLocationNo(StoreLocationEntity storeLocationByBSOrderSLocationNo) {
        this.storeLocationByBSOrderSLocationNo = storeLocationByBSOrderSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_order_s_room_no", referencedColumnName = "t_room_room_no")
    public TRoomEntity gettRoomByBSOrderSRoomNo() {
        return tRoomByBSOrderSRoomNo;
    }

    public void settRoomByBSOrderSRoomNo(TRoomEntity tRoomByBSOrderSRoomNo) {
        this.tRoomByBSOrderSRoomNo = tRoomByBSOrderSRoomNo;
    }
}
