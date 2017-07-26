package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DistributionList", schema = "dbo", catalog = "logistics_test")
public class DistributionListEntity {
    private String distributionListOutPresentNo;
    private String distributionListDeliveryLine;
    private Timestamp distributionListOutDate;
    private String distributionListCarNo;
    private String distributionListDeliverymanNo;
    private BigDecimal distributionListVolume;
    private BigDecimal distributionListWeight;
    private int distributionListDetailId;
    private String distributionListClientNo;
    private String distributionListProcessedNo;
    private String distributionListCreaterNo;
    private Timestamp distributionListCreateDate;
    private String distributionListModifiNo;
    private Timestamp distributionListModifiTime;
    private String distributionListChecker;
    private Timestamp distributionListCheckDate;
    private String distributionListGroupNodeId;
    private String distributionListIsPass;
    private TCarEntity tCarByDistributionListCarNo;
    private DeliverymanEntity deliverymanByDistributionListDeliverymanNo;
    private TClientEntity tClientByDistributionListClientNo;
    private TStaffEntity tStaffByDistributionListCreaterNo;
    private TStaffEntity tStaffByDistributionListModifiNo;
    private TStaffEntity tStaffByDistributionListChecker;
    private TOrgEntity tOrgByDistributionListGroupNodeId;

    @Id
    @Column(name = "DistributionList_out_present_no", nullable = false, length = 16)
    public String getDistributionListOutPresentNo() {
        return distributionListOutPresentNo;
    }

    public void setDistributionListOutPresentNo(String distributionListOutPresentNo) {
        this.distributionListOutPresentNo = distributionListOutPresentNo;
    }

    @Basic
    @Column(name = "DistributionList_delivery_line", nullable = true, length = 200)
    public String getDistributionListDeliveryLine() {
        return distributionListDeliveryLine;
    }

    public void setDistributionListDeliveryLine(String distributionListDeliveryLine) {
        this.distributionListDeliveryLine = distributionListDeliveryLine;
    }

    @Basic
    @Column(name = "DistributionList_out_date", nullable = true)
    public Timestamp getDistributionListOutDate() {
        return distributionListOutDate;
    }

    public void setDistributionListOutDate(Timestamp distributionListOutDate) {
        this.distributionListOutDate = distributionListOutDate;
    }

    @Basic
    @Column(name = "DistributionList_car_no", nullable = true, length = 10)
    public String getDistributionListCarNo() {
        return distributionListCarNo;
    }

    public void setDistributionListCarNo(String distributionListCarNo) {
        this.distributionListCarNo = distributionListCarNo;
    }

    @Basic
    @Column(name = "DistributionList_deliveryman_no", nullable = true, length = 8)
    public String getDistributionListDeliverymanNo() {
        return distributionListDeliverymanNo;
    }

    public void setDistributionListDeliverymanNo(String distributionListDeliverymanNo) {
        this.distributionListDeliverymanNo = distributionListDeliverymanNo;
    }

    @Basic
    @Column(name = "DistributionList_volume", nullable = true, precision = 6)
    public BigDecimal getDistributionListVolume() {
        return distributionListVolume;
    }

    public void setDistributionListVolume(BigDecimal distributionListVolume) {
        this.distributionListVolume = distributionListVolume;
    }

    @Basic
    @Column(name = "DistributionList_weight", nullable = true, precision = 6)
    public BigDecimal getDistributionListWeight() {
        return distributionListWeight;
    }

    public void setDistributionListWeight(BigDecimal distributionListWeight) {
        this.distributionListWeight = distributionListWeight;
    }

    @Basic
    @Column(name = "DistributionList_detail_id", nullable = false)
    public int getDistributionListDetailId() {
        return distributionListDetailId;
    }

    public void setDistributionListDetailId(int distributionListDetailId) {
        this.distributionListDetailId = distributionListDetailId;
    }

    @Basic
    @Column(name = "DistributionList_client_no", nullable = true, length = 20)
    public String getDistributionListClientNo() {
        return distributionListClientNo;
    }

    public void setDistributionListClientNo(String distributionListClientNo) {
        this.distributionListClientNo = distributionListClientNo;
    }

    @Basic
    @Column(name = "DistributionList_processed_no", nullable = true, length = 20)
    public String getDistributionListProcessedNo() {
        return distributionListProcessedNo;
    }

    public void setDistributionListProcessedNo(String distributionListProcessedNo) {
        this.distributionListProcessedNo = distributionListProcessedNo;
    }

    @Basic
    @Column(name = "DistributionList_creater_no", nullable = true, length = 8)
    public String getDistributionListCreaterNo() {
        return distributionListCreaterNo;
    }

