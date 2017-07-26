package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_in_loan_s", schema = "dbo", catalog = "logistics_test")
@IdClass(SInLoanSEntityPK.class)
public class SInLoanSEntity {
    private String sInLoanSInLoanLno;
    private String sInLoanSRoomNo;
    private String sInLoanSLocationNo;
    private String sInLoanSMfg;
    private String sInLoanSLot;
    private BigDecimal sInLoanSQuantity;
    private BigDecimal sInLoanSBoxQuantity;
    private Integer sInLoanSStock;
    private String sInLoanSPresentationProperty;
    private BigDecimal sInLoanSDetailMoney;
    private BigDecimal sInLoanSOriginalPrice;
    private int sInLoanSDetailId;
    private Timestamp sInLoanSInvoiceDate;
    private String sInLoanSCreaterNo;
    private Timestamp sInLoanSCreateDate;
    private String sInLoanSModifiNo;
    private Timestamp sInLoanSModifiTime;
    private String sInLoanSChecker;
    private Timestamp sInLoanSCheckDate;
    private String sInLoanSGroupNodeId;
    private String sInLoanSIsPass;
    private SInLoanMEntity sInLoanMBySInLoanSInLoanLno;
    private TRoomEntity tRoomBySInLoanSRoomNo;
    private StoreLocationEntity storeLocationBySInLoanSLocationNo;
    private TStaffEntity tStaffBySInLoanSCreaterNo;
    private TStaffEntity tStaffBySInLoanSModifiNo;
    private TStaffEntity tStaffBySInLoanSChecker;
    private TOrgEntity tOrgBySInLoanSGroupNodeId;

    @Id
    @Column(name = "s_in_loan_s_in_loan_lno", nullable = false, length = 16)
    public String getsInLoanSInLoanLno() {
        return sInLoanSInLoanLno;
    }

    public void setsInLoanSInLoanLno(String sInLoanSInLoanLno) {
        this.sInLoanSInLoanLno = sInLoanSInLoanLno;
    }

    @Basic
    @Column(name = "s_in_loan_s_room_no", nullable = false, length = 8)
    public String getsInLoanSRoomNo() {
        return sInLoanSRoomNo;
    }

    public void setsInLoanSRoomNo(String sInLoanSRoomNo) {
        this.sInLoanSRoomNo = sInLoanSRoomNo;
    }

    @Basic
    @Column(name = "s_in_loan_s_location_no", nullable = false, length = 8)
    public String getsInLoanSLocationNo() {
        return sInLoanSLocationNo;
    }

    public void setsInLoanSLocationNo(String sInLoanSLocationNo) {
        this.sInLoanSLocationNo = sInLoanSLocationNo;
    }

    @Basic
    @Column(name = "s_in_loan_s_MFG", nullable = false, length = 12)
    public String getsInLoanSMfg() {
        return sInLoanSMfg;
    }

    public void setsInLoanSMfg(String sInLoanSMfg) {
        this.sInLoanSMfg = sInLoanSMfg;
    }

    @Basic
    @Column(name = "s_in_loan_s_LOT", nullable = false, length = 20)
    public String getsInLoanSLot() {
        return sInLoanSLot;
    }

    public void setsInLoanSLot(String sInLoanSLot) {
        this.sInLoanSLot = sInLoanSLot;
    }

    @Basic
    @Column(name = "s_in_loan_s_quantity", nullable = true, precision = 4)
    public BigDecimal getsInLoanSQuantity() {
        return sInLoanSQuantity;
    }

    public void setsInLoanSQuantity(BigDecimal sInLoanSQuantity) {
        this.sInLoanSQuantity = sInLoanSQuantity;
    }

    @Basic
    @Column(name = "s_in_loan_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getsInLoanSBoxQuantity() {
        return sInLoanSBoxQuantity;
    }

    public void setsInLoanSBoxQuantity(BigDecimal sInLoanSBoxQuantity) {
        this.sInLoanSBoxQuantity = sInLoanSBoxQuantity;
    }

    @Basic
    @Column(name = "s_in_loan_s_Stock", nullable = true)
    public Integer getsInLoanSStock() {
        return sInLoanSStock;
    }

    public void setsInLoanSStock(Integer sInLoanSStock) {
        this.sInLoanSStock = sInLoanSStock;
    }

