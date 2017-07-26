package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_car", schema = "dbo", catalog = "logistics_test")
public class TCarEntity {
    private String tCarCarNo;
    private String tCarCarCardno;
    private String tCarDriver;
    private String tCarSex;
    private Integer tCarAge;
    private String tCarMobile;
    private String tCarDriverCardno;
    private String tCarHomeAddress;
    private String tCarCarBrand;
    private Short tCarCarVal;
    private Short tCarCarLoad;
    private Short tCarCarLength;
    private Short tCarBoxcarLength;
    private Short tCarCarHight;
    private Short tCarBoxcarHight;
    private String tCarEncloseBoxcar;
    private Short tCarOVol;
    private String tCarGreenTag;
    private String tCarColor;
    private Integer tCarBusload;
    private String tCarPowerType;
    private String tCarContainerCar;
    private String tCarOutTransport;
    private String tCarFlag;
    private String tCarRemark;
    private String tCarGroupNodeId;
    private String tCarCreaterNo;
    private Timestamp tCarCreateDate;
    private String tCarModifiNo;
    private Timestamp tCarModifiTime;
    private Collection<DistributionListEntity> distributionListsByTCarCarNo;
    private TOrgEntity tOrgByTCarGroupNodeId;
    private TStaffEntity tStaffByTCarCreaterNo;
    private TStaffEntity tStaffByTCarModifiNo;

    @Id
    @Column(name = "t_car_car_no", nullable = false, length = 10)
    public String gettCarCarNo() {
        return tCarCarNo;
    }

    public void settCarCarNo(String tCarCarNo) {
        this.tCarCarNo = tCarCarNo;
    }

    @Basic
    @Column(name = "t_car_car_cardno", nullable = false, length = 30)
    public String gettCarCarCardno() {
        return tCarCarCardno;
    }

    public void settCarCarCardno(String tCarCarCardno) {
        this.tCarCarCardno = tCarCarCardno;
    }

    @Basic
    @Column(name = "t_car_driver", nullable = false, length = 30)
    public String gettCarDriver() {
        return tCarDriver;
    }

    public void settCarDriver(String tCarDriver) {
        this.tCarDriver = tCarDriver;
    }

    @Basic
    @Column(name = "t_car_sex", nullable = true, length = 6)
    public String gettCarSex() {
        return tCarSex;
    }

    public void settCarSex(String tCarSex) {
        this.tCarSex = tCarSex;
    }

    @Basic
    @Column(name = "t_car_age", nullable = true)
    public Integer gettCarAge() {
        return tCarAge;
    }

    public void settCarAge(Integer tCarAge) {
        this.tCarAge = tCarAge;
    }

    @Basic
    @Column(name = "t_car_mobile", nullable = false, length = 30)
    public String gettCarMobile() {
        return tCarMobile;
    }

    public void settCarMobile(String tCarMobile) {
        this.tCarMobile = tCarMobile;
    }

    @Basic
    @Column(name = "t_car_driver_cardno", nullable = false, length = 30)
    public String gettCarDriverCardno() {
        return tCarDriverCardno;
    }

    public void settCarDriverCardno(String tCarDriverCardno) {
        this.tCarDriverCardno = tCarDriverCardno;
    }

    @Basic
    @Column(name = "t_car_home_address", nullable = true, length = 100)
    public String gettCarHomeAddress() {
        return tCarHomeAddress;
    }

    public void settCarHomeAddress(String tCarHomeAddress) {
        this.tCarHomeAddress = tCarHomeAddress;
    }

    @Basic
    @Column(name = "t_car_car_brand", nullable = true, length = 30)
    public String gettCarCarBrand() {
        return tCarCarBrand;
    }

    public void settCarCarBrand(String tCarCarBrand) {
        this.tCarCarBrand = tCarCarBrand;
    }

    @Basic
    @Column(name = "t_car_car_val", nullable = true)
    public Short gettCarCarVal() {
        return tCarCarVal;
    }

    public void settCarCarVal(Short tCarCarVal) {
        this.tCarCarVal = tCarCarVal;
    }

    @Basic
    @Column(name = "t_car_car_load", nullable = true)
    public Short gettCarCarLoad() {
        return tCarCarLoad;
    }

    public void settCarCarLoad(Short tCarCarLoad) {
        this.tCarCarLoad = tCarCarLoad;
    }

    @Basic
    @Column(name = "t_car_car_length", nullable = true)
    public Short gettCarCarLength() {
        return tCarCarLength;
    }