    public void setDistributionListCreaterNo(String distributionListCreaterNo) {
        this.distributionListCreaterNo = distributionListCreaterNo;
    }

    @Basic
    @Column(name = "DistributionList_create_date", nullable = true)
    public Timestamp getDistributionListCreateDate() {
        return distributionListCreateDate;
    }

    public void setDistributionListCreateDate(Timestamp distributionListCreateDate) {
        this.distributionListCreateDate = distributionListCreateDate;
    }

    @Basic
    @Column(name = "DistributionList_modifi_no", nullable = true, length = 8)
    public String getDistributionListModifiNo() {
        return distributionListModifiNo;
    }

    public void setDistributionListModifiNo(String distributionListModifiNo) {
        this.distributionListModifiNo = distributionListModifiNo;
    }

    @Basic
    @Column(name = "DistributionList_modifi_time", nullable = true)
    public Timestamp getDistributionListModifiTime() {
        return distributionListModifiTime;
    }

    public void setDistributionListModifiTime(Timestamp distributionListModifiTime) {
        this.distributionListModifiTime = distributionListModifiTime;
    }

    @Basic
    @Column(name = "DistributionList_checker", nullable = true, length = 8)
    public String getDistributionListChecker() {
        return distributionListChecker;
    }

    public void setDistributionListChecker(String distributionListChecker) {
        this.distributionListChecker = distributionListChecker;
    }

    @Basic
    @Column(name = "DistributionList_check_date", nullable = true)
    public Timestamp getDistributionListCheckDate() {
        return distributionListCheckDate;
    }

    public void setDistributionListCheckDate(Timestamp distributionListCheckDate) {
        this.distributionListCheckDate = distributionListCheckDate;
    }

    @Basic
    @Column(name = "DistributionList_group_node_id", nullable = false, length = 20)
    public String getDistributionListGroupNodeId() {
        return distributionListGroupNodeId;
    }

    public void setDistributionListGroupNodeId(String distributionListGroupNodeId) {
        this.distributionListGroupNodeId = distributionListGroupNodeId;
    }

    @Basic
    @Column(name = "DistributionList_isPass", nullable = true, length = 1)
    public String getDistributionListIsPass() {
        return distributionListIsPass;
    }

