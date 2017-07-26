package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "s_out_loan_s", schema = "dbo", catalog = "logistics_test")
@IdClass(SOutLoanSEntityPK.class)
public class SOutLoanSEntity {
    private String sOutLoanSOutLoanNo;
    private int sOutLoanSDetailId;
    private String sOutLoanSGoodsNo;
    private String sOutLoanSRoomNo;
    private String sOutLoanSLocationNo;
    private String sOutLoanSMfg;
    private String sOutLoanSLot;
    private BigDecimal sOutLoanSQuantity;
    private BigDecimal sOutLoanSBoxQuantity;
    private BigDecimal sOutLoanSBoxPrice;
    private BigDecimal sOutLoanSDetailMoney;
    private String sOutLoanSCreaterNo;
    private Timestamp sOutLoanSCreateDate;
    private String sOutLoanSModifiNo;
    private Timestamp sOutLoanSModifiTime;
    private String sOutLoanSChecker;
    private Timestamp sOutLoanSCheckDate;
    private String sOutLoanSGroupNodeId;
    private Timestamp sOutLoanSAccountCheckDate;
    private String sOutLoanSIsPass;
    private SOutLoanMEntity sOutLoanMBySOutLoanSOutLoanNo;
    private TGoodsEntity tGoodsBySOutLoanSGoodsNo;
    private TRoomEntity tRoomBySOutLoanSRoomNo;
    private StoreLocationEntity storeLocationBySOutLoanSLocationNo;
    private TStaffEntity tStaffBySOutLoanSCreaterNo;
    private TStaffEntity tStaffBySOutLoanSModifiNo;
    private TStaffEntity tStaffBySOutLoanSChecker;
    private TOrgEntity tOrgBySOutLoanSGroupNodeId;

    @Id
    @Column(name = "s_out_loan_s_out_loan_no", nullable = false, length = 16)
    public String getsOutLoanSOutLoanNo() {
        return sOutLoanSOutLoanNo;
    }

    public void setsOutLoanSOutLoanNo(String sOutLoanSOutLoanNo) {
        this.sOutLoanSOutLoanNo = sOutLoanSOutLoanNo;
    }

    @Id
    @Column(name = "s_out_loan_s_detail_id", nullable = false)
    public int getsOutLoanSDetailId() {
        return sOutLoanSDetailId;
    }

    public void setsOutLoanSDetailId(int sOutLoanSDetailId) {
        this.sOutLoanSDetailId = sOutLoanSDetailId;
    }

    @Basic
    @Column(name = "s_out_loan_s_goods_no", nullable = false, length = 20)
    public String getsOutLoanSGoodsNo() {
        return sOutLoanSGoodsNo;
    }

    public void setsOutLoanSGoodsNo(String sOutLoanSGoodsNo) {
        this.sOutLoanSGoodsNo = sOutLoanSGoodsNo;
    }

    @Basic
    @Column(name = "s_out_loan_s_room_no", nullable = false, length = 8)
    public String getsOutLoanSRoomNo() {
        return sOutLoanSRoomNo;
    }

    public void setsOutLoanSRoomNo(String sOutLoanSRoomNo) {
        this.sOutLoanSRoomNo = sOutLoanSRoomNo;
    }

    @Basic
    @Column(name = "s_out_loan_s_location_no", nullable = false, length = 8)
    public String getsOutLoanSLocationNo() {
        return sOutLoanSLocationNo;
    }

    public void setsOutLoanSLocationNo(String sOutLoanSLocationNo) {
        this.sOutLoanSLocationNo = sOutLoanSLocationNo;
    }

    @Basic
    @Column(name = "s_out_loan_s_MFG", nullable = false, length = 12)
    public String getsOutLoanSMfg() {
        return sOutLoanSMfg;
    }

    public void setsOutLoanSMfg(String sOutLoanSMfg) {
        this.sOutLoanSMfg = sOutLoanSMfg;
    }

    @Basic
    @Column(name = "s_out_loan_s_LOT", nullable = false, length = 20)
    public String getsOutLoanSLot() {
        return sOutLoanSLot;
    }

    public void setsOutLoanSLot(String sOutLoanSLot) {
        this.sOutLoanSLot = sOutLoanSLot;
    }

    @Basic
    @Column(name = "s_out_loan_s_quantity", nullable = true, precision = 4)
    public BigDecimal getsOutLoanSQuantity() {
        return sOutLoanSQuantity;
    }

    public void setsOutLoanSQuantity(BigDecimal sOutLoanSQuantity) {
        this.sOutLoanSQuantity = sOutLoanSQuantity;
    }