    @Basic
    @Column(name = "s_in_loan_s_presentation_property", nullable = true, length = 4)
    public String getsInLoanSPresentationProperty() {
        return sInLoanSPresentationProperty;
    }

    public void setsInLoanSPresentationProperty(String sInLoanSPresentationProperty) {
        this.sInLoanSPresentationProperty = sInLoanSPresentationProperty;
    }

    @Basic
    @Column(name = "s_in_loan_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getsInLoanSDetailMoney() {
        return sInLoanSDetailMoney;
    }

    public void setsInLoanSDetailMoney(BigDecimal sInLoanSDetailMoney) {
        this.sInLoanSDetailMoney = sInLoanSDetailMoney;
    }

    @Basic
    @Column(name = "s_in_loan_s_original_price", nullable = true, precision = 4)
    public BigDecimal getsInLoanSOriginalPrice() {
        return sInLoanSOriginalPrice;
    }

    public void setsInLoanSOriginalPrice(BigDecimal sInLoanSOriginalPrice) {
        this.sInLoanSOriginalPrice = sInLoanSOriginalPrice;
    }

    @Id
    @Column(name = "s_in_loan_s_detail_id", nullable = false)
    public int getsInLoanSDetailId() {
        return sInLoanSDetailId;
    }

    public void setsInLoanSDetailId(int sInLoanSDetailId) {
        this.sInLoanSDetailId = sInLoanSDetailId;
    }

    @Basic
    @Column(name = "s_in_loan_s_invoice_date", nullable = true)
    public Timestamp getsInLoanSInvoiceDate() {
        return sInLoanSInvoiceDate;
    }

    public void setsInLoanSInvoiceDate(Timestamp sInLoanSInvoiceDate) {
        this.sInLoanSInvoiceDate = sInLoanSInvoiceDate;
    }

    @Basic
    @Column(name = "s_in_loan_s_creater_no", nullable = true, length = 8)
    public String getsInLoanSCreaterNo() {
        return sInLoanSCreaterNo;
    }

    public void setsInLoanSCreaterNo(String sInLoanSCreaterNo) {
        this.sInLoanSCreaterNo = sInLoanSCreaterNo;
    }

    @Basic
    @Column(name = "s_in_loan_s_create_date", nullable = true)
    public Timestamp getsInLoanSCreateDate() {
        return sInLoanSCreateDate;
    }

    public void setsInLoanSCreateDate(Timestamp sInLoanSCreateDate) {
        this.sInLoanSCreateDate = sInLoanSCreateDate;
    }

    @Basic
    @Column(name = "s_in_loan_s_modifi_no", nullable = true, length = 8)
    public String getsInLoanSModifiNo() {
        return sInLoanSModifiNo;
    }

    public void setsInLoanSModifiNo(String sInLoanSModifiNo) {
        this.sInLoanSModifiNo = sInLoanSModifiNo;
    }

    @Basic
    @Column(name = "s_in_loan_s_modifi_time", nullable = true)
    public Timestamp getsInLoanSModifiTime() {
        return sInLoanSModifiTime;
    }

    public void setsInLoanSModifiTime(Timestamp sInLoanSModifiTime) {
        this.sInLoanSModifiTime = sInLoanSModifiTime;
    }

    @Basic
    @Column(name = "s_in_loan_s_checker", nullable = true, length = 8)
    public String getsInLoanSChecker() {
        return sInLoanSChecker;
    }

    public void setsInLoanSChecker(String sInLoanSChecker) {
        this.sInLoanSChecker = sInLoanSChecker;
    }

    @Basic
    @Column(name = "s_in_loan_s_check_date", nullable = true)
    public Timestamp getsInLoanSCheckDate() {
        return sInLoanSCheckDate;
    }

    public void setsInLoanSCheckDate(Timestamp sInLoanSCheckDate) {
        this.sInLoanSCheckDate = sInLoanSCheckDate;
    }

    @Basic
    @Column(name = "s_in_loan_s_group_node_id", nullable = false, length = 20)
    public String getsInLoanSGroupNodeId() {
        return sInLoanSGroupNodeId;
    }

    public void setsInLoanSGroupNodeId(String sInLoanSGroupNodeId) {
        this.sInLoanSGroupNodeId = sInLoanSGroupNodeId;
    }

    @Basic
    @Column(name = "s_in_loan_s_isPass", nullable = true, length = 1)
    public String getsInLoanSIsPass() {
        return sInLoanSIsPass;
    }

