package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "f_stock_adjus_m", schema = "dbo", catalog = "logistics")
public class FStockAdjusMEntity {
    private String fStockAdjusMStockAdjustNo;
    private String fStockAdjusMServiceAttribute;
    private String fStockAdjusMHandbillNo;
    private String fStockAdjusMWarehouseKeeper;
    private BigDecimal fStockAdjusMSumMoney;
    private String fStockAdjusMMediator;
    private Timestamp fStockAdjusMAdjustmentTime;
    private Timestamp fStockAdjusMOccurrenceTime;
    private String fStockAdjusMCreaterNo;
    private Timestamp fStockAdjusMCreateDate;
    private String fStockAdjusMModifiNo;
    private Timestamp fStockAdjusMModifiTime;
    private String fStockAdjusMChecker;
    private Timestamp fStockAdjusMCheckDate;
    private String fStockAdjusMGroupNodeId;
    private Integer fStockAdjusMPrints;
    private String fStockAdjusMNotes;
    private String fStockAdjusMState;
    private String fStockAdjusMIsPass;
    private TStaffEntity tStaffByFStockAdjusMWarehouseKeeper;
    private TStaffEntity tStaffByFStockAdjusMCreaterNo;
    private TStaffEntity tStaffByFStockAdjusMModifiNo;
    private TStaffEntity tStaffByFStockAdjusMChecker;
    private TOrgEntity tOrgByFStockAdjusMGroupNodeId;

    @Id
    @Column(name = "f_stock_adjus_m_stock_adjust_no", nullable = false, length = 16)
    public String getfStockAdjusMStockAdjustNo() {
        return fStockAdjusMStockAdjustNo;
    }

