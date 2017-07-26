package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_procure_m", schema = "dbo", catalog = "logistics_test")
public class BProcureMEntity {
    private String bProcureMProcureNo;
    private String bProcureMOrdProcureNo;
    private String bProcureMHandbillNo;
    private String bProcureMWarehouseKep;
    private String bProcureMCreateNo;
    private Timestamp bProcureMCreateDate;
    private String bProcureMModifiNo;
    private Timestamp bProcureMModifiTime;
    private String bProcureMChecker;
    private Timestamp bProcureMCheckDate;
    private String bProcureMState;
    private String bProcureMNotes;
    private Integer bProcureMPrints;
    private String bProcureMGroupNodeId;
    private String bProcureMIsPass;
    private Collection<BInPresentMEntity> bInPresentMSByBProcureMProcureNo;
    private BPurchaseOrdMEntity bPurchaseOrdMByBProcureMOrdProcureNo;
    private BPurchaseOrdMEntity bPurchaseOrdMByBProcureMOrdProcureNo_0;
    private TStaffEntity tStaffByBProcureMWarehouseKep;
    private TStaffEntity tStaffByBProcureMCreateNo;
    private TStaffEntity tStaffByBProcureMModifiNo;
    private TStaffEntity tStaffByBProcureMChecker;
    private TOrgEntity tOrgByBProcureMGroupNodeId;

    @Id
    @Column(name = "b_procure_m_procure_no", nullable = false, length = 16)
    public String getbProcureMProcureNo() {
        return bProcureMProcureNo;
    }

    public void setbProcureMProcureNo(String bProcureMProcureNo) {
        this.bProcureMProcureNo = bProcureMProcureNo;
    }

    @Basic
    @Column(name = "b_procure_m_ord_procure_no", nullable = true, length = 16)
    public String getbProcureMOrdProcureNo() {
        return bProcureMOrdProcureNo;
    }

    public void setbProcureMOrdProcureNo(String bProcureMOrdProcureNo) {
        this.bProcureMOrdProcureNo = bProcureMOrdProcureNo;
    }

    @Basic
    @Column(name = "b_procure_m_handbill_no", nullable = true, length = 20)
    public String getbProcureMHandbillNo() {
        return bProcureMHandbillNo;
    }

    public void setbProcureMHandbillNo(String bProcureMHandbillNo) {
        this.bProcureMHandbillNo = bProcureMHandbillNo;
    }

    @Basic
    @Column(name = "b_procure_m_warehouse_kep", nullable = true, length = 8)
    public String getbProcureMWarehouseKep() {
        return bProcureMWarehouseKep;
    }

    public void setbProcureMWarehouseKep(String bProcureMWarehouseKep) {
        this.bProcureMWarehouseKep = bProcureMWarehouseKep;
    }

    @Basic
    @Column(name = "b_procure_m_create_no", nullable = true, length = 8)
    public String getbProcureMCreateNo() {
        return bProcureMCreateNo;
    }

    public void setbProcureMCreateNo(String bProcureMCreateNo) {
        this.bProcureMCreateNo = bProcureMCreateNo;
    }

    @Basic
    @Column(name = "b_procure_m_create_date", nullable = true)
    public Timestamp getbProcureMCreateDate() {
        return bProcureMCreateDate;
    }

    public void setbProcureMCreateDate(Timestamp bProcureMCreateDate) {
        this.bProcureMCreateDate = bProcureMCreateDate;
    }

    @Basic
    @Column(name = "b_procure_m_modifi_no", nullable = true, length = 8)
    public String getbProcureMModifiNo() {
        return bProcureMModifiNo;
    }

    public void setbProcureMModifiNo(String bProcureMModifiNo) {
        this.bProcureMModifiNo = bProcureMModifiNo;
    }

    @Basic
    @Column(name = "b_procure_m_modifi_time", nullable = true)
    public Timestamp getbProcureMModifiTime() {
        return bProcureMModifiTime;
    }

    public void setbProcureMModifiTime(Timestamp bProcureMModifiTime) {
        this.bProcureMModifiTime = bProcureMModifiTime;
    }

    @Basic
    @Column(name = "b_procure_m_checker", nullable = true, length = 8)
    public String getbProcureMChecker() {
        return bProcureMChecker;
    }

    public void setbProcureMChecker(String bProcureMChecker) {
        this.bProcureMChecker = bProcureMChecker;
    }

    @Basic
    @Column(name = "b_procure_m_check_date", nullable = true)
    public Timestamp getbProcureMCheckDate() {
        return bProcureMCheckDate;
    }

