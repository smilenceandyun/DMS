package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_goods", schema = "dbo", catalog = "logistics_test")
public class TGoodsEntity {
    private String tGoodsGoodsNo;
    private String tGoodsGoodsClassifyNo;
    private String tGoodsBrandNo;
    private String tGoodsBriefCode;
    private String tGoodsFactoryGoodsNo;
    private String tGoodsBarcode;
    private String tGoodsGoodsName;
    private String tGoodsEname;
    private String tGoodsBriefName;
    private String tGoodsGoodsSpce;
    private String tGoodsSSpec;
    private String tGoodsUnit;
    private String tGoodsBoxBarcode;
    private BigDecimal tGoodsPackQuantity;
    private String tGoodsPackUnit;
    private BigDecimal tGoodsInPrice;
    private BigDecimal tGoodsInTax;
    private BigDecimal tGoodsInTaxprice;
    private BigDecimal tGoodsSPrice;
    private BigDecimal tGoodsBulkDiscount;
    private BigDecimal tGoodsBulkPrice;
    private BigDecimal tGoodsRetailPrice;
    private BigDecimal tGoodsSingleWeight;
    private BigDecimal tGoodsPackWeight;
    private BigDecimal tGoodsSingleVol;
    private BigDecimal tGoodsPackVol;
    private Integer tGoodsExDay;
    private String tGoodsStoreType;
    private Integer tGoodsBaseBox;
    private String tGoodsOrigin;
    private String tGoodsStorePlace;
    private String tGoodsBatch;
    private String tGoodsGroupNoGoods;
    private String tGoodsTaxCode;
    private String tGoodsRemark;
    private String tGoodsCreateNo;
    private Timestamp tGoodsCreateDate;
    private String tGoodsModifiNo;
    private Timestamp tGoodsModifiTime;
    private String tGoodsGroupNodeId;
    private String tGoodsFlag;
    private Collection<PromotionMProductSEntity> promotionMProductSByTGoodsGoodsNo;
    private Collection<PromotionPGroupEntity> promotionPGroupsByTGoodsGoodsNo;
    private Collection<BAgentInstockSEntity> bAgentInstockSByTGoodsGoodsNo;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByTGoodsGoodsNo;
    private Collection<BInPresentSEntity> bInPresentSByTGoodsGoodsNo;
    private Collection<BInProductSEntity> bInProductSByTGoodsGoodsNo;
    private Collection<BOutPresentSEntity> bOutPresentSByTGoodsGoodsNo;
    private Collection<BOutPresentSEntity> bOutPresentSByTGoodsGoodsNo_0;
    private Collection<BProcureSEntity> bProcureSByTGoodsGoodsNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTGoodsGoodsNo;
    private Collection<BSConSEntity> bSConSByTGoodsGoodsNo;
    private Collection<BSOrderSEntity> bSOrderSByTGoodsGoodsNo;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTGoodsGoodsNo;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByTGoodsGoodsNo;
    private Collection<SBreakageSEntity> sBreakageSByTGoodsGoodsNo;
    private Collection<SInBorrowSEntity> sInBorrowSByTGoodsGoodsNo;
    private Collection<SOutLoanSEntity> sOutLoanSByTGoodsGoodsNo;
    private TGoodsClassifyEntity tGoodsClassifyByTGoodsGoodsClassifyNo;
    private TBrandEntity tBrandByTGoodsBrandNo;
    private TFactorysEntity tFactorysByTGoodsFactoryGoodsNo;
    private TStaffEntity tStaffByTGoodsCreateNo;
    private TStaffEntity tStaffByTGoodsModifiNo;
    private TOrgEntity tOrgByTGoodsGroupNodeId;

    @Id
    @Column(name = "t_goods_goods_no", nullable = false, length = 20)
    public String gettGoodsGoodsNo() {
        return tGoodsGoodsNo;
    }

    public void settGoodsGoodsNo(String tGoodsGoodsNo) {
        this.tGoodsGoodsNo = tGoodsGoodsNo;
    }

    @Basic
    @Column(name = "t_goods_goods_classify_no", nullable = false, length = 20)
    public String gettGoodsGoodsClassifyNo() {
        return tGoodsGoodsClassifyNo;
    }

    public void settGoodsGoodsClassifyNo(String tGoodsGoodsClassifyNo) {
        this.tGoodsGoodsClassifyNo = tGoodsGoodsClassifyNo;
    }

    @Basic
    @Column(name = "t_goods_brand_no", nullable = true, length = 3)
    public String gettGoodsBrandNo() {
        return tGoodsBrandNo;
    }

    public void settGoodsBrandNo(String tGoodsBrandNo) {
        this.tGoodsBrandNo = tGoodsBrandNo;
    }

