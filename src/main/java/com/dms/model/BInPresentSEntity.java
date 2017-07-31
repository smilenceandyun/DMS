package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_in_present_s", schema = "dbo", catalog = "logistics")
@IdClass(BInPresentSEntityPK.class)
public class BInPresentSEntity {
    private String bInPresentSInPresentNo;
    private int bInPresentSDetailId;
    private String bInPresentSLocationNo;
    private String bInPresentSRoomNo;
    private String bInPresentSGoodsNo;
    private String bInPresentSMfg;
    private String bInPresentSLot;
    private BigDecimal bInPresentSQuantity;
    private BigDecimal bInPresentSBoxQuantity;
    private BigDecimal bInPresentSBoxPrice;
    private BigDecimal bInPresentSTaxRate;
    private BigDecimal bInPresentSDetailMoney;
    private BigDecimal bInPresentSOriginalPrice;
    private String bInPresentSPresentationProperty;
    private Timestamp bInPresentSAccountCheckDate;
    private String bInPresentSCreaterNo;
    private Timestamp bInPresentSCreateDate;
    private String bInPresentSModifiNo;
    private Timestamp bInPresentSModifiTime;
    private String bInPresentSChecker;
    private Timestamp bInPresentSCheckDate;
    private String bInPresentSGroupNodeId;
    private String bInPresentSIsPass;
    private BInPresentMEntity bInPresentMByBInPresentSInPresentNo;
    private StoreLocationEntity storeLocationByBInPresentSRoomNo;
    private TRoomEntity tRoomByBInPresentSRoomNo;
    private TGoodsEntity tGoodsByBInPresentSGoodsNo;
    private TStaffEntity tStaffByBInPresentSCreaterNo;
    private TStaffEntity tStaffByBInPresentSModifiNo;
    private TStaffEntity tStaffByBInPresentSChecker;
    private TOrgEntity tOrgByBInPresentSGroupNodeId;

    @Id
    @Column(name = "b_in_present_s_in_present_no", nullable = false, length = 16)
    public String getbInPresentSInPresentNo() {
        return bInPresentSInPresentNo;
    }

    public void setbInPresentSInPresentNo(String bInPresentSInPresentNo) {
        this.bInPresentSInPresentNo = bInPresentSInPresentNo;
    }

    @Id
    @Column(name = "b_in_present_s_detail_id", nullable = false)
    public int getbInPresentSDetailId() {
        return bInPresentSDetailId;
    }

    public void setbInPresentSDetailId(int bInPresentSDetailId) {
        this.bInPresentSDetailId = bInPresentSDetailId;
    }

    @Basic
    @Column(name = "b_in_present_s_location_no", nullable = true, length = 8)
    public String getbInPresentSLocationNo() {
        return bInPresentSLocationNo;
    }

    public void setbInPresentSLocationNo(String bInPresentSLocationNo) {
        this.bInPresentSLocationNo = bInPresentSLocationNo;
    }

    @Basic
    @Column(name = "b_in_present_s_room_no", nullable = true, length = 8)
    public String getbInPresentSRoomNo() {
        return bInPresentSRoomNo;
    }

    public void setbInPresentSRoomNo(String bInPresentSRoomNo) {
        this.bInPresentSRoomNo = bInPresentSRoomNo;
    }

    @Basic
    @Column(name = "b_in_present_s_goods_no", nullable = true, length = 20)
    public String getbInPresentSGoodsNo() {
        return bInPresentSGoodsNo;
    }

    public void setbInPresentSGoodsNo(String bInPresentSGoodsNo) {
        this.bInPresentSGoodsNo = bInPresentSGoodsNo;
    }

    @Basic
    @Column(name = "b_in_present_s_MFG", nullable = true, length = 12)
    public String getbInPresentSMfg() {
        return bInPresentSMfg;
    }

    public void setbInPresentSMfg(String bInPresentSMfg) {
        this.bInPresentSMfg = bInPresentSMfg;
    }