    public void settCarCarLength(Short tCarCarLength) {
        this.tCarCarLength = tCarCarLength;
    }

    @Basic
    @Column(name = "t_car_boxcar_length", nullable = true)
    public Short gettCarBoxcarLength() {
        return tCarBoxcarLength;
    }

    public void settCarBoxcarLength(Short tCarBoxcarLength) {
        this.tCarBoxcarLength = tCarBoxcarLength;
    }

    @Basic
    @Column(name = "t_car_car_hight", nullable = true)
    public Short gettCarCarHight() {
        return tCarCarHight;
    }

    public void settCarCarHight(Short tCarCarHight) {
        this.tCarCarHight = tCarCarHight;
    }

    @Basic
    @Column(name = "t_car_boxcar_hight", nullable = true)
    public Short gettCarBoxcarHight() {
        return tCarBoxcarHight;
    }

    public void settCarBoxcarHight(Short tCarBoxcarHight) {
        this.tCarBoxcarHight = tCarBoxcarHight;
    }

    @Basic
    @Column(name = "t_car_enclose_boxcar", nullable = true, length = 1)
    public String gettCarEncloseBoxcar() {
        return tCarEncloseBoxcar;
    }

    public void settCarEncloseBoxcar(String tCarEncloseBoxcar) {
        this.tCarEncloseBoxcar = tCarEncloseBoxcar;
    }

    @Basic
    @Column(name = "t_car_o_vol", nullable = true)
    public Short gettCarOVol() {
        return tCarOVol;
    }

    public void settCarOVol(Short tCarOVol) {
        this.tCarOVol = tCarOVol;
    }

    @Basic
    @Column(name = "t_car_green_tag", nullable = true, length = 1)
    public String gettCarGreenTag() {
        return tCarGreenTag;
    }

    public void settCarGreenTag(String tCarGreenTag) {
        this.tCarGreenTag = tCarGreenTag;
    }

    @Basic
    @Column(name = "t_car_color", nullable = true, length = 10)
    public String gettCarColor() {
        return tCarColor;
    }

    public void settCarColor(String tCarColor) {
        this.tCarColor = tCarColor;
    }

    @Basic
    @Column(name = "t_car_busload", nullable = true)
    public Integer gettCarBusload() {
        return tCarBusload;
    }

    public void settCarBusload(Integer tCarBusload) {
        this.tCarBusload = tCarBusload;
    }

    @Basic
    @Column(name = "t_car_power_type", nullable = true, length = 10)
    public String gettCarPowerType() {
        return tCarPowerType;
    }

    public void settCarPowerType(String tCarPowerType) {
        this.tCarPowerType = tCarPowerType;
    }

    @Basic
    @Column(name = "t_car_Container_car", nullable = true, length = 1)
    public String gettCarContainerCar() {
        return tCarContainerCar;
    }

    public void settCarContainerCar(String tCarContainerCar) {
        this.tCarContainerCar = tCarContainerCar;
    }

    @Basic
    @Column(name = "t_car_out_transport", nullable = true, length = 1)
    public String gettCarOutTransport() {
        return tCarOutTransport;
    }

    public void settCarOutTransport(String tCarOutTransport) {
        this.tCarOutTransport = tCarOutTransport;
    }

    @Basic
    @Column(name = "t_car_flag", nullable = false, length = 1)
    public String gettCarFlag() {
        return tCarFlag;
    }

    public void settCarFlag(String tCarFlag) {
        this.tCarFlag = tCarFlag;
    }

    @Basic
    @Column(name = "t_car_remark", nullable = true, length = 100)
    public String gettCarRemark() {
        return tCarRemark;
    }

    public void settCarRemark(String tCarRemark) {
        this.tCarRemark = tCarRemark;
    }

    @Basic
    @Column(name = "t_car_group_node_id", nullable = false, length = 20)
    public String gettCarGroupNodeId() {
        return tCarGroupNodeId;
    }

    public void settCarGroupNodeId(String tCarGroupNodeId) {
        this.tCarGroupNodeId = tCarGroupNodeId;
    }

    @Basic
    @Column(name = "t_car_creater_no", nullable = true, length = 8)
    public String gettCarCreaterNo() {
        return tCarCreaterNo;
    }

    public void settCarCreaterNo(String tCarCreaterNo) {
        this.tCarCreaterNo = tCarCreaterNo;
    }

    @Basic
    @Column(name = "t_car_create_date", nullable = true)
    public Timestamp gettCarCreateDate() {
        return tCarCreateDate;
    }

    public void settCarCreateDate(Timestamp tCarCreateDate) {
        this.tCarCreateDate = tCarCreateDate;
    }

