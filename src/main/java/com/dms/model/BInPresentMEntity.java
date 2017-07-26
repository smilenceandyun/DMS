package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_in_present_m", schema = "dbo", catalog = "logistics_test")
public class BInPresentMEntity {
    private String bInPresentMInPresentNo;
    private String bInPresentMProcureNo;
    private String bInPresentMHandbillNo;
    private String bInPresentMDeliveryDate;
    private String bInPresentMSalesman;
    private String bInPresentMServiceAttribute;
    private String bInPresentMWarehouseKeeper;
    private String bInPresentMCreaterNo;
    private Timestamp bInPresentMCreateDate;
    private String bInPresentMModifiNo;
    private Timestamp bInPresentMModifiTime;
    private String bInPresentMChecker;
    private Timestamp bInPresentMCheckDate;
    private String bInPresentMGroupNodeId;
    private String bInPresentMRemark;
    private String bInPresentMState;
    private Integer bInPresentMPrints;
    private String bInPresentMIsPass;
    private BProcureMEntity bProcureMByBInPresentMProcureNo;
    private TStaffEntity tStaffByBInPresentMWarehouseKeeper;
    private TStaffEntity tStaffByBInPresentMCreaterNo;
    private TStaffEntity tStaffByBInPresentMModifiNo;
    private TStaffEntity tStaffByBInPresentMChecker;
    private TOrgEntity tOrgByBInPresentMGroupNodeId;
    private Collection<BInPresentSEntity> bInPresentSByBInPresentMInPresentNo;

    @Id
    @Column(name = "b_in_present_m_in_present_no", nullable = false, length = 16)
    public String getbInPresentMInPresentNo() {
        return bInPresentMInPresentNo;
    }

    public void setbInPresentMInPresentNo(String bInPresentMInPresentNo) {
        this.bInPresentMInPresentNo = bInPresentMInPresentNo;
    }

    @Basic
    @Column(name = "b_in_present_m_procure_no", nullable = false, length = 16)
    public String getbInPresentMProcureNo() {
        return bInPresentMProcureNo;
    }

    public void setbInPresentMProcureNo(String bInPresentMProcureNo) {
        this.bInPresentMProcureNo = bInPresentMProcureNo;
    }

    @Basic
    @Column(name = "b_in_present_m_handbill_no", nullable = true, length = 20)
    public String getbInPresentMHandbillNo() {
        return bInPresentMHandbillNo;
    }

    public void setbInPresentMHandbillNo(String bInPresentMHandbillNo) {
        this.bInPresentMHandbillNo = bInPresentMHandbillNo;
    }

    @Basic
    @Column(name = "b_in_present_m_delivery_date", nullable = true, length = 12)
    public String getbInPresentMDeliveryDate() {
        return bInPresentMDeliveryDate;
    }

    public void setbInPresentMDeliveryDate(String bInPresentMDeliveryDate) {
        this.bInPresentMDeliveryDate = bInPresentMDeliveryDate;
    }

    @Basic
    @Column(name = "b_in_present_m_salesman", nullable = true, length = 8)
    public String getbInPresentMSalesman() {
        return bInPresentMSalesman;
    }

    public void setbInPresentMSalesman(String bInPresentMSalesman) {
        this.bInPresentMSalesman = bInPresentMSalesman;
    }

    @Basic
    @Column(name = "b_in_present_m_service_attribute", nullable = true, length = 4)
    public String getbInPresentMServiceAttribute() {
        return bInPresentMServiceAttribute;
    }

    public void setbInPresentMServiceAttribute(String bInPresentMServiceAttribute) {
        this.bInPresentMServiceAttribute = bInPresentMServiceAttribute;
    }

    @Basic
    @Column(name = "b_in_present_m_warehouse_keeper", nullable = true, length = 8)
    public String getbInPresentMWarehouseKeeper() {
        return bInPresentMWarehouseKeeper;
    }

