package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "c_purchase_con_s", schema = "dbo", catalog = "logistics")
@IdClass(CPurchaseConSEntityPK.class)
public class CPurchaseConSEntity {
    private String cPurchaseConSPurchasConNo;
    private BigDecimal cPurchaseConSPrice;
    private BigDecimal cPurchaseConSBoxPrice;
    private BigDecimal cPurchaseConSConQuantity;
    private BigDecimal cPurchaseConSTaxRate;
    private String cPurchaseConSManagerNo;
    private BigDecimal cPurchaseConSOriginalPrice;
    private String cPurchaseConSPresentationProperty;
    private Timestamp cPurchaseConSAccountCheckDate;
    private String cPurchaseConSCreateNo;
    private Timestamp cPurchaseConSCreateDate;
    private String cPurchaseConSModifiNo;
    private Timestamp cPurchaseConSModifiTime;
    private int cPurchaseConSDetailId;
    private String cPurchaseConSGroupNodeId;
    private String cPurchaseConSClientNo;
    private String cPurchaseConSPaymentNo;
    private String cPurchaseConSGoodsNo;
    private String cPurchaseConSRemark;
    private String cPurchaseConSFlag;
    private Timestamp cPurchaseConSCheckDate;
    private String cPurchaseConSChecker;
    private String cPurchaseConSIsPass;
    private TStaffEntity tStaffByCPurchaseConSManagerNo;
    private TStaffEntity tStaffByCPurchaseConSCreateNo;
    private TStaffEntity tStaffByCPurchaseConSModifiNo;
    private TOrgEntity tOrgByCPurchaseConSGroupNodeId;
    private TClientEntity tClientByCPurchaseConSClientNo;
    private TPaymentEntity tPaymentByCPurchaseConSPaymentNo;
    private TGoodsEntity tGoodsByCPurchaseConSGoodsNo;
    private TStaffEntity tStaffByCPurchaseConSChecker;

    @Id
    @Column(name = "c_purchase_con_s_purchas_con_no", nullable = false, length = 16)
    public String getcPurchaseConSPurchasConNo() {
        return cPurchaseConSPurchasConNo;
    }