    public void setbProcureMCheckDate(Timestamp bProcureMCheckDate) {
        this.bProcureMCheckDate = bProcureMCheckDate;
    }

    @Basic
    @Column(name = "b_procure_m_state", nullable = true, length = 1)
    public String getbProcureMState() {
        return bProcureMState;
    }

    public void setbProcureMState(String bProcureMState) {
        this.bProcureMState = bProcureMState;
    }

    @Basic
    @Column(name = "b_procure_m_notes", nullable = true, length = 200)
    public String getbProcureMNotes() {
        return bProcureMNotes;
    }

    public void setbProcureMNotes(String bProcureMNotes) {
        this.bProcureMNotes = bProcureMNotes;
    }

    @Basic
    @Column(name = "b_procure_m_prints", nullable = true)
    public Integer getbProcureMPrints() {
        return bProcureMPrints;
    }

    public void setbProcureMPrints(Integer bProcureMPrints) {
        this.bProcureMPrints = bProcureMPrints;
    }

    @Basic
    @Column(name = "b_procure_m_group_node_id", nullable = true, length = 20)
    public String getbProcureMGroupNodeId() {
        return bProcureMGroupNodeId;
    }

    public void setbProcureMGroupNodeId(String bProcureMGroupNodeId) {
        this.bProcureMGroupNodeId = bProcureMGroupNodeId;
    }

    @Basic
    @Column(name = "b_procure_m_isPass", nullable = true, length = 1)
    public String getbProcureMIsPass() {
        return bProcureMIsPass;
    }

