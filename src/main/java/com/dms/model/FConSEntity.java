package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "f_con_s", schema = "dbo", catalog = "logistics_test")
@IdClass(FConSEntityPK.class)
public class FConSEntity {
    private String fConSSConBillno;
    private Timestamp fConSCreateDate;
    private Timestamp fConSModifiTime;
    private int fConSDetailId;
    private String fConSState;
    private String fConSCreateNo;
    private String fConSModifiNo;
    private String fConSChecker;
    private String fConSGroupNodeId;
    private Timestamp fConSCheckDate;
    private String fConSNotes;
    private String fConSFeeNo;
    private BigDecimal fConSPayAmount;
    private String fConSPayDescribe;
    private BigDecimal fConSFactoryRegisterFee;
    private BigDecimal fConSFactoryReturnFee;
    private BigDecimal fConSClientDeductFee;
    private String fConSIsPass;
    private FConMEntity fConMByFConSSConBillno;
    private TStaffEntity tStaffByFConSCreateNo;
    private TStaffEntity tStaffByFConSModifiNo;
    private TStaffEntity tStaffByFConSChecker;
    private TOrgEntity tOrgByFConSGroupNodeId;
    private FeeClassEntity feeClassByFConSFeeNo;

    @Id
    @Column(name = "f_con_s_s_con_billno", nullable = false, length = 16)
    public String getfConSSConBillno() {
        return fConSSConBillno;
    }

    public void setfConSSConBillno(String fConSSConBillno) {
        this.fConSSConBillno = fConSSConBillno;
    }

    @Basic
    @Column(name = "f_con_s_create_date", nullable = true)
    public Timestamp getfConSCreateDate() {
        return fConSCreateDate;
    }

    public void setfConSCreateDate(Timestamp fConSCreateDate) {
        this.fConSCreateDate = fConSCreateDate;
    }

    @Basic
    @Column(name = "f_con_s_modifi_time", nullable = true)
    public Timestamp getfConSModifiTime() {
        return fConSModifiTime;
    }

    public void setfConSModifiTime(Timestamp fConSModifiTime) {
        this.fConSModifiTime = fConSModifiTime;
    }

    @Id
    @Column(name = "f_con_s_detail_id", nullable = false)
    public int getfConSDetailId() {
        return fConSDetailId;
    }

    public void setfConSDetailId(int fConSDetailId) {
        this.fConSDetailId = fConSDetailId;
    }

    @Basic
    @Column(name = "f_con_s_state", nullable = true, length = 1)
    public String getfConSState() {
        return fConSState;
    }

    public void setfConSState(String fConSState) {
        this.fConSState = fConSState;
    }

    @Basic
    @Column(name = "f_con_s_create_no", nullable = true, length = 8)
    public String getfConSCreateNo() {
        return fConSCreateNo;
    }

    public void setfConSCreateNo(String fConSCreateNo) {
        this.fConSCreateNo = fConSCreateNo;
    }

    @Basic
    @Column(name = "f_con_s_modifi_no", nullable = true, length = 8)
    public String getfConSModifiNo() {
        return fConSModifiNo;
    }

    public void setfConSModifiNo(String fConSModifiNo) {
        this.fConSModifiNo = fConSModifiNo;
    }

    @Basic
    @Column(name = "f_con_s_checker", nullable = true, length = 8)
    public String getfConSChecker() {
        return fConSChecker;
    }

    public void setfConSChecker(String fConSChecker) {
        this.fConSChecker = fConSChecker;
    }

    @Basic
    @Column(name = "f_con_s_group_node_id", nullable = true, length = 20)
    public String getfConSGroupNodeId() {
        return fConSGroupNodeId;
    }

    public void setfConSGroupNodeId(String fConSGroupNodeId) {
        this.fConSGroupNodeId = fConSGroupNodeId;
    }

    @Basic
    @Column(name = "f_con_s_check_date", nullable = true)
    public Timestamp getfConSCheckDate() {
        return fConSCheckDate;
    }

    public void setfConSCheckDate(Timestamp fConSCheckDate) {
        this.fConSCheckDate = fConSCheckDate;
    }

    @Basic
    @Column(name = "f_con_s_notes", nullable = true, length = 200)
    public String getfConSNotes() {
        return fConSNotes;
    }

