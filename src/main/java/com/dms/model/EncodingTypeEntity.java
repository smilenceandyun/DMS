package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "encoding_type", schema = "dbo", catalog = "logistics")
public class EncodingTypeEntity {
    private String encodingTypeEncodingTypeNo;
    private String encodingTypeEncodingRule;
    private String encodingTypeEncodingDescript;
    private String encodingTypeRemark;
    private String encodingTypeGroupNodeId;
    private String encodingTypeCreaterNo;
    private Timestamp encodingTypeCreateDate;
    private String encodingTypeModifiNo;
    private Timestamp encodingTypeModifiTime;
    private String encodingTypeFlag;
    private TOrgEntity tOrgByEncodingTypeGroupNodeId;
    private TStaffEntity tStaffByEncodingTypeCreaterNo;
    private TStaffEntity tStaffByEncodingTypeModifiNo;

    @Id
    @Column(name = "encoding_type_encoding_type_no", nullable = false, length = 4)
    public String getEncodingTypeEncodingTypeNo() {
        return encodingTypeEncodingTypeNo;
    }

    public void setEncodingTypeEncodingTypeNo(String encodingTypeEncodingTypeNo) {
        this.encodingTypeEncodingTypeNo = encodingTypeEncodingTypeNo;
    }

    @Basic
    @Column(name = "encoding_type_encoding_rule", nullable = false, length = 12)
    public String getEncodingTypeEncodingRule() {
        return encodingTypeEncodingRule;
    }

    public void setEncodingTypeEncodingRule(String encodingTypeEncodingRule) {
        this.encodingTypeEncodingRule = encodingTypeEncodingRule;
    }

    @Basic
    @Column(name = "encoding_type_encoding_descript", nullable = false, length = 50)
    public String getEncodingTypeEncodingDescript() {
        return encodingTypeEncodingDescript;
    }

    public void setEncodingTypeEncodingDescript(String encodingTypeEncodingDescript) {
        this.encodingTypeEncodingDescript = encodingTypeEncodingDescript;
    }

    @Basic
    @Column(name = "encoding_type_remark", nullable = true, length = 100)
    public String getEncodingTypeRemark() {
        return encodingTypeRemark;
    }

    public void setEncodingTypeRemark(String encodingTypeRemark) {
        this.encodingTypeRemark = encodingTypeRemark;
    }

    @Basic
    @Column(name = "encoding_type_group_node_id", nullable = true, length = 20)
    public String getEncodingTypeGroupNodeId() {
        return encodingTypeGroupNodeId;
    }

    public void setEncodingTypeGroupNodeId(String encodingTypeGroupNodeId) {
        this.encodingTypeGroupNodeId = encodingTypeGroupNodeId;
    }

    @Basic
    @Column(name = "encoding_type_creater_no", nullable = true, length = 8)
    public String getEncodingTypeCreaterNo() {
        return encodingTypeCreaterNo;
    }

    public void setEncodingTypeCreaterNo(String encodingTypeCreaterNo) {
        this.encodingTypeCreaterNo = encodingTypeCreaterNo;
    }

    @Basic
    @Column(name = "encoding_type_create_date", nullable = true)
    public Timestamp getEncodingTypeCreateDate() {
        return encodingTypeCreateDate;
    }

    public void setEncodingTypeCreateDate(Timestamp encodingTypeCreateDate) {
        this.encodingTypeCreateDate = encodingTypeCreateDate;
    }

    @Basic
    @Column(name = "encoding_type_modifi_no", nullable = true, length = 8)
    public String getEncodingTypeModifiNo() {
        return encodingTypeModifiNo;
    }

    public void setEncodingTypeModifiNo(String encodingTypeModifiNo) {
        this.encodingTypeModifiNo = encodingTypeModifiNo;
    }

    @Basic
    @Column(name = "encoding_type_modifi_time", nullable = true)
    public Timestamp getEncodingTypeModifiTime() {
        return encodingTypeModifiTime;
    }

    public void setEncodingTypeModifiTime(Timestamp encodingTypeModifiTime) {
        this.encodingTypeModifiTime = encodingTypeModifiTime;
    }

    @Basic
    @Column(name = "encoding_type_flag", nullable = true, length = -1)
    public String getEncodingTypeFlag() {
        return encodingTypeFlag;
    }

