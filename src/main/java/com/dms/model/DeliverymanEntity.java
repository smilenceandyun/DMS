package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "deliveryman", schema = "dbo", catalog = "logistics_test")
public class DeliverymanEntity {
    private String deliverymanDeliverymanNo;
    private String deliverymanDeliverymanName;
    private String deliverymanSex;
    private Integer deliverymanAge;
    private String deliverymanTel;
    private String deliverymanId;
    private String deliverymanHomeAddress;
    private String deliverymanBankName;
    private Timestamp deliverymanHiredate;
    private String deliverymanRemark;
    private String deliverymanFlag;
    private String deliverymanCreateNo;
    private Timestamp deliverymanCreateDate;
    private String deliverymanModifiNo;
    private Timestamp deliverymanModifiTime;
    private String deliverymanGroupNodeId;
    private Collection<DistributionListEntity> distributionListsByDeliverymanDeliverymanNo;
    private Collection<BOutPresentMEntity> bOutPresentMSByDeliverymanDeliverymanNo;
    private TStaffEntity tStaffByDeliverymanCreateNo;
    private TStaffEntity tStaffByDeliverymanModifiNo;
    private TOrgEntity tOrgByDeliverymanGroupNodeId;

    @Id
    @Column(name = "deliveryman_deliveryman_no", nullable = false, length = 8)
    public String getDeliverymanDeliverymanNo() {
        return deliverymanDeliverymanNo;
    }

    public void setDeliverymanDeliverymanNo(String deliverymanDeliverymanNo) {
        this.deliverymanDeliverymanNo = deliverymanDeliverymanNo;
    }

    @Basic
    @Column(name = "deliveryman_deliveryman_name", nullable = false, length = 30)
    public String getDeliverymanDeliverymanName() {
        return deliverymanDeliverymanName;
    }

    public void setDeliverymanDeliverymanName(String deliverymanDeliverymanName) {
        this.deliverymanDeliverymanName = deliverymanDeliverymanName;
    }

    @Basic
    @Column(name = "deliveryman_sex", nullable = true, length = 6)
    public String getDeliverymanSex() {
        return deliverymanSex;
    }

    public void setDeliverymanSex(String deliverymanSex) {
        this.deliverymanSex = deliverymanSex;
    }

    @Basic
    @Column(name = "deliveryman_age", nullable = true)
    public Integer getDeliverymanAge() {
        return deliverymanAge;
    }

    public void setDeliverymanAge(Integer deliverymanAge) {
        this.deliverymanAge = deliverymanAge;
    }

    @Basic
    @Column(name = "deliveryman_tel", nullable = false, length = 30)
    public String getDeliverymanTel() {
        return deliverymanTel;
    }

    public void setDeliverymanTel(String deliverymanTel) {
        this.deliverymanTel = deliverymanTel;
    }

    @Basic
    @Column(name = "deliveryman_ID", nullable = true, length = 20)
    public String getDeliverymanId() {
        return deliverymanId;
    }

    public void setDeliverymanId(String deliverymanId) {
        this.deliverymanId = deliverymanId;
    }

    @Basic
    @Column(name = "deliveryman_home_address", nullable = true, length = 100)
    public String getDeliverymanHomeAddress() {
        return deliverymanHomeAddress;
    }

    public void setDeliverymanHomeAddress(String deliverymanHomeAddress) {
        this.deliverymanHomeAddress = deliverymanHomeAddress;
    }

    @Basic
    @Column(name = "deliveryman_bank_name", nullable = true, length = 100)
    public String getDeliverymanBankName() {
        return deliverymanBankName;
    }

    public void setDeliverymanBankName(String deliverymanBankName) {
        this.deliverymanBankName = deliverymanBankName;
    }

    @Basic
    @Column(name = "deliveryman_hiredate", nullable = true)
    public Timestamp getDeliverymanHiredate() {
        return deliverymanHiredate;
    }

    public void setDeliverymanHiredate(Timestamp deliverymanHiredate) {
        this.deliverymanHiredate = deliverymanHiredate;
    }

    @Basic
    @Column(name = "deliveryman_remark", nullable = true, length = 100)
    public String getDeliverymanRemark() {
        return deliverymanRemark;
    }

