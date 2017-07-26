package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_r_procure_m", schema = "dbo", catalog = "logistics_test")
public class BRProcureMEntity {
    private String bRProcureMRProcureNo;
    private String bRProcureMNotificationNo;
    private String bRProcureMHandbillNo;
    private String bRProcureMPaymentAttributer;
    private String bRProcureMServiceAttribute;
    private BigDecimal bRProcureMSumMoney;
    private String bRProcureMTel;
    private String bRProcureMEMail;
    private String bRProcureMSalesman;
    private String bRProcureMWarehouseKeeper;
    private String bRProcureMDeliverymanNo;
    private String bRProcureMGroupNodeId;
    private String bRProcureMCreateNo;
    private Timestamp bRProcureMCreateDate;
    private String bRProcureMModifiNo;
    private Timestamp bRProcureMModifiTime;
    private String bRProcureMChecker;
    private Timestamp bRProcureMCheckDate;
    private String bRProcureMState;
    private String bRProcureMNotes;
    private Integer bRProcureMPrints;
    private String bRProcureMIsPass;
    private TStaffEntity tStaffByBRProcureMSalesman;
    private TStaffEntity tStaffByBRProcureMWarehouseKeeper;
    private TStaffEntity tStaffByBRProcureMDeliverymanNo;
    private TOrgEntity tOrgByBRProcureMGroupNodeId;
    private TStaffEntity tStaffByBRProcureMCreateNo;
    private TStaffEntity tStaffByBRProcureMModifiNo;
    private TStaffEntity tStaffByBRProcureMChecker;
    private BWProcureEntity bWProcureByBRProcureMRProcureNo;

    @Id
    @Column(name = "b_r_procure_m_r_procure_no", nullable = false, length = 16)
    public String getbRProcureMRProcureNo() {
        return bRProcureMRProcureNo;
    }