    public void setbInPresentMWarehouseKeeper(String bInPresentMWarehouseKeeper) {
        this.bInPresentMWarehouseKeeper = bInPresentMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_in_present_m_creater_no", nullable = true, length = 8)
    public String getbInPresentMCreaterNo() {
        return bInPresentMCreaterNo;
    }

    public void setbInPresentMCreaterNo(String bInPresentMCreaterNo) {
        this.bInPresentMCreaterNo = bInPresentMCreaterNo;
    }

    @Basic
    @Column(name = "b_in_present_m_create_date", nullable = true)
    public Timestamp getbInPresentMCreateDate() {
        return bInPresentMCreateDate;
    }

    public void setbInPresentMCreateDate(Timestamp bInPresentMCreateDate) {
        this.bInPresentMCreateDate = bInPresentMCreateDate;
    }

    @Basic
    @Column(name = "b_in_present_m_modifi_no", nullable = true, length = 8)
    public String getbInPresentMModifiNo() {
        return bInPresentMModifiNo;
    }

    public void setbInPresentMModifiNo(String bInPresentMModifiNo) {
        this.bInPresentMModifiNo = bInPresentMModifiNo;
    }

    @Basic
    @Column(name = "b_in_present_m_modifi_time", nullable = true)
    public Timestamp getbInPresentMModifiTime() {
        return bInPresentMModifiTime;
    }

    public void setbInPresentMModifiTime(Timestamp bInPresentMModifiTime) {
        this.bInPresentMModifiTime = bInPresentMModifiTime;
    }

    @Basic
    @Column(name = "b_in_present_m_checker", nullable = true, length = 8)
    public String getbInPresentMChecker() {
        return bInPresentMChecker;
    }

    public void setbInPresentMChecker(String bInPresentMChecker) {
        this.bInPresentMChecker = bInPresentMChecker;
    }

    @Basic
    @Column(name = "b_in_present_m_check_date", nullable = true)
    public Timestamp getbInPresentMCheckDate() {
        return bInPresentMCheckDate;
    }

    public void setbInPresentMCheckDate(Timestamp bInPresentMCheckDate) {
        this.bInPresentMCheckDate = bInPresentMCheckDate;
    }

    @Basic
    @Column(name = "b_in_present_m_group_node_id", nullable = false, length = 20)
    public String getbInPresentMGroupNodeId() {
        return bInPresentMGroupNodeId;
    }

    public void setbInPresentMGroupNodeId(String bInPresentMGroupNodeId) {
        this.bInPresentMGroupNodeId = bInPresentMGroupNodeId;
    }

    @Basic
    @Column(name = "b_in_present_m_remark", nullable = true, length = 200)
    public String getbInPresentMRemark() {
        return bInPresentMRemark;
    }

    public void setbInPresentMRemark(String bInPresentMRemark) {
        this.bInPresentMRemark = bInPresentMRemark;
    }

    @Basic
    @Column(name = "b_in_present_m_state", nullable = true, length = 1)
    public String getbInPresentMState() {
        return bInPresentMState;
    }

    public void setbInPresentMState(String bInPresentMState) {
        this.bInPresentMState = bInPresentMState;
    }

    @Basic
    @Column(name = "b_in_present_m_prints", nullable = true)
    public Integer getbInPresentMPrints() {
        return bInPresentMPrints;
    }

    public void setbInPresentMPrints(Integer bInPresentMPrints) {
        this.bInPresentMPrints = bInPresentMPrints;
    }

    @Basic
    @Column(name = "b_in_present_m_isPass", nullable = true, length = 1)
    public String getbInPresentMIsPass() {
        return bInPresentMIsPass;
    }

    public void setbInPresentMIsPass(String bInPresentMIsPass) {
        this.bInPresentMIsPass = bInPresentMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInPresentMEntity that = (BInPresentMEntity) o;

        if (bInPresentMInPresentNo != null ? !bInPresentMInPresentNo.equals(that.bInPresentMInPresentNo) : that.bInPresentMInPresentNo != null)
            return false;
        if (bInPresentMProcureNo != null ? !bInPresentMProcureNo.equals(that.bInPresentMProcureNo) : that.bInPresentMProcureNo != null)
            return false;
        if (bInPresentMHandbillNo != null ? !bInPresentMHandbillNo.equals(that.bInPresentMHandbillNo) : that.bInPresentMHandbillNo != null)
            return false;
        if (bInPresentMDeliveryDate != null ? !bInPresentMDeliveryDate.equals(that.bInPresentMDeliveryDate) : that.bInPresentMDeliveryDate != null)
            return false;
        if (bInPresentMSalesman != null ? !bInPresentMSalesman.equals(that.bInPresentMSalesman) : that.bInPresentMSalesman != null)
            return false;
        if (bInPresentMServiceAttribute != null ? !bInPresentMServiceAttribute.equals(that.bInPresentMServiceAttribute) : that.bInPresentMServiceAttribute != null)
            return false;
        if (bInPresentMWarehouseKeeper != null ? !bInPresentMWarehouseKeeper.equals(that.bInPresentMWarehouseKeeper) : that.bInPresentMWarehouseKeeper != null)
            return false;
        if (bInPresentMCreaterNo != null ? !bInPresentMCreaterNo.equals(that.bInPresentMCreaterNo) : that.bInPresentMCreaterNo != null)
            return false;
        if (bInPresentMCreateDate != null ? !bInPresentMCreateDate.equals(that.bInPresentMCreateDate) : that.bInPresentMCreateDate != null)
            return false;
        if (bInPresentMModifiNo != null ? !bInPresentMModifiNo.equals(that.bInPresentMModifiNo) : that.bInPresentMModifiNo != null)
            return false;
        if (bInPresentMModifiTime != null ? !bInPresentMModifiTime.equals(that.bInPresentMModifiTime) : that.bInPresentMModifiTime != null)
            return false;
        if (bInPresentMChecker != null ? !bInPresentMChecker.equals(that.bInPresentMChecker) : that.bInPresentMChecker != null)
            return false;
        if (bInPresentMCheckDate != null ? !bInPresentMCheckDate.equals(that.bInPresentMCheckDate) : that.bInPresentMCheckDate != null)
            return false;
        if (bInPresentMGroupNodeId != null ? !bInPresentMGroupNodeId.equals(that.bInPresentMGroupNodeId) : that.bInPresentMGroupNodeId != null)
            return false;
        if (bInPresentMRemark != null ? !bInPresentMRemark.equals(that.bInPresentMRemark) : that.bInPresentMRemark != null)
            return false;
        if (bInPresentMState != null ? !bInPresentMState.equals(that.bInPresentMState) : that.bInPresentMState != null)
            return false;
        if (bInPresentMPrints != null ? !bInPresentMPrints.equals(that.bInPresentMPrints) : that.bInPresentMPrints != null)
            return false;
        if (bInPresentMIsPass != null ? !bInPresentMIsPass.equals(that.bInPresentMIsPass) : that.bInPresentMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInPresentMInPresentNo != null ? bInPresentMInPresentNo.hashCode() : 0;
        result = 31 * result + (bInPresentMProcureNo != null ? bInPresentMProcureNo.hashCode() : 0);
        result = 31 * result + (bInPresentMHandbillNo != null ? bInPresentMHandbillNo.hashCode() : 0);
        result = 31 * result + (bInPresentMDeliveryDate != null ? bInPresentMDeliveryDate.hashCode() : 0);
        result = 31 * result + (bInPresentMSalesman != null ? bInPresentMSalesman.hashCode() : 0);
        result = 31 * result + (bInPresentMServiceAttribute != null ? bInPresentMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bInPresentMWarehouseKeeper != null ? bInPresentMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bInPresentMCreaterNo != null ? bInPresentMCreaterNo.hashCode() : 0);
        result = 31 * result + (bInPresentMCreateDate != null ? bInPresentMCreateDate.hashCode() : 0);
        result = 31 * result + (bInPresentMModifiNo != null ? bInPresentMModifiNo.hashCode() : 0);
        result = 31 * result + (bInPresentMModifiTime != null ? bInPresentMModifiTime.hashCode() : 0);
        result = 31 * result + (bInPresentMChecker != null ? bInPresentMChecker.hashCode() : 0);
        result = 31 * result + (bInPresentMCheckDate != null ? bInPresentMCheckDate.hashCode() : 0);
        result = 31 * result + (bInPresentMGroupNodeId != null ? bInPresentMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bInPresentMRemark != null ? bInPresentMRemark.hashCode() : 0);
        result = 31 * result + (bInPresentMState != null ? bInPresentMState.hashCode() : 0);
        result = 31 * result + (bInPresentMPrints != null ? bInPresentMPrints.hashCode() : 0);
        result = 31 * result + (bInPresentMIsPass != null ? bInPresentMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_procure_no", referencedColumnName = "b_procure_m_procure_no", nullable = false)
    public BProcureMEntity getbProcureMByBInPresentMProcureNo() {
        return bProcureMByBInPresentMProcureNo;
    }

    public void setbProcureMByBInPresentMProcureNo(BProcureMEntity bProcureMByBInPresentMProcureNo) {
        this.bProcureMByBInPresentMProcureNo = bProcureMByBInPresentMProcureNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBInPresentMWarehouseKeeper() {
        return tStaffByBInPresentMWarehouseKeeper;
    }

    public void settStaffByBInPresentMWarehouseKeeper(TStaffEntity tStaffByBInPresentMWarehouseKeeper) {
        this.tStaffByBInPresentMWarehouseKeeper = tStaffByBInPresentMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBInPresentMCreaterNo() {
        return tStaffByBInPresentMCreaterNo;
    }

    public void settStaffByBInPresentMCreaterNo(TStaffEntity tStaffByBInPresentMCreaterNo) {
        this.tStaffByBInPresentMCreaterNo = tStaffByBInPresentMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBInPresentMModifiNo() {
        return tStaffByBInPresentMModifiNo;
    }

    public void settStaffByBInPresentMModifiNo(TStaffEntity tStaffByBInPresentMModifiNo) {
        this.tStaffByBInPresentMModifiNo = tStaffByBInPresentMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBInPresentMChecker() {
        return tStaffByBInPresentMChecker;
    }

    public void settStaffByBInPresentMChecker(TStaffEntity tStaffByBInPresentMChecker) {
        this.tStaffByBInPresentMChecker = tStaffByBInPresentMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBInPresentMGroupNodeId() {
        return tOrgByBInPresentMGroupNodeId;
    }

    public void settOrgByBInPresentMGroupNodeId(TOrgEntity tOrgByBInPresentMGroupNodeId) {
        this.tOrgByBInPresentMGroupNodeId = tOrgByBInPresentMGroupNodeId;
    }

    @OneToMany(mappedBy = "bInPresentMByBInPresentSInPresentNo")
    public Collection<BInPresentSEntity> getbInPresentSByBInPresentMInPresentNo() {
        return bInPresentSByBInPresentMInPresentNo;
    }

    public void setbInPresentSByBInPresentMInPresentNo(Collection<BInPresentSEntity> bInPresentSByBInPresentMInPresentNo) {
        this.bInPresentSByBInPresentMInPresentNo = bInPresentSByBInPresentMInPresentNo;
    }
}
