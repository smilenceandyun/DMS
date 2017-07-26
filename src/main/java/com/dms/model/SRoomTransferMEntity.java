package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "s_room_transfer_m", schema = "dbo", catalog = "logistics_test")
public class SRoomTransferMEntity {
    private String sRoomTransferMRoomTransferNo;
    private String sRoomTransferMHandbillNo;
    private Timestamp sRoomTransferMTransferDate;
    private String sRoomTransferMWarehouseKeeper;
    private String sRoomTransferMHandlerName;
    private String sRoomTransferMServiceAttribute;
    private BigDecimal sRoomTransferMSumMoney;
    private String sRoomTransferMBranchNo;
    private String sRoomTransferMCreaterNo;
    private Timestamp sRoomTransferMCreateDate;
    private String sRoomTransferMModifiNo;
    private Timestamp sRoomTransferMModifiTime;
    private String sRoomTransferMChecker;
    private Timestamp sRoomTransferMCheckDate;
    private String sRoomTransferMGroupNodeId;
    private Integer sRoomTransferMPrints;
    private String sRoomTransferMNotes;
    private String sRoomTransferMState;
    private String sRoomTransferMIsPass;
    private TStaffEntity tStaffBySRoomTransferMWarehouseKeeper;
    private TStaffEntity tStaffBySRoomTransferMWarehouseKeeper_0;
    private TStaffEntity tStaffBySRoomTransferMCreaterNo;
    private TStaffEntity tStaffBySRoomTransferMModifiNo;
    private TStaffEntity tStaffBySRoomTransferMChecker;
    private TOrgEntity tOrgBySRoomTransferMGroupNodeId;
    private Collection<SRoomTransferSEntity> sRoomTransferSBySRoomTransferMRoomTransferNo;

    @Id
    @Column(name = "s_room_transfer_m_room_transfer_no", nullable = false, length = 16)
    public String getsRoomTransferMRoomTransferNo() {
        return sRoomTransferMRoomTransferNo;
    }

    public void setsRoomTransferMRoomTransferNo(String sRoomTransferMRoomTransferNo) {
        this.sRoomTransferMRoomTransferNo = sRoomTransferMRoomTransferNo;
    }

    @Basic
    @Column(name = "s_room_transfer_m_handbill_no", nullable = true, length = 20)
    public String getsRoomTransferMHandbillNo() {
        return sRoomTransferMHandbillNo;
    }

    public void setsRoomTransferMHandbillNo(String sRoomTransferMHandbillNo) {
        this.sRoomTransferMHandbillNo = sRoomTransferMHandbillNo;
    }

    @Basic
    @Column(name = "s_room_transfer_m_transfer_date", nullable = true)
    public Timestamp getsRoomTransferMTransferDate() {
        return sRoomTransferMTransferDate;
    }

    public void setsRoomTransferMTransferDate(Timestamp sRoomTransferMTransferDate) {
        this.sRoomTransferMTransferDate = sRoomTransferMTransferDate;
    }

    @Basic
    @Column(name = "s_room_transfer_m_warehouse_keeper", nullable = true, length = 8)
    public String getsRoomTransferMWarehouseKeeper() {
        return sRoomTransferMWarehouseKeeper;
    }

    public void setsRoomTransferMWarehouseKeeper(String sRoomTransferMWarehouseKeeper) {
        this.sRoomTransferMWarehouseKeeper = sRoomTransferMWarehouseKeeper;
    }

    @Basic
    @Column(name = "s_room_transfer_m_HandlerName", nullable = true, length = 20)
    public String getsRoomTransferMHandlerName() {
        return sRoomTransferMHandlerName;
    }

    public void setsRoomTransferMHandlerName(String sRoomTransferMHandlerName) {
        this.sRoomTransferMHandlerName = sRoomTransferMHandlerName;
    }

    @Basic
    @Column(name = "s_room_transfer_m_service_attribute", nullable = true, length = 4)
    public String getsRoomTransferMServiceAttribute() {
        return sRoomTransferMServiceAttribute;
    }

    public void setsRoomTransferMServiceAttribute(String sRoomTransferMServiceAttribute) {
        this.sRoomTransferMServiceAttribute = sRoomTransferMServiceAttribute;
    }

    @Basic
    @Column(name = "s_room_transfer_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getsRoomTransferMSumMoney() {
        return sRoomTransferMSumMoney;
    }

