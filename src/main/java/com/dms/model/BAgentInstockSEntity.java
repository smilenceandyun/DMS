package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_agent_instock_s", schema = "dbo", catalog = "logistics_test")
@IdClass(BAgentInstockSEntityPK.class)
public class BAgentInstockSEntity {
    private String bAgentInstockSAgentInstockNo;
    private int bAgentInstockSDetailId;
    private String bAgentInstockSRoomNo;
    private String bAgentInstockSLocationNo;
    private String bAgentInstockSGoodsNo;
    private String bAgentInstockSMfg;
    private String bAgentInstockSLot;
    private BigDecimal bAgentInstockSBoxQuantity;
    private BigDecimal bAgentInstockSPrice;
    private BigDecimal bAgentInstockSQuantity;
    private BigDecimal bAgentInstockSBoxPrice;
    private BigDecimal bAgentInstockSTaxRate;
    private BigDecimal bAgentInstockSDetailMoney;
    private BigDecimal bAgentInstockSOriginalPrice;
    private String bAgentInstockSPresentationProperty;
    private Timestamp bAgentInstockSAccountCheckDate;
    private String bAgentInstockSCreaterNo;
    private Timestamp bAgentInstockSCreateDate;
    private String bAgentInstockSModifiNo;
    private Timestamp bAgentInstockSModifiTime;
    private String bAgentInstockSChecker;
    private Timestamp bAgentInstockSCheckDate;
    private String bAgentInstockSGroupNodeId;
    private String bAgentInstockSRemark;
    private String bAgentInstockSIsPass;
    private BAgentInstockMEntity bAgentInstockMByBAgentInstockSAgentInstockNo;
    private StoreLocationEntity storeLocationByBAgentInstockSRoomNo;
    private TGoodsEntity tGoodsByBAgentInstockSGoodsNo;
    private TStaffEntity tStaffByBAgentInstockSCreaterNo;
    private TStaffEntity tStaffByBAgentInstockSModifiNo;
    private TStaffEntity tStaffByBAgentInstockSChecker;
    private TOrgEntity tOrgByBAgentInstockSGroupNodeId;

    @Id
    @Column(name = "b_agent_instock_s_agent_instock_no", nullable = false, length = 16)
    public String getbAgentInstockSAgentInstockNo() {
        return bAgentInstockSAgentInstockNo;
    }

    public void setbAgentInstockSAgentInstockNo(String bAgentInstockSAgentInstockNo) {
        this.bAgentInstockSAgentInstockNo = bAgentInstockSAgentInstockNo;
    }

    @Id
    @Column(name = "b_agent_instock_s_detail_id", nullable = false)
    public int getbAgentInstockSDetailId() {
        return bAgentInstockSDetailId;
    }

    public void setbAgentInstockSDetailId(int bAgentInstockSDetailId) {
        this.bAgentInstockSDetailId = bAgentInstockSDetailId;
    }

    @Basic
    @Column(name = "b_agent_instock_s_room_no", nullable = true, length = 8)
    public String getbAgentInstockSRoomNo() {
        return bAgentInstockSRoomNo;
    }

    public void setbAgentInstockSRoomNo(String bAgentInstockSRoomNo) {
        this.bAgentInstockSRoomNo = bAgentInstockSRoomNo;
    }

    @Basic
    @Column(name = "b_agent_instock_s_location_no", nullable = true, length = 8)
    public String getbAgentInstockSLocationNo() {
        return bAgentInstockSLocationNo;
    }

    public void setbAgentInstockSLocationNo(String bAgentInstockSLocationNo) {
        this.bAgentInstockSLocationNo = bAgentInstockSLocationNo;
    }

    @Basic
    @Column(name = "b_agent_instock_s_goods_no", nullable = true, length = 20)
    public String getbAgentInstockSGoodsNo() {
        return bAgentInstockSGoodsNo;
    }

    public void setbAgentInstockSGoodsNo(String bAgentInstockSGoodsNo) {
        this.bAgentInstockSGoodsNo = bAgentInstockSGoodsNo;
    }

    @Basic
    @Column(name = "b_agent_instock_s_MFG", nullable = true, length = 12)
    public String getbAgentInstockSMfg() {
        return bAgentInstockSMfg;
    }

