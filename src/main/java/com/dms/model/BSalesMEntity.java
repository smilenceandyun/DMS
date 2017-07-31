package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_sales_m", schema = "dbo", catalog = "logistics")
public class BSalesMEntity {
    private String bSalesMSalesNo;
    private String bSalesMSOrderNo;
    private String bSalesMHandbillNo;
    private String bSalesMState;
    private Timestamp bSalesMCreateDate;
    private Timestamp bSalesMModifiTime;
    private Timestamp bSalesMCheckDate;
    private String bSalesMNotes;
    private Integer bSalesMPrints;
    private String bSalesMGroupNodeId;
    private String bSalesMCreateNo;
    private String bSalesMModifiNo;
    private String bSalesMChecker;
    private String bSalesMSalesman;
    private Timestamp bSalesMReturnDate;
    private Timestamp bSalesMRoomConfirmDate;
    private String bSalesMIsPass;
    private Collection<BSProcureMEntity> bSProcureMSByBSalesMSalesNo;
    private BSOrderMEntity bSOrderMByBSalesMSOrderNo;
    private TOrgEntity tOrgByBSalesMGroupNodeId;
    private TStaffEntity tStaffByBSalesMCreateNo;
    private TStaffEntity tStaffByBSalesMModifiNo;
    private TStaffEntity tStaffByBSalesMChecker;
    private TStaffEntity tStaffByBSalesMSalesman;

    @Id
    @Column(name = "b_sales_m_sales_no", nullable = false, length = 16)
    public String getbSalesMSalesNo() {
        return bSalesMSalesNo;
    }

    public void setbSalesMSalesNo(String bSalesMSalesNo) {
        this.bSalesMSalesNo = bSalesMSalesNo;
    }

    @Basic
    @Column(name = "b_sales_m_s_order_no", nullable = true, length = 16)
    public String getbSalesMSOrderNo() {
        return bSalesMSOrderNo;
    }

    public void setbSalesMSOrderNo(String bSalesMSOrderNo) {
        this.bSalesMSOrderNo = bSalesMSOrderNo;
    }

    @Basic
    @Column(name = "b_sales_m_handbill_no", nullable = true, length = 20)
    public String getbSalesMHandbillNo() {
        return bSalesMHandbillNo;
    }

    public void setbSalesMHandbillNo(String bSalesMHandbillNo) {
        this.bSalesMHandbillNo = bSalesMHandbillNo;
    }

    @Basic
    @Column(name = "b_sales_m_state", nullable = true, length = -1)
    public String getbSalesMState() {
        return bSalesMState;
    }

    public void setbSalesMState(String bSalesMState) {
        this.bSalesMState = bSalesMState;
    }

    @Basic
    @Column(name = "b_sales_m_create_date", nullable = true)
    public Timestamp getbSalesMCreateDate() {
        return bSalesMCreateDate;
    }

    public void setbSalesMCreateDate(Timestamp bSalesMCreateDate) {
        this.bSalesMCreateDate = bSalesMCreateDate;
    }

    @Basic
    @Column(name = "b_sales_m_modifi_time", nullable = true)
    public Timestamp getbSalesMModifiTime() {
        return bSalesMModifiTime;
    }

    public void setbSalesMModifiTime(Timestamp bSalesMModifiTime) {
        this.bSalesMModifiTime = bSalesMModifiTime;
    }

    @Basic
    @Column(name = "b_sales_m_check_date", nullable = true)
    public Timestamp getbSalesMCheckDate() {
        return bSalesMCheckDate;
    }

    public void setbSalesMCheckDate(Timestamp bSalesMCheckDate) {
        this.bSalesMCheckDate = bSalesMCheckDate;
    }

    @Basic
    @Column(name = "b_sales_m_notes", nullable = true, length = 200)
    public String getbSalesMNotes() {
        return bSalesMNotes;
    }

    public void setbSalesMNotes(String bSalesMNotes) {
        this.bSalesMNotes = bSalesMNotes;
    }

    @Basic
    @Column(name = "b_sales_m_prints", nullable = true)
    public Integer getbSalesMPrints() {
        return bSalesMPrints;
    }

    public void setbSalesMPrints(Integer bSalesMPrints) {
        this.bSalesMPrints = bSalesMPrints;
    }

    @Basic
    @Column(name = "b_sales_m_group_node_id", nullable = false, length = 20)
    public String getbSalesMGroupNodeId() {
        return bSalesMGroupNodeId;
    }

    public void setbSalesMGroupNodeId(String bSalesMGroupNodeId) {
        this.bSalesMGroupNodeId = bSalesMGroupNodeId;
    }