    public void setfStockAdjusMStockAdjustNo(String fStockAdjusMStockAdjustNo) {
        this.fStockAdjusMStockAdjustNo = fStockAdjusMStockAdjustNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_service_attribute", nullable = true, length = 4)
    public String getfStockAdjusMServiceAttribute() {
        return fStockAdjusMServiceAttribute;
    }

    public void setfStockAdjusMServiceAttribute(String fStockAdjusMServiceAttribute) {
        this.fStockAdjusMServiceAttribute = fStockAdjusMServiceAttribute;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_handbill_no", nullable = true, length = 20)
    public String getfStockAdjusMHandbillNo() {
        return fStockAdjusMHandbillNo;
    }

    public void setfStockAdjusMHandbillNo(String fStockAdjusMHandbillNo) {
        this.fStockAdjusMHandbillNo = fStockAdjusMHandbillNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_warehouse_keeper", nullable = true, length = 8)
    public String getfStockAdjusMWarehouseKeeper() {
        return fStockAdjusMWarehouseKeeper;
    }

    public void setfStockAdjusMWarehouseKeeper(String fStockAdjusMWarehouseKeeper) {
        this.fStockAdjusMWarehouseKeeper = fStockAdjusMWarehouseKeeper;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getfStockAdjusMSumMoney() {
        return fStockAdjusMSumMoney;
    }

    public void setfStockAdjusMSumMoney(BigDecimal fStockAdjusMSumMoney) {
        this.fStockAdjusMSumMoney = fStockAdjusMSumMoney;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_mediator", nullable = true, length = 20)
    public String getfStockAdjusMMediator() {
        return fStockAdjusMMediator;
    }

    public void setfStockAdjusMMediator(String fStockAdjusMMediator) {
        this.fStockAdjusMMediator = fStockAdjusMMediator;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_adjustment_time", nullable = true)
    public Timestamp getfStockAdjusMAdjustmentTime() {
        return fStockAdjusMAdjustmentTime;
    }

    public void setfStockAdjusMAdjustmentTime(Timestamp fStockAdjusMAdjustmentTime) {
        this.fStockAdjusMAdjustmentTime = fStockAdjusMAdjustmentTime;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_occurrence_time", nullable = true)
    public Timestamp getfStockAdjusMOccurrenceTime() {
        return fStockAdjusMOccurrenceTime;
    }

    public void setfStockAdjusMOccurrenceTime(Timestamp fStockAdjusMOccurrenceTime) {
        this.fStockAdjusMOccurrenceTime = fStockAdjusMOccurrenceTime;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_creater_no", nullable = false, length = 8)
    public String getfStockAdjusMCreaterNo() {
        return fStockAdjusMCreaterNo;
    }

    public void setfStockAdjusMCreaterNo(String fStockAdjusMCreaterNo) {
        this.fStockAdjusMCreaterNo = fStockAdjusMCreaterNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_create_date", nullable = false)
    public Timestamp getfStockAdjusMCreateDate() {
        return fStockAdjusMCreateDate;
    }

    public void setfStockAdjusMCreateDate(Timestamp fStockAdjusMCreateDate) {
        this.fStockAdjusMCreateDate = fStockAdjusMCreateDate;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_modifi_no", nullable = false, length = 8)
    public String getfStockAdjusMModifiNo() {
        return fStockAdjusMModifiNo;
    }

    public void setfStockAdjusMModifiNo(String fStockAdjusMModifiNo) {
        this.fStockAdjusMModifiNo = fStockAdjusMModifiNo;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_modifi_time", nullable = false)
    public Timestamp getfStockAdjusMModifiTime() {
        return fStockAdjusMModifiTime;
    }

    public void setfStockAdjusMModifiTime(Timestamp fStockAdjusMModifiTime) {
        this.fStockAdjusMModifiTime = fStockAdjusMModifiTime;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_checker", nullable = false, length = 8)
    public String getfStockAdjusMChecker() {
        return fStockAdjusMChecker;
    }

    public void setfStockAdjusMChecker(String fStockAdjusMChecker) {
        this.fStockAdjusMChecker = fStockAdjusMChecker;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_check_date", nullable = false)
    public Timestamp getfStockAdjusMCheckDate() {
        return fStockAdjusMCheckDate;
    }

    public void setfStockAdjusMCheckDate(Timestamp fStockAdjusMCheckDate) {
        this.fStockAdjusMCheckDate = fStockAdjusMCheckDate;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_group_node_id", nullable = false, length = 20)
    public String getfStockAdjusMGroupNodeId() {
        return fStockAdjusMGroupNodeId;
    }

    public void setfStockAdjusMGroupNodeId(String fStockAdjusMGroupNodeId) {
        this.fStockAdjusMGroupNodeId = fStockAdjusMGroupNodeId;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_prints", nullable = true)
    public Integer getfStockAdjusMPrints() {
        return fStockAdjusMPrints;
    }

    public void setfStockAdjusMPrints(Integer fStockAdjusMPrints) {
        this.fStockAdjusMPrints = fStockAdjusMPrints;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_notes", nullable = true, length = 200)
    public String getfStockAdjusMNotes() {
        return fStockAdjusMNotes;
    }

    public void setfStockAdjusMNotes(String fStockAdjusMNotes) {
        this.fStockAdjusMNotes = fStockAdjusMNotes;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_state", nullable = true, length = -1)
    public String getfStockAdjusMState() {
        return fStockAdjusMState;
    }

    public void setfStockAdjusMState(String fStockAdjusMState) {
        this.fStockAdjusMState = fStockAdjusMState;
    }

    @Basic
    @Column(name = "f_stock_adjus_m_isPass", nullable = true, length = -1)
    public String getfStockAdjusMIsPass() {
        return fStockAdjusMIsPass;
    }

    public void setfStockAdjusMIsPass(String fStockAdjusMIsPass) {
        this.fStockAdjusMIsPass = fStockAdjusMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FStockAdjusMEntity that = (FStockAdjusMEntity) o;

        if (fStockAdjusMStockAdjustNo != null ? !fStockAdjusMStockAdjustNo.equals(that.fStockAdjusMStockAdjustNo) : that.fStockAdjusMStockAdjustNo != null)
            return false;
        if (fStockAdjusMServiceAttribute != null ? !fStockAdjusMServiceAttribute.equals(that.fStockAdjusMServiceAttribute) : that.fStockAdjusMServiceAttribute != null)
            return false;
        if (fStockAdjusMHandbillNo != null ? !fStockAdjusMHandbillNo.equals(that.fStockAdjusMHandbillNo) : that.fStockAdjusMHandbillNo != null)
            return false;
        if (fStockAdjusMWarehouseKeeper != null ? !fStockAdjusMWarehouseKeeper.equals(that.fStockAdjusMWarehouseKeeper) : that.fStockAdjusMWarehouseKeeper != null)
            return false;
        if (fStockAdjusMSumMoney != null ? !fStockAdjusMSumMoney.equals(that.fStockAdjusMSumMoney) : that.fStockAdjusMSumMoney != null)
            return false;
        if (fStockAdjusMMediator != null ? !fStockAdjusMMediator.equals(that.fStockAdjusMMediator) : that.fStockAdjusMMediator != null)
            return false;
        if (fStockAdjusMAdjustmentTime != null ? !fStockAdjusMAdjustmentTime.equals(that.fStockAdjusMAdjustmentTime) : that.fStockAdjusMAdjustmentTime != null)
            return false;
        if (fStockAdjusMOccurrenceTime != null ? !fStockAdjusMOccurrenceTime.equals(that.fStockAdjusMOccurrenceTime) : that.fStockAdjusMOccurrenceTime != null)
            return false;
        if (fStockAdjusMCreaterNo != null ? !fStockAdjusMCreaterNo.equals(that.fStockAdjusMCreaterNo) : that.fStockAdjusMCreaterNo != null)
            return false;
        if (fStockAdjusMCreateDate != null ? !fStockAdjusMCreateDate.equals(that.fStockAdjusMCreateDate) : that.fStockAdjusMCreateDate != null)
            return false;
        if (fStockAdjusMModifiNo != null ? !fStockAdjusMModifiNo.equals(that.fStockAdjusMModifiNo) : that.fStockAdjusMModifiNo != null)
            return false;
        if (fStockAdjusMModifiTime != null ? !fStockAdjusMModifiTime.equals(that.fStockAdjusMModifiTime) : that.fStockAdjusMModifiTime != null)
            return false;
        if (fStockAdjusMChecker != null ? !fStockAdjusMChecker.equals(that.fStockAdjusMChecker) : that.fStockAdjusMChecker != null)
            return false;
        if (fStockAdjusMCheckDate != null ? !fStockAdjusMCheckDate.equals(that.fStockAdjusMCheckDate) : that.fStockAdjusMCheckDate != null)
            return false;
        if (fStockAdjusMGroupNodeId != null ? !fStockAdjusMGroupNodeId.equals(that.fStockAdjusMGroupNodeId) : that.fStockAdjusMGroupNodeId != null)
            return false;
        if (fStockAdjusMPrints != null ? !fStockAdjusMPrints.equals(that.fStockAdjusMPrints) : that.fStockAdjusMPrints != null)
            return false;
        if (fStockAdjusMNotes != null ? !fStockAdjusMNotes.equals(that.fStockAdjusMNotes) : that.fStockAdjusMNotes != null)
            return false;
        if (fStockAdjusMState != null ? !fStockAdjusMState.equals(that.fStockAdjusMState) : that.fStockAdjusMState != null)
            return false;
        if (fStockAdjusMIsPass != null ? !fStockAdjusMIsPass.equals(that.fStockAdjusMIsPass) : that.fStockAdjusMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fStockAdjusMStockAdjustNo != null ? fStockAdjusMStockAdjustNo.hashCode() : 0;
        result = 31 * result + (fStockAdjusMServiceAttribute != null ? fStockAdjusMServiceAttribute.hashCode() : 0);
        result = 31 * result + (fStockAdjusMHandbillNo != null ? fStockAdjusMHandbillNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusMWarehouseKeeper != null ? fStockAdjusMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (fStockAdjusMSumMoney != null ? fStockAdjusMSumMoney.hashCode() : 0);
        result = 31 * result + (fStockAdjusMMediator != null ? fStockAdjusMMediator.hashCode() : 0);
        result = 31 * result + (fStockAdjusMAdjustmentTime != null ? fStockAdjusMAdjustmentTime.hashCode() : 0);
        result = 31 * result + (fStockAdjusMOccurrenceTime != null ? fStockAdjusMOccurrenceTime.hashCode() : 0);
        result = 31 * result + (fStockAdjusMCreaterNo != null ? fStockAdjusMCreaterNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusMCreateDate != null ? fStockAdjusMCreateDate.hashCode() : 0);
        result = 31 * result + (fStockAdjusMModifiNo != null ? fStockAdjusMModifiNo.hashCode() : 0);
        result = 31 * result + (fStockAdjusMModifiTime != null ? fStockAdjusMModifiTime.hashCode() : 0);
        result = 31 * result + (fStockAdjusMChecker != null ? fStockAdjusMChecker.hashCode() : 0);
        result = 31 * result + (fStockAdjusMCheckDate != null ? fStockAdjusMCheckDate.hashCode() : 0);
        result = 31 * result + (fStockAdjusMGroupNodeId != null ? fStockAdjusMGroupNodeId.hashCode() : 0);
        result = 31 * result + (fStockAdjusMPrints != null ? fStockAdjusMPrints.hashCode() : 0);
        result = 31 * result + (fStockAdjusMNotes != null ? fStockAdjusMNotes.hashCode() : 0);
        result = 31 * result + (fStockAdjusMState != null ? fStockAdjusMState.hashCode() : 0);
        result = 31 * result + (fStockAdjusMIsPass != null ? fStockAdjusMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByFStockAdjusMWarehouseKeeper() {
        return tStaffByFStockAdjusMWarehouseKeeper;
    }

    public void settStaffByFStockAdjusMWarehouseKeeper(TStaffEntity tStaffByFStockAdjusMWarehouseKeeper) {
        this.tStaffByFStockAdjusMWarehouseKeeper = tStaffByFStockAdjusMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_m_creater_no", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffByFStockAdjusMCreaterNo() {
        return tStaffByFStockAdjusMCreaterNo;
    }

    public void settStaffByFStockAdjusMCreaterNo(TStaffEntity tStaffByFStockAdjusMCreaterNo) {
        this.tStaffByFStockAdjusMCreaterNo = tStaffByFStockAdjusMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_m_modifi_no", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffByFStockAdjusMModifiNo() {
        return tStaffByFStockAdjusMModifiNo;
    }

    public void settStaffByFStockAdjusMModifiNo(TStaffEntity tStaffByFStockAdjusMModifiNo) {
        this.tStaffByFStockAdjusMModifiNo = tStaffByFStockAdjusMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_m_checker", referencedColumnName = "t_staff_staff_no", nullable = false,insertable = false, updatable = false)
    public TStaffEntity gettStaffByFStockAdjusMChecker() {
        return tStaffByFStockAdjusMChecker;
    }

    public void settStaffByFStockAdjusMChecker(TStaffEntity tStaffByFStockAdjusMChecker) {
        this.tStaffByFStockAdjusMChecker = tStaffByFStockAdjusMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "f_stock_adjus_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByFStockAdjusMGroupNodeId() {
        return tOrgByFStockAdjusMGroupNodeId;
    }

    public void settOrgByFStockAdjusMGroupNodeId(TOrgEntity tOrgByFStockAdjusMGroupNodeId) {
        this.tOrgByFStockAdjusMGroupNodeId = tOrgByFStockAdjusMGroupNodeId;
    }
}