    public void setbAgentInstockSMfg(String bAgentInstockSMfg) {
        this.bAgentInstockSMfg = bAgentInstockSMfg;
    }

    @Basic
    @Column(name = "b_agent_instock_s_LOT", nullable = true, length = 20)
    public String getbAgentInstockSLot() {
        return bAgentInstockSLot;
    }

    public void setbAgentInstockSLot(String bAgentInstockSLot) {
        this.bAgentInstockSLot = bAgentInstockSLot;
    }

    @Basic
    @Column(name = "b_agent_instock_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSBoxQuantity() {
        return bAgentInstockSBoxQuantity;
    }

    public void setbAgentInstockSBoxQuantity(BigDecimal bAgentInstockSBoxQuantity) {
        this.bAgentInstockSBoxQuantity = bAgentInstockSBoxQuantity;
    }

    @Basic
    @Column(name = "b_agent_instock_s_price", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSPrice() {
        return bAgentInstockSPrice;
    }

    public void setbAgentInstockSPrice(BigDecimal bAgentInstockSPrice) {
        this.bAgentInstockSPrice = bAgentInstockSPrice;
    }

    @Basic
    @Column(name = "b_agent_instock_s_quantity", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSQuantity() {
        return bAgentInstockSQuantity;
    }

    public void setbAgentInstockSQuantity(BigDecimal bAgentInstockSQuantity) {
        this.bAgentInstockSQuantity = bAgentInstockSQuantity;
    }

    @Basic
    @Column(name = "b_agent_instock_s_box_price", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSBoxPrice() {
        return bAgentInstockSBoxPrice;
    }

    public void setbAgentInstockSBoxPrice(BigDecimal bAgentInstockSBoxPrice) {
        this.bAgentInstockSBoxPrice = bAgentInstockSBoxPrice;
    }

    @Basic
    @Column(name = "b_agent_instock_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSTaxRate() {
        return bAgentInstockSTaxRate;
    }

    public void setbAgentInstockSTaxRate(BigDecimal bAgentInstockSTaxRate) {
        this.bAgentInstockSTaxRate = bAgentInstockSTaxRate;
    }

    @Basic
    @Column(name = "b_agent_instock_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSDetailMoney() {
        return bAgentInstockSDetailMoney;
    }

    public void setbAgentInstockSDetailMoney(BigDecimal bAgentInstockSDetailMoney) {
        this.bAgentInstockSDetailMoney = bAgentInstockSDetailMoney;
    }

    @Basic
    @Column(name = "b_agent_instock_s_original_price", nullable = true, precision = 4)
    public BigDecimal getbAgentInstockSOriginalPrice() {
        return bAgentInstockSOriginalPrice;
    }

    public void setbAgentInstockSOriginalPrice(BigDecimal bAgentInstockSOriginalPrice) {
        this.bAgentInstockSOriginalPrice = bAgentInstockSOriginalPrice;
    }

    @Basic
    @Column(name = "b_agent_instock_s_presentation_property", nullable = true, length = 4)
    public String getbAgentInstockSPresentationProperty() {
        return bAgentInstockSPresentationProperty;
    }

    public void setbAgentInstockSPresentationProperty(String bAgentInstockSPresentationProperty) {
        this.bAgentInstockSPresentationProperty = bAgentInstockSPresentationProperty;
    }

    @Basic
    @Column(name = "b_agent_instock_s_account_check_date", nullable = true)
    public Timestamp getbAgentInstockSAccountCheckDate() {
        return bAgentInstockSAccountCheckDate;
    }

    public void setbAgentInstockSAccountCheckDate(Timestamp bAgentInstockSAccountCheckDate) {
        this.bAgentInstockSAccountCheckDate = bAgentInstockSAccountCheckDate;
    }

    @Basic
    @Column(name = "b_agent_instock_s_creater_no", nullable = true, length = 8)
    public String getbAgentInstockSCreaterNo() {
        return bAgentInstockSCreaterNo;
    }

    public void setbAgentInstockSCreaterNo(String bAgentInstockSCreaterNo) {
        this.bAgentInstockSCreaterNo = bAgentInstockSCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_instock_s_create_date", nullable = true)
    public Timestamp getbAgentInstockSCreateDate() {
        return bAgentInstockSCreateDate;
    }

    public void setbAgentInstockSCreateDate(Timestamp bAgentInstockSCreateDate) {
        this.bAgentInstockSCreateDate = bAgentInstockSCreateDate;
    }

    @Basic
    @Column(name = "b_agent_instock_s_modifi_no", nullable = true, length = 8)
    public String getbAgentInstockSModifiNo() {
        return bAgentInstockSModifiNo;
    }

    public void setbAgentInstockSModifiNo(String bAgentInstockSModifiNo) {
        this.bAgentInstockSModifiNo = bAgentInstockSModifiNo;
    }

    @Basic
    @Column(name = "b_agent_instock_s_modifi_time", nullable = true)
    public Timestamp getbAgentInstockSModifiTime() {
        return bAgentInstockSModifiTime;
    }

    public void setbAgentInstockSModifiTime(Timestamp bAgentInstockSModifiTime) {
        this.bAgentInstockSModifiTime = bAgentInstockSModifiTime;
    }

    @Basic
    @Column(name = "b_agent_instock_s_checker", nullable = true, length = 8)
    public String getbAgentInstockSChecker() {
        return bAgentInstockSChecker;
    }

    public void setbAgentInstockSChecker(String bAgentInstockSChecker) {
        this.bAgentInstockSChecker = bAgentInstockSChecker;
    }

    @Basic
    @Column(name = "b_agent_instock_s_check_date", nullable = true)
    public Timestamp getbAgentInstockSCheckDate() {
        return bAgentInstockSCheckDate;
    }

    public void setbAgentInstockSCheckDate(Timestamp bAgentInstockSCheckDate) {
        this.bAgentInstockSCheckDate = bAgentInstockSCheckDate;
    }

    @Basic
    @Column(name = "b_agent_instock_s_group_node_id", nullable = false, length = 20)
    public String getbAgentInstockSGroupNodeId() {
        return bAgentInstockSGroupNodeId;
    }

    public void setbAgentInstockSGroupNodeId(String bAgentInstockSGroupNodeId) {
        this.bAgentInstockSGroupNodeId = bAgentInstockSGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_instock_s_remark", nullable = true, length = 200)
    public String getbAgentInstockSRemark() {
        return bAgentInstockSRemark;
    }

    public void setbAgentInstockSRemark(String bAgentInstockSRemark) {
        this.bAgentInstockSRemark = bAgentInstockSRemark;
    }

    @Basic
    @Column(name = "b_agent_instock_s_isPass", nullable = true, length = 1)
    public String getbAgentInstockSIsPass() {
        return bAgentInstockSIsPass;
    }

    public void setbAgentInstockSIsPass(String bAgentInstockSIsPass) {
        this.bAgentInstockSIsPass = bAgentInstockSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentInstockSEntity that = (BAgentInstockSEntity) o;

        if (bAgentInstockSDetailId != that.bAgentInstockSDetailId) return false;
        if (bAgentInstockSAgentInstockNo != null ? !bAgentInstockSAgentInstockNo.equals(that.bAgentInstockSAgentInstockNo) : that.bAgentInstockSAgentInstockNo != null)
            return false;
        if (bAgentInstockSRoomNo != null ? !bAgentInstockSRoomNo.equals(that.bAgentInstockSRoomNo) : that.bAgentInstockSRoomNo != null)
            return false;
        if (bAgentInstockSLocationNo != null ? !bAgentInstockSLocationNo.equals(that.bAgentInstockSLocationNo) : that.bAgentInstockSLocationNo != null)
            return false;
        if (bAgentInstockSGoodsNo != null ? !bAgentInstockSGoodsNo.equals(that.bAgentInstockSGoodsNo) : that.bAgentInstockSGoodsNo != null)
            return false;
        if (bAgentInstockSMfg != null ? !bAgentInstockSMfg.equals(that.bAgentInstockSMfg) : that.bAgentInstockSMfg != null)
            return false;
        if (bAgentInstockSLot != null ? !bAgentInstockSLot.equals(that.bAgentInstockSLot) : that.bAgentInstockSLot != null)
            return false;
        if (bAgentInstockSBoxQuantity != null ? !bAgentInstockSBoxQuantity.equals(that.bAgentInstockSBoxQuantity) : that.bAgentInstockSBoxQuantity != null)
            return false;
        if (bAgentInstockSPrice != null ? !bAgentInstockSPrice.equals(that.bAgentInstockSPrice) : that.bAgentInstockSPrice != null)
            return false;
        if (bAgentInstockSQuantity != null ? !bAgentInstockSQuantity.equals(that.bAgentInstockSQuantity) : that.bAgentInstockSQuantity != null)
            return false;
        if (bAgentInstockSBoxPrice != null ? !bAgentInstockSBoxPrice.equals(that.bAgentInstockSBoxPrice) : that.bAgentInstockSBoxPrice != null)
            return false;
        if (bAgentInstockSTaxRate != null ? !bAgentInstockSTaxRate.equals(that.bAgentInstockSTaxRate) : that.bAgentInstockSTaxRate != null)
            return false;
        if (bAgentInstockSDetailMoney != null ? !bAgentInstockSDetailMoney.equals(that.bAgentInstockSDetailMoney) : that.bAgentInstockSDetailMoney != null)
            return false;
        if (bAgentInstockSOriginalPrice != null ? !bAgentInstockSOriginalPrice.equals(that.bAgentInstockSOriginalPrice) : that.bAgentInstockSOriginalPrice != null)
            return false;
        if (bAgentInstockSPresentationProperty != null ? !bAgentInstockSPresentationProperty.equals(that.bAgentInstockSPresentationProperty) : that.bAgentInstockSPresentationProperty != null)
            return false;
        if (bAgentInstockSAccountCheckDate != null ? !bAgentInstockSAccountCheckDate.equals(that.bAgentInstockSAccountCheckDate) : that.bAgentInstockSAccountCheckDate != null)
            return false;
        if (bAgentInstockSCreaterNo != null ? !bAgentInstockSCreaterNo.equals(that.bAgentInstockSCreaterNo) : that.bAgentInstockSCreaterNo != null)
            return false;
        if (bAgentInstockSCreateDate != null ? !bAgentInstockSCreateDate.equals(that.bAgentInstockSCreateDate) : that.bAgentInstockSCreateDate != null)
            return false;
        if (bAgentInstockSModifiNo != null ? !bAgentInstockSModifiNo.equals(that.bAgentInstockSModifiNo) : that.bAgentInstockSModifiNo != null)
            return false;
        if (bAgentInstockSModifiTime != null ? !bAgentInstockSModifiTime.equals(that.bAgentInstockSModifiTime) : that.bAgentInstockSModifiTime != null)
            return false;
        if (bAgentInstockSChecker != null ? !bAgentInstockSChecker.equals(that.bAgentInstockSChecker) : that.bAgentInstockSChecker != null)
            return false;
        if (bAgentInstockSCheckDate != null ? !bAgentInstockSCheckDate.equals(that.bAgentInstockSCheckDate) : that.bAgentInstockSCheckDate != null)
            return false;
        if (bAgentInstockSGroupNodeId != null ? !bAgentInstockSGroupNodeId.equals(that.bAgentInstockSGroupNodeId) : that.bAgentInstockSGroupNodeId != null)
            return false;
        if (bAgentInstockSRemark != null ? !bAgentInstockSRemark.equals(that.bAgentInstockSRemark) : that.bAgentInstockSRemark != null)
            return false;
        if (bAgentInstockSIsPass != null ? !bAgentInstockSIsPass.equals(that.bAgentInstockSIsPass) : that.bAgentInstockSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentInstockSAgentInstockNo != null ? bAgentInstockSAgentInstockNo.hashCode() : 0;
        result = 31 * result + bAgentInstockSDetailId;
        result = 31 * result + (bAgentInstockSRoomNo != null ? bAgentInstockSRoomNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockSLocationNo != null ? bAgentInstockSLocationNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockSGoodsNo != null ? bAgentInstockSGoodsNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockSMfg != null ? bAgentInstockSMfg.hashCode() : 0);
        result = 31 * result + (bAgentInstockSLot != null ? bAgentInstockSLot.hashCode() : 0);
        result = 31 * result + (bAgentInstockSBoxQuantity != null ? bAgentInstockSBoxQuantity.hashCode() : 0);
        result = 31 * result + (bAgentInstockSPrice != null ? bAgentInstockSPrice.hashCode() : 0);
        result = 31 * result + (bAgentInstockSQuantity != null ? bAgentInstockSQuantity.hashCode() : 0);
        result = 31 * result + (bAgentInstockSBoxPrice != null ? bAgentInstockSBoxPrice.hashCode() : 0);
        result = 31 * result + (bAgentInstockSTaxRate != null ? bAgentInstockSTaxRate.hashCode() : 0);
        result = 31 * result + (bAgentInstockSDetailMoney != null ? bAgentInstockSDetailMoney.hashCode() : 0);
        result = 31 * result + (bAgentInstockSOriginalPrice != null ? bAgentInstockSOriginalPrice.hashCode() : 0);
        result = 31 * result + (bAgentInstockSPresentationProperty != null ? bAgentInstockSPresentationProperty.hashCode() : 0);
        result = 31 * result + (bAgentInstockSAccountCheckDate != null ? bAgentInstockSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockSCreaterNo != null ? bAgentInstockSCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockSCreateDate != null ? bAgentInstockSCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockSModifiNo != null ? bAgentInstockSModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentInstockSModifiTime != null ? bAgentInstockSModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentInstockSChecker != null ? bAgentInstockSChecker.hashCode() : 0);
        result = 31 * result + (bAgentInstockSCheckDate != null ? bAgentInstockSCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentInstockSGroupNodeId != null ? bAgentInstockSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentInstockSRemark != null ? bAgentInstockSRemark.hashCode() : 0);
        result = 31 * result + (bAgentInstockSIsPass != null ? bAgentInstockSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_agent_instock_no", referencedColumnName = "b_agent_instock_m_agent_instock_no", nullable = false)
    public BAgentInstockMEntity getbAgentInstockMByBAgentInstockSAgentInstockNo() {
        return bAgentInstockMByBAgentInstockSAgentInstockNo;
    }

    public void setbAgentInstockMByBAgentInstockSAgentInstockNo(BAgentInstockMEntity bAgentInstockMByBAgentInstockSAgentInstockNo) {
        this.bAgentInstockMByBAgentInstockSAgentInstockNo = bAgentInstockMByBAgentInstockSAgentInstockNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_room_no", referencedColumnName = "store_location_location_no")
    public StoreLocationEntity getStoreLocationByBAgentInstockSRoomNo() {
        return storeLocationByBAgentInstockSRoomNo;
    }

    public void setStoreLocationByBAgentInstockSRoomNo(StoreLocationEntity storeLocationByBAgentInstockSRoomNo) {
        this.storeLocationByBAgentInstockSRoomNo = storeLocationByBAgentInstockSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_goods_no", referencedColumnName = "t_goods_goods_no")
    public TGoodsEntity gettGoodsByBAgentInstockSGoodsNo() {
        return tGoodsByBAgentInstockSGoodsNo;
    }

    public void settGoodsByBAgentInstockSGoodsNo(TGoodsEntity tGoodsByBAgentInstockSGoodsNo) {
        this.tGoodsByBAgentInstockSGoodsNo = tGoodsByBAgentInstockSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockSCreaterNo() {
        return tStaffByBAgentInstockSCreaterNo;
    }

    public void settStaffByBAgentInstockSCreaterNo(TStaffEntity tStaffByBAgentInstockSCreaterNo) {
        this.tStaffByBAgentInstockSCreaterNo = tStaffByBAgentInstockSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockSModifiNo() {
        return tStaffByBAgentInstockSModifiNo;
    }

    public void settStaffByBAgentInstockSModifiNo(TStaffEntity tStaffByBAgentInstockSModifiNo) {
        this.tStaffByBAgentInstockSModifiNo = tStaffByBAgentInstockSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentInstockSChecker() {
        return tStaffByBAgentInstockSChecker;
    }

    public void settStaffByBAgentInstockSChecker(TStaffEntity tStaffByBAgentInstockSChecker) {
        this.tStaffByBAgentInstockSChecker = tStaffByBAgentInstockSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_instock_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBAgentInstockSGroupNodeId() {
        return tOrgByBAgentInstockSGroupNodeId;
    }

    public void settOrgByBAgentInstockSGroupNodeId(TOrgEntity tOrgByBAgentInstockSGroupNodeId) {
        this.tOrgByBAgentInstockSGroupNodeId = tOrgByBAgentInstockSGroupNodeId;
    }
}