    @Basic
    @Column(name = "b_sales_m_create_no", nullable = true, length = 8)
    public String getbSalesMCreateNo() {
        return bSalesMCreateNo;
    }

    public void setbSalesMCreateNo(String bSalesMCreateNo) {
        this.bSalesMCreateNo = bSalesMCreateNo;
    }

    @Basic
    @Column(name = "b_sales_m_modifi_no", nullable = true, length = 8)
    public String getbSalesMModifiNo() {
        return bSalesMModifiNo;
    }

    public void setbSalesMModifiNo(String bSalesMModifiNo) {
        this.bSalesMModifiNo = bSalesMModifiNo;
    }

    @Basic
    @Column(name = "b_sales_m_checker", nullable = true, length = 8)
    public String getbSalesMChecker() {
        return bSalesMChecker;
    }

    public void setbSalesMChecker(String bSalesMChecker) {
        this.bSalesMChecker = bSalesMChecker;
    }

    @Basic
    @Column(name = "b_sales_m_salesman", nullable = true, length = 8)
    public String getbSalesMSalesman() {
        return bSalesMSalesman;
    }

    public void setbSalesMSalesman(String bSalesMSalesman) {
        this.bSalesMSalesman = bSalesMSalesman;
    }

    @Basic
    @Column(name = "b_sales_m_return_date", nullable = true)
    public Timestamp getbSalesMReturnDate() {
        return bSalesMReturnDate;
    }

    public void setbSalesMReturnDate(Timestamp bSalesMReturnDate) {
        this.bSalesMReturnDate = bSalesMReturnDate;
    }

    @Basic
    @Column(name = "b_sales_m_room_confirm_date", nullable = true)
    public Timestamp getbSalesMRoomConfirmDate() {
        return bSalesMRoomConfirmDate;
    }

    public void setbSalesMRoomConfirmDate(Timestamp bSalesMRoomConfirmDate) {
        this.bSalesMRoomConfirmDate = bSalesMRoomConfirmDate;
    }

    @Basic
    @Column(name = "b_sales_m_isPass", nullable = true, length = -1)
    public String getbSalesMIsPass() {
        return bSalesMIsPass;
    }