    public void setfConSNotes(String fConSNotes) {
        this.fConSNotes = fConSNotes;
    }

    @Basic
    @Column(name = "f_con_s_fee_no", nullable = true, length = 4)
    public String getfConSFeeNo() {
        return fConSFeeNo;
    }

    public void setfConSFeeNo(String fConSFeeNo) {
        this.fConSFeeNo = fConSFeeNo;
    }

    @Basic
    @Column(name = "f_con_s_pay_amount", nullable = true, precision = 6)
    public BigDecimal getfConSPayAmount() {
        return fConSPayAmount;
    }

    public void setfConSPayAmount(BigDecimal fConSPayAmount) {
        this.fConSPayAmount = fConSPayAmount;
    }

    @Basic
    @Column(name = "f_con_s_pay_describe", nullable = true, length = 200)
    public String getfConSPayDescribe() {
        return fConSPayDescribe;
    }

    public void setfConSPayDescribe(String fConSPayDescribe) {
        this.fConSPayDescribe = fConSPayDescribe;
    }

    @Basic
    @Column(name = "f_con_s_factory_register_fee", nullable = true, precision = 6)
    public BigDecimal getfConSFactoryRegisterFee() {
        return fConSFactoryRegisterFee;
    }

    public void setfConSFactoryRegisterFee(BigDecimal fConSFactoryRegisterFee) {
        this.fConSFactoryRegisterFee = fConSFactoryRegisterFee;
    }

    @Basic
    @Column(name = "f_con_s_factory_return_fee", nullable = true, precision = 6)
    public BigDecimal getfConSFactoryReturnFee() {
        return fConSFactoryReturnFee;
    }

    public void setfConSFactoryReturnFee(BigDecimal fConSFactoryReturnFee) {
        this.fConSFactoryReturnFee = fConSFactoryReturnFee;
    }

    @Basic
    @Column(name = "f_con_s_client_deduct_fee", nullable = true, precision = 6)
    public BigDecimal getfConSClientDeductFee() {
        return fConSClientDeductFee;
    }

    public void setfConSClientDeductFee(BigDecimal fConSClientDeductFee) {
        this.fConSClientDeductFee = fConSClientDeductFee;
    }

    @Basic
    @Column(name = "f_con_s_isPass", nullable = true, length = 1)
    public String getfConSIsPass() {
        return fConSIsPass;
    }