    @Basic
    @Column(name = "t_goods_brief_code", nullable = true, length = 50)
    public String gettGoodsBriefCode() {
        return tGoodsBriefCode;
    }

    public void settGoodsBriefCode(String tGoodsBriefCode) {
        this.tGoodsBriefCode = tGoodsBriefCode;
    }

    @Basic
    @Column(name = "t_goods_factory_goods_no", nullable = true, length = 80)
    public String gettGoodsFactoryGoodsNo() {
        return tGoodsFactoryGoodsNo;
    }

    public void settGoodsFactoryGoodsNo(String tGoodsFactoryGoodsNo) {
        this.tGoodsFactoryGoodsNo = tGoodsFactoryGoodsNo;
    }

    @Basic
    @Column(name = "t_goods_barcode", nullable = false, length = 20)
    public String gettGoodsBarcode() {
        return tGoodsBarcode;
    }

    public void settGoodsBarcode(String tGoodsBarcode) {
        this.tGoodsBarcode = tGoodsBarcode;
    }

    @Basic
    @Column(name = "t_goods_goods_name", nullable = false, length = 200)
    public String gettGoodsGoodsName() {
        return tGoodsGoodsName;
    }

    public void settGoodsGoodsName(String tGoodsGoodsName) {
        this.tGoodsGoodsName = tGoodsGoodsName;
    }

    @Basic
    @Column(name = "t_goods_ename", nullable = true, length = 100)
    public String gettGoodsEname() {
        return tGoodsEname;
    }

    public void settGoodsEname(String tGoodsEname) {
        this.tGoodsEname = tGoodsEname;
    }

    @Basic
    @Column(name = "t_goods_brief_name", nullable = true, length = 50)
    public String gettGoodsBriefName() {
        return tGoodsBriefName;
    }

    public void settGoodsBriefName(String tGoodsBriefName) {
        this.tGoodsBriefName = tGoodsBriefName;
    }

    @Basic
    @Column(name = "t_goods_goods_spce", nullable = false, length = 100)
    public String gettGoodsGoodsSpce() {
        return tGoodsGoodsSpce;
    }

    public void settGoodsGoodsSpce(String tGoodsGoodsSpce) {
        this.tGoodsGoodsSpce = tGoodsGoodsSpce;
    }

    @Basic
    @Column(name = "t_goods_s_spec", nullable = false, length = 50)
    public String gettGoodsSSpec() {
        return tGoodsSSpec;
    }

    public void settGoodsSSpec(String tGoodsSSpec) {
        this.tGoodsSSpec = tGoodsSSpec;
    }

    @Basic
    @Column(name = "t_goods_unit", nullable = false, length = 10)
    public String gettGoodsUnit() {
        return tGoodsUnit;
    }

    public void settGoodsUnit(String tGoodsUnit) {
        this.tGoodsUnit = tGoodsUnit;
    }

    @Basic
    @Column(name = "t_goods_box_barcode", nullable = true, length = 20)
    public String gettGoodsBoxBarcode() {
        return tGoodsBoxBarcode;
    }

    public void settGoodsBoxBarcode(String tGoodsBoxBarcode) {
        this.tGoodsBoxBarcode = tGoodsBoxBarcode;
    }

    @Basic
    @Column(name = "t_goods_pack_quantity", nullable = false, precision = 6)
    public BigDecimal gettGoodsPackQuantity() {
        return tGoodsPackQuantity;
    }

    public void settGoodsPackQuantity(BigDecimal tGoodsPackQuantity) {
        this.tGoodsPackQuantity = tGoodsPackQuantity;
    }

    @Basic
    @Column(name = "t_goods_pack_unit", nullable = false, length = 10)
    public String gettGoodsPackUnit() {
        return tGoodsPackUnit;
    }

    public void settGoodsPackUnit(String tGoodsPackUnit) {
        this.tGoodsPackUnit = tGoodsPackUnit;
    }

    @Basic
    @Column(name = "t_goods_in_price", nullable = true, precision = 6)
    public BigDecimal gettGoodsInPrice() {
        return tGoodsInPrice;
    }

    public void settGoodsInPrice(BigDecimal tGoodsInPrice) {
        this.tGoodsInPrice = tGoodsInPrice;
    }

    @Basic
    @Column(name = "t_goods_in_tax", nullable = true, precision = 6)
    public BigDecimal gettGoodsInTax() {
        return tGoodsInTax;
    }

    public void settGoodsInTax(BigDecimal tGoodsInTax) {
        this.tGoodsInTax = tGoodsInTax;
    }

    @Basic
    @Column(name = "t_goods_in_taxprice", nullable = true, precision = 6)
    public BigDecimal gettGoodsInTaxprice() {
        return tGoodsInTaxprice;
    }

