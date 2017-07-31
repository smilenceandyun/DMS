package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_agent_rsales_m", schema = "dbo", catalog = "logistics")
public class BAgentRsalesMEntity {
    private String bAgentRsalesMAgentRsalesNo;
    private String bAgentRsalesMAgentTransportNo;
    private String bAgentRsalesMNotificationNo;
    private String bAgentRsalesMEntrustClientNo;
    private String bAgentRsalesMEntrustClientName;
    private Timestamp bAgentRsalesMEntrustDate;
    private String bAgentRsalesMEntrustLinkman;
    private String bAgentRsalesMEntrustTel;
    private String bAgentRsalesMHandbillNo;
    private String bAgentRsalesMClientAddress;
    private String bAgentRsalesMServiceAttribute;
    private String bAgentRsalesMSalesman;
    private String bAgentRsalesMState;
    private String bAgentRsalesMCreaterNo;
    private Timestamp bAgentRsalesMOccurrenceDate;
    private Timestamp bAgentRsalesMCreateDate;
    private String bAgentRsalesMModifiNo;
    private Timestamp bAgentRsalesMModifiTime;
    private String bAgentRsalesMChecker;
    private Timestamp bAgentRsalesMCheckDate;
    private String bAgentRsalesMGroupNodeId;
    private String bAgentRsalesMRemark;
    private String bAgentRsalesMWarehouseKeeper;
    private String bAgentRsalesMIsPass;
    private BAgentSalesMEntity bAgentSalesMByBAgentRsalesMAgentRsalesNo;
    private TStaffEntity tStaffByBAgentRsalesMCreaterNo;
    private TStaffEntity tStaffByBAgentRsalesMModifiNo;
    private TStaffEntity tStaffByBAgentRsalesMChecker;
    private TOrgEntity tOrgByBAgentRsalesMGroupNodeId;
    private TStaffEntity tStaffByBAgentRsalesMWarehouseKeeper;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByBAgentRsalesMAgentRsalesNo;

    @Id
    @Column(name = "b_agent_rsales_m_agent_rsales_no", nullable = false, length = 16)
    public String getbAgentRsalesMAgentRsalesNo() {
        return bAgentRsalesMAgentRsalesNo;
    }