    public void setfConSIsPass(String fConSIsPass) {
        this.fConSIsPass = fConSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FConSEntity that = (FConSEntity) o;

        if (fConSDetailId != that.fConSDetailId) return false;
        if (fConSSConBillno != null ? !fConSSConBillno.equals(that.fConSSConBillno) : that.fConSSConBillno != null)
            return false;
        if (fConSCreateDate != null ? !fConSCreateDate.equals(that.fConSCreateDate) : that.fConSCreateDate != null)
            return false;
        if (fConSModifiTime != null ? !fConSModifiTime.equals(that.fConSModifiTime) : that.fConSModifiTime != null)
            return false;
        if (fConSState != null ? !fConSState.equals(that.fConSState) : that.fConSState != null) return false;
        if (fConSCreateNo != null ? !fConSCreateNo.equals(that.fConSCreateNo) : that.fConSCreateNo != null)
            return false;
        if (fConSModifiNo != null ? !fConSModifiNo.equals(that.fConSModifiNo) : that.fConSModifiNo != null)
            return false;
        if (fConSChecker != null ? !fConSChecker.equals(that.fConSChecker) : that.fConSChecker != null) return false;
        if (fConSGroupNodeId != null ? !fConSGroupNodeId.equals(that.fConSGroupNodeId) : that.fConSGroupNodeId != null)
            return false;
        if (fConSCheckDate != null ? !fConSCheckDate.equals(that.fConSCheckDate) : that.fConSCheckDate != null)
            return false;
        if (fConSNotes != null ? !fConSNotes.equals(that.fConSNotes) : that.fConSNotes != null) return false;
        if (fConSFeeNo != null ? !fConSFeeNo.equals(that.fConSFeeNo) : that.fConSFeeNo != null) return false;
        if (fConSPayAmount != null ? !fConSPayAmount.equals(that.fConSPayAmount) : that.fConSPayAmount != null)
            return false;
        if (fConSPayDescribe != null ? !fConSPayDescribe.equals(that.fConSPayDescribe) : that.fConSPayDescribe != null)
            return false;
        if (fConSFactoryRegisterFee != null ? !fConSFactoryRegisterFee.equals(that.fConSFactoryRegisterFee) : that.fConSFactoryRegisterFee != null)
            return false;
        if (fConSFactoryReturnFee != null ? !fConSFactoryReturnFee.equals(that.fConSFactoryReturnFee) : that.fConSFactoryReturnFee != null)
            return false;
        if (fConSClientDeductFee != null ? !fConSClientDeductFee.equals(that.fConSClientDeductFee) : that.fConSClientDeductFee != null)
            return false;
        if (fConSIsPass != null ? !fConSIsPass.equals(that.fConSIsPass) : that.fConSIsPass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fConSSConBillno != null ? fConSSConBillno.hashCode() : 0;
        result = 31 * result + (fConSCreateDate != null ? fConSCreateDate.hashCode() : 0);
        result = 31 * result + (fConSModifiTime != null ? fConSModifiTime.hashCode() : 0);
        result = 31 * result + fConSDetailId;
        result = 31 * result + (fConSState != null ? fConSState.hashCode() : 0);
        result = 31 * result + (fConSCreateNo != null ? fConSCreateNo.hashCode() : 0);
        result = 31 * result + (fConSModifiNo != null ? fConSModifiNo.hashCode() : 0);
        result = 31 * result + (fConSChecker != null ? fConSChecker.hashCode() : 0);
        result = 31 * result + (fConSGroupNodeId != null ? fConSGroupNodeId.hashCode() : 0);
        result = 31 * result + (fConSCheckDate != null ? fConSCheckDate.hashCode() : 0);
        result = 31 * result + (fConSNotes != null ? fConSNotes.hashCode() : 0);
        result = 31 * result + (fConSFeeNo != null ? fConSFeeNo.hashCode() : 0);
        result = 31 * result + (fConSPayAmount != null ? fConSPayAmount.hashCode() : 0);
        result = 31 * result + (fConSPayDescribe != null ? fConSPayDescribe.hashCode() : 0);
        result = 31 * result + (fConSFactoryRegisterFee != null ? fConSFactoryRegisterFee.hashCode() : 0);
        result = 31 * result + (fConSFactoryReturnFee != null ? fConSFactoryReturnFee.hashCode() : 0);
        result = 31 * result + (fConSClientDeductFee != null ? fConSClientDeductFee.hashCode() : 0);
        result = 31 * result + (fConSIsPass != null ? fConSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_s_con_billno", referencedColumnName = "f_con_m_s_con_billno", nullable = false)
    public FConMEntity getfConMByFConSSConBillno() {
        return fConMByFConSSConBillno;
    }

    public void setfConMByFConSSConBillno(FConMEntity fConMByFConSSConBillno) {
        this.fConMByFConSSConBillno = fConMByFConSSConBillno;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConSCreateNo() {
        return tStaffByFConSCreateNo;
    }

    public void settStaffByFConSCreateNo(TStaffEntity tStaffByFConSCreateNo) {
        this.tStaffByFConSCreateNo = tStaffByFConSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConSModifiNo() {
        return tStaffByFConSModifiNo;
    }

    public void settStaffByFConSModifiNo(TStaffEntity tStaffByFConSModifiNo) {
        this.tStaffByFConSModifiNo = tStaffByFConSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConSChecker() {
        return tStaffByFConSChecker;
    }

    public void settStaffByFConSChecker(TStaffEntity tStaffByFConSChecker) {
        this.tStaffByFConSChecker = tStaffByFConSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByFConSGroupNodeId() {
        return tOrgByFConSGroupNodeId;
    }

    public void settOrgByFConSGroupNodeId(TOrgEntity tOrgByFConSGroupNodeId) {
        this.tOrgByFConSGroupNodeId = tOrgByFConSGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_s_fee_no", referencedColumnName = "fee_class_fee_no")
    public FeeClassEntity getFeeClassByFConSFeeNo() {
        return feeClassByFConSFeeNo;
    }

    public void setFeeClassByFConSFeeNo(FeeClassEntity feeClassByFConSFeeNo) {
        this.feeClassByFConSFeeNo = feeClassByFConSFeeNo;
    }
}
