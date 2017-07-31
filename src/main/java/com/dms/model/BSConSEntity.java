package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_s_con_s", schema = "dbo", catalog = "logistics")
@IdClass(BSConSEntityPK.class)
public class BSConSEntity {
    private String bSConSSConBillno;
    private String bSConSGoodsNo;
    private String bSConSExRequest;
    private String bSConSGoodsSpce;
    private String bSConSUnit;
    private BigDecimal bSConSRetailPrice;
    private BigDecimal bSConSConPrice;
    private BigDecimal bSConSConBoxPrice;
    private BigDecimal bSConSConQuantity;
    private BigDecimal bSConSTaxRate;
    private String bSConSPaymentNo;
    private String bSConSPresentationProperty;
    private Timestamp bSConSInvoiceDate;
    private Timestamp bSConSTakeCheckDate;
    private Timestamp bSConSCreateDate;
    private String bSConSCreateNo;
    private String bSConSModifiNo;
    private Timestamp bSConSModifiTime;
    private String bSConSChecker;
    private Timestamp bSConSCheckDate;
    private int bSConSDetailId;
    private String bSConSState;
    private String bSConSGroupNodeId;
    private String bSConSNotes;
    private String bSConSIsPass;
    private BSConMEntity bSConMByBSConSSConBillno;
    private TGoodsEntity tGoodsByBSConSGoodsNo;
    private TPaymentEntity tPaymentByBSConSPaymentNo;
    private TStaffEntity tStaffByBSConSCreateNo;
    private TStaffEntity tStaffByBSConSModifiNo;
    private TStaffEntity tStaffByBSConSChecker;
    private TOrgEntity tOrgByBSConSGroupNodeId;

    @Id
    @Column(name = "b_s_con_s_s_con_billno", nullable = false, length = 16)
    public String getbSConSSConBillno() {
        return bSConSSConBillno;
    }

    public void setbSConSSConBillno(String bSConSSConBillno) {
        this.bSConSSConBillno = bSConSSConBillno;
    }

    @Basic
    @Column(name = "b_s_con_s_goods_no", nullable = false, length = 20)
    public String getbSConSGoodsNo() {
        return bSConSGoodsNo;
    }

    public void setbSConSGoodsNo(String bSConSGoodsNo) {
        this.bSConSGoodsNo = bSConSGoodsNo;
    }

    @Basic
    @Column(name = "b_s_con_s_ex_request", nullable = true, length = 80)
    public String getbSConSExRequest() {
        return bSConSExRequest;
    }

    public void setbSConSExRequest(String bSConSExRequest) {
        this.bSConSExRequest = bSConSExRequest;
    }

    @Basic
    @Column(name = "b_s_con_s_goods_spce", nullable = true, length = 100)
    public String getbSConSGoodsSpce() {
        return bSConSGoodsSpce;
    }

    public void setbSConSGoodsSpce(String bSConSGoodsSpce) {
        this.bSConSGoodsSpce = bSConSGoodsSpce;
    }

    @Basic
    @Column(name = "b_s_con_s_unit", nullable = true, length = 10)
    public String getbSConSUnit() {
        return bSConSUnit;
    }

    public void setbSConSUnit(String bSConSUnit) {
        this.bSConSUnit = bSConSUnit;
    }

    @Basic
    @Column(name = "b_s_con_s_retail_price", nullable = true, precision = 6)
    public BigDecimal getbSConSRetailPrice() {
        return bSConSRetailPrice;
    }

    public void setbSConSRetailPrice(BigDecimal bSConSRetailPrice) {
        this.bSConSRetailPrice = bSConSRetailPrice;
    }

    @Basic
    @Column(name = "b_s_con_s_con_price", nullable = true, precision = 6)
    public BigDecimal getbSConSConPrice() {
        return bSConSConPrice;
    }

    public void setbSConSConPrice(BigDecimal bSConSConPrice) {
        this.bSConSConPrice = bSConSConPrice;
    }

    @Basic
    @Column(name = "b_s_con_s_con_box_price", nullable = true, precision = 6)
    public BigDecimal getbSConSConBoxPrice() {
        return bSConSConBoxPrice;
    }

    public void setbSConSConBoxPrice(BigDecimal bSConSConBoxPrice) {
        this.bSConSConBoxPrice = bSConSConBoxPrice;
    }

    @Basic
    @Column(name = "b_s_con_s_con_quantity", nullable = true, precision = 6)
    public BigDecimal getbSConSConQuantity() {
        return bSConSConQuantity;
    }

