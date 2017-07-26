package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_out_present_s", schema = "dbo", catalog = "logistics_test")
@IdClass(BOutPresentSEntityPK.class)
public class BOutPresentSEntity {
    private String bOutPresentSOutPresentNo;
    private String bOutPresentSLocationNo;
    private String bOutPresentSGoodsNo;
    private String bOutPresentSMainGoodsNo;
    private String bOutPresentSMfg;
    private int bOutPresentSDetailId;
    private String bOutPresentSCreateNo;
    private Timestamp bOutPresentSCreateDate;
    private Timestamp bOutPresentSModifiTime;
    private String bOutPresentSModifiNo;
    private String bOutPresentSChecker;
    private String bOutPresentSRecordNo;
    private String bOutPresentSGroupNodeId;
    private Timestamp bOutPresentSExp;
    private BigDecimal bOutPresentSBasicQuantity;
    private BigDecimal bOutPresentSPackNum;
    private Timestamp bOutPresentSCheckDate;
    private String bOutPresentSState;
    private String bOutPresentSNotes;
    private String bOutPresentSLot;
    private String bOutPresentSIsPass;
    private BOutPresentMEntity bOutPresentMByBOutPresentSOutPresentNo;
    private StoreLocationEntity storeLocationByBOutPresentSLocationNo;
    private TGoodsEntity tGoodsByBOutPresentSGoodsNo;
    private TGoodsEntity tGoodsByBOutPresentSMainGoodsNo;
    private TStaffEntity tStaffByBOutPresentSCreateNo;
    private TStaffEntity tStaffByBOutPresentSModifiNo;
    private TStaffEntity tStaffByBOutPresentSChecker;
    private TOrgEntity tOrgByBOutPresentSGroupNodeId;

    @Id
    @Column(name = "b_out_present_s_out_present_no", nullable = false, length = 16)
    public String getbOutPresentSOutPresentNo() {
        return bOutPresentSOutPresentNo;
    }

    public void setbOutPresentSOutPresentNo(String bOutPresentSOutPresentNo) {
        this.bOutPresentSOutPresentNo = bOutPresentSOutPresentNo;
    }

    @Basic
    @Column(name = "b_out_present_s_location_no", nullable = true, length = 8)
    public String getbOutPresentSLocationNo() {
        return bOutPresentSLocationNo;
    }

    public void setbOutPresentSLocationNo(String bOutPresentSLocationNo) {
        this.bOutPresentSLocationNo = bOutPresentSLocationNo;
    }

    @Basic
    @Column(name = "b_out_present_s_goods_no", nullable = true, length = 20)
    public String getbOutPresentSGoodsNo() {
        return bOutPresentSGoodsNo;
    }

    public void setbOutPresentSGoodsNo(String bOutPresentSGoodsNo) {
        this.bOutPresentSGoodsNo = bOutPresentSGoodsNo;
    }

    @Basic
    @Column(name = "b_out_present_s_main_goods_no", nullable = true, length = 20)
    public String getbOutPresentSMainGoodsNo() {
        return bOutPresentSMainGoodsNo;
    }

    public void setbOutPresentSMainGoodsNo(String bOutPresentSMainGoodsNo) {
        this.bOutPresentSMainGoodsNo = bOutPresentSMainGoodsNo;
    }

    @Basic
    @Column(name = "b_out_present_s_MFG", nullable = true, length = 12)
    public String getbOutPresentSMfg() {
        return bOutPresentSMfg;
    }

    public void setbOutPresentSMfg(String bOutPresentSMfg) {
        this.bOutPresentSMfg = bOutPresentSMfg;
    }

    @Id
    @Column(name = "b_out_present_s_detail_id", nullable = false)
    public int getbOutPresentSDetailId() {
        return bOutPresentSDetailId;
    }

    public void setbOutPresentSDetailId(int bOutPresentSDetailId) {
        this.bOutPresentSDetailId = bOutPresentSDetailId;
    }

    @Basic
    @Column(name = "b_out_present_s_create_no", nullable = true, length = 8)
    public String getbOutPresentSCreateNo() {
        return bOutPresentSCreateNo;
    }

    public void setbOutPresentSCreateNo(String bOutPresentSCreateNo) {
        this.bOutPresentSCreateNo = bOutPresentSCreateNo;
    }

    @Basic
    @Column(name = "b_out_present_s_create_date", nullable = true)
    public Timestamp getbOutPresentSCreateDate() {
        return bOutPresentSCreateDate;
    }

