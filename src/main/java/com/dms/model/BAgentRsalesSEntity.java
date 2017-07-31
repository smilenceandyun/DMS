package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "b_agent_rsales_s", schema = "dbo", catalog = "logistics")
@IdClass(BAgentRsalesSEntityPK.class)
public class BAgentRsalesSEntity {
    private String bAgentRsalesSAgentRsalesNo;
    private String bAgentRsalesSAgentRsalesNo2;
    private int bAgentRsalesSDetailId;
    private String bAgentRsalesSRoomNo;
    private String bAgentRsalesSLocationNo;
    private String bAgentRsalesSLotno;
    private Timestamp bAgentRsalesSValidityDate;
    private Timestamp bAgentRsalesSInvalidityDate;
    private String bAgentRsalesSLot;
    private String bAgentRsalesSPaymentNo;
    private String bAgentRsalesSCreaterNo;
    private Timestamp bAgentRsalesSCreateDate;
    private String bAgentRsalesSModifiNo;
    private Timestamp bAgentRsalesSModifiTime;
    private String bAgentRsalesSChecker;
    private Timestamp bAgentRsalesSCheckDate;
    private String bAgentRsalesSGroupNodeId;
    private String bAgentRsalesSRemark;
    private Timestamp bAgentRsalesSAccountCheckDate;
    private String bAgentRsalesSIsPass;
    private BAgentRsalesMEntity bAgentRsalesMByBAgentRsalesSAgentRsalesNo;
    private BAgentSalesMEntity bAgentSalesMByBAgentRsalesSAgentRsalesNo;
    private StoreLocationEntity storeLocationByBAgentRsalesSRoomNo;
    private StoreLocationEntity storeLocationByBAgentRsalesSLocationNo;
    private TPaymentEntity tPaymentByBAgentRsalesSPaymentNo;
    private TStaffEntity tStaffByBAgentRsalesSCreaterNo;
    private TStaffEntity tStaffByBAgentRsalesSModifiNo;
    private TStaffEntity tStaffByBAgentRsalesSChecker;
    private TOrgEntity tOrgByBAgentRsalesSGroupNodeId;

    @Id
    @Column(name = "b_agent_rsales_s_agent_rsales_no", nullable = false, length = 16)
    public String getbAgentRsalesSAgentRsalesNo() {
        return bAgentRsalesSAgentRsalesNo;
    }