    public void setcPurchaseConSPurchasConNo(String cPurchaseConSPurchasConNo) {
        this.cPurchaseConSPurchasConNo = cPurchaseConSPurchasConNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_price", nullable = false, precision = 6)
    public BigDecimal getcPurchaseConSPrice() {
        return cPurchaseConSPrice;
    }

    public void setcPurchaseConSPrice(BigDecimal cPurchaseConSPrice) {
        this.cPurchaseConSPrice = cPurchaseConSPrice;
    }

    @Basic
    @Column(name = "c_purchase_con_s_box_price", nullable = false, precision = 6)
    public BigDecimal getcPurchaseConSBoxPrice() {
        return cPurchaseConSBoxPrice;
    }

    public void setcPurchaseConSBoxPrice(BigDecimal cPurchaseConSBoxPrice) {
        this.cPurchaseConSBoxPrice = cPurchaseConSBoxPrice;
    }

    @Basic
    @Column(name = "c_purchase_con_s_con_quantity", nullable = false, precision = 6)
    public BigDecimal getcPurchaseConSConQuantity() {
        return cPurchaseConSConQuantity;
    }

    public void setcPurchaseConSConQuantity(BigDecimal cPurchaseConSConQuantity) {
        this.cPurchaseConSConQuantity = cPurchaseConSConQuantity;
    }

    @Basic
    @Column(name = "c_purchase_con_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getcPurchaseConSTaxRate() {
        return cPurchaseConSTaxRate;
    }

    public void setcPurchaseConSTaxRate(BigDecimal cPurchaseConSTaxRate) {
        this.cPurchaseConSTaxRate = cPurchaseConSTaxRate;
    }

    @Basic
    @Column(name = "c_purchase_con_s_manager_no", nullable = true, length = 8)
    public String getcPurchaseConSManagerNo() {
        return cPurchaseConSManagerNo;
    }

    public void setcPurchaseConSManagerNo(String cPurchaseConSManagerNo) {
        this.cPurchaseConSManagerNo = cPurchaseConSManagerNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_original_price", nullable = true, precision = 6)
    public BigDecimal getcPurchaseConSOriginalPrice() {
        return cPurchaseConSOriginalPrice;
    }

    public void setcPurchaseConSOriginalPrice(BigDecimal cPurchaseConSOriginalPrice) {
        this.cPurchaseConSOriginalPrice = cPurchaseConSOriginalPrice;
    }

    @Basic
    @Column(name = "c_purchase_con_s_presentation_property", nullable = true, length = 4)
    public String getcPurchaseConSPresentationProperty() {
        return cPurchaseConSPresentationProperty;
    }

    public void setcPurchaseConSPresentationProperty(String cPurchaseConSPresentationProperty) {
        this.cPurchaseConSPresentationProperty = cPurchaseConSPresentationProperty;
    }

    @Basic
    @Column(name = "c_purchase_con_s_account_check_date", nullable = true)
    public Timestamp getcPurchaseConSAccountCheckDate() {
        return cPurchaseConSAccountCheckDate;
    }

    public void setcPurchaseConSAccountCheckDate(Timestamp cPurchaseConSAccountCheckDate) {
        this.cPurchaseConSAccountCheckDate = cPurchaseConSAccountCheckDate;
    }

    @Basic
    @Column(name = "c_purchase_con_s_create_no", nullable = true, length = 8)
    public String getcPurchaseConSCreateNo() {
        return cPurchaseConSCreateNo;
    }

    public void setcPurchaseConSCreateNo(String cPurchaseConSCreateNo) {
        this.cPurchaseConSCreateNo = cPurchaseConSCreateNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_create_date", nullable = true)
    public Timestamp getcPurchaseConSCreateDate() {
        return cPurchaseConSCreateDate;
    }

    public void setcPurchaseConSCreateDate(Timestamp cPurchaseConSCreateDate) {
        this.cPurchaseConSCreateDate = cPurchaseConSCreateDate;
    }

    @Basic
    @Column(name = "c_purchase_con_s_modifi_no", nullable = true, length = 8)
    public String getcPurchaseConSModifiNo() {
        return cPurchaseConSModifiNo;
    }

    public void setcPurchaseConSModifiNo(String cPurchaseConSModifiNo) {
        this.cPurchaseConSModifiNo = cPurchaseConSModifiNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_modifi_time", nullable = true)
    public Timestamp getcPurchaseConSModifiTime() {
        return cPurchaseConSModifiTime;
    }

    public void setcPurchaseConSModifiTime(Timestamp cPurchaseConSModifiTime) {
        this.cPurchaseConSModifiTime = cPurchaseConSModifiTime;
    }

    @Id
    @Column(name = "c_purchase_con_s_detail_id", nullable = false)
    public int getcPurchaseConSDetailId() {
        return cPurchaseConSDetailId;
    }

    public void setcPurchaseConSDetailId(int cPurchaseConSDetailId) {
        this.cPurchaseConSDetailId = cPurchaseConSDetailId;
    }

    @Basic
    @Column(name = "c_purchase_con_s_group_node_id", nullable = false, length = 20)
    public String getcPurchaseConSGroupNodeId() {
        return cPurchaseConSGroupNodeId;
    }

    public void setcPurchaseConSGroupNodeId(String cPurchaseConSGroupNodeId) {
        this.cPurchaseConSGroupNodeId = cPurchaseConSGroupNodeId;
    }

    @Basic
    @Column(name = "c_purchase_con_s_client_no", nullable = true, length = 20)
    public String getcPurchaseConSClientNo() {
        return cPurchaseConSClientNo;
    }

    public void setcPurchaseConSClientNo(String cPurchaseConSClientNo) {
        this.cPurchaseConSClientNo = cPurchaseConSClientNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_payment_no", nullable = true, length = 4)
    public String getcPurchaseConSPaymentNo() {
        return cPurchaseConSPaymentNo;
    }

    public void setcPurchaseConSPaymentNo(String cPurchaseConSPaymentNo) {
        this.cPurchaseConSPaymentNo = cPurchaseConSPaymentNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_goods_no", nullable = true, length = 20)
    public String getcPurchaseConSGoodsNo() {
        return cPurchaseConSGoodsNo;
    }

    public void setcPurchaseConSGoodsNo(String cPurchaseConSGoodsNo) {
        this.cPurchaseConSGoodsNo = cPurchaseConSGoodsNo;
    }

    @Basic
    @Column(name = "c_purchase_con_s_remark", nullable = true, length = 100)
    public String getcPurchaseConSRemark() {
        return cPurchaseConSRemark;
    }

    public void setcPurchaseConSRemark(String cPurchaseConSRemark) {
        this.cPurchaseConSRemark = cPurchaseConSRemark;
    }

    @Basic
    @Column(name = "c_purchase_con_s_flag", nullable = false, length = -1)
    public String getcPurchaseConSFlag() {
        return cPurchaseConSFlag;
    }

    public void setcPurchaseConSFlag(String cPurchaseConSFlag) {
        this.cPurchaseConSFlag = cPurchaseConSFlag;
    }

    @Basic
    @Column(name = "c_purchase_con_s_check_date", nullable = true)
    public Timestamp getcPurchaseConSCheckDate() {
        return cPurchaseConSCheckDate;
    }

    public void setcPurchaseConSCheckDate(Timestamp cPurchaseConSCheckDate) {
        this.cPurchaseConSCheckDate = cPurchaseConSCheckDate;
    }

    @Basic
    @Column(name = "c_purchase_con_s_checker", nullable = true, length = 8)
    public String getcPurchaseConSChecker() {
        return cPurchaseConSChecker;
    }

    public void setcPurchaseConSChecker(String cPurchaseConSChecker) {
        this.cPurchaseConSChecker = cPurchaseConSChecker;
    }

    @Basic
    @Column(name = "c_purchase_con_s_isPass", nullable = true, length = -1)
    public String getcPurchaseConSIsPass() {
        return cPurchaseConSIsPass;
    }

    public void setcPurchaseConSIsPass(String cPurchaseConSIsPass) {
        this.cPurchaseConSIsPass = cPurchaseConSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPurchaseConSEntity that = (CPurchaseConSEntity) o;

        if (cPurchaseConSDetailId != that.cPurchaseConSDetailId) return false;
        if (cPurchaseConSPurchasConNo != null ? !cPurchaseConSPurchasConNo.equals(that.cPurchaseConSPurchasConNo) : that.cPurchaseConSPurchasConNo != null)
            return false;
        if (cPurchaseConSPrice != null ? !cPurchaseConSPrice.equals(that.cPurchaseConSPrice) : that.cPurchaseConSPrice != null)
            return false;
        if (cPurchaseConSBoxPrice != null ? !cPurchaseConSBoxPrice.equals(that.cPurchaseConSBoxPrice) : that.cPurchaseConSBoxPrice != null)
            return false;
        if (cPurchaseConSConQuantity != null ? !cPurchaseConSConQuantity.equals(that.cPurchaseConSConQuantity) : that.cPurchaseConSConQuantity != null)
            return false;
        if (cPurchaseConSTaxRate != null ? !cPurchaseConSTaxRate.equals(that.cPurchaseConSTaxRate) : that.cPurchaseConSTaxRate != null)
            return false;
        if (cPurchaseConSManagerNo != null ? !cPurchaseConSManagerNo.equals(that.cPurchaseConSManagerNo) : that.cPurchaseConSManagerNo != null)
            return false;
        if (cPurchaseConSOriginalPrice != null ? !cPurchaseConSOriginalPrice.equals(that.cPurchaseConSOriginalPrice) : that.cPurchaseConSOriginalPrice != null)
            return false;
        if (cPurchaseConSPresentationProperty != null ? !cPurchaseConSPresentationProperty.equals(that.cPurchaseConSPresentationProperty) : that.cPurchaseConSPresentationProperty != null)
            return false;
        if (cPurchaseConSAccountCheckDate != null ? !cPurchaseConSAccountCheckDate.equals(that.cPurchaseConSAccountCheckDate) : that.cPurchaseConSAccountCheckDate != null)
            return false;
        if (cPurchaseConSCreateNo != null ? !cPurchaseConSCreateNo.equals(that.cPurchaseConSCreateNo) : that.cPurchaseConSCreateNo != null)
            return false;
        if (cPurchaseConSCreateDate != null ? !cPurchaseConSCreateDate.equals(that.cPurchaseConSCreateDate) : that.cPurchaseConSCreateDate != null)
            return false;
        if (cPurchaseConSModifiNo != null ? !cPurchaseConSModifiNo.equals(that.cPurchaseConSModifiNo) : that.cPurchaseConSModifiNo != null)
            return false;
        if (cPurchaseConSModifiTime != null ? !cPurchaseConSModifiTime.equals(that.cPurchaseConSModifiTime) : that.cPurchaseConSModifiTime != null)
            return false;
        if (cPurchaseConSGroupNodeId != null ? !cPurchaseConSGroupNodeId.equals(that.cPurchaseConSGroupNodeId) : that.cPurchaseConSGroupNodeId != null)
            return false;
        if (cPurchaseConSClientNo != null ? !cPurchaseConSClientNo.equals(that.cPurchaseConSClientNo) : that.cPurchaseConSClientNo != null)
            return false;
        if (cPurchaseConSPaymentNo != null ? !cPurchaseConSPaymentNo.equals(that.cPurchaseConSPaymentNo) : that.cPurchaseConSPaymentNo != null)
            return false;
        if (cPurchaseConSGoodsNo != null ? !cPurchaseConSGoodsNo.equals(that.cPurchaseConSGoodsNo) : that.cPurchaseConSGoodsNo != null)
            return false;
        if (cPurchaseConSRemark != null ? !cPurchaseConSRemark.equals(that.cPurchaseConSRemark) : that.cPurchaseConSRemark != null)
            return false;
        if (cPurchaseConSFlag != null ? !cPurchaseConSFlag.equals(that.cPurchaseConSFlag) : that.cPurchaseConSFlag != null)
            return false;
        if (cPurchaseConSCheckDate != null ? !cPurchaseConSCheckDate.equals(that.cPurchaseConSCheckDate) : that.cPurchaseConSCheckDate != null)
            return false;
        if (cPurchaseConSChecker != null ? !cPurchaseConSChecker.equals(that.cPurchaseConSChecker) : that.cPurchaseConSChecker != null)
            return false;
        if (cPurchaseConSIsPass != null ? !cPurchaseConSIsPass.equals(that.cPurchaseConSIsPass) : that.cPurchaseConSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cPurchaseConSPurchasConNo != null ? cPurchaseConSPurchasConNo.hashCode() : 0;
        result = 31 * result + (cPurchaseConSPrice != null ? cPurchaseConSPrice.hashCode() : 0);
        result = 31 * result + (cPurchaseConSBoxPrice != null ? cPurchaseConSBoxPrice.hashCode() : 0);
        result = 31 * result + (cPurchaseConSConQuantity != null ? cPurchaseConSConQuantity.hashCode() : 0);
        result = 31 * result + (cPurchaseConSTaxRate != null ? cPurchaseConSTaxRate.hashCode() : 0);
        result = 31 * result + (cPurchaseConSManagerNo != null ? cPurchaseConSManagerNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSOriginalPrice != null ? cPurchaseConSOriginalPrice.hashCode() : 0);
        result = 31 * result + (cPurchaseConSPresentationProperty != null ? cPurchaseConSPresentationProperty.hashCode() : 0);
        result = 31 * result + (cPurchaseConSAccountCheckDate != null ? cPurchaseConSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConSCreateNo != null ? cPurchaseConSCreateNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSCreateDate != null ? cPurchaseConSCreateDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConSModifiNo != null ? cPurchaseConSModifiNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSModifiTime != null ? cPurchaseConSModifiTime.hashCode() : 0);
        result = 31 * result + cPurchaseConSDetailId;
        result = 31 * result + (cPurchaseConSGroupNodeId != null ? cPurchaseConSGroupNodeId.hashCode() : 0);
        result = 31 * result + (cPurchaseConSClientNo != null ? cPurchaseConSClientNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSPaymentNo != null ? cPurchaseConSPaymentNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSGoodsNo != null ? cPurchaseConSGoodsNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConSRemark != null ? cPurchaseConSRemark.hashCode() : 0);
        result = 31 * result + (cPurchaseConSFlag != null ? cPurchaseConSFlag.hashCode() : 0);
        result = 31 * result + (cPurchaseConSCheckDate != null ? cPurchaseConSCheckDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConSChecker != null ? cPurchaseConSChecker.hashCode() : 0);
        result = 31 * result + (cPurchaseConSIsPass != null ? cPurchaseConSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_manager_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCPurchaseConSManagerNo() {
        return tStaffByCPurchaseConSManagerNo;
    }

    public void settStaffByCPurchaseConSManagerNo(TStaffEntity tStaffByCPurchaseConSManagerNo) {
        this.tStaffByCPurchaseConSManagerNo = tStaffByCPurchaseConSManagerNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCPurchaseConSCreateNo() {
        return tStaffByCPurchaseConSCreateNo;
    }

    public void settStaffByCPurchaseConSCreateNo(TStaffEntity tStaffByCPurchaseConSCreateNo) {
        this.tStaffByCPurchaseConSCreateNo = tStaffByCPurchaseConSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCPurchaseConSModifiNo() {
        return tStaffByCPurchaseConSModifiNo;
    }

    public void settStaffByCPurchaseConSModifiNo(TStaffEntity tStaffByCPurchaseConSModifiNo) {
        this.tStaffByCPurchaseConSModifiNo = tStaffByCPurchaseConSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByCPurchaseConSGroupNodeId() {
        return tOrgByCPurchaseConSGroupNodeId;
    }

    public void settOrgByCPurchaseConSGroupNodeId(TOrgEntity tOrgByCPurchaseConSGroupNodeId) {
        this.tOrgByCPurchaseConSGroupNodeId = tOrgByCPurchaseConSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_client_no", referencedColumnName = "t_client_client_no",insertable = false, updatable = false)
    public TClientEntity gettClientByCPurchaseConSClientNo() {
        return tClientByCPurchaseConSClientNo;
    }

    public void settClientByCPurchaseConSClientNo(TClientEntity tClientByCPurchaseConSClientNo) {
        this.tClientByCPurchaseConSClientNo = tClientByCPurchaseConSClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_payment_no", referencedColumnName = "t_payment_payment_no",insertable = false, updatable = false)
    public TPaymentEntity gettPaymentByCPurchaseConSPaymentNo() {
        return tPaymentByCPurchaseConSPaymentNo;
    }

    public void settPaymentByCPurchaseConSPaymentNo(TPaymentEntity tPaymentByCPurchaseConSPaymentNo) {
        this.tPaymentByCPurchaseConSPaymentNo = tPaymentByCPurchaseConSPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_goods_no", referencedColumnName = "t_goods_goods_no",insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByCPurchaseConSGoodsNo() {
        return tGoodsByCPurchaseConSGoodsNo;
    }

    public void settGoodsByCPurchaseConSGoodsNo(TGoodsEntity tGoodsByCPurchaseConSGoodsNo) {
        this.tGoodsByCPurchaseConSGoodsNo = tGoodsByCPurchaseConSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCPurchaseConSChecker() {
        return tStaffByCPurchaseConSChecker;
    }

    public void settStaffByCPurchaseConSChecker(TStaffEntity tStaffByCPurchaseConSChecker) {
        this.tStaffByCPurchaseConSChecker = tStaffByCPurchaseConSChecker;
    }
}
