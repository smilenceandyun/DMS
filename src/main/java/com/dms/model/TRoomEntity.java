package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_room", schema = "dbo", catalog = "logistics_test")
public class TRoomEntity {
    private String tRoomRoomNo;
    private String tRoomRoomName;
    private String tRoomTel;
    private String tRoomFax;
    private String tRoomRoomAddress;
    private String tRoomRoomLinkman;
    private String tRoomRemark;
    private String tRoomCreateNo;
    private Timestamp tRoomCreateDate;
    private String tRoomModifiNo;
    private Timestamp tRoomModifiTime;
    private String tRoomFlag;
    private String tRoomGroupNodeId;
    private Collection<BInPresentSEntity> bInPresentSByTRoomRoomNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTRoomRoomNo;
    private Collection<BSOrderSEntity> bSOrderSByTRoomRoomNo;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByTRoomRoomNo;
    private Collection<SBreakageSEntity> sBreakageSByTRoomRoomNo;
    private Collection<SInBorrowSEntity> sInBorrowSByTRoomRoomNo;
    private Collection<SInLoanSEntity> sInLoanSByTRoomRoomNo;
    private Collection<SOutLoanSEntity> sOutLoanSByTRoomRoomNo;
    private Collection<SRoomTransferSEntity> sRoomTransferSByTRoomRoomNo;
    private Collection<SRoomTransferSEntity> sRoomTransferSByTRoomRoomNo_0;
    private Collection<StoreLocationEntity> storeLocationsByTRoomRoomNo;
    private TStaffEntity tStaffByTRoomCreateNo;
    private TStaffEntity tStaffByTRoomModifiNo;
    private TOrgEntity tOrgByTRoomGroupNodeId;

    @Id
    @Column(name = "t_room_room_no", nullable = false, length = 8)
    public String gettRoomRoomNo() {
        return tRoomRoomNo;
    }

    public void settRoomRoomNo(String tRoomRoomNo) {
        this.tRoomRoomNo = tRoomRoomNo;
    }

    @Basic
    @Column(name = "t_room_room_name", nullable = false, length = 30)
    public String gettRoomRoomName() {
        return tRoomRoomName;
    }

    public void settRoomRoomName(String tRoomRoomName) {
        this.tRoomRoomName = tRoomRoomName;
    }

    @Basic
    @Column(name = "t_room_tel", nullable = true, length = 30)
    public String gettRoomTel() {
        return tRoomTel;
    }

    public void settRoomTel(String tRoomTel) {
        this.tRoomTel = tRoomTel;
    }

    @Basic
    @Column(name = "t_room_fax", nullable = true, length = 30)
    public String gettRoomFax() {
        return tRoomFax;
    }

    public void settRoomFax(String tRoomFax) {
        this.tRoomFax = tRoomFax;
    }

    @Basic
    @Column(name = "t_room_room_address", nullable = true, length = 100)
    public String gettRoomRoomAddress() {
        return tRoomRoomAddress;
    }

    public void settRoomRoomAddress(String tRoomRoomAddress) {
        this.tRoomRoomAddress = tRoomRoomAddress;
    }

    @Basic
    @Column(name = "t_room_room_linkman", nullable = true, length = 40)
    public String gettRoomRoomLinkman() {
        return tRoomRoomLinkman;
    }

    public void settRoomRoomLinkman(String tRoomRoomLinkman) {
        this.tRoomRoomLinkman = tRoomRoomLinkman;
    }

    @Basic
    @Column(name = "t_room_remark", nullable = true, length = 100)
    public String gettRoomRemark() {
        return tRoomRemark;
    }

    public void settRoomRemark(String tRoomRemark) {
        this.tRoomRemark = tRoomRemark;
    }

    @Basic
    @Column(name = "t_room_create_no", nullable = true, length = 8)
    public String gettRoomCreateNo() {
        return tRoomCreateNo;
    }

    public void settRoomCreateNo(String tRoomCreateNo) {
        this.tRoomCreateNo = tRoomCreateNo;
    }

    @Basic
    @Column(name = "t_room_create_date", nullable = true)
    public Timestamp gettRoomCreateDate() {
        return tRoomCreateDate;
    }

    public void settRoomCreateDate(Timestamp tRoomCreateDate) {
        this.tRoomCreateDate = tRoomCreateDate;
    }

    @Basic
    @Column(name = "t_room_modifi_no", nullable = true, length = 8)
    public String gettRoomModifiNo() {
        return tRoomModifiNo;
    }

    public void settRoomModifiNo(String tRoomModifiNo) {
        this.tRoomModifiNo = tRoomModifiNo;
    }

