package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_breakage_m", schema = "dbo", catalog = "logistics_test")
public class SBreakageMEntity {
    private String sBreakageMBreakageBillno;
    private String sBreakageMServiceAttribute;
    private Timestamp sBreakageMReportedLossDate;
    private String sBreakageMHandbillNo;
    private String sBreakageMWarehouseKeeper;
    private String sBreakageMSalesman;
    private BigDecimal sBreakageMSumMoney;
    private String sBreakageMClientNo;
    private String sBreakageMCreaterNo;
    private Timestamp sBreakageMCreateDate;
    private String sBreakageMModifiNo;
    private Timestamp sBreakageMModifiTime;
    private String sBreakageMChecker;
    private Timestamp sBreakageMCheckDate;
    private String sBreakageMGroupNodeId;
    private Integer sBreakageMPrints;
    private String sBreakageMNotes;
    private String sBreakageMState;
    private String sBreakageMIsPass;
    private TStaffEntity tStaffBySBreakageMWarehouseKeeper;
    private TStaffEntity tStaffBySBreakageMSalesman;
    private TClientEntity tClientBySBreakageMClientNo;
    private TStaffEntity tStaffBySBreakageMCreaterNo;
    private TStaffEntity tStaffBySBreakageMModifiNo;
    private TStaffEntity tStaffBySBreakageMChecker;
    private TOrgEntity tOrgBySBreakageMGroupNodeId;

    @Id
    @Column(name = "s_breakage_m_breakage_billno", nullable = false, length = 16)
    public String getsBreakageMBreakageBillno() {
        return sBreakageMBreakageBillno;
    }

    public void setsBreakageMBreakageBillno(String sBreakageMBreakageBillno) {
        this.sBreakageMBreakageBillno = sBreakageMBreakageBillno;
    }

    @Basic
    @Column(name = "s_breakage_m_service_attribute", nullable = true, length = 4)
    public String getsBreakageMServiceAttribute() {
        return sBreakageMServiceAttribute;
    }

    public void setsBreakageMServiceAttribute(String sBreakageMServiceAttribute) {
        this.sBreakageMServiceAttribute = sBreakageMServiceAttribute;
    }

    @Basic
    @Column(name = "s_breakage_m_ReportedLossDate", nullable = true)
    public Timestamp getsBreakageMReportedLossDate() {
        return sBreakageMReportedLossDate;
    }

    public void setsBreakageMReportedLossDate(Timestamp sBreakageMReportedLossDate) {
        this.sBreakageMReportedLossDate = sBreakageMReportedLossDate;
    }

    @Basic
    @Column(name = "s_breakage_m_handbill_no", nullable = true, length = 20)
    public String getsBreakageMHandbillNo() {
        return sBreakageMHandbillNo;
    }

    public void setsBreakageMHandbillNo(String sBreakageMHandbillNo) {
        this.sBreakageMHandbillNo = sBreakageMHandbillNo;
    }

    @Basic
    @Column(name = "s_breakage_m_warehouse_keeper", nullable = true, length = 8)
    public String getsBreakageMWarehouseKeeper() {
        return sBreakageMWarehouseKeeper;
    }

    public void setsBreakageMWarehouseKeeper(String sBreakageMWarehouseKeeper) {
        this.sBreakageMWarehouseKeeper = sBreakageMWarehouseKeeper;
    }

    @Basic
    @Column(name = "s_breakage_m_salesman", nullable = true, length = 8)
    public String getsBreakageMSalesman() {
        return sBreakageMSalesman;
    }

    public void setsBreakageMSalesman(String sBreakageMSalesman) {
        this.sBreakageMSalesman = sBreakageMSalesman;
    }

    @Basic
    @Column(name = "s_breakage_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getsBreakageMSumMoney() {
        return sBreakageMSumMoney;
    }

    public void setsBreakageMSumMoney(BigDecimal sBreakageMSumMoney) {
        this.sBreakageMSumMoney = sBreakageMSumMoney;
    }