    public void setbOutPresentSCreateDate(Timestamp bOutPresentSCreateDate) {
        this.bOutPresentSCreateDate = bOutPresentSCreateDate;
    }

    @Basic
    @Column(name = "b_out_present_s_modifi_time", nullable = true)
    public Timestamp getbOutPresentSModifiTime() {
        return bOutPresentSModifiTime;
    }

    public void setbOutPresentSModifiTime(Timestamp bOutPresentSModifiTime) {
        this.bOutPresentSModifiTime = bOutPresentSModifiTime;
    }

    @Basic
    @Column(name = "b_out_present_s_modifi_no", nullable = true, length = 8)
    public String getbOutPresentSModifiNo() {
        return bOutPresentSModifiNo;
    }

    public void setbOutPresentSModifiNo(String bOutPresentSModifiNo) {
        this.bOutPresentSModifiNo = bOutPresentSModifiNo;
    }

    @Basic
    @Column(name = "b_out_present_s_checker", nullable = true, length = 8)
    public String getbOutPresentSChecker() {
        return bOutPresentSChecker;
    }

    public void setbOutPresentSChecker(String bOutPresentSChecker) {
        this.bOutPresentSChecker = bOutPresentSChecker;
    }

    @Basic
    @Column(name = "b_out_present_s_record_no", nullable = true, length = 20)
    public String getbOutPresentSRecordNo() {
        return bOutPresentSRecordNo;
    }

    public void setbOutPresentSRecordNo(String bOutPresentSRecordNo) {
        this.bOutPresentSRecordNo = bOutPresentSRecordNo;
    }

    @Basic
    @Column(name = "b_out_present_s_group_node_id", nullable = true, length = 20)
    public String getbOutPresentSGroupNodeId() {
        return bOutPresentSGroupNodeId;
    }

    public void setbOutPresentSGroupNodeId(String bOutPresentSGroupNodeId) {
        this.bOutPresentSGroupNodeId = bOutPresentSGroupNodeId;
    }

    @Basic
    @Column(name = "b_out_present_s_EXP", nullable = true)
    public Timestamp getbOutPresentSExp() {
        return bOutPresentSExp;
    }

    public void setbOutPresentSExp(Timestamp bOutPresentSExp) {
        this.bOutPresentSExp = bOutPresentSExp;
    }

    @Basic
    @Column(name = "b_out_present_s_basic_quantity", nullable = true, precision = 4)
    public BigDecimal getbOutPresentSBasicQuantity() {
        return bOutPresentSBasicQuantity;
    }

    public void setbOutPresentSBasicQuantity(BigDecimal bOutPresentSBasicQuantity) {
        this.bOutPresentSBasicQuantity = bOutPresentSBasicQuantity;
    }

    @Basic
    @Column(name = "b_out_present_s_pack_num", nullable = true, precision = 4)
    public BigDecimal getbOutPresentSPackNum() {
        return bOutPresentSPackNum;
    }

    public void setbOutPresentSPackNum(BigDecimal bOutPresentSPackNum) {
        this.bOutPresentSPackNum = bOutPresentSPackNum;
    }

    @Basic
    @Column(name = "b_out_present_s_check_date", nullable = true)
    public Timestamp getbOutPresentSCheckDate() {
        return bOutPresentSCheckDate;
    }

    public void setbOutPresentSCheckDate(Timestamp bOutPresentSCheckDate) {
        this.bOutPresentSCheckDate = bOutPresentSCheckDate;
    }

    @Basic
    @Column(name = "b_out_present_s_state", nullable = true, length = 1)
    public String getbOutPresentSState() {
        return bOutPresentSState;
    }

    public void setbOutPresentSState(String bOutPresentSState) {
        this.bOutPresentSState = bOutPresentSState;
    }

    @Basic
    @Column(name = "b_out_present_s_notes", nullable = true, length = 200)
    public String getbOutPresentSNotes() {
        return bOutPresentSNotes;
    }

    public void setbOutPresentSNotes(String bOutPresentSNotes) {
        this.bOutPresentSNotes = bOutPresentSNotes;
    }

    @Basic
    @Column(name = "b_out_present_s_LOT", nullable = true, length = 20)
    public String getbOutPresentSLot() {
        return bOutPresentSLot;
    }

    public void setbOutPresentSLot(String bOutPresentSLot) {
        this.bOutPresentSLot = bOutPresentSLot;
    }

    @Basic
    @Column(name = "b_out_present_s_isPass", nullable = true, length = 1)
    public String getbOutPresentSIsPass() {
        return bOutPresentSIsPass;
    }

