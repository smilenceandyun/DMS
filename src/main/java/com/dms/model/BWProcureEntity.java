package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "b_w_procure", schema = "dbo", catalog = "logistics_test")
public class BWProcureEntity {
    private String bWProcureRProcureNo;
    private String bWProcureConfirmReturn;
    private Timestamp bWProcureCreateDate;
    private String bWProcureCreateNo;
    private String bWProcureModifiNo;
    private Timestamp bWProcureModifiTime;
    private BRProcureMEntity bRProcureMByBWProcureRProcureNo;
    private TStaffEntity tStaffByBWProcureCreateNo;
    private TStaffEntity tStaffByBWProcureModifiNo;

    @Id
    @Column(name = "b_w_procure_r_procure_no", nullable = false, length = 16)
    public String getbWProcureRProcureNo() {
        return bWProcureRProcureNo;
    }

    public void setbWProcureRProcureNo(String bWProcureRProcureNo) {
        this.bWProcureRProcureNo = bWProcureRProcureNo;
    }

    @Basic
    @Column(name = "b_w_procure_confirm_return", nullable = false, length = 1)
    public String getbWProcureConfirmReturn() {
        return bWProcureConfirmReturn;
    }

    public void setbWProcureConfirmReturn(String bWProcureConfirmReturn) {
        this.bWProcureConfirmReturn = bWProcureConfirmReturn;
    }

    @Basic
    @Column(name = "b_w_procure_create_date", nullable = true)
    public Timestamp getbWProcureCreateDate() {
        return bWProcureCreateDate;
    }

    public void setbWProcureCreateDate(Timestamp bWProcureCreateDate) {
        this.bWProcureCreateDate = bWProcureCreateDate;
    }

    @Basic
    @Column(name = "b_w_procure_create_no", nullable = true, length = 8)
    public String getbWProcureCreateNo() {
        return bWProcureCreateNo;
    }

    public void setbWProcureCreateNo(String bWProcureCreateNo) {
        this.bWProcureCreateNo = bWProcureCreateNo;
    }

    @Basic
    @Column(name = "b_w_procure_modifi_no", nullable = true, length = 8)
    public String getbWProcureModifiNo() {
        return bWProcureModifiNo;
    }

    public void setbWProcureModifiNo(String bWProcureModifiNo) {
        this.bWProcureModifiNo = bWProcureModifiNo;
    }

    @Basic
    @Column(name = "b_w_procure_modifi_time", nullable = true)
    public Timestamp getbWProcureModifiTime() {
        return bWProcureModifiTime;
    }

    public void setbWProcureModifiTime(Timestamp bWProcureModifiTime) {
        this.bWProcureModifiTime = bWProcureModifiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BWProcureEntity that = (BWProcureEntity) o;

        if (bWProcureRProcureNo != null ? !bWProcureRProcureNo.equals(that.bWProcureRProcureNo) : that.bWProcureRProcureNo != null)
            return false;
        if (bWProcureConfirmReturn != null ? !bWProcureConfirmReturn.equals(that.bWProcureConfirmReturn) : that.bWProcureConfirmReturn != null)
            return false;
        if (bWProcureCreateDate != null ? !bWProcureCreateDate.equals(that.bWProcureCreateDate) : that.bWProcureCreateDate != null)
            return false;
        if (bWProcureCreateNo != null ? !bWProcureCreateNo.equals(that.bWProcureCreateNo) : that.bWProcureCreateNo != null)
            return false;
        if (bWProcureModifiNo != null ? !bWProcureModifiNo.equals(that.bWProcureModifiNo) : that.bWProcureModifiNo != null)
            return false;
        if (bWProcureModifiTime != null ? !bWProcureModifiTime.equals(that.bWProcureModifiTime) : that.bWProcureModifiTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bWProcureRProcureNo != null ? bWProcureRProcureNo.hashCode() : 0;
        result = 31 * result + (bWProcureConfirmReturn != null ? bWProcureConfirmReturn.hashCode() : 0);
        result = 31 * result + (bWProcureCreateDate != null ? bWProcureCreateDate.hashCode() : 0);
        result = 31 * result + (bWProcureCreateNo != null ? bWProcureCreateNo.hashCode() : 0);
        result = 31 * result + (bWProcureModifiNo != null ? bWProcureModifiNo.hashCode() : 0);
        result = 31 * result + (bWProcureModifiTime != null ? bWProcureModifiTime.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "b_w_procure_r_procure_no", referencedColumnName = "b_r_procure_m_r_procure_no", nullable = false)
    public BRProcureMEntity getbRProcureMByBWProcureRProcureNo() {
        return bRProcureMByBWProcureRProcureNo;
    }

    public void setbRProcureMByBWProcureRProcureNo(BRProcureMEntity bRProcureMByBWProcureRProcureNo) {
        this.bRProcureMByBWProcureRProcureNo = bRProcureMByBWProcureRProcureNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_w_procure_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBWProcureCreateNo() {
        return tStaffByBWProcureCreateNo;
    }

    public void settStaffByBWProcureCreateNo(TStaffEntity tStaffByBWProcureCreateNo) {
        this.tStaffByBWProcureCreateNo = tStaffByBWProcureCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_w_procure_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBWProcureModifiNo() {
        return tStaffByBWProcureModifiNo;
    }

    public void settStaffByBWProcureModifiNo(TStaffEntity tStaffByBWProcureModifiNo) {
        this.tStaffByBWProcureModifiNo = tStaffByBWProcureModifiNo;
    }
}