    @Basic
    @Column(name = "s_breakage_m_client_no", nullable = true, length = 20)
    public String getsBreakageMClientNo() {
        return sBreakageMClientNo;
    }

    public void setsBreakageMClientNo(String sBreakageMClientNo) {
        this.sBreakageMClientNo = sBreakageMClientNo;
    }

    @Basic
    @Column(name = "s_breakage_m_creater_no", nullable = false, length = 8)
    public String getsBreakageMCreaterNo() {
        return sBreakageMCreaterNo;
    }

    public void setsBreakageMCreaterNo(String sBreakageMCreaterNo) {
        this.sBreakageMCreaterNo = sBreakageMCreaterNo;
    }

    @Basic
    @Column(name = "s_breakage_m_create_date", nullable = false)
    public Timestamp getsBreakageMCreateDate() {
        return sBreakageMCreateDate;
    }

    public void setsBreakageMCreateDate(Timestamp sBreakageMCreateDate) {
        this.sBreakageMCreateDate = sBreakageMCreateDate;
    }

    @Basic
    @Column(name = "s_breakage_m_modifi_no", nullable = false, length = 8)
    public String getsBreakageMModifiNo() {
        return sBreakageMModifiNo;
    }

    public void setsBreakageMModifiNo(String sBreakageMModifiNo) {
        this.sBreakageMModifiNo = sBreakageMModifiNo;
    }

    @Basic
    @Column(name = "s_breakage_m_modifi_time", nullable = false)
    public Timestamp getsBreakageMModifiTime() {
        return sBreakageMModifiTime;
    }

    public void setsBreakageMModifiTime(Timestamp sBreakageMModifiTime) {
        this.sBreakageMModifiTime = sBreakageMModifiTime;
    }

    @Basic
    @Column(name = "s_breakage_m_checker", nullable = false, length = 8)
    public String getsBreakageMChecker() {
        return sBreakageMChecker;
    }

    public void setsBreakageMChecker(String sBreakageMChecker) {
        this.sBreakageMChecker = sBreakageMChecker;
    }

    @Basic
    @Column(name = "s_breakage_m_check_date", nullable = false)
    public Timestamp getsBreakageMCheckDate() {
        return sBreakageMCheckDate;
    }

    public void setsBreakageMCheckDate(Timestamp sBreakageMCheckDate) {
        this.sBreakageMCheckDate = sBreakageMCheckDate;
    }

    @Basic
    @Column(name = "s_breakage_m_group_node_id", nullable = false, length = 20)
    public String getsBreakageMGroupNodeId() {
        return sBreakageMGroupNodeId;
    }

    public void setsBreakageMGroupNodeId(String sBreakageMGroupNodeId) {
        this.sBreakageMGroupNodeId = sBreakageMGroupNodeId;
    }

    @Basic
    @Column(name = "s_breakage_m_prints", nullable = true)
    public Integer getsBreakageMPrints() {
        return sBreakageMPrints;
    }

    public void setsBreakageMPrints(Integer sBreakageMPrints) {
        this.sBreakageMPrints = sBreakageMPrints;
    }

    @Basic
    @Column(name = "s_breakage_m_notes", nullable = true, length = 200)
    public String getsBreakageMNotes() {
        return sBreakageMNotes;
    }

    public void setsBreakageMNotes(String sBreakageMNotes) {
        this.sBreakageMNotes = sBreakageMNotes;
    }

    @Basic
    @Column(name = "s_breakage_m_state", nullable = true, length = 1)
    public String getsBreakageMState() {
        return sBreakageMState;
    }

    public void setsBreakageMState(String sBreakageMState) {
        this.sBreakageMState = sBreakageMState;
    }

    @Basic
    @Column(name = "s_breakage_m_isPass", nullable = true, length = 1)
    public String getsBreakageMIsPass() {
        return sBreakageMIsPass;
    }