    public void setbAgentRsalesMAgentRsalesNo(String bAgentRsalesMAgentRsalesNo) {
        this.bAgentRsalesMAgentRsalesNo = bAgentRsalesMAgentRsalesNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_agent_transport_no", nullable = true, length = 16)
    public String getbAgentRsalesMAgentTransportNo() {
        return bAgentRsalesMAgentTransportNo;
    }

    public void setbAgentRsalesMAgentTransportNo(String bAgentRsalesMAgentTransportNo) {
        this.bAgentRsalesMAgentTransportNo = bAgentRsalesMAgentTransportNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_notification_no", nullable = true, length = 50)
    public String getbAgentRsalesMNotificationNo() {
        return bAgentRsalesMNotificationNo;
    }

    public void setbAgentRsalesMNotificationNo(String bAgentRsalesMNotificationNo) {
        this.bAgentRsalesMNotificationNo = bAgentRsalesMNotificationNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_entrust_client_no", nullable = true, length = 20)
    public String getbAgentRsalesMEntrustClientNo() {
        return bAgentRsalesMEntrustClientNo;
    }

    public void setbAgentRsalesMEntrustClientNo(String bAgentRsalesMEntrustClientNo) {
        this.bAgentRsalesMEntrustClientNo = bAgentRsalesMEntrustClientNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_entrust_client_name", nullable = true, length = 200)
    public String getbAgentRsalesMEntrustClientName() {
        return bAgentRsalesMEntrustClientName;
    }

    public void setbAgentRsalesMEntrustClientName(String bAgentRsalesMEntrustClientName) {
        this.bAgentRsalesMEntrustClientName = bAgentRsalesMEntrustClientName;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_entrust_date", nullable = true)
    public Timestamp getbAgentRsalesMEntrustDate() {
        return bAgentRsalesMEntrustDate;
    }

    public void setbAgentRsalesMEntrustDate(Timestamp bAgentRsalesMEntrustDate) {
        this.bAgentRsalesMEntrustDate = bAgentRsalesMEntrustDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_entrust_linkman", nullable = true, length = 50)
    public String getbAgentRsalesMEntrustLinkman() {
        return bAgentRsalesMEntrustLinkman;
    }

    public void setbAgentRsalesMEntrustLinkman(String bAgentRsalesMEntrustLinkman) {
        this.bAgentRsalesMEntrustLinkman = bAgentRsalesMEntrustLinkman;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_entrust_tel", nullable = true, length = 30)
    public String getbAgentRsalesMEntrustTel() {
        return bAgentRsalesMEntrustTel;
    }

    public void setbAgentRsalesMEntrustTel(String bAgentRsalesMEntrustTel) {
        this.bAgentRsalesMEntrustTel = bAgentRsalesMEntrustTel;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_handbill_no", nullable = true, length = 20)
    public String getbAgentRsalesMHandbillNo() {
        return bAgentRsalesMHandbillNo;
    }

    public void setbAgentRsalesMHandbillNo(String bAgentRsalesMHandbillNo) {
        this.bAgentRsalesMHandbillNo = bAgentRsalesMHandbillNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_client_address", nullable = true, length = 200)
    public String getbAgentRsalesMClientAddress() {
        return bAgentRsalesMClientAddress;
    }

    public void setbAgentRsalesMClientAddress(String bAgentRsalesMClientAddress) {
        this.bAgentRsalesMClientAddress = bAgentRsalesMClientAddress;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_service_attribute", nullable = true, length = 4)
    public String getbAgentRsalesMServiceAttribute() {
        return bAgentRsalesMServiceAttribute;
    }

    public void setbAgentRsalesMServiceAttribute(String bAgentRsalesMServiceAttribute) {
        this.bAgentRsalesMServiceAttribute = bAgentRsalesMServiceAttribute;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_salesman", nullable = true, length = 8)
    public String getbAgentRsalesMSalesman() {
        return bAgentRsalesMSalesman;
    }

    public void setbAgentRsalesMSalesman(String bAgentRsalesMSalesman) {
        this.bAgentRsalesMSalesman = bAgentRsalesMSalesman;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_state", nullable = true, length = -1)
    public String getbAgentRsalesMState() {
        return bAgentRsalesMState;
    }

    public void setbAgentRsalesMState(String bAgentRsalesMState) {
        this.bAgentRsalesMState = bAgentRsalesMState;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_creater_no", nullable = true, length = 8)
    public String getbAgentRsalesMCreaterNo() {
        return bAgentRsalesMCreaterNo;
    }

    public void setbAgentRsalesMCreaterNo(String bAgentRsalesMCreaterNo) {
        this.bAgentRsalesMCreaterNo = bAgentRsalesMCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_occurrence_date", nullable = true)
    public Timestamp getbAgentRsalesMOccurrenceDate() {
        return bAgentRsalesMOccurrenceDate;
    }

    public void setbAgentRsalesMOccurrenceDate(Timestamp bAgentRsalesMOccurrenceDate) {
        this.bAgentRsalesMOccurrenceDate = bAgentRsalesMOccurrenceDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_create_date", nullable = true)
    public Timestamp getbAgentRsalesMCreateDate() {
        return bAgentRsalesMCreateDate;
    }

    public void setbAgentRsalesMCreateDate(Timestamp bAgentRsalesMCreateDate) {
        this.bAgentRsalesMCreateDate = bAgentRsalesMCreateDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_modifi_no", nullable = true, length = 8)
    public String getbAgentRsalesMModifiNo() {
        return bAgentRsalesMModifiNo;
    }

    public void setbAgentRsalesMModifiNo(String bAgentRsalesMModifiNo) {
        this.bAgentRsalesMModifiNo = bAgentRsalesMModifiNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_modifi_time", nullable = true)
    public Timestamp getbAgentRsalesMModifiTime() {
        return bAgentRsalesMModifiTime;
    }

    public void setbAgentRsalesMModifiTime(Timestamp bAgentRsalesMModifiTime) {
        this.bAgentRsalesMModifiTime = bAgentRsalesMModifiTime;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_checker", nullable = true, length = 8)
    public String getbAgentRsalesMChecker() {
        return bAgentRsalesMChecker;
    }

    public void setbAgentRsalesMChecker(String bAgentRsalesMChecker) {
        this.bAgentRsalesMChecker = bAgentRsalesMChecker;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_check_date", nullable = true)
    public Timestamp getbAgentRsalesMCheckDate() {
        return bAgentRsalesMCheckDate;
    }

    public void setbAgentRsalesMCheckDate(Timestamp bAgentRsalesMCheckDate) {
        this.bAgentRsalesMCheckDate = bAgentRsalesMCheckDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_group_node_id", nullable = false, length = 20)
    public String getbAgentRsalesMGroupNodeId() {
        return bAgentRsalesMGroupNodeId;
    }

    public void setbAgentRsalesMGroupNodeId(String bAgentRsalesMGroupNodeId) {
        this.bAgentRsalesMGroupNodeId = bAgentRsalesMGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_remark", nullable = true, length = 200)
    public String getbAgentRsalesMRemark() {
        return bAgentRsalesMRemark;
    }

    public void setbAgentRsalesMRemark(String bAgentRsalesMRemark) {
        this.bAgentRsalesMRemark = bAgentRsalesMRemark;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_warehouse_keeper", nullable = true, length = 8)
    public String getbAgentRsalesMWarehouseKeeper() {
        return bAgentRsalesMWarehouseKeeper;
    }

    public void setbAgentRsalesMWarehouseKeeper(String bAgentRsalesMWarehouseKeeper) {
        this.bAgentRsalesMWarehouseKeeper = bAgentRsalesMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_agent_rsales_m_isPass", nullable = true, length = -1)
    public String getbAgentRsalesMIsPass() {
        return bAgentRsalesMIsPass;
    }

    public void setbAgentRsalesMIsPass(String bAgentRsalesMIsPass) {
        this.bAgentRsalesMIsPass = bAgentRsalesMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentRsalesMEntity that = (BAgentRsalesMEntity) o;

        if (bAgentRsalesMAgentRsalesNo != null ? !bAgentRsalesMAgentRsalesNo.equals(that.bAgentRsalesMAgentRsalesNo) : that.bAgentRsalesMAgentRsalesNo != null)
            return false;
        if (bAgentRsalesMAgentTransportNo != null ? !bAgentRsalesMAgentTransportNo.equals(that.bAgentRsalesMAgentTransportNo) : that.bAgentRsalesMAgentTransportNo != null)
            return false;
        if (bAgentRsalesMNotificationNo != null ? !bAgentRsalesMNotificationNo.equals(that.bAgentRsalesMNotificationNo) : that.bAgentRsalesMNotificationNo != null)
            return false;
        if (bAgentRsalesMEntrustClientNo != null ? !bAgentRsalesMEntrustClientNo.equals(that.bAgentRsalesMEntrustClientNo) : that.bAgentRsalesMEntrustClientNo != null)
            return false;
        if (bAgentRsalesMEntrustClientName != null ? !bAgentRsalesMEntrustClientName.equals(that.bAgentRsalesMEntrustClientName) : that.bAgentRsalesMEntrustClientName != null)
            return false;
        if (bAgentRsalesMEntrustDate != null ? !bAgentRsalesMEntrustDate.equals(that.bAgentRsalesMEntrustDate) : that.bAgentRsalesMEntrustDate != null)
            return false;
        if (bAgentRsalesMEntrustLinkman != null ? !bAgentRsalesMEntrustLinkman.equals(that.bAgentRsalesMEntrustLinkman) : that.bAgentRsalesMEntrustLinkman != null)
            return false;
        if (bAgentRsalesMEntrustTel != null ? !bAgentRsalesMEntrustTel.equals(that.bAgentRsalesMEntrustTel) : that.bAgentRsalesMEntrustTel != null)
            return false;
        if (bAgentRsalesMHandbillNo != null ? !bAgentRsalesMHandbillNo.equals(that.bAgentRsalesMHandbillNo) : that.bAgentRsalesMHandbillNo != null)
            return false;
        if (bAgentRsalesMClientAddress != null ? !bAgentRsalesMClientAddress.equals(that.bAgentRsalesMClientAddress) : that.bAgentRsalesMClientAddress != null)
            return false;
        if (bAgentRsalesMServiceAttribute != null ? !bAgentRsalesMServiceAttribute.equals(that.bAgentRsalesMServiceAttribute) : that.bAgentRsalesMServiceAttribute != null)
            return false;
        if (bAgentRsalesMSalesman != null ? !bAgentRsalesMSalesman.equals(that.bAgentRsalesMSalesman) : that.bAgentRsalesMSalesman != null)
            return false;
        if (bAgentRsalesMState != null ? !bAgentRsalesMState.equals(that.bAgentRsalesMState) : that.bAgentRsalesMState != null)
            return false;
        if (bAgentRsalesMCreaterNo != null ? !bAgentRsalesMCreaterNo.equals(that.bAgentRsalesMCreaterNo) : that.bAgentRsalesMCreaterNo != null)
            return false;
        if (bAgentRsalesMOccurrenceDate != null ? !bAgentRsalesMOccurrenceDate.equals(that.bAgentRsalesMOccurrenceDate) : that.bAgentRsalesMOccurrenceDate != null)
            return false;
        if (bAgentRsalesMCreateDate != null ? !bAgentRsalesMCreateDate.equals(that.bAgentRsalesMCreateDate) : that.bAgentRsalesMCreateDate != null)
            return false;
        if (bAgentRsalesMModifiNo != null ? !bAgentRsalesMModifiNo.equals(that.bAgentRsalesMModifiNo) : that.bAgentRsalesMModifiNo != null)
            return false;
        if (bAgentRsalesMModifiTime != null ? !bAgentRsalesMModifiTime.equals(that.bAgentRsalesMModifiTime) : that.bAgentRsalesMModifiTime != null)
            return false;
        if (bAgentRsalesMChecker != null ? !bAgentRsalesMChecker.equals(that.bAgentRsalesMChecker) : that.bAgentRsalesMChecker != null)
            return false;
        if (bAgentRsalesMCheckDate != null ? !bAgentRsalesMCheckDate.equals(that.bAgentRsalesMCheckDate) : that.bAgentRsalesMCheckDate != null)
            return false;
        if (bAgentRsalesMGroupNodeId != null ? !bAgentRsalesMGroupNodeId.equals(that.bAgentRsalesMGroupNodeId) : that.bAgentRsalesMGroupNodeId != null)
            return false;
        if (bAgentRsalesMRemark != null ? !bAgentRsalesMRemark.equals(that.bAgentRsalesMRemark) : that.bAgentRsalesMRemark != null)
            return false;
        if (bAgentRsalesMWarehouseKeeper != null ? !bAgentRsalesMWarehouseKeeper.equals(that.bAgentRsalesMWarehouseKeeper) : that.bAgentRsalesMWarehouseKeeper != null)
            return false;
        if (bAgentRsalesMIsPass != null ? !bAgentRsalesMIsPass.equals(that.bAgentRsalesMIsPass) : that.bAgentRsalesMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentRsalesMAgentRsalesNo != null ? bAgentRsalesMAgentRsalesNo.hashCode() : 0;
        result = 31 * result + (bAgentRsalesMAgentTransportNo != null ? bAgentRsalesMAgentTransportNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMNotificationNo != null ? bAgentRsalesMNotificationNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMEntrustClientNo != null ? bAgentRsalesMEntrustClientNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMEntrustClientName != null ? bAgentRsalesMEntrustClientName.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMEntrustDate != null ? bAgentRsalesMEntrustDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMEntrustLinkman != null ? bAgentRsalesMEntrustLinkman.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMEntrustTel != null ? bAgentRsalesMEntrustTel.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMHandbillNo != null ? bAgentRsalesMHandbillNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMClientAddress != null ? bAgentRsalesMClientAddress.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMServiceAttribute != null ? bAgentRsalesMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMSalesman != null ? bAgentRsalesMSalesman.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMState != null ? bAgentRsalesMState.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMCreaterNo != null ? bAgentRsalesMCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMOccurrenceDate != null ? bAgentRsalesMOccurrenceDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMCreateDate != null ? bAgentRsalesMCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMModifiNo != null ? bAgentRsalesMModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMModifiTime != null ? bAgentRsalesMModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMChecker != null ? bAgentRsalesMChecker.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMCheckDate != null ? bAgentRsalesMCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMGroupNodeId != null ? bAgentRsalesMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMRemark != null ? bAgentRsalesMRemark.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMWarehouseKeeper != null ? bAgentRsalesMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bAgentRsalesMIsPass != null ? bAgentRsalesMIsPass.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "b_agent_rsales_m_agent_rsales_no", referencedColumnName = "b_agent_sales_m_agent_sales_no", nullable = false,insertable = false, updatable = false)
    public BAgentSalesMEntity getbAgentSalesMByBAgentRsalesMAgentRsalesNo() {
        return bAgentSalesMByBAgentRsalesMAgentRsalesNo;
    }

    public void setbAgentSalesMByBAgentRsalesMAgentRsalesNo(BAgentSalesMEntity bAgentSalesMByBAgentRsalesMAgentRsalesNo) {
        this.bAgentSalesMByBAgentRsalesMAgentRsalesNo = bAgentSalesMByBAgentRsalesMAgentRsalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_m_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesMCreaterNo() {
        return tStaffByBAgentRsalesMCreaterNo;
    }

    public void settStaffByBAgentRsalesMCreaterNo(TStaffEntity tStaffByBAgentRsalesMCreaterNo) {
        this.tStaffByBAgentRsalesMCreaterNo = tStaffByBAgentRsalesMCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesMModifiNo() {
        return tStaffByBAgentRsalesMModifiNo;
    }

    public void settStaffByBAgentRsalesMModifiNo(TStaffEntity tStaffByBAgentRsalesMModifiNo) {
        this.tStaffByBAgentRsalesMModifiNo = tStaffByBAgentRsalesMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesMChecker() {
        return tStaffByBAgentRsalesMChecker;
    }

    public void settStaffByBAgentRsalesMChecker(TStaffEntity tStaffByBAgentRsalesMChecker) {
        this.tStaffByBAgentRsalesMChecker = tStaffByBAgentRsalesMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBAgentRsalesMGroupNodeId() {
        return tOrgByBAgentRsalesMGroupNodeId;
    }

    public void settOrgByBAgentRsalesMGroupNodeId(TOrgEntity tOrgByBAgentRsalesMGroupNodeId) {
        this.tOrgByBAgentRsalesMGroupNodeId = tOrgByBAgentRsalesMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesMWarehouseKeeper() {
        return tStaffByBAgentRsalesMWarehouseKeeper;
    }

    public void settStaffByBAgentRsalesMWarehouseKeeper(TStaffEntity tStaffByBAgentRsalesMWarehouseKeeper) {
        this.tStaffByBAgentRsalesMWarehouseKeeper = tStaffByBAgentRsalesMWarehouseKeeper;
    }

    @OneToMany(mappedBy = "bAgentRsalesMByBAgentRsalesSAgentRsalesNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByBAgentRsalesMAgentRsalesNo() {
        return bAgentRsalesSESByBAgentRsalesMAgentRsalesNo;
    }

    public void setbAgentRsalesSESByBAgentRsalesMAgentRsalesNo(Collection<BAgentRsalesSEntity> bAgentRsalesSESByBAgentRsalesMAgentRsalesNo) {
        this.bAgentRsalesSESByBAgentRsalesMAgentRsalesNo = bAgentRsalesSESByBAgentRsalesMAgentRsalesNo;
    }
}
