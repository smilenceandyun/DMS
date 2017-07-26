package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "b_s_procure_m", schema = "dbo", catalog = "logistics_test")
public class BSProcureMEntity {
    private String bSProcureMBackBillNo;
    private String bSProcureMBackType;
    private Timestamp bSProcureMRoomConfirmDate;
    private Timestamp bSProcureMBackDate;
    private String bSProcureMSalesNo;
    private String bSProcureMSOrderNo;
    private String bSProcureMState;
    private Timestamp bSProcureMCreateDate;
    private String bSProcureMSalesman;
    private String bSProcureMCreateNo;
    private String bSProcureMModifiNo;
    private String bSProcureMChecker;
    private Timestamp bSProcureMModifiTime;
    private Timestamp bSProcureMCheckDate;
    private String bSProcureMNotes;
    private String bSProcureMGroupNodeId;
    private String bSProcureMIsPass;
    private BSalesMEntity bSalesMByBSProcureMSalesNo;
    private BSOrderMEntity bSOrderMByBSProcureMSOrderNo;
    private TStaffEntity tStaffByBSProcureMSalesman;
    private TStaffEntity tStaffByBSProcureMCreateNo;
    private TStaffEntity tStaffByBSProcureMModifiNo;
    private TStaffEntity tStaffByBSProcureMChecker;
    private TOrgEntity tOrgByBSProcureMGroupNodeId;

    @Id
    @Column(name = "b_s_procure_m_back_bill_no", nullable = false, length = 16)
    public String getbSProcureMBackBillNo() {
        return bSProcureMBackBillNo;
    }

    public void setbSProcureMBackBillNo(String bSProcureMBackBillNo) {
        this.bSProcureMBackBillNo = bSProcureMBackBillNo;
    }

    @Basic
    @Column(name = "b_s_procure_m_back_type", nullable = true, length = 50)
    public String getbSProcureMBackType() {
        return bSProcureMBackType;
    }

    public void setbSProcureMBackType(String bSProcureMBackType) {
        this.bSProcureMBackType = bSProcureMBackType;
    }

    @Basic
    @Column(name = "b_s_procure_m_room_confirm_date", nullable = true)
    public Timestamp getbSProcureMRoomConfirmDate() {
        return bSProcureMRoomConfirmDate;
    }

    public void setbSProcureMRoomConfirmDate(Timestamp bSProcureMRoomConfirmDate) {
        this.bSProcureMRoomConfirmDate = bSProcureMRoomConfirmDate;
    }

    @Basic
    @Column(name = "b_s_procure_m_back_date", nullable = true)
    public Timestamp getbSProcureMBackDate() {
        return bSProcureMBackDate;
    }

    public void setbSProcureMBackDate(Timestamp bSProcureMBackDate) {
        this.bSProcureMBackDate = bSProcureMBackDate;
    }

    @Basic
    @Column(name = "b_s_procure_m_sales_no", nullable = false, length = 16)
    public String getbSProcureMSalesNo() {
        return bSProcureMSalesNo;
    }

    public void setbSProcureMSalesNo(String bSProcureMSalesNo) {
        this.bSProcureMSalesNo = bSProcureMSalesNo;
    }

    @Basic
    @Column(name = "b_s_procure_m_s_order_no", nullable = true, length = 16)
    public String getbSProcureMSOrderNo() {
        return bSProcureMSOrderNo;
    }

    public void setbSProcureMSOrderNo(String bSProcureMSOrderNo) {
        this.bSProcureMSOrderNo = bSProcureMSOrderNo;
    }

    @Basic
    @Column(name = "b_s_procure_m_state", nullable = true, length = 1)
    public String getbSProcureMState() {
        return bSProcureMState;
    }

    public void setbSProcureMState(String bSProcureMState) {
        this.bSProcureMState = bSProcureMState;
    }

    @Basic
    @Column(name = "b_s_procure_m_create_date", nullable = true)
    public Timestamp getbSProcureMCreateDate() {
        return bSProcureMCreateDate;
    }

    public void setbSProcureMCreateDate(Timestamp bSProcureMCreateDate) {
        this.bSProcureMCreateDate = bSProcureMCreateDate;
    }

    @Basic
    @Column(name = "b_s_procure_m_salesman", nullable = true, length = 8)
    public String getbSProcureMSalesman() {
        return bSProcureMSalesman;
    }

    public void setbSProcureMSalesman(String bSProcureMSalesman) {
        this.bSProcureMSalesman = bSProcureMSalesman;
    }

    @Basic
    @Column(name = "b_s_procure_m_create_no", nullable = true, length = 8)
    public String getbSProcureMCreateNo() {
        return bSProcureMCreateNo;
    }

    public void setbSProcureMCreateNo(String bSProcureMCreateNo) {
        this.bSProcureMCreateNo = bSProcureMCreateNo;
    }

