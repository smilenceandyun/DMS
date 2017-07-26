package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_out_present_m", schema = "dbo", catalog = "logistics_test")
public class BOutPresentMEntity {
    private String bOutPresentMOutPresentNo;
    private Timestamp bOutPresentMDeliveryDate;
    private Timestamp bOutPresentMServiceDate;
    private Timestamp bOutPresentMRoomOutDate;
    private String bOutPresentMCreateNo;
    private String bOutPresentMModifiNo;
    private String bOutPresentMChecker;
    private Timestamp bOutPresentMCreateDate;
    private Timestamp bOutPresentMModifiTime;
    private Timestamp bOutPresentMCheckDate;
    private String bOutPresentMState;
    private String bOutPresentMNotes;
    private String bOutPresentMGroupNodeId;
    private String bOutPresentMSOrderNo;
    private String bOutPresentMWarehouseKeeper;
    private String bOutPresentMDeliverymanNo;
    private String bOutPresentMIsPass;
    private TStaffEntity tStaffByBOutPresentMCreateNo;
    private TStaffEntity tStaffByBOutPresentMModifiNo;
    private TStaffEntity tStaffByBOutPresentMChecker;
    private TOrgEntity tOrgByBOutPresentMGroupNodeId;
    private BSOrderMEntity bSOrderMByBOutPresentMSOrderNo;
    private TStaffEntity tStaffByBOutPresentMWarehouseKeeper;
    private DeliverymanEntity deliverymanByBOutPresentMDeliverymanNo;
    private Collection<BOutPresentSEntity> bOutPresentSByBOutPresentMOutPresentNo;

    @Id
    @Column(name = "b_out_present_m_out_present_no", nullable = false, length = 16)
    public String getbOutPresentMOutPresentNo() {
        return bOutPresentMOutPresentNo;
    }

    public void setbOutPresentMOutPresentNo(String bOutPresentMOutPresentNo) {
        this.bOutPresentMOutPresentNo = bOutPresentMOutPresentNo;
    }

    @Basic
    @Column(name = "b_out_present_m_delivery_date", nullable = true)
    public Timestamp getbOutPresentMDeliveryDate() {
        return bOutPresentMDeliveryDate;
    }

    public void setbOutPresentMDeliveryDate(Timestamp bOutPresentMDeliveryDate) {
        this.bOutPresentMDeliveryDate = bOutPresentMDeliveryDate;
    }

    @Basic
    @Column(name = "b_out_present_m_service_date", nullable = true)
    public Timestamp getbOutPresentMServiceDate() {
        return bOutPresentMServiceDate;
    }

    public void setbOutPresentMServiceDate(Timestamp bOutPresentMServiceDate) {
        this.bOutPresentMServiceDate = bOutPresentMServiceDate;
    }

    @Basic
    @Column(name = "b_out_present_m_room_out_date", nullable = true)
    public Timestamp getbOutPresentMRoomOutDate() {
        return bOutPresentMRoomOutDate;
    }

    public void setbOutPresentMRoomOutDate(Timestamp bOutPresentMRoomOutDate) {
        this.bOutPresentMRoomOutDate = bOutPresentMRoomOutDate;
    }

    @Basic
    @Column(name = "b_out_present_m_create_no", nullable = true, length = 8)
    public String getbOutPresentMCreateNo() {
        return bOutPresentMCreateNo;
    }

    public void setbOutPresentMCreateNo(String bOutPresentMCreateNo) {
        this.bOutPresentMCreateNo = bOutPresentMCreateNo;
    }

    @Basic
    @Column(name = "b_out_present_m_modifi_no", nullable = true, length = 8)
    public String getbOutPresentMModifiNo() {
        return bOutPresentMModifiNo;
    }

    public void setbOutPresentMModifiNo(String bOutPresentMModifiNo) {
        this.bOutPresentMModifiNo = bOutPresentMModifiNo;
    }

    @Basic
    @Column(name = "b_out_present_m_checker", nullable = true, length = 8)
    public String getbOutPresentMChecker() {
        return bOutPresentMChecker;
    }