    @Basic
    @Column(name = "b_in_present_s_LOT", nullable = true, length = 20)
    public String getbInPresentSLot() {
        return bInPresentSLot;
    }

    public void setbInPresentSLot(String bInPresentSLot) {
        this.bInPresentSLot = bInPresentSLot;
    }

    @Basic
    @Column(name = "b_in_present_s_quantity", nullable = true, precision = 4)
    public BigDecimal getbInPresentSQuantity() {
        return bInPresentSQuantity;
    }

    public void setbInPresentSQuantity(BigDecimal bInPresentSQuantity) {
        this.bInPresentSQuantity = bInPresentSQuantity;
    }

    @Basic
    @Column(name = "b_in_present_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getbInPresentSBoxQuantity() {
        return bInPresentSBoxQuantity;
    }

    public void setbInPresentSBoxQuantity(BigDecimal bInPresentSBoxQuantity) {
        this.bInPresentSBoxQuantity = bInPresentSBoxQuantity;
    }

    @Basic
    @Column(name = "b_in_present_s_box_price", nullable = true, precision = 4)
    public BigDecimal getbInPresentSBoxPrice() {
        return bInPresentSBoxPrice;
    }

    public void setbInPresentSBoxPrice(BigDecimal bInPresentSBoxPrice) {
        this.bInPresentSBoxPrice = bInPresentSBoxPrice;
    }

    @Basic
    @Column(name = "b_in_present_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbInPresentSTaxRate() {
        return bInPresentSTaxRate;
    }

    public void setbInPresentSTaxRate(BigDecimal bInPresentSTaxRate) {
        this.bInPresentSTaxRate = bInPresentSTaxRate;
    }

    @Basic
    @Column(name = "b_in_present_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getbInPresentSDetailMoney() {
        return bInPresentSDetailMoney;
    }

    public void setbInPresentSDetailMoney(BigDecimal bInPresentSDetailMoney) {
        this.bInPresentSDetailMoney = bInPresentSDetailMoney;
    }

    @Basic
    @Column(name = "b_in_present_s_original_price", nullable = true, precision = 4)
    public BigDecimal getbInPresentSOriginalPrice() {
        return bInPresentSOriginalPrice;
    }

    public void setbInPresentSOriginalPrice(BigDecimal bInPresentSOriginalPrice) {
        this.bInPresentSOriginalPrice = bInPresentSOriginalPrice;
    }

    @Basic
    @Column(name = "b_in_present_s_presentation_property", nullable = true, length = 4)
    public String getbInPresentSPresentationProperty() {
        return bInPresentSPresentationProperty;
    }

    public void setbInPresentSPresentationProperty(String bInPresentSPresentationProperty) {
        this.bInPresentSPresentationProperty = bInPresentSPresentationProperty;
    }

    @Basic
    @Column(name = "b_in_present_s_account_check_date", nullable = true)
    public Timestamp getbInPresentSAccountCheckDate() {
        return bInPresentSAccountCheckDate;
    }

    public void setbInPresentSAccountCheckDate(Timestamp bInPresentSAccountCheckDate) {
        this.bInPresentSAccountCheckDate = bInPresentSAccountCheckDate;
    }

    @Basic
    @Column(name = "b_in_present_s_creater_no", nullable = true, length = 8)
    public String getbInPresentSCreaterNo() {
        return bInPresentSCreaterNo;
    }

    public void setbInPresentSCreaterNo(String bInPresentSCreaterNo) {
        this.bInPresentSCreaterNo = bInPresentSCreaterNo;
    }

    @Basic
    @Column(name = "b_in_present_s_create_date", nullable = true)
    public Timestamp getbInPresentSCreateDate() {
        return bInPresentSCreateDate;
    }

    public void setbInPresentSCreateDate(Timestamp bInPresentSCreateDate) {
        this.bInPresentSCreateDate = bInPresentSCreateDate;
    }

