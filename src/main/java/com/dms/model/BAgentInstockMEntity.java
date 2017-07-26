package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_agent_instock_m", schema = "dbo", catalog = "logistics_test")
public class BAgentInstockMEntity {
    private String bAgentInstockMAgentInstockNo;
    private String bAgentInstockMOrdProcureNo;
    private String bAgentInstockMHandbillNo;
    private String bAgentInstockMDeliveryDate;
    private String bAgentInstockMSalesman;
    private String bAgentInstockMServiceAttribute;
    private BigDecimal bAgentInstockMSumMoney;
    private String bAgentInstockMWarehouseKeeper;
    private String bAgentInstockMCreaterNo;
    private Timestamp bAgentInstockMCreateDate;
    private String bAgentInstockMModifiNo;
    private Timestamp bAgentInstockMModifiTime;
    private String bAgentInstockMChecker;
    private Timestamp bAgentInstockMCheckDate;
    private String bAgentInstockMGroupNodeId;
    private String bAgentInstockMState;
    private String bAgentInstockMNotes;
    private Integer bAgentInstockMPrints;
    private String bAgentInstockMIsPass;
    private BPurchaseOrdMEntity bPurchaseOrdMByBAgentInstockMOrdProcureNo;
    private TStaffEntity tStaffByBAgentInstockMCreaterNo;
    private TStaffEntity tStaffByBAgentInstockMModifiNo;
    private TStaffEntity tStaffByBAgentInstockMChecker;
    private TOrgEntity tOrgByBAgentInstockMGroupNodeId;
    private Collection<BAgentInstockSEntity> bAgentInstockSByBAgentInstockMAgentInstockNo;

    @Id
    @Column(name = "b_agent_instock_m_agent_instock_no", nullable = false, length = 16)
    public String getbAgentInstockMAgentInstockNo() {
        return bAgentInstockMAgentInstockNo;
    }

    public void setbAgentInstockMAgentInstockNo(String bAgentInstockMAgentInstockNo) {
        this.bAgentInstockMAgentInstockNo = bAgentInstockMAgentInstockNo;
    }

    @Basic
    @Column(name = "b_agent_instock_m_ord_procure_no", nullable = true, length = 16)
    public String getbAgentInstockMOrdProcureNo() {
        return bAgentInstockMOrdProcureNo;
    }

    public void setbAgentInstockMOrdProcureNo(String bAgentInstockMOrdProcureNo) {
        this.bAgentInstockMOrdProcureNo = bAgentInstockMOrdProcureNo;
    }

    @Basic
    @Column(name = "b_agent_instock_m_handbill_no", nullable = true, length = 20)
    public String getbAgentInstockMHandbillNo() {
        return bAgentInstockMHandbillNo;
    }

    public void setbAgentInstockMHandbillNo(String bAgentInstockMHandbillNo) {
        this.bAgentInstockMHandbillNo = bAgentInstockMHandbillNo;
    }

    @Basic
    @Column(name = "b_agent_instock_m_delivery_date", nullable = true, length = 12)
    public String getbAgentInstockMDeliveryDate() {
        return bAgentInstockMDeliveryDate;
    }

    public void setbAgentInstockMDeliveryDate(String bAgentInstockMDeliveryDate) {
        this.bAgentInstockMDeliveryDate = bAgentInstockMDeliveryDate;
    }

    @Basic
    @Column(name = "b_agent_instock_m_salesman", nullable = true, length = 8)
    public String getbAgentInstockMSalesman() {
        return bAgentInstockMSalesman;
    }

    public void setbAgentInstockMSalesman(String bAgentInstockMSalesman) {
        this.bAgentInstockMSalesman = bAgentInstockMSalesman;
    }

    @Basic
    @Column(name = "b_agent_instock_m_service_attribute", nullable = true, length = 4)
    public String getbAgentInstockMServiceAttribute() {
        return bAgentInstockMServiceAttribute;
    }

    public void setbAgentInstockMServiceAttribute(String bAgentInstockMServiceAttribute) {
        this.bAgentInstockMServiceAttribute = bAgentInstockMServiceAttribute;
    }

    @Basic
    @Column(name = "b_agent_instock_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockMSumMoney() {
        return bAgentInstockMSumMoney;
    }