    public void setEncodingTypeFlag(String encodingTypeFlag) {
        this.encodingTypeFlag = encodingTypeFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EncodingTypeEntity that = (EncodingTypeEntity) o;

        if (encodingTypeEncodingTypeNo != null ? !encodingTypeEncodingTypeNo.equals(that.encodingTypeEncodingTypeNo) : that.encodingTypeEncodingTypeNo != null)
            return false;
        if (encodingTypeEncodingRule != null ? !encodingTypeEncodingRule.equals(that.encodingTypeEncodingRule) : that.encodingTypeEncodingRule != null)
            return false;
        if (encodingTypeEncodingDescript != null ? !encodingTypeEncodingDescript.equals(that.encodingTypeEncodingDescript) : that.encodingTypeEncodingDescript != null)
            return false;
        if (encodingTypeRemark != null ? !encodingTypeRemark.equals(that.encodingTypeRemark) : that.encodingTypeRemark != null)
            return false;
        if (encodingTypeGroupNodeId != null ? !encodingTypeGroupNodeId.equals(that.encodingTypeGroupNodeId) : that.encodingTypeGroupNodeId != null)
            return false;
        if (encodingTypeCreaterNo != null ? !encodingTypeCreaterNo.equals(that.encodingTypeCreaterNo) : that.encodingTypeCreaterNo != null)
            return false;
        if (encodingTypeCreateDate != null ? !encodingTypeCreateDate.equals(that.encodingTypeCreateDate) : that.encodingTypeCreateDate != null)
            return false;
        if (encodingTypeModifiNo != null ? !encodingTypeModifiNo.equals(that.encodingTypeModifiNo) : that.encodingTypeModifiNo != null)
            return false;
        if (encodingTypeModifiTime != null ? !encodingTypeModifiTime.equals(that.encodingTypeModifiTime) : that.encodingTypeModifiTime != null)
            return false;
        if (encodingTypeFlag != null ? !encodingTypeFlag.equals(that.encodingTypeFlag) : that.encodingTypeFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = encodingTypeEncodingTypeNo != null ? encodingTypeEncodingTypeNo.hashCode() : 0;
        result = 31 * result + (encodingTypeEncodingRule != null ? encodingTypeEncodingRule.hashCode() : 0);
        result = 31 * result + (encodingTypeEncodingDescript != null ? encodingTypeEncodingDescript.hashCode() : 0);
        result = 31 * result + (encodingTypeRemark != null ? encodingTypeRemark.hashCode() : 0);
        result = 31 * result + (encodingTypeGroupNodeId != null ? encodingTypeGroupNodeId.hashCode() : 0);
        result = 31 * result + (encodingTypeCreaterNo != null ? encodingTypeCreaterNo.hashCode() : 0);
        result = 31 * result + (encodingTypeCreateDate != null ? encodingTypeCreateDate.hashCode() : 0);
        result = 31 * result + (encodingTypeModifiNo != null ? encodingTypeModifiNo.hashCode() : 0);
        result = 31 * result + (encodingTypeModifiTime != null ? encodingTypeModifiTime.hashCode() : 0);
        result = 31 * result + (encodingTypeFlag != null ? encodingTypeFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "encoding_type_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByEncodingTypeGroupNodeId() {
        return tOrgByEncodingTypeGroupNodeId;
    }

    public void settOrgByEncodingTypeGroupNodeId(TOrgEntity tOrgByEncodingTypeGroupNodeId) {
        this.tOrgByEncodingTypeGroupNodeId = tOrgByEncodingTypeGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "encoding_type_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByEncodingTypeCreaterNo() {
        return tStaffByEncodingTypeCreaterNo;
    }

    public void settStaffByEncodingTypeCreaterNo(TStaffEntity tStaffByEncodingTypeCreaterNo) {
        this.tStaffByEncodingTypeCreaterNo = tStaffByEncodingTypeCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "encoding_type_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByEncodingTypeModifiNo() {
        return tStaffByEncodingTypeModifiNo;
    }

    public void settStaffByEncodingTypeModifiNo(TStaffEntity tStaffByEncodingTypeModifiNo) {
        this.tStaffByEncodingTypeModifiNo = tStaffByEncodingTypeModifiNo;
    }
}
