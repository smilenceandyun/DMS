package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Promotion_m_s", schema = "dbo", catalog = "logistics")
@IdClass(PromotionMSEntityPK.class)
public class PromotionMSEntity {
    private String promotionMSPromotionNo;
    private int promotionMSIndexId;
    private String promotionMSGroupNodeId;
    private BigDecimal promotionMSTaxRate;
    private String promotionMSProductAttribute;
    private String promotionMSShopNo;
    private Integer promotionMSSalesNum;
    private BigDecimal promotionMSSalesBoxQuantity;
    private BigDecimal promotionMSSalesPrice;
    private BigDecimal promotionMSSalesBoxPrice;
    private String promotionMSCreateNo;
    private String promotionMSModifiNo;
    private Timestamp promotionMSCreateDate;
    private Timestamp promotionMSModifiTime;
    private Timestamp promotionMSCheckDate;
    private String promotionMSChecker;
    private String promotionMSState;
    private String promotionMSNotes;
    private String promotionMSIsPass;
    private TOrgEntity tOrgByPromotionMSGroupNodeId;
    private TStaffEntity tStaffByPromotionMSCreateNo;
    private TStaffEntity tStaffByPromotionMSModifiNo;
    private TStaffEntity tStaffByPromotionMSChecker;

    @Id
    @Column(name = "Promotion_m_s_Promotion_no", nullable = false, length = 16)
    public String getPromotionMSPromotionNo() {
        return promotionMSPromotionNo;
    }

    public void setPromotionMSPromotionNo(String promotionMSPromotionNo) {
        this.promotionMSPromotionNo = promotionMSPromotionNo;
    }

    @Id
    @Column(name = "Promotion_m_s_index_id", nullable = false)
    public int getPromotionMSIndexId() {
        return promotionMSIndexId;
    }

    public void setPromotionMSIndexId(int promotionMSIndexId) {
        this.promotionMSIndexId = promotionMSIndexId;
    }

    @Basic
    @Column(name = "Promotion_m_s_group_node_id", nullable = true, length = 20)
    public String getPromotionMSGroupNodeId() {
        return promotionMSGroupNodeId;
    }

    public void setPromotionMSGroupNodeId(String promotionMSGroupNodeId) {
        this.promotionMSGroupNodeId = promotionMSGroupNodeId;
    }

    @Basic
    @Column(name = "Promotion_m_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getPromotionMSTaxRate() {
        return promotionMSTaxRate;
    }

    public void setPromotionMSTaxRate(BigDecimal promotionMSTaxRate) {
        this.promotionMSTaxRate = promotionMSTaxRate;
    }

    @Basic
    @Column(name = "Promotion_m_s_product_attribute", nullable = true, length = 50)
    public String getPromotionMSProductAttribute() {
        return promotionMSProductAttribute;
    }

    public void setPromotionMSProductAttribute(String promotionMSProductAttribute) {
        this.promotionMSProductAttribute = promotionMSProductAttribute;
    }

    @Basic
    @Column(name = "Promotion_m_s_shop_no", nullable = true, length = 20)
    public String getPromotionMSShopNo() {
        return promotionMSShopNo;
    }

    public void setPromotionMSShopNo(String promotionMSShopNo) {
        this.promotionMSShopNo = promotionMSShopNo;
    }

    @Basic
    @Column(name = "Promotion_m_s_sales_num", nullable = true)
    public Integer getPromotionMSSalesNum() {
        return promotionMSSalesNum;
    }

    public void setPromotionMSSalesNum(Integer promotionMSSalesNum) {
        this.promotionMSSalesNum = promotionMSSalesNum;
    }

    @Basic
    @Column(name = "Promotion_m_s_sales_box_quantity", nullable = true, precision = 4)
    public BigDecimal getPromotionMSSalesBoxQuantity() {
        return promotionMSSalesBoxQuantity;
    }

    public void setPromotionMSSalesBoxQuantity(BigDecimal promotionMSSalesBoxQuantity) {
        this.promotionMSSalesBoxQuantity = promotionMSSalesBoxQuantity;
    }

    @Basic
    @Column(name = "Promotion_m_s_sales_price", nullable = true, precision = 6)
    public BigDecimal getPromotionMSSalesPrice() {
        return promotionMSSalesPrice;
    }

    public void setPromotionMSSalesPrice(BigDecimal promotionMSSalesPrice) {
        this.promotionMSSalesPrice = promotionMSSalesPrice;
    }

    @Basic
    @Column(name = "Promotion_m_s_sales_box_price", nullable = true, precision = 6)
    public BigDecimal getPromotionMSSalesBoxPrice() {
        return promotionMSSalesBoxPrice;
    }