    public void setDistributionListIsPass(String distributionListIsPass) {
        this.distributionListIsPass = distributionListIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistributionListEntity that = (DistributionListEntity) o;

        if (distributionListDetailId != that.distributionListDetailId) return false;
        if (distributionListOutPresentNo != null ? !distributionListOutPresentNo.equals(that.distributionListOutPresentNo) : that.distributionListOutPresentNo != null)
            return false;
        if (distributionListDeliveryLine != null ? !distributionListDeliveryLine.equals(that.distributionListDeliveryLine) : that.distributionListDeliveryLine != null)
            return false;
        if (distributionListOutDate != null ? !distributionListOutDate.equals(that.distributionListOutDate) : that.distributionListOutDate != null)
            return false;
        if (distributionListCarNo != null ? !distributionListCarNo.equals(that.distributionListCarNo) : that.distributionListCarNo != null)
            return false;
        if (distributionListDeliverymanNo != null ? !distributionListDeliverymanNo.equals(that.distributionListDeliverymanNo) : that.distributionListDeliverymanNo != null)
            return false;
        if (distributionListVolume != null ? !distributionListVolume.equals(that.distributionListVolume) : that.distributionListVolume != null)
            return false;
        if (distributionListWeight != null ? !distributionListWeight.equals(that.distributionListWeight) : that.distributionListWeight != null)
            return false;
        if (distributionListClientNo != null ? !distributionListClientNo.equals(that.distributionListClientNo) : that.distributionListClientNo != null)
            return false;
        if (distributionListProcessedNo != null ? !distributionListProcessedNo.equals(that.distributionListProcessedNo) : that.distributionListProcessedNo != null)
            return false;
        if (distributionListCreaterNo != null ? !distributionListCreaterNo.equals(that.distributionListCreaterNo) : that.distributionListCreaterNo != null)
            return false;
        if (distributionListCreateDate != null ? !distributionListCreateDate.equals(that.distributionListCreateDate) : that.distributionListCreateDate != null)
            return false;
        if (distributionListModifiNo != null ? !distributionListModifiNo.equals(that.distributionListModifiNo) : that.distributionListModifiNo != null)
            return false;
        if (distributionListModifiTime != null ? !distributionListModifiTime.equals(that.distributionListModifiTime) : that.distributionListModifiTime != null)
            return false;
        if (distributionListChecker != null ? !distributionListChecker.equals(that.distributionListChecker) : that.distributionListChecker != null)
            return false;
        if (distributionListCheckDate != null ? !distributionListCheckDate.equals(that.distributionListCheckDate) : that.distributionListCheckDate != null)
            return false;
        if (distributionListGroupNodeId != null ? !distributionListGroupNodeId.equals(that.distributionListGroupNodeId) : that.distributionListGroupNodeId != null)
            return false;
        if (distributionListIsPass != null ? !distributionListIsPass.equals(that.distributionListIsPass) : that.distributionListIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = distributionListOutPresentNo != null ? distributionListOutPresentNo.hashCode() : 0;
        result = 31 * result + (distributionListDeliveryLine != null ? distributionListDeliveryLine.hashCode() : 0);
        result = 31 * result + (distributionListOutDate != null ? distributionListOutDate.hashCode() : 0);
        result = 31 * result + (distributionListCarNo != null ? distributionListCarNo.hashCode() : 0);
        result = 31 * result + (distributionListDeliverymanNo != null ? distributionListDeliverymanNo.hashCode() : 0);
        result = 31 * result + (distributionListVolume != null ? distributionListVolume.hashCode() : 0);
        result = 31 * result + (distributionListWeight != null ? distributionListWeight.hashCode() : 0);
        result = 31 * result + distributionListDetailId;
        result = 31 * result + (distributionListClientNo != null ? distributionListClientNo.hashCode() : 0);
        result = 31 * result + (distributionListProcessedNo != null ? distributionListProcessedNo.hashCode() : 0);
        result = 31 * result + (distributionListCreaterNo != null ? distributionListCreaterNo.hashCode() : 0);
        result = 31 * result + (distributionListCreateDate != null ? distributionListCreateDate.hashCode() : 0);
        result = 31 * result + (distributionListModifiNo != null ? distributionListModifiNo.hashCode() : 0);
        result = 31 * result + (distributionListModifiTime != null ? distributionListModifiTime.hashCode() : 0);
        result = 31 * result + (distributionListChecker != null ? distributionListChecker.hashCode() : 0);
        result = 31 * result + (distributionListCheckDate != null ? distributionListCheckDate.hashCode() : 0);
        result = 31 * result + (distributionListGroupNodeId != null ? distributionListGroupNodeId.hashCode() : 0);
        result = 31 * result + (distributionListIsPass != null ? distributionListIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_car_no", referencedColumnName = "t_car_car_no")
    public TCarEntity gettCarByDistributionListCarNo() {
        return tCarByDistributionListCarNo;
    }

    public void settCarByDistributionListCarNo(TCarEntity tCarByDistributionListCarNo) {
        this.tCarByDistributionListCarNo = tCarByDistributionListCarNo;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_deliveryman_no", referencedColumnName = "deliveryman_deliveryman_no")
    public DeliverymanEntity getDeliverymanByDistributionListDeliverymanNo() {
        return deliverymanByDistributionListDeliverymanNo;
    }

    public void setDeliverymanByDistributionListDeliverymanNo(DeliverymanEntity deliverymanByDistributionListDeliverymanNo) {
        this.deliverymanByDistributionListDeliverymanNo = deliverymanByDistributionListDeliverymanNo;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_client_no", referencedColumnName = "t_client_client_no")
    public TClientEntity gettClientByDistributionListClientNo() {
        return tClientByDistributionListClientNo;
    }

    public void settClientByDistributionListClientNo(TClientEntity tClientByDistributionListClientNo) {
        this.tClientByDistributionListClientNo = tClientByDistributionListClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByDistributionListCreaterNo() {
        return tStaffByDistributionListCreaterNo;
    }

    public void settStaffByDistributionListCreaterNo(TStaffEntity tStaffByDistributionListCreaterNo) {
        this.tStaffByDistributionListCreaterNo = tStaffByDistributionListCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByDistributionListModifiNo() {
        return tStaffByDistributionListModifiNo;
    }

    public void settStaffByDistributionListModifiNo(TStaffEntity tStaffByDistributionListModifiNo) {
        this.tStaffByDistributionListModifiNo = tStaffByDistributionListModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByDistributionListChecker() {
        return tStaffByDistributionListChecker;
    }

    public void settStaffByDistributionListChecker(TStaffEntity tStaffByDistributionListChecker) {
        this.tStaffByDistributionListChecker = tStaffByDistributionListChecker;
    }

    @ManyToOne
    @JoinColumn(name = "DistributionList_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByDistributionListGroupNodeId() {
        return tOrgByDistributionListGroupNodeId;
    }

    public void settOrgByDistributionListGroupNodeId(TOrgEntity tOrgByDistributionListGroupNodeId) {
        this.tOrgByDistributionListGroupNodeId = tOrgByDistributionListGroupNodeId;
    }
}
