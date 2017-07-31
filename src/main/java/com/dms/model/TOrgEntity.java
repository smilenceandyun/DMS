package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_org", schema = "dbo", catalog = "logistics")
public class TOrgEntity {
    private String tOrgGroupNodeId;
    private String tOrgGroupNodeName;
    private String tOrgParentId;
    private int tOrgGroupLevel;
    private String tOrgCreateNo;
    private Timestamp tOrgCreateDate;
    private String tOrgModifiNo;
    private Timestamp tOrgModifiTime;
    private Collection<DistributionListEntity> distributionListsByTOrgGroupNodeId;
    private Collection<PromotionClientGroupEntity> promotionClientGroupsByTOrgGroupNodeId;
    private Collection<PromotionMEntity> promotionMSByTOrgGroupNodeId;
    private Collection<PromotionMProductSEntity> promotionMProductSByTOrgGroupNodeId;
    private Collection<PromotionMSEntity> promotionMSByTOrgGroupNodeId_0;
    private Collection<AdvancePaymentEntity> advancePaymentsByTOrgGroupNodeId;
    private Collection<AgeAnalysisEntity> ageAnalysesByTOrgGroupNodeId;
    private Collection<BAgentInstockMEntity> bAgentInstockMSByTOrgGroupNodeId;
    private Collection<BAgentInstockSEntity> bAgentInstockSByTOrgGroupNodeId;
    private Collection<BAgentRsalesMEntity> bAgentRsalesMSByTOrgGroupNodeId;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByTOrgGroupNodeId;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTOrgGroupNodeId;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByTOrgGroupNodeId;
    private Collection<BInPresentMEntity> bInPresentMSByTOrgGroupNodeId;
    private Collection<BInPresentSEntity> bInPresentSByTOrgGroupNodeId;
    private Collection<BInProductMEntity> bInProductMSByTOrgGroupNodeId;
    private Collection<BInProductSEntity> bInProductSByTOrgGroupNodeId;
    private Collection<BOutPresentMEntity> bOutPresentMSByTOrgGroupNodeId;
    private Collection<BOutPresentSEntity> bOutPresentSByTOrgGroupNodeId;
    private Collection<BProcureMEntity> bProcureMSByTOrgGroupNodeId;
    private Collection<BProcureSEntity> bProcureSByTOrgGroupNodeId;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTOrgGroupNodeId;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTOrgGroupNodeId;
    private Collection<BRProcureMEntity> bRProcureMSByTOrgGroupNodeId;
    private Collection<BSConMEntity> bSConMSByTOrgGroupNodeId;
    private Collection<BSConSEntity> bSConSByTOrgGroupNodeId;
    private Collection<BSOrderMEntity> bSOrderMSByTOrgGroupNodeId;
    private Collection<BSProcureMEntity> bSProcureMSByTOrgGroupNodeId;
    private Collection<BSalesMEntity> bSalesMSByTOrgGroupNodeId;
    private Collection<BankAccountEntity> bankAccountsByTOrgGroupNodeId;
    private Collection<BillTypeEntity> billTypesByTOrgGroupNodeId;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTOrgGroupNodeId;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTOrgGroupNodeId;
    private Collection<ClientZoneEntity> clientZonesByTOrgGroupNodeId;
    private Collection<CreditLevelEntity> creditLevelsByTOrgGroupNodeId;
    private Collection<DeliverymanEntity> deliverymenByTOrgGroupNodeId;
    private Collection<EncodingTypeEntity> encodingTypesByTOrgGroupNodeId;
    private Collection<FConMEntity> fConMSByTOrgGroupNodeId;
    private Collection<FConSEntity> fConSByTOrgGroupNodeId;
    private Collection<FStockAdjusMEntity> fStockAdjusMSByTOrgGroupNodeId;
    private Collection<FeeClassEntity> feeClassesByTOrgGroupNodeId;
    private Collection<PayTypeEntity> payTypesByTOrgGroupNodeId;
    private Collection<PromotionPropertyEntity> promotionPropertiesByTOrgGroupNodeId;
    private Collection<SBreakageMEntity> sBreakageMSByTOrgGroupNodeId;
    private Collection<SInBorrowMEntity> sInBorrowMSByTOrgGroupNodeId;
    private Collection<SInLoanMEntity> sInLoanMSByTOrgGroupNodeId;
    private Collection<SInLoanSEntity> sInLoanSByTOrgGroupNodeId;
    private Collection<SOutLoanSEntity> sOutLoanSByTOrgGroupNodeId;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTOrgGroupNodeId;
    private Collection<SalesPropertiesEntity> salesPropertiesByTOrgGroupNodeId;
    private Collection<SalesmanGroupEntity> salesmanGroupsByTOrgGroupNodeId;
    private Collection<StoreLocationEntity> storeLocationsByTOrgGroupNodeId;
    private Collection<TBrandEntity> tBrandsByTOrgGroupNodeId;
    private Collection<TCarEntity> tCarsByTOrgGroupNodeId;
    private Collection<TClientEntity> tClientsByTOrgGroupNodeId;
    private Collection<TClientClassifyEntity> tClientClassifiesByTOrgGroupNodeId;
    private Collection<TDepartmentEntity> tDepartmentsByTOrgGroupNodeId;
    private Collection<TFactorysEntity> tFactorysByTOrgGroupNodeId;
    private Collection<TGoodsEntity> tGoodsByTOrgGroupNodeId;
    private Collection<TGoodsClassifyEntity> tGoodsClassifiesByTOrgGroupNodeId;
    private TStaffEntity tStaffByTOrgCreateNo;
    private TStaffEntity tStaffByTOrgModifiNo;
    private Collection<TPaymentEntity> tPaymentsByTOrgGroupNodeId;
    private Collection<TPositionEntity> tPositionsByTOrgGroupNodeId;
    private Collection<TPresentEntity> tPresentsByTOrgGroupNodeId;
    private Collection<TRoomEntity> tRoomsByTOrgGroupNodeId;
    private Collection<TRouteEntity> tRoutesByTOrgGroupNodeId;
    private Collection<TSalesPromotionEntity> tSalesPromotionsByTOrgGroupNodeId;
    private Collection<TStaffEntity> tStaffsByTOrgGroupNodeId;
    private Collection<UserGroupEntity> userGroupsByTOrgGroupNodeId;