    @Basic
    @Column(name = "b_in_present_s_modifi_no", nullable = true, length = 8)
    public String getbInPresentSModifiNo() {
        return bInPresentSModifiNo;
    }

    public void setbInPresentSModifiNo(String bInPresentSModifiNo) {
        this.bInPresentSModifiNo = bInPresentSModifiNo;
    }

    @Basic
    @Column(name = "b_in_present_s_modifi_time", nullable = true)
    public Timestamp getbInPresentSModifiTime() {
        return bInPresentSModifiTime;
    }

    public void setbInPresentSModifiTime(Timestamp bInPresentSModifiTime) {
        this.bInPresentSModifiTime = bInPresentSModifiTime;
    }

    @Basic
    @Column(name = "b_in_present_s_checker", nullable = true, length = 8)
    public String getbInPresentSChecker() {
        return bInPresentSChecker;
    }

    public void setbInPresentSChecker(String bInPresentSChecker) {
        this.bInPresentSChecker = bInPresentSChecker;
    }

    @Basic
    @Column(name = "b_in_present_s_check_date", nullable = true)
    public Timestamp getbInPresentSCheckDate() {
        return bInPresentSCheckDate;
    }

    public void setbInPresentSCheckDate(Timestamp bInPresentSCheckDate) {
        this.bInPresentSCheckDate = bInPresentSCheckDate;
    }

    @Basic
    @Column(name = "b_in_present_s_group_node_id", nullable = false, length = 20)
    public String getbInPresentSGroupNodeId() {
        return bInPresentSGroupNodeId;
    }

    public void setbInPresentSGroupNodeId(String bInPresentSGroupNodeId) {
        this.bInPresentSGroupNodeId = bInPresentSGroupNodeId;
    }

    @Basic
    @Column(name = "b_in_present_s_isPass", nullable = true, length = -1)
    public String getbInPresentSIsPass() {
        return bInPresentSIsPass;
    }