    @Basic
    @Column(name = "t_room_modifi_time", nullable = true)
    public Timestamp gettRoomModifiTime() {
        return tRoomModifiTime;
    }

    public void settRoomModifiTime(Timestamp tRoomModifiTime) {
        this.tRoomModifiTime = tRoomModifiTime;
    }

    @Basic
    @Column(name = "t_room_flag", nullable = false, length = 1)
    public String gettRoomFlag() {
        return tRoomFlag;
    }

    public void settRoomFlag(String tRoomFlag) {
        this.tRoomFlag = tRoomFlag;
    }

    @Basic
    @Column(name = "t_room_group_node_id", nullable = true, length = 20)
    public String gettRoomGroupNodeId() {
        return tRoomGroupNodeId;
    }

    public void settRoomGroupNodeId(String tRoomGroupNodeId) {
        this.tRoomGroupNodeId = tRoomGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRoomEntity that = (TRoomEntity) o;

        if (tRoomRoomNo != null ? !tRoomRoomNo.equals(that.tRoomRoomNo) : that.tRoomRoomNo != null) return false;
        if (tRoomRoomName != null ? !tRoomRoomName.equals(that.tRoomRoomName) : that.tRoomRoomName != null)
            return false;
        if (tRoomTel != null ? !tRoomTel.equals(that.tRoomTel) : that.tRoomTel != null) return false;
        if (tRoomFax != null ? !tRoomFax.equals(that.tRoomFax) : that.tRoomFax != null) return false;
        if (tRoomRoomAddress != null ? !tRoomRoomAddress.equals(that.tRoomRoomAddress) : that.tRoomRoomAddress != null)
            return false;
        if (tRoomRoomLinkman != null ? !tRoomRoomLinkman.equals(that.tRoomRoomLinkman) : that.tRoomRoomLinkman != null)
            return false;
        if (tRoomRemark != null ? !tRoomRemark.equals(that.tRoomRemark) : that.tRoomRemark != null) return false;
        if (tRoomCreateNo != null ? !tRoomCreateNo.equals(that.tRoomCreateNo) : that.tRoomCreateNo != null)
            return false;
        if (tRoomCreateDate != null ? !tRoomCreateDate.equals(that.tRoomCreateDate) : that.tRoomCreateDate != null)
            return false;
        if (tRoomModifiNo != null ? !tRoomModifiNo.equals(that.tRoomModifiNo) : that.tRoomModifiNo != null)
            return false;
        if (tRoomModifiTime != null ? !tRoomModifiTime.equals(that.tRoomModifiTime) : that.tRoomModifiTime != null)
            return false;
        if (tRoomFlag != null ? !tRoomFlag.equals(that.tRoomFlag) : that.tRoomFlag != null) return false;
        if (tRoomGroupNodeId != null ? !tRoomGroupNodeId.equals(that.tRoomGroupNodeId) : that.tRoomGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tRoomRoomNo != null ? tRoomRoomNo.hashCode() : 0;
        result = 31 * result + (tRoomRoomName != null ? tRoomRoomName.hashCode() : 0);
        result = 31 * result + (tRoomTel != null ? tRoomTel.hashCode() : 0);
        result = 31 * result + (tRoomFax != null ? tRoomFax.hashCode() : 0);
        result = 31 * result + (tRoomRoomAddress != null ? tRoomRoomAddress.hashCode() : 0);
        result = 31 * result + (tRoomRoomLinkman != null ? tRoomRoomLinkman.hashCode() : 0);
        result = 31 * result + (tRoomRemark != null ? tRoomRemark.hashCode() : 0);
        result = 31 * result + (tRoomCreateNo != null ? tRoomCreateNo.hashCode() : 0);
        result = 31 * result + (tRoomCreateDate != null ? tRoomCreateDate.hashCode() : 0);
        result = 31 * result + (tRoomModifiNo != null ? tRoomModifiNo.hashCode() : 0);
        result = 31 * result + (tRoomModifiTime != null ? tRoomModifiTime.hashCode() : 0);
        result = 31 * result + (tRoomFlag != null ? tRoomFlag.hashCode() : 0);
        result = 31 * result + (tRoomGroupNodeId != null ? tRoomGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tRoomByBInPresentSRoomNo")
    public Collection<BInPresentSEntity> getbInPresentSByTRoomRoomNo() {
        return bInPresentSByTRoomRoomNo;
    }

    public void setbInPresentSByTRoomRoomNo(Collection<BInPresentSEntity> bInPresentSByTRoomRoomNo) {
        this.bInPresentSByTRoomRoomNo = bInPresentSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomByBPurchaseOrdSRoomNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTRoomRoomNo() {
        return bPurchaseOrdSByTRoomRoomNo;
    }

    public void setbPurchaseOrdSByTRoomRoomNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTRoomRoomNo) {
        this.bPurchaseOrdSByTRoomRoomNo = bPurchaseOrdSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomByBSOrderSRoomNo")
    public Collection<BSOrderSEntity> getbSOrderSByTRoomRoomNo() {
        return bSOrderSByTRoomRoomNo;
    }

    public void setbSOrderSByTRoomRoomNo(Collection<BSOrderSEntity> bSOrderSByTRoomRoomNo) {
        this.bSOrderSByTRoomRoomNo = bSOrderSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomByFStockAdjusSRoomNo")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByTRoomRoomNo() {
        return fStockAdjusSESByTRoomRoomNo;
    }

    public void setfStockAdjusSESByTRoomRoomNo(Collection<FStockAdjusSEntity> fStockAdjusSESByTRoomRoomNo) {
        this.fStockAdjusSESByTRoomRoomNo = fStockAdjusSESByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySBreakageSRoomNo")
    public Collection<SBreakageSEntity> getsBreakageSByTRoomRoomNo() {
        return sBreakageSByTRoomRoomNo;
    }

    public void setsBreakageSByTRoomRoomNo(Collection<SBreakageSEntity> sBreakageSByTRoomRoomNo) {
        this.sBreakageSByTRoomRoomNo = sBreakageSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySInBorrowSRoomNo")
    public Collection<SInBorrowSEntity> getsInBorrowSByTRoomRoomNo() {
        return sInBorrowSByTRoomRoomNo;
    }

    public void setsInBorrowSByTRoomRoomNo(Collection<SInBorrowSEntity> sInBorrowSByTRoomRoomNo) {
        this.sInBorrowSByTRoomRoomNo = sInBorrowSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySInLoanSRoomNo")
    public Collection<SInLoanSEntity> getsInLoanSByTRoomRoomNo() {
        return sInLoanSByTRoomRoomNo;
    }

    public void setsInLoanSByTRoomRoomNo(Collection<SInLoanSEntity> sInLoanSByTRoomRoomNo) {
        this.sInLoanSByTRoomRoomNo = sInLoanSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySOutLoanSRoomNo")
    public Collection<SOutLoanSEntity> getsOutLoanSByTRoomRoomNo() {
        return sOutLoanSByTRoomRoomNo;
    }

    public void setsOutLoanSByTRoomRoomNo(Collection<SOutLoanSEntity> sOutLoanSByTRoomRoomNo) {
        this.sOutLoanSByTRoomRoomNo = sOutLoanSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySRoomTransferSOutRoomNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByTRoomRoomNo() {
        return sRoomTransferSByTRoomRoomNo;
    }

    public void setsRoomTransferSByTRoomRoomNo(Collection<SRoomTransferSEntity> sRoomTransferSByTRoomRoomNo) {
        this.sRoomTransferSByTRoomRoomNo = sRoomTransferSByTRoomRoomNo;
    }

    @OneToMany(mappedBy = "tRoomBySRoomTransferSInRoomNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByTRoomRoomNo_0() {
        return sRoomTransferSByTRoomRoomNo_0;
    }

    public void setsRoomTransferSByTRoomRoomNo_0(Collection<SRoomTransferSEntity> sRoomTransferSByTRoomRoomNo_0) {
        this.sRoomTransferSByTRoomRoomNo_0 = sRoomTransferSByTRoomRoomNo_0;
    }

    @OneToMany(mappedBy = "tRoomByStoreLocationRoomNo")
    public Collection<StoreLocationEntity> getStoreLocationsByTRoomRoomNo() {
        return storeLocationsByTRoomRoomNo;
    }

    public void setStoreLocationsByTRoomRoomNo(Collection<StoreLocationEntity> storeLocationsByTRoomRoomNo) {
        this.storeLocationsByTRoomRoomNo = storeLocationsByTRoomRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_room_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTRoomCreateNo() {
        return tStaffByTRoomCreateNo;
    }

    public void settStaffByTRoomCreateNo(TStaffEntity tStaffByTRoomCreateNo) {
        this.tStaffByTRoomCreateNo = tStaffByTRoomCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_room_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTRoomModifiNo() {
        return tStaffByTRoomModifiNo;
    }

    public void settStaffByTRoomModifiNo(TStaffEntity tStaffByTRoomModifiNo) {
        this.tStaffByTRoomModifiNo = tStaffByTRoomModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_room_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTRoomGroupNodeId() {
        return tOrgByTRoomGroupNodeId;
    }

    public void settOrgByTRoomGroupNodeId(TOrgEntity tOrgByTRoomGroupNodeId) {
        this.tOrgByTRoomGroupNodeId = tOrgByTRoomGroupNodeId;
    }
}