    public void setsInLoanSIsPass(String sInLoanSIsPass) {
        this.sInLoanSIsPass = sInLoanSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SInLoanSEntity that = (SInLoanSEntity) o;

        if (sInLoanSDetailId != that.sInLoanSDetailId) return false;
        if (sInLoanSInLoanLno != null ? !sInLoanSInLoanLno.equals(that.sInLoanSInLoanLno) : that.sInLoanSInLoanLno != null)
            return false;
        if (sInLoanSRoomNo != null ? !sInLoanSRoomNo.equals(that.sInLoanSRoomNo) : that.sInLoanSRoomNo != null)
            return false;
        if (sInLoanSLocationNo != null ? !sInLoanSLocationNo.equals(that.sInLoanSLocationNo) : that.sInLoanSLocationNo != null)
            return false;
        if (sInLoanSMfg != null ? !sInLoanSMfg.equals(that.sInLoanSMfg) : that.sInLoanSMfg != null) return false;
        if (sInLoanSLot != null ? !sInLoanSLot.equals(that.sInLoanSLot) : that.sInLoanSLot != null) return false;
        if (sInLoanSQuantity != null ? !sInLoanSQuantity.equals(that.sInLoanSQuantity) : that.sInLoanSQuantity != null)
            return false;
        if (sInLoanSBoxQuantity != null ? !sInLoanSBoxQuantity.equals(that.sInLoanSBoxQuantity) : that.sInLoanSBoxQuantity != null)
            return false;
        if (sInLoanSStock != null ? !sInLoanSStock.equals(that.sInLoanSStock) : that.sInLoanSStock != null)
            return false;
        if (sInLoanSPresentationProperty != null ? !sInLoanSPresentationProperty.equals(that.sInLoanSPresentationProperty) : that.sInLoanSPresentationProperty != null)
            return false;
        if (sInLoanSDetailMoney != null ? !sInLoanSDetailMoney.equals(that.sInLoanSDetailMoney) : that.sInLoanSDetailMoney != null)
            return false;
        if (sInLoanSOriginalPrice != null ? !sInLoanSOriginalPrice.equals(that.sInLoanSOriginalPrice) : that.sInLoanSOriginalPrice != null)
            return false;
        if (sInLoanSInvoiceDate != null ? !sInLoanSInvoiceDate.equals(that.sInLoanSInvoiceDate) : that.sInLoanSInvoiceDate != null)
            return false;
        if (sInLoanSCreaterNo != null ? !sInLoanSCreaterNo.equals(that.sInLoanSCreaterNo) : that.sInLoanSCreaterNo != null)
            return false;
        if (sInLoanSCreateDate != null ? !sInLoanSCreateDate.equals(that.sInLoanSCreateDate) : that.sInLoanSCreateDate != null)
            return false;
        if (sInLoanSModifiNo != null ? !sInLoanSModifiNo.equals(that.sInLoanSModifiNo) : that.sInLoanSModifiNo != null)
            return false;
        if (sInLoanSModifiTime != null ? !sInLoanSModifiTime.equals(that.sInLoanSModifiTime) : that.sInLoanSModifiTime != null)
            return false;
        if (sInLoanSChecker != null ? !sInLoanSChecker.equals(that.sInLoanSChecker) : that.sInLoanSChecker != null)
            return false;
        if (sInLoanSCheckDate != null ? !sInLoanSCheckDate.equals(that.sInLoanSCheckDate) : that.sInLoanSCheckDate != null)
            return false;
        if (sInLoanSGroupNodeId != null ? !sInLoanSGroupNodeId.equals(that.sInLoanSGroupNodeId) : that.sInLoanSGroupNodeId != null)
            return false;
        if (sInLoanSIsPass != null ? !sInLoanSIsPass.equals(that.sInLoanSIsPass) : that.sInLoanSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sInLoanSInLoanLno != null ? sInLoanSInLoanLno.hashCode() : 0;
        result = 31 * result + (sInLoanSRoomNo != null ? sInLoanSRoomNo.hashCode() : 0);
        result = 31 * result + (sInLoanSLocationNo != null ? sInLoanSLocationNo.hashCode() : 0);
        result = 31 * result + (sInLoanSMfg != null ? sInLoanSMfg.hashCode() : 0);
        result = 31 * result + (sInLoanSLot != null ? sInLoanSLot.hashCode() : 0);
        result = 31 * result + (sInLoanSQuantity != null ? sInLoanSQuantity.hashCode() : 0);
        result = 31 * result + (sInLoanSBoxQuantity != null ? sInLoanSBoxQuantity.hashCode() : 0);
        result = 31 * result + (sInLoanSStock != null ? sInLoanSStock.hashCode() : 0);
        result = 31 * result + (sInLoanSPresentationProperty != null ? sInLoanSPresentationProperty.hashCode() : 0);
        result = 31 * result + (sInLoanSDetailMoney != null ? sInLoanSDetailMoney.hashCode() : 0);
        result = 31 * result + (sInLoanSOriginalPrice != null ? sInLoanSOriginalPrice.hashCode() : 0);
        result = 31 * result + sInLoanSDetailId;
        result = 31 * result + (sInLoanSInvoiceDate != null ? sInLoanSInvoiceDate.hashCode() : 0);
        result = 31 * result + (sInLoanSCreaterNo != null ? sInLoanSCreaterNo.hashCode() : 0);
        result = 31 * result + (sInLoanSCreateDate != null ? sInLoanSCreateDate.hashCode() : 0);
        result = 31 * result + (sInLoanSModifiNo != null ? sInLoanSModifiNo.hashCode() : 0);
        result = 31 * result + (sInLoanSModifiTime != null ? sInLoanSModifiTime.hashCode() : 0);
        result = 31 * result + (sInLoanSChecker != null ? sInLoanSChecker.hashCode() : 0);
        result = 31 * result + (sInLoanSCheckDate != null ? sInLoanSCheckDate.hashCode() : 0);
        result = 31 * result + (sInLoanSGroupNodeId != null ? sInLoanSGroupNodeId.hashCode() : 0);
        result = 31 * result + (sInLoanSIsPass != null ? sInLoanSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_in_loan_lno", referencedColumnName = "s_in_loan_m_in_loan_lno", nullable = false)
    public SInLoanMEntity getsInLoanMBySInLoanSInLoanLno() {
        return sInLoanMBySInLoanSInLoanLno;
    }

    public void setsInLoanMBySInLoanSInLoanLno(SInLoanMEntity sInLoanMBySInLoanSInLoanLno) {
        this.sInLoanMBySInLoanSInLoanLno = sInLoanMBySInLoanSInLoanLno;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_room_no", referencedColumnName = "t_room_room_no", nullable = false)
    public TRoomEntity gettRoomBySInLoanSRoomNo() {
        return tRoomBySInLoanSRoomNo;
    }

    public void settRoomBySInLoanSRoomNo(TRoomEntity tRoomBySInLoanSRoomNo) {
        this.tRoomBySInLoanSRoomNo = tRoomBySInLoanSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_location_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationBySInLoanSLocationNo() {
        return storeLocationBySInLoanSLocationNo;
    }

    public void setStoreLocationBySInLoanSLocationNo(StoreLocationEntity storeLocationBySInLoanSLocationNo) {
        this.storeLocationBySInLoanSLocationNo = storeLocationBySInLoanSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySInLoanSCreaterNo() {
        return tStaffBySInLoanSCreaterNo;
    }

    public void settStaffBySInLoanSCreaterNo(TStaffEntity tStaffBySInLoanSCreaterNo) {
        this.tStaffBySInLoanSCreaterNo = tStaffBySInLoanSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySInLoanSModifiNo() {
        return tStaffBySInLoanSModifiNo;
    }

    public void settStaffBySInLoanSModifiNo(TStaffEntity tStaffBySInLoanSModifiNo) {
        this.tStaffBySInLoanSModifiNo = tStaffBySInLoanSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySInLoanSChecker() {
        return tStaffBySInLoanSChecker;
    }

    public void settStaffBySInLoanSChecker(TStaffEntity tStaffBySInLoanSChecker) {
        this.tStaffBySInLoanSChecker = tStaffBySInLoanSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_in_loan_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySInLoanSGroupNodeId() {
        return tOrgBySInLoanSGroupNodeId;
    }

    public void settOrgBySInLoanSGroupNodeId(TOrgEntity tOrgBySInLoanSGroupNodeId) {
        this.tOrgBySInLoanSGroupNodeId = tOrgBySInLoanSGroupNodeId;
    }
}