    @Basic
    @Column(name = "b_s_procure_m_modifi_no", nullable = true, length = 8)
    public String getbSProcureMModifiNo() {
        return bSProcureMModifiNo;
    }

    public void setbSProcureMModifiNo(String bSProcureMModifiNo) {
        this.bSProcureMModifiNo = bSProcureMModifiNo;
    }

    @Basic
    @Column(name = "b_s_procure_m_checker", nullable = true, length = 8)
    public String getbSProcureMChecker() {
        return bSProcureMChecker;
    }

    public void setbSProcureMChecker(String bSProcureMChecker) {
        this.bSProcureMChecker = bSProcureMChecker;
    }

    @Basic
    @Column(name = "b_s_procure_m_modifi_time", nullable = true)
    public Timestamp getbSProcureMModifiTime() {
        return bSProcureMModifiTime;
    }

    public void setbSProcureMModifiTime(Timestamp bSProcureMModifiTime) {
        this.bSProcureMModifiTime = bSProcureMModifiTime;
    }

    @Basic
    @Column(name = "b_s_procure_m_check_date", nullable = true)
    public Timestamp getbSProcureMCheckDate() {
        return bSProcureMCheckDate;
    }

    public void setbSProcureMCheckDate(Timestamp bSProcureMCheckDate) {
        this.bSProcureMCheckDate = bSProcureMCheckDate;
    }

    @Basic
    @Column(name = "b_s_procure_m_notes", nullable = true, length = 200)
    public String getbSProcureMNotes() {
        return bSProcureMNotes;
    }

    public void setbSProcureMNotes(String bSProcureMNotes) {
        this.bSProcureMNotes = bSProcureMNotes;
    }

    @Basic
    @Column(name = "b_s_procure_m_group_node_id", nullable = false, length = 20)
    public String getbSProcureMGroupNodeId() {
        return bSProcureMGroupNodeId;
    }

    public void setbSProcureMGroupNodeId(String bSProcureMGroupNodeId) {
        this.bSProcureMGroupNodeId = bSProcureMGroupNodeId;
    }

    @Basic
    @Column(name = "b_s_procure_m_isPass", nullable = true, length = 1)
    public String getbSProcureMIsPass() {
        return bSProcureMIsPass;
    }