    public void settGoodsInTaxprice(BigDecimal tGoodsInTaxprice) {
        this.tGoodsInTaxprice = tGoodsInTaxprice;
    }

    @Basic
    @Column(name = "t_goods_s_price", nullable = true, precision = 6)
    public BigDecimal gettGoodsSPrice() {
        return tGoodsSPrice;
    }

    public void settGoodsSPrice(BigDecimal tGoodsSPrice) {
        this.tGoodsSPrice = tGoodsSPrice;
    }

    @Basic
    @Column(name = "t_goods_bulk_discount", nullable = true, precision = 6)
    public BigDecimal gettGoodsBulkDiscount() {
        return tGoodsBulkDiscount;
    }

    public void settGoodsBulkDiscount(BigDecimal tGoodsBulkDiscount) {
        this.tGoodsBulkDiscount = tGoodsBulkDiscount;
    }

    @Basic
    @Column(name = "t_goods_bulk_price", nullable = true, precision = 6)
    public BigDecimal gettGoodsBulkPrice() {
        return tGoodsBulkPrice;
    }

    public void settGoodsBulkPrice(BigDecimal tGoodsBulkPrice) {
        this.tGoodsBulkPrice = tGoodsBulkPrice;
    }

    @Basic
    @Column(name = "t_goods_retail_price", nullable = true, precision = 6)
    public BigDecimal gettGoodsRetailPrice() {
        return tGoodsRetailPrice;
    }

    public void settGoodsRetailPrice(BigDecimal tGoodsRetailPrice) {
        this.tGoodsRetailPrice = tGoodsRetailPrice;
    }

    @Basic
    @Column(name = "t_goods_single_weight", nullable = true, precision = 6)
    public BigDecimal gettGoodsSingleWeight() {
        return tGoodsSingleWeight;
    }

    public void settGoodsSingleWeight(BigDecimal tGoodsSingleWeight) {
        this.tGoodsSingleWeight = tGoodsSingleWeight;
    }

    @Basic
    @Column(name = "t_goods_pack_weight", nullable = true, precision = 6)
    public BigDecimal gettGoodsPackWeight() {
        return tGoodsPackWeight;
    }

    public void settGoodsPackWeight(BigDecimal tGoodsPackWeight) {
        this.tGoodsPackWeight = tGoodsPackWeight;
    }

    @Basic
    @Column(name = "t_goods_single_vol", nullable = true, precision = 6)
    public BigDecimal gettGoodsSingleVol() {
        return tGoodsSingleVol;
    }

    public void settGoodsSingleVol(BigDecimal tGoodsSingleVol) {
        this.tGoodsSingleVol = tGoodsSingleVol;
    }

    @Basic
    @Column(name = "t_goods_pack_vol", nullable = true, precision = 6)
    public BigDecimal gettGoodsPackVol() {
        return tGoodsPackVol;
    }

    public void settGoodsPackVol(BigDecimal tGoodsPackVol) {
        this.tGoodsPackVol = tGoodsPackVol;
    }

    @Basic
    @Column(name = "t_goods_ex_day", nullable = true)
    public Integer gettGoodsExDay() {
        return tGoodsExDay;
    }

    public void settGoodsExDay(Integer tGoodsExDay) {
        this.tGoodsExDay = tGoodsExDay;
    }

    @Basic
    @Column(name = "t_goods_store_type", nullable = true, length = 20)
    public String gettGoodsStoreType() {
        return tGoodsStoreType;
    }

    public void settGoodsStoreType(String tGoodsStoreType) {
        this.tGoodsStoreType = tGoodsStoreType;
    }

    @Basic
    @Column(name = "t_goods_base_box", nullable = true)
    public Integer gettGoodsBaseBox() {
        return tGoodsBaseBox;
    }

    public void settGoodsBaseBox(Integer tGoodsBaseBox) {
        this.tGoodsBaseBox = tGoodsBaseBox;
    }

    @Basic
    @Column(name = "t_goods_origin", nullable = true, length = 50)
    public String gettGoodsOrigin() {
        return tGoodsOrigin;
    }

    public void settGoodsOrigin(String tGoodsOrigin) {
        this.tGoodsOrigin = tGoodsOrigin;
    }

    @Basic
    @Column(name = "t_goods_store_place", nullable = true, length = 50)
    public String gettGoodsStorePlace() {
        return tGoodsStorePlace;
    }

    public void settGoodsStorePlace(String tGoodsStorePlace) {
        this.tGoodsStorePlace = tGoodsStorePlace;
    }

    @Basic
    @Column(name = "t_goods_batch", nullable = false, length = 1)
    public String gettGoodsBatch() {
        return tGoodsBatch;
    }

    public void settGoodsBatch(String tGoodsBatch) {
        this.tGoodsBatch = tGoodsBatch;
    }