    public void setbInPresentSIsPass(String bInPresentSIsPass) {
        this.bInPresentSIsPass = bInPresentSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BInPresentSEntity that = (BInPresentSEntity) o;

        if (bInPresentSDetailId != that.bInPresentSDetailId) return false;
        if (bInPresentSInPresentNo != null ? !bInPresentSInPresentNo.equals(that.bInPresentSInPresentNo) : that.bInPresentSInPresentNo != null)
            return false;
        if (bInPresentSLocationNo != null ? !bInPresentSLocationNo.equals(that.bInPresentSLocationNo) : that.bInPresentSLocationNo != null)
            return false;
        if (bInPresentSRoomNo != null ? !bInPresentSRoomNo.equals(that.bInPresentSRoomNo) : that.bInPresentSRoomNo != null)
            return false;
        if (bInPresentSGoodsNo != null ? !bInPresentSGoodsNo.equals(that.bInPresentSGoodsNo) : that.bInPresentSGoodsNo != null)
            return false;
        if (bInPresentSMfg != null ? !bInPresentSMfg.equals(that.bInPresentSMfg) : that.bInPresentSMfg != null)
            return false;
        if (bInPresentSLot != null ? !bInPresentSLot.equals(that.bInPresentSLot) : that.bInPresentSLot != null)
            return false;
        if (bInPresentSQuantity != null ? !bInPresentSQuantity.equals(that.bInPresentSQuantity) : that.bInPresentSQuantity != null)
            return false;
        if (bInPresentSBoxQuantity != null ? !bInPresentSBoxQuantity.equals(that.bInPresentSBoxQuantity) : that.bInPresentSBoxQuantity != null)
            return false;
        if (bInPresentSBoxPrice != null ? !bInPresentSBoxPrice.equals(that.bInPresentSBoxPrice) : that.bInPresentSBoxPrice != null)
            return false;
        if (bInPresentSTaxRate != null ? !bInPresentSTaxRate.equals(that.bInPresentSTaxRate) : that.bInPresentSTaxRate != null)
            return false;
        if (bInPresentSDetailMoney != null ? !bInPresentSDetailMoney.equals(that.bInPresentSDetailMoney) : that.bInPresentSDetailMoney != null)
            return false;
        if (bInPresentSOriginalPrice != null ? !bInPresentSOriginalPrice.equals(that.bInPresentSOriginalPrice) : that.bInPresentSOriginalPrice != null)
            return false;
        if (bInPresentSPresentationProperty != null ? !bInPresentSPresentationProperty.equals(that.bInPresentSPresentationProperty) : that.bInPresentSPresentationProperty != null)
            return false;
        if (bInPresentSAccountCheckDate != null ? !bInPresentSAccountCheckDate.equals(that.bInPresentSAccountCheckDate) : that.bInPresentSAccountCheckDate != null)
            return false;
        if (bInPresentSCreaterNo != null ? !bInPresentSCreaterNo.equals(that.bInPresentSCreaterNo) : that.bInPresentSCreaterNo != null)
            return false;
        if (bInPresentSCreateDate != null ? !bInPresentSCreateDate.equals(that.bInPresentSCreateDate) : that.bInPresentSCreateDate != null)
            return false;
        if (bInPresentSModifiNo != null ? !bInPresentSModifiNo.equals(that.bInPresentSModifiNo) : that.bInPresentSModifiNo != null)
            return false;
        if (bInPresentSModifiTime != null ? !bInPresentSModifiTime.equals(that.bInPresentSModifiTime) : that.bInPresentSModifiTime != null)
            return false;
        if (bInPresentSChecker != null ? !bInPresentSChecker.equals(that.bInPresentSChecker) : that.bInPresentSChecker != null)
            return false;
        if (bInPresentSCheckDate != null ? !bInPresentSCheckDate.equals(that.bInPresentSCheckDate) : that.bInPresentSCheckDate != null)
            return false;
        if (bInPresentSGroupNodeId != null ? !bInPresentSGroupNodeId.equals(that.bInPresentSGroupNodeId) : that.bInPresentSGroupNodeId != null)
            return false;
        if (bInPresentSIsPass != null ? !bInPresentSIsPass.equals(that.bInPresentSIsPass) : that.bInPresentSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bInPresentSInPresentNo != null ? bInPresentSInPresentNo.hashCode() : 0;
        result = 31 * result + bInPresentSDetailId;
        result = 31 * result + (bInPresentSLocationNo != null ? bInPresentSLocationNo.hashCode() : 0);
        result = 31 * result + (bInPresentSRoomNo != null ? bInPresentSRoomNo.hashCode() : 0);
        result = 31 * result + (bInPresentSGoodsNo != null ? bInPresentSGoodsNo.hashCode() : 0);
        result = 31 * result + (bInPresentSMfg != null ? bInPresentSMfg.hashCode() : 0);
        result = 31 * result + (bInPresentSLot != null ? bInPresentSLot.hashCode() : 0);
        result = 31 * result + (bInPresentSQuantity != null ? bInPresentSQuantity.hashCode() : 0);
        result = 31 * result + (bInPresentSBoxQuantity != null ? bInPresentSBoxQuantity.hashCode() : 0);
        result = 31 * result + (bInPresentSBoxPrice != null ? bInPresentSBoxPrice.hashCode() : 0);
        result = 31 * result + (bInPresentSTaxRate != null ? bInPresentSTaxRate.hashCode() : 0);
        result = 31 * result + (bInPresentSDetailMoney != null ? bInPresentSDetailMoney.hashCode() : 0);
        result = 31 * result + (bInPresentSOriginalPrice != null ? bInPresentSOriginalPrice.hashCode() : 0);
        result = 31 * result + (bInPresentSPresentationProperty != null ? bInPresentSPresentationProperty.hashCode() : 0);
        result = 31 * result + (bInPresentSAccountCheckDate != null ? bInPresentSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (bInPresentSCreaterNo != null ? bInPresentSCreaterNo.hashCode() : 0);
        result = 31 * result + (bInPresentSCreateDate != null ? bInPresentSCreateDate.hashCode() : 0);
        result = 31 * result + (bInPresentSModifiNo != null ? bInPresentSModifiNo.hashCode() : 0);
        result = 31 * result + (bInPresentSModifiTime != null ? bInPresentSModifiTime.hashCode() : 0);
        result = 31 * result + (bInPresentSChecker != null ? bInPresentSChecker.hashCode() : 0);
        result = 31 * result + (bInPresentSCheckDate != null ? bInPresentSCheckDate.hashCode() : 0);
        result = 31 * result + (bInPresentSGroupNodeId != null ? bInPresentSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bInPresentSIsPass != null ? bInPresentSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_in_present_no", referencedColumnName = "b_in_present_m_in_present_no", nullable = false,insertable = false, updatable = false)
    public BInPresentMEntity getbInPresentMByBInPresentSInPresentNo() {
        return bInPresentMByBInPresentSInPresentNo;
    }

    public void setbInPresentMByBInPresentSInPresentNo(BInPresentMEntity bInPresentMByBInPresentSInPresentNo) {
        this.bInPresentMByBInPresentSInPresentNo = bInPresentMByBInPresentSInPresentNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_room_no", referencedColumnName = "store_location_location_no",insertable = false, updatable = false)
    public StoreLocationEntity getStoreLocationByBInPresentSRoomNo() {
        return storeLocationByBInPresentSRoomNo;
    }

    public void setStoreLocationByBInPresentSRoomNo(StoreLocationEntity storeLocationByBInPresentSRoomNo) {
        this.storeLocationByBInPresentSRoomNo = storeLocationByBInPresentSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_room_no", referencedColumnName = "t_room_room_no",insertable = false, updatable = false)
    public TRoomEntity gettRoomByBInPresentSRoomNo() {
        return tRoomByBInPresentSRoomNo;
    }

    public void settRoomByBInPresentSRoomNo(TRoomEntity tRoomByBInPresentSRoomNo) {
        this.tRoomByBInPresentSRoomNo = tRoomByBInPresentSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_goods_no", referencedColumnName = "t_goods_goods_no",insertable = false, updatable = false)
    public TGoodsEntity gettGoodsByBInPresentSGoodsNo() {
        return tGoodsByBInPresentSGoodsNo;
    }

    public void settGoodsByBInPresentSGoodsNo(TGoodsEntity tGoodsByBInPresentSGoodsNo) {
        this.tGoodsByBInPresentSGoodsNo = tGoodsByBInPresentSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_creater_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInPresentSCreaterNo() {
        return tStaffByBInPresentSCreaterNo;
    }

    public void settStaffByBInPresentSCreaterNo(TStaffEntity tStaffByBInPresentSCreaterNo) {
        this.tStaffByBInPresentSCreaterNo = tStaffByBInPresentSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInPresentSModifiNo() {
        return tStaffByBInPresentSModifiNo;
    }

    public void settStaffByBInPresentSModifiNo(TStaffEntity tStaffByBInPresentSModifiNo) {
        this.tStaffByBInPresentSModifiNo = tStaffByBInPresentSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_checker", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByBInPresentSChecker() {
        return tStaffByBInPresentSChecker;
    }

    public void settStaffByBInPresentSChecker(TStaffEntity tStaffByBInPresentSChecker) {
        this.tStaffByBInPresentSChecker = tStaffByBInPresentSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_in_present_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByBInPresentSGroupNodeId() {
        return tOrgByBInPresentSGroupNodeId;
    }

    public void settOrgByBInPresentSGroupNodeId(TOrgEntity tOrgByBInPresentSGroupNodeId) {
        this.tOrgByBInPresentSGroupNodeId = tOrgByBInPresentSGroupNodeId;
    }
}
