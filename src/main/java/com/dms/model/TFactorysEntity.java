package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_factorys", schema = "dbo", catalog = "logistics_test")
public class TFactorysEntity {
    private String tFactorysFactoryGoodsNo;
    private String tFactorysFactoryGoodsName;
    private String tFactorysRemark;
    private String tFactorysCreateNo;
    private Timestamp tFactorysCreateDate;
    private String tFactorysModifiNo;
    private Timestamp tFactorysModifiTime;
    private String tFactorysFlag;
    private String tFactorysGroupNodeId;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTFactorysFactoryGoodsNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTFactorysFactoryGoodsNo;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTFactorysFactoryGoodsNo;
    private TStaffEntity tStaffByTFactorysCreateNo;
    private TStaffEntity tStaffByTFactorysModifiNo;
    private TOrgEntity tOrgByTFactorysGroupNodeId;
    private Collection<TGoodsEntity> tGoodsByTFactorysFactoryGoodsNo;

    @Id
    @Column(name = "t_factorys_factory_goods_no", nullable = false, length = 80)
    public String gettFactorysFactoryGoodsNo() {
        return tFactorysFactoryGoodsNo;
    }

    public void settFactorysFactoryGoodsNo(String tFactorysFactoryGoodsNo) {
        this.tFactorysFactoryGoodsNo = tFactorysFactoryGoodsNo;
    }

    @Basic
    @Column(name = "t_factorys_factory_goods_name", nullable = true, length = 80)
    public String gettFactorysFactoryGoodsName() {
        return tFactorysFactoryGoodsName;
    }

    public void settFactorysFactoryGoodsName(String tFactorysFactoryGoodsName) {
        this.tFactorysFactoryGoodsName = tFactorysFactoryGoodsName;
    }

    @Basic
    @Column(name = "t_factorys_remark", nullable = true, length = 100)
    public String gettFactorysRemark() {
        return tFactorysRemark;
    }

    public void settFactorysRemark(String tFactorysRemark) {
        this.tFactorysRemark = tFactorysRemark;
    }

    @Basic
    @Column(name = "t_factorys_create_no", nullable = true, length = 8)
    public String gettFactorysCreateNo() {
        return tFactorysCreateNo;
    }

    public void settFactorysCreateNo(String tFactorysCreateNo) {
        this.tFactorysCreateNo = tFactorysCreateNo;
    }

    @Basic
    @Column(name = "t_factorys_create_date", nullable = true)
    public Timestamp gettFactorysCreateDate() {
        return tFactorysCreateDate;
    }

    public void settFactorysCreateDate(Timestamp tFactorysCreateDate) {
        this.tFactorysCreateDate = tFactorysCreateDate;
    }

    @Basic
    @Column(name = "t_factorys_modifi_no", nullable = true, length = 8)
    public String gettFactorysModifiNo() {
        return tFactorysModifiNo;
    }

    public void settFactorysModifiNo(String tFactorysModifiNo) {
        this.tFactorysModifiNo = tFactorysModifiNo;
    }

    @Basic
    @Column(name = "t_factorys_modifi_time", nullable = true)
    public Timestamp gettFactorysModifiTime() {
        return tFactorysModifiTime;
    }

    public void settFactorysModifiTime(Timestamp tFactorysModifiTime) {
        this.tFactorysModifiTime = tFactorysModifiTime;
    }

    @Basic
    @Column(name = "t_factorys_flag", nullable = false, length = 1)
    public String gettFactorysFlag() {
        return tFactorysFlag;
    }

    public void settFactorysFlag(String tFactorysFlag) {
        this.tFactorysFlag = tFactorysFlag;
    }

    @Basic
    @Column(name = "t_factorys_group_node_id", nullable = true, length = 20)
    public String gettFactorysGroupNodeId() {
        return tFactorysGroupNodeId;
    }

