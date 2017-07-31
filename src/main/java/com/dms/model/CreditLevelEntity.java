package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "credit_level", schema = "dbo", catalog = "logistics")
public class CreditLevelEntity {
    private String creditLevelCreditLevelNo;
    private String creditLevelCreditLevelDescript;
    private BigDecimal creditLevelCreditLimit;
    private String creditLevelRemark;
    private String creditLevelGroupNodeId;
    private String creditLevelCreaterNo;
    private Timestamp creditLevelCreateDate;
    private String creditLevelModifiNo;
    private Timestamp creditLevelModifiTime;
    private String creditLevelFlag;
    private TOrgEntity tOrgByCreditLevelGroupNodeId;
    private TStaffEntity tStaffByCreditLevelCreaterNo;
    private TStaffEntity tStaffByCreditLevelModifiNo;

    @Id
    @Column(name = "credit_level_credit_level_no", nullable = false, length = 4)
    public String getCreditLevelCreditLevelNo() {
        return creditLevelCreditLevelNo;
    }

    public void setCreditLevelCreditLevelNo(String creditLevelCreditLevelNo) {
        this.creditLevelCreditLevelNo = creditLevelCreditLevelNo;
    }

    @Basic
    @Column(name = "credit_level_credit_level_descript", nullable = false, length = 50)
    public String getCreditLevelCreditLevelDescript() {
        return creditLevelCreditLevelDescript;
    }

    public void setCreditLevelCreditLevelDescript(String creditLevelCreditLevelDescript) {
        this.creditLevelCreditLevelDescript = creditLevelCreditLevelDescript;
    }

    @Basic
    @Column(name = "credit_level_credit_limit", nullable = false, precision = 6)
    public BigDecimal getCreditLevelCreditLimit() {
        return creditLevelCreditLimit;
    }

    public void setCreditLevelCreditLimit(BigDecimal creditLevelCreditLimit) {
        this.creditLevelCreditLimit = creditLevelCreditLimit;
    }

    @Basic
    @Column(name = "credit_level_remark", nullable = true, length = 100)
    public String getCreditLevelRemark() {
        return creditLevelRemark;
    }

    public void setCreditLevelRemark(String creditLevelRemark) {
        this.creditLevelRemark = creditLevelRemark;
    }

    @Basic
    @Column(name = "credit_level_group_node_id", nullable = true, length = 20)
    public String getCreditLevelGroupNodeId() {
        return creditLevelGroupNodeId;
    }

    public void setCreditLevelGroupNodeId(String creditLevelGroupNodeId) {
        this.creditLevelGroupNodeId = creditLevelGroupNodeId;
    }

    @Basic
    @Column(name = "credit_level_creater_no", nullable = true, length = 8)
    public String getCreditLevelCreaterNo() {
        return creditLevelCreaterNo;
    }

    public void setCreditLevelCreaterNo(String creditLevelCreaterNo) {
        this.creditLevelCreaterNo = creditLevelCreaterNo;
    }

    @Basic
    @Column(name = "credit_level_create_date", nullable = true)
    public Timestamp getCreditLevelCreateDate() {
        return creditLevelCreateDate;
    }

    public void setCreditLevelCreateDate(Timestamp creditLevelCreateDate) {
        this.creditLevelCreateDate = creditLevelCreateDate;
    }

    @Basic
    @Column(name = "credit_level_modifi_no", nullable = true, length = 8)
    public String getCreditLevelModifiNo() {
        return creditLevelModifiNo;
    }

    public void setCreditLevelModifiNo(String creditLevelModifiNo) {
        this.creditLevelModifiNo = creditLevelModifiNo;
    }

    @Basic
    @Column(name = "credit_level_modifi_time", nullable = true)
    public Timestamp getCreditLevelModifiTime() {
        return creditLevelModifiTime;
    }

    public void setCreditLevelModifiTime(Timestamp creditLevelModifiTime) {
        this.creditLevelModifiTime = creditLevelModifiTime;
    }

    @Basic
    @Column(name = "credit_level_flag", nullable = false, length = -1)
    public String getCreditLevelFlag() {
        return creditLevelFlag;
    }

