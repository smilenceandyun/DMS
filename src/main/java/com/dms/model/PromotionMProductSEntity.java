package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Promotion_m_product_s", schema = "dbo", catalog = "logistics")
@IdClass(PromotionMProductSEntityPK.class)
public class PromotionMProductSEntity {
    private String promotionMProductSPromotionNo;
    private String promotionMProductSGoodsNo;
    private String promotionMProductSLocationNo;
    private BigDecimal promotionMProductSDemandNumber;
    private BigDecimal promotionMProductSQtQuota;
    private String promotionMProductSSalesPromotionNo;
    private BigDecimal promotionMProductSPPrice;
    private BigDecimal promotionMProductSDiscount;
    private BigDecimal promotionMProductSReduceMoney;
    private int promotionMProductSIndexId;
    private String promotionMProductSGroupNodeId;
    private String promotionMProductSClientNo;
    private BigDecimal promotionMProductSDemand;
    private String promotionMProductSChecker;
    private Timestamp promotionMProductSCheckDate;
    private String promotionMProductSIsPass;
    private PromotionMEntity promotionMByPromotionMProductSPromotionNo;
    private TGoodsEntity tGoodsByPromotionMProductSGoodsNo;
    private StoreLocationEntity storeLocationByPromotionMProductSLocationNo;
    private TSalesPromotionEntity tSalesPromotionByPromotionMProductSSalesPromotionNo;
    private TOrgEntity tOrgByPromotionMProductSGroupNodeId;
    private TClientEntity tClientByPromotionMProductSClientNo;
    private TStaffEntity tStaffByPromotionMProductSChecker;

    @Id
    @Column(name = "Promotion_m_product_s_Promotion_no", nullable = false, length = 16)
    public String getPromotionMProductSPromotionNo() {
        return promotionMProductSPromotionNo;
    }

