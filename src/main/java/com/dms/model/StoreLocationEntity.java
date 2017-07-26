package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "store_location", schema = "dbo", catalog = "logistics_test")
public class StoreLocationEntity {
    private String storeLocationLocationNo;
    private String storeLocationRoomNo;
    private String storeLocationLocation;
    private String storeLocationRemark;
    private String storeLocationCreateNo;
    private Timestamp storeLocationCreateDate;
    private String storeLocationModifiNo;
    private Timestamp storeLocationModifiTime;
    private String storeLocationFlag;
    private String storeLocationGroupNodeId;
    private Collection<PromotionMProductSEntity> promotionMProductSByStoreLocationLocationNo;
    private Collection<BAgentInstockSEntity> bAgentInstockSByStoreLocationLocationNo;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByStoreLocationLocationNo;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByStoreLocationLocationNo_0;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByStoreLocationLocationNo;
    private Collection<BInPresentSEntity> bInPresentSByStoreLocationLocationNo;
    private Collection<BOutPresentSEntity> bOutPresentSByStoreLocationLocationNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByStoreLocationLocationNo;
    private Collection<BSOrderSEntity> bSOrderSByStoreLocationLocationNo;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByStoreLocationLocationNo;
    private Collection<SBreakageSEntity> sBreakageSByStoreLocationLocationNo;
    private Collection<SInBorrowSEntity> sInBorrowSByStoreLocationLocationNo;
    private Collection<SInLoanSEntity> sInLoanSByStoreLocationLocationNo;
    private Collection<SOutLoanSEntity> sOutLoanSByStoreLocationLocationNo;
    private Collection<SRoomTransferSEntity> sRoomTransferSByStoreLocationLocationNo;
    private Collection<SRoomTransferSEntity> sRoomTransferSByStoreLocationLocationNo_0;
    private TRoomEntity tRoomByStoreLocationRoomNo;
    private TStaffEntity tStaffByStoreLocationCreateNo;
    private TStaffEntity tStaffByStoreLocationModifiNo;
    private TOrgEntity tOrgByStoreLocationGroupNodeId;

    @Id
    @Column(name = "store_location_location_no", nullable = false, length = 8)
    public String getStoreLocationLocationNo() {
        return storeLocationLocationNo;
    }

    public void setStoreLocationLocationNo(String storeLocationLocationNo) {
        this.storeLocationLocationNo = storeLocationLocationNo;
    }

    @Basic
    @Column(name = "store_location_room_no", nullable = true, length = 8)
    public String getStoreLocationRoomNo() {
        return storeLocationRoomNo;
    }

    public void setStoreLocationRoomNo(String storeLocationRoomNo) {
        this.storeLocationRoomNo = storeLocationRoomNo;
    }

    @Basic
    @Column(name = "store_location_location", nullable = false, length = 40)
    public String getStoreLocationLocation() {
        return storeLocationLocation;
    }

    public void setStoreLocationLocation(String storeLocationLocation) {
        this.storeLocationLocation = storeLocationLocation;
    }

    @Basic
    @Column(name = "store_location_remark", nullable = true, length = 100)
    public String getStoreLocationRemark() {
        return storeLocationRemark;
    }

    public void setStoreLocationRemark(String storeLocationRemark) {
        this.storeLocationRemark = storeLocationRemark;
    }

    @Basic
    @Column(name = "store_location_create_no", nullable = true, length = 8)
    public String getStoreLocationCreateNo() {
        return storeLocationCreateNo;
    }

    public void setStoreLocationCreateNo(String storeLocationCreateNo) {
        this.storeLocationCreateNo = storeLocationCreateNo;
    }

    @Basic
    @Column(name = "store_location_create_date", nullable = true)
    public Timestamp getStoreLocationCreateDate() {
        return storeLocationCreateDate;
    }

    public void setStoreLocationCreateDate(Timestamp storeLocationCreateDate) {
        this.storeLocationCreateDate = storeLocationCreateDate;
    }