    public void setbOutPresentMChecker(String bOutPresentMChecker) {
        this.bOutPresentMChecker = bOutPresentMChecker;
    }

    @Basic
    @Column(name = "b_out_present_m_create_date", nullable = true)
    public Timestamp getbOutPresentMCreateDate() {
        return bOutPresentMCreateDate;
    }

    public void setbOutPresentMCreateDate(Timestamp bOutPresentMCreateDate) {
        this.bOutPresentMCreateDate = bOutPresentMCreateDate;
    }

    @Basic
    @Column(name = "b_out_present_m_modifi_time", nullable = true)
    public Timestamp getbOutPresentMModifiTime() {
        return bOutPresentMModifiTime;
    }

    public void setbOutPresentMModifiTime(Timestamp bOutPresentMModifiTime) {
        this.bOutPresentMModifiTime = bOutPresentMModifiTime;
    }

    @Basic
    @Column(name = "b_out_present_m_check_date", nullable = true)
    public Timestamp getbOutPresentMCheckDate() {
        return bOutPresentMCheckDate;
    }

    public void setbOutPresentMCheckDate(Timestamp bOutPresentMCheckDate) {
        this.bOutPresentMCheckDate = bOutPresentMCheckDate;
    }

    @Basic
    @Column(name = "b_out_present_m_state", nullable = true, length = 1)
    public String getbOutPresentMState() {
        return bOutPresentMState;
    }

    public void setbOutPresentMState(String bOutPresentMState) {
        this.bOutPresentMState = bOutPresentMState;
    }

    @Basic
    @Column(name = "b_out_present_m_notes", nullable = true, length = 200)
    public String getbOutPresentMNotes() {
        return bOutPresentMNotes;
    }

    public void setbOutPresentMNotes(String bOutPresentMNotes) {
        this.bOutPresentMNotes = bOutPresentMNotes;
    }

    @Basic
    @Column(name = "b_out_present_m_group_node_id", nullable = false, length = 20)
    public String getbOutPresentMGroupNodeId() {
        return bOutPresentMGroupNodeId;
    }

    public void setbOutPresentMGroupNodeId(String bOutPresentMGroupNodeId) {
        this.bOutPresentMGroupNodeId = bOutPresentMGroupNodeId;
    }

    @Basic
    @Column(name = "b_out_present_m_s_order_no", nullable = true, length = 16)
    public String getbOutPresentMSOrderNo() {
        return bOutPresentMSOrderNo;
    }

    public void setbOutPresentMSOrderNo(String bOutPresentMSOrderNo) {
        this.bOutPresentMSOrderNo = bOutPresentMSOrderNo;
    }

    @Basic
    @Column(name = "b_out_present_m_warehouse_keeper", nullable = true, length = 8)
    public String getbOutPresentMWarehouseKeeper() {
        return bOutPresentMWarehouseKeeper;
    }