    public void setbOutPresentSIsPass(String bOutPresentSIsPass) {
        this.bOutPresentSIsPass = bOutPresentSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BOutPresentSEntity that = (BOutPresentSEntity) o;

        if (bOutPresentSDetailId != that.bOutPresentSDetailId) return false;
        if (bOutPresentSOutPresentNo != null ? !bOutPresentSOutPresentNo.equals(that.bOutPresentSOutPresentNo) : that.bOutPresentSOutPresentNo != null)
            return false;
        if (bOutPresentSLocationNo != null ? !bOutPresentSLocationNo.equals(that.bOutPresentSLocationNo) : that.bOutPresentSLocationNo != null)
            return false;
        if (bOutPresentSGoodsNo != null ? !bOutPresentSGoodsNo.equals(that.bOutPresentSGoodsNo) : that.bOutPresentSGoodsNo != null)
            return false;
        if (bOutPresentSMainGoodsNo != null ? !bOutPresentSMainGoodsNo.equals(that.bOutPresentSMainGoodsNo) : that.bOutPresentSMainGoodsNo != null)
            return false;
        if (bOutPresentSMfg != null ? !bOutPresentSMfg.equals(that.bOutPresentSMfg) : that.bOutPresentSMfg != null)
            return false;
        if (bOutPresentSCreateNo != null ? !bOutPresentSCreateNo.equals(that.bOutPresentSCreateNo) : that.bOutPresentSCreateNo != null)
            return false;
        if (bOutPresentSCreateDate != null ? !bOutPresentSCreateDate.equals(that.bOutPresentSCreateDate) : that.bOutPresentSCreateDate != null)
            return false;
        if (bOutPresentSModifiTime != null ? !bOutPresentSModifiTime.equals(that.bOutPresentSModifiTime) : that.bOutPresentSModifiTime != null)
            return false;
        if (bOutPresentSModifiNo != null ? !bOutPresentSModifiNo.equals(that.bOutPresentSModifiNo) : that.bOutPresentSModifiNo != null)
            return false;
        if (bOutPresentSChecker != null ? !bOutPresentSChecker.equals(that.bOutPresentSChecker) : that.bOutPresentSChecker != null)
            return false;
        if (bOutPresentSRecordNo != null ? !bOutPresentSRecordNo.equals(that.bOutPresentSRecordNo) : that.bOutPresentSRecordNo != null)
            return false;
        if (bOutPresentSGroupNodeId != null ? !bOutPresentSGroupNodeId.equals(that.bOutPresentSGroupNodeId) : that.bOutPresentSGroupNodeId != null)
            return false;
        if (bOutPresentSExp != null ? !bOutPresentSExp.equals(that.bOutPresentSExp) : that.bOutPresentSExp != null)
            return false;
        if (bOutPresentSBasicQuantity != null ? !bOutPresentSBasicQuantity.equals(that.bOutPresentSBasicQuantity) : that.bOutPresentSBasicQuantity != null)
            return false;
        if (bOutPresentSPackNum != null ? !bOutPresentSPackNum.equals(that.bOutPresentSPackNum) : that.bOutPresentSPackNum != null)
            return false;
        if (bOutPresentSCheckDate != null ? !bOutPresentSCheckDate.equals(that.bOutPresentSCheckDate) : that.bOutPresentSCheckDate != null)
            return false;
        if (bOutPresentSState != null ? !bOutPresentSState.equals(that.bOutPresentSState) : that.bOutPresentSState != null)
            return false;
        if (bOutPresentSNotes != null ? !bOutPresentSNotes.equals(that.bOutPresentSNotes) : that.bOutPresentSNotes != null)
            return false;
        if (bOutPresentSLot != null ? !bOutPresentSLot.equals(that.bOutPresentSLot) : that.bOutPresentSLot != null)
            return false;
        if (bOutPresentSIsPass != null ? !bOutPresentSIsPass.equals(that.bOutPresentSIsPass) : that.bOutPresentSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bOutPresentSOutPresentNo != null ? bOutPresentSOutPresentNo.hashCode() : 0;
        result = 31 * result + (bOutPresentSLocationNo != null ? bOutPresentSLocationNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSGoodsNo != null ? bOutPresentSGoodsNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSMainGoodsNo != null ? bOutPresentSMainGoodsNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSMfg != null ? bOutPresentSMfg.hashCode() : 0);
        result = 31 * result + bOutPresentSDetailId;
        result = 31 * result + (bOutPresentSCreateNo != null ? bOutPresentSCreateNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSCreateDate != null ? bOutPresentSCreateDate.hashCode() : 0);
        result = 31 * result + (bOutPresentSModifiTime != null ? bOutPresentSModifiTime.hashCode() : 0);
        result = 31 * result + (bOutPresentSModifiNo != null ? bOutPresentSModifiNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSChecker != null ? bOutPresentSChecker.hashCode() : 0);
        result = 31 * result + (bOutPresentSRecordNo != null ? bOutPresentSRecordNo.hashCode() : 0);
        result = 31 * result + (bOutPresentSGroupNodeId != null ? bOutPresentSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bOutPresentSExp != null ? bOutPresentSExp.hashCode() : 0);
        result = 31 * result + (bOutPresentSBasicQuantity != null ? bOutPresentSBasicQuantity.hashCode() : 0);
        result = 31 * result + (bOutPresentSPackNum != null ? bOutPresentSPackNum.hashCode() : 0);
        result = 31 * result + (bOutPresentSCheckDate != null ? bOutPresentSCheckDate.hashCode() : 0);
        result = 31 * result + (bOutPresentSState != null ? bOutPresentSState.hashCode() : 0);
        result = 31 * result + (bOutPresentSNotes != null ? bOutPresentSNotes.hashCode() : 0);
        result = 31 * result + (bOutPresentSLot != null ? bOutPresentSLot.hashCode() : 0);
        result = 31 * result + (bOutPresentSIsPass != null ? bOutPresentSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_out_present_no", referencedColumnName = "b_out_present_m_out_present_no", nullable = false)
    public BOutPresentMEntity getbOutPresentMByBOutPresentSOutPresentNo() {
        return bOutPresentMByBOutPresentSOutPresentNo;
    }

    public void setbOutPresentMByBOutPresentSOutPresentNo(BOutPresentMEntity bOutPresentMByBOutPresentSOutPresentNo) {
        this.bOutPresentMByBOutPresentSOutPresentNo = bOutPresentMByBOutPresentSOutPresentNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_location_no", referencedColumnName = "store_location_location_no")
    public StoreLocationEntity getStoreLocationByBOutPresentSLocationNo() {
        return storeLocationByBOutPresentSLocationNo;
    }

    public void setStoreLocationByBOutPresentSLocationNo(StoreLocationEntity storeLocationByBOutPresentSLocationNo) {
        this.storeLocationByBOutPresentSLocationNo = storeLocationByBOutPresentSLocationNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_goods_no", referencedColumnName = "t_goods_goods_no")
    public TGoodsEntity gettGoodsByBOutPresentSGoodsNo() {
        return tGoodsByBOutPresentSGoodsNo;
    }

    public void settGoodsByBOutPresentSGoodsNo(TGoodsEntity tGoodsByBOutPresentSGoodsNo) {
        this.tGoodsByBOutPresentSGoodsNo = tGoodsByBOutPresentSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_main_goods_no", referencedColumnName = "t_goods_goods_no")
    public TGoodsEntity gettGoodsByBOutPresentSMainGoodsNo() {
        return tGoodsByBOutPresentSMainGoodsNo;
    }

    public void settGoodsByBOutPresentSMainGoodsNo(TGoodsEntity tGoodsByBOutPresentSMainGoodsNo) {
        this.tGoodsByBOutPresentSMainGoodsNo = tGoodsByBOutPresentSMainGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentSCreateNo() {
        return tStaffByBOutPresentSCreateNo;
    }

    public void settStaffByBOutPresentSCreateNo(TStaffEntity tStaffByBOutPresentSCreateNo) {
        this.tStaffByBOutPresentSCreateNo = tStaffByBOutPresentSCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentSModifiNo() {
        return tStaffByBOutPresentSModifiNo;
    }

    public void settStaffByBOutPresentSModifiNo(TStaffEntity tStaffByBOutPresentSModifiNo) {
        this.tStaffByBOutPresentSModifiNo = tStaffByBOutPresentSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBOutPresentSChecker() {
        return tStaffByBOutPresentSChecker;
    }

    public void settStaffByBOutPresentSChecker(TStaffEntity tStaffByBOutPresentSChecker) {
        this.tStaffByBOutPresentSChecker = tStaffByBOutPresentSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_out_present_s_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByBOutPresentSGroupNodeId() {
        return tOrgByBOutPresentSGroupNodeId;
    }

    public void settOrgByBOutPresentSGroupNodeId(TOrgEntity tOrgByBOutPresentSGroupNodeId) {
        this.tOrgByBOutPresentSGroupNodeId = tOrgByBOutPresentSGroupNodeId;
    }
}
