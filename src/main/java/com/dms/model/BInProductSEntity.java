package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_in_product_s", schema = "dbo", catalog = "logistics")
@IdClass(BInProductSEntityPK.class)
public class BInProductSEntity {
    private String bInProductSGoodsNo;
    private String bInProductSProducStorageNo;
    private int bInProductSDetailId;
    private String bInProductSRoomNo;
    private String bInProductSLocationNo;
    private Integer bInProductSStock;
    private BigDecimal bInProductSQuantity;
    private BigDecimal bInProductSBoxQuantity;
    private BigDecimal bInProductSBoxPrice;
    private BigDecimal bInProductSDetailMoney;
    private BigDecimal bInProductSTaxRate;
    private BigDecimal bInProductSOriginalPrice;
    private String bInProductSPresentationProperty;
    private Timestamp bInProductSInvoiceDate;
    private String bInProductSCreaterNo;
    private Timestamp bInProductSCreateDate;
    private String bInProductSModifiNo;
    private Timestamp bInProductSModifiTime;
    private String bInProductSChecker;
    private Timestamp bInProductSCheckDate;
    private String bInProductSGroupNodeId;
    private String bInProductSNotes;
    private String bInProductSIsPass;
    private TGoodsEntity tGoodsByBInProductSGoodsNo;
    private BInProductMEntity bInProductMByBInProductSProducStorageNo;
    private TStaffEntity tStaffByBInProductSCreaterNo;
    private TStaffEntity tStaffByBInProductSModifiNo;
    private TStaffEntity tStaffByBInProductSChecker;
    private TOrgEntity tOrgByBInProductSGroupNodeId;

    @Basic
    @Column(name = "b_in_product_s_goods_no", nullable = false, length = 20)
    public String getbInProductSGoodsNo() {
        return bInProductSGoodsNo;
    }

    public void setbInProductSGoodsNo(String bInProductSGoodsNo) {
        this.bInProductSGoodsNo = bInProductSGoodsNo;
    }

    @Id
    @Column(name = "b_in_product_s_producStorage_no", nullable = false, length = 20)
    public String getbInProductSProducStorageNo() {
        return bInProductSProducStorageNo;
    }

    public void setbInProductSProducStorageNo(String bInProductSProducStorageNo) {
        this.bInProductSProducStorageNo = bInProductSProducStorageNo;
    }

    @Id
    @Column(name = "b_in_product_s_detail_id", nullable = false)
    public int getbInProductSDetailId() {
        return bInProductSDetailId;
    }

    public void setbInProductSDetailId(int bInProductSDetailId) {
        this.bInProductSDetailId = bInProductSDetailId;
    }

    @Basic
    @Column(name = "b_in_product_s_room_no", nullable = false, length = 8)
    public String getbInProductSRoomNo() {
        return bInProductSRoomNo;
    }

    public void setbInProductSRoomNo(String bInProductSRoomNo) {
        this.bInProductSRoomNo = bInProductSRoomNo;
    }

    @Basic
    @Column(name = "b_in_product_s_location_no", nullable = false, length = 8)
    public String getbInProductSLocationNo() {
        return bInProductSLocationNo;
    }

    public void setbInProductSLocationNo(String bInProductSLocationNo) {
        this.bInProductSLocationNo = bInProductSLocationNo;
    }

    @Basic
    @Column(name = "b_in_product_s_Stock", nullable = true)
    public Integer getbInProductSStock() {
        return bInProductSStock;
    }

    public void setbInProductSStock(Integer bInProductSStock) {
        this.bInProductSStock = bInProductSStock;
    }

    @Basic
    @Column(name = "b_in_product_s_quantity", nullable = true, precision = 4)
    public BigDecimal getbInProductSQuantity() {
        return bInProductSQuantity;
    }

    public void setbInProductSQuantity(BigDecimal bInProductSQuantity) {
        this.bInProductSQuantity = bInProductSQuantity;
    }

    @Basic
    @Column(name = "b_in_product_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getbInProductSBoxQuantity() {
        return bInProductSBoxQuantity;
    }

    public void setbInProductSBoxQuantity(BigDecimal bInProductSBoxQuantity) {
        this.bInProductSBoxQuantity = bInProductSBoxQuantity;
    }

    @Basic
    @Column(name = "b_in_product_s_box_price", nullable = true, precision = 4)
    public BigDecimal getbInProductSBoxPrice() {
        return bInProductSBoxPrice;
    }

