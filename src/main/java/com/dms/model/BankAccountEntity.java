package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bank_account", schema = "dbo", catalog = "logistics_test")
public class BankAccountEntity {
    private String bankAccountBankAccountNo;
    private String bankAccountBankAccountName;
    private String bankAccountBankName;
    private String bankAccountRemark;
    private String bankAccountGroupNodeId;
    private String bankAccountCreaterNo;
    private Timestamp bankAccountCreateDate;
    private String bankAccountModifiNo;
    private Timestamp bankAccountModifiTime;
    private String bankAccountFlag;
    private TOrgEntity tOrgByBankAccountGroupNodeId;
    private TStaffEntity tStaffByBankAccountCreaterNo;
    private TStaffEntity tStaffByBankAccountModifiNo;

    @Id
    @Column(name = "bank_account_bank_account_no", nullable = false, length = 50)
    public String getBankAccountBankAccountNo() {
        return bankAccountBankAccountNo;
    }

    public void setBankAccountBankAccountNo(String bankAccountBankAccountNo) {
        this.bankAccountBankAccountNo = bankAccountBankAccountNo;
    }

    @Basic
    @Column(name = "bank_account_bank_account_name", nullable = false, length = 30)
    public String getBankAccountBankAccountName() {
        return bankAccountBankAccountName;
    }

    public void setBankAccountBankAccountName(String bankAccountBankAccountName) {
        this.bankAccountBankAccountName = bankAccountBankAccountName;
    }

    @Basic
    @Column(name = "bank_account_bank_name", nullable = false, length = 100)
    public String getBankAccountBankName() {
        return bankAccountBankName;
    }

    public void setBankAccountBankName(String bankAccountBankName) {
        this.bankAccountBankName = bankAccountBankName;
    }

    @Basic
    @Column(name = "bank_account_remark", nullable = true, length = 100)
    public String getBankAccountRemark() {
        return bankAccountRemark;
    }

    public void setBankAccountRemark(String bankAccountRemark) {
        this.bankAccountRemark = bankAccountRemark;
    }

    @Basic
    @Column(name = "bank_account_group_node_id", nullable = false, length = 20)
    public String getBankAccountGroupNodeId() {
        return bankAccountGroupNodeId;
    }

    public void setBankAccountGroupNodeId(String bankAccountGroupNodeId) {
        this.bankAccountGroupNodeId = bankAccountGroupNodeId;
    }

    @Basic
    @Column(name = "bank_account_creater_no", nullable = true, length = 8)
    public String getBankAccountCreaterNo() {
        return bankAccountCreaterNo;
    }

    public void setBankAccountCreaterNo(String bankAccountCreaterNo) {
        this.bankAccountCreaterNo = bankAccountCreaterNo;
    }

    @Basic
    @Column(name = "bank_account_create_date", nullable = true)
    public Timestamp getBankAccountCreateDate() {
        return bankAccountCreateDate;
    }

    public void setBankAccountCreateDate(Timestamp bankAccountCreateDate) {
        this.bankAccountCreateDate = bankAccountCreateDate;
    }

    @Basic
    @Column(name = "bank_account_modifi_no", nullable = true, length = 8)
    public String getBankAccountModifiNo() {
        return bankAccountModifiNo;
    }

    public void setBankAccountModifiNo(String bankAccountModifiNo) {
        this.bankAccountModifiNo = bankAccountModifiNo;
    }

    @Basic
    @Column(name = "bank_account_modifi_time", nullable = true)
    public Timestamp getBankAccountModifiTime() {
        return bankAccountModifiTime;
    }

    public void setBankAccountModifiTime(Timestamp bankAccountModifiTime) {
        this.bankAccountModifiTime = bankAccountModifiTime;
    }

    @Basic
    @Column(name = "bank_account_flag", nullable = false, length = 1)
    public String getBankAccountFlag() {
        return bankAccountFlag;
    }

    public void setBankAccountFlag(String bankAccountFlag) {
        this.bankAccountFlag = bankAccountFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccountEntity that = (BankAccountEntity) o;

        if (bankAccountBankAccountNo != null ? !bankAccountBankAccountNo.equals(that.bankAccountBankAccountNo) : that.bankAccountBankAccountNo != null)
            return false;
        if (bankAccountBankAccountName != null ? !bankAccountBankAccountName.equals(that.bankAccountBankAccountName) : that.bankAccountBankAccountName != null)
            return false;
        if (bankAccountBankName != null ? !bankAccountBankName.equals(that.bankAccountBankName) : that.bankAccountBankName != null)
            return false;
        if (bankAccountRemark != null ? !bankAccountRemark.equals(that.bankAccountRemark) : that.bankAccountRemark != null)
            return false;
        if (bankAccountGroupNodeId != null ? !bankAccountGroupNodeId.equals(that.bankAccountGroupNodeId) : that.bankAccountGroupNodeId != null)
            return false;
        if (bankAccountCreaterNo != null ? !bankAccountCreaterNo.equals(that.bankAccountCreaterNo) : that.bankAccountCreaterNo != null)
            return false;
        if (bankAccountCreateDate != null ? !bankAccountCreateDate.equals(that.bankAccountCreateDate) : that.bankAccountCreateDate != null)
            return false;
        if (bankAccountModifiNo != null ? !bankAccountModifiNo.equals(that.bankAccountModifiNo) : that.bankAccountModifiNo != null)
            return false;
        if (bankAccountModifiTime != null ? !bankAccountModifiTime.equals(that.bankAccountModifiTime) : that.bankAccountModifiTime != null)
            return false;
        if (bankAccountFlag != null ? !bankAccountFlag.equals(that.bankAccountFlag) : that.bankAccountFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankAccountBankAccountNo != null ? bankAccountBankAccountNo.hashCode() : 0;
        result = 31 * result + (bankAccountBankAccountName != null ? bankAccountBankAccountName.hashCode() : 0);
        result = 31 * result + (bankAccountBankName != null ? bankAccountBankName.hashCode() : 0);
        result = 31 * result + (bankAccountRemark != null ? bankAccountRemark.hashCode() : 0);
        result = 31 * result + (bankAccountGroupNodeId != null ? bankAccountGroupNodeId.hashCode() : 0);
        result = 31 * result + (bankAccountCreaterNo != null ? bankAccountCreaterNo.hashCode() : 0);
        result = 31 * result + (bankAccountCreateDate != null ? bankAccountCreateDate.hashCode() : 0);
        result = 31 * result + (bankAccountModifiNo != null ? bankAccountModifiNo.hashCode() : 0);
        result = 31 * result + (bankAccountModifiTime != null ? bankAccountModifiTime.hashCode() : 0);
        result = 31 * result + (bankAccountFlag != null ? bankAccountFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "bank_account_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBankAccountGroupNodeId() {
        return tOrgByBankAccountGroupNodeId;
    }

    public void settOrgByBankAccountGroupNodeId(TOrgEntity tOrgByBankAccountGroupNodeId) {
        this.tOrgByBankAccountGroupNodeId = tOrgByBankAccountGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "bank_account_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBankAccountCreaterNo() {
        return tStaffByBankAccountCreaterNo;
    }

    public void settStaffByBankAccountCreaterNo(TStaffEntity tStaffByBankAccountCreaterNo) {
        this.tStaffByBankAccountCreaterNo = tStaffByBankAccountCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "bank_account_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBankAccountModifiNo() {
        return tStaffByBankAccountModifiNo;
    }

    public void settStaffByBankAccountModifiNo(TStaffEntity tStaffByBankAccountModifiNo) {
        this.tStaffByBankAccountModifiNo = tStaffByBankAccountModifiNo;
    }
}