    public void settFactorysGroupNodeId(String tFactorysGroupNodeId) {
        this.tFactorysGroupNodeId = tFactorysGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFactorysEntity that = (TFactorysEntity) o;

        if (tFactorysFactoryGoodsNo != null ? !tFactorysFactoryGoodsNo.equals(that.tFactorysFactoryGoodsNo) : that.tFactorysFactoryGoodsNo != null)
            return false;
        if (tFactorysFactoryGoodsName != null ? !tFactorysFactoryGoodsName.equals(that.tFactorysFactoryGoodsName) : that.tFactorysFactoryGoodsName != null)
            return false;
        if (tFactorysRemark != null ? !tFactorysRemark.equals(that.tFactorysRemark) : that.tFactorysRemark != null)
            return false;
        if (tFactorysCreateNo != null ? !tFactorysCreateNo.equals(that.tFactorysCreateNo) : that.tFactorysCreateNo != null)
            return false;
        if (tFactorysCreateDate != null ? !tFactorysCreateDate.equals(that.tFactorysCreateDate) : that.tFactorysCreateDate != null)
            return false;
        if (tFactorysModifiNo != null ? !tFactorysModifiNo.equals(that.tFactorysModifiNo) : that.tFactorysModifiNo != null)
            return false;
        if (tFactorysModifiTime != null ? !tFactorysModifiTime.equals(that.tFactorysModifiTime) : that.tFactorysModifiTime != null)
            return false;
        if (tFactorysFlag != null ? !tFactorysFlag.equals(that.tFactorysFlag) : that.tFactorysFlag != null)
            return false;
        if (tFactorysGroupNodeId != null ? !tFactorysGroupNodeId.equals(that.tFactorysGroupNodeId) : that.tFactorysGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tFactorysFactoryGoodsNo != null ? tFactorysFactoryGoodsNo.hashCode() : 0;
        result = 31 * result + (tFactorysFactoryGoodsName != null ? tFactorysFactoryGoodsName.hashCode() : 0);
        result = 31 * result + (tFactorysRemark != null ? tFactorysRemark.hashCode() : 0);
        result = 31 * result + (tFactorysCreateNo != null ? tFactorysCreateNo.hashCode() : 0);
        result = 31 * result + (tFactorysCreateDate != null ? tFactorysCreateDate.hashCode() : 0);
        result = 31 * result + (tFactorysModifiNo != null ? tFactorysModifiNo.hashCode() : 0);
        result = 31 * result + (tFactorysModifiTime != null ? tFactorysModifiTime.hashCode() : 0);
        result = 31 * result + (tFactorysFlag != null ? tFactorysFlag.hashCode() : 0);
        result = 31 * result + (tFactorysGroupNodeId != null ? tFactorysGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tFactorysByBPurchaseOrdMFactoryGoodsNo")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTFactorysFactoryGoodsNo() {
        return bPurchaseOrdMSByTFactorysFactoryGoodsNo;
    }

    public void setbPurchaseOrdMSByTFactorysFactoryGoodsNo(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTFactorysFactoryGoodsNo) {
        this.bPurchaseOrdMSByTFactorysFactoryGoodsNo = bPurchaseOrdMSByTFactorysFactoryGoodsNo;
    }

    @OneToMany(mappedBy = "tFactorysByBPurchaseOrdSFactoryGoodsNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTFactorysFactoryGoodsNo() {
        return bPurchaseOrdSByTFactorysFactoryGoodsNo;
    }

    public void setbPurchaseOrdSByTFactorysFactoryGoodsNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTFactorysFactoryGoodsNo) {
        this.bPurchaseOrdSByTFactorysFactoryGoodsNo = bPurchaseOrdSByTFactorysFactoryGoodsNo;
    }

    @OneToMany(mappedBy = "tFactorysByCPurchaseConMFactoryGoodsNo")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTFactorysFactoryGoodsNo() {
        return cPurchaseConMSByTFactorysFactoryGoodsNo;
    }

    public void setcPurchaseConMSByTFactorysFactoryGoodsNo(Collection<CPurchaseConMEntity> cPurchaseConMSByTFactorysFactoryGoodsNo) {
        this.cPurchaseConMSByTFactorysFactoryGoodsNo = cPurchaseConMSByTFactorysFactoryGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_factorys_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTFactorysCreateNo() {
        return tStaffByTFactorysCreateNo;
    }

    public void settStaffByTFactorysCreateNo(TStaffEntity tStaffByTFactorysCreateNo) {
        this.tStaffByTFactorysCreateNo = tStaffByTFactorysCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_factorys_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTFactorysModifiNo() {
        return tStaffByTFactorysModifiNo;
    }

    public void settStaffByTFactorysModifiNo(TStaffEntity tStaffByTFactorysModifiNo) {
        this.tStaffByTFactorysModifiNo = tStaffByTFactorysModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_factorys_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTFactorysGroupNodeId() {
        return tOrgByTFactorysGroupNodeId;
    }

    public void settOrgByTFactorysGroupNodeId(TOrgEntity tOrgByTFactorysGroupNodeId) {
        this.tOrgByTFactorysGroupNodeId = tOrgByTFactorysGroupNodeId;
    }

    @OneToMany(mappedBy = "tFactorysByTGoodsFactoryGoodsNo")
    public Collection<TGoodsEntity> gettGoodsByTFactorysFactoryGoodsNo() {
        return tGoodsByTFactorysFactoryGoodsNo;
    }

    public void settGoodsByTFactorysFactoryGoodsNo(Collection<TGoodsEntity> tGoodsByTFactorysFactoryGoodsNo) {
        this.tGoodsByTFactorysFactoryGoodsNo = tGoodsByTFactorysFactoryGoodsNo;
    }
}