    @Id
    @Column(name = "t_org_group_node_id", nullable = false, length = 20)
    public String gettOrgGroupNodeId() {
        return tOrgGroupNodeId;
    }

    public void settOrgGroupNodeId(String tOrgGroupNodeId) {
        this.tOrgGroupNodeId = tOrgGroupNodeId;
    }

    @Basic
    @Column(name = "t_org_group_node_name", nullable = false, length = 20)
    public String gettOrgGroupNodeName() {
        return tOrgGroupNodeName;
    }

    public void settOrgGroupNodeName(String tOrgGroupNodeName) {
        this.tOrgGroupNodeName = tOrgGroupNodeName;
    }

    @Basic
    @Column(name = "t_org_parent_id", nullable = false, length = 20)
    public String gettOrgParentId() {
        return tOrgParentId;
    }

    public void settOrgParentId(String tOrgParentId) {
        this.tOrgParentId = tOrgParentId;
    }

    @Basic
    @Column(name = "t_org_group_level", nullable = false)
    public int gettOrgGroupLevel() {
        return tOrgGroupLevel;
    }

    public void settOrgGroupLevel(int tOrgGroupLevel) {
        this.tOrgGroupLevel = tOrgGroupLevel;
    }

    @Basic
    @Column(name = "t_org_create_no", nullable = true, length = 8)
    public String gettOrgCreateNo() {
        return tOrgCreateNo;
    }

    public void settOrgCreateNo(String tOrgCreateNo) {
        this.tOrgCreateNo = tOrgCreateNo;
    }

    @Basic
    @Column(name = "t_org_create_date", nullable = true)
    public Timestamp gettOrgCreateDate() {
        return tOrgCreateDate;
    }

    public void settOrgCreateDate(Timestamp tOrgCreateDate) {
        this.tOrgCreateDate = tOrgCreateDate;
    }

    @Basic
    @Column(name = "t_org_modifi_no", nullable = true, length = 8)
    public String gettOrgModifiNo() {
        return tOrgModifiNo;
    }

    public void settOrgModifiNo(String tOrgModifiNo) {
        this.tOrgModifiNo = tOrgModifiNo;
    }

    @Basic
    @Column(name = "t_org_modifi_time", nullable = true)
    public Timestamp gettOrgModifiTime() {
        return tOrgModifiTime;
    }