    public void setsRoomTransferMSumMoney(BigDecimal sRoomTransferMSumMoney) {
        this.sRoomTransferMSumMoney = sRoomTransferMSumMoney;
    }

    @Basic
    @Column(name = "s_room_transfer_m_branch_no", nullable = true, length = 20)
    public String getsRoomTransferMBranchNo() {
        return sRoomTransferMBranchNo;
    }

    public void setsRoomTransferMBranchNo(String sRoomTransferMBranchNo) {
        this.sRoomTransferMBranchNo = sRoomTransferMBranchNo;
    }

    @Basic
    @Column(name = "s_room_transfer_m_creater_no", nullable = true, length = 8)
    public String getsRoomTransferMCreaterNo() {
        return sRoomTransferMCreaterNo;
    }

    public void setsRoomTransferMCreaterNo(String sRoomTransferMCreaterNo) {
        this.sRoomTransferMCreaterNo = sRoomTransferMCreaterNo;
    }

    @Basic
    @Column(name = "s_room_transfer_m_create_date", nullable = true)
    public Timestamp getsRoomTransferMCreateDate() {
        return sRoomTransferMCreateDate;
    }

    public void setsRoomTransferMCreateDate(Timestamp sRoomTransferMCreateDate) {
        this.sRoomTransferMCreateDate = sRoomTransferMCreateDate;
    }

    @Basic
    @Column(name = "s_room_transfer_m_modifi_no", nullable = true, length = 8)
    public String getsRoomTransferMModifiNo() {
        return sRoomTransferMModifiNo;
    }

    public void setsRoomTransferMModifiNo(String sRoomTransferMModifiNo) {
        this.sRoomTransferMModifiNo = sRoomTransferMModifiNo;
    }

    @Basic
    @Column(name = "s_room_transfer_m_modifi_time", nullable = true)
    public Timestamp getsRoomTransferMModifiTime() {
        return sRoomTransferMModifiTime;
    }

    public void setsRoomTransferMModifiTime(Timestamp sRoomTransferMModifiTime) {
        this.sRoomTransferMModifiTime = sRoomTransferMModifiTime;
    }

    @Basic
    @Column(name = "s_room_transfer_m_checker", nullable = true, length = 8)
    public String getsRoomTransferMChecker() {
        return sRoomTransferMChecker;
    }

    public void setsRoomTransferMChecker(String sRoomTransferMChecker) {
        this.sRoomTransferMChecker = sRoomTransferMChecker;
    }

    @Basic
    @Column(name = "s_room_transfer_m_check_date", nullable = true)
    public Timestamp getsRoomTransferMCheckDate() {
        return sRoomTransferMCheckDate;
    }

    public void setsRoomTransferMCheckDate(Timestamp sRoomTransferMCheckDate) {
        this.sRoomTransferMCheckDate = sRoomTransferMCheckDate;
    }

    @Basic
    @Column(name = "s_room_transfer_m_group_node_id", nullable = false, length = 20)
    public String getsRoomTransferMGroupNodeId() {
        return sRoomTransferMGroupNodeId;
    }

    public void setsRoomTransferMGroupNodeId(String sRoomTransferMGroupNodeId) {
        this.sRoomTransferMGroupNodeId = sRoomTransferMGroupNodeId;
    }

    @Basic
    @Column(name = "s_room_transfer_m_prints", nullable = true)
    public Integer getsRoomTransferMPrints() {
        return sRoomTransferMPrints;
    }

    public void setsRoomTransferMPrints(Integer sRoomTransferMPrints) {
        this.sRoomTransferMPrints = sRoomTransferMPrints;
    }

    @Basic
    @Column(name = "s_room_transfer_m_notes", nullable = true, length = 200)
    public String getsRoomTransferMNotes() {
        return sRoomTransferMNotes;
    }

    public void setsRoomTransferMNotes(String sRoomTransferMNotes) {
        this.sRoomTransferMNotes = sRoomTransferMNotes;
    }

    @Basic
    @Column(name = "s_room_transfer_m_state", nullable = true, length = 1)
    public String getsRoomTransferMState() {
        return sRoomTransferMState;
    }

    public void setsRoomTransferMState(String sRoomTransferMState) {
        this.sRoomTransferMState = sRoomTransferMState;
    }

    @Basic
    @Column(name = "s_room_transfer_m_isPass", nullable = true, length = 1)
    public String getsRoomTransferMIsPass() {
        return sRoomTransferMIsPass;
    }