    @Basic
    @Column(name = "t_goods_group_no_goods", nullable = true, length = 10)
    public String gettGoodsGroupNoGoods() {
        return tGoodsGroupNoGoods;
    }

    public void settGoodsGroupNoGoods(String tGoodsGroupNoGoods) {
        this.tGoodsGroupNoGoods = tGoodsGroupNoGoods;
    }

    @Basic
    @Column(name = "t_goods_tax_code", nullable = true, length = 50)
    public String gettGoodsTaxCode() {
        return tGoodsTaxCode;
    }

    public void settGoodsTaxCode(String tGoodsTaxCode) {
        this.tGoodsTaxCode = tGoodsTaxCode;
    }

    @Basic
    @Column(name = "t_goods_remark", nullable = true, length = 100)
    public String gettGoodsRemark() {
        return tGoodsRemark;
    }

    public void settGoodsRemark(String tGoodsRemark) {
        this.tGoodsRemark = tGoodsRemark;
    }

    @Basic
    @Column(name = "t_goods_create_no", nullable = true, length = 8)
    public String gettGoodsCreateNo() {
        return tGoodsCreateNo;
    }

    public void settGoodsCreateNo(String tGoodsCreateNo) {
        this.tGoodsCreateNo = tGoodsCreateNo;
    }

    @Basic
    @Column(name = "t_goods_create_date", nullable = true)
    public Timestamp gettGoodsCreateDate() {
        return tGoodsCreateDate;
    }

    public void settGoodsCreateDate(Timestamp tGoodsCreateDate) {
        this.tGoodsCreateDate = tGoodsCreateDate;
    }

    @Basic
    @Column(name = "t_goods_modifi_no", nullable = true, length = 8)
    public String gettGoodsModifiNo() {
        return tGoodsModifiNo;
    }

    public void settGoodsModifiNo(String tGoodsModifiNo) {
        this.tGoodsModifiNo = tGoodsModifiNo;
    }

    @Basic
    @Column(name = "t_goods_modifi_time", nullable = true)
    public Timestamp gettGoodsModifiTime() {
        return tGoodsModifiTime;
    }

    public void settGoodsModifiTime(Timestamp tGoodsModifiTime) {
        this.tGoodsModifiTime = tGoodsModifiTime;
    }

    @Basic
    @Column(name = "t_goods_group_node_id", nullable = true, length = 20)
    public String gettGoodsGroupNodeId() {
        return tGoodsGroupNodeId;
    }

    public void settGoodsGroupNodeId(String tGoodsGroupNodeId) {
        this.tGoodsGroupNodeId = tGoodsGroupNodeId;
    }

    @Basic
    @Column(name = "t_goods_flag", nullable = false, length = 1)
    public String gettGoodsFlag() {
        return tGoodsFlag;
    }