    public void setDeliverymanRemark(String deliverymanRemark) {
        this.deliverymanRemark = deliverymanRemark;
    }

    @Basic
    @Column(name = "deliveryman_flag", nullable = false, length = 1)
    public String getDeliverymanFlag() {
        return deliverymanFlag;
    }

    public void setDeliverymanFlag(String deliverymanFlag) {
        this.deliverymanFlag = deliverymanFlag;
    }

    @Basic
    @Column(name = "deliveryman_create_no", nullable = true, length = 8)
    public String getDeliverymanCreateNo() {
        return deliverymanCreateNo;
    }

    public void setDeliverymanCreateNo(String deliverymanCreateNo) {
        this.deliverymanCreateNo = deliverymanCreateNo;
    }

    @Basic
    @Column(name = "deliveryman_create_date", nullable = true)
    public Timestamp getDeliverymanCreateDate() {
        return deliverymanCreateDate;
    }

    public void setDeliverymanCreateDate(Timestamp deliverymanCreateDate) {
        this.deliverymanCreateDate = deliverymanCreateDate;
    }

    @Basic
    @Column(name = "deliveryman_modifi_no", nullable = true, length = 8)
    public String getDeliverymanModifiNo() {
        return deliverymanModifiNo;
    }

    public void setDeliverymanModifiNo(String deliverymanModifiNo) {
        this.deliverymanModifiNo = deliverymanModifiNo;
    }

    @Basic
    @Column(name = "deliveryman_modifi_time", nullable = true)
    public Timestamp getDeliverymanModifiTime() {
        return deliverymanModifiTime;
    }

    public void setDeliverymanModifiTime(Timestamp deliverymanModifiTime) {
        this.deliverymanModifiTime = deliverymanModifiTime;
    }

    @Basic
    @Column(name = "deliveryman_group_node_id", nullable = true, length = 20)
    public String getDeliverymanGroupNodeId() {
        return deliverymanGroupNodeId;
    }