    public void setbSalesMIsPass(String bSalesMIsPass) {
        this.bSalesMIsPass = bSalesMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSalesMEntity that = (BSalesMEntity) o;

        if (bSalesMSalesNo != null ? !bSalesMSalesNo.equals(that.bSalesMSalesNo) : that.bSalesMSalesNo != null)
            return false;
        if (bSalesMSOrderNo != null ? !bSalesMSOrderNo.equals(that.bSalesMSOrderNo) : that.bSalesMSOrderNo != null)
            return false;
        if (bSalesMHandbillNo != null ? !bSalesMHandbillNo.equals(that.bSalesMHandbillNo) : that.bSalesMHandbillNo != null)
            return false;
        if (bSalesMState != null ? !bSalesMState.equals(that.bSalesMState) : that.bSalesMState != null) return false;
        if (bSalesMCreateDate != null ? !bSalesMCreateDate.equals(that.bSalesMCreateDate) : that.bSalesMCreateDate != null)
            return false;
        if (bSalesMModifiTime != null ? !bSalesMModifiTime.equals(that.bSalesMModifiTime) : that.bSalesMModifiTime != null)
            return false;
        if (bSalesMCheckDate != null ? !bSalesMCheckDate.equals(that.bSalesMCheckDate) : that.bSalesMCheckDate != null)
            return false;
        if (bSalesMNotes != null ? !bSalesMNotes.equals(that.bSalesMNotes) : that.bSalesMNotes != null) return false;
        if (bSalesMPrints != null ? !bSalesMPrints.equals(that.bSalesMPrints) : that.bSalesMPrints != null)
            return false;
        if (bSalesMGroupNodeId != null ? !bSalesMGroupNodeId.equals(that.bSalesMGroupNodeId) : that.bSalesMGroupNodeId != null)
            return false;
        if (bSalesMCreateNo != null ? !bSalesMCreateNo.equals(that.bSalesMCreateNo) : that.bSalesMCreateNo != null)
            return false;
        if (bSalesMModifiNo != null ? !bSalesMModifiNo.equals(that.bSalesMModifiNo) : that.bSalesMModifiNo != null)
            return false;
        if (bSalesMChecker != null ? !bSalesMChecker.equals(that.bSalesMChecker) : that.bSalesMChecker != null)
            return false;
        if (bSalesMSalesman != null ? !bSalesMSalesman.equals(that.bSalesMSalesman) : that.bSalesMSalesman != null)
            return false;
        if (bSalesMReturnDate != null ? !bSalesMReturnDate.equals(that.bSalesMReturnDate) : that.bSalesMReturnDate != null)
            return false;
        if (bSalesMRoomConfirmDate != null ? !bSalesMRoomConfirmDate.equals(that.bSalesMRoomConfirmDate) : that.bSalesMRoomConfirmDate != null)
            return false;
        if (bSalesMIsPass != null ? !bSalesMIsPass.equals(that.bSalesMIsPass) : that.bSalesMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSalesMSalesNo != null ? bSalesMSalesNo.hashCode() : 0;
        result = 31 * result + (bSalesMSOrderNo != null ? bSalesMSOrderNo.hashCode() : 0);
        result = 31 * result + (bSalesMHandbillNo != null ? bSalesMHandbillNo.hashCode() : 0);
        result = 31 * result + (bSalesMState != null ? bSalesMState.hashCode() : 0);
        result = 31 * result + (bSalesMCreateDate != null ? bSalesMCreateDate.hashCode() : 0);
        result = 31 * result + (bSalesMModifiTime != null ? bSalesMModifiTime.hashCode() : 0);
        result = 31 * result + (bSalesMCheckDate != null ? bSalesMCheckDate.hashCode() : 0);
        result = 31 * result + (bSalesMNotes != null ? bSalesMNotes.hashCode() : 0);
        result = 31 * result + (bSalesMPrints != null ? bSalesMPrints.hashCode() : 0);
        result = 31 * result + (bSalesMGroupNodeId != null ? bSalesMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSalesMCreateNo != null ? bSalesMCreateNo.hashCode() : 0);
        result = 31 * result + (bSalesMModifiNo != null ? bSalesMModifiNo.hashCode() : 0);
        result = 31 * result + (bSalesMChecker != null ? bSalesMChecker.hashCode() : 0);
        result = 31 * result + (bSalesMSalesman != null ? bSalesMSalesman.hashCode() : 0);
        result = 31 * result + (bSalesMReturnDate != null ? bSalesMReturnDate.hashCode() : 0);
        result = 31 * result + (bSalesMRoomConfirmDate != null ? bSalesMRoomConfirmDate.hashCode() : 0);
        result = 31 * result + (bSalesMIsPass != null ? bSalesMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bSalesMByBSProcureMSalesNo")
    public Collection<BSProcureMEntity> getbSProcureMSByBSalesMSalesNo() {
        return bSProcureMSByBSalesMSalesNo;
    }

    public void setbSProcureMSByBSalesMSalesNo(Collection<BSProcureMEntity> bSProcureMSByBSalesMSalesNo) {
        this.bSProcureMSByBSalesMSalesNo = bSProcureMSByBSalesMSalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_s_order_no", referencedColumnName = "b_s_order_m_s_order_no",insertable = false, updatable = false)
    public BSOrderMEntity getbSOrderMByBSalesMSOrderNo() {
        return bSOrderMByBSalesMSOrderNo;
    }

    public void setbSOrderMByBSalesMSOrderNo(BSOrderMEntity bSOrderMByBSalesMSOrderNo) {
        this.bSOrderMByBSalesMSOrderNo = bSOrderMByBSalesMSOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBSalesMGroupNodeId() {
        return tOrgByBSalesMGroupNodeId;
    }

    public void settOrgByBSalesMGroupNodeId(TOrgEntity tOrgByBSalesMGroupNodeId) {
        this.tOrgByBSalesMGroupNodeId = tOrgByBSalesMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSalesMCreateNo() {
        return tStaffByBSalesMCreateNo;
    }

    public void settStaffByBSalesMCreateNo(TStaffEntity tStaffByBSalesMCreateNo) {
        this.tStaffByBSalesMCreateNo = tStaffByBSalesMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSalesMModifiNo() {
        return tStaffByBSalesMModifiNo;
    }

    public void settStaffByBSalesMModifiNo(TStaffEntity tStaffByBSalesMModifiNo) {
        this.tStaffByBSalesMModifiNo = tStaffByBSalesMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSalesMChecker() {
        return tStaffByBSalesMChecker;
    }

    public void settStaffByBSalesMChecker(TStaffEntity tStaffByBSalesMChecker) {
        this.tStaffByBSalesMChecker = tStaffByBSalesMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_sales_m_salesman", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBSalesMSalesman() {
        return tStaffByBSalesMSalesman;
    }

    public void settStaffByBSalesMSalesman(TStaffEntity tStaffByBSalesMSalesman) {
        this.tStaffByBSalesMSalesman = tStaffByBSalesMSalesman;
    }
}