    public void setbSConSConQuantity(BigDecimal bSConSConQuantity) {
        this.bSConSConQuantity = bSConSConQuantity;
    }

    @Basic
    @Column(name = "b_s_con_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbSConSTaxRate() {
        return bSConSTaxRate;
    }

    public void setbSConSTaxRate(BigDecimal bSConSTaxRate) {
        this.bSConSTaxRate = bSConSTaxRate;
    }

    @Basic
    @Column(name = "b_s_con_s_payment_no", nullable = true, length = 4)
    public String getbSConSPaymentNo() {
        return bSConSPaymentNo;
    }

    public void setbSConSPaymentNo(String bSConSPaymentNo) {
        this.bSConSPaymentNo = bSConSPaymentNo;
    }

    @Basic
    @Column(name = "b_s_con_s_presentation_property", nullable = true, length = 4)
    public String getbSConSPresentationProperty() {
        return bSConSPresentationProperty;
    }

    public void setbSConSPresentationProperty(String bSConSPresentationProperty) {
        this.bSConSPresentationProperty = bSConSPresentationProperty;
    }

    @Basic
    @Column(name = "b_s_con_s_invoice_date", nullable = true)
    public Timestamp getbSConSInvoiceDate() {
        return bSConSInvoiceDate;
    }

    public void setbSConSInvoiceDate(Timestamp bSConSInvoiceDate) {
        this.bSConSInvoiceDate = bSConSInvoiceDate;
    }

    @Basic
    @Column(name = "b_s_con_s_take_check_date", nullable = true)
    public Timestamp getbSConSTakeCheckDate() {
        return bSConSTakeCheckDate;
    }

    public void setbSConSTakeCheckDate(Timestamp bSConSTakeCheckDate) {
        this.bSConSTakeCheckDate = bSConSTakeCheckDate;
    }

    @Basic
    @Column(name = "b_s_con_s_create_date", nullable = true)
    public Timestamp getbSConSCreateDate() {
        return bSConSCreateDate;
    }

    public void setbSConSCreateDate(Timestamp bSConSCreateDate) {
        this.bSConSCreateDate = bSConSCreateDate;
    }

    @Basic
    @Column(name = "b_s_con_s_create_no", nullable = true, length = 8)
    public String getbSConSCreateNo() {
        return bSConSCreateNo;
    }

    public void setbSConSCreateNo(String bSConSCreateNo) {
        this.bSConSCreateNo = bSConSCreateNo;
    }

    @Basic
    @Column(name = "b_s_con_s_modifi_no", nullable = true, length = 8)
    public String getbSConSModifiNo() {
        return bSConSModifiNo;
    }

    public void setbSConSModifiNo(String bSConSModifiNo) {
        this.bSConSModifiNo = bSConSModifiNo;
    }

    @Basic
    @Column(name = "b_s_con_s_modifi_time", nullable = true)
    public Timestamp getbSConSModifiTime() {
        return bSConSModifiTime;
    }

    public void setbSConSModifiTime(Timestamp bSConSModifiTime) {
        this.bSConSModifiTime = bSConSModifiTime;
    }

    @Basic
    @Column(name = "b_s_con_s_checker", nullable = true, length = 8)
    public String getbSConSChecker() {
        return bSConSChecker;
    }

    public void setbSConSChecker(String bSConSChecker) {
        this.bSConSChecker = bSConSChecker;
    }

    @Basic
    @Column(name = "b_s_con_s_check_date", nullable = true)
    public Timestamp getbSConSCheckDate() {
        return bSConSCheckDate;
    }

    public void setbSConSCheckDate(Timestamp bSConSCheckDate) {
        this.bSConSCheckDate = bSConSCheckDate;
    }

    @Id
    @Column(name = "b_s_con_s_detail_id", nullable = false)
    public int getbSConSDetailId() {
        return bSConSDetailId;
    }

    public void setbSConSDetailId(int bSConSDetailId) {
        this.bSConSDetailId = bSConSDetailId;
    }

    @Basic
    @Column(name = "b_s_con_s_state", nullable = true, length = -1)
    public String getbSConSState() {
        return bSConSState;
    }

    public void setbSConSState(String bSConSState) {
        this.bSConSState = bSConSState;
    }

    @Basic
    @Column(name = "b_s_con_s_group_node_id", nullable = true, length = 20)
    public String getbSConSGroupNodeId() {
        return bSConSGroupNodeId;
    }

    public void setbSConSGroupNodeId(String bSConSGroupNodeId) {
        this.bSConSGroupNodeId = bSConSGroupNodeId;
    }

    @Basic
    @Column(name = "b_s_con_s_notes", nullable = true, length = 200)
    public String getbSConSNotes() {
        return bSConSNotes;
    }