    public void setbProcureMIsPass(String bProcureMIsPass) {
        this.bProcureMIsPass = bProcureMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BProcureMEntity that = (BProcureMEntity) o;

        if (bProcureMProcureNo != null ? !bProcureMProcureNo.equals(that.bProcureMProcureNo) : that.bProcureMProcureNo != null)
            return false;
        if (bProcureMOrdProcureNo != null ? !bProcureMOrdProcureNo.equals(that.bProcureMOrdProcureNo) : that.bProcureMOrdProcureNo != null)
            return false;
        if (bProcureMHandbillNo != null ? !bProcureMHandbillNo.equals(that.bProcureMHandbillNo) : that.bProcureMHandbillNo != null)
            return false;
        if (bProcureMWarehouseKep != null ? !bProcureMWarehouseKep.equals(that.bProcureMWarehouseKep) : that.bProcureMWarehouseKep != null)
            return false;
        if (bProcureMCreateNo != null ? !bProcureMCreateNo.equals(that.bProcureMCreateNo) : that.bProcureMCreateNo != null)
            return false;
        if (bProcureMCreateDate != null ? !bProcureMCreateDate.equals(that.bProcureMCreateDate) : that.bProcureMCreateDate != null)
            return false;
        if (bProcureMModifiNo != null ? !bProcureMModifiNo.equals(that.bProcureMModifiNo) : that.bProcureMModifiNo != null)
            return false;
        if (bProcureMModifiTime != null ? !bProcureMModifiTime.equals(that.bProcureMModifiTime) : that.bProcureMModifiTime != null)
            return false;
        if (bProcureMChecker != null ? !bProcureMChecker.equals(that.bProcureMChecker) : that.bProcureMChecker != null)
            return false;
        if (bProcureMCheckDate != null ? !bProcureMCheckDate.equals(that.bProcureMCheckDate) : that.bProcureMCheckDate != null)
            return false;
        if (bProcureMState != null ? !bProcureMState.equals(that.bProcureMState) : that.bProcureMState != null)
            return false;
        if (bProcureMNotes != null ? !bProcureMNotes.equals(that.bProcureMNotes) : that.bProcureMNotes != null)
            return false;
        if (bProcureMPrints != null ? !bProcureMPrints.equals(that.bProcureMPrints) : that.bProcureMPrints != null)
            return false;
        if (bProcureMGroupNodeId != null ? !bProcureMGroupNodeId.equals(that.bProcureMGroupNodeId) : that.bProcureMGroupNodeId != null)
            return false;
        if (bProcureMIsPass != null ? !bProcureMIsPass.equals(that.bProcureMIsPass) : that.bProcureMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bProcureMProcureNo != null ? bProcureMProcureNo.hashCode() : 0;
        result = 31 * result + (bProcureMOrdProcureNo != null ? bProcureMOrdProcureNo.hashCode() : 0);
        result = 31 * result + (bProcureMHandbillNo != null ? bProcureMHandbillNo.hashCode() : 0);
        result = 31 * result + (bProcureMWarehouseKep != null ? bProcureMWarehouseKep.hashCode() : 0);
        result = 31 * result + (bProcureMCreateNo != null ? bProcureMCreateNo.hashCode() : 0);
        result = 31 * result + (bProcureMCreateDate != null ? bProcureMCreateDate.hashCode() : 0);
        result = 31 * result + (bProcureMModifiNo != null ? bProcureMModifiNo.hashCode() : 0);
        result = 31 * result + (bProcureMModifiTime != null ? bProcureMModifiTime.hashCode() : 0);
        result = 31 * result + (bProcureMChecker != null ? bProcureMChecker.hashCode() : 0);
        result = 31 * result + (bProcureMCheckDate != null ? bProcureMCheckDate.hashCode() : 0);
        result = 31 * result + (bProcureMState != null ? bProcureMState.hashCode() : 0);
        result = 31 * result + (bProcureMNotes != null ? bProcureMNotes.hashCode() : 0);
        result = 31 * result + (bProcureMPrints != null ? bProcureMPrints.hashCode() : 0);
        result = 31 * result + (bProcureMGroupNodeId != null ? bProcureMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bProcureMIsPass != null ? bProcureMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bProcureMByBInPresentMProcureNo")
    public Collection<BInPresentMEntity> getbInPresentMSByBProcureMProcureNo() {
        return bInPresentMSByBProcureMProcureNo;
    }

    public void setbInPresentMSByBProcureMProcureNo(Collection<BInPresentMEntity> bInPresentMSByBProcureMProcureNo) {
        this.bInPresentMSByBProcureMProcureNo = bInPresentMSByBProcureMProcureNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_ord_procure_no", referencedColumnName = "b_purchase_ord_m_ord_procure_no")
    public BPurchaseOrdMEntity getbPurchaseOrdMByBProcureMOrdProcureNo() {
        return bPurchaseOrdMByBProcureMOrdProcureNo;
    }

    public void setbPurchaseOrdMByBProcureMOrdProcureNo(BPurchaseOrdMEntity bPurchaseOrdMByBProcureMOrdProcureNo) {
        this.bPurchaseOrdMByBProcureMOrdProcureNo = bPurchaseOrdMByBProcureMOrdProcureNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_ord_procure_no", referencedColumnName = "b_purchase_ord_m_ord_procure_no")
    public BPurchaseOrdMEntity getbPurchaseOrdMByBProcureMOrdProcureNo_0() {
        return bPurchaseOrdMByBProcureMOrdProcureNo_0;
    }

    public void setbPurchaseOrdMByBProcureMOrdProcureNo_0(BPurchaseOrdMEntity bPurchaseOrdMByBProcureMOrdProcureNo_0) {
        this.bPurchaseOrdMByBProcureMOrdProcureNo_0 = bPurchaseOrdMByBProcureMOrdProcureNo_0;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_warehouse_kep", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBProcureMWarehouseKep() {
        return tStaffByBProcureMWarehouseKep;
    }

    public void settStaffByBProcureMWarehouseKep(TStaffEntity tStaffByBProcureMWarehouseKep) {
        this.tStaffByBProcureMWarehouseKep = tStaffByBProcureMWarehouseKep;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBProcureMCreateNo() {
        return tStaffByBProcureMCreateNo;
    }

    public void settStaffByBProcureMCreateNo(TStaffEntity tStaffByBProcureMCreateNo) {
        this.tStaffByBProcureMCreateNo = tStaffByBProcureMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBProcureMModifiNo() {
        return tStaffByBProcureMModifiNo;
    }

    public void settStaffByBProcureMModifiNo(TStaffEntity tStaffByBProcureMModifiNo) {
        this.tStaffByBProcureMModifiNo = tStaffByBProcureMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBProcureMChecker() {
        return tStaffByBProcureMChecker;
    }

    public void settStaffByBProcureMChecker(TStaffEntity tStaffByBProcureMChecker) {
        this.tStaffByBProcureMChecker = tStaffByBProcureMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_procure_m_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByBProcureMGroupNodeId() {
        return tOrgByBProcureMGroupNodeId;
    }

    public void settOrgByBProcureMGroupNodeId(TOrgEntity tOrgByBProcureMGroupNodeId) {
        this.tOrgByBProcureMGroupNodeId = tOrgByBProcureMGroupNodeId;
    }
}