    public void setbInProductSBoxPrice(BigDecimal bInProductSBoxPrice) {
        this.bInProductSBoxPrice = bInProductSBoxPrice;
    }

    @Basic
    @Column(name = "b_in_product_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getbInProductSDetailMoney() {
        return bInProductSDetailMoney;
    }

    public void setbInProductSDetailMoney(BigDecimal bInProductSDetailMoney) {
        this.bInProductSDetailMoney = bInProductSDetailMoney;
    }

    @Basic
    @Column(name = "b_in_product_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbInProductSTaxRate() {
        return bInProductSTaxRate;
    }

    public void setbInProductSTaxRate(BigDecimal bInProductSTaxRate) {
        this.bInProductSTaxRate = bInProductSTaxRate;
    }

    @Basic
    @Column(name = "b_in_product_s_original_price", nullable = true, precision = 4)
    public BigDecimal getbInProductSOriginalPrice() {
        return bInProductSOriginalPrice;
    }

    public void setbInProductSOriginalPrice(BigDecimal bInProductSOriginalPrice) {
        this.bInProductSOriginalPrice = bInProductSOriginalPrice;
    }

    @Basic
    @Column(name = "b_in_product_s_presentation_property", nullable = true, length = 4)
    public String getbInProductSPresentationProperty() {
        return bInProductSPresentationProperty;
    }

    public void setbInProductSPresentationProperty(String bInProductSPresentationProperty) {
        this.bInProductSPresentationProperty = bInProductSPresentationProperty;
    }

    @Basic
    @Column(name = "b_in_product_s_invoice_date", nullable = true)
    public Timestamp getbInProductSInvoiceDate() {
        return bInProductSInvoiceDate;
    }

    public void setbInProductSInvoiceDate(Timestamp bInProductSInvoiceDate) {
        this.bInProductSInvoiceDate = bInProductSInvoiceDate;
    }

    @Basic
    @Column(name = "b_in_product_s_creater_no", nullable = true, length = 8)
    public String getbInProductSCreaterNo() {
        return bInProductSCreaterNo;
    }

    public void setbInProductSCreaterNo(String bInProductSCreaterNo) {
        this.bInProductSCreaterNo = bInProductSCreaterNo;
    }

    @Basic
    @Column(name = "b_in_product_s_create_date", nullable = true)
    public Timestamp getbInProductSCreateDate() {
        return bInProductSCreateDate;
    }

    public void setbInProductSCreateDate(Timestamp bInProductSCreateDate) {
        this.bInProductSCreateDate = bInProductSCreateDate;
    }

    @Basic
    @Column(name = "b_in_product_s_modifi_no", nullable = true, length = 8)
    public String getbInProductSModifiNo() {
        return bInProductSModifiNo;
    }

    public void setbInProductSModifiNo(String bInProductSModifiNo) {
        this.bInProductSModifiNo = bInProductSModifiNo;
    }

    @Basic
    @Column(name = "b_in_product_s_modifi_time", nullable = true)
    public Timestamp getbInProductSModifiTime() {
        return bInProductSModifiTime;
    }

    public void setbInProductSModifiTime(Timestamp bInProductSModifiTime) {
        this.bInProductSModifiTime = bInProductSModifiTime;
    }

    @Basic
    @Column(name = "b_in_product_s_checker", nullable = true, length = 8)
    public String getbInProductSChecker() {
        return bInProductSChecker;
    }

    public void setbInProductSChecker(String bInProductSChecker) {
        this.bInProductSChecker = bInProductSChecker;
    }

    @Basic
    @Column(name = "b_in_product_s_check_date", nullable = true)
    public Timestamp getbInProductSCheckDate() {
        return bInProductSCheckDate;
    }

    public void setbInProductSCheckDate(Timestamp bInProductSCheckDate) {
        this.bInProductSCheckDate = bInProductSCheckDate;
    }

    @Basic
    @Column(name = "b_in_product_s_group_node_id", nullable = false, length = 20)
    public String getbInProductSGroupNodeId() {
        return bInProductSGroupNodeId;
    }

    public void setbInProductSGroupNodeId(String bInProductSGroupNodeId) {
        this.bInProductSGroupNodeId = bInProductSGroupNodeId;
    }

    @Basic
    @Column(name = "b_in_product_s_notes", nullable = true, length = 200)
    public String getbInProductSNotes() {
        return bInProductSNotes;
    }

