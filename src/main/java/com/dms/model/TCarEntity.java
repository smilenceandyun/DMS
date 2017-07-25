package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by laoli on 2017/7/25.sdsdsd
 */
@Entity
@Table(name = "t_car", schema = "dbo", catalog = "logistics_test")
public class TCarEntity {
    private String carNo;
    private String carCardno;
    private String driver;
    private String sex;
    private Integer age;
    private String mobile;
    private String driverCardno;
    private String homeAddress;
    private String carBrand;
    private Short carVal;
    private Short carLoad;
    private Short carLength;
    private Short boxcarLength;
    private Short carHight;
    private Short boxcarHight;
    private String encloseBoxcar;
    private Short oVol;
    private String greenTag;
    private String color;
    private Integer busload;
    private String powerType;
    private String containerCar;
    private String outTransport;
    private String flag;
    private String remark;
    private Timestamp createDate;
    private Timestamp modifiTime;

    @Id
    @Column(name = "car_no", nullable = false, length = 10)
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    @Basic
    @Column(name = "car_cardno", nullable = false, length = 30)
    public String getCarCardno() {
        return carCardno;
    }

    public void setCarCardno(String carCardno) {
        this.carCardno = carCardno;
    }

    @Basic
    @Column(name = "driver", nullable = false, length = 30)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 6)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "mobile", nullable = false, length = 30)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "driver_cardno", nullable = false, length = 30)
    public String getDriverCardno() {
        return driverCardno;
    }

    public void setDriverCardno(String driverCardno) {
        this.driverCardno = driverCardno;
    }

    @Basic
    @Column(name = "home_address", nullable = true, length = 100)
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Basic
    @Column(name = "car_brand", nullable = true, length = 30)
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Basic
    @Column(name = "car_val", nullable = true)
    public Short getCarVal() {
        return carVal;
    }

    public void setCarVal(Short carVal) {
        this.carVal = carVal;
    }

    @Basic
    @Column(name = "car_load", nullable = true)
    public Short getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(Short carLoad) {
        this.carLoad = carLoad;
    }

    @Basic
    @Column(name = "car_length", nullable = true)
    public Short getCarLength() {
        return carLength;
    }

    public void setCarLength(Short carLength) {
        this.carLength = carLength;
    }

    @Basic
    @Column(name = "boxcar_length", nullable = true)
    public Short getBoxcarLength() {
        return boxcarLength;
    }

    public void setBoxcarLength(Short boxcarLength) {
        this.boxcarLength = boxcarLength;
    }

    @Basic
    @Column(name = "car_hight", nullable = true)
    public Short getCarHight() {
        return carHight;
    }

    public void setCarHight(Short carHight) {
        this.carHight = carHight;
    }

    @Basic
    @Column(name = "boxcar_hight", nullable = true)
    public Short getBoxcarHight() {
        return boxcarHight;
    }

    public void setBoxcarHight(Short boxcarHight) {
        this.boxcarHight = boxcarHight;
    }

    @Basic
    @Column(name = "enclose_boxcar", nullable = true, length = -1)
    public String getEncloseBoxcar() {
        return encloseBoxcar;
    }

    public void setEncloseBoxcar(String encloseBoxcar) {
        this.encloseBoxcar = encloseBoxcar;
    }

    @Basic
    @Column(name = "o_vol", nullable = true)
    public Short getoVol() {
        return oVol;
    }

    public void setoVol(Short oVol) {
        this.oVol = oVol;
    }

    @Basic
    @Column(name = "green_tag", nullable = true, length = -1)
    public String getGreenTag() {
        return greenTag;
    }

    public void setGreenTag(String greenTag) {
        this.greenTag = greenTag;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 10)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "busload", nullable = true)
    public Integer getBusload() {
        return busload;
    }

    public void setBusload(Integer busload) {
        this.busload = busload;
    }

    @Basic
    @Column(name = "power_type", nullable = true, length = 10)
    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Basic
    @Column(name = "Container_car", nullable = true, length = -1)
    public String getContainerCar() {
        return containerCar;
    }

    public void setContainerCar(String containerCar) {
        this.containerCar = containerCar;
    }

    @Basic
    @Column(name = "out_transport", nullable = true, length = -1)
    public String getOutTransport() {
        return outTransport;
    }

    public void setOutTransport(String outTransport) {
        this.outTransport = outTransport;
    }

    @Basic
    @Column(name = "flag", nullable = false, length = -1)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifi_time", nullable = true)
    public Timestamp getModifiTime() {
        return modifiTime;
    }

    public void setModifiTime(Timestamp modifiTime) {
        this.modifiTime = modifiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCarEntity that = (TCarEntity) o;

        if (carNo != null ? !carNo.equals(that.carNo) : that.carNo != null) return false;
        if (carCardno != null ? !carCardno.equals(that.carCardno) : that.carCardno != null) return false;
        if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (driverCardno != null ? !driverCardno.equals(that.driverCardno) : that.driverCardno != null) return false;
        if (homeAddress != null ? !homeAddress.equals(that.homeAddress) : that.homeAddress != null) return false;
        if (carBrand != null ? !carBrand.equals(that.carBrand) : that.carBrand != null) return false;
        if (carVal != null ? !carVal.equals(that.carVal) : that.carVal != null) return false;
        if (carLoad != null ? !carLoad.equals(that.carLoad) : that.carLoad != null) return false;
        if (carLength != null ? !carLength.equals(that.carLength) : that.carLength != null) return false;
        if (boxcarLength != null ? !boxcarLength.equals(that.boxcarLength) : that.boxcarLength != null) return false;
        if (carHight != null ? !carHight.equals(that.carHight) : that.carHight != null) return false;
        if (boxcarHight != null ? !boxcarHight.equals(that.boxcarHight) : that.boxcarHight != null) return false;
        if (encloseBoxcar != null ? !encloseBoxcar.equals(that.encloseBoxcar) : that.encloseBoxcar != null)
            return false;
        if (oVol != null ? !oVol.equals(that.oVol) : that.oVol != null) return false;
        if (greenTag != null ? !greenTag.equals(that.greenTag) : that.greenTag != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (busload != null ? !busload.equals(that.busload) : that.busload != null) return false;
        if (powerType != null ? !powerType.equals(that.powerType) : that.powerType != null) return false;
        if (containerCar != null ? !containerCar.equals(that.containerCar) : that.containerCar != null) return false;
        if (outTransport != null ? !outTransport.equals(that.outTransport) : that.outTransport != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifiTime != null ? !modifiTime.equals(that.modifiTime) : that.modifiTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carNo != null ? carNo.hashCode() : 0;
        result = 31 * result + (carCardno != null ? carCardno.hashCode() : 0);
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (driverCardno != null ? driverCardno.hashCode() : 0);
        result = 31 * result + (homeAddress != null ? homeAddress.hashCode() : 0);
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (carVal != null ? carVal.hashCode() : 0);
        result = 31 * result + (carLoad != null ? carLoad.hashCode() : 0);
        result = 31 * result + (carLength != null ? carLength.hashCode() : 0);
        result = 31 * result + (boxcarLength != null ? boxcarLength.hashCode() : 0);
        result = 31 * result + (carHight != null ? carHight.hashCode() : 0);
        result = 31 * result + (boxcarHight != null ? boxcarHight.hashCode() : 0);
        result = 31 * result + (encloseBoxcar != null ? encloseBoxcar.hashCode() : 0);
        result = 31 * result + (oVol != null ? oVol.hashCode() : 0);
        result = 31 * result + (greenTag != null ? greenTag.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (busload != null ? busload.hashCode() : 0);
        result = 31 * result + (powerType != null ? powerType.hashCode() : 0);
        result = 31 * result + (containerCar != null ? containerCar.hashCode() : 0);
        result = 31 * result + (outTransport != null ? outTransport.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifiTime != null ? modifiTime.hashCode() : 0);
        return result;
    }
}