    public void settGoodsFlag(String tGoodsFlag) {
        this.tGoodsFlag = tGoodsFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TGoodsEntity that = (TGoodsEntity) o;

        if (tGoodsGoodsNo != null ? !tGoodsGoodsNo.equals(that.tGoodsGoodsNo) : that.tGoodsGoodsNo != null)
            return false;
        if (tGoodsGoodsClassifyNo != null ? !tGoodsGoodsClassifyNo.equals(that.tGoodsGoodsClassifyNo) : that.tGoodsGoodsClassifyNo != null)
            return false;
        if (tGoodsBrandNo != null ? !tGoodsBrandNo.equals(that.tGoodsBrandNo) : that.tGoodsBrandNo != null)
            return false;
        if (tGoodsBriefCode != null ? !tGoodsBriefCode.equals(that.tGoodsBriefCode) : that.tGoodsBriefCode != null)
            return false;
        if (tGoodsFactoryGoodsNo != null ? !tGoodsFactoryGoodsNo.equals(that.tGoodsFactoryGoodsNo) : that.tGoodsFactoryGoodsNo != null)
            return false;
        if (tGoodsBarcode != null ? !tGoodsBarcode.equals(that.tGoodsBarcode) : that.tGoodsBarcode != null)
            return false;
        if (tGoodsGoodsName != null ? !tGoodsGoodsName.equals(that.tGoodsGoodsName) : that.tGoodsGoodsName != null)
            return false;
        if (tGoodsEname != null ? !tGoodsEname.equals(that.tGoodsEname) : that.tGoodsEname != null) return false;
        if (tGoodsBriefName != null ? !tGoodsBriefName.equals(that.tGoodsBriefName) : that.tGoodsBriefName != null)
            return false;
        if (tGoodsGoodsSpce != null ? !tGoodsGoodsSpce.equals(that.tGoodsGoodsSpce) : that.tGoodsGoodsSpce != null)
            return false;
        if (tGoodsSSpec != null ? !tGoodsSSpec.equals(that.tGoodsSSpec) : that.tGoodsSSpec != null) return false;
        if (tGoodsUnit != null ? !tGoodsUnit.equals(that.tGoodsUnit) : that.tGoodsUnit != null) return false;
        if (tGoodsBoxBarcode != null ? !tGoodsBoxBarcode.equals(that.tGoodsBoxBarcode) : that.tGoodsBoxBarcode != null)
            return false;
        if (tGoodsPackQuantity != null ? !tGoodsPackQuantity.equals(that.tGoodsPackQuantity) : that.tGoodsPackQuantity != null)
            return false;
        if (tGoodsPackUnit != null ? !tGoodsPackUnit.equals(that.tGoodsPackUnit) : that.tGoodsPackUnit != null)
            return false;
        if (tGoodsInPrice != null ? !tGoodsInPrice.equals(that.tGoodsInPrice) : that.tGoodsInPrice != null)
            return false;
        if (tGoodsInTax != null ? !tGoodsInTax.equals(that.tGoodsInTax) : that.tGoodsInTax != null) return false;
        if (tGoodsInTaxprice != null ? !tGoodsInTaxprice.equals(that.tGoodsInTaxprice) : that.tGoodsInTaxprice != null)
            return false;
        if (tGoodsSPrice != null ? !tGoodsSPrice.equals(that.tGoodsSPrice) : that.tGoodsSPrice != null) return false;
        if (tGoodsBulkDiscount != null ? !tGoodsBulkDiscount.equals(that.tGoodsBulkDiscount) : that.tGoodsBulkDiscount != null)
            return false;
        if (tGoodsBulkPrice != null ? !tGoodsBulkPrice.equals(that.tGoodsBulkPrice) : that.tGoodsBulkPrice != null)
            return false;
        if (tGoodsRetailPrice != null ? !tGoodsRetailPrice.equals(that.tGoodsRetailPrice) : that.tGoodsRetailPrice != null)
            return false;
        if (tGoodsSingleWeight != null ? !tGoodsSingleWeight.equals(that.tGoodsSingleWeight) : that.tGoodsSingleWeight != null)
            return false;
        if (tGoodsPackWeight != null ? !tGoodsPackWeight.equals(that.tGoodsPackWeight) : that.tGoodsPackWeight != null)
            return false;
        if (tGoodsSingleVol != null ? !tGoodsSingleVol.equals(that.tGoodsSingleVol) : that.tGoodsSingleVol != null)
            return false;
        if (tGoodsPackVol != null ? !tGoodsPackVol.equals(that.tGoodsPackVol) : that.tGoodsPackVol != null)
            return false;
        if (tGoodsExDay != null ? !tGoodsExDay.equals(that.tGoodsExDay) : that.tGoodsExDay != null) return false;
        if (tGoodsStoreType != null ? !tGoodsStoreType.equals(that.tGoodsStoreType) : that.tGoodsStoreType != null)
            return false;
        if (tGoodsBaseBox != null ? !tGoodsBaseBox.equals(that.tGoodsBaseBox) : that.tGoodsBaseBox != null)
            return false;
        if (tGoodsOrigin != null ? !tGoodsOrigin.equals(that.tGoodsOrigin) : that.tGoodsOrigin != null) return false;
        if (tGoodsStorePlace != null ? !tGoodsStorePlace.equals(that.tGoodsStorePlace) : that.tGoodsStorePlace != null)
            return false;
        if (tGoodsBatch != null ? !tGoodsBatch.equals(that.tGoodsBatch) : that.tGoodsBatch != null) return false;
        if (tGoodsGroupNoGoods != null ? !tGoodsGroupNoGoods.equals(that.tGoodsGroupNoGoods) : that.tGoodsGroupNoGoods != null)
            return false;
        if (tGoodsTaxCode != null ? !tGoodsTaxCode.equals(that.tGoodsTaxCode) : that.tGoodsTaxCode != null)
            return false;
        if (tGoodsRemark != null ? !tGoodsRemark.equals(that.tGoodsRemark) : that.tGoodsRemark != null) return false;
        if (tGoodsCreateNo != null ? !tGoodsCreateNo.equals(that.tGoodsCreateNo) : that.tGoodsCreateNo != null)
            return false;
        if (tGoodsCreateDate != null ? !tGoodsCreateDate.equals(that.tGoodsCreateDate) : that.tGoodsCreateDate != null)
            return false;
        if (tGoodsModifiNo != null ? !tGoodsModifiNo.equals(that.tGoodsModifiNo) : that.tGoodsModifiNo != null)
            return false;
        if (tGoodsModifiTime != null ? !tGoodsModifiTime.equals(that.tGoodsModifiTime) : that.tGoodsModifiTime != null)
            return false;
        if (tGoodsGroupNodeId != null ? !tGoodsGroupNodeId.equals(that.tGoodsGroupNodeId) : that.tGoodsGroupNodeId != null)
            return false;
        if (tGoodsFlag != null ? !tGoodsFlag.equals(that.tGoodsFlag) : that.tGoodsFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tGoodsGoodsNo != null ? tGoodsGoodsNo.hashCode() : 0;
        result = 31 * result + (tGoodsGoodsClassifyNo != null ? tGoodsGoodsClassifyNo.hashCode() : 0);
        result = 31 * result + (tGoodsBrandNo != null ? tGoodsBrandNo.hashCode() : 0);
        result = 31 * result + (tGoodsBriefCode != null ? tGoodsBriefCode.hashCode() : 0);
        result = 31 * result + (tGoodsFactoryGoodsNo != null ? tGoodsFactoryGoodsNo.hashCode() : 0);
        result = 31 * result + (tGoodsBarcode != null ? tGoodsBarcode.hashCode() : 0);
        result = 31 * result + (tGoodsGoodsName != null ? tGoodsGoodsName.hashCode() : 0);
        result = 31 * result + (tGoodsEname != null ? tGoodsEname.hashCode() : 0);
        result = 31 * result + (tGoodsBriefName != null ? tGoodsBriefName.hashCode() : 0);
        result = 31 * result + (tGoodsGoodsSpce != null ? tGoodsGoodsSpce.hashCode() : 0);
        result = 31 * result + (tGoodsSSpec != null ? tGoodsSSpec.hashCode() : 0);
        result = 31 * result + (tGoodsUnit != null ? tGoodsUnit.hashCode() : 0);
        result = 31 * result + (tGoodsBoxBarcode != null ? tGoodsBoxBarcode.hashCode() : 0);
        result = 31 * result + (tGoodsPackQuantity != null ? tGoodsPackQuantity.hashCode() : 0);
        result = 31 * result + (tGoodsPackUnit != null ? tGoodsPackUnit.hashCode() : 0);
        result = 31 * result + (tGoodsInPrice != null ? tGoodsInPrice.hashCode() : 0);
        result = 31 * result + (tGoodsInTax != null ? tGoodsInTax.hashCode() : 0);
        result = 31 * result + (tGoodsInTaxprice != null ? tGoodsInTaxprice.hashCode() : 0);
        result = 31 * result + (tGoodsSPrice != null ? tGoodsSPrice.hashCode() : 0);
        result = 31 * result + (tGoodsBulkDiscount != null ? tGoodsBulkDiscount.hashCode() : 0);
        result = 31 * result + (tGoodsBulkPrice != null ? tGoodsBulkPrice.hashCode() : 0);
        result = 31 * result + (tGoodsRetailPrice != null ? tGoodsRetailPrice.hashCode() : 0);
        result = 31 * result + (tGoodsSingleWeight != null ? tGoodsSingleWeight.hashCode() : 0);
        result = 31 * result + (tGoodsPackWeight != null ? tGoodsPackWeight.hashCode() : 0);
        result = 31 * result + (tGoodsSingleVol != null ? tGoodsSingleVol.hashCode() : 0);
        result = 31 * result + (tGoodsPackVol != null ? tGoodsPackVol.hashCode() : 0);
        result = 31 * result + (tGoodsExDay != null ? tGoodsExDay.hashCode() : 0);
        result = 31 * result + (tGoodsStoreType != null ? tGoodsStoreType.hashCode() : 0);
        result = 31 * result + (tGoodsBaseBox != null ? tGoodsBaseBox.hashCode() : 0);
        result = 31 * result + (tGoodsOrigin != null ? tGoodsOrigin.hashCode() : 0);
        result = 31 * result + (tGoodsStorePlace != null ? tGoodsStorePlace.hashCode() : 0);
        result = 31 * result + (tGoodsBatch != null ? tGoodsBatch.hashCode() : 0);
        result = 31 * result + (tGoodsGroupNoGoods != null ? tGoodsGroupNoGoods.hashCode() : 0);
        result = 31 * result + (tGoodsTaxCode != null ? tGoodsTaxCode.hashCode() : 0);
        result = 31 * result + (tGoodsRemark != null ? tGoodsRemark.hashCode() : 0);
        result = 31 * result + (tGoodsCreateNo != null ? tGoodsCreateNo.hashCode() : 0);
        result = 31 * result + (tGoodsCreateDate != null ? tGoodsCreateDate.hashCode() : 0);
        result = 31 * result + (tGoodsModifiNo != null ? tGoodsModifiNo.hashCode() : 0);
        result = 31 * result + (tGoodsModifiTime != null ? tGoodsModifiTime.hashCode() : 0);
        result = 31 * result + (tGoodsGroupNodeId != null ? tGoodsGroupNodeId.hashCode() : 0);
        result = 31 * result + (tGoodsFlag != null ? tGoodsFlag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tGoodsByPromotionMProductSGoodsNo")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByTGoodsGoodsNo() {
        return promotionMProductSByTGoodsGoodsNo;
    }

    public void setPromotionMProductSByTGoodsGoodsNo(Collection<PromotionMProductSEntity> promotionMProductSByTGoodsGoodsNo) {
        this.promotionMProductSByTGoodsGoodsNo = promotionMProductSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByPromotionPGroupGoodsNo")
    public Collection<PromotionPGroupEntity> getPromotionPGroupsByTGoodsGoodsNo() {
        return promotionPGroupsByTGoodsGoodsNo;
    }

    public void setPromotionPGroupsByTGoodsGoodsNo(Collection<PromotionPGroupEntity> promotionPGroupsByTGoodsGoodsNo) {
        this.promotionPGroupsByTGoodsGoodsNo = promotionPGroupsByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBAgentInstockSGoodsNo")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByTGoodsGoodsNo() {
        return bAgentInstockSByTGoodsGoodsNo;
    }

    public void setbAgentInstockSByTGoodsGoodsNo(Collection<BAgentInstockSEntity> bAgentInstockSByTGoodsGoodsNo) {
        this.bAgentInstockSByTGoodsGoodsNo = bAgentInstockSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBAgentSalesSGoodsNo")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByTGoodsGoodsNo() {
        return bAgentSalesSESByTGoodsGoodsNo;
    }

    public void setbAgentSalesSESByTGoodsGoodsNo(Collection<BAgentSalesSEntity> bAgentSalesSESByTGoodsGoodsNo) {
        this.bAgentSalesSESByTGoodsGoodsNo = bAgentSalesSESByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBInPresentSGoodsNo")
    public Collection<BInPresentSEntity> getbInPresentSByTGoodsGoodsNo() {
        return bInPresentSByTGoodsGoodsNo;
    }

    public void setbInPresentSByTGoodsGoodsNo(Collection<BInPresentSEntity> bInPresentSByTGoodsGoodsNo) {
        this.bInPresentSByTGoodsGoodsNo = bInPresentSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBInProductSGoodsNo")
    public Collection<BInProductSEntity> getbInProductSByTGoodsGoodsNo() {
        return bInProductSByTGoodsGoodsNo;
    }

    public void setbInProductSByTGoodsGoodsNo(Collection<BInProductSEntity> bInProductSByTGoodsGoodsNo) {
        this.bInProductSByTGoodsGoodsNo = bInProductSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBOutPresentSGoodsNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByTGoodsGoodsNo() {
        return bOutPresentSByTGoodsGoodsNo;
    }

    public void setbOutPresentSByTGoodsGoodsNo(Collection<BOutPresentSEntity> bOutPresentSByTGoodsGoodsNo) {
        this.bOutPresentSByTGoodsGoodsNo = bOutPresentSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBOutPresentSMainGoodsNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByTGoodsGoodsNo_0() {
        return bOutPresentSByTGoodsGoodsNo_0;
    }

    public void setbOutPresentSByTGoodsGoodsNo_0(Collection<BOutPresentSEntity> bOutPresentSByTGoodsGoodsNo_0) {
        this.bOutPresentSByTGoodsGoodsNo_0 = bOutPresentSByTGoodsGoodsNo_0;
    }

    @OneToMany(mappedBy = "tGoodsByBProcureSGoodsNo")
    public Collection<BProcureSEntity> getbProcureSByTGoodsGoodsNo() {
        return bProcureSByTGoodsGoodsNo;
    }

    public void setbProcureSByTGoodsGoodsNo(Collection<BProcureSEntity> bProcureSByTGoodsGoodsNo) {
        this.bProcureSByTGoodsGoodsNo = bProcureSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBPurchaseOrdSGoodsNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTGoodsGoodsNo() {
        return bPurchaseOrdSByTGoodsGoodsNo;
    }

    public void setbPurchaseOrdSByTGoodsGoodsNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTGoodsGoodsNo) {
        this.bPurchaseOrdSByTGoodsGoodsNo = bPurchaseOrdSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBSConSGoodsNo")
    public Collection<BSConSEntity> getbSConSByTGoodsGoodsNo() {
        return bSConSByTGoodsGoodsNo;
    }

    public void setbSConSByTGoodsGoodsNo(Collection<BSConSEntity> bSConSByTGoodsGoodsNo) {
        this.bSConSByTGoodsGoodsNo = bSConSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByBSOrderSGoodsNo")
    public Collection<BSOrderSEntity> getbSOrderSByTGoodsGoodsNo() {
        return bSOrderSByTGoodsGoodsNo;
    }

    public void setbSOrderSByTGoodsGoodsNo(Collection<BSOrderSEntity> bSOrderSByTGoodsGoodsNo) {
        this.bSOrderSByTGoodsGoodsNo = bSOrderSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByCPurchaseConSGoodsNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTGoodsGoodsNo() {
        return cPurchaseConSByTGoodsGoodsNo;
    }

    public void setcPurchaseConSByTGoodsGoodsNo(Collection<CPurchaseConSEntity> cPurchaseConSByTGoodsGoodsNo) {
        this.cPurchaseConSByTGoodsGoodsNo = cPurchaseConSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsByFStockAdjusSGoodsNo")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByTGoodsGoodsNo() {
        return fStockAdjusSESByTGoodsGoodsNo;
    }

    public void setfStockAdjusSESByTGoodsGoodsNo(Collection<FStockAdjusSEntity> fStockAdjusSESByTGoodsGoodsNo) {
        this.fStockAdjusSESByTGoodsGoodsNo = fStockAdjusSESByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsBySBreakageSGoodsNo")
    public Collection<SBreakageSEntity> getsBreakageSByTGoodsGoodsNo() {
        return sBreakageSByTGoodsGoodsNo;
    }

    public void setsBreakageSByTGoodsGoodsNo(Collection<SBreakageSEntity> sBreakageSByTGoodsGoodsNo) {
        this.sBreakageSByTGoodsGoodsNo = sBreakageSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsBySInBorrowSGoodsNo")
    public Collection<SInBorrowSEntity> getsInBorrowSByTGoodsGoodsNo() {
        return sInBorrowSByTGoodsGoodsNo;
    }

    public void setsInBorrowSByTGoodsGoodsNo(Collection<SInBorrowSEntity> sInBorrowSByTGoodsGoodsNo) {
        this.sInBorrowSByTGoodsGoodsNo = sInBorrowSByTGoodsGoodsNo;
    }

    @OneToMany(mappedBy = "tGoodsBySOutLoanSGoodsNo")
    public Collection<SOutLoanSEntity> getsOutLoanSByTGoodsGoodsNo() {
        return sOutLoanSByTGoodsGoodsNo;
    }

    public void setsOutLoanSByTGoodsGoodsNo(Collection<SOutLoanSEntity> sOutLoanSByTGoodsGoodsNo) {
        this.sOutLoanSByTGoodsGoodsNo = sOutLoanSByTGoodsGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_goods_classify_no", referencedColumnName = "t_goods_classify_goods_classify_no", nullable = false)
    public TGoodsClassifyEntity gettGoodsClassifyByTGoodsGoodsClassifyNo() {
        return tGoodsClassifyByTGoodsGoodsClassifyNo;
    }

    public void settGoodsClassifyByTGoodsGoodsClassifyNo(TGoodsClassifyEntity tGoodsClassifyByTGoodsGoodsClassifyNo) {
        this.tGoodsClassifyByTGoodsGoodsClassifyNo = tGoodsClassifyByTGoodsGoodsClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_brand_no", referencedColumnName = "t_brand_brand_no")
    public TBrandEntity gettBrandByTGoodsBrandNo() {
        return tBrandByTGoodsBrandNo;
    }

    public void settBrandByTGoodsBrandNo(TBrandEntity tBrandByTGoodsBrandNo) {
        this.tBrandByTGoodsBrandNo = tBrandByTGoodsBrandNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_factory_goods_no", referencedColumnName = "t_factorys_factory_goods_no")
    public TFactorysEntity gettFactorysByTGoodsFactoryGoodsNo() {
        return tFactorysByTGoodsFactoryGoodsNo;
    }

    public void settFactorysByTGoodsFactoryGoodsNo(TFactorysEntity tFactorysByTGoodsFactoryGoodsNo) {
        this.tFactorysByTGoodsFactoryGoodsNo = tFactorysByTGoodsFactoryGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTGoodsCreateNo() {
        return tStaffByTGoodsCreateNo;
    }

    public void settStaffByTGoodsCreateNo(TStaffEntity tStaffByTGoodsCreateNo) {
        this.tStaffByTGoodsCreateNo = tStaffByTGoodsCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTGoodsModifiNo() {
        return tStaffByTGoodsModifiNo;
    }

    public void settStaffByTGoodsModifiNo(TStaffEntity tStaffByTGoodsModifiNo) {
        this.tStaffByTGoodsModifiNo = tStaffByTGoodsModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_goods_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTGoodsGroupNodeId() {
        return tOrgByTGoodsGroupNodeId;
    }

    public void settOrgByTGoodsGroupNodeId(TOrgEntity tOrgByTGoodsGroupNodeId) {
        this.tOrgByTGoodsGroupNodeId = tOrgByTGoodsGroupNodeId;
    }
}