    public void setPromotionMSSalesBoxPrice(BigDecimal promotionMSSalesBoxPrice) {
        this.promotionMSSalesBoxPrice = promotionMSSalesBoxPrice;
    }

    @Basic
    @Column(name = "Promotion_m_s_create_no", nullable = true, length = 8)
    public String getPromotionMSCreateNo() {
        return promotionMSCreateNo;
    }

    public void setPromotionMSCreateNo(String promotionMSCreateNo) {
        this.promotionMSCreateNo = promotionMSCreateNo;
    }

    @Basic
    @Column(name = "Promotion_m_s_modifi_no", nullable = true, length = 8)
    public String getPromotionMSModifiNo() {
        return promotionMSModifiNo;
    }

    public void setPromotionMSModifiNo(String promotionMSModifiNo) {
        this.promotionMSModifiNo = promotionMSModifiNo;
    }

    @Basic
    @Column(name = "Promotion_m_s_create_date", nullable = true)
    public Timestamp getPromotionMSCreateDate() {
        return promotionMSCreateDate;
    }

    public void setPromotionMSCreateDate(Timestamp promotionMSCreateDate) {
        this.promotionMSCreateDate = promotionMSCreateDate;
    }

    @Basic
    @Column(name = "Promotion_m_s_modifi_time", nullable = true)
    public Timestamp getPromotionMSModifiTime() {
        return promotionMSModifiTime;
    }

    public void setPromotionMSModifiTime(Timestamp promotionMSModifiTime) {
        this.promotionMSModifiTime = promotionMSModifiTime;
    }

    @Basic
    @Column(name = "Promotion_m_s_check_date", nullable = true)
    public Timestamp getPromotionMSCheckDate() {
        return promotionMSCheckDate;
    }

    public void setPromotionMSCheckDate(Timestamp promotionMSCheckDate) {
        this.promotionMSCheckDate = promotionMSCheckDate;
    }

    @Basic
    @Column(name = "Promotion_m_s_checker", nullable = true, length = 8)
    public String getPromotionMSChecker() {
        return promotionMSChecker;
    }

    public void setPromotionMSChecker(String promotionMSChecker) {
        this.promotionMSChecker = promotionMSChecker;
    }

    @Basic
    @Column(name = "Promotion_m_s_state", nullable = true, length = -1)
    public String getPromotionMSState() {
        return promotionMSState;
    }

    public void setPromotionMSState(String promotionMSState) {
        this.promotionMSState = promotionMSState;
    }

    @Basic
    @Column(name = "Promotion_m_s_notes", nullable = true, length = 200)
    public String getPromotionMSNotes() {
        return promotionMSNotes;
    }

    public void setPromotionMSNotes(String promotionMSNotes) {
        this.promotionMSNotes = promotionMSNotes;
    }

    @Basic
    @Column(name = "Promotion_m_s_isPass", nullable = true, length = -1)
    public String getPromotionMSIsPass() {
        return promotionMSIsPass;
    }