    public void setbSConSNotes(String bSConSNotes) {
        this.bSConSNotes = bSConSNotes;
    }

    @Basic
    @Column(name = "b_s_con_s_isPass", nullable = true, length = -1)
    public String getbSConSIsPass() {
        return bSConSIsPass;
    }

    public void setbSConSIsPass(String bSConSIsPass) {
        this.bSConSIsPass = bSConSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSConSEntity that = (BSConSEntity) o;

        if (bSConSDetailId != that.bSConSDetailId) return false;
        if (bSConSSConBillno != null ? !bSConSSConBillno.equals(that.bSConSSConBillno) : that.bSConSSConBillno != null)
            return false;
        if (bSConSGoodsNo != null ? !bSConSGoodsNo.equals(that.bSConSGoodsNo) : that.bSConSGoodsNo != null)
            return false;
        if (bSConSExRequest != null ? !bSConSExRequest.equals(that.bSConSExRequest) : that.bSConSExRequest != null)
            return false;
        if (bSConSGoodsSpce != null ? !bSConSGoodsSpce.equals(that.bSConSGoodsSpce) : that.bSConSGoodsSpce != null)
            return false;
        if (bSConSUnit != null ? !bSConSUnit.equals(that.bSConSUnit) : that.bSConSUnit != null) return false;
        if (bSConSRetailPrice != null ? !bSConSRetailPrice.equals(that.bSConSRetailPrice) : that.bSConSRetailPrice != null)
            return false;
        if (bSConSConPrice != null ? !bSConSConPrice.equals(that.bSConSConPrice) : that.bSConSConPrice != null)
            return false;
        if (bSConSConBoxPrice != null ? !bSConSConBoxPrice.equals(that.bSConSConBoxPrice) : that.bSConSConBoxPrice != null)
            return false;
        if (bSConSConQuantity != null ? !bSConSConQuantity.equals(that.bSConSConQuantity) : that.bSConSConQuantity != null)
            return false;
        if (bSConSTaxRate != null ? !bSConSTaxRate.equals(that.bSConSTaxRate) : that.bSConSTaxRate != null)
            return false;
        if (bSConSPaymentNo != null ? !bSConSPaymentNo.equals(that.bSConSPaymentNo) : that.bSConSPaymentNo != null)
            return false;
        if (bSConSPresentationProperty != null ? !bSConSPresentationProperty.equals(that.bSConSPresentationProperty) : that.bSConSPresentationProperty != null)
            return false;
        if (bSConSInvoiceDate != null ? !bSConSInvoiceDate.equals(that.bSConSInvoiceDate) : that.bSConSInvoiceDate != null)
            return false;
        if (bSConSTakeCheckDate != null ? !bSConSTakeCheckDate.equals(that.bSConSTakeCheckDate) : that.bSConSTakeCheckDate != null)
            return false;
        if (bSConSCreateDate != null ? !bSConSCreateDate.equals(that.bSConSCreateDate) : that.bSConSCreateDate != null)
            return false;
        if (bSConSCreateNo != null ? !bSConSCreateNo.equals(that.bSConSCreateNo) : that.bSConSCreateNo != null)
            return false;
        if (bSConSModifiNo != null ? !bSConSModifiNo.equals(that.bSConSModifiNo) : that.bSConSModifiNo != null)
            return false;
        if (bSConSModifiTime != null ? !bSConSModifiTime.equals(that.bSConSModifiTime) : that.bSConSModifiTime != null)
            return false;
        if (bSConSChecker != null ? !bSConSChecker.equals(that.bSConSChecker) : that.bSConSChecker != null)
            return false;
        if (bSConSCheckDate != null ? !bSConSCheckDate.equals(that.bSConSCheckDate) : that.bSConSCheckDate != null)
            return false;
        if (bSConSState != null ? !bSConSState.equals(that.bSConSState) : that.bSConSState != null) return false;
        if (bSConSGroupNodeId != null ? !bSConSGroupNodeId.equals(that.bSConSGroupNodeId) : that.bSConSGroupNodeId != null)
            return false;
        if (bSConSNotes != null ? !bSConSNotes.equals(that.bSConSNotes) : that.bSConSNotes != null) return false;
        if (bSConSIsPass != null ? !bSConSIsPass.equals(that.bSConSIsPass) : that.bSConSIsPass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSConSSConBillno != null ? bSConSSConBillno.hashCode() : 0;
        result = 31 * result + (bSConSGoodsNo != null ? bSConSGoodsNo.hashCode() : 0);
        result = 31 * result + (bSConSExRequest != null ? bSConSExRequest.hashCode() : 0);
        result = 31 * result + (bSConSGoodsSpce != null ? bSConSGoodsSpce.hashCode() : 0);
        result = 31 * result + (bSConSUnit != null ? bSConSUnit.hashCode() : 0);
        result = 31 * result + (bSConSRetailPrice != null ? bSConSRetailPrice.hashCode() : 0);
        result = 31 * result + (bSConSConPrice != null ? bSConSConPrice.hashCode() : 0);
        result = 31 * result + (bSConSConBoxPrice != null ? bSConSConBoxPrice.hashCode() : 0);
        result = 31 * result + (bSConSConQuantity != null ? bSConSConQuantity.hashCode() : 0);
        result = 31 * result + (bSConSTaxRate != null ? bSConSTaxRate.hashCode() : 0);
        result = 31 * result + (bSConSPaymentNo != null ? bSConSPaymentNo.hashCode() : 0);
        result = 31 * result + (bSConSPresentationProperty != null ? bSConSPresentationProperty.hashCode() : 0);
        result = 31 * result + (bSConSInvoiceDate != null ? bSConSInvoiceDate.hashCode() : 0);
        result = 31 * result + (bSConSTakeCheckDate != null ? bSConSTakeCheckDate.hashCode() : 0);
        result = 31 * result + (bSConSCreateDate != null ? bSConSCreateDate.hashCode() : 0);
        result = 31 * result + (bSConSCreateNo != null ? bSConSCreateNo.hashCode() : 0);
        result = 31 * result + (bSConSModifiNo != null ? bSConSModifiNo.hashCode() : 0);
        result = 31 * result + (bSConSModifiTime != null ? bSConSModifiTime.hashCode() : 0);
        result = 31 * result + (bSConSChecker != null ? bSConSChecker.hashCode() : 0);
        result = 31 * result + (bSConSCheckDate != null ? bSConSCheckDate.hashCode() : 0);
        result = 31 * result + bSConSDetailId;
        result = 31 * result + (bSConSState != null ? bSConSState.hashCode() : 0);
        result = 31 * result + (bSConSGroupNodeId != null ? bSConSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSConSNotes != null ? bSConSNotes.hashCode() : 0);
        result = 31 * result + (bSConSIsPass != null ? bSConSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_s_con_billno", referencedColumnName = "b_s_con_m_s_con_billno", nullable = false,insertable = false, updatable = false)
    public BSConMEntity getbSConMByBSConSSConBillno() {
        return bSConMByBSConSSConBillno;
    }

    public void setbSConMByBSConSSConBillno(BSConMEntity bSConMByBSConSSConBillno) {
        this.bSConMByBSConSSConBillno = bSConMByBSConSSConBillno;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false,insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByBSConSGoodsNo() {
        return tGoodsByBSConSGoodsNo;
    }

    public void settGoodsByBSConSGoodsNo(TGoodsEntity tGoodsByBSConSGoodsNo) {
        this.tGoodsByBSConSGoodsNo = tGoodsByBSConSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_payment_no", referencedColumnName = "t_payment_payment_no",insertable = false, updatable = false)
    public TPaymentEntity gettPaymentByBSConSPaymentNo() {
        return tPaymentByBSConSPaymentNo;
    }

    public void settPaymentByBSConSPaymentNo(TPaymentEntity tPaymentByBSConSPaymentNo) {
        this.tPaymentByBSConSPaymentNo = tPaymentByBSConSPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSConSCreateNo() {
        return tStaffByBSConSCreateNo;
    }

    public void settStaffByBSConSCreateNo(TStaffEntity tStaffByBSConSCreateNo) {
        this.tStaffByBSConSCreateNo = tStaffByBSConSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSConSModifiNo() {
        return tStaffByBSConSModifiNo;
    }

    public void settStaffByBSConSModifiNo(TStaffEntity tStaffByBSConSModifiNo) {
        this.tStaffByBSConSModifiNo = tStaffByBSConSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSConSChecker() {
        return tStaffByBSConSChecker;
    }

    public void settStaffByBSConSChecker(TStaffEntity tStaffByBSConSChecker) {
        this.tStaffByBSConSChecker = tStaffByBSConSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_s_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByBSConSGroupNodeId() {
        return tOrgByBSConSGroupNodeId;
    }

    public void settOrgByBSConSGroupNodeId(TOrgEntity tOrgByBSConSGroupNodeId) {
        this.tOrgByBSConSGroupNodeId = tOrgByBSConSGroupNodeId;
    }
}