    @Basic
    @Column(name = "store_location_modifi_no", nullable = true, length = 8)
    public String getStoreLocationModifiNo() {
        return storeLocationModifiNo;
    }

    public void setStoreLocationModifiNo(String storeLocationModifiNo) {
        this.storeLocationModifiNo = storeLocationModifiNo;
    }

    @Basic
    @Column(name = "store_location_modifi_time", nullable = true)
    public Timestamp getStoreLocationModifiTime() {
        return storeLocationModifiTime;
    }

    public void setStoreLocationModifiTime(Timestamp storeLocationModifiTime) {
        this.storeLocationModifiTime = storeLocationModifiTime;
    }

    @Basic
    @Column(name = "store_location_flag", nullable = false, length = 1)
    public String getStoreLocationFlag() {
        return storeLocationFlag;
    }

    public void setStoreLocationFlag(String storeLocationFlag) {
        this.storeLocationFlag = storeLocationFlag;
    }

    @Basic
    @Column(name = "store_location_group_node_id", nullable = true, length = 20)
    public String getStoreLocationGroupNodeId() {
        return storeLocationGroupNodeId;
    }

    public void setStoreLocationGroupNodeId(String storeLocationGroupNodeId) {
        this.storeLocationGroupNodeId = storeLocationGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreLocationEntity that = (StoreLocationEntity) o;

        if (storeLocationLocationNo != null ? !storeLocationLocationNo.equals(that.storeLocationLocationNo) : that.storeLocationLocationNo != null)
            return false;
        if (storeLocationRoomNo != null ? !storeLocationRoomNo.equals(that.storeLocationRoomNo) : that.storeLocationRoomNo != null)
            return false;
        if (storeLocationLocation != null ? !storeLocationLocation.equals(that.storeLocationLocation) : that.storeLocationLocation != null)
            return false;
        if (storeLocationRemark != null ? !storeLocationRemark.equals(that.storeLocationRemark) : that.storeLocationRemark != null)
            return false;
        if (storeLocationCreateNo != null ? !storeLocationCreateNo.equals(that.storeLocationCreateNo) : that.storeLocationCreateNo != null)
            return false;
        if (storeLocationCreateDate != null ? !storeLocationCreateDate.equals(that.storeLocationCreateDate) : that.storeLocationCreateDate != null)
            return false;
        if (storeLocationModifiNo != null ? !storeLocationModifiNo.equals(that.storeLocationModifiNo) : that.storeLocationModifiNo != null)
            return false;
        if (storeLocationModifiTime != null ? !storeLocationModifiTime.equals(that.storeLocationModifiTime) : that.storeLocationModifiTime != null)
            return false;
        if (storeLocationFlag != null ? !storeLocationFlag.equals(that.storeLocationFlag) : that.storeLocationFlag != null)
            return false;
        if (storeLocationGroupNodeId != null ? !storeLocationGroupNodeId.equals(that.storeLocationGroupNodeId) : that.storeLocationGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = storeLocationLocationNo != null ? storeLocationLocationNo.hashCode() : 0;
        result = 31 * result + (storeLocationRoomNo != null ? storeLocationRoomNo.hashCode() : 0);
        result = 31 * result + (storeLocationLocation != null ? storeLocationLocation.hashCode() : 0);
        result = 31 * result + (storeLocationRemark != null ? storeLocationRemark.hashCode() : 0);
        result = 31 * result + (storeLocationCreateNo != null ? storeLocationCreateNo.hashCode() : 0);
        result = 31 * result + (storeLocationCreateDate != null ? storeLocationCreateDate.hashCode() : 0);
        result = 31 * result + (storeLocationModifiNo != null ? storeLocationModifiNo.hashCode() : 0);
        result = 31 * result + (storeLocationModifiTime != null ? storeLocationModifiTime.hashCode() : 0);
        result = 31 * result + (storeLocationFlag != null ? storeLocationFlag.hashCode() : 0);
        result = 31 * result + (storeLocationGroupNodeId != null ? storeLocationGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "storeLocationByPromotionMProductSLocationNo")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByStoreLocationLocationNo() {
        return promotionMProductSByStoreLocationLocationNo;
    }

    public void setPromotionMProductSByStoreLocationLocationNo(Collection<PromotionMProductSEntity> promotionMProductSByStoreLocationLocationNo) {
        this.promotionMProductSByStoreLocationLocationNo = promotionMProductSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBAgentInstockSRoomNo")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByStoreLocationLocationNo() {
        return bAgentInstockSByStoreLocationLocationNo;
    }

    public void setbAgentInstockSByStoreLocationLocationNo(Collection<BAgentInstockSEntity> bAgentInstockSByStoreLocationLocationNo) {
        this.bAgentInstockSByStoreLocationLocationNo = bAgentInstockSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBAgentRsalesSRoomNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByStoreLocationLocationNo() {
        return bAgentRsalesSESByStoreLocationLocationNo;
    }

    public void setbAgentRsalesSESByStoreLocationLocationNo(Collection<BAgentRsalesSEntity> bAgentRsalesSESByStoreLocationLocationNo) {
        this.bAgentRsalesSESByStoreLocationLocationNo = bAgentRsalesSESByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBAgentRsalesSLocationNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByStoreLocationLocationNo_0() {
        return bAgentRsalesSESByStoreLocationLocationNo_0;
    }

    public void setbAgentRsalesSESByStoreLocationLocationNo_0(Collection<BAgentRsalesSEntity> bAgentRsalesSESByStoreLocationLocationNo_0) {
        this.bAgentRsalesSESByStoreLocationLocationNo_0 = bAgentRsalesSESByStoreLocationLocationNo_0;
    }

    @OneToMany(mappedBy = "storeLocationByBAgentSalesSRoomNo")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByStoreLocationLocationNo() {
        return bAgentSalesSESByStoreLocationLocationNo;
    }

    public void setbAgentSalesSESByStoreLocationLocationNo(Collection<BAgentSalesSEntity> bAgentSalesSESByStoreLocationLocationNo) {
        this.bAgentSalesSESByStoreLocationLocationNo = bAgentSalesSESByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBInPresentSRoomNo")
    public Collection<BInPresentSEntity> getbInPresentSByStoreLocationLocationNo() {
        return bInPresentSByStoreLocationLocationNo;
    }

    public void setbInPresentSByStoreLocationLocationNo(Collection<BInPresentSEntity> bInPresentSByStoreLocationLocationNo) {
        this.bInPresentSByStoreLocationLocationNo = bInPresentSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBOutPresentSLocationNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByStoreLocationLocationNo() {
        return bOutPresentSByStoreLocationLocationNo;
    }

    public void setbOutPresentSByStoreLocationLocationNo(Collection<BOutPresentSEntity> bOutPresentSByStoreLocationLocationNo) {
        this.bOutPresentSByStoreLocationLocationNo = bOutPresentSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBPurchaseOrdSLocationNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByStoreLocationLocationNo() {
        return bPurchaseOrdSByStoreLocationLocationNo;
    }

    public void setbPurchaseOrdSByStoreLocationLocationNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByStoreLocationLocationNo) {
        this.bPurchaseOrdSByStoreLocationLocationNo = bPurchaseOrdSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByBSOrderSLocationNo")
    public Collection<BSOrderSEntity> getbSOrderSByStoreLocationLocationNo() {
        return bSOrderSByStoreLocationLocationNo;
    }

    public void setbSOrderSByStoreLocationLocationNo(Collection<BSOrderSEntity> bSOrderSByStoreLocationLocationNo) {
        this.bSOrderSByStoreLocationLocationNo = bSOrderSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationByFStockAdjusSLocationNo")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByStoreLocationLocationNo() {
        return fStockAdjusSESByStoreLocationLocationNo;
    }

    public void setfStockAdjusSESByStoreLocationLocationNo(Collection<FStockAdjusSEntity> fStockAdjusSESByStoreLocationLocationNo) {
        this.fStockAdjusSESByStoreLocationLocationNo = fStockAdjusSESByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySBreakageSLocationNo")
    public Collection<SBreakageSEntity> getsBreakageSByStoreLocationLocationNo() {
        return sBreakageSByStoreLocationLocationNo;
    }

    public void setsBreakageSByStoreLocationLocationNo(Collection<SBreakageSEntity> sBreakageSByStoreLocationLocationNo) {
        this.sBreakageSByStoreLocationLocationNo = sBreakageSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySInBorrowSLocationNo")
    public Collection<SInBorrowSEntity> getsInBorrowSByStoreLocationLocationNo() {
        return sInBorrowSByStoreLocationLocationNo;
    }

    public void setsInBorrowSByStoreLocationLocationNo(Collection<SInBorrowSEntity> sInBorrowSByStoreLocationLocationNo) {
        this.sInBorrowSByStoreLocationLocationNo = sInBorrowSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySInLoanSLocationNo")
    public Collection<SInLoanSEntity> getsInLoanSByStoreLocationLocationNo() {
        return sInLoanSByStoreLocationLocationNo;
    }

    public void setsInLoanSByStoreLocationLocationNo(Collection<SInLoanSEntity> sInLoanSByStoreLocationLocationNo) {
        this.sInLoanSByStoreLocationLocationNo = sInLoanSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySOutLoanSLocationNo")
    public Collection<SOutLoanSEntity> getsOutLoanSByStoreLocationLocationNo() {
        return sOutLoanSByStoreLocationLocationNo;
    }

    public void setsOutLoanSByStoreLocationLocationNo(Collection<SOutLoanSEntity> sOutLoanSByStoreLocationLocationNo) {
        this.sOutLoanSByStoreLocationLocationNo = sOutLoanSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySRoomTransferSOutLocationNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByStoreLocationLocationNo() {
        return sRoomTransferSByStoreLocationLocationNo;
    }

    public void setsRoomTransferSByStoreLocationLocationNo(Collection<SRoomTransferSEntity> sRoomTransferSByStoreLocationLocationNo) {
        this.sRoomTransferSByStoreLocationLocationNo = sRoomTransferSByStoreLocationLocationNo;
    }

    @OneToMany(mappedBy = "storeLocationBySRoomTransferSInLocationNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByStoreLocationLocationNo_0() {
        return sRoomTransferSByStoreLocationLocationNo_0;
    }

    public void setsRoomTransferSByStoreLocationLocationNo_0(Collection<SRoomTransferSEntity> sRoomTransferSByStoreLocationLocationNo_0) {
        this.sRoomTransferSByStoreLocationLocationNo_0 = sRoomTransferSByStoreLocationLocationNo_0;
    }

    @ManyToOne
    @JoinColumn(name = "store_location_room_no", referencedColumnName = "t_room_room_no")
    public TRoomEntity gettRoomByStoreLocationRoomNo() {
        return tRoomByStoreLocationRoomNo;
    }

    public void settRoomByStoreLocationRoomNo(TRoomEntity tRoomByStoreLocationRoomNo) {
        this.tRoomByStoreLocationRoomNo = tRoomByStoreLocationRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "store_location_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByStoreLocationCreateNo() {
        return tStaffByStoreLocationCreateNo;
    }

    public void settStaffByStoreLocationCreateNo(TStaffEntity tStaffByStoreLocationCreateNo) {
        this.tStaffByStoreLocationCreateNo = tStaffByStoreLocationCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "store_location_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByStoreLocationModifiNo() {
        return tStaffByStoreLocationModifiNo;
    }

    public void settStaffByStoreLocationModifiNo(TStaffEntity tStaffByStoreLocationModifiNo) {
        this.tStaffByStoreLocationModifiNo = tStaffByStoreLocationModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "store_location_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByStoreLocationGroupNodeId() {
        return tOrgByStoreLocationGroupNodeId;
    }

    public void settOrgByStoreLocationGroupNodeId(TOrgEntity tOrgByStoreLocationGroupNodeId) {
        this.tOrgByStoreLocationGroupNodeId = tOrgByStoreLocationGroupNodeId;
    }
}