    public void setbAgentRsalesSAgentRsalesNo(String bAgentRsalesSAgentRsalesNo) {
        this.bAgentRsalesSAgentRsalesNo = bAgentRsalesSAgentRsalesNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_agent_rsales_no2", nullable = false, length = 16)
    public String getbAgentRsalesSAgentRsalesNo2() {
        return bAgentRsalesSAgentRsalesNo2;
    }

    public void setbAgentRsalesSAgentRsalesNo2(String bAgentRsalesSAgentRsalesNo2) {
        this.bAgentRsalesSAgentRsalesNo2 = bAgentRsalesSAgentRsalesNo2;
    }

    @Id
    @Column(name = "b_agent_rsales_s_detail_id", nullable = false)
    public int getbAgentRsalesSDetailId() {
        return bAgentRsalesSDetailId;
    }

    public void setbAgentRsalesSDetailId(int bAgentRsalesSDetailId) {
        this.bAgentRsalesSDetailId = bAgentRsalesSDetailId;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_room_no", nullable = false, length = 8)
    public String getbAgentRsalesSRoomNo() {
        return bAgentRsalesSRoomNo;
    }

    public void setbAgentRsalesSRoomNo(String bAgentRsalesSRoomNo) {
        this.bAgentRsalesSRoomNo = bAgentRsalesSRoomNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_location_no", nullable = false, length = 8)
    public String getbAgentRsalesSLocationNo() {
        return bAgentRsalesSLocationNo;
    }

    public void setbAgentRsalesSLocationNo(String bAgentRsalesSLocationNo) {
        this.bAgentRsalesSLocationNo = bAgentRsalesSLocationNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_LOTNO", nullable = true, length = 20)
    public String getbAgentRsalesSLotno() {
        return bAgentRsalesSLotno;
    }

    public void setbAgentRsalesSLotno(String bAgentRsalesSLotno) {
        this.bAgentRsalesSLotno = bAgentRsalesSLotno;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_validity_date", nullable = true)
    public Timestamp getbAgentRsalesSValidityDate() {
        return bAgentRsalesSValidityDate;
    }

    public void setbAgentRsalesSValidityDate(Timestamp bAgentRsalesSValidityDate) {
        this.bAgentRsalesSValidityDate = bAgentRsalesSValidityDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_invalidity_date", nullable = true)
    public Timestamp getbAgentRsalesSInvalidityDate() {
        return bAgentRsalesSInvalidityDate;
    }

    public void setbAgentRsalesSInvalidityDate(Timestamp bAgentRsalesSInvalidityDate) {
        this.bAgentRsalesSInvalidityDate = bAgentRsalesSInvalidityDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_LOT", nullable = false, length = 20)
    public String getbAgentRsalesSLot() {
        return bAgentRsalesSLot;
    }

    public void setbAgentRsalesSLot(String bAgentRsalesSLot) {
        this.bAgentRsalesSLot = bAgentRsalesSLot;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_payment_no", nullable = true, length = 4)
    public String getbAgentRsalesSPaymentNo() {
        return bAgentRsalesSPaymentNo;
    }

    public void setbAgentRsalesSPaymentNo(String bAgentRsalesSPaymentNo) {
        this.bAgentRsalesSPaymentNo = bAgentRsalesSPaymentNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_creater_no", nullable = true, length = 8)
    public String getbAgentRsalesSCreaterNo() {
        return bAgentRsalesSCreaterNo;
    }

    public void setbAgentRsalesSCreaterNo(String bAgentRsalesSCreaterNo) {
        this.bAgentRsalesSCreaterNo = bAgentRsalesSCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_create_date", nullable = true)
    public Timestamp getbAgentRsalesSCreateDate() {
        return bAgentRsalesSCreateDate;
    }

    public void setbAgentRsalesSCreateDate(Timestamp bAgentRsalesSCreateDate) {
        this.bAgentRsalesSCreateDate = bAgentRsalesSCreateDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_modifi_no", nullable = true, length = 8)
    public String getbAgentRsalesSModifiNo() {
        return bAgentRsalesSModifiNo;
    }

    public void setbAgentRsalesSModifiNo(String bAgentRsalesSModifiNo) {
        this.bAgentRsalesSModifiNo = bAgentRsalesSModifiNo;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_modifi_time", nullable = true)
    public Timestamp getbAgentRsalesSModifiTime() {
        return bAgentRsalesSModifiTime;
    }

    public void setbAgentRsalesSModifiTime(Timestamp bAgentRsalesSModifiTime) {
        this.bAgentRsalesSModifiTime = bAgentRsalesSModifiTime;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_checker", nullable = true, length = 8)
    public String getbAgentRsalesSChecker() {
        return bAgentRsalesSChecker;
    }

    public void setbAgentRsalesSChecker(String bAgentRsalesSChecker) {
        this.bAgentRsalesSChecker = bAgentRsalesSChecker;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_check_date", nullable = true)
    public Timestamp getbAgentRsalesSCheckDate() {
        return bAgentRsalesSCheckDate;
    }

    public void setbAgentRsalesSCheckDate(Timestamp bAgentRsalesSCheckDate) {
        this.bAgentRsalesSCheckDate = bAgentRsalesSCheckDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_group_node_id", nullable = false, length = 20)
    public String getbAgentRsalesSGroupNodeId() {
        return bAgentRsalesSGroupNodeId;
    }

    public void setbAgentRsalesSGroupNodeId(String bAgentRsalesSGroupNodeId) {
        this.bAgentRsalesSGroupNodeId = bAgentRsalesSGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_remark", nullable = true, length = 200)
    public String getbAgentRsalesSRemark() {
        return bAgentRsalesSRemark;
    }

    public void setbAgentRsalesSRemark(String bAgentRsalesSRemark) {
        this.bAgentRsalesSRemark = bAgentRsalesSRemark;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_account_check_date", nullable = true)
    public Timestamp getbAgentRsalesSAccountCheckDate() {
        return bAgentRsalesSAccountCheckDate;
    }

    public void setbAgentRsalesSAccountCheckDate(Timestamp bAgentRsalesSAccountCheckDate) {
        this.bAgentRsalesSAccountCheckDate = bAgentRsalesSAccountCheckDate;
    }

    @Basic
    @Column(name = "b_agent_rsales_s_isPass", nullable = true, length = -1)
    public String getbAgentRsalesSIsPass() {
        return bAgentRsalesSIsPass;
    }

    public void setbAgentRsalesSIsPass(String bAgentRsalesSIsPass) {
        this.bAgentRsalesSIsPass = bAgentRsalesSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentRsalesSEntity that = (BAgentRsalesSEntity) o;

        if (bAgentRsalesSDetailId != that.bAgentRsalesSDetailId) return false;
        if (bAgentRsalesSAgentRsalesNo != null ? !bAgentRsalesSAgentRsalesNo.equals(that.bAgentRsalesSAgentRsalesNo) : that.bAgentRsalesSAgentRsalesNo != null)
            return false;
        if (bAgentRsalesSAgentRsalesNo2 != null ? !bAgentRsalesSAgentRsalesNo2.equals(that.bAgentRsalesSAgentRsalesNo2) : that.bAgentRsalesSAgentRsalesNo2 != null)
            return false;
        if (bAgentRsalesSRoomNo != null ? !bAgentRsalesSRoomNo.equals(that.bAgentRsalesSRoomNo) : that.bAgentRsalesSRoomNo != null)
            return false;
        if (bAgentRsalesSLocationNo != null ? !bAgentRsalesSLocationNo.equals(that.bAgentRsalesSLocationNo) : that.bAgentRsalesSLocationNo != null)
            return false;
        if (bAgentRsalesSLotno != null ? !bAgentRsalesSLotno.equals(that.bAgentRsalesSLotno) : that.bAgentRsalesSLotno != null)
            return false;
        if (bAgentRsalesSValidityDate != null ? !bAgentRsalesSValidityDate.equals(that.bAgentRsalesSValidityDate) : that.bAgentRsalesSValidityDate != null)
            return false;
        if (bAgentRsalesSInvalidityDate != null ? !bAgentRsalesSInvalidityDate.equals(that.bAgentRsalesSInvalidityDate) : that.bAgentRsalesSInvalidityDate != null)
            return false;
        if (bAgentRsalesSLot != null ? !bAgentRsalesSLot.equals(that.bAgentRsalesSLot) : that.bAgentRsalesSLot != null)
            return false;
        if (bAgentRsalesSPaymentNo != null ? !bAgentRsalesSPaymentNo.equals(that.bAgentRsalesSPaymentNo) : that.bAgentRsalesSPaymentNo != null)
            return false;
        if (bAgentRsalesSCreaterNo != null ? !bAgentRsalesSCreaterNo.equals(that.bAgentRsalesSCreaterNo) : that.bAgentRsalesSCreaterNo != null)
            return false;
        if (bAgentRsalesSCreateDate != null ? !bAgentRsalesSCreateDate.equals(that.bAgentRsalesSCreateDate) : that.bAgentRsalesSCreateDate != null)
            return false;
        if (bAgentRsalesSModifiNo != null ? !bAgentRsalesSModifiNo.equals(that.bAgentRsalesSModifiNo) : that.bAgentRsalesSModifiNo != null)
            return false;
        if (bAgentRsalesSModifiTime != null ? !bAgentRsalesSModifiTime.equals(that.bAgentRsalesSModifiTime) : that.bAgentRsalesSModifiTime != null)
            return false;
        if (bAgentRsalesSChecker != null ? !bAgentRsalesSChecker.equals(that.bAgentRsalesSChecker) : that.bAgentRsalesSChecker != null)
            return false;
        if (bAgentRsalesSCheckDate != null ? !bAgentRsalesSCheckDate.equals(that.bAgentRsalesSCheckDate) : that.bAgentRsalesSCheckDate != null)
            return false;
        if (bAgentRsalesSGroupNodeId != null ? !bAgentRsalesSGroupNodeId.equals(that.bAgentRsalesSGroupNodeId) : that.bAgentRsalesSGroupNodeId != null)
            return false;
        if (bAgentRsalesSRemark != null ? !bAgentRsalesSRemark.equals(that.bAgentRsalesSRemark) : that.bAgentRsalesSRemark != null)
            return false;
        if (bAgentRsalesSAccountCheckDate != null ? !bAgentRsalesSAccountCheckDate.equals(that.bAgentRsalesSAccountCheckDate) : that.bAgentRsalesSAccountCheckDate != null)
            return false;
        if (bAgentRsalesSIsPass != null ? !bAgentRsalesSIsPass.equals(that.bAgentRsalesSIsPass) : that.bAgentRsalesSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentRsalesSAgentRsalesNo != null ? bAgentRsalesSAgentRsalesNo.hashCode() : 0;
        result = 31 * result + (bAgentRsalesSAgentRsalesNo2 != null ? bAgentRsalesSAgentRsalesNo2.hashCode() : 0);
        result = 31 * result + bAgentRsalesSDetailId;
        result = 31 * result + (bAgentRsalesSRoomNo != null ? bAgentRsalesSRoomNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSLocationNo != null ? bAgentRsalesSLocationNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSLotno != null ? bAgentRsalesSLotno.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSValidityDate != null ? bAgentRsalesSValidityDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSInvalidityDate != null ? bAgentRsalesSInvalidityDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSLot != null ? bAgentRsalesSLot.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSPaymentNo != null ? bAgentRsalesSPaymentNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSCreaterNo != null ? bAgentRsalesSCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSCreateDate != null ? bAgentRsalesSCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSModifiNo != null ? bAgentRsalesSModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSModifiTime != null ? bAgentRsalesSModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSChecker != null ? bAgentRsalesSChecker.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSCheckDate != null ? bAgentRsalesSCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSGroupNodeId != null ? bAgentRsalesSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSRemark != null ? bAgentRsalesSRemark.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSAccountCheckDate != null ? bAgentRsalesSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentRsalesSIsPass != null ? bAgentRsalesSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_agent_rsales_no", referencedColumnName = "b_agent_rsales_m_agent_rsales_no", nullable = false,insertable = false, updatable = false)
    public BAgentRsalesMEntity getbAgentRsalesMByBAgentRsalesSAgentRsalesNo() {
        return bAgentRsalesMByBAgentRsalesSAgentRsalesNo;
    }

    public void setbAgentRsalesMByBAgentRsalesSAgentRsalesNo(BAgentRsalesMEntity bAgentRsalesMByBAgentRsalesSAgentRsalesNo) {
        this.bAgentRsalesMByBAgentRsalesSAgentRsalesNo = bAgentRsalesMByBAgentRsalesSAgentRsalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_agent_rsales_no", referencedColumnName = "b_agent_sales_m_agent_sales_no", nullable = false,insertable = false, updatable = false)
    public BAgentSalesMEntity getbAgentSalesMByBAgentRsalesSAgentRsalesNo() {
        return bAgentSalesMByBAgentRsalesSAgentRsalesNo;
    }

    public void setbAgentSalesMByBAgentRsalesSAgentRsalesNo(BAgentSalesMEntity bAgentSalesMByBAgentRsalesSAgentRsalesNo) {
        this.bAgentSalesMByBAgentRsalesSAgentRsalesNo = bAgentSalesMByBAgentRsalesSAgentRsalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_room_no", referencedColumnName = "store_location_location_no", nullable = false,insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationByBAgentRsalesSRoomNo() {
        return storeLocationByBAgentRsalesSRoomNo;
    }

    public void setStoreLocationByBAgentRsalesSRoomNo(StoreLocationEntity storeLocationByBAgentRsalesSRoomNo) {
        this.storeLocationByBAgentRsalesSRoomNo = storeLocationByBAgentRsalesSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_location_no", referencedColumnName = "store_location_location_no", nullable = false,insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationByBAgentRsalesSLocationNo() {
        return storeLocationByBAgentRsalesSLocationNo;
    }

    public void setStoreLocationByBAgentRsalesSLocationNo(StoreLocationEntity storeLocationByBAgentRsalesSLocationNo) {
        this.storeLocationByBAgentRsalesSLocationNo = storeLocationByBAgentRsalesSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_payment_no", referencedColumnName = "t_payment_payment_no",insertable = false, updatable = false)
    public TPaymentEntity gettPaymentByBAgentRsalesSPaymentNo() {
        return tPaymentByBAgentRsalesSPaymentNo;
    }

    public void settPaymentByBAgentRsalesSPaymentNo(TPaymentEntity tPaymentByBAgentRsalesSPaymentNo) {
        this.tPaymentByBAgentRsalesSPaymentNo = tPaymentByBAgentRsalesSPaymentNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesSCreaterNo() {
        return tStaffByBAgentRsalesSCreaterNo;
    }

    public void settStaffByBAgentRsalesSCreaterNo(TStaffEntity tStaffByBAgentRsalesSCreaterNo) {
        this.tStaffByBAgentRsalesSCreaterNo = tStaffByBAgentRsalesSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesSModifiNo() {
        return tStaffByBAgentRsalesSModifiNo;
    }

    public void settStaffByBAgentRsalesSModifiNo(TStaffEntity tStaffByBAgentRsalesSModifiNo) {
        this.tStaffByBAgentRsalesSModifiNo = tStaffByBAgentRsalesSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBAgentRsalesSChecker() {
        return tStaffByBAgentRsalesSChecker;
    }

    public void settStaffByBAgentRsalesSChecker(TStaffEntity tStaffByBAgentRsalesSChecker) {
        this.tStaffByBAgentRsalesSChecker = tStaffByBAgentRsalesSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_rsales_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBAgentRsalesSGroupNodeId() {
        return tOrgByBAgentRsalesSGroupNodeId;
    }

    public void settOrgByBAgentRsalesSGroupNodeId(TOrgEntity tOrgByBAgentRsalesSGroupNodeId) {
        this.tOrgByBAgentRsalesSGroupNodeId = tOrgByBAgentRsalesSGroupNodeId;
    }
}