    public void setPromotionMProductSPromotionNo(String promotionMProductSPromotionNo) {
        this.promotionMProductSPromotionNo = promotionMProductSPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_goods_no", nullable = false, length = 20)
    public String getPromotionMProductSGoodsNo() {
        return promotionMProductSGoodsNo;
    }

    public void setPromotionMProductSGoodsNo(String promotionMProductSGoodsNo) {
        this.promotionMProductSGoodsNo = promotionMProductSGoodsNo;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_location_no", nullable = true, length = 8)
    public String getPromotionMProductSLocationNo() {
        return promotionMProductSLocationNo;
    }

    public void setPromotionMProductSLocationNo(String promotionMProductSLocationNo) {
        this.promotionMProductSLocationNo = promotionMProductSLocationNo;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_demand_number", nullable = false, precision = 6)
    public BigDecimal getPromotionMProductSDemandNumber() {
        return promotionMProductSDemandNumber;
    }

    public void setPromotionMProductSDemandNumber(BigDecimal promotionMProductSDemandNumber) {
        this.promotionMProductSDemandNumber = promotionMProductSDemandNumber;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_Qt_quota", nullable = true, precision = 6)
    public BigDecimal getPromotionMProductSQtQuota() {
        return promotionMProductSQtQuota;
    }

    public void setPromotionMProductSQtQuota(BigDecimal promotionMProductSQtQuota) {
        this.promotionMProductSQtQuota = promotionMProductSQtQuota;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_sales_promotion_no", nullable = true, length = 4)
    public String getPromotionMProductSSalesPromotionNo() {
        return promotionMProductSSalesPromotionNo;
    }

    public void setPromotionMProductSSalesPromotionNo(String promotionMProductSSalesPromotionNo) {
        this.promotionMProductSSalesPromotionNo = promotionMProductSSalesPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_P_price", nullable = true, precision = 6)
    public BigDecimal getPromotionMProductSPPrice() {
        return promotionMProductSPPrice;
    }

    public void setPromotionMProductSPPrice(BigDecimal promotionMProductSPPrice) {
        this.promotionMProductSPPrice = promotionMProductSPPrice;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_Discount", nullable = true, precision = 6)
    public BigDecimal getPromotionMProductSDiscount() {
        return promotionMProductSDiscount;
    }

    public void setPromotionMProductSDiscount(BigDecimal promotionMProductSDiscount) {
        this.promotionMProductSDiscount = promotionMProductSDiscount;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_Reduce_money", nullable = true, precision = 6)
    public BigDecimal getPromotionMProductSReduceMoney() {
        return promotionMProductSReduceMoney;
    }

    public void setPromotionMProductSReduceMoney(BigDecimal promotionMProductSReduceMoney) {
        this.promotionMProductSReduceMoney = promotionMProductSReduceMoney;
    }

    @Id
    @Column(name = "Promotion_m_product_s_index_id", nullable = false)
    public int getPromotionMProductSIndexId() {
        return promotionMProductSIndexId;
    }

    public void setPromotionMProductSIndexId(int promotionMProductSIndexId) {
        this.promotionMProductSIndexId = promotionMProductSIndexId;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_group_node_id", nullable = false, length = 20)
    public String getPromotionMProductSGroupNodeId() {
        return promotionMProductSGroupNodeId;
    }

    public void setPromotionMProductSGroupNodeId(String promotionMProductSGroupNodeId) {
        this.promotionMProductSGroupNodeId = promotionMProductSGroupNodeId;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_client_no", nullable = true, length = 20)
    public String getPromotionMProductSClientNo() {
        return promotionMProductSClientNo;
    }

    public void setPromotionMProductSClientNo(String promotionMProductSClientNo) {
        this.promotionMProductSClientNo = promotionMProductSClientNo;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_demand", nullable = true, precision = 6)
    public BigDecimal getPromotionMProductSDemand() {
        return promotionMProductSDemand;
    }

    public void setPromotionMProductSDemand(BigDecimal promotionMProductSDemand) {
        this.promotionMProductSDemand = promotionMProductSDemand;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_checker", nullable = true, length = 8)
    public String getPromotionMProductSChecker() {
        return promotionMProductSChecker;
    }

    public void setPromotionMProductSChecker(String promotionMProductSChecker) {
        this.promotionMProductSChecker = promotionMProductSChecker;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_check_date", nullable = true)
    public Timestamp getPromotionMProductSCheckDate() {
        return promotionMProductSCheckDate;
    }

    public void setPromotionMProductSCheckDate(Timestamp promotionMProductSCheckDate) {
        this.promotionMProductSCheckDate = promotionMProductSCheckDate;
    }

    @Basic
    @Column(name = "Promotion_m_product_s_isPass", nullable = true, length = -1)
    public String getPromotionMProductSIsPass() {
        return promotionMProductSIsPass;
    }

    public void setPromotionMProductSIsPass(String promotionMProductSIsPass) {
        this.promotionMProductSIsPass = promotionMProductSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionMProductSEntity that = (PromotionMProductSEntity) o;

        if (promotionMProductSIndexId != that.promotionMProductSIndexId) return false;
        if (promotionMProductSPromotionNo != null ? !promotionMProductSPromotionNo.equals(that.promotionMProductSPromotionNo) : that.promotionMProductSPromotionNo != null)
            return false;
        if (promotionMProductSGoodsNo != null ? !promotionMProductSGoodsNo.equals(that.promotionMProductSGoodsNo) : that.promotionMProductSGoodsNo != null)
            return false;
        if (promotionMProductSLocationNo != null ? !promotionMProductSLocationNo.equals(that.promotionMProductSLocationNo) : that.promotionMProductSLocationNo != null)
            return false;
        if (promotionMProductSDemandNumber != null ? !promotionMProductSDemandNumber.equals(that.promotionMProductSDemandNumber) : that.promotionMProductSDemandNumber != null)
            return false;
        if (promotionMProductSQtQuota != null ? !promotionMProductSQtQuota.equals(that.promotionMProductSQtQuota) : that.promotionMProductSQtQuota != null)
            return false;
        if (promotionMProductSSalesPromotionNo != null ? !promotionMProductSSalesPromotionNo.equals(that.promotionMProductSSalesPromotionNo) : that.promotionMProductSSalesPromotionNo != null)
            return false;
        if (promotionMProductSPPrice != null ? !promotionMProductSPPrice.equals(that.promotionMProductSPPrice) : that.promotionMProductSPPrice != null)
            return false;
        if (promotionMProductSDiscount != null ? !promotionMProductSDiscount.equals(that.promotionMProductSDiscount) : that.promotionMProductSDiscount != null)
            return false;
        if (promotionMProductSReduceMoney != null ? !promotionMProductSReduceMoney.equals(that.promotionMProductSReduceMoney) : that.promotionMProductSReduceMoney != null)
            return false;
        if (promotionMProductSGroupNodeId != null ? !promotionMProductSGroupNodeId.equals(that.promotionMProductSGroupNodeId) : that.promotionMProductSGroupNodeId != null)
            return false;
        if (promotionMProductSClientNo != null ? !promotionMProductSClientNo.equals(that.promotionMProductSClientNo) : that.promotionMProductSClientNo != null)
            return false;
        if (promotionMProductSDemand != null ? !promotionMProductSDemand.equals(that.promotionMProductSDemand) : that.promotionMProductSDemand != null)
            return false;
        if (promotionMProductSChecker != null ? !promotionMProductSChecker.equals(that.promotionMProductSChecker) : that.promotionMProductSChecker != null)
            return false;
        if (promotionMProductSCheckDate != null ? !promotionMProductSCheckDate.equals(that.promotionMProductSCheckDate) : that.promotionMProductSCheckDate != null)
            return false;
        if (promotionMProductSIsPass != null ? !promotionMProductSIsPass.equals(that.promotionMProductSIsPass) : that.promotionMProductSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMProductSPromotionNo != null ? promotionMProductSPromotionNo.hashCode() : 0;
        result = 31 * result + (promotionMProductSGoodsNo != null ? promotionMProductSGoodsNo.hashCode() : 0);
        result = 31 * result + (promotionMProductSLocationNo != null ? promotionMProductSLocationNo.hashCode() : 0);
        result = 31 * result + (promotionMProductSDemandNumber != null ? promotionMProductSDemandNumber.hashCode() : 0);
        result = 31 * result + (promotionMProductSQtQuota != null ? promotionMProductSQtQuota.hashCode() : 0);
        result = 31 * result + (promotionMProductSSalesPromotionNo != null ? promotionMProductSSalesPromotionNo.hashCode() : 0);
        result = 31 * result + (promotionMProductSPPrice != null ? promotionMProductSPPrice.hashCode() : 0);
        result = 31 * result + (promotionMProductSDiscount != null ? promotionMProductSDiscount.hashCode() : 0);
        result = 31 * result + (promotionMProductSReduceMoney != null ? promotionMProductSReduceMoney.hashCode() : 0);
        result = 31 * result + promotionMProductSIndexId;
        result = 31 * result + (promotionMProductSGroupNodeId != null ? promotionMProductSGroupNodeId.hashCode() : 0);
        result = 31 * result + (promotionMProductSClientNo != null ? promotionMProductSClientNo.hashCode() : 0);
        result = 31 * result + (promotionMProductSDemand != null ? promotionMProductSDemand.hashCode() : 0);
        result = 31 * result + (promotionMProductSChecker != null ? promotionMProductSChecker.hashCode() : 0);
        result = 31 * result + (promotionMProductSCheckDate != null ? promotionMProductSCheckDate.hashCode() : 0);
        result = 31 * result + (promotionMProductSIsPass != null ? promotionMProductSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_Promotion_no", referencedColumnName = "Promotion_m_Promotion_no", nullable = false,insertable = false, updatable = false)
    public PromotionMEntity getPromotionMByPromotionMProductSPromotionNo() {
        return promotionMByPromotionMProductSPromotionNo;
    }

    public void setPromotionMByPromotionMProductSPromotionNo(PromotionMEntity promotionMByPromotionMProductSPromotionNo) {
        this.promotionMByPromotionMProductSPromotionNo = promotionMByPromotionMProductSPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByPromotionMProductSGoodsNo() {
        return tGoodsByPromotionMProductSGoodsNo;
    }

    public void settGoodsByPromotionMProductSGoodsNo(TGoodsEntity tGoodsByPromotionMProductSGoodsNo) {
        this.tGoodsByPromotionMProductSGoodsNo = tGoodsByPromotionMProductSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_location_no", referencedColumnName = "store_location_location_no",insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationByPromotionMProductSLocationNo() {
        return storeLocationByPromotionMProductSLocationNo;
    }

    public void setStoreLocationByPromotionMProductSLocationNo(StoreLocationEntity storeLocationByPromotionMProductSLocationNo) {
        this.storeLocationByPromotionMProductSLocationNo = storeLocationByPromotionMProductSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_sales_promotion_no", referencedColumnName = "t_sales_promotion_sales_promotion_no",insertable = false, updatable = false)
    public TSalesPromotionEntity gettSalesPromotionByPromotionMProductSSalesPromotionNo() {
        return tSalesPromotionByPromotionMProductSSalesPromotionNo;
    }

    public void settSalesPromotionByPromotionMProductSSalesPromotionNo(TSalesPromotionEntity tSalesPromotionByPromotionMProductSSalesPromotionNo) {
        this.tSalesPromotionByPromotionMProductSSalesPromotionNo = tSalesPromotionByPromotionMProductSSalesPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByPromotionMProductSGroupNodeId() {
        return tOrgByPromotionMProductSGroupNodeId;
    }

    public void settOrgByPromotionMProductSGroupNodeId(TOrgEntity tOrgByPromotionMProductSGroupNodeId) {
        this.tOrgByPromotionMProductSGroupNodeId = tOrgByPromotionMProductSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_client_no", referencedColumnName = "t_client_client_no",insertable = false, updatable = false)
    public TClientEntity gettClientByPromotionMProductSClientNo() {
        return tClientByPromotionMProductSClientNo;
    }

    public void settClientByPromotionMProductSClientNo(TClientEntity tClientByPromotionMProductSClientNo) {
        this.tClientByPromotionMProductSClientNo = tClientByPromotionMProductSClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_product_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMProductSChecker() {
        return tStaffByPromotionMProductSChecker;
    }

    public void settStaffByPromotionMProductSChecker(TStaffEntity tStaffByPromotionMProductSChecker) {
        this.tStaffByPromotionMProductSChecker = tStaffByPromotionMProductSChecker;
    }
}