    public void settOrgModifiTime(Timestamp tOrgModifiTime) {
        this.tOrgModifiTime = tOrgModifiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TOrgEntity that = (TOrgEntity) o;

        if (tOrgGroupLevel != that.tOrgGroupLevel) return false;
        if (tOrgGroupNodeId != null ? !tOrgGroupNodeId.equals(that.tOrgGroupNodeId) : that.tOrgGroupNodeId != null)
            return false;
        if (tOrgGroupNodeName != null ? !tOrgGroupNodeName.equals(that.tOrgGroupNodeName) : that.tOrgGroupNodeName != null)
            return false;
        if (tOrgParentId != null ? !tOrgParentId.equals(that.tOrgParentId) : that.tOrgParentId != null) return false;
        if (tOrgCreateNo != null ? !tOrgCreateNo.equals(that.tOrgCreateNo) : that.tOrgCreateNo != null) return false;
        if (tOrgCreateDate != null ? !tOrgCreateDate.equals(that.tOrgCreateDate) : that.tOrgCreateDate != null)
            return false;
        if (tOrgModifiNo != null ? !tOrgModifiNo.equals(that.tOrgModifiNo) : that.tOrgModifiNo != null) return false;
        if (tOrgModifiTime != null ? !tOrgModifiTime.equals(that.tOrgModifiTime) : that.tOrgModifiTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tOrgGroupNodeId != null ? tOrgGroupNodeId.hashCode() : 0;
        result = 31 * result + (tOrgGroupNodeName != null ? tOrgGroupNodeName.hashCode() : 0);
        result = 31 * result + (tOrgParentId != null ? tOrgParentId.hashCode() : 0);
        result = 31 * result + tOrgGroupLevel;
        result = 31 * result + (tOrgCreateNo != null ? tOrgCreateNo.hashCode() : 0);
        result = 31 * result + (tOrgCreateDate != null ? tOrgCreateDate.hashCode() : 0);
        result = 31 * result + (tOrgModifiNo != null ? tOrgModifiNo.hashCode() : 0);
        result = 31 * result + (tOrgModifiTime != null ? tOrgModifiTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tOrgByDistributionListGroupNodeId")
    public Collection<DistributionListEntity> getDistributionListsByTOrgGroupNodeId() {
        return distributionListsByTOrgGroupNodeId;
    }

    public void setDistributionListsByTOrgGroupNodeId(Collection<DistributionListEntity> distributionListsByTOrgGroupNodeId) {
        this.distributionListsByTOrgGroupNodeId = distributionListsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPromotionClientGroupGroupNodeId")
    public Collection<PromotionClientGroupEntity> getPromotionClientGroupsByTOrgGroupNodeId() {
        return promotionClientGroupsByTOrgGroupNodeId;
    }

    public void setPromotionClientGroupsByTOrgGroupNodeId(Collection<PromotionClientGroupEntity> promotionClientGroupsByTOrgGroupNodeId) {
        this.promotionClientGroupsByTOrgGroupNodeId = promotionClientGroupsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPromotionMGroupNodeId")
    public Collection<PromotionMEntity> getPromotionMSByTOrgGroupNodeId() {
        return promotionMSByTOrgGroupNodeId;
    }

    public void setPromotionMSByTOrgGroupNodeId(Collection<PromotionMEntity> promotionMSByTOrgGroupNodeId) {
        this.promotionMSByTOrgGroupNodeId = promotionMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPromotionMProductSGroupNodeId")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByTOrgGroupNodeId() {
        return promotionMProductSByTOrgGroupNodeId;
    }

    public void setPromotionMProductSByTOrgGroupNodeId(Collection<PromotionMProductSEntity> promotionMProductSByTOrgGroupNodeId) {
        this.promotionMProductSByTOrgGroupNodeId = promotionMProductSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPromotionMSGroupNodeId")
    public Collection<PromotionMSEntity> getPromotionMSByTOrgGroupNodeId_0() {
        return promotionMSByTOrgGroupNodeId_0;
    }

    public void setPromotionMSByTOrgGroupNodeId_0(Collection<PromotionMSEntity> promotionMSByTOrgGroupNodeId_0) {
        this.promotionMSByTOrgGroupNodeId_0 = promotionMSByTOrgGroupNodeId_0;
    }

    @OneToMany(mappedBy = "tOrgByAdvancePaymentGroupNodeId")
    public Collection<AdvancePaymentEntity> getAdvancePaymentsByTOrgGroupNodeId() {
        return advancePaymentsByTOrgGroupNodeId;
    }

    public void setAdvancePaymentsByTOrgGroupNodeId(Collection<AdvancePaymentEntity> advancePaymentsByTOrgGroupNodeId) {
        this.advancePaymentsByTOrgGroupNodeId = advancePaymentsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByAgeAnalysisGroupNodeId")
    public Collection<AgeAnalysisEntity> getAgeAnalysesByTOrgGroupNodeId() {
        return ageAnalysesByTOrgGroupNodeId;
    }

    public void setAgeAnalysesByTOrgGroupNodeId(Collection<AgeAnalysisEntity> ageAnalysesByTOrgGroupNodeId) {
        this.ageAnalysesByTOrgGroupNodeId = ageAnalysesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentInstockMGroupNodeId")
    public Collection<BAgentInstockMEntity> getbAgentInstockMSByTOrgGroupNodeId() {
        return bAgentInstockMSByTOrgGroupNodeId;
    }

    public void setbAgentInstockMSByTOrgGroupNodeId(Collection<BAgentInstockMEntity> bAgentInstockMSByTOrgGroupNodeId) {
        this.bAgentInstockMSByTOrgGroupNodeId = bAgentInstockMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentInstockSGroupNodeId")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByTOrgGroupNodeId() {
        return bAgentInstockSByTOrgGroupNodeId;
    }

    public void setbAgentInstockSByTOrgGroupNodeId(Collection<BAgentInstockSEntity> bAgentInstockSByTOrgGroupNodeId) {
        this.bAgentInstockSByTOrgGroupNodeId = bAgentInstockSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentRsalesMGroupNodeId")
    public Collection<BAgentRsalesMEntity> getbAgentRsalesMSByTOrgGroupNodeId() {
        return bAgentRsalesMSByTOrgGroupNodeId;
    }

    public void setbAgentRsalesMSByTOrgGroupNodeId(Collection<BAgentRsalesMEntity> bAgentRsalesMSByTOrgGroupNodeId) {
        this.bAgentRsalesMSByTOrgGroupNodeId = bAgentRsalesMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentRsalesSGroupNodeId")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByTOrgGroupNodeId() {
        return bAgentRsalesSESByTOrgGroupNodeId;
    }

    public void setbAgentRsalesSESByTOrgGroupNodeId(Collection<BAgentRsalesSEntity> bAgentRsalesSESByTOrgGroupNodeId) {
        this.bAgentRsalesSESByTOrgGroupNodeId = bAgentRsalesSESByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentSalesMGroupNodeId")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTOrgGroupNodeId() {
        return bAgentSalesMSByTOrgGroupNodeId;
    }

    public void setbAgentSalesMSByTOrgGroupNodeId(Collection<BAgentSalesMEntity> bAgentSalesMSByTOrgGroupNodeId) {
        this.bAgentSalesMSByTOrgGroupNodeId = bAgentSalesMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBAgentSalesSGroupNodeId")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByTOrgGroupNodeId() {
        return bAgentSalesSESByTOrgGroupNodeId;
    }

    public void setbAgentSalesSESByTOrgGroupNodeId(Collection<BAgentSalesSEntity> bAgentSalesSESByTOrgGroupNodeId) {
        this.bAgentSalesSESByTOrgGroupNodeId = bAgentSalesSESByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBInPresentMGroupNodeId")
    public Collection<BInPresentMEntity> getbInPresentMSByTOrgGroupNodeId() {
        return bInPresentMSByTOrgGroupNodeId;
    }

    public void setbInPresentMSByTOrgGroupNodeId(Collection<BInPresentMEntity> bInPresentMSByTOrgGroupNodeId) {
        this.bInPresentMSByTOrgGroupNodeId = bInPresentMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBInPresentSGroupNodeId")
    public Collection<BInPresentSEntity> getbInPresentSByTOrgGroupNodeId() {
        return bInPresentSByTOrgGroupNodeId;
    }

    public void setbInPresentSByTOrgGroupNodeId(Collection<BInPresentSEntity> bInPresentSByTOrgGroupNodeId) {
        this.bInPresentSByTOrgGroupNodeId = bInPresentSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBInProductMGroupNodeId")
    public Collection<BInProductMEntity> getbInProductMSByTOrgGroupNodeId() {
        return bInProductMSByTOrgGroupNodeId;
    }

    public void setbInProductMSByTOrgGroupNodeId(Collection<BInProductMEntity> bInProductMSByTOrgGroupNodeId) {
        this.bInProductMSByTOrgGroupNodeId = bInProductMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBInProductSGroupNodeId")
    public Collection<BInProductSEntity> getbInProductSByTOrgGroupNodeId() {
        return bInProductSByTOrgGroupNodeId;
    }

    public void setbInProductSByTOrgGroupNodeId(Collection<BInProductSEntity> bInProductSByTOrgGroupNodeId) {
        this.bInProductSByTOrgGroupNodeId = bInProductSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBOutPresentMGroupNodeId")
    public Collection<BOutPresentMEntity> getbOutPresentMSByTOrgGroupNodeId() {
        return bOutPresentMSByTOrgGroupNodeId;
    }

    public void setbOutPresentMSByTOrgGroupNodeId(Collection<BOutPresentMEntity> bOutPresentMSByTOrgGroupNodeId) {
        this.bOutPresentMSByTOrgGroupNodeId = bOutPresentMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBOutPresentSGroupNodeId")
    public Collection<BOutPresentSEntity> getbOutPresentSByTOrgGroupNodeId() {
        return bOutPresentSByTOrgGroupNodeId;
    }

    public void setbOutPresentSByTOrgGroupNodeId(Collection<BOutPresentSEntity> bOutPresentSByTOrgGroupNodeId) {
        this.bOutPresentSByTOrgGroupNodeId = bOutPresentSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBProcureMGroupNodeId")
    public Collection<BProcureMEntity> getbProcureMSByTOrgGroupNodeId() {
        return bProcureMSByTOrgGroupNodeId;
    }

    public void setbProcureMSByTOrgGroupNodeId(Collection<BProcureMEntity> bProcureMSByTOrgGroupNodeId) {
        this.bProcureMSByTOrgGroupNodeId = bProcureMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBProcureSGroupNodeId")
    public Collection<BProcureSEntity> getbProcureSByTOrgGroupNodeId() {
        return bProcureSByTOrgGroupNodeId;
    }

    public void setbProcureSByTOrgGroupNodeId(Collection<BProcureSEntity> bProcureSByTOrgGroupNodeId) {
        this.bProcureSByTOrgGroupNodeId = bProcureSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBPurchaseOrdMGroupNodeId")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTOrgGroupNodeId() {
        return bPurchaseOrdMSByTOrgGroupNodeId;
    }

    public void setbPurchaseOrdMSByTOrgGroupNodeId(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTOrgGroupNodeId) {
        this.bPurchaseOrdMSByTOrgGroupNodeId = bPurchaseOrdMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBPurchaseOrdSGroupNodeId")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTOrgGroupNodeId() {
        return bPurchaseOrdSByTOrgGroupNodeId;
    }

    public void setbPurchaseOrdSByTOrgGroupNodeId(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTOrgGroupNodeId) {
        this.bPurchaseOrdSByTOrgGroupNodeId = bPurchaseOrdSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBRProcureMGroupNodeId")
    public Collection<BRProcureMEntity> getbRProcureMSByTOrgGroupNodeId() {
        return bRProcureMSByTOrgGroupNodeId;
    }

    public void setbRProcureMSByTOrgGroupNodeId(Collection<BRProcureMEntity> bRProcureMSByTOrgGroupNodeId) {
        this.bRProcureMSByTOrgGroupNodeId = bRProcureMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBSConMGroupNodeId")
    public Collection<BSConMEntity> getbSConMSByTOrgGroupNodeId() {
        return bSConMSByTOrgGroupNodeId;
    }

    public void setbSConMSByTOrgGroupNodeId(Collection<BSConMEntity> bSConMSByTOrgGroupNodeId) {
        this.bSConMSByTOrgGroupNodeId = bSConMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBSConSGroupNodeId")
    public Collection<BSConSEntity> getbSConSByTOrgGroupNodeId() {
        return bSConSByTOrgGroupNodeId;
    }

    public void setbSConSByTOrgGroupNodeId(Collection<BSConSEntity> bSConSByTOrgGroupNodeId) {
        this.bSConSByTOrgGroupNodeId = bSConSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBSOrderMGroupNodeId")
    public Collection<BSOrderMEntity> getbSOrderMSByTOrgGroupNodeId() {
        return bSOrderMSByTOrgGroupNodeId;
    }

    public void setbSOrderMSByTOrgGroupNodeId(Collection<BSOrderMEntity> bSOrderMSByTOrgGroupNodeId) {
        this.bSOrderMSByTOrgGroupNodeId = bSOrderMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBSProcureMGroupNodeId")
    public Collection<BSProcureMEntity> getbSProcureMSByTOrgGroupNodeId() {
        return bSProcureMSByTOrgGroupNodeId;
    }

    public void setbSProcureMSByTOrgGroupNodeId(Collection<BSProcureMEntity> bSProcureMSByTOrgGroupNodeId) {
        this.bSProcureMSByTOrgGroupNodeId = bSProcureMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBSalesMGroupNodeId")
    public Collection<BSalesMEntity> getbSalesMSByTOrgGroupNodeId() {
        return bSalesMSByTOrgGroupNodeId;
    }

    public void setbSalesMSByTOrgGroupNodeId(Collection<BSalesMEntity> bSalesMSByTOrgGroupNodeId) {
        this.bSalesMSByTOrgGroupNodeId = bSalesMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBankAccountGroupNodeId")
    public Collection<BankAccountEntity> getBankAccountsByTOrgGroupNodeId() {
        return bankAccountsByTOrgGroupNodeId;
    }

    public void setBankAccountsByTOrgGroupNodeId(Collection<BankAccountEntity> bankAccountsByTOrgGroupNodeId) {
        this.bankAccountsByTOrgGroupNodeId = bankAccountsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByBillTypeGroupNodeId")
    public Collection<BillTypeEntity> getBillTypesByTOrgGroupNodeId() {
        return billTypesByTOrgGroupNodeId;
    }

    public void setBillTypesByTOrgGroupNodeId(Collection<BillTypeEntity> billTypesByTOrgGroupNodeId) {
        this.billTypesByTOrgGroupNodeId = billTypesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByCPurchaseConMGroupNodeId")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTOrgGroupNodeId() {
        return cPurchaseConMSByTOrgGroupNodeId;
    }

    public void setcPurchaseConMSByTOrgGroupNodeId(Collection<CPurchaseConMEntity> cPurchaseConMSByTOrgGroupNodeId) {
        this.cPurchaseConMSByTOrgGroupNodeId = cPurchaseConMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByCPurchaseConSGroupNodeId")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTOrgGroupNodeId() {
        return cPurchaseConSByTOrgGroupNodeId;
    }

    public void setcPurchaseConSByTOrgGroupNodeId(Collection<CPurchaseConSEntity> cPurchaseConSByTOrgGroupNodeId) {
        this.cPurchaseConSByTOrgGroupNodeId = cPurchaseConSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByClientZoneGroupNodeId")
    public Collection<ClientZoneEntity> getClientZonesByTOrgGroupNodeId() {
        return clientZonesByTOrgGroupNodeId;
    }

    public void setClientZonesByTOrgGroupNodeId(Collection<ClientZoneEntity> clientZonesByTOrgGroupNodeId) {
        this.clientZonesByTOrgGroupNodeId = clientZonesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByCreditLevelGroupNodeId")
    public Collection<CreditLevelEntity> getCreditLevelsByTOrgGroupNodeId() {
        return creditLevelsByTOrgGroupNodeId;
    }

    public void setCreditLevelsByTOrgGroupNodeId(Collection<CreditLevelEntity> creditLevelsByTOrgGroupNodeId) {
        this.creditLevelsByTOrgGroupNodeId = creditLevelsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByDeliverymanGroupNodeId")
    public Collection<DeliverymanEntity> getDeliverymenByTOrgGroupNodeId() {
        return deliverymenByTOrgGroupNodeId;
    }

    public void setDeliverymenByTOrgGroupNodeId(Collection<DeliverymanEntity> deliverymenByTOrgGroupNodeId) {
        this.deliverymenByTOrgGroupNodeId = deliverymenByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByEncodingTypeGroupNodeId")
    public Collection<EncodingTypeEntity> getEncodingTypesByTOrgGroupNodeId() {
        return encodingTypesByTOrgGroupNodeId;
    }

    public void setEncodingTypesByTOrgGroupNodeId(Collection<EncodingTypeEntity> encodingTypesByTOrgGroupNodeId) {
        this.encodingTypesByTOrgGroupNodeId = encodingTypesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByFConMGroupNodeId")
    public Collection<FConMEntity> getfConMSByTOrgGroupNodeId() {
        return fConMSByTOrgGroupNodeId;
    }

    public void setfConMSByTOrgGroupNodeId(Collection<FConMEntity> fConMSByTOrgGroupNodeId) {
        this.fConMSByTOrgGroupNodeId = fConMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByFConSGroupNodeId")
    public Collection<FConSEntity> getfConSByTOrgGroupNodeId() {
        return fConSByTOrgGroupNodeId;
    }

    public void setfConSByTOrgGroupNodeId(Collection<FConSEntity> fConSByTOrgGroupNodeId) {
        this.fConSByTOrgGroupNodeId = fConSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByFStockAdjusMGroupNodeId")
    public Collection<FStockAdjusMEntity> getfStockAdjusMSByTOrgGroupNodeId() {
        return fStockAdjusMSByTOrgGroupNodeId;
    }

    public void setfStockAdjusMSByTOrgGroupNodeId(Collection<FStockAdjusMEntity> fStockAdjusMSByTOrgGroupNodeId) {
        this.fStockAdjusMSByTOrgGroupNodeId = fStockAdjusMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByFeeClassGroupNodeId")
    public Collection<FeeClassEntity> getFeeClassesByTOrgGroupNodeId() {
        return feeClassesByTOrgGroupNodeId;
    }

    public void setFeeClassesByTOrgGroupNodeId(Collection<FeeClassEntity> feeClassesByTOrgGroupNodeId) {
        this.feeClassesByTOrgGroupNodeId = feeClassesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPayTypeGroupNodeId")
    public Collection<PayTypeEntity> getPayTypesByTOrgGroupNodeId() {
        return payTypesByTOrgGroupNodeId;
    }

    public void setPayTypesByTOrgGroupNodeId(Collection<PayTypeEntity> payTypesByTOrgGroupNodeId) {
        this.payTypesByTOrgGroupNodeId = payTypesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByPromotionPropertyGroupNodeId")
    public Collection<PromotionPropertyEntity> getPromotionPropertiesByTOrgGroupNodeId() {
        return promotionPropertiesByTOrgGroupNodeId;
    }

    public void setPromotionPropertiesByTOrgGroupNodeId(Collection<PromotionPropertyEntity> promotionPropertiesByTOrgGroupNodeId) {
        this.promotionPropertiesByTOrgGroupNodeId = promotionPropertiesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySBreakageMGroupNodeId")
    public Collection<SBreakageMEntity> getsBreakageMSByTOrgGroupNodeId() {
        return sBreakageMSByTOrgGroupNodeId;
    }

    public void setsBreakageMSByTOrgGroupNodeId(Collection<SBreakageMEntity> sBreakageMSByTOrgGroupNodeId) {
        this.sBreakageMSByTOrgGroupNodeId = sBreakageMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySInBorrowMGroupNodeId")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTOrgGroupNodeId() {
        return sInBorrowMSByTOrgGroupNodeId;
    }

    public void setsInBorrowMSByTOrgGroupNodeId(Collection<SInBorrowMEntity> sInBorrowMSByTOrgGroupNodeId) {
        this.sInBorrowMSByTOrgGroupNodeId = sInBorrowMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySInLoanMGroupNodeId")
    public Collection<SInLoanMEntity> getsInLoanMSByTOrgGroupNodeId() {
        return sInLoanMSByTOrgGroupNodeId;
    }

    public void setsInLoanMSByTOrgGroupNodeId(Collection<SInLoanMEntity> sInLoanMSByTOrgGroupNodeId) {
        this.sInLoanMSByTOrgGroupNodeId = sInLoanMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySInLoanSGroupNodeId")
    public Collection<SInLoanSEntity> getsInLoanSByTOrgGroupNodeId() {
        return sInLoanSByTOrgGroupNodeId;
    }

    public void setsInLoanSByTOrgGroupNodeId(Collection<SInLoanSEntity> sInLoanSByTOrgGroupNodeId) {
        this.sInLoanSByTOrgGroupNodeId = sInLoanSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySOutLoanSGroupNodeId")
    public Collection<SOutLoanSEntity> getsOutLoanSByTOrgGroupNodeId() {
        return sOutLoanSByTOrgGroupNodeId;
    }

    public void setsOutLoanSByTOrgGroupNodeId(Collection<SOutLoanSEntity> sOutLoanSByTOrgGroupNodeId) {
        this.sOutLoanSByTOrgGroupNodeId = sOutLoanSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySRoomTransferMGroupNodeId")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTOrgGroupNodeId() {
        return sRoomTransferMSByTOrgGroupNodeId;
    }

    public void setsRoomTransferMSByTOrgGroupNodeId(Collection<SRoomTransferMEntity> sRoomTransferMSByTOrgGroupNodeId) {
        this.sRoomTransferMSByTOrgGroupNodeId = sRoomTransferMSByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySalesPropertiesGroupNodeId")
    public Collection<SalesPropertiesEntity> getSalesPropertiesByTOrgGroupNodeId() {
        return salesPropertiesByTOrgGroupNodeId;
    }

    public void setSalesPropertiesByTOrgGroupNodeId(Collection<SalesPropertiesEntity> salesPropertiesByTOrgGroupNodeId) {
        this.salesPropertiesByTOrgGroupNodeId = salesPropertiesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgBySalesmanGroupGroupNodeId")
    public Collection<SalesmanGroupEntity> getSalesmanGroupsByTOrgGroupNodeId() {
        return salesmanGroupsByTOrgGroupNodeId;
    }

    public void setSalesmanGroupsByTOrgGroupNodeId(Collection<SalesmanGroupEntity> salesmanGroupsByTOrgGroupNodeId) {
        this.salesmanGroupsByTOrgGroupNodeId = salesmanGroupsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByStoreLocationGroupNodeId")
    public Collection<StoreLocationEntity> getStoreLocationsByTOrgGroupNodeId() {
        return storeLocationsByTOrgGroupNodeId;
    }

    public void setStoreLocationsByTOrgGroupNodeId(Collection<StoreLocationEntity> storeLocationsByTOrgGroupNodeId) {
        this.storeLocationsByTOrgGroupNodeId = storeLocationsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTBrandGroupNodeId")
    public Collection<TBrandEntity> gettBrandsByTOrgGroupNodeId() {
        return tBrandsByTOrgGroupNodeId;
    }

    public void settBrandsByTOrgGroupNodeId(Collection<TBrandEntity> tBrandsByTOrgGroupNodeId) {
        this.tBrandsByTOrgGroupNodeId = tBrandsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTCarGroupNodeId")
    public Collection<TCarEntity> gettCarsByTOrgGroupNodeId() {
        return tCarsByTOrgGroupNodeId;
    }

    public void settCarsByTOrgGroupNodeId(Collection<TCarEntity> tCarsByTOrgGroupNodeId) {
        this.tCarsByTOrgGroupNodeId = tCarsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTClientGroupNodeId")
    public Collection<TClientEntity> gettClientsByTOrgGroupNodeId() {
        return tClientsByTOrgGroupNodeId;
    }

    public void settClientsByTOrgGroupNodeId(Collection<TClientEntity> tClientsByTOrgGroupNodeId) {
        this.tClientsByTOrgGroupNodeId = tClientsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTClientClassifyGroupNodeId")
    public Collection<TClientClassifyEntity> gettClientClassifiesByTOrgGroupNodeId() {
        return tClientClassifiesByTOrgGroupNodeId;
    }

    public void settClientClassifiesByTOrgGroupNodeId(Collection<TClientClassifyEntity> tClientClassifiesByTOrgGroupNodeId) {
        this.tClientClassifiesByTOrgGroupNodeId = tClientClassifiesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTDepartmentGroupNodeId")
    public Collection<TDepartmentEntity> gettDepartmentsByTOrgGroupNodeId() {
        return tDepartmentsByTOrgGroupNodeId;
    }

    public void settDepartmentsByTOrgGroupNodeId(Collection<TDepartmentEntity> tDepartmentsByTOrgGroupNodeId) {
        this.tDepartmentsByTOrgGroupNodeId = tDepartmentsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTFactorysGroupNodeId")
    public Collection<TFactorysEntity> gettFactorysByTOrgGroupNodeId() {
        return tFactorysByTOrgGroupNodeId;
    }

    public void settFactorysByTOrgGroupNodeId(Collection<TFactorysEntity> tFactorysByTOrgGroupNodeId) {
        this.tFactorysByTOrgGroupNodeId = tFactorysByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTGoodsGroupNodeId")
    public Collection<TGoodsEntity> gettGoodsByTOrgGroupNodeId() {
        return tGoodsByTOrgGroupNodeId;
    }

    public void settGoodsByTOrgGroupNodeId(Collection<TGoodsEntity> tGoodsByTOrgGroupNodeId) {
        this.tGoodsByTOrgGroupNodeId = tGoodsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTGoodsClassifyGroupNodeId")
    public Collection<TGoodsClassifyEntity> gettGoodsClassifiesByTOrgGroupNodeId() {
        return tGoodsClassifiesByTOrgGroupNodeId;
    }

    public void settGoodsClassifiesByTOrgGroupNodeId(Collection<TGoodsClassifyEntity> tGoodsClassifiesByTOrgGroupNodeId) {
        this.tGoodsClassifiesByTOrgGroupNodeId = tGoodsClassifiesByTOrgGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_org_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTOrgCreateNo() {
        return tStaffByTOrgCreateNo;
    }

    public void settStaffByTOrgCreateNo(TStaffEntity tStaffByTOrgCreateNo) {
        this.tStaffByTOrgCreateNo = tStaffByTOrgCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_org_modifi_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTOrgModifiNo() {
        return tStaffByTOrgModifiNo;
    }

    public void settStaffByTOrgModifiNo(TStaffEntity tStaffByTOrgModifiNo) {
        this.tStaffByTOrgModifiNo = tStaffByTOrgModifiNo;
    }

    @OneToMany(mappedBy = "tOrgByTPaymentGroupNodeId")
    public Collection<TPaymentEntity> gettPaymentsByTOrgGroupNodeId() {
        return tPaymentsByTOrgGroupNodeId;
    }

    public void settPaymentsByTOrgGroupNodeId(Collection<TPaymentEntity> tPaymentsByTOrgGroupNodeId) {
        this.tPaymentsByTOrgGroupNodeId = tPaymentsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTPositionGroupNodeId")
    public Collection<TPositionEntity> gettPositionsByTOrgGroupNodeId() {
        return tPositionsByTOrgGroupNodeId;
    }

    public void settPositionsByTOrgGroupNodeId(Collection<TPositionEntity> tPositionsByTOrgGroupNodeId) {
        this.tPositionsByTOrgGroupNodeId = tPositionsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTPresentGroupNodeId")
    public Collection<TPresentEntity> gettPresentsByTOrgGroupNodeId() {
        return tPresentsByTOrgGroupNodeId;
    }

    public void settPresentsByTOrgGroupNodeId(Collection<TPresentEntity> tPresentsByTOrgGroupNodeId) {
        this.tPresentsByTOrgGroupNodeId = tPresentsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTRoomGroupNodeId")
    public Collection<TRoomEntity> gettRoomsByTOrgGroupNodeId() {
        return tRoomsByTOrgGroupNodeId;
    }

    public void settRoomsByTOrgGroupNodeId(Collection<TRoomEntity> tRoomsByTOrgGroupNodeId) {
        this.tRoomsByTOrgGroupNodeId = tRoomsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTRouteGroupNodeId")
    public Collection<TRouteEntity> gettRoutesByTOrgGroupNodeId() {
        return tRoutesByTOrgGroupNodeId;
    }

    public void settRoutesByTOrgGroupNodeId(Collection<TRouteEntity> tRoutesByTOrgGroupNodeId) {
        this.tRoutesByTOrgGroupNodeId = tRoutesByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTSalesPromotionGroupNodeId")
    public Collection<TSalesPromotionEntity> gettSalesPromotionsByTOrgGroupNodeId() {
        return tSalesPromotionsByTOrgGroupNodeId;
    }

    public void settSalesPromotionsByTOrgGroupNodeId(Collection<TSalesPromotionEntity> tSalesPromotionsByTOrgGroupNodeId) {
        this.tSalesPromotionsByTOrgGroupNodeId = tSalesPromotionsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByTStaffGroupNodeId")
    public Collection<TStaffEntity> gettStaffsByTOrgGroupNodeId() {
        return tStaffsByTOrgGroupNodeId;
    }

    public void settStaffsByTOrgGroupNodeId(Collection<TStaffEntity> tStaffsByTOrgGroupNodeId) {
        this.tStaffsByTOrgGroupNodeId = tStaffsByTOrgGroupNodeId;
    }

    @OneToMany(mappedBy = "tOrgByUserGroupGroupNodeId")
    public Collection<UserGroupEntity> getUserGroupsByTOrgGroupNodeId() {
        return userGroupsByTOrgGroupNodeId;
    }

    public void setUserGroupsByTOrgGroupNodeId(Collection<UserGroupEntity> userGroupsByTOrgGroupNodeId) {
        this.userGroupsByTOrgGroupNodeId = userGroupsByTOrgGroupNodeId;
    }
}