    public void setCreditLevelFlag(String creditLevelFlag) {
        this.creditLevelFlag = creditLevelFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditLevelEntity that = (CreditLevelEntity) o;

        if (creditLevelCreditLevelNo != null ? !creditLevelCreditLevelNo.equals(that.creditLevelCreditLevelNo) : that.creditLevelCreditLevelNo != null)
            return false;
        if (creditLevelCreditLevelDescript != null ? !creditLevelCreditLevelDescript.equals(that.creditLevelCreditLevelDescript) : that.creditLevelCreditLevelDescript != null)
            return false;
        if (creditLevelCreditLimit != null ? !creditLevelCreditLimit.equals(that.creditLevelCreditLimit) : that.creditLevelCreditLimit != null)
            return false;
        if (creditLevelRemark != null ? !creditLevelRemark.equals(that.creditLevelRemark) : that.creditLevelRemark != null)
            return false;
        if (creditLevelGroupNodeId != null ? !creditLevelGroupNodeId.equals(that.creditLevelGroupNodeId) : that.creditLevelGroupNodeId != null)
            return false;
        if (creditLevelCreaterNo != null ? !creditLevelCreaterNo.equals(that.creditLevelCreaterNo) : that.creditLevelCreaterNo != null)
            return false;
        if (creditLevelCreateDate != null ? !creditLevelCreateDate.equals(that.creditLevelCreateDate) : that.creditLevelCreateDate != null)
            return false;
        if (creditLevelModifiNo != null ? !creditLevelModifiNo.equals(that.creditLevelModifiNo) : that.creditLevelModifiNo != null)
            return false;
        if (creditLevelModifiTime != null ? !creditLevelModifiTime.equals(that.creditLevelModifiTime) : that.creditLevelModifiTime != null)
            return false;
        if (creditLevelFlag != null ? !creditLevelFlag.equals(that.creditLevelFlag) : that.creditLevelFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = creditLevelCreditLevelNo != null ? creditLevelCreditLevelNo.hashCode() : 0;
        result = 31 * result + (creditLevelCreditLevelDescript != null ? creditLevelCreditLevelDescript.hashCode() : 0);
        result = 31 * result + (creditLevelCreditLimit != null ? creditLevelCreditLimit.hashCode() : 0);
        result = 31 * result + (creditLevelRemark != null ? creditLevelRemark.hashCode() : 0);
        result = 31 * result + (creditLevelGroupNodeId != null ? creditLevelGroupNodeId.hashCode() : 0);
        result = 31 * result + (creditLevelCreaterNo != null ? creditLevelCreaterNo.hashCode() : 0);
        result = 31 * result + (creditLevelCreateDate != null ? creditLevelCreateDate.hashCode() : 0);
        result = 31 * result + (creditLevelModifiNo != null ? creditLevelModifiNo.hashCode() : 0);
        result = 31 * result + (creditLevelModifiTime != null ? creditLevelModifiTime.hashCode() : 0);
        result = 31 * result + (creditLevelFlag != null ? creditLevelFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "credit_level_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByCreditLevelGroupNodeId() {
        return tOrgByCreditLevelGroupNodeId;
    }

    public void settOrgByCreditLevelGroupNodeId(TOrgEntity tOrgByCreditLevelGroupNodeId) {
        this.tOrgByCreditLevelGroupNodeId = tOrgByCreditLevelGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "credit_level_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCreditLevelCreaterNo() {
        return tStaffByCreditLevelCreaterNo;
    }

    public void settStaffByCreditLevelCreaterNo(TStaffEntity tStaffByCreditLevelCreaterNo) {
        this.tStaffByCreditLevelCreaterNo = tStaffByCreditLevelCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "credit_level_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByCreditLevelModifiNo() {
        return tStaffByCreditLevelModifiNo;
    }

    public void settStaffByCreditLevelModifiNo(TStaffEntity tStaffByCreditLevelModifiNo) {
        this.tStaffByCreditLevelModifiNo = tStaffByCreditLevelModifiNo;
    }
}