    @Basic
    @Column(name = "t_car_modifi_no", nullable = true, length = 8)
    public String gettCarModifiNo() {
        return tCarModifiNo;
    }

    public void settCarModifiNo(String tCarModifiNo) {
        this.tCarModifiNo = tCarModifiNo;
    }

    @Basic
    @Column(name = "t_car_modifi_time", nullable = true)
    public Timestamp gettCarModifiTime() {
        return tCarModifiTime;
    }

    public void settCarModifiTime(Timestamp tCarModifiTime) {
        this.tCarModifiTime = tCarModifiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCarEntity that = (TCarEntity) o;

        if (tCarCarNo != null ? !tCarCarNo.equals(that.tCarCarNo) : that.tCarCarNo != null) return false;
        if (tCarCarCardno != null ? !tCarCarCardno.equals(that.tCarCarCardno) : that.tCarCarCardno != null)
            return false;
        if (tCarDriver != null ? !tCarDriver.equals(that.tCarDriver) : that.tCarDriver != null) return false;
        if (tCarSex != null ? !tCarSex.equals(that.tCarSex) : that.tCarSex != null) return false;
        if (tCarAge != null ? !tCarAge.equals(that.tCarAge) : that.tCarAge != null) return false;
        if (tCarMobile != null ? !tCarMobile.equals(that.tCarMobile) : that.tCarMobile != null) return false;
        if (tCarDriverCardno != null ? !tCarDriverCardno.equals(that.tCarDriverCardno) : that.tCarDriverCardno != null)
            return false;
        if (tCarHomeAddress != null ? !tCarHomeAddress.equals(that.tCarHomeAddress) : that.tCarHomeAddress != null)
            return false;
        if (tCarCarBrand != null ? !tCarCarBrand.equals(that.tCarCarBrand) : that.tCarCarBrand != null) return false;
        if (tCarCarVal != null ? !tCarCarVal.equals(that.tCarCarVal) : that.tCarCarVal != null) return false;
        if (tCarCarLoad != null ? !tCarCarLoad.equals(that.tCarCarLoad) : that.tCarCarLoad != null) return false;
        if (tCarCarLength != null ? !tCarCarLength.equals(that.tCarCarLength) : that.tCarCarLength != null)
            return false;
        if (tCarBoxcarLength != null ? !tCarBoxcarLength.equals(that.tCarBoxcarLength) : that.tCarBoxcarLength != null)
            return false;
        if (tCarCarHight != null ? !tCarCarHight.equals(that.tCarCarHight) : that.tCarCarHight != null) return false;
        if (tCarBoxcarHight != null ? !tCarBoxcarHight.equals(that.tCarBoxcarHight) : that.tCarBoxcarHight != null)
            return false;
        if (tCarEncloseBoxcar != null ? !tCarEncloseBoxcar.equals(that.tCarEncloseBoxcar) : that.tCarEncloseBoxcar != null)
            return false;
        if (tCarOVol != null ? !tCarOVol.equals(that.tCarOVol) : that.tCarOVol != null) return false;
        if (tCarGreenTag != null ? !tCarGreenTag.equals(that.tCarGreenTag) : that.tCarGreenTag != null) return false;
        if (tCarColor != null ? !tCarColor.equals(that.tCarColor) : that.tCarColor != null) return false;
        if (tCarBusload != null ? !tCarBusload.equals(that.tCarBusload) : that.tCarBusload != null) return false;
        if (tCarPowerType != null ? !tCarPowerType.equals(that.tCarPowerType) : that.tCarPowerType != null)
            return false;
        if (tCarContainerCar != null ? !tCarContainerCar.equals(that.tCarContainerCar) : that.tCarContainerCar != null)
            return false;
        if (tCarOutTransport != null ? !tCarOutTransport.equals(that.tCarOutTransport) : that.tCarOutTransport != null)
            return false;
        if (tCarFlag != null ? !tCarFlag.equals(that.tCarFlag) : that.tCarFlag != null) return false;
        if (tCarRemark != null ? !tCarRemark.equals(that.tCarRemark) : that.tCarRemark != null) return false;
        if (tCarGroupNodeId != null ? !tCarGroupNodeId.equals(that.tCarGroupNodeId) : that.tCarGroupNodeId != null)
            return false;
        if (tCarCreaterNo != null ? !tCarCreaterNo.equals(that.tCarCreaterNo) : that.tCarCreaterNo != null)
            return false;
        if (tCarCreateDate != null ? !tCarCreateDate.equals(that.tCarCreateDate) : that.tCarCreateDate != null)
            return false;
        if (tCarModifiNo != null ? !tCarModifiNo.equals(that.tCarModifiNo) : that.tCarModifiNo != null) return false;
        if (tCarModifiTime != null ? !tCarModifiTime.equals(that.tCarModifiTime) : that.tCarModifiTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tCarCarNo != null ? tCarCarNo.hashCode() : 0;
        result = 31 * result + (tCarCarCardno != null ? tCarCarCardno.hashCode() : 0);
        result = 31 * result + (tCarDriver != null ? tCarDriver.hashCode() : 0);
        result = 31 * result + (tCarSex != null ? tCarSex.hashCode() : 0);
        result = 31 * result + (tCarAge != null ? tCarAge.hashCode() : 0);
        result = 31 * result + (tCarMobile != null ? tCarMobile.hashCode() : 0);
        result = 31 * result + (tCarDriverCardno != null ? tCarDriverCardno.hashCode() : 0);
        result = 31 * result + (tCarHomeAddress != null ? tCarHomeAddress.hashCode() : 0);
        result = 31 * result + (tCarCarBrand != null ? tCarCarBrand.hashCode() : 0);
        result = 31 * result + (tCarCarVal != null ? tCarCarVal.hashCode() : 0);
        result = 31 * result + (tCarCarLoad != null ? tCarCarLoad.hashCode() : 0);
        result = 31 * result + (tCarCarLength != null ? tCarCarLength.hashCode() : 0);
        result = 31 * result + (tCarBoxcarLength != null ? tCarBoxcarLength.hashCode() : 0);
        result = 31 * result + (tCarCarHight != null ? tCarCarHight.hashCode() : 0);
        result = 31 * result + (tCarBoxcarHight != null ? tCarBoxcarHight.hashCode() : 0);
        result = 31 * result + (tCarEncloseBoxcar != null ? tCarEncloseBoxcar.hashCode() : 0);
        result = 31 * result + (tCarOVol != null ? tCarOVol.hashCode() : 0);
        result = 31 * result + (tCarGreenTag != null ? tCarGreenTag.hashCode() : 0);
        result = 31 * result + (tCarColor != null ? tCarColor.hashCode() : 0);
        result = 31 * result + (tCarBusload != null ? tCarBusload.hashCode() : 0);
        result = 31 * result + (tCarPowerType != null ? tCarPowerType.hashCode() : 0);
        result = 31 * result + (tCarContainerCar != null ? tCarContainerCar.hashCode() : 0);
        result = 31 * result + (tCarOutTransport != null ? tCarOutTransport.hashCode() : 0);
        result = 31 * result + (tCarFlag != null ? tCarFlag.hashCode() : 0);
        result = 31 * result + (tCarRemark != null ? tCarRemark.hashCode() : 0);
        result = 31 * result + (tCarGroupNodeId != null ? tCarGroupNodeId.hashCode() : 0);
        result = 31 * result + (tCarCreaterNo != null ? tCarCreaterNo.hashCode() : 0);
        result = 31 * result + (tCarCreateDate != null ? tCarCreateDate.hashCode() : 0);
        result = 31 * result + (tCarModifiNo != null ? tCarModifiNo.hashCode() : 0);
        result = 31 * result + (tCarModifiTime != null ? tCarModifiTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tCarByDistributionListCarNo")
    public Collection<DistributionListEntity> getDistributionListsByTCarCarNo() {
        return distributionListsByTCarCarNo;
    }

    public void setDistributionListsByTCarCarNo(Collection<DistributionListEntity> distributionListsByTCarCarNo) {
        this.distributionListsByTCarCarNo = distributionListsByTCarCarNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_car_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByTCarGroupNodeId() {
        return tOrgByTCarGroupNodeId;
    }

    public void settOrgByTCarGroupNodeId(TOrgEntity tOrgByTCarGroupNodeId) {
        this.tOrgByTCarGroupNodeId = tOrgByTCarGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_car_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTCarCreaterNo() {
        return tStaffByTCarCreaterNo;
    }

    public void settStaffByTCarCreaterNo(TStaffEntity tStaffByTCarCreaterNo) {
        this.tStaffByTCarCreaterNo = tStaffByTCarCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_car_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTCarModifiNo() {
        return tStaffByTCarModifiNo;
    }

    public void settStaffByTCarModifiNo(TStaffEntity tStaffByTCarModifiNo) {
        this.tStaffByTCarModifiNo = tStaffByTCarModifiNo;
    }
}