    public void setPromotionMSIsPass(String promotionMSIsPass) {
        this.promotionMSIsPass = promotionMSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionMSEntity that = (PromotionMSEntity) o;

        if (promotionMSIndexId != that.promotionMSIndexId) return false;
        if (promotionMSPromotionNo != null ? !promotionMSPromotionNo.equals(that.promotionMSPromotionNo) : that.promotionMSPromotionNo != null)
            return false;
        if (promotionMSGroupNodeId != null ? !promotionMSGroupNodeId.equals(that.promotionMSGroupNodeId) : that.promotionMSGroupNodeId != null)
            return false;
        if (promotionMSTaxRate != null ? !promotionMSTaxRate.equals(that.promotionMSTaxRate) : that.promotionMSTaxRate != null)
            return false;
        if (promotionMSProductAttribute != null ? !promotionMSProductAttribute.equals(that.promotionMSProductAttribute) : that.promotionMSProductAttribute != null)
            return false;
        if (promotionMSShopNo != null ? !promotionMSShopNo.equals(that.promotionMSShopNo) : that.promotionMSShopNo != null)
            return false;
        if (promotionMSSalesNum != null ? !promotionMSSalesNum.equals(that.promotionMSSalesNum) : that.promotionMSSalesNum != null)
            return false;
        if (promotionMSSalesBoxQuantity != null ? !promotionMSSalesBoxQuantity.equals(that.promotionMSSalesBoxQuantity) : that.promotionMSSalesBoxQuantity != null)
            return false;
        if (promotionMSSalesPrice != null ? !promotionMSSalesPrice.equals(that.promotionMSSalesPrice) : that.promotionMSSalesPrice != null)
            return false;
        if (promotionMSSalesBoxPrice != null ? !promotionMSSalesBoxPrice.equals(that.promotionMSSalesBoxPrice) : that.promotionMSSalesBoxPrice != null)
            return false;
        if (promotionMSCreateNo != null ? !promotionMSCreateNo.equals(that.promotionMSCreateNo) : that.promotionMSCreateNo != null)
            return false;
        if (promotionMSModifiNo != null ? !promotionMSModifiNo.equals(that.promotionMSModifiNo) : that.promotionMSModifiNo != null)
            return false;
        if (promotionMSCreateDate != null ? !promotionMSCreateDate.equals(that.promotionMSCreateDate) : that.promotionMSCreateDate != null)
            return false;
        if (promotionMSModifiTime != null ? !promotionMSModifiTime.equals(that.promotionMSModifiTime) : that.promotionMSModifiTime != null)
            return false;
        if (promotionMSCheckDate != null ? !promotionMSCheckDate.equals(that.promotionMSCheckDate) : that.promotionMSCheckDate != null)
            return false;
        if (promotionMSChecker != null ? !promotionMSChecker.equals(that.promotionMSChecker) : that.promotionMSChecker != null)
            return false;
        if (promotionMSState != null ? !promotionMSState.equals(that.promotionMSState) : that.promotionMSState != null)
            return false;
        if (promotionMSNotes != null ? !promotionMSNotes.equals(that.promotionMSNotes) : that.promotionMSNotes != null)
            return false;
        if (promotionMSIsPass != null ? !promotionMSIsPass.equals(that.promotionMSIsPass) : that.promotionMSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionMSPromotionNo != null ? promotionMSPromotionNo.hashCode() : 0;
        result = 31 * result + promotionMSIndexId;
        result = 31 * result + (promotionMSGroupNodeId != null ? promotionMSGroupNodeId.hashCode() : 0);
        result = 31 * result + (promotionMSTaxRate != null ? promotionMSTaxRate.hashCode() : 0);
        result = 31 * result + (promotionMSProductAttribute != null ? promotionMSProductAttribute.hashCode() : 0);
        result = 31 * result + (promotionMSShopNo != null ? promotionMSShopNo.hashCode() : 0);
        result = 31 * result + (promotionMSSalesNum != null ? promotionMSSalesNum.hashCode() : 0);
        result = 31 * result + (promotionMSSalesBoxQuantity != null ? promotionMSSalesBoxQuantity.hashCode() : 0);
        result = 31 * result + (promotionMSSalesPrice != null ? promotionMSSalesPrice.hashCode() : 0);
        result = 31 * result + (promotionMSSalesBoxPrice != null ? promotionMSSalesBoxPrice.hashCode() : 0);
        result = 31 * result + (promotionMSCreateNo != null ? promotionMSCreateNo.hashCode() : 0);
        result = 31 * result + (promotionMSModifiNo != null ? promotionMSModifiNo.hashCode() : 0);
        result = 31 * result + (promotionMSCreateDate != null ? promotionMSCreateDate.hashCode() : 0);
        result = 31 * result + (promotionMSModifiTime != null ? promotionMSModifiTime.hashCode() : 0);
        result = 31 * result + (promotionMSCheckDate != null ? promotionMSCheckDate.hashCode() : 0);
        result = 31 * result + (promotionMSChecker != null ? promotionMSChecker.hashCode() : 0);
        result = 31 * result + (promotionMSState != null ? promotionMSState.hashCode() : 0);
        result = 31 * result + (promotionMSNotes != null ? promotionMSNotes.hashCode() : 0);
        result = 31 * result + (promotionMSIsPass != null ? promotionMSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_s_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByPromotionMSGroupNodeId() {
        return tOrgByPromotionMSGroupNodeId;
    }

    public void settOrgByPromotionMSGroupNodeId(TOrgEntity tOrgByPromotionMSGroupNodeId) {
        this.tOrgByPromotionMSGroupNodeId = tOrgByPromotionMSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMSCreateNo() {
        return tStaffByPromotionMSCreateNo;
    }

    public void settStaffByPromotionMSCreateNo(TStaffEntity tStaffByPromotionMSCreateNo) {
        this.tStaffByPromotionMSCreateNo = tStaffByPromotionMSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMSModifiNo() {
        return tStaffByPromotionMSModifiNo;
    }

    public void settStaffByPromotionMSModifiNo(TStaffEntity tStaffByPromotionMSModifiNo) {
        this.tStaffByPromotionMSModifiNo = tStaffByPromotionMSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_m_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByPromotionMSChecker() {
        return tStaffByPromotionMSChecker;
    }

    public void settStaffByPromotionMSChecker(TStaffEntity tStaffByPromotionMSChecker) {
        this.tStaffByPromotionMSChecker = tStaffByPromotionMSChecker;
    }
}