    public void setsBreakageMIsPass(String sBreakageMIsPass) {
        this.sBreakageMIsPass = sBreakageMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SBreakageMEntity that = (SBreakageMEntity) o;

        if (sBreakageMBreakageBillno != null ? !sBreakageMBreakageBillno.equals(that.sBreakageMBreakageBillno) : that.sBreakageMBreakageBillno != null)
            return false;
        if (sBreakageMServiceAttribute != null ? !sBreakageMServiceAttribute.equals(that.sBreakageMServiceAttribute) : that.sBreakageMServiceAttribute != null)
            return false;
        if (sBreakageMReportedLossDate != null ? !sBreakageMReportedLossDate.equals(that.sBreakageMReportedLossDate) : that.sBreakageMReportedLossDate != null)
            return false;
        if (sBreakageMHandbillNo != null ? !sBreakageMHandbillNo.equals(that.sBreakageMHandbillNo) : that.sBreakageMHandbillNo != null)
            return false;
        if (sBreakageMWarehouseKeeper != null ? !sBreakageMWarehouseKeeper.equals(that.sBreakageMWarehouseKeeper) : that.sBreakageMWarehouseKeeper != null)
            return false;
        if (sBreakageMSalesman != null ? !sBreakageMSalesman.equals(that.sBreakageMSalesman) : that.sBreakageMSalesman != null)
            return false;
        if (sBreakageMSumMoney != null ? !sBreakageMSumMoney.equals(that.sBreakageMSumMoney) : that.sBreakageMSumMoney != null)
            return false;
        if (sBreakageMClientNo != null ? !sBreakageMClientNo.equals(that.sBreakageMClientNo) : that.sBreakageMClientNo != null)
            return false;
        if (sBreakageMCreaterNo != null ? !sBreakageMCreaterNo.equals(that.sBreakageMCreaterNo) : that.sBreakageMCreaterNo != null)
            return false;
        if (sBreakageMCreateDate != null ? !sBreakageMCreateDate.equals(that.sBreakageMCreateDate) : that.sBreakageMCreateDate != null)
            return false;
        if (sBreakageMModifiNo != null ? !sBreakageMModifiNo.equals(that.sBreakageMModifiNo) : that.sBreakageMModifiNo != null)
            return false;
        if (sBreakageMModifiTime != null ? !sBreakageMModifiTime.equals(that.sBreakageMModifiTime) : that.sBreakageMModifiTime != null)
            return false;
        if (sBreakageMChecker != null ? !sBreakageMChecker.equals(that.sBreakageMChecker) : that.sBreakageMChecker != null)
            return false;
        if (sBreakageMCheckDate != null ? !sBreakageMCheckDate.equals(that.sBreakageMCheckDate) : that.sBreakageMCheckDate != null)
            return false;
        if (sBreakageMGroupNodeId != null ? !sBreakageMGroupNodeId.equals(that.sBreakageMGroupNodeId) : that.sBreakageMGroupNodeId != null)
            return false;
        if (sBreakageMPrints != null ? !sBreakageMPrints.equals(that.sBreakageMPrints) : that.sBreakageMPrints != null)
            return false;
        if (sBreakageMNotes != null ? !sBreakageMNotes.equals(that.sBreakageMNotes) : that.sBreakageMNotes != null)
            return false;
        if (sBreakageMState != null ? !sBreakageMState.equals(that.sBreakageMState) : that.sBreakageMState != null)
            return false;
        if (sBreakageMIsPass != null ? !sBreakageMIsPass.equals(that.sBreakageMIsPass) : that.sBreakageMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sBreakageMBreakageBillno != null ? sBreakageMBreakageBillno.hashCode() : 0;
        result = 31 * result + (sBreakageMServiceAttribute != null ? sBreakageMServiceAttribute.hashCode() : 0);
        result = 31 * result + (sBreakageMReportedLossDate != null ? sBreakageMReportedLossDate.hashCode() : 0);
        result = 31 * result + (sBreakageMHandbillNo != null ? sBreakageMHandbillNo.hashCode() : 0);
        result = 31 * result + (sBreakageMWarehouseKeeper != null ? sBreakageMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (sBreakageMSalesman != null ? sBreakageMSalesman.hashCode() : 0);
        result = 31 * result + (sBreakageMSumMoney != null ? sBreakageMSumMoney.hashCode() : 0);
        result = 31 * result + (sBreakageMClientNo != null ? sBreakageMClientNo.hashCode() : 0);
        result = 31 * result + (sBreakageMCreaterNo != null ? sBreakageMCreaterNo.hashCode() : 0);
        result = 31 * result + (sBreakageMCreateDate != null ? sBreakageMCreateDate.hashCode() : 0);
        result = 31 * result + (sBreakageMModifiNo != null ? sBreakageMModifiNo.hashCode() : 0);
        result = 31 * result + (sBreakageMModifiTime != null ? sBreakageMModifiTime.hashCode() : 0);
        result = 31 * result + (sBreakageMChecker != null ? sBreakageMChecker.hashCode() : 0);
        result = 31 * result + (sBreakageMCheckDate != null ? sBreakageMCheckDate.hashCode() : 0);
        result = 31 * result + (sBreakageMGroupNodeId != null ? sBreakageMGroupNodeId.hashCode() : 0);
        result = 31 * result + (sBreakageMPrints != null ? sBreakageMPrints.hashCode() : 0);
        result = 31 * result + (sBreakageMNotes != null ? sBreakageMNotes.hashCode() : 0);
        result = 31 * result + (sBreakageMState != null ? sBreakageMState.hashCode() : 0);
        result = 31 * result + (sBreakageMIsPass != null ? sBreakageMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySBreakageMWarehouseKeeper() {
        return tStaffBySBreakageMWarehouseKeeper;
    }

    public void settStaffBySBreakageMWarehouseKeeper(TStaffEntity tStaffBySBreakageMWarehouseKeeper) {
        this.tStaffBySBreakageMWarehouseKeeper = tStaffBySBreakageMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySBreakageMSalesman() {
        return tStaffBySBreakageMSalesman;
    }

    public void settStaffBySBreakageMSalesman(TStaffEntity tStaffBySBreakageMSalesman) {
        this.tStaffBySBreakageMSalesman = tStaffBySBreakageMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_client_no", referencedColumnName = "t_client_client_no")
    public TClientEntity gettClientBySBreakageMClientNo() {
        return tClientBySBreakageMClientNo;
    }

    public void settClientBySBreakageMClientNo(TClientEntity tClientBySBreakageMClientNo) {
        this.tClientBySBreakageMClientNo = tClientBySBreakageMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_creater_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySBreakageMCreaterNo() {
        return tStaffBySBreakageMCreaterNo;
    }

    public void settStaffBySBreakageMCreaterNo(TStaffEntity tStaffBySBreakageMCreaterNo) {
        this.tStaffBySBreakageMCreaterNo = tStaffBySBreakageMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_modifi_no", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySBreakageMModifiNo() {
        return tStaffBySBreakageMModifiNo;
    }

    public void settStaffBySBreakageMModifiNo(TStaffEntity tStaffBySBreakageMModifiNo) {
        this.tStaffBySBreakageMModifiNo = tStaffBySBreakageMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_checker", referencedColumnName = "t_staff_staff_no", nullable = false)
    public TStaffEntity gettStaffBySBreakageMChecker() {
        return tStaffBySBreakageMChecker;
    }

    public void settStaffBySBreakageMChecker(TStaffEntity tStaffBySBreakageMChecker) {
        this.tStaffBySBreakageMChecker = tStaffBySBreakageMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_breakage_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySBreakageMGroupNodeId() {
        return tOrgBySBreakageMGroupNodeId;
    }

    public void settOrgBySBreakageMGroupNodeId(TOrgEntity tOrgBySBreakageMGroupNodeId) {
        this.tOrgBySBreakageMGroupNodeId = tOrgBySBreakageMGroupNodeId;
    }
}