    public void setDeliverymanGroupNodeId(String deliverymanGroupNodeId) {
        this.deliverymanGroupNodeId = deliverymanGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliverymanEntity that = (DeliverymanEntity) o;

        if (deliverymanDeliverymanNo != null ? !deliverymanDeliverymanNo.equals(that.deliverymanDeliverymanNo) : that.deliverymanDeliverymanNo != null)
            return false;
        if (deliverymanDeliverymanName != null ? !deliverymanDeliverymanName.equals(that.deliverymanDeliverymanName) : that.deliverymanDeliverymanName != null)
            return false;
        if (deliverymanSex != null ? !deliverymanSex.equals(that.deliverymanSex) : that.deliverymanSex != null)
            return false;
        if (deliverymanAge != null ? !deliverymanAge.equals(that.deliverymanAge) : that.deliverymanAge != null)
            return false;
        if (deliverymanTel != null ? !deliverymanTel.equals(that.deliverymanTel) : that.deliverymanTel != null)
            return false;
        if (deliverymanId != null ? !deliverymanId.equals(that.deliverymanId) : that.deliverymanId != null)
            return false;
        if (deliverymanHomeAddress != null ? !deliverymanHomeAddress.equals(that.deliverymanHomeAddress) : that.deliverymanHomeAddress != null)
            return false;
        if (deliverymanBankName != null ? !deliverymanBankName.equals(that.deliverymanBankName) : that.deliverymanBankName != null)
            return false;
        if (deliverymanHiredate != null ? !deliverymanHiredate.equals(that.deliverymanHiredate) : that.deliverymanHiredate != null)
            return false;
        if (deliverymanRemark != null ? !deliverymanRemark.equals(that.deliverymanRemark) : that.deliverymanRemark != null)
            return false;
        if (deliverymanFlag != null ? !deliverymanFlag.equals(that.deliverymanFlag) : that.deliverymanFlag != null)
            return false;
        if (deliverymanCreateNo != null ? !deliverymanCreateNo.equals(that.deliverymanCreateNo) : that.deliverymanCreateNo != null)
            return false;
        if (deliverymanCreateDate != null ? !deliverymanCreateDate.equals(that.deliverymanCreateDate) : that.deliverymanCreateDate != null)
            return false;
        if (deliverymanModifiNo != null ? !deliverymanModifiNo.equals(that.deliverymanModifiNo) : that.deliverymanModifiNo != null)
            return false;
        if (deliverymanModifiTime != null ? !deliverymanModifiTime.equals(that.deliverymanModifiTime) : that.deliverymanModifiTime != null)
            return false;
        if (deliverymanGroupNodeId != null ? !deliverymanGroupNodeId.equals(that.deliverymanGroupNodeId) : that.deliverymanGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deliverymanDeliverymanNo != null ? deliverymanDeliverymanNo.hashCode() : 0;
        result = 31 * result + (deliverymanDeliverymanName != null ? deliverymanDeliverymanName.hashCode() : 0);
        result = 31 * result + (deliverymanSex != null ? deliverymanSex.hashCode() : 0);
        result = 31 * result + (deliverymanAge != null ? deliverymanAge.hashCode() : 0);
        result = 31 * result + (deliverymanTel != null ? deliverymanTel.hashCode() : 0);
        result = 31 * result + (deliverymanId != null ? deliverymanId.hashCode() : 0);
        result = 31 * result + (deliverymanHomeAddress != null ? deliverymanHomeAddress.hashCode() : 0);
        result = 31 * result + (deliverymanBankName != null ? deliverymanBankName.hashCode() : 0);
        result = 31 * result + (deliverymanHiredate != null ? deliverymanHiredate.hashCode() : 0);
        result = 31 * result + (deliverymanRemark != null ? deliverymanRemark.hashCode() : 0);
        result = 31 * result + (deliverymanFlag != null ? deliverymanFlag.hashCode() : 0);
        result = 31 * result + (deliverymanCreateNo != null ? deliverymanCreateNo.hashCode() : 0);
        result = 31 * result + (deliverymanCreateDate != null ? deliverymanCreateDate.hashCode() : 0);
        result = 31 * result + (deliverymanModifiNo != null ? deliverymanModifiNo.hashCode() : 0);
        result = 31 * result + (deliverymanModifiTime != null ? deliverymanModifiTime.hashCode() : 0);
        result = 31 * result + (deliverymanGroupNodeId != null ? deliverymanGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "deliverymanByDistributionListDeliverymanNo")
    public Collection<DistributionListEntity> getDistributionListsByDeliverymanDeliverymanNo() {
        return distributionListsByDeliverymanDeliverymanNo;
    }

    public void setDistributionListsByDeliverymanDeliverymanNo(Collection<DistributionListEntity> distributionListsByDeliverymanDeliverymanNo) {
        this.distributionListsByDeliverymanDeliverymanNo = distributionListsByDeliverymanDeliverymanNo;
    }

    @OneToMany(mappedBy = "deliverymanByBOutPresentMDeliverymanNo")
    public Collection<BOutPresentMEntity> getbOutPresentMSByDeliverymanDeliverymanNo() {
        return bOutPresentMSByDeliverymanDeliverymanNo;
    }

    public void setbOutPresentMSByDeliverymanDeliverymanNo(Collection<BOutPresentMEntity> bOutPresentMSByDeliverymanDeliverymanNo) {
        this.bOutPresentMSByDeliverymanDeliverymanNo = bOutPresentMSByDeliverymanDeliverymanNo;
    }

    @ManyToOne
    @JoinColumn(name = "deliveryman_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByDeliverymanCreateNo() {
        return tStaffByDeliverymanCreateNo;
    }

    public void settStaffByDeliverymanCreateNo(TStaffEntity tStaffByDeliverymanCreateNo) {
        this.tStaffByDeliverymanCreateNo = tStaffByDeliverymanCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "deliveryman_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByDeliverymanModifiNo() {
        return tStaffByDeliverymanModifiNo;
    }

    public void settStaffByDeliverymanModifiNo(TStaffEntity tStaffByDeliverymanModifiNo) {
        this.tStaffByDeliverymanModifiNo = tStaffByDeliverymanModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "deliveryman_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByDeliverymanGroupNodeId() {
        return tOrgByDeliverymanGroupNodeId;
    }

    public void settOrgByDeliverymanGroupNodeId(TOrgEntity tOrgByDeliverymanGroupNodeId) {
        this.tOrgByDeliverymanGroupNodeId = tOrgByDeliverymanGroupNodeId;
    }
}