    public void setbSProcureMIsPass(String bSProcureMIsPass) {
        this.bSProcureMIsPass = bSProcureMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSProcureMEntity that = (BSProcureMEntity) o;

        if (bSProcureMBackBillNo != null ? !bSProcureMBackBillNo.equals(that.bSProcureMBackBillNo) : that.bSProcureMBackBillNo != null)
            return false;
        if (bSProcureMBackType != null ? !bSProcureMBackType.equals(that.bSProcureMBackType) : that.bSProcureMBackType != null)
            return false;
        if (bSProcureMRoomConfirmDate != null ? !bSProcureMRoomConfirmDate.equals(that.bSProcureMRoomConfirmDate) : that.bSProcureMRoomConfirmDate != null)
            return false;
        if (bSProcureMBackDate != null ? !bSProcureMBackDate.equals(that.bSProcureMBackDate) : that.bSProcureMBackDate != null)
            return false;
        if (bSProcureMSalesNo != null ? !bSProcureMSalesNo.equals(that.bSProcureMSalesNo) : that.bSProcureMSalesNo != null)
            return false;
        if (bSProcureMSOrderNo != null ? !bSProcureMSOrderNo.equals(that.bSProcureMSOrderNo) : that.bSProcureMSOrderNo != null)
            return false;
        if (bSProcureMState != null ? !bSProcureMState.equals(that.bSProcureMState) : that.bSProcureMState != null)
            return false;
        if (bSProcureMCreateDate != null ? !bSProcureMCreateDate.equals(that.bSProcureMCreateDate) : that.bSProcureMCreateDate != null)
            return false;
        if (bSProcureMSalesman != null ? !bSProcureMSalesman.equals(that.bSProcureMSalesman) : that.bSProcureMSalesman != null)
            return false;
        if (bSProcureMCreateNo != null ? !bSProcureMCreateNo.equals(that.bSProcureMCreateNo) : that.bSProcureMCreateNo != null)
            return false;
        if (bSProcureMModifiNo != null ? !bSProcureMModifiNo.equals(that.bSProcureMModifiNo) : that.bSProcureMModifiNo != null)
            return false;
        if (bSProcureMChecker != null ? !bSProcureMChecker.equals(that.bSProcureMChecker) : that.bSProcureMChecker != null)
            return false;
        if (bSProcureMModifiTime != null ? !bSProcureMModifiTime.equals(that.bSProcureMModifiTime) : that.bSProcureMModifiTime != null)
            return false;
        if (bSProcureMCheckDate != null ? !bSProcureMCheckDate.equals(that.bSProcureMCheckDate) : that.bSProcureMCheckDate != null)
            return false;
        if (bSProcureMNotes != null ? !bSProcureMNotes.equals(that.bSProcureMNotes) : that.bSProcureMNotes != null)
            return false;
        if (bSProcureMGroupNodeId != null ? !bSProcureMGroupNodeId.equals(that.bSProcureMGroupNodeId) : that.bSProcureMGroupNodeId != null)
            return false;
        if (bSProcureMIsPass != null ? !bSProcureMIsPass.equals(that.bSProcureMIsPass) : that.bSProcureMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSProcureMBackBillNo != null ? bSProcureMBackBillNo.hashCode() : 0;
        result = 31 * result + (bSProcureMBackType != null ? bSProcureMBackType.hashCode() : 0);
        result = 31 * result + (bSProcureMRoomConfirmDate != null ? bSProcureMRoomConfirmDate.hashCode() : 0);
        result = 31 * result + (bSProcureMBackDate != null ? bSProcureMBackDate.hashCode() : 0);
        result = 31 * result + (bSProcureMSalesNo != null ? bSProcureMSalesNo.hashCode() : 0);
        result = 31 * result + (bSProcureMSOrderNo != null ? bSProcureMSOrderNo.hashCode() : 0);
        result = 31 * result + (bSProcureMState != null ? bSProcureMState.hashCode() : 0);
        result = 31 * result + (bSProcureMCreateDate != null ? bSProcureMCreateDate.hashCode() : 0);
        result = 31 * result + (bSProcureMSalesman != null ? bSProcureMSalesman.hashCode() : 0);
        result = 31 * result + (bSProcureMCreateNo != null ? bSProcureMCreateNo.hashCode() : 0);
        result = 31 * result + (bSProcureMModifiNo != null ? bSProcureMModifiNo.hashCode() : 0);
        result = 31 * result + (bSProcureMChecker != null ? bSProcureMChecker.hashCode() : 0);
        result = 31 * result + (bSProcureMModifiTime != null ? bSProcureMModifiTime.hashCode() : 0);
        result = 31 * result + (bSProcureMCheckDate != null ? bSProcureMCheckDate.hashCode() : 0);
        result = 31 * result + (bSProcureMNotes != null ? bSProcureMNotes.hashCode() : 0);
        result = 31 * result + (bSProcureMGroupNodeId != null ? bSProcureMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSProcureMIsPass != null ? bSProcureMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_sales_no", referencedColumnName = "b_sales_m_sales_no", nullable = false)
    public BSalesMEntity getbSalesMByBSProcureMSalesNo() {
        return bSalesMByBSProcureMSalesNo;
    }

    public void setbSalesMByBSProcureMSalesNo(BSalesMEntity bSalesMByBSProcureMSalesNo) {
        this.bSalesMByBSProcureMSalesNo = bSalesMByBSProcureMSalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_s_order_no", referencedColumnName = "b_s_order_m_s_order_no")
    public BSOrderMEntity getbSOrderMByBSProcureMSOrderNo() {
        return bSOrderMByBSProcureMSOrderNo;
    }

    public void setbSOrderMByBSProcureMSOrderNo(BSOrderMEntity bSOrderMByBSProcureMSOrderNo) {
        this.bSOrderMByBSProcureMSOrderNo = bSOrderMByBSProcureMSOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSProcureMSalesman() {
        return tStaffByBSProcureMSalesman;
    }

    public void settStaffByBSProcureMSalesman(TStaffEntity tStaffByBSProcureMSalesman) {
        this.tStaffByBSProcureMSalesman = tStaffByBSProcureMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSProcureMCreateNo() {
        return tStaffByBSProcureMCreateNo;
    }

    public void settStaffByBSProcureMCreateNo(TStaffEntity tStaffByBSProcureMCreateNo) {
        this.tStaffByBSProcureMCreateNo = tStaffByBSProcureMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSProcureMModifiNo() {
        return tStaffByBSProcureMModifiNo;
    }

    public void settStaffByBSProcureMModifiNo(TStaffEntity tStaffByBSProcureMModifiNo) {
        this.tStaffByBSProcureMModifiNo = tStaffByBSProcureMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSProcureMChecker() {
        return tStaffByBSProcureMChecker;
    }

    public void settStaffByBSProcureMChecker(TStaffEntity tStaffByBSProcureMChecker) {
        this.tStaffByBSProcureMChecker = tStaffByBSProcureMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_procure_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBSProcureMGroupNodeId() {
        return tOrgByBSProcureMGroupNodeId;
    }

    public void settOrgByBSProcureMGroupNodeId(TOrgEntity tOrgByBSProcureMGroupNodeId) {
        this.tOrgByBSProcureMGroupNodeId = tOrgByBSProcureMGroupNodeId;
    }
}