    @Basic
    @Column(name = "s_out_loan_s_box_quantity", nullable = true, precision = 4)
    public BigDecimal getsOutLoanSBoxQuantity() {
        return sOutLoanSBoxQuantity;
    }

    public void setsOutLoanSBoxQuantity(BigDecimal sOutLoanSBoxQuantity) {
        this.sOutLoanSBoxQuantity = sOutLoanSBoxQuantity;
    }

    @Basic
    @Column(name = "s_out_loan_s_box_price", nullable = true, precision = 4)
    public BigDecimal getsOutLoanSBoxPrice() {
        return sOutLoanSBoxPrice;
    }

    public void setsOutLoanSBoxPrice(BigDecimal sOutLoanSBoxPrice) {
        this.sOutLoanSBoxPrice = sOutLoanSBoxPrice;
    }

    @Basic
    @Column(name = "s_out_loan_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getsOutLoanSDetailMoney() {
        return sOutLoanSDetailMoney;
    }

    public void setsOutLoanSDetailMoney(BigDecimal sOutLoanSDetailMoney) {
        this.sOutLoanSDetailMoney = sOutLoanSDetailMoney;
    }

    @Basic
    @Column(name = "s_out_loan_s_creater_no", nullable = true, length = 8)
    public String getsOutLoanSCreaterNo() {
        return sOutLoanSCreaterNo;
    }

    public void setsOutLoanSCreaterNo(String sOutLoanSCreaterNo) {
        this.sOutLoanSCreaterNo = sOutLoanSCreaterNo;
    }

    @Basic
    @Column(name = "s_out_loan_s_create_date", nullable = true)
    public Timestamp getsOutLoanSCreateDate() {
        return sOutLoanSCreateDate;
    }

    public void setsOutLoanSCreateDate(Timestamp sOutLoanSCreateDate) {
        this.sOutLoanSCreateDate = sOutLoanSCreateDate;
    }

    @Basic
    @Column(name = "s_out_loan_s_modifi_no", nullable = true, length = 8)
    public String getsOutLoanSModifiNo() {
        return sOutLoanSModifiNo;
    }

    public void setsOutLoanSModifiNo(String sOutLoanSModifiNo) {
        this.sOutLoanSModifiNo = sOutLoanSModifiNo;
    }

    @Basic
    @Column(name = "s_out_loan_s_modifi_time", nullable = true)
    public Timestamp getsOutLoanSModifiTime() {
        return sOutLoanSModifiTime;
    }

    public void setsOutLoanSModifiTime(Timestamp sOutLoanSModifiTime) {
        this.sOutLoanSModifiTime = sOutLoanSModifiTime;
    }

    @Basic
    @Column(name = "s_out_loan_s_checker", nullable = true, length = 8)
    public String getsOutLoanSChecker() {
        return sOutLoanSChecker;
    }

    public void setsOutLoanSChecker(String sOutLoanSChecker) {
        this.sOutLoanSChecker = sOutLoanSChecker;
    }

    @Basic
    @Column(name = "s_out_loan_s_check_date", nullable = true)
    public Timestamp getsOutLoanSCheckDate() {
        return sOutLoanSCheckDate;
    }

    public void setsOutLoanSCheckDate(Timestamp sOutLoanSCheckDate) {
        this.sOutLoanSCheckDate = sOutLoanSCheckDate;
    }

    @Basic
    @Column(name = "s_out_loan_s_group_node_id", nullable = false, length = 20)
    public String getsOutLoanSGroupNodeId() {
        return sOutLoanSGroupNodeId;
    }

    public void setsOutLoanSGroupNodeId(String sOutLoanSGroupNodeId) {
        this.sOutLoanSGroupNodeId = sOutLoanSGroupNodeId;
    }

    @Basic
    @Column(name = "s_out_loan_s_account_check_date", nullable = true)
    public Timestamp getsOutLoanSAccountCheckDate() {
        return sOutLoanSAccountCheckDate;
    }

    public void setsOutLoanSAccountCheckDate(Timestamp sOutLoanSAccountCheckDate) {
        this.sOutLoanSAccountCheckDate = sOutLoanSAccountCheckDate;
    }

    @Basic
    @Column(name = "s_out_loan_s_isPass", nullable = true, length = 1)
    public String getsOutLoanSIsPass() {
        return sOutLoanSIsPass;
    }