    public void setbRProcureMRProcureNo(String bRProcureMRProcureNo) {
        this.bRProcureMRProcureNo = bRProcureMRProcureNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_notification_no", nullable = true, length = 50)
    public String getbRProcureMNotificationNo() {
        return bRProcureMNotificationNo;
    }

    public void setbRProcureMNotificationNo(String bRProcureMNotificationNo) {
        this.bRProcureMNotificationNo = bRProcureMNotificationNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_handbill_no", nullable = true, length = 20)
    public String getbRProcureMHandbillNo() {
        return bRProcureMHandbillNo;
    }

    public void setbRProcureMHandbillNo(String bRProcureMHandbillNo) {
        this.bRProcureMHandbillNo = bRProcureMHandbillNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_payment_attributer", nullable = true, length = 20)
    public String getbRProcureMPaymentAttributer() {
        return bRProcureMPaymentAttributer;
    }

    public void setbRProcureMPaymentAttributer(String bRProcureMPaymentAttributer) {
        this.bRProcureMPaymentAttributer = bRProcureMPaymentAttributer;
    }

    @Basic
    @Column(name = "b_r_procure_m_service_attribute", nullable = true, length = 4)
    public String getbRProcureMServiceAttribute() {
        return bRProcureMServiceAttribute;
    }

    public void setbRProcureMServiceAttribute(String bRProcureMServiceAttribute) {
        this.bRProcureMServiceAttribute = bRProcureMServiceAttribute;
    }

    @Basic
    @Column(name = "b_r_procure_m_sum_money", nullable = true, precision = 4)
    public BigDecimal getbRProcureMSumMoney() {
        return bRProcureMSumMoney;
    }

    public void setbRProcureMSumMoney(BigDecimal bRProcureMSumMoney) {
        this.bRProcureMSumMoney = bRProcureMSumMoney;
    }

    @Basic
    @Column(name = "b_r_procure_m_tel", nullable = true, length = 30)
    public String getbRProcureMTel() {
        return bRProcureMTel;
    }

    public void setbRProcureMTel(String bRProcureMTel) {
        this.bRProcureMTel = bRProcureMTel;
    }

    @Basic
    @Column(name = "b_r_procure_m_e_mail", nullable = true, length = 100)
    public String getbRProcureMEMail() {
        return bRProcureMEMail;
    }

    public void setbRProcureMEMail(String bRProcureMEMail) {
        this.bRProcureMEMail = bRProcureMEMail;
    }

    @Basic
    @Column(name = "b_r_procure_m_salesman", nullable = true, length = 8)
    public String getbRProcureMSalesman() {
        return bRProcureMSalesman;
    }

    public void setbRProcureMSalesman(String bRProcureMSalesman) {
        this.bRProcureMSalesman = bRProcureMSalesman;
    }

    @Basic
    @Column(name = "b_r_procure_m_warehouse_keeper", nullable = true, length = 8)
    public String getbRProcureMWarehouseKeeper() {
        return bRProcureMWarehouseKeeper;
    }

    public void setbRProcureMWarehouseKeeper(String bRProcureMWarehouseKeeper) {
        this.bRProcureMWarehouseKeeper = bRProcureMWarehouseKeeper;
    }

    @Basic
    @Column(name = "b_r_procure_m_deliveryman_no", nullable = true, length = 8)
    public String getbRProcureMDeliverymanNo() {
        return bRProcureMDeliverymanNo;
    }

    public void setbRProcureMDeliverymanNo(String bRProcureMDeliverymanNo) {
        this.bRProcureMDeliverymanNo = bRProcureMDeliverymanNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_group_node_id", nullable = true, length = 20)
    public String getbRProcureMGroupNodeId() {
        return bRProcureMGroupNodeId;
    }

    public void setbRProcureMGroupNodeId(String bRProcureMGroupNodeId) {
        this.bRProcureMGroupNodeId = bRProcureMGroupNodeId;
    }

    @Basic
    @Column(name = "b_r_procure_m_create_no", nullable = true, length = 8)
    public String getbRProcureMCreateNo() {
        return bRProcureMCreateNo;
    }

    public void setbRProcureMCreateNo(String bRProcureMCreateNo) {
        this.bRProcureMCreateNo = bRProcureMCreateNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_create_date", nullable = true)
    public Timestamp getbRProcureMCreateDate() {
        return bRProcureMCreateDate;
    }

    public void setbRProcureMCreateDate(Timestamp bRProcureMCreateDate) {
        this.bRProcureMCreateDate = bRProcureMCreateDate;
    }

    @Basic
    @Column(name = "b_r_procure_m_modifi_no", nullable = true, length = 8)
    public String getbRProcureMModifiNo() {
        return bRProcureMModifiNo;
    }

    public void setbRProcureMModifiNo(String bRProcureMModifiNo) {
        this.bRProcureMModifiNo = bRProcureMModifiNo;
    }

    @Basic
    @Column(name = "b_r_procure_m_modifi_time", nullable = true)
    public Timestamp getbRProcureMModifiTime() {
        return bRProcureMModifiTime;
    }

    public void setbRProcureMModifiTime(Timestamp bRProcureMModifiTime) {
        this.bRProcureMModifiTime = bRProcureMModifiTime;
    }

    @Basic
    @Column(name = "b_r_procure_m_checker", nullable = true, length = 8)
    public String getbRProcureMChecker() {
        return bRProcureMChecker;
    }

    public void setbRProcureMChecker(String bRProcureMChecker) {
        this.bRProcureMChecker = bRProcureMChecker;
    }

    @Basic
    @Column(name = "b_r_procure_m_check_date", nullable = true)
    public Timestamp getbRProcureMCheckDate() {
        return bRProcureMCheckDate;
    }

    public void setbRProcureMCheckDate(Timestamp bRProcureMCheckDate) {
        this.bRProcureMCheckDate = bRProcureMCheckDate;
    }

    @Basic
    @Column(name = "b_r_procure_m_state", nullable = true, length = 1)
    public String getbRProcureMState() {
        return bRProcureMState;
    }

    public void setbRProcureMState(String bRProcureMState) {
        this.bRProcureMState = bRProcureMState;
    }

    @Basic
    @Column(name = "b_r_procure_m_notes", nullable = true, length = 200)
    public String getbRProcureMNotes() {
        return bRProcureMNotes;
    }

    public void setbRProcureMNotes(String bRProcureMNotes) {
        this.bRProcureMNotes = bRProcureMNotes;
    }

    @Basic
    @Column(name = "b_r_procure_m_prints", nullable = true)
    public Integer getbRProcureMPrints() {
        return bRProcureMPrints;
    }

    public void setbRProcureMPrints(Integer bRProcureMPrints) {
        this.bRProcureMPrints = bRProcureMPrints;
    }

    @Basic
    @Column(name = "b_r_procure_m_isPass", nullable = true, length = 1)
    public String getbRProcureMIsPass() {
        return bRProcureMIsPass;
    }

    public void setbRProcureMIsPass(String bRProcureMIsPass) {
        this.bRProcureMIsPass = bRProcureMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BRProcureMEntity that = (BRProcureMEntity) o;

        if (bRProcureMRProcureNo != null ? !bRProcureMRProcureNo.equals(that.bRProcureMRProcureNo) : that.bRProcureMRProcureNo != null)
            return false;
        if (bRProcureMNotificationNo != null ? !bRProcureMNotificationNo.equals(that.bRProcureMNotificationNo) : that.bRProcureMNotificationNo != null)
            return false;
        if (bRProcureMHandbillNo != null ? !bRProcureMHandbillNo.equals(that.bRProcureMHandbillNo) : that.bRProcureMHandbillNo != null)
            return false;
        if (bRProcureMPaymentAttributer != null ? !bRProcureMPaymentAttributer.equals(that.bRProcureMPaymentAttributer) : that.bRProcureMPaymentAttributer != null)
            return false;
        if (bRProcureMServiceAttribute != null ? !bRProcureMServiceAttribute.equals(that.bRProcureMServiceAttribute) : that.bRProcureMServiceAttribute != null)
            return false;
        if (bRProcureMSumMoney != null ? !bRProcureMSumMoney.equals(that.bRProcureMSumMoney) : that.bRProcureMSumMoney != null)
            return false;
        if (bRProcureMTel != null ? !bRProcureMTel.equals(that.bRProcureMTel) : that.bRProcureMTel != null)
            return false;
        if (bRProcureMEMail != null ? !bRProcureMEMail.equals(that.bRProcureMEMail) : that.bRProcureMEMail != null)
            return false;
        if (bRProcureMSalesman != null ? !bRProcureMSalesman.equals(that.bRProcureMSalesman) : that.bRProcureMSalesman != null)
            return false;
        if (bRProcureMWarehouseKeeper != null ? !bRProcureMWarehouseKeeper.equals(that.bRProcureMWarehouseKeeper) : that.bRProcureMWarehouseKeeper != null)
            return false;
        if (bRProcureMDeliverymanNo != null ? !bRProcureMDeliverymanNo.equals(that.bRProcureMDeliverymanNo) : that.bRProcureMDeliverymanNo != null)
            return false;
        if (bRProcureMGroupNodeId != null ? !bRProcureMGroupNodeId.equals(that.bRProcureMGroupNodeId) : that.bRProcureMGroupNodeId != null)
            return false;
        if (bRProcureMCreateNo != null ? !bRProcureMCreateNo.equals(that.bRProcureMCreateNo) : that.bRProcureMCreateNo != null)
            return false;
        if (bRProcureMCreateDate != null ? !bRProcureMCreateDate.equals(that.bRProcureMCreateDate) : that.bRProcureMCreateDate != null)
            return false;
        if (bRProcureMModifiNo != null ? !bRProcureMModifiNo.equals(that.bRProcureMModifiNo) : that.bRProcureMModifiNo != null)
            return false;
        if (bRProcureMModifiTime != null ? !bRProcureMModifiTime.equals(that.bRProcureMModifiTime) : that.bRProcureMModifiTime != null)
            return false;
        if (bRProcureMChecker != null ? !bRProcureMChecker.equals(that.bRProcureMChecker) : that.bRProcureMChecker != null)
            return false;
        if (bRProcureMCheckDate != null ? !bRProcureMCheckDate.equals(that.bRProcureMCheckDate) : that.bRProcureMCheckDate != null)
            return false;
        if (bRProcureMState != null ? !bRProcureMState.equals(that.bRProcureMState) : that.bRProcureMState != null)
            return false;
        if (bRProcureMNotes != null ? !bRProcureMNotes.equals(that.bRProcureMNotes) : that.bRProcureMNotes != null)
            return false;
        if (bRProcureMPrints != null ? !bRProcureMPrints.equals(that.bRProcureMPrints) : that.bRProcureMPrints != null)
            return false;
        if (bRProcureMIsPass != null ? !bRProcureMIsPass.equals(that.bRProcureMIsPass) : that.bRProcureMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bRProcureMRProcureNo != null ? bRProcureMRProcureNo.hashCode() : 0;
        result = 31 * result + (bRProcureMNotificationNo != null ? bRProcureMNotificationNo.hashCode() : 0);
        result = 31 * result + (bRProcureMHandbillNo != null ? bRProcureMHandbillNo.hashCode() : 0);
        result = 31 * result + (bRProcureMPaymentAttributer != null ? bRProcureMPaymentAttributer.hashCode() : 0);
        result = 31 * result + (bRProcureMServiceAttribute != null ? bRProcureMServiceAttribute.hashCode() : 0);
        result = 31 * result + (bRProcureMSumMoney != null ? bRProcureMSumMoney.hashCode() : 0);
        result = 31 * result + (bRProcureMTel != null ? bRProcureMTel.hashCode() : 0);
        result = 31 * result + (bRProcureMEMail != null ? bRProcureMEMail.hashCode() : 0);
        result = 31 * result + (bRProcureMSalesman != null ? bRProcureMSalesman.hashCode() : 0);
        result = 31 * result + (bRProcureMWarehouseKeeper != null ? bRProcureMWarehouseKeeper.hashCode() : 0);
        result = 31 * result + (bRProcureMDeliverymanNo != null ? bRProcureMDeliverymanNo.hashCode() : 0);
        result = 31 * result + (bRProcureMGroupNodeId != null ? bRProcureMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bRProcureMCreateNo != null ? bRProcureMCreateNo.hashCode() : 0);
        result = 31 * result + (bRProcureMCreateDate != null ? bRProcureMCreateDate.hashCode() : 0);
        result = 31 * result + (bRProcureMModifiNo != null ? bRProcureMModifiNo.hashCode() : 0);
        result = 31 * result + (bRProcureMModifiTime != null ? bRProcureMModifiTime.hashCode() : 0);
        result = 31 * result + (bRProcureMChecker != null ? bRProcureMChecker.hashCode() : 0);
        result = 31 * result + (bRProcureMCheckDate != null ? bRProcureMCheckDate.hashCode() : 0);
        result = 31 * result + (bRProcureMState != null ? bRProcureMState.hashCode() : 0);
        result = 31 * result + (bRProcureMNotes != null ? bRProcureMNotes.hashCode() : 0);
        result = 31 * result + (bRProcureMPrints != null ? bRProcureMPrints.hashCode() : 0);
        result = 31 * result + (bRProcureMIsPass != null ? bRProcureMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMSalesman() {
        return tStaffByBRProcureMSalesman;
    }

    public void settStaffByBRProcureMSalesman(TStaffEntity tStaffByBRProcureMSalesman) {
        this.tStaffByBRProcureMSalesman = tStaffByBRProcureMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_warehouse_keeper", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMWarehouseKeeper() {
        return tStaffByBRProcureMWarehouseKeeper;
    }

    public void settStaffByBRProcureMWarehouseKeeper(TStaffEntity tStaffByBRProcureMWarehouseKeeper) {
        this.tStaffByBRProcureMWarehouseKeeper = tStaffByBRProcureMWarehouseKeeper;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_deliveryman_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMDeliverymanNo() {
        return tStaffByBRProcureMDeliverymanNo;
    }

    public void settStaffByBRProcureMDeliverymanNo(TStaffEntity tStaffByBRProcureMDeliverymanNo) {
        this.tStaffByBRProcureMDeliverymanNo = tStaffByBRProcureMDeliverymanNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByBRProcureMGroupNodeId() {
        return tOrgByBRProcureMGroupNodeId;
    }

    public void settOrgByBRProcureMGroupNodeId(TOrgEntity tOrgByBRProcureMGroupNodeId) {
        this.tOrgByBRProcureMGroupNodeId = tOrgByBRProcureMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMCreateNo() {
        return tStaffByBRProcureMCreateNo;
    }

    public void settStaffByBRProcureMCreateNo(TStaffEntity tStaffByBRProcureMCreateNo) {
        this.tStaffByBRProcureMCreateNo = tStaffByBRProcureMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMModifiNo() {
        return tStaffByBRProcureMModifiNo;
    }

    public void settStaffByBRProcureMModifiNo(TStaffEntity tStaffByBRProcureMModifiNo) {
        this.tStaffByBRProcureMModifiNo = tStaffByBRProcureMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_r_procure_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBRProcureMChecker() {
        return tStaffByBRProcureMChecker;
    }

    public void settStaffByBRProcureMChecker(TStaffEntity tStaffByBRProcureMChecker) {
        this.tStaffByBRProcureMChecker = tStaffByBRProcureMChecker;
    }

    @OneToOne(mappedBy = "bRProcureMByBWProcureRProcureNo")
    public BWProcureEntity getbWProcureByBRProcureMRProcureNo() {
        return bWProcureByBRProcureMRProcureNo;
    }

    public void setbWProcureByBRProcureMRProcureNo(BWProcureEntity bWProcureByBRProcureMRProcureNo) {
        this.bWProcureByBRProcureMRProcureNo = bWProcureByBRProcureMRProcureNo;
    }
}