    public void setbAgentInstockMSumMoney(BigDecimal bAgentInstockMSumMoney) {
        this.bAgentInstockMSumMoney = bAgentInstockMSumMoney;
    }

    @Basic
    @Column(name = "b_agent_instock_m_warehouse_keeper", nullable = true, length = 8)
    public String getbAgentInstockMWarehouseKeeper() {
        return bAgentInstockMWarehouseKeeper;
    }

    public void setbAgentInstockMWarehouseKeeper(String bAgentInstockMWarehouseKeeper) {
        this.bAgentInstockMWarehouseKeeper = bAgentInstockMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_agent_instock_m_creater_no", nullable = true, length = 8)
    public String getbAgentInstockMCreaterNo() {
        return bAgentInstockMCreaterNo;
    }

    public void setbAgentInstockMCreaterNo(String bAgentInstockMCreaterNo) {
        this.bAgentInstockMCreaterNo = bAgentInstockMCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_instock_m_create_date", nullable = true)
    public Timestamp getbAgentInstockMCreateDate() {
        return bAgentInstockMCreateDate;
    }

    public void setbAgentInstockMCreateDate(Timestamp bAgentInstockMCreateDate) {
        this.bAgentInstockMCreateDate = bAgentInstockMCreateDate;
    }

    @Basic
    @Column(name = "b_agent_instock_m_modifi_no", nullable = true, length = 8)
    public String getbAgentInstockMModifiNo() {
        return bAgentInstockMModifiNo;
    }

    public void setbAgentInstockMModifiNo(String bAgentInstockMModifiNo) {
        this.bAgentInstockMModifiNo = bAgentInstockMModifiNo;
    }

    @Basic
    @Column(name = "b_agent_instock_m_modifi_time", nullable = true)
    public Timestamp getbAgentInstockMModifiTime() {
        return bAgentInstockMModifiTime;
    }

    public void setbAgentInstockMModifiTime(Timestamp bAgentInstockMModifiTime) {
        this.bAgentInstockMModifiTime = bAgentInstockMModifiTime;
    }

    @Basic
    @Column(name = "b_agent_instock_m_checker", nullable = true, length = 8)
    public String getbAgentInstockMChecker() {
        return bAgentInstockMChecker;
    }

    public void setbAgentInstockMChecker(String bAgentInstockMChecker) {
        this.bAgentInstockMChecker = bAgentInstockMChecker;
    }

    @Basic
    @Column(name = "b_agent_instock_m_check_date", nullable = true)
    public Timestamp getbAgentInstockMCheckDate() {
        return bAgentInstockMCheckDate;
    }

    public void setbAgentInstockMCheckDate(Timestamp bAgentInstockMCheckDate) {
        this.bAgentInstockMCheckDate = bAgentInstockMCheckDate;
    }

    @Basic
    @Column(name = "b_agent_instock_m_group_node_id", nullable = false, length = 20)
    public String getbAgentInstockMGroupNodeId() {
        return bAgentInstockMGroupNodeId;
    }

    public void setbAgentInstockMGroupNodeId(String bAgentInstockMGroupNodeId) {
        this.bAgentInstockMGroupNodeId = bAgentInstockMGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_instock_m_state", nullable = true, length = 1)
    public String getbAgentInstockMState() {
        return bAgentInstockMState;
    }

    public void setbAgentInstockMState(String bAgentInstockMState) {
        this.bAgentInstockMState = bAgentInstockMState;
    }

    @Basic
    @Column(name = "b_agent_instock_m_notes", nullable = true, length = 200)
    public String getbAgentInstockMNotes() {
        return bAgentInstockMNotes;
    }

    public void setbAgentInstockMNotes(String bAgentInstockMNotes) {
        this.bAgentInstockMNotes = bAgentInstockMNotes;
    }

    @Basic
    @Column(name = "b_agent_instock_m_prints", nullable = true)
    public Integer getbAgentInstockMPrints() {
        return bAgentInstockMPrints;
    }

    public void setbAgentInstockMPrints(Integer bAgentInstockMPrints) {
        this.bAgentInstockMPrints = bAgentInstockMPrints;
    }

    @Basic
    @Column(name = "b_agent_instock_m_isPass", nullable = true, length = 1)
    public String getbAgentInstockMIsPass() {
        return bAgentInstockMIsPass;
    }

    public void setbAgentInstockMIsPass(String bAgentInstockMIsPass) {
        this.bAgentInstockMIsPass = bAgentInstockMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentInstockMEntity that = (BAgentInstockMEntity) o;

        if (bAgentInstockMAgentInstockNo != null ? !bAgentInstockMAgentInstockNo.equals(that.bAgentInstockMAgentInstockNo) : that.bAgentInstockMAgentInstockNo != null)
            return false;
        if (bAgentInstockMOrdProcureNo != null ? !bAgentInstockMOrdProcureNo.equals(that.bAgentInstockMOrdProcureNo) : that.bAgentInstockMOrdProcureNo != null)
            return false;
        if (bAgentInstockMHandbillNo != null ? !bAgentInstockMHandbillNo.equals(that.bAgentInstockMHandbillNo) : that.bAgentInstockMHandbillNo != null)
            return false;
        if (bAgentInstockMDeliveryDate != null ? !bAgentInstockMDeliveryDate.equals(that.bAgentInstockMDeliveryDate) : that.bAgentInstockMDeliveryDate != null)
            return false;
        if (bAgentInstockMSalesman != null ? !bAgentInstockMSalesman.equals(that.bAgentInstockMSalesman) : that.bAgentInstockMSalesman != null)
            return false;
        if (bAgentInstockMServiceAttribute != null ? !bAgentInstockMServiceAttribute.equals(that.bAgentInstockMServiceAttribute) : that.bAgentInstockMServiceAttribute != null)
            return false;
        if (bAgentInstockMSumMoney != null ? !bAgentInstockMSumMoney.equals(that.bAgentInstockMSumMoney) : that.bAgentInstockMSumMoney != null)
            return false;
        if (bAgentInstockMWarehouseKeeper != null ? !bAgentInstockMWarehouseKeeper.equals(that.bAgentInstockMWarehouseKeeper) : that.bAgentInstockMWarehouseKeeper != null)
            return false;
        if (bAgentInstockMCreaterNo != null ? !bAgentInstockMCreaterNo.equals(that.bAgentInstockMCreaterNo) : that.bAgentInstockMCreaterNo != null)
            return false;
        if (bAgentInstockMCreateDate != null ? !bAgentInstockMCreateDate.equals(that.bAgentInstockMCreateDate) : that.bAgentInstockMCreateDate != null)
            return false;
        if (bAgentInstockMModifiNo != null ? !bAgentInstockMModifiNo.equals(that.bAgentInstockMModifiNo) : that.bAgentInstockMModifiNo != null)
            return false;
        if (bAgentInstockMModifiTime != null ? !bAgentInstockMModifiTime.equals(that.bAgentInstockMModifiTime) : that.bAgentInstockMModifiTime != null)
            return false;
        if (bAgentInstockMChecker != null ? !bAgentInstockMChecker.equals(that.bAgentInstockMChecker) : that.bAgentInstockMChecker != null)
            return false;
        if (bAgentInstockMCheckDate != null ? !bAgentInstockMCheckDate.equals(that.bAgentInstockMCheckDate) : that.bAgentInstockMCheckDate != null)
            return false;
        if (bAgentInstockMGroupNodeId != null ? !bAgentInstockMGroupNodeId.equals(that.bAgentInstockMGroupNodeId) : that.bAgentInstockMGroupNodeId != null)
            return false;
        if (bAgentInstockMState != null ? !bAgentInstockMState.equals(that.bAgentInstockMState) : that.bAgentInstockMState != null)
            return false;
        if (bAgentInstockMNotes != null ? !bAgentInstockMNotes.equals(that.bAgentInstockMNotes) : that.bAgentInstockMNotes != null)
            return false;
        if (bAgentInstockMPrints != null ? !bAgentInstockMPrints.equals(that.bAgentInstockMPrints) : that.bAgentInstockMPrints != null)
            return false;
        if (bAgentInstockMIsPass != null ? !bAgentInstockMIsPass.equals(that.bAgentInstockMIsPass) : that.bAgentInstockMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentInstockMAgentInstockNo != null ? bAgentInstockMAgentInstockNo.hashCode() : 0;
        result = 31 * result + (bAgentInstockMOrdProcureNo != null ? bAgentInstockMOrdProcureNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockMHandbillNo != null ? bAgentInstockMHandbillNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockMDeliveryDate != null ? bAgentInstockMDeliveryDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockMSalesman != null ? bAgentInstockMSalesman.hashCode() : 0);
        result = 31 * result + (bAgentInstockMServiceAttribute != null ? bAgentInstockMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bAgentInstockMSumMoney != null ? bAgentInstockMSumMoney.hashCode() : 0);
        result = 31 * result + (bAgentInstockMWarehouseKeeper != null ? bAgentInstockMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bAgentInstockMCreaterNo != null ? bAgentInstockMCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockMCreateDate != null ? bAgentInstockMCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockMModifiNo != null ? bAgentInstockMModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockMModifiTime != null ? bAgentInstockMModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentInstockMChecker != null ? bAgentInstockMChecker.hashCode() : 0);
        result = 31 * result + (bAgentInstockMCheckDate != null ? bAgentInstockMCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockMGroupNodeId != null ? bAgentInstockMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentInstockMState != null ? bAgentInstockMState.hashCode() : 0);
        result = 31 * result + (bAgentInstockMNotes != null ? bAgentInstockMNotes.hashCode() : 0);
        result = 31 * result + (bAgentInstockMPrints != null ? bAgentInstockMPrints.hashCode() : 0);
        result = 31 * result + (bAgentInstockMIsPass != null ? bAgentInstockMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_m_ord_procure_no", referencedColumnName = "b_purchase_ord_m_ord_procure_no")
    public BPurchaseOrdMEntity getbPurchaseOrdMByBAgentInstockMOrdProcureNo() {
        return bPurchaseOrdMByBAgentInstockMOrdProcureNo;
    }

    public void setbPurchaseOrdMByBAgentInstockMOrdProcureNo(BPurchaseOrdMEntity bPurchaseOrdMByBAgentInstockMOrdProcureNo) {
        this.bPurchaseOrdMByBAgentInstockMOrdProcureNo = bPurchaseOrdMByBAgentInstockMOrdProcureNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_m_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockMCreaterNo() {
        return tStaffByBAgentInstockMCreaterNo;
    }

    public void settStaffByBAgentInstockMCreaterNo(TStaffEntity tStaffByBAgentInstockMCreaterNo) {
        this.tStaffByBAgentInstockMCreaterNo = tStaffByBAgentInstockMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockMModifiNo() {
        return tStaffByBAgentInstockMModifiNo;
    }

    public void settStaffByBAgentInstockMModifiNo(TStaffEntity tStaffByBAgentInstockMModifiNo) {
        this.tStaffByBAgentInstockMModifiNo = tStaffByBAgentInstockMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockMChecker() {
        return tStaffByBAgentInstockMChecker;
    }

    public void settStaffByBAgentInstockMChecker(TStaffEntity tStaffByBAgentInstockMChecker) {
        this.tStaffByBAgentInstockMChecker = tStaffByBAgentInstockMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBAgentInstockMGroupNodeId() {
        return tOrgByBAgentInstockMGroupNodeId;
    }

    public void settOrgByBAgentInstockMGroupNodeId(TOrgEntity tOrgByBAgentInstockMGroupNodeId) {
        this.tOrgByBAgentInstockMGroupNodeId = tOrgByBAgentInstockMGroupNodeId;
    }

    @OneToMany(mappedBy = "bAgentInstockMByBAgentInstockSAgentInstockNo")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByBAgentInstockMAgentInstockNo() {
        return bAgentInstockSByBAgentInstockMAgentInstockNo;
    }

    public void setbAgentInstockSByBAgentInstockMAgentInstockNo(Collection<BAgentInstockSEntity> bAgentInstockSByBAgentInstockMAgentInstockNo) {
        this.bAgentInstockSByBAgentInstockMAgentInstockNo = bAgentInstockSByBAgentInstockMAgentInstockNo;
    }
}