    public void setsOutLoanSIsPass(String sOutLoanSIsPass) {
        this.sOutLoanSIsPass = sOutLoanSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SOutLoanSEntity that = (SOutLoanSEntity) o;

        if (sOutLoanSDetailId != that.sOutLoanSDetailId) return false;
        if (sOutLoanSOutLoanNo != null ? !sOutLoanSOutLoanNo.equals(that.sOutLoanSOutLoanNo) : that.sOutLoanSOutLoanNo != null)
            return false;
        if (sOutLoanSGoodsNo != null ? !sOutLoanSGoodsNo.equals(that.sOutLoanSGoodsNo) : that.sOutLoanSGoodsNo != null)
            return false;
        if (sOutLoanSRoomNo != null ? !sOutLoanSRoomNo.equals(that.sOutLoanSRoomNo) : that.sOutLoanSRoomNo != null)
            return false;
        if (sOutLoanSLocationNo != null ? !sOutLoanSLocationNo.equals(that.sOutLoanSLocationNo) : that.sOutLoanSLocationNo != null)
            return false;
        if (sOutLoanSMfg != null ? !sOutLoanSMfg.equals(that.sOutLoanSMfg) : that.sOutLoanSMfg != null) return false;
        if (sOutLoanSLot != null ? !sOutLoanSLot.equals(that.sOutLoanSLot) : that.sOutLoanSLot != null) return false;
        if (sOutLoanSQuantity != null ? !sOutLoanSQuantity.equals(that.sOutLoanSQuantity) : that.sOutLoanSQuantity != null)
            return false;
        if (sOutLoanSBoxQuantity != null ? !sOutLoanSBoxQuantity.equals(that.sOutLoanSBoxQuantity) : that.sOutLoanSBoxQuantity != null)
            return false;
        if (sOutLoanSBoxPrice != null ? !sOutLoanSBoxPrice.equals(that.sOutLoanSBoxPrice) : that.sOutLoanSBoxPrice != null)
            return false;
        if (sOutLoanSDetailMoney != null ? !sOutLoanSDetailMoney.equals(that.sOutLoanSDetailMoney) : that.sOutLoanSDetailMoney != null)
            return false;
        if (sOutLoanSCreaterNo != null ? !sOutLoanSCreaterNo.equals(that.sOutLoanSCreaterNo) : that.sOutLoanSCreaterNo != null)
            return false;
        if (sOutLoanSCreateDate != null ? !sOutLoanSCreateDate.equals(that.sOutLoanSCreateDate) : that.sOutLoanSCreateDate != null)
            return false;
        if (sOutLoanSModifiNo != null ? !sOutLoanSModifiNo.equals(that.sOutLoanSModifiNo) : that.sOutLoanSModifiNo != null)
            return false;
        if (sOutLoanSModifiTime != null ? !sOutLoanSModifiTime.equals(that.sOutLoanSModifiTime) : that.sOutLoanSModifiTime != null)
            return false;
        if (sOutLoanSChecker != null ? !sOutLoanSChecker.equals(that.sOutLoanSChecker) : that.sOutLoanSChecker != null)
            return false;
        if (sOutLoanSCheckDate != null ? !sOutLoanSCheckDate.equals(that.sOutLoanSCheckDate) : that.sOutLoanSCheckDate != null)
            return false;
        if (sOutLoanSGroupNodeId != null ? !sOutLoanSGroupNodeId.equals(that.sOutLoanSGroupNodeId) : that.sOutLoanSGroupNodeId != null)
            return false;
        if (sOutLoanSAccountCheckDate != null ? !sOutLoanSAccountCheckDate.equals(that.sOutLoanSAccountCheckDate) : that.sOutLoanSAccountCheckDate != null)
            return false;
        if (sOutLoanSIsPass != null ? !sOutLoanSIsPass.equals(that.sOutLoanSIsPass) : that.sOutLoanSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sOutLoanSOutLoanNo != null ? sOutLoanSOutLoanNo.hashCode() : 0;
        result = 31 * result + sOutLoanSDetailId;
        result = 31 * result + (sOutLoanSGoodsNo != null ? sOutLoanSGoodsNo.hashCode() : 0);
        result = 31 * result + (sOutLoanSRoomNo != null ? sOutLoanSRoomNo.hashCode() : 0);
        result = 31 * result + (sOutLoanSLocationNo != null ? sOutLoanSLocationNo.hashCode() : 0);
        result = 31 * result + (sOutLoanSMfg != null ? sOutLoanSMfg.hashCode() : 0);
        result = 31 * result + (sOutLoanSLot != null ? sOutLoanSLot.hashCode() : 0);
        result = 31 * result + (sOutLoanSQuantity != null ? sOutLoanSQuantity.hashCode() : 0);
        result = 31 * result + (sOutLoanSBoxQuantity != null ? sOutLoanSBoxQuantity.hashCode() : 0);
        result = 31 * result + (sOutLoanSBoxPrice != null ? sOutLoanSBoxPrice.hashCode() : 0);
        result = 31 * result + (sOutLoanSDetailMoney != null ? sOutLoanSDetailMoney.hashCode() : 0);
        result = 31 * result + (sOutLoanSCreaterNo != null ? sOutLoanSCreaterNo.hashCode() : 0);
        result = 31 * result + (sOutLoanSCreateDate != null ? sOutLoanSCreateDate.hashCode() : 0);
        result = 31 * result + (sOutLoanSModifiNo != null ? sOutLoanSModifiNo.hashCode() : 0);
        result = 31 * result + (sOutLoanSModifiTime != null ? sOutLoanSModifiTime.hashCode() : 0);
        result = 31 * result + (sOutLoanSChecker != null ? sOutLoanSChecker.hashCode() : 0);
        result = 31 * result + (sOutLoanSCheckDate != null ? sOutLoanSCheckDate.hashCode() : 0);
        result = 31 * result + (sOutLoanSGroupNodeId != null ? sOutLoanSGroupNodeId.hashCode() : 0);
        result = 31 * result + (sOutLoanSAccountCheckDate != null ? sOutLoanSAccountCheckDate.hashCode() : 0);
        result = 31 * result + (sOutLoanSIsPass != null ? sOutLoanSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_out_loan_no", referencedColumnName = "s_out_loan_m_out_loan_no", nullable = false)
    public SOutLoanMEntity getsOutLoanMBySOutLoanSOutLoanNo() {
        return sOutLoanMBySOutLoanSOutLoanNo;
    }

    public void setsOutLoanMBySOutLoanSOutLoanNo(SOutLoanMEntity sOutLoanMBySOutLoanSOutLoanNo) {
        this.sOutLoanMBySOutLoanSOutLoanNo = sOutLoanMBySOutLoanSOutLoanNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false)
    public TGoodsEntity gettGoodsBySOutLoanSGoodsNo() {
        return tGoodsBySOutLoanSGoodsNo;
    }

    public void settGoodsBySOutLoanSGoodsNo(TGoodsEntity tGoodsBySOutLoanSGoodsNo) {
        this.tGoodsBySOutLoanSGoodsNo = tGoodsBySOutLoanSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_room_no", referencedColumnName = "t_room_room_no", nullable = false)
    public TRoomEntity gettRoomBySOutLoanSRoomNo() {
        return tRoomBySOutLoanSRoomNo;
    }

    public void settRoomBySOutLoanSRoomNo(TRoomEntity tRoomBySOutLoanSRoomNo) {
        this.tRoomBySOutLoanSRoomNo = tRoomBySOutLoanSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_location_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationBySOutLoanSLocationNo() {
        return storeLocationBySOutLoanSLocationNo;
    }

    public void setStoreLocationBySOutLoanSLocationNo(StoreLocationEntity storeLocationBySOutLoanSLocationNo) {
        this.storeLocationBySOutLoanSLocationNo = storeLocationBySOutLoanSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySOutLoanSCreaterNo() {
        return tStaffBySOutLoanSCreaterNo;
    }

    public void settStaffBySOutLoanSCreaterNo(TStaffEntity tStaffBySOutLoanSCreaterNo) {
        this.tStaffBySOutLoanSCreaterNo = tStaffBySOutLoanSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySOutLoanSModifiNo() {
        return tStaffBySOutLoanSModifiNo;
    }

    public void settStaffBySOutLoanSModifiNo(TStaffEntity tStaffBySOutLoanSModifiNo) {
        this.tStaffBySOutLoanSModifiNo = tStaffBySOutLoanSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffBySOutLoanSChecker() {
        return tStaffBySOutLoanSChecker;
    }

    public void settStaffBySOutLoanSChecker(TStaffEntity tStaffBySOutLoanSChecker) {
        this.tStaffBySOutLoanSChecker = tStaffBySOutLoanSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "s_out_loan_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgBySOutLoanSGroupNodeId() {
        return tOrgBySOutLoanSGroupNodeId;
    }

    public void settOrgBySOutLoanSGroupNodeId(TOrgEntity tOrgBySOutLoanSGroupNodeId) {
        this.tOrgBySOutLoanSGroupNodeId = tOrgBySOutLoanSGroupNodeId;
    }
}