    public void setbOutPresentMWarehouseKeeper(String bOutPresentMWarehouseKeeper) {
        this.bOutPresentMWarehouseKeeper = bOutPresentMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_out_present_m_deliveryman_no", nullable = true, length = 8)
    public String getbOutPresentMDeliverymanNo() {
        return bOutPresentMDeliverymanNo;
    }

    public void setbOutPresentMDeliverymanNo(String bOutPresentMDeliverymanNo) {
        this.bOutPresentMDeliverymanNo = bOutPresentMDeliverymanNo;
    }

    @Basic
    @Column(name = "b_out_present_m_isPass", nullable = true, length = 1)
    public String getbOutPresentMIsPass() {
        return bOutPresentMIsPass;
    }

    public void setbOutPresentMIsPass(String bOutPresentMIsPass) {
        this.bOutPresentMIsPass = bOutPresentMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BOutPresentMEntity that = (BOutPresentMEntity) o;

        if (bOutPresentMOutPresentNo != null ? !bOutPresentMOutPresentNo.equals(that.bOutPresentMOutPresentNo) : that.bOutPresentMOutPresentNo != null)
            return false;
        if (bOutPresentMDeliveryDate != null ? !bOutPresentMDeliveryDate.equals(that.bOutPresentMDeliveryDate) : that.bOutPresentMDeliveryDate != null)
            return false;
        if (bOutPresentMServiceDate != null ? !bOutPresentMServiceDate.equals(that.bOutPresentMServiceDate) : that.bOutPresentMServiceDate != null)
            return false;
        if (bOutPresentMRoomOutDate != null ? !bOutPresentMRoomOutDate.equals(that.bOutPresentMRoomOutDate) : that.bOutPresentMRoomOutDate != null)
            return false;
        if (bOutPresentMCreateNo != null ? !bOutPresentMCreateNo.equals(that.bOutPresentMCreateNo) : that.bOutPresentMCreateNo != null)
            return false;
        if (bOutPresentMModifiNo != null ? !bOutPresentMModifiNo.equals(that.bOutPresentMModifiNo) : that.bOutPresentMModifiNo != null)
            return false;
        if (bOutPresentMChecker != null ? !bOutPresentMChecker.equals(that.bOutPresentMChecker) : that.bOutPresentMChecker != null)
            return false;
        if (bOutPresentMCreateDate != null ? !bOutPresentMCreateDate.equals(that.bOutPresentMCreateDate) : that.bOutPresentMCreateDate != null)
            return false;
        if (bOutPresentMModifiTime != null ? !bOutPresentMModifiTime.equals(that.bOutPresentMModifiTime) : that.bOutPresentMModifiTime != null)
            return false;
        if (bOutPresentMCheckDate != null ? !bOutPresentMCheckDate.equals(that.bOutPresentMCheckDate) : that.bOutPresentMCheckDate != null)
            return false;
        if (bOutPresentMState != null ? !bOutPresentMState.equals(that.bOutPresentMState) : that.bOutPresentMState != null)
            return false;
        if (bOutPresentMNotes != null ? !bOutPresentMNotes.equals(that.bOutPresentMNotes) : that.bOutPresentMNotes != null)
            return false;
        if (bOutPresentMGroupNodeId != null ? !bOutPresentMGroupNodeId.equals(that.bOutPresentMGroupNodeId) : that.bOutPresentMGroupNodeId != null)
            return false;
        if (bOutPresentMSOrderNo != null ? !bOutPresentMSOrderNo.equals(that.bOutPresentMSOrderNo) : that.bOutPresentMSOrderNo != null)
            return false;
        if (bOutPresentMWarehouseKeeper != null ? !bOutPresentMWarehouseKeeper.equals(that.bOutPresentMWarehouseKeeper) : that.bOutPresentMWarehouseKeeper != null)
            return false;
        if (bOutPresentMDeliverymanNo != null ? !bOutPresentMDeliverymanNo.equals(that.bOutPresentMDeliverymanNo) : that.bOutPresentMDeliverymanNo != null)
            return false;
        if (bOutPresentMIsPass != null ? !bOutPresentMIsPass.equals(that.bOutPresentMIsPass) : that.bOutPresentMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bOutPresentMOutPresentNo != null ? bOutPresentMOutPresentNo.hashCode() : 0;
        result = 31 * result + (bOutPresentMDeliveryDate != null ? bOutPresentMDeliveryDate.hashCode() : 0);
        result = 31 * result + (bOutPresentMServiceDate != null ? bOutPresentMServiceDate.hashCode() : 0);
        result = 31 * result + (bOutPresentMRoomOutDate != null ? bOutPresentMRoomOutDate.hashCode() : 0);
        result = 31 * result + (bOutPresentMCreateNo != null ? bOutPresentMCreateNo.hashCode() : 0);
        result = 31 * result + (bOutPresentMModifiNo != null ? bOutPresentMModifiNo.hashCode() : 0);
        result = 31 * result + (bOutPresentMChecker != null ? bOutPresentMChecker.hashCode() : 0);
        result = 31 * result + (bOutPresentMCreateDate != null ? bOutPresentMCreateDate.hashCode() : 0);
        result = 31 * result + (bOutPresentMModifiTime != null ? bOutPresentMModifiTime.hashCode() : 0);
        result = 31 * result + (bOutPresentMCheckDate != null ? bOutPresentMCheckDate.hashCode() : 0);
        result = 31 * result + (bOutPresentMState != null ? bOutPresentMState.hashCode() : 0);
        result = 31 * result + (bOutPresentMNotes != null ? bOutPresentMNotes.hashCode() : 0);
        result = 31 * result + (bOutPresentMGroupNodeId != null ? bOutPresentMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bOutPresentMSOrderNo != null ? bOutPresentMSOrderNo.hashCode() : 0);
        result = 31 * result + (bOutPresentMWarehouseKeeper != null ? bOutPresentMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bOutPresentMDeliverymanNo != null ? bOutPresentMDeliverymanNo.hashCode() : 0);
        result = 31 * result + (bOutPresentMIsPass != null ? bOutPresentMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentMCreateNo() {
        return tStaffByBOutPresentMCreateNo;
    }

    public void settStaffByBOutPresentMCreateNo(TStaffEntity tStaffByBOutPresentMCreateNo) {
        this.tStaffByBOutPresentMCreateNo = tStaffByBOutPresentMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentMModifiNo() {
        return tStaffByBOutPresentMModifiNo;
    }

    public void settStaffByBOutPresentMModifiNo(TStaffEntity tStaffByBOutPresentMModifiNo) {
        this.tStaffByBOutPresentMModifiNo = tStaffByBOutPresentMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentMChecker() {
        return tStaffByBOutPresentMChecker;
    }

    public void settStaffByBOutPresentMChecker(TStaffEntity tStaffByBOutPresentMChecker) {
        this.tStaffByBOutPresentMChecker = tStaffByBOutPresentMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBOutPresentMGroupNodeId() {
        return tOrgByBOutPresentMGroupNodeId;
    }

    public void settOrgByBOutPresentMGroupNodeId(TOrgEntity tOrgByBOutPresentMGroupNodeId) {
        this.tOrgByBOutPresentMGroupNodeId = tOrgByBOutPresentMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_s_order_no", referencedColumnName = "b_s_order_m_s_order_no")
    public BSOrderMEntity getbSOrderMByBOutPresentMSOrderNo() {
        return bSOrderMByBOutPresentMSOrderNo;
    }

    public void setbSOrderMByBOutPresentMSOrderNo(BSOrderMEntity bSOrderMByBOutPresentMSOrderNo) {
        this.bSOrderMByBOutPresentMSOrderNo = bSOrderMByBOutPresentMSOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentMWarehouseKeeper() {
        return tStaffByBOutPresentMWarehouseKeeper;
    }

    public void settStaffByBOutPresentMWarehouseKeeper(TStaffEntity tStaffByBOutPresentMWarehouseKeeper) {
        this.tStaffByBOutPresentMWarehouseKeeper = tStaffByBOutPresentMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_m_deliveryman_no", referencedColumnName = "deliveryman_deliveryman_no")
    public DeliverymanEntity getDeliverymanByBOutPresentMDeliverymanNo() {
        return deliverymanByBOutPresentMDeliverymanNo;
    }

    public void setDeliverymanByBOutPresentMDeliverymanNo(DeliverymanEntity deliverymanByBOutPresentMDeliverymanNo) {
        this.deliverymanByBOutPresentMDeliverymanNo = deliverymanByBOutPresentMDeliverymanNo;
    }

    @OneToMany(mappedBy = "bOutPresentMByBOutPresentSOutPresentNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByBOutPresentMOutPresentNo() {
        return bOutPresentSByBOutPresentMOutPresentNo;
    }

    public void setbOutPresentSByBOutPresentMOutPresentNo(Collection<BOutPresentSEntity> bOutPresentSByBOutPresentMOutPresentNo) {
        this.bOutPresentSByBOutPresentMOutPresentNo = bOutPresentSByBOutPresentMOutPresentNo;
    }
}