    public void setsRoomTransferMIsPass(String sRoomTransferMIsPass) {
        this.sRoomTransferMIsPass = sRoomTransferMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SRoomTransferMEntity that = (SRoomTransferMEntity) o;

        if (sRoomTransferMRoomTransferNo != null ? !sRoomTransferMRoomTransferNo.equals(that.sRoomTransferMRoomTransferNo) : that.sRoomTransferMRoomTransferNo != null)
            return false;
        if (sRoomTransferMHandbillNo != null ? !sRoomTransferMHandbillNo.equals(that.sRoomTransferMHandbillNo) : that.sRoomTransferMHandbillNo != null)
            return false;
        if (sRoomTransferMTransferDate != null ? !sRoomTransferMTransferDate.equals(that.sRoomTransferMTransferDate) : that.sRoomTransferMTransferDate != null)
            return false;
        if (sRoomTransferMWarehouseKeeper != null ? !sRoomTransferMWarehouseKeeper.equals(that.sRoomTransferMWarehouseKeeper) : that.sRoomTransferMWarehouseKeeper != null)
            return false;
        if (sRoomTransferMHandlerName != null ? !sRoomTransferMHandlerName.equals(that.sRoomTransferMHandlerName) : that.sRoomTransferMHandlerName != null)
            return false;
        if (sRoomTransferMServiceAttribute != null ? !sRoomTransferMServiceAttribute.equals(that.sRoomTransferMServiceAttribute) : that.sRoomTransferMServiceAttribute != null)
            return false;
        if (sRoomTransferMSumMoney != null ? !sRoomTransferMSumMoney.equals(that.sRoomTransferMSumMoney) : that.sRoomTransferMSumMoney != null)
            return false;
        if (sRoomTransferMBranchNo != null ? !sRoomTransferMBranchNo.equals(that.sRoomTransferMBranchNo) : that.sRoomTransferMBranchNo != null)
            return false;
        if (sRoomTransferMCreaterNo != null ? !sRoomTransferMCreaterNo.equals(that.sRoomTransferMCreaterNo) : that.sRoomTransferMCreaterNo != null)
            return false;
        if (sRoomTransferMCreateDate != null ? !sRoomTransferMCreateDate.equals(that.sRoomTransferMCreateDate) : that.sRoomTransferMCreateDate != null)
            return false;
        if (sRoomTransferMModifiNo != null ? !sRoomTransferMModifiNo.equals(that.sRoomTransferMModifiNo) : that.sRoomTransferMModifiNo != null)
            return false;
        if (sRoomTransferMModifiTime != null ? !sRoomTransferMModifiTime.equals(that.sRoomTransferMModifiTime) : that.sRoomTransferMModifiTime != null)
            return false;
        if (sRoomTransferMChecker != null ? !sRoomTransferMChecker.equals(that.sRoomTransferMChecker) : that.sRoomTransferMChecker != null)
            return false;
        if (sRoomTransferMCheckDate != null ? !sRoomTransferMCheckDate.equals(that.sRoomTransferMCheckDate) : that.sRoomTransferMCheckDate != null)
            return false;
        if (sRoomTransferMGroupNodeId != null ? !sRoomTransferMGroupNodeId.equals(that.sRoomTransferMGroupNodeId) : that.sRoomTransferMGroupNodeId != null)
            return false;
        if (sRoomTransferMPrints != null ? !sRoomTransferMPrints.equals(that.sRoomTransferMPrints) : that.sRoomTransferMPrints != null)
            return false;
        if (sRoomTransferMNotes != null ? !sRoomTransferMNotes.equals(that.sRoomTransferMNotes) : that.sRoomTransferMNotes != null)
            return false;
        if (sRoomTransferMState != null ? !sRoomTransferMState.equals(that.sRoomTransferMState) : that.sRoomTransferMState != null)
            return false;
        if (sRoomTransferMIsPass != null ? !sRoomTransferMIsPass.equals(that.sRoomTransferMIsPass) : that.sRoomTransferMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sRoomTransferMRoomTransferNo != null ? sRoomTransferMRoomTransferNo.hashCode() : 0;
        result = 31 * result + (sRoomTransferMHandbillNo != null ? sRoomTransferMHandbillNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferMTransferDate != null ? sRoomTransferMTransferDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferMWarehouseKeeper != null ? sRoomTransferMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (sRoomTransferMHandlerName != null ? sRoomTransferMHandlerName.hashCode() : 0);
        result = 31 * result + (sRoomTransferMServiceAttribute != null ? sRoomTransferMServiceAttribute.hashCode() : 0);
        result = 31 * result + (sRoomTransferMSumMoney != null ? sRoomTransferMSumMoney.hashCode() : 0);
        result = 31 * result + (sRoomTransferMBranchNo != null ? sRoomTransferMBranchNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferMCreaterNo != null ? sRoomTransferMCreaterNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferMCreateDate != null ? sRoomTransferMCreateDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferMModifiNo != null ? sRoomTransferMModifiNo.hashCode() : 0);
        result = 31 * result + (sRoomTransferMModifiTime != null ? sRoomTransferMModifiTime.hashCode() : 0);
        result = 31 * result + (sRoomTransferMChecker != null ? sRoomTransferMChecker.hashCode() : 0);
        result = 31 * result + (sRoomTransferMCheckDate != null ? sRoomTransferMCheckDate.hashCode() : 0);
        result = 31 * result + (sRoomTransferMGroupNodeId != null ? sRoomTransferMGroupNodeId.hashCode() : 0);
        result = 31 * result + (sRoomTransferMPrints != null ? sRoomTransferMPrints.hashCode() : 0);
        result = 31 * result + (sRoomTransferMNotes != null ? sRoomTransferMNotes.hashCode() : 0);
        result = 31 * result + (sRoomTransferMState != null ? sRoomTransferMState.hashCode() : 0);
        result = 31 * result + (sRoomTransferMIsPass != null ? sRoomTransferMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferMWarehouseKeeper() {
        return tStaffBySRoomTransferMWarehouseKeeper;
    }

    public void settStaffBySRoomTransferMWarehouseKeeper(TStaffEntity tStaffBySRoomTransferMWarehouseKeeper) {
        this.tStaffBySRoomTransferMWarehouseKeeper = tStaffBySRoomTransferMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferMWarehouseKeeper_0() {
        return tStaffBySRoomTransferMWarehouseKeeper_0;
    }

    public void settStaffBySRoomTransferMWarehouseKeeper_0(TStaffEntity tStaffBySRoomTransferMWarehouseKeeper_0) {
        this.tStaffBySRoomTransferMWarehouseKeeper_0 = tStaffBySRoomTransferMWarehouseKeeper_0;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferMCreaterNo() {
        return tStaffBySRoomTransferMCreaterNo;
    }

    public void settStaffBySRoomTransferMCreaterNo(TStaffEntity tStaffBySRoomTransferMCreaterNo) {
        this.tStaffBySRoomTransferMCreaterNo = tStaffBySRoomTransferMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferMModifiNo() {
        return tStaffBySRoomTransferMModifiNo;
    }

    public void settStaffBySRoomTransferMModifiNo(TStaffEntity tStaffBySRoomTransferMModifiNo) {
        this.tStaffBySRoomTransferMModifiNo = tStaffBySRoomTransferMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySRoomTransferMChecker() {
        return tStaffBySRoomTransferMChecker;
    }

    public void settStaffBySRoomTransferMChecker(TStaffEntity tStaffBySRoomTransferMChecker) {
        this.tStaffBySRoomTransferMChecker = tStaffBySRoomTransferMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_room_transfer_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySRoomTransferMGroupNodeId() {
        return tOrgBySRoomTransferMGroupNodeId;
    }

    public void settOrgBySRoomTransferMGroupNodeId(TOrgEntity tOrgBySRoomTransferMGroupNodeId) {
        this.tOrgBySRoomTransferMGroupNodeId = tOrgBySRoomTransferMGroupNodeId;
    }

    @OneToMany(mappedBy = "sRoomTransferMBySRoomTransferSRoomTransferNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSBySRoomTransferMRoomTransferNo() {
        return sRoomTransferSBySRoomTransferMRoomTransferNo;
    }

    public void setsRoomTransferSBySRoomTransferMRoomTransferNo(Collection<SRoomTransferSEntity> sRoomTransferSBySRoomTransferMRoomTransferNo) {
        this.sRoomTransferSBySRoomTransferMRoomTransferNo = sRoomTransferSBySRoomTransferMRoomTransferNo;
    }
}