    public void setbInProductSNotes(String bInProductSNotes) {
        this.bInProductSNotes = bInProductSNotes;
    }

    @Basic
    @Column(name = "b_in_product_s_isPass", nullable = true, length = -1)
    public String getbInProductSIsPass() {
        return bInProductSIsPass;
    }

    public void setbInProductSIsPass(String bInProductSIsPass) {
        this.bInProductSIsPass = bInProductSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInProductSEntity that = (BInProductSEntity) o;

        if (bInProductSDetailId != that.bInProductSDetailId) return false;
        if (bInProductSGoodsNo != null ? !bInProductSGoodsNo.equals(that.bInProductSGoodsNo) : that.bInProductSGoodsNo != null)
            return false;
        if (bInProductSProducStorageNo != null ? !bInProductSProducStorageNo.equals(that.bInProductSProducStorageNo) : that.bInProductSProducStorageNo != null)
            return false;
        if (bInProductSRoomNo != null ? !bInProductSRoomNo.equals(that.bInProductSRoomNo) : that.bInProductSRoomNo != null)
            return false;
        if (bInProductSLocationNo != null ? !bInProductSLocationNo.equals(that.bInProductSLocationNo) : that.bInProductSLocationNo != null)
            return false;
        if (bInProductSStock != null ? !bInProductSStock.equals(that.bInProductSStock) : that.bInProductSStock != null)
            return false;
        if (bInProductSQuantity != null ? !bInProductSQuantity.equals(that.bInProductSQuantity) : that.bInProductSQuantity != null)
            return false;
        if (bInProductSBoxQuantity != null ? !bInProductSBoxQuantity.equals(that.bInProductSBoxQuantity) : that.bInProductSBoxQuantity != null)
            return false;
        if (bInProductSBoxPrice != null ? !bInProductSBoxPrice.equals(that.bInProductSBoxPrice) : that.bInProductSBoxPrice != null)
            return false;
        if (bInProductSDetailMoney != null ? !bInProductSDetailMoney.equals(that.bInProductSDetailMoney) : that.bInProductSDetailMoney != null)
            return false;
        if (bInProductSTaxRate != null ? !bInProductSTaxRate.equals(that.bInProductSTaxRate) : that.bInProductSTaxRate != null)
            return false;
        if (bInProductSOriginalPrice != null ? !bInProductSOriginalPrice.equals(that.bInProductSOriginalPrice) : that.bInProductSOriginalPrice != null)
            return false;
        if (bInProductSPresentationProperty != null ? !bInProductSPresentationProperty.equals(that.bInProductSPresentationProperty) : that.bInProductSPresentationProperty != null)
            return false;
        if (bInProductSInvoiceDate != null ? !bInProductSInvoiceDate.equals(that.bInProductSInvoiceDate) : that.bInProductSInvoiceDate != null)
            return false;
        if (bInProductSCreaterNo != null ? !bInProductSCreaterNo.equals(that.bInProductSCreaterNo) : that.bInProductSCreaterNo != null)
            return false;
        if (bInProductSCreateDate != null ? !bInProductSCreateDate.equals(that.bInProductSCreateDate) : that.bInProductSCreateDate != null)
            return false;
        if (bInProductSModifiNo != null ? !bInProductSModifiNo.equals(that.bInProductSModifiNo) : that.bInProductSModifiNo != null)
            return false;
        if (bInProductSModifiTime != null ? !bInProductSModifiTime.equals(that.bInProductSModifiTime) : that.bInProductSModifiTime != null)
            return false;
        if (bInProductSChecker != null ? !bInProductSChecker.equals(that.bInProductSChecker) : that.bInProductSChecker != null)
            return false;
        if (bInProductSCheckDate != null ? !bInProductSCheckDate.equals(that.bInProductSCheckDate) : that.bInProductSCheckDate != null)
            return false;
        if (bInProductSGroupNodeId != null ? !bInProductSGroupNodeId.equals(that.bInProductSGroupNodeId) : that.bInProductSGroupNodeId != null)
            return false;
        if (bInProductSNotes != null ? !bInProductSNotes.equals(that.bInProductSNotes) : that.bInProductSNotes != null)
            return false;
        if (bInProductSIsPass != null ? !bInProductSIsPass.equals(that.bInProductSIsPass) : that.bInProductSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInProductSGoodsNo != null ? bInProductSGoodsNo.hashCode() : 0;
        result = 31 * result + (bInProductSProducStorageNo != null ? bInProductSProducStorageNo.hashCode() : 0);
        result = 31 * result + bInProductSDetailId;
        result = 31 * result + (bInProductSRoomNo != null ? bInProductSRoomNo.hashCode() : 0);
        result = 31 * result + (bInProductSLocationNo != null ? bInProductSLocationNo.hashCode() : 0);
        result = 31 * result + (bInProductSStock != null ? bInProductSStock.hashCode() : 0);
        result = 31 * result + (bInProductSQuantity != null ? bInProductSQuantity.hashCode() : 0);
        result = 31 * result + (bInProductSBoxQuantity != null ? bInProductSBoxQuantity.hashCode() : 0);
        result = 31 * result + (bInProductSBoxPrice != null ? bInProductSBoxPrice.hashCode() : 0);
        result = 31 * result + (bInProductSDetailMoney != null ? bInProductSDetailMoney.hashCode() : 0);
        result = 31 * result + (bInProductSTaxRate != null ? bInProductSTaxRate.hashCode() : 0);
        result = 31 * result + (bInProductSOriginalPrice != null ? bInProductSOriginalPrice.hashCode() : 0);
        result = 31 * result + (bInProductSPresentationProperty != null ? bInProductSPresentationProperty.hashCode() : 0);
        result = 31 * result + (bInProductSInvoiceDate != null ? bInProductSInvoiceDate.hashCode() : 0);
        result = 31 * result + (bInProductSCreaterNo != null ? bInProductSCreaterNo.hashCode() : 0);
        result = 31 * result + (bInProductSCreateDate != null ? bInProductSCreateDate.hashCode() : 0);
        result = 31 * result + (bInProductSModifiNo != null ? bInProductSModifiNo.hashCode() : 0);
        result = 31 * result + (bInProductSModifiTime != null ? bInProductSModifiTime.hashCode() : 0);
        result = 31 * result + (bInProductSChecker != null ? bInProductSChecker.hashCode() : 0);
        result = 31 * result + (bInProductSCheckDate != null ? bInProductSCheckDate.hashCode() : 0);
        result = 31 * result + (bInProductSGroupNodeId != null ? bInProductSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bInProductSNotes != null ? bInProductSNotes.hashCode() : 0);
        result = 31 * result + (bInProductSIsPass != null ? bInProductSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByBInProductSGoodsNo() {
        return tGoodsByBInProductSGoodsNo;
    }

    public void settGoodsByBInProductSGoodsNo(TGoodsEntity tGoodsByBInProductSGoodsNo) {
        this.tGoodsByBInProductSGoodsNo = tGoodsByBInProductSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_producStorage_no", referencedColumnName = "b_in_product_m_producStorage_no", nullable = false,insertable = false, updatable = false)
    public BInProductMEntity getbInProductMByBInProductSProducStorageNo() {
        return bInProductMByBInProductSProducStorageNo;
    }

    public void setbInProductMByBInProductSProducStorageNo(BInProductMEntity bInProductMByBInProductSProducStorageNo) {
        this.bInProductMByBInProductSProducStorageNo = bInProductMByBInProductSProducStorageNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInProductSCreaterNo() {
        return tStaffByBInProductSCreaterNo;
    }

    public void settStaffByBInProductSCreaterNo(TStaffEntity tStaffByBInProductSCreaterNo) {
        this.tStaffByBInProductSCreaterNo = tStaffByBInProductSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInProductSModifiNo() {
        return tStaffByBInProductSModifiNo;
    }

    public void settStaffByBInProductSModifiNo(TStaffEntity tStaffByBInProductSModifiNo) {
        this.tStaffByBInProductSModifiNo = tStaffByBInProductSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInProductSChecker() {
        return tStaffByBInProductSChecker;
    }

    public void settStaffByBInProductSChecker(TStaffEntity tStaffByBInProductSChecker) {
        this.tStaffByBInProductSChecker = tStaffByBInProductSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_product_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBInProductSGroupNodeId() {
        return tOrgByBInProductSGroupNodeId;
    }

    public void settOrgByBInProductSGroupNodeId(TOrgEntity tOrgByBInProductSGroupNodeId) {
        this.tOrgByBInProductSGroupNodeId = tOrgByBInProductSGroupNodeId;
    }
}
