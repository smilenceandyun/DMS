package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_staff", schema = "dbo", catalog = "logistics_test")
public class TStaffEntity {
    private String tStaffStaffNo;
    private String tStaffGroupNodeId;
    private String tStaffDeptNo;
    private String tStaffPotitionNo;
    private String tStaffStaffName;
    private String tStaffSex;
    private String tStaffId;
    private String tStaffTel;
    private String tStaffHomeAddress;
    private Timestamp tStaffHiredate;
    private Timestamp tStaffLeavedate;
    private String tStaffPassword;
    private String tStaffFlag;
    private String tStaffRemark;
    private String tStaffCreateNo;
    private Timestamp tStaffCreateDate;
    private String tStaffModifiNo;
    private Timestamp tStaffModifiTime;
    private Collection<DistributionListEntity> distributionListsByTStaffStaffNo;
    private Collection<DistributionListEntity> distributionListsByTStaffStaffNo_0;
    private Collection<DistributionListEntity> distributionListsByTStaffStaffNo_1;
    private Collection<PromotionMEntity> promotionMSByTStaffStaffNo;
    private Collection<PromotionMEntity> promotionMSByTStaffStaffNo_0;
    private Collection<PromotionMEntity> promotionMSByTStaffStaffNo_1;
    private Collection<PromotionMEntity> promotionMSByTStaffStaffNo_2;
    private Collection<PromotionMProductSEntity> promotionMProductSByTStaffStaffNo;
    private Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_3;
    private Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_4;
    private Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_5;
    private Collection<AdvancePaymentEntity> advancePaymentsByTStaffStaffNo;
    private Collection<AdvancePaymentEntity> advancePaymentsByTStaffStaffNo_0;
    private Collection<AgeAnalysisEntity> ageAnalysesByTStaffStaffNo;
    private Collection<AgeAnalysisEntity> ageAnalysesByTStaffStaffNo_0;
    private Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo;
    private Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo_0;
    private Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo_1;
    private Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo;
    private Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo_0;
    private Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo_1;
    private Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo;
    private Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_0;
    private Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_1;
    private Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_2;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo_0;
    private Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo_1;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_0;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_1;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_2;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo_0;
    private Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo_1;
    private Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo;
    private Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_0;
    private Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_1;
    private Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_2;
    private Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo;
    private Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo_0;
    private Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo_1;
    private Collection<BInProductMEntity> bInProductMSByTStaffStaffNo;
    private Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_0;
    private Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_1;
    private Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_2;
    private Collection<BInProductSEntity> bInProductSByTStaffStaffNo;
    private Collection<BInProductSEntity> bInProductSByTStaffStaffNo_0;
    private Collection<BInProductSEntity> bInProductSByTStaffStaffNo_1;
    private Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo;
    private Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_0;
    private Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_1;
    private Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_2;
    private Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo;
    private Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo_0;
    private Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo_1;
    private Collection<BProcureMEntity> bProcureMSByTStaffStaffNo;
    private Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_0;
    private Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_1;
    private Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_2;
    private Collection<BProcureSEntity> bProcureSByTStaffStaffNo;
    private Collection<BProcureSEntity> bProcureSByTStaffStaffNo_0;
    private Collection<BProcureSEntity> bProcureSByTStaffStaffNo_1;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_0;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_1;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_2;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_3;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo_0;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo_1;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_0;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_1;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_2;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_3;
    private Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_4;
    private Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo;
    private Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo_0;
    private Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo_1;
    private Collection<BSConMEntity> bSConMSByTStaffStaffNo;
    private Collection<BSConMEntity> bSConMSByTStaffStaffNo_0;
    private Collection<BSConMEntity> bSConMSByTStaffStaffNo_1;
    private Collection<BSConMEntity> bSConMSByTStaffStaffNo_2;
    private Collection<BSConSEntity> bSConSByTStaffStaffNo;
    private Collection<BSConSEntity> bSConSByTStaffStaffNo_0;
    private Collection<BSConSEntity> bSConSByTStaffStaffNo_1;
    private Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo;
    private Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_0;
    private Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_1;
    private Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_2;
    private Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo;
    private Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo_0;
    private Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo_1;
    private Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo;
    private Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_0;
    private Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_1;
    private Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_2;
    private Collection<BSalesMEntity> bSalesMSByTStaffStaffNo;
    private Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_0;
    private Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_1;
    private Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_2;
    private Collection<BWProcureEntity> bWProcuresByTStaffStaffNo;
    private Collection<BWProcureEntity> bWProcuresByTStaffStaffNo_0;
    private Collection<BankAccountEntity> bankAccountsByTStaffStaffNo;
    private Collection<BankAccountEntity> bankAccountsByTStaffStaffNo_0;
    private Collection<BillTypeEntity> billTypesByTStaffStaffNo;
    private Collection<BillTypeEntity> billTypesByTStaffStaffNo_0;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_0;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_1;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_2;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_0;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_1;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_2;
    private Collection<ClientZoneEntity> clientZonesByTStaffStaffNo;
    private Collection<ClientZoneEntity> clientZonesByTStaffStaffNo_0;
    private Collection<CreditLevelEntity> creditLevelsByTStaffStaffNo;
    private Collection<CreditLevelEntity> creditLevelsByTStaffStaffNo_0;
    private Collection<DeliverymanEntity> deliverymenByTStaffStaffNo;
    private Collection<DeliverymanEntity> deliverymenByTStaffStaffNo_0;
    private Collection<EncodingTypeEntity> encodingTypesByTStaffStaffNo;
    private Collection<EncodingTypeEntity> encodingTypesByTStaffStaffNo_0;
    private Collection<FConMEntity> fConMSByTStaffStaffNo;
    private Collection<FConMEntity> fConMSByTStaffStaffNo_0;
    private Collection<FConMEntity> fConMSByTStaffStaffNo_1;
    private Collection<FConSEntity> fConSByTStaffStaffNo;
    private Collection<FConSEntity> fConSByTStaffStaffNo_0;
    private Collection<FConSEntity> fConSByTStaffStaffNo_1;
    private Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo;
    private Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_0;
    private Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_1;
    private Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_2;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo_0;
    private Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo_1;
    private Collection<FeeClassEntity> feeClassesByTStaffStaffNo;
    private Collection<FeeClassEntity> feeClassesByTStaffStaffNo_0;
    private Collection<PayTypeEntity> payTypesByTStaffStaffNo;
    private Collection<PayTypeEntity> payTypesByTStaffStaffNo_0;
    private Collection<PromotionPropertyEntity> promotionPropertiesByTStaffStaffNo;
    private Collection<PromotionPropertyEntity> promotionPropertiesByTStaffStaffNo_0;
    private Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo;
    private Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_0;
    private Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_1;
    private Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_2;
    private Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_3;
    private Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo;
    private Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo_0;
    private Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo_1;
    private Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo;
    private Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_0;
    private Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_1;
    private Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_2;
    private Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_3;
    private Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo;
    private Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo_0;
    private Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo_1;
    private Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo;
    private Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_0;
    private Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_1;
    private Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_2;
    private Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_3;
    private Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo;
    private Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo_0;
    private Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo_1;
    private Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo;
    private Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_0;
    private Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_1;
    private Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_2;
    private Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_3;
    private Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo;
    private Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo_0;
    private Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo_1;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_0;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_1;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_2;
    private Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_3;
    private Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo;
    private Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo_0;
    private Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo_1;
    private Collection<SalesPropertiesEntity> salesPropertiesByTStaffStaffNo;
    private Collection<SalesPropertiesEntity> salesPropertiesByTStaffStaffNo_0;
    private Collection<SalesmanGroupEntity> salesmanGroupsByTStaffStaffNo;
    private Collection<SalesmanGroupEntity> salesmanGroupsByTStaffStaffNo_0;
    private Collection<StoreLocationEntity> storeLocationsByTStaffStaffNo;
    private Collection<StoreLocationEntity> storeLocationsByTStaffStaffNo_0;
    private Collection<TBrandEntity> tBrandsByTStaffStaffNo;
    private Collection<TBrandEntity> tBrandsByTStaffStaffNo_0;
    private Collection<TCarEntity> tCarsByTStaffStaffNo;
    private Collection<TCarEntity> tCarsByTStaffStaffNo_0;
    private Collection<TClientEntity> tClientsByTStaffStaffNo;
    private Collection<TClientEntity> tClientsByTStaffStaffNo_0;
    private Collection<TClientClassifyEntity> tClientClassifiesByTStaffStaffNo;
    private Collection<TClientClassifyEntity> tClientClassifiesByTStaffStaffNo_0;
    private Collection<TDepartmentEntity> tDepartmentsByTStaffStaffNo;
    private Collection<TDepartmentEntity> tDepartmentsByTStaffStaffNo_0;
    private Collection<TFactorysEntity> tFactorysByTStaffStaffNo;
    private Collection<TFactorysEntity> tFactorysByTStaffStaffNo_0;
    private Collection<TGoodsEntity> tGoodsByTStaffStaffNo;
    private Collection<TGoodsEntity> tGoodsByTStaffStaffNo_0;
    private Collection<TGoodsClassifyEntity> tGoodsClassifiesByTStaffStaffNo;
    private Collection<TGoodsClassifyEntity> tGoodsClassifiesByTStaffStaffNo_0;
    private Collection<TOrgEntity> tOrgsByTStaffStaffNo;
    private Collection<TOrgEntity> tOrgsByTStaffStaffNo_0;
    private Collection<TPaymentEntity> tPaymentsByTStaffStaffNo;
    private Collection<TPaymentEntity> tPaymentsByTStaffStaffNo_0;
    private Collection<TPositionEntity> tPositionsByTStaffStaffNo;
    private Collection<TPositionEntity> tPositionsByTStaffStaffNo_0;
    private Collection<TPresentEntity> tPresentsByTStaffStaffNo;
    private Collection<TPresentEntity> tPresentsByTStaffStaffNo_0;
    private Collection<TRoomEntity> tRoomsByTStaffStaffNo;
    private Collection<TRoomEntity> tRoomsByTStaffStaffNo_0;
    private Collection<TRouteEntity> tRoutesByTStaffStaffNo;
    private Collection<TRouteEntity> tRoutesByTStaffStaffNo_0;
    private Collection<TSalesPromotionEntity> tSalesPromotionsByTStaffStaffNo;
    private Collection<TSalesPromotionEntity> tSalesPromotionsByTStaffStaffNo_0;
    private TOrgEntity tOrgByTStaffGroupNodeId;
    private TDepartmentEntity tDepartmentByTStaffDeptNo;
    private TPositionEntity tPositionByTStaffPotitionNo;
    private TStaffEntity tStaffByTStaffCreateNo;
    private Collection<TStaffEntity> tStaffsByTStaffStaffNo;
    private TStaffEntity tStaffByTStaffModifiNo;
    private Collection<TStaffEntity> tStaffsByTStaffStaffNo_0;
    private Collection<UserGroupEntity> userGroupsByTStaffStaffNo;
    private Collection<UserGroupEntity> userGroupsByTStaffStaffNo_0;

    @Id
    @Column(name = "t_staff_staff_no", nullable = false, length = 8)
    public String gettStaffStaffNo() {
        return tStaffStaffNo;
    }

    public void settStaffStaffNo(String tStaffStaffNo) {
        this.tStaffStaffNo = tStaffStaffNo;
    }

    @Basic
    @Column(name = "t_staff_group_node_id", nullable = true, length = 20)
    public String gettStaffGroupNodeId() {
        return tStaffGroupNodeId;
    }

    public void settStaffGroupNodeId(String tStaffGroupNodeId) {
        this.tStaffGroupNodeId = tStaffGroupNodeId;
    }

    @Basic
    @Column(name = "t_staff_dept_no", nullable = true, length = 4)
    public String gettStaffDeptNo() {
        return tStaffDeptNo;
    }

    public void settStaffDeptNo(String tStaffDeptNo) {
        this.tStaffDeptNo = tStaffDeptNo;
    }

    @Basic
    @Column(name = "t_staff_potition_no", nullable = true, length = 4)
    public String gettStaffPotitionNo() {
        return tStaffPotitionNo;
    }

    public void settStaffPotitionNo(String tStaffPotitionNo) {
        this.tStaffPotitionNo = tStaffPotitionNo;
    }

    @Basic
    @Column(name = "t_staff_staff_name", nullable = false, length = 50)
    public String gettStaffStaffName() {
        return tStaffStaffName;
    }

    public void settStaffStaffName(String tStaffStaffName) {
        this.tStaffStaffName = tStaffStaffName;
    }

    @Basic
    @Column(name = "t_staff_sex", nullable = true, length = 6)
    public String gettStaffSex() {
        return tStaffSex;
    }

    public void settStaffSex(String tStaffSex) {
        this.tStaffSex = tStaffSex;
    }

    @Basic
    @Column(name = "t_staff_ID", nullable = true, length = 20)
    public String gettStaffId() {
        return tStaffId;
    }

    public void settStaffId(String tStaffId) {
        this.tStaffId = tStaffId;
    }

    @Basic
    @Column(name = "t_staff_tel", nullable = false, length = 30)
    public String gettStaffTel() {
        return tStaffTel;
    }

    public void settStaffTel(String tStaffTel) {
        this.tStaffTel = tStaffTel;
    }

    @Basic
    @Column(name = "t_staff_home_address", nullable = true, length = 100)
    public String gettStaffHomeAddress() {
        return tStaffHomeAddress;
    }

    public void settStaffHomeAddress(String tStaffHomeAddress) {
        this.tStaffHomeAddress = tStaffHomeAddress;
    }

    @Basic
    @Column(name = "t_staff_hiredate", nullable = true)
    public Timestamp gettStaffHiredate() {
        return tStaffHiredate;
    }

    public void settStaffHiredate(Timestamp tStaffHiredate) {
        this.tStaffHiredate = tStaffHiredate;
    }

    @Basic
    @Column(name = "t_staff_leavedate", nullable = true)
    public Timestamp gettStaffLeavedate() {
        return tStaffLeavedate;
    }

    public void settStaffLeavedate(Timestamp tStaffLeavedate) {
        this.tStaffLeavedate = tStaffLeavedate;
    }

    @Basic
    @Column(name = "t_staff_password", nullable = false, length = 64)
    public String gettStaffPassword() {
        return tStaffPassword;
    }

    public void settStaffPassword(String tStaffPassword) {
        this.tStaffPassword = tStaffPassword;
    }

    @Basic
    @Column(name = "t_staff_flag", nullable = false, length = 1)
    public String gettStaffFlag() {
        return tStaffFlag;
    }

    public void settStaffFlag(String tStaffFlag) {
        this.tStaffFlag = tStaffFlag;
    }

    @Basic
    @Column(name = "t_staff_remark", nullable = true, length = 100)
    public String gettStaffRemark() {
        return tStaffRemark;
    }

    public void settStaffRemark(String tStaffRemark) {
        this.tStaffRemark = tStaffRemark;
    }

    @Basic
    @Column(name = "t_staff_create_no", nullable = true, length = 8)
    public String gettStaffCreateNo() {
        return tStaffCreateNo;
    }

    public void settStaffCreateNo(String tStaffCreateNo) {
        this.tStaffCreateNo = tStaffCreateNo;
    }

    @Basic
    @Column(name = "t_staff_create_date", nullable = true)
    public Timestamp gettStaffCreateDate() {
        return tStaffCreateDate;
    }

    public void settStaffCreateDate(Timestamp tStaffCreateDate) {
        this.tStaffCreateDate = tStaffCreateDate;
    }

    @Basic
    @Column(name = "t_staff_modifi_no", nullable = true, length = 8)
    public String gettStaffModifiNo() {
        return tStaffModifiNo;
    }

    public void settStaffModifiNo(String tStaffModifiNo) {
        this.tStaffModifiNo = tStaffModifiNo;
    }

    @Basic
    @Column(name = "t_staff_modifi_time", nullable = true)
    public Timestamp gettStaffModifiTime() {
        return tStaffModifiTime;
    }

    public void settStaffModifiTime(Timestamp tStaffModifiTime) {
        this.tStaffModifiTime = tStaffModifiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TStaffEntity that = (TStaffEntity) o;

        if (tStaffStaffNo != null ? !tStaffStaffNo.equals(that.tStaffStaffNo) : that.tStaffStaffNo != null)
            return false;
        if (tStaffGroupNodeId != null ? !tStaffGroupNodeId.equals(that.tStaffGroupNodeId) : that.tStaffGroupNodeId != null)
            return false;
        if (tStaffDeptNo != null ? !tStaffDeptNo.equals(that.tStaffDeptNo) : that.tStaffDeptNo != null) return false;
        if (tStaffPotitionNo != null ? !tStaffPotitionNo.equals(that.tStaffPotitionNo) : that.tStaffPotitionNo != null)
            return false;
        if (tStaffStaffName != null ? !tStaffStaffName.equals(that.tStaffStaffName) : that.tStaffStaffName != null)
            return false;
        if (tStaffSex != null ? !tStaffSex.equals(that.tStaffSex) : that.tStaffSex != null) return false;
        if (tStaffId != null ? !tStaffId.equals(that.tStaffId) : that.tStaffId != null) return false;
        if (tStaffTel != null ? !tStaffTel.equals(that.tStaffTel) : that.tStaffTel != null) return false;
        if (tStaffHomeAddress != null ? !tStaffHomeAddress.equals(that.tStaffHomeAddress) : that.tStaffHomeAddress != null)
            return false;
        if (tStaffHiredate != null ? !tStaffHiredate.equals(that.tStaffHiredate) : that.tStaffHiredate != null)
            return false;
        if (tStaffLeavedate != null ? !tStaffLeavedate.equals(that.tStaffLeavedate) : that.tStaffLeavedate != null)
            return false;
        if (tStaffPassword != null ? !tStaffPassword.equals(that.tStaffPassword) : that.tStaffPassword != null)
            return false;
        if (tStaffFlag != null ? !tStaffFlag.equals(that.tStaffFlag) : that.tStaffFlag != null) return false;
        if (tStaffRemark != null ? !tStaffRemark.equals(that.tStaffRemark) : that.tStaffRemark != null) return false;
        if (tStaffCreateNo != null ? !tStaffCreateNo.equals(that.tStaffCreateNo) : that.tStaffCreateNo != null)
            return false;
        if (tStaffCreateDate != null ? !tStaffCreateDate.equals(that.tStaffCreateDate) : that.tStaffCreateDate != null)
            return false;
        if (tStaffModifiNo != null ? !tStaffModifiNo.equals(that.tStaffModifiNo) : that.tStaffModifiNo != null)
            return false;
        if (tStaffModifiTime != null ? !tStaffModifiTime.equals(that.tStaffModifiTime) : that.tStaffModifiTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tStaffStaffNo != null ? tStaffStaffNo.hashCode() : 0;
        result = 31 * result + (tStaffGroupNodeId != null ? tStaffGroupNodeId.hashCode() : 0);
        result = 31 * result + (tStaffDeptNo != null ? tStaffDeptNo.hashCode() : 0);
        result = 31 * result + (tStaffPotitionNo != null ? tStaffPotitionNo.hashCode() : 0);
        result = 31 * result + (tStaffStaffName != null ? tStaffStaffName.hashCode() : 0);
        result = 31 * result + (tStaffSex != null ? tStaffSex.hashCode() : 0);
        result = 31 * result + (tStaffId != null ? tStaffId.hashCode() : 0);
        result = 31 * result + (tStaffTel != null ? tStaffTel.hashCode() : 0);
        result = 31 * result + (tStaffHomeAddress != null ? tStaffHomeAddress.hashCode() : 0);
        result = 31 * result + (tStaffHiredate != null ? tStaffHiredate.hashCode() : 0);
        result = 31 * result + (tStaffLeavedate != null ? tStaffLeavedate.hashCode() : 0);
        result = 31 * result + (tStaffPassword != null ? tStaffPassword.hashCode() : 0);
        result = 31 * result + (tStaffFlag != null ? tStaffFlag.hashCode() : 0);
        result = 31 * result + (tStaffRemark != null ? tStaffRemark.hashCode() : 0);
        result = 31 * result + (tStaffCreateNo != null ? tStaffCreateNo.hashCode() : 0);
        result = 31 * result + (tStaffCreateDate != null ? tStaffCreateDate.hashCode() : 0);
        result = 31 * result + (tStaffModifiNo != null ? tStaffModifiNo.hashCode() : 0);
        result = 31 * result + (tStaffModifiTime != null ? tStaffModifiTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tStaffByDistributionListCreaterNo")
    public Collection<DistributionListEntity> getDistributionListsByTStaffStaffNo() {
        return distributionListsByTStaffStaffNo;
    }

    public void setDistributionListsByTStaffStaffNo(Collection<DistributionListEntity> distributionListsByTStaffStaffNo) {
        this.distributionListsByTStaffStaffNo = distributionListsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByDistributionListModifiNo")
    public Collection<DistributionListEntity> getDistributionListsByTStaffStaffNo_0() {
        return distributionListsByTStaffStaffNo_0;
    }

    public void setDistributionListsByTStaffStaffNo_0(Collection<DistributionListEntity> distributionListsByTStaffStaffNo_0) {
        this.distributionListsByTStaffStaffNo_0 = distributionListsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByDistributionListChecker")
    public Collection<DistributionListEntity> getDistributionListsByTStaffStaffNo_1() {
        return distributionListsByTStaffStaffNo_1;
    }

    public void setDistributionListsByTStaffStaffNo_1(Collection<DistributionListEntity> distributionListsByTStaffStaffNo_1) {
        this.distributionListsByTStaffStaffNo_1 = distributionListsByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMSalesman")
    public Collection<PromotionMEntity> getPromotionMSByTStaffStaffNo() {
        return promotionMSByTStaffStaffNo;
    }

    public void setPromotionMSByTStaffStaffNo(Collection<PromotionMEntity> promotionMSByTStaffStaffNo) {
        this.promotionMSByTStaffStaffNo = promotionMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMCreateNo")
    public Collection<PromotionMEntity> getPromotionMSByTStaffStaffNo_0() {
        return promotionMSByTStaffStaffNo_0;
    }

    public void setPromotionMSByTStaffStaffNo_0(Collection<PromotionMEntity> promotionMSByTStaffStaffNo_0) {
        this.promotionMSByTStaffStaffNo_0 = promotionMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMModifiNo")
    public Collection<PromotionMEntity> getPromotionMSByTStaffStaffNo_1() {
        return promotionMSByTStaffStaffNo_1;
    }

    public void setPromotionMSByTStaffStaffNo_1(Collection<PromotionMEntity> promotionMSByTStaffStaffNo_1) {
        this.promotionMSByTStaffStaffNo_1 = promotionMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMChecker")
    public Collection<PromotionMEntity> getPromotionMSByTStaffStaffNo_2() {
        return promotionMSByTStaffStaffNo_2;
    }

    public void setPromotionMSByTStaffStaffNo_2(Collection<PromotionMEntity> promotionMSByTStaffStaffNo_2) {
        this.promotionMSByTStaffStaffNo_2 = promotionMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMProductSChecker")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByTStaffStaffNo() {
        return promotionMProductSByTStaffStaffNo;
    }

    public void setPromotionMProductSByTStaffStaffNo(Collection<PromotionMProductSEntity> promotionMProductSByTStaffStaffNo) {
        this.promotionMProductSByTStaffStaffNo = promotionMProductSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMSCreateNo")
    public Collection<PromotionMSEntity> getPromotionMSByTStaffStaffNo_3() {
        return promotionMSByTStaffStaffNo_3;
    }

    public void setPromotionMSByTStaffStaffNo_3(Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_3) {
        this.promotionMSByTStaffStaffNo_3 = promotionMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMSModifiNo")
    public Collection<PromotionMSEntity> getPromotionMSByTStaffStaffNo_4() {
        return promotionMSByTStaffStaffNo_4;
    }

    public void setPromotionMSByTStaffStaffNo_4(Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_4) {
        this.promotionMSByTStaffStaffNo_4 = promotionMSByTStaffStaffNo_4;
    }

    @OneToMany(mappedBy = "tStaffByPromotionMSChecker")
    public Collection<PromotionMSEntity> getPromotionMSByTStaffStaffNo_5() {
        return promotionMSByTStaffStaffNo_5;
    }

    public void setPromotionMSByTStaffStaffNo_5(Collection<PromotionMSEntity> promotionMSByTStaffStaffNo_5) {
        this.promotionMSByTStaffStaffNo_5 = promotionMSByTStaffStaffNo_5;
    }

    @OneToMany(mappedBy = "tStaffByAdvancePaymentTSStaffNo")
    public Collection<AdvancePaymentEntity> getAdvancePaymentsByTStaffStaffNo() {
        return advancePaymentsByTStaffStaffNo;
    }

    public void setAdvancePaymentsByTStaffStaffNo(Collection<AdvancePaymentEntity> advancePaymentsByTStaffStaffNo) {
        this.advancePaymentsByTStaffStaffNo = advancePaymentsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByAdvancePaymentModifiNo")
    public Collection<AdvancePaymentEntity> getAdvancePaymentsByTStaffStaffNo_0() {
        return advancePaymentsByTStaffStaffNo_0;
    }

    public void setAdvancePaymentsByTStaffStaffNo_0(Collection<AdvancePaymentEntity> advancePaymentsByTStaffStaffNo_0) {
        this.advancePaymentsByTStaffStaffNo_0 = advancePaymentsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByAgeAnalysisCreaterNo")
    public Collection<AgeAnalysisEntity> getAgeAnalysesByTStaffStaffNo() {
        return ageAnalysesByTStaffStaffNo;
    }

    public void setAgeAnalysesByTStaffStaffNo(Collection<AgeAnalysisEntity> ageAnalysesByTStaffStaffNo) {
        this.ageAnalysesByTStaffStaffNo = ageAnalysesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByAgeAnalysisModifiNo")
    public Collection<AgeAnalysisEntity> getAgeAnalysesByTStaffStaffNo_0() {
        return ageAnalysesByTStaffStaffNo_0;
    }

    public void setAgeAnalysesByTStaffStaffNo_0(Collection<AgeAnalysisEntity> ageAnalysesByTStaffStaffNo_0) {
        this.ageAnalysesByTStaffStaffNo_0 = ageAnalysesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockMCreaterNo")
    public Collection<BAgentInstockMEntity> getbAgentInstockMSByTStaffStaffNo() {
        return bAgentInstockMSByTStaffStaffNo;
    }

    public void setbAgentInstockMSByTStaffStaffNo(Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo) {
        this.bAgentInstockMSByTStaffStaffNo = bAgentInstockMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockMModifiNo")
    public Collection<BAgentInstockMEntity> getbAgentInstockMSByTStaffStaffNo_0() {
        return bAgentInstockMSByTStaffStaffNo_0;
    }

    public void setbAgentInstockMSByTStaffStaffNo_0(Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo_0) {
        this.bAgentInstockMSByTStaffStaffNo_0 = bAgentInstockMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockMChecker")
    public Collection<BAgentInstockMEntity> getbAgentInstockMSByTStaffStaffNo_1() {
        return bAgentInstockMSByTStaffStaffNo_1;
    }

    public void setbAgentInstockMSByTStaffStaffNo_1(Collection<BAgentInstockMEntity> bAgentInstockMSByTStaffStaffNo_1) {
        this.bAgentInstockMSByTStaffStaffNo_1 = bAgentInstockMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockSCreaterNo")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByTStaffStaffNo() {
        return bAgentInstockSByTStaffStaffNo;
    }

    public void setbAgentInstockSByTStaffStaffNo(Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo) {
        this.bAgentInstockSByTStaffStaffNo = bAgentInstockSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockSModifiNo")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByTStaffStaffNo_0() {
        return bAgentInstockSByTStaffStaffNo_0;
    }

    public void setbAgentInstockSByTStaffStaffNo_0(Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo_0) {
        this.bAgentInstockSByTStaffStaffNo_0 = bAgentInstockSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentInstockSChecker")
    public Collection<BAgentInstockSEntity> getbAgentInstockSByTStaffStaffNo_1() {
        return bAgentInstockSByTStaffStaffNo_1;
    }

    public void setbAgentInstockSByTStaffStaffNo_1(Collection<BAgentInstockSEntity> bAgentInstockSByTStaffStaffNo_1) {
        this.bAgentInstockSByTStaffStaffNo_1 = bAgentInstockSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesMCreaterNo")
    public Collection<BAgentRsalesMEntity> getbAgentRsalesMSByTStaffStaffNo() {
        return bAgentRsalesMSByTStaffStaffNo;
    }

    public void setbAgentRsalesMSByTStaffStaffNo(Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo) {
        this.bAgentRsalesMSByTStaffStaffNo = bAgentRsalesMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesMModifiNo")
    public Collection<BAgentRsalesMEntity> getbAgentRsalesMSByTStaffStaffNo_0() {
        return bAgentRsalesMSByTStaffStaffNo_0;
    }

    public void setbAgentRsalesMSByTStaffStaffNo_0(Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_0) {
        this.bAgentRsalesMSByTStaffStaffNo_0 = bAgentRsalesMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesMChecker")
    public Collection<BAgentRsalesMEntity> getbAgentRsalesMSByTStaffStaffNo_1() {
        return bAgentRsalesMSByTStaffStaffNo_1;
    }

    public void setbAgentRsalesMSByTStaffStaffNo_1(Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_1) {
        this.bAgentRsalesMSByTStaffStaffNo_1 = bAgentRsalesMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesMWarehouseKeeper")
    public Collection<BAgentRsalesMEntity> getbAgentRsalesMSByTStaffStaffNo_2() {
        return bAgentRsalesMSByTStaffStaffNo_2;
    }

    public void setbAgentRsalesMSByTStaffStaffNo_2(Collection<BAgentRsalesMEntity> bAgentRsalesMSByTStaffStaffNo_2) {
        this.bAgentRsalesMSByTStaffStaffNo_2 = bAgentRsalesMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesSCreaterNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByTStaffStaffNo() {
        return bAgentRsalesSESByTStaffStaffNo;
    }

    public void setbAgentRsalesSESByTStaffStaffNo(Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo) {
        this.bAgentRsalesSESByTStaffStaffNo = bAgentRsalesSESByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesSModifiNo")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByTStaffStaffNo_0() {
        return bAgentRsalesSESByTStaffStaffNo_0;
    }

    public void setbAgentRsalesSESByTStaffStaffNo_0(Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo_0) {
        this.bAgentRsalesSESByTStaffStaffNo_0 = bAgentRsalesSESByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentRsalesSChecker")
    public Collection<BAgentRsalesSEntity> getbAgentRsalesSESByTStaffStaffNo_1() {
        return bAgentRsalesSESByTStaffStaffNo_1;
    }

    public void setbAgentRsalesSESByTStaffStaffNo_1(Collection<BAgentRsalesSEntity> bAgentRsalesSESByTStaffStaffNo_1) {
        this.bAgentRsalesSESByTStaffStaffNo_1 = bAgentRsalesSESByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesMSalesman")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTStaffStaffNo() {
        return bAgentSalesMSByTStaffStaffNo;
    }

    public void setbAgentSalesMSByTStaffStaffNo(Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo) {
        this.bAgentSalesMSByTStaffStaffNo = bAgentSalesMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesMCreaterNo")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTStaffStaffNo_0() {
        return bAgentSalesMSByTStaffStaffNo_0;
    }

    public void setbAgentSalesMSByTStaffStaffNo_0(Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_0) {
        this.bAgentSalesMSByTStaffStaffNo_0 = bAgentSalesMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesMModifiNo")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTStaffStaffNo_1() {
        return bAgentSalesMSByTStaffStaffNo_1;
    }

    public void setbAgentSalesMSByTStaffStaffNo_1(Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_1) {
        this.bAgentSalesMSByTStaffStaffNo_1 = bAgentSalesMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesMChecker")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTStaffStaffNo_2() {
        return bAgentSalesMSByTStaffStaffNo_2;
    }

    public void setbAgentSalesMSByTStaffStaffNo_2(Collection<BAgentSalesMEntity> bAgentSalesMSByTStaffStaffNo_2) {
        this.bAgentSalesMSByTStaffStaffNo_2 = bAgentSalesMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesSCreaterNo")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByTStaffStaffNo() {
        return bAgentSalesSESByTStaffStaffNo;
    }

    public void setbAgentSalesSESByTStaffStaffNo(Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo) {
        this.bAgentSalesSESByTStaffStaffNo = bAgentSalesSESByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesSModifiNo")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByTStaffStaffNo_0() {
        return bAgentSalesSESByTStaffStaffNo_0;
    }

    public void setbAgentSalesSESByTStaffStaffNo_0(Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo_0) {
        this.bAgentSalesSESByTStaffStaffNo_0 = bAgentSalesSESByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBAgentSalesSChecker")
    public Collection<BAgentSalesSEntity> getbAgentSalesSESByTStaffStaffNo_1() {
        return bAgentSalesSESByTStaffStaffNo_1;
    }

    public void setbAgentSalesSESByTStaffStaffNo_1(Collection<BAgentSalesSEntity> bAgentSalesSESByTStaffStaffNo_1) {
        this.bAgentSalesSESByTStaffStaffNo_1 = bAgentSalesSESByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentMWarehouseKeeper")
    public Collection<BInPresentMEntity> getbInPresentMSByTStaffStaffNo() {
        return bInPresentMSByTStaffStaffNo;
    }

    public void setbInPresentMSByTStaffStaffNo(Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo) {
        this.bInPresentMSByTStaffStaffNo = bInPresentMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentMCreaterNo")
    public Collection<BInPresentMEntity> getbInPresentMSByTStaffStaffNo_0() {
        return bInPresentMSByTStaffStaffNo_0;
    }

    public void setbInPresentMSByTStaffStaffNo_0(Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_0) {
        this.bInPresentMSByTStaffStaffNo_0 = bInPresentMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentMModifiNo")
    public Collection<BInPresentMEntity> getbInPresentMSByTStaffStaffNo_1() {
        return bInPresentMSByTStaffStaffNo_1;
    }

    public void setbInPresentMSByTStaffStaffNo_1(Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_1) {
        this.bInPresentMSByTStaffStaffNo_1 = bInPresentMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentMChecker")
    public Collection<BInPresentMEntity> getbInPresentMSByTStaffStaffNo_2() {
        return bInPresentMSByTStaffStaffNo_2;
    }

    public void setbInPresentMSByTStaffStaffNo_2(Collection<BInPresentMEntity> bInPresentMSByTStaffStaffNo_2) {
        this.bInPresentMSByTStaffStaffNo_2 = bInPresentMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentSCreaterNo")
    public Collection<BInPresentSEntity> getbInPresentSByTStaffStaffNo() {
        return bInPresentSByTStaffStaffNo;
    }

    public void setbInPresentSByTStaffStaffNo(Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo) {
        this.bInPresentSByTStaffStaffNo = bInPresentSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentSModifiNo")
    public Collection<BInPresentSEntity> getbInPresentSByTStaffStaffNo_0() {
        return bInPresentSByTStaffStaffNo_0;
    }

    public void setbInPresentSByTStaffStaffNo_0(Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo_0) {
        this.bInPresentSByTStaffStaffNo_0 = bInPresentSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBInPresentSChecker")
    public Collection<BInPresentSEntity> getbInPresentSByTStaffStaffNo_1() {
        return bInPresentSByTStaffStaffNo_1;
    }

    public void setbInPresentSByTStaffStaffNo_1(Collection<BInPresentSEntity> bInPresentSByTStaffStaffNo_1) {
        this.bInPresentSByTStaffStaffNo_1 = bInPresentSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBInProductMWarehouseKeeper")
    public Collection<BInProductMEntity> getbInProductMSByTStaffStaffNo() {
        return bInProductMSByTStaffStaffNo;
    }

    public void setbInProductMSByTStaffStaffNo(Collection<BInProductMEntity> bInProductMSByTStaffStaffNo) {
        this.bInProductMSByTStaffStaffNo = bInProductMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBInProductMCreaterNo")
    public Collection<BInProductMEntity> getbInProductMSByTStaffStaffNo_0() {
        return bInProductMSByTStaffStaffNo_0;
    }

    public void setbInProductMSByTStaffStaffNo_0(Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_0) {
        this.bInProductMSByTStaffStaffNo_0 = bInProductMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBInProductMModifiNo")
    public Collection<BInProductMEntity> getbInProductMSByTStaffStaffNo_1() {
        return bInProductMSByTStaffStaffNo_1;
    }

    public void setbInProductMSByTStaffStaffNo_1(Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_1) {
        this.bInProductMSByTStaffStaffNo_1 = bInProductMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBInProductMChecker")
    public Collection<BInProductMEntity> getbInProductMSByTStaffStaffNo_2() {
        return bInProductMSByTStaffStaffNo_2;
    }

    public void setbInProductMSByTStaffStaffNo_2(Collection<BInProductMEntity> bInProductMSByTStaffStaffNo_2) {
        this.bInProductMSByTStaffStaffNo_2 = bInProductMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBInProductSCreaterNo")
    public Collection<BInProductSEntity> getbInProductSByTStaffStaffNo() {
        return bInProductSByTStaffStaffNo;
    }

    public void setbInProductSByTStaffStaffNo(Collection<BInProductSEntity> bInProductSByTStaffStaffNo) {
        this.bInProductSByTStaffStaffNo = bInProductSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBInProductSModifiNo")
    public Collection<BInProductSEntity> getbInProductSByTStaffStaffNo_0() {
        return bInProductSByTStaffStaffNo_0;
    }

    public void setbInProductSByTStaffStaffNo_0(Collection<BInProductSEntity> bInProductSByTStaffStaffNo_0) {
        this.bInProductSByTStaffStaffNo_0 = bInProductSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBInProductSChecker")
    public Collection<BInProductSEntity> getbInProductSByTStaffStaffNo_1() {
        return bInProductSByTStaffStaffNo_1;
    }

    public void setbInProductSByTStaffStaffNo_1(Collection<BInProductSEntity> bInProductSByTStaffStaffNo_1) {
        this.bInProductSByTStaffStaffNo_1 = bInProductSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentMCreateNo")
    public Collection<BOutPresentMEntity> getbOutPresentMSByTStaffStaffNo() {
        return bOutPresentMSByTStaffStaffNo;
    }

    public void setbOutPresentMSByTStaffStaffNo(Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo) {
        this.bOutPresentMSByTStaffStaffNo = bOutPresentMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentMModifiNo")
    public Collection<BOutPresentMEntity> getbOutPresentMSByTStaffStaffNo_0() {
        return bOutPresentMSByTStaffStaffNo_0;
    }

    public void setbOutPresentMSByTStaffStaffNo_0(Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_0) {
        this.bOutPresentMSByTStaffStaffNo_0 = bOutPresentMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentMChecker")
    public Collection<BOutPresentMEntity> getbOutPresentMSByTStaffStaffNo_1() {
        return bOutPresentMSByTStaffStaffNo_1;
    }

    public void setbOutPresentMSByTStaffStaffNo_1(Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_1) {
        this.bOutPresentMSByTStaffStaffNo_1 = bOutPresentMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentMWarehouseKeeper")
    public Collection<BOutPresentMEntity> getbOutPresentMSByTStaffStaffNo_2() {
        return bOutPresentMSByTStaffStaffNo_2;
    }

    public void setbOutPresentMSByTStaffStaffNo_2(Collection<BOutPresentMEntity> bOutPresentMSByTStaffStaffNo_2) {
        this.bOutPresentMSByTStaffStaffNo_2 = bOutPresentMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentSCreateNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByTStaffStaffNo() {
        return bOutPresentSByTStaffStaffNo;
    }

    public void setbOutPresentSByTStaffStaffNo(Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo) {
        this.bOutPresentSByTStaffStaffNo = bOutPresentSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentSModifiNo")
    public Collection<BOutPresentSEntity> getbOutPresentSByTStaffStaffNo_0() {
        return bOutPresentSByTStaffStaffNo_0;
    }

    public void setbOutPresentSByTStaffStaffNo_0(Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo_0) {
        this.bOutPresentSByTStaffStaffNo_0 = bOutPresentSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBOutPresentSChecker")
    public Collection<BOutPresentSEntity> getbOutPresentSByTStaffStaffNo_1() {
        return bOutPresentSByTStaffStaffNo_1;
    }

    public void setbOutPresentSByTStaffStaffNo_1(Collection<BOutPresentSEntity> bOutPresentSByTStaffStaffNo_1) {
        this.bOutPresentSByTStaffStaffNo_1 = bOutPresentSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBProcureMWarehouseKep")
    public Collection<BProcureMEntity> getbProcureMSByTStaffStaffNo() {
        return bProcureMSByTStaffStaffNo;
    }

    public void setbProcureMSByTStaffStaffNo(Collection<BProcureMEntity> bProcureMSByTStaffStaffNo) {
        this.bProcureMSByTStaffStaffNo = bProcureMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBProcureMCreateNo")
    public Collection<BProcureMEntity> getbProcureMSByTStaffStaffNo_0() {
        return bProcureMSByTStaffStaffNo_0;
    }

    public void setbProcureMSByTStaffStaffNo_0(Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_0) {
        this.bProcureMSByTStaffStaffNo_0 = bProcureMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBProcureMModifiNo")
    public Collection<BProcureMEntity> getbProcureMSByTStaffStaffNo_1() {
        return bProcureMSByTStaffStaffNo_1;
    }

    public void setbProcureMSByTStaffStaffNo_1(Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_1) {
        this.bProcureMSByTStaffStaffNo_1 = bProcureMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBProcureMChecker")
    public Collection<BProcureMEntity> getbProcureMSByTStaffStaffNo_2() {
        return bProcureMSByTStaffStaffNo_2;
    }

    public void setbProcureMSByTStaffStaffNo_2(Collection<BProcureMEntity> bProcureMSByTStaffStaffNo_2) {
        this.bProcureMSByTStaffStaffNo_2 = bProcureMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBProcureSModifiNo")
    public Collection<BProcureSEntity> getbProcureSByTStaffStaffNo() {
        return bProcureSByTStaffStaffNo;
    }

    public void setbProcureSByTStaffStaffNo(Collection<BProcureSEntity> bProcureSByTStaffStaffNo) {
        this.bProcureSByTStaffStaffNo = bProcureSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBProcureSCreateNo")
    public Collection<BProcureSEntity> getbProcureSByTStaffStaffNo_0() {
        return bProcureSByTStaffStaffNo_0;
    }

    public void setbProcureSByTStaffStaffNo_0(Collection<BProcureSEntity> bProcureSByTStaffStaffNo_0) {
        this.bProcureSByTStaffStaffNo_0 = bProcureSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBProcureSChecker")
    public Collection<BProcureSEntity> getbProcureSByTStaffStaffNo_1() {
        return bProcureSByTStaffStaffNo_1;
    }

    public void setbProcureSByTStaffStaffNo_1(Collection<BProcureSEntity> bProcureSByTStaffStaffNo_1) {
        this.bProcureSByTStaffStaffNo_1 = bProcureSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdMSalesman")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTStaffStaffNo() {
        return bPurchaseOrdMSByTStaffStaffNo;
    }

    public void setbPurchaseOrdMSByTStaffStaffNo(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo) {
        this.bPurchaseOrdMSByTStaffStaffNo = bPurchaseOrdMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdMCreateNo")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTStaffStaffNo_0() {
        return bPurchaseOrdMSByTStaffStaffNo_0;
    }

    public void setbPurchaseOrdMSByTStaffStaffNo_0(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_0) {
        this.bPurchaseOrdMSByTStaffStaffNo_0 = bPurchaseOrdMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdMModifiNo")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTStaffStaffNo_1() {
        return bPurchaseOrdMSByTStaffStaffNo_1;
    }

    public void setbPurchaseOrdMSByTStaffStaffNo_1(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_1) {
        this.bPurchaseOrdMSByTStaffStaffNo_1 = bPurchaseOrdMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdMChecker")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTStaffStaffNo_2() {
        return bPurchaseOrdMSByTStaffStaffNo_2;
    }

    public void setbPurchaseOrdMSByTStaffStaffNo_2(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_2) {
        this.bPurchaseOrdMSByTStaffStaffNo_2 = bPurchaseOrdMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdMManagerNo")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTStaffStaffNo_3() {
        return bPurchaseOrdMSByTStaffStaffNo_3;
    }

    public void setbPurchaseOrdMSByTStaffStaffNo_3(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTStaffStaffNo_3) {
        this.bPurchaseOrdMSByTStaffStaffNo_3 = bPurchaseOrdMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdSCreateNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTStaffStaffNo() {
        return bPurchaseOrdSByTStaffStaffNo;
    }

    public void setbPurchaseOrdSByTStaffStaffNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo) {
        this.bPurchaseOrdSByTStaffStaffNo = bPurchaseOrdSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdSModifiNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTStaffStaffNo_0() {
        return bPurchaseOrdSByTStaffStaffNo_0;
    }

    public void setbPurchaseOrdSByTStaffStaffNo_0(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo_0) {
        this.bPurchaseOrdSByTStaffStaffNo_0 = bPurchaseOrdSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBPurchaseOrdSChecker")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByTStaffStaffNo_1() {
        return bPurchaseOrdSByTStaffStaffNo_1;
    }

    public void setbPurchaseOrdSByTStaffStaffNo_1(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByTStaffStaffNo_1) {
        this.bPurchaseOrdSByTStaffStaffNo_1 = bPurchaseOrdSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMSalesman")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo() {
        return bRProcureMSByTStaffStaffNo;
    }

    public void setbRProcureMSByTStaffStaffNo(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo) {
        this.bRProcureMSByTStaffStaffNo = bRProcureMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMWarehouseKeeper")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo_0() {
        return bRProcureMSByTStaffStaffNo_0;
    }

    public void setbRProcureMSByTStaffStaffNo_0(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_0) {
        this.bRProcureMSByTStaffStaffNo_0 = bRProcureMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMDeliverymanNo")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo_1() {
        return bRProcureMSByTStaffStaffNo_1;
    }

    public void setbRProcureMSByTStaffStaffNo_1(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_1) {
        this.bRProcureMSByTStaffStaffNo_1 = bRProcureMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMCreateNo")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo_2() {
        return bRProcureMSByTStaffStaffNo_2;
    }

    public void setbRProcureMSByTStaffStaffNo_2(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_2) {
        this.bRProcureMSByTStaffStaffNo_2 = bRProcureMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMModifiNo")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo_3() {
        return bRProcureMSByTStaffStaffNo_3;
    }

    public void setbRProcureMSByTStaffStaffNo_3(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_3) {
        this.bRProcureMSByTStaffStaffNo_3 = bRProcureMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureMChecker")
    public Collection<BRProcureMEntity> getbRProcureMSByTStaffStaffNo_4() {
        return bRProcureMSByTStaffStaffNo_4;
    }

    public void setbRProcureMSByTStaffStaffNo_4(Collection<BRProcureMEntity> bRProcureMSByTStaffStaffNo_4) {
        this.bRProcureMSByTStaffStaffNo_4 = bRProcureMSByTStaffStaffNo_4;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureSCreateNo")
    public Collection<BRProcureSEntity> getbRProcureSByTStaffStaffNo() {
        return bRProcureSByTStaffStaffNo;
    }

    public void setbRProcureSByTStaffStaffNo(Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo) {
        this.bRProcureSByTStaffStaffNo = bRProcureSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureSModifiNo")
    public Collection<BRProcureSEntity> getbRProcureSByTStaffStaffNo_0() {
        return bRProcureSByTStaffStaffNo_0;
    }

    public void setbRProcureSByTStaffStaffNo_0(Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo_0) {
        this.bRProcureSByTStaffStaffNo_0 = bRProcureSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBRProcureSChecker")
    public Collection<BRProcureSEntity> getbRProcureSByTStaffStaffNo_1() {
        return bRProcureSByTStaffStaffNo_1;
    }

    public void setbRProcureSByTStaffStaffNo_1(Collection<BRProcureSEntity> bRProcureSByTStaffStaffNo_1) {
        this.bRProcureSByTStaffStaffNo_1 = bRProcureSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSConMSalesman")
    public Collection<BSConMEntity> getbSConMSByTStaffStaffNo() {
        return bSConMSByTStaffStaffNo;
    }

    public void setbSConMSByTStaffStaffNo(Collection<BSConMEntity> bSConMSByTStaffStaffNo) {
        this.bSConMSByTStaffStaffNo = bSConMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSConMCreateNo")
    public Collection<BSConMEntity> getbSConMSByTStaffStaffNo_0() {
        return bSConMSByTStaffStaffNo_0;
    }

    public void setbSConMSByTStaffStaffNo_0(Collection<BSConMEntity> bSConMSByTStaffStaffNo_0) {
        this.bSConMSByTStaffStaffNo_0 = bSConMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSConMModifiNo")
    public Collection<BSConMEntity> getbSConMSByTStaffStaffNo_1() {
        return bSConMSByTStaffStaffNo_1;
    }

    public void setbSConMSByTStaffStaffNo_1(Collection<BSConMEntity> bSConMSByTStaffStaffNo_1) {
        this.bSConMSByTStaffStaffNo_1 = bSConMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSConMChecker")
    public Collection<BSConMEntity> getbSConMSByTStaffStaffNo_2() {
        return bSConMSByTStaffStaffNo_2;
    }

    public void setbSConMSByTStaffStaffNo_2(Collection<BSConMEntity> bSConMSByTStaffStaffNo_2) {
        this.bSConMSByTStaffStaffNo_2 = bSConMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBSConSCreateNo")
    public Collection<BSConSEntity> getbSConSByTStaffStaffNo() {
        return bSConSByTStaffStaffNo;
    }

    public void setbSConSByTStaffStaffNo(Collection<BSConSEntity> bSConSByTStaffStaffNo) {
        this.bSConSByTStaffStaffNo = bSConSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSConSModifiNo")
    public Collection<BSConSEntity> getbSConSByTStaffStaffNo_0() {
        return bSConSByTStaffStaffNo_0;
    }

    public void setbSConSByTStaffStaffNo_0(Collection<BSConSEntity> bSConSByTStaffStaffNo_0) {
        this.bSConSByTStaffStaffNo_0 = bSConSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSConSChecker")
    public Collection<BSConSEntity> getbSConSByTStaffStaffNo_1() {
        return bSConSByTStaffStaffNo_1;
    }

    public void setbSConSByTStaffStaffNo_1(Collection<BSConSEntity> bSConSByTStaffStaffNo_1) {
        this.bSConSByTStaffStaffNo_1 = bSConSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderMSalesman")
    public Collection<BSOrderMEntity> getbSOrderMSByTStaffStaffNo() {
        return bSOrderMSByTStaffStaffNo;
    }

    public void setbSOrderMSByTStaffStaffNo(Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo) {
        this.bSOrderMSByTStaffStaffNo = bSOrderMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderMChecker")
    public Collection<BSOrderMEntity> getbSOrderMSByTStaffStaffNo_0() {
        return bSOrderMSByTStaffStaffNo_0;
    }

    public void setbSOrderMSByTStaffStaffNo_0(Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_0) {
        this.bSOrderMSByTStaffStaffNo_0 = bSOrderMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderMModifiNo")
    public Collection<BSOrderMEntity> getbSOrderMSByTStaffStaffNo_1() {
        return bSOrderMSByTStaffStaffNo_1;
    }

    public void setbSOrderMSByTStaffStaffNo_1(Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_1) {
        this.bSOrderMSByTStaffStaffNo_1 = bSOrderMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderMCreateNo")
    public Collection<BSOrderMEntity> getbSOrderMSByTStaffStaffNo_2() {
        return bSOrderMSByTStaffStaffNo_2;
    }

    public void setbSOrderMSByTStaffStaffNo_2(Collection<BSOrderMEntity> bSOrderMSByTStaffStaffNo_2) {
        this.bSOrderMSByTStaffStaffNo_2 = bSOrderMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderSCreateNo")
    public Collection<BSOrderSEntity> getbSOrderSByTStaffStaffNo() {
        return bSOrderSByTStaffStaffNo;
    }

    public void setbSOrderSByTStaffStaffNo(Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo) {
        this.bSOrderSByTStaffStaffNo = bSOrderSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderSModifiNo")
    public Collection<BSOrderSEntity> getbSOrderSByTStaffStaffNo_0() {
        return bSOrderSByTStaffStaffNo_0;
    }

    public void setbSOrderSByTStaffStaffNo_0(Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo_0) {
        this.bSOrderSByTStaffStaffNo_0 = bSOrderSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSOrderSChecker")
    public Collection<BSOrderSEntity> getbSOrderSByTStaffStaffNo_1() {
        return bSOrderSByTStaffStaffNo_1;
    }

    public void setbSOrderSByTStaffStaffNo_1(Collection<BSOrderSEntity> bSOrderSByTStaffStaffNo_1) {
        this.bSOrderSByTStaffStaffNo_1 = bSOrderSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSProcureMSalesman")
    public Collection<BSProcureMEntity> getbSProcureMSByTStaffStaffNo() {
        return bSProcureMSByTStaffStaffNo;
    }

    public void setbSProcureMSByTStaffStaffNo(Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo) {
        this.bSProcureMSByTStaffStaffNo = bSProcureMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSProcureMCreateNo")
    public Collection<BSProcureMEntity> getbSProcureMSByTStaffStaffNo_0() {
        return bSProcureMSByTStaffStaffNo_0;
    }

    public void setbSProcureMSByTStaffStaffNo_0(Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_0) {
        this.bSProcureMSByTStaffStaffNo_0 = bSProcureMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSProcureMModifiNo")
    public Collection<BSProcureMEntity> getbSProcureMSByTStaffStaffNo_1() {
        return bSProcureMSByTStaffStaffNo_1;
    }

    public void setbSProcureMSByTStaffStaffNo_1(Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_1) {
        this.bSProcureMSByTStaffStaffNo_1 = bSProcureMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSProcureMChecker")
    public Collection<BSProcureMEntity> getbSProcureMSByTStaffStaffNo_2() {
        return bSProcureMSByTStaffStaffNo_2;
    }

    public void setbSProcureMSByTStaffStaffNo_2(Collection<BSProcureMEntity> bSProcureMSByTStaffStaffNo_2) {
        this.bSProcureMSByTStaffStaffNo_2 = bSProcureMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBSalesMCreateNo")
    public Collection<BSalesMEntity> getbSalesMSByTStaffStaffNo() {
        return bSalesMSByTStaffStaffNo;
    }

    public void setbSalesMSByTStaffStaffNo(Collection<BSalesMEntity> bSalesMSByTStaffStaffNo) {
        this.bSalesMSByTStaffStaffNo = bSalesMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBSalesMModifiNo")
    public Collection<BSalesMEntity> getbSalesMSByTStaffStaffNo_0() {
        return bSalesMSByTStaffStaffNo_0;
    }

    public void setbSalesMSByTStaffStaffNo_0(Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_0) {
        this.bSalesMSByTStaffStaffNo_0 = bSalesMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBSalesMChecker")
    public Collection<BSalesMEntity> getbSalesMSByTStaffStaffNo_1() {
        return bSalesMSByTStaffStaffNo_1;
    }

    public void setbSalesMSByTStaffStaffNo_1(Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_1) {
        this.bSalesMSByTStaffStaffNo_1 = bSalesMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByBSalesMSalesman")
    public Collection<BSalesMEntity> getbSalesMSByTStaffStaffNo_2() {
        return bSalesMSByTStaffStaffNo_2;
    }

    public void setbSalesMSByTStaffStaffNo_2(Collection<BSalesMEntity> bSalesMSByTStaffStaffNo_2) {
        this.bSalesMSByTStaffStaffNo_2 = bSalesMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByBWProcureCreateNo")
    public Collection<BWProcureEntity> getbWProcuresByTStaffStaffNo() {
        return bWProcuresByTStaffStaffNo;
    }

    public void setbWProcuresByTStaffStaffNo(Collection<BWProcureEntity> bWProcuresByTStaffStaffNo) {
        this.bWProcuresByTStaffStaffNo = bWProcuresByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBWProcureModifiNo")
    public Collection<BWProcureEntity> getbWProcuresByTStaffStaffNo_0() {
        return bWProcuresByTStaffStaffNo_0;
    }

    public void setbWProcuresByTStaffStaffNo_0(Collection<BWProcureEntity> bWProcuresByTStaffStaffNo_0) {
        this.bWProcuresByTStaffStaffNo_0 = bWProcuresByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBankAccountCreaterNo")
    public Collection<BankAccountEntity> getBankAccountsByTStaffStaffNo() {
        return bankAccountsByTStaffStaffNo;
    }

    public void setBankAccountsByTStaffStaffNo(Collection<BankAccountEntity> bankAccountsByTStaffStaffNo) {
        this.bankAccountsByTStaffStaffNo = bankAccountsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBankAccountModifiNo")
    public Collection<BankAccountEntity> getBankAccountsByTStaffStaffNo_0() {
        return bankAccountsByTStaffStaffNo_0;
    }

    public void setBankAccountsByTStaffStaffNo_0(Collection<BankAccountEntity> bankAccountsByTStaffStaffNo_0) {
        this.bankAccountsByTStaffStaffNo_0 = bankAccountsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByBillTypeCreaterNo")
    public Collection<BillTypeEntity> getBillTypesByTStaffStaffNo() {
        return billTypesByTStaffStaffNo;
    }

    public void setBillTypesByTStaffStaffNo(Collection<BillTypeEntity> billTypesByTStaffStaffNo) {
        this.billTypesByTStaffStaffNo = billTypesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByBillTypeModifiNo")
    public Collection<BillTypeEntity> getBillTypesByTStaffStaffNo_0() {
        return billTypesByTStaffStaffNo_0;
    }

    public void setBillTypesByTStaffStaffNo_0(Collection<BillTypeEntity> billTypesByTStaffStaffNo_0) {
        this.billTypesByTStaffStaffNo_0 = billTypesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConMSalesman")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTStaffStaffNo() {
        return cPurchaseConMSByTStaffStaffNo;
    }

    public void setcPurchaseConMSByTStaffStaffNo(Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo) {
        this.cPurchaseConMSByTStaffStaffNo = cPurchaseConMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConMCreateNo")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTStaffStaffNo_0() {
        return cPurchaseConMSByTStaffStaffNo_0;
    }

    public void setcPurchaseConMSByTStaffStaffNo_0(Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_0) {
        this.cPurchaseConMSByTStaffStaffNo_0 = cPurchaseConMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConMModifiNo")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTStaffStaffNo_1() {
        return cPurchaseConMSByTStaffStaffNo_1;
    }

    public void setcPurchaseConMSByTStaffStaffNo_1(Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_1) {
        this.cPurchaseConMSByTStaffStaffNo_1 = cPurchaseConMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConMChecker")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTStaffStaffNo_2() {
        return cPurchaseConMSByTStaffStaffNo_2;
    }

    public void setcPurchaseConMSByTStaffStaffNo_2(Collection<CPurchaseConMEntity> cPurchaseConMSByTStaffStaffNo_2) {
        this.cPurchaseConMSByTStaffStaffNo_2 = cPurchaseConMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConSManagerNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTStaffStaffNo() {
        return cPurchaseConSByTStaffStaffNo;
    }

    public void setcPurchaseConSByTStaffStaffNo(Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo) {
        this.cPurchaseConSByTStaffStaffNo = cPurchaseConSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConSCreateNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTStaffStaffNo_0() {
        return cPurchaseConSByTStaffStaffNo_0;
    }

    public void setcPurchaseConSByTStaffStaffNo_0(Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_0) {
        this.cPurchaseConSByTStaffStaffNo_0 = cPurchaseConSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConSModifiNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTStaffStaffNo_1() {
        return cPurchaseConSByTStaffStaffNo_1;
    }

    public void setcPurchaseConSByTStaffStaffNo_1(Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_1) {
        this.cPurchaseConSByTStaffStaffNo_1 = cPurchaseConSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByCPurchaseConSChecker")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTStaffStaffNo_2() {
        return cPurchaseConSByTStaffStaffNo_2;
    }

    public void setcPurchaseConSByTStaffStaffNo_2(Collection<CPurchaseConSEntity> cPurchaseConSByTStaffStaffNo_2) {
        this.cPurchaseConSByTStaffStaffNo_2 = cPurchaseConSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByClientZoneCreateNo")
    public Collection<ClientZoneEntity> getClientZonesByTStaffStaffNo() {
        return clientZonesByTStaffStaffNo;
    }

    public void setClientZonesByTStaffStaffNo(Collection<ClientZoneEntity> clientZonesByTStaffStaffNo) {
        this.clientZonesByTStaffStaffNo = clientZonesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByClientZoneModifiNo")
    public Collection<ClientZoneEntity> getClientZonesByTStaffStaffNo_0() {
        return clientZonesByTStaffStaffNo_0;
    }

    public void setClientZonesByTStaffStaffNo_0(Collection<ClientZoneEntity> clientZonesByTStaffStaffNo_0) {
        this.clientZonesByTStaffStaffNo_0 = clientZonesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByCreditLevelCreaterNo")
    public Collection<CreditLevelEntity> getCreditLevelsByTStaffStaffNo() {
        return creditLevelsByTStaffStaffNo;
    }

    public void setCreditLevelsByTStaffStaffNo(Collection<CreditLevelEntity> creditLevelsByTStaffStaffNo) {
        this.creditLevelsByTStaffStaffNo = creditLevelsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByCreditLevelModifiNo")
    public Collection<CreditLevelEntity> getCreditLevelsByTStaffStaffNo_0() {
        return creditLevelsByTStaffStaffNo_0;
    }

    public void setCreditLevelsByTStaffStaffNo_0(Collection<CreditLevelEntity> creditLevelsByTStaffStaffNo_0) {
        this.creditLevelsByTStaffStaffNo_0 = creditLevelsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByDeliverymanCreateNo")
    public Collection<DeliverymanEntity> getDeliverymenByTStaffStaffNo() {
        return deliverymenByTStaffStaffNo;
    }

    public void setDeliverymenByTStaffStaffNo(Collection<DeliverymanEntity> deliverymenByTStaffStaffNo) {
        this.deliverymenByTStaffStaffNo = deliverymenByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByDeliverymanModifiNo")
    public Collection<DeliverymanEntity> getDeliverymenByTStaffStaffNo_0() {
        return deliverymenByTStaffStaffNo_0;
    }

    public void setDeliverymenByTStaffStaffNo_0(Collection<DeliverymanEntity> deliverymenByTStaffStaffNo_0) {
        this.deliverymenByTStaffStaffNo_0 = deliverymenByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByEncodingTypeCreaterNo")
    public Collection<EncodingTypeEntity> getEncodingTypesByTStaffStaffNo() {
        return encodingTypesByTStaffStaffNo;
    }

    public void setEncodingTypesByTStaffStaffNo(Collection<EncodingTypeEntity> encodingTypesByTStaffStaffNo) {
        this.encodingTypesByTStaffStaffNo = encodingTypesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByEncodingTypeModifiNo")
    public Collection<EncodingTypeEntity> getEncodingTypesByTStaffStaffNo_0() {
        return encodingTypesByTStaffStaffNo_0;
    }

    public void setEncodingTypesByTStaffStaffNo_0(Collection<EncodingTypeEntity> encodingTypesByTStaffStaffNo_0) {
        this.encodingTypesByTStaffStaffNo_0 = encodingTypesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByFConMCreateNo")
    public Collection<FConMEntity> getfConMSByTStaffStaffNo() {
        return fConMSByTStaffStaffNo;
    }

    public void setfConMSByTStaffStaffNo(Collection<FConMEntity> fConMSByTStaffStaffNo) {
        this.fConMSByTStaffStaffNo = fConMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByFConMModifiNo")
    public Collection<FConMEntity> getfConMSByTStaffStaffNo_0() {
        return fConMSByTStaffStaffNo_0;
    }

    public void setfConMSByTStaffStaffNo_0(Collection<FConMEntity> fConMSByTStaffStaffNo_0) {
        this.fConMSByTStaffStaffNo_0 = fConMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByFConMChecker")
    public Collection<FConMEntity> getfConMSByTStaffStaffNo_1() {
        return fConMSByTStaffStaffNo_1;
    }

    public void setfConMSByTStaffStaffNo_1(Collection<FConMEntity> fConMSByTStaffStaffNo_1) {
        this.fConMSByTStaffStaffNo_1 = fConMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByFConSCreateNo")
    public Collection<FConSEntity> getfConSByTStaffStaffNo() {
        return fConSByTStaffStaffNo;
    }

    public void setfConSByTStaffStaffNo(Collection<FConSEntity> fConSByTStaffStaffNo) {
        this.fConSByTStaffStaffNo = fConSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByFConSModifiNo")
    public Collection<FConSEntity> getfConSByTStaffStaffNo_0() {
        return fConSByTStaffStaffNo_0;
    }

    public void setfConSByTStaffStaffNo_0(Collection<FConSEntity> fConSByTStaffStaffNo_0) {
        this.fConSByTStaffStaffNo_0 = fConSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByFConSChecker")
    public Collection<FConSEntity> getfConSByTStaffStaffNo_1() {
        return fConSByTStaffStaffNo_1;
    }

    public void setfConSByTStaffStaffNo_1(Collection<FConSEntity> fConSByTStaffStaffNo_1) {
        this.fConSByTStaffStaffNo_1 = fConSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusMWarehouseKeeper")
    public Collection<FStockAdjusMEntity> getfStockAdjusMSByTStaffStaffNo() {
        return fStockAdjusMSByTStaffStaffNo;
    }

    public void setfStockAdjusMSByTStaffStaffNo(Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo) {
        this.fStockAdjusMSByTStaffStaffNo = fStockAdjusMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusMCreaterNo")
    public Collection<FStockAdjusMEntity> getfStockAdjusMSByTStaffStaffNo_0() {
        return fStockAdjusMSByTStaffStaffNo_0;
    }

    public void setfStockAdjusMSByTStaffStaffNo_0(Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_0) {
        this.fStockAdjusMSByTStaffStaffNo_0 = fStockAdjusMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusMModifiNo")
    public Collection<FStockAdjusMEntity> getfStockAdjusMSByTStaffStaffNo_1() {
        return fStockAdjusMSByTStaffStaffNo_1;
    }

    public void setfStockAdjusMSByTStaffStaffNo_1(Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_1) {
        this.fStockAdjusMSByTStaffStaffNo_1 = fStockAdjusMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusMChecker")
    public Collection<FStockAdjusMEntity> getfStockAdjusMSByTStaffStaffNo_2() {
        return fStockAdjusMSByTStaffStaffNo_2;
    }

    public void setfStockAdjusMSByTStaffStaffNo_2(Collection<FStockAdjusMEntity> fStockAdjusMSByTStaffStaffNo_2) {
        this.fStockAdjusMSByTStaffStaffNo_2 = fStockAdjusMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusSCreaterNo")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByTStaffStaffNo() {
        return fStockAdjusSESByTStaffStaffNo;
    }

    public void setfStockAdjusSESByTStaffStaffNo(Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo) {
        this.fStockAdjusSESByTStaffStaffNo = fStockAdjusSESByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusSModifiNo")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByTStaffStaffNo_0() {
        return fStockAdjusSESByTStaffStaffNo_0;
    }

    public void setfStockAdjusSESByTStaffStaffNo_0(Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo_0) {
        this.fStockAdjusSESByTStaffStaffNo_0 = fStockAdjusSESByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByFStockAdjusSChecker")
    public Collection<FStockAdjusSEntity> getfStockAdjusSESByTStaffStaffNo_1() {
        return fStockAdjusSESByTStaffStaffNo_1;
    }

    public void setfStockAdjusSESByTStaffStaffNo_1(Collection<FStockAdjusSEntity> fStockAdjusSESByTStaffStaffNo_1) {
        this.fStockAdjusSESByTStaffStaffNo_1 = fStockAdjusSESByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffByFeeClassCreateNo")
    public Collection<FeeClassEntity> getFeeClassesByTStaffStaffNo() {
        return feeClassesByTStaffStaffNo;
    }

    public void setFeeClassesByTStaffStaffNo(Collection<FeeClassEntity> feeClassesByTStaffStaffNo) {
        this.feeClassesByTStaffStaffNo = feeClassesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByFeeClassModifiNo")
    public Collection<FeeClassEntity> getFeeClassesByTStaffStaffNo_0() {
        return feeClassesByTStaffStaffNo_0;
    }

    public void setFeeClassesByTStaffStaffNo_0(Collection<FeeClassEntity> feeClassesByTStaffStaffNo_0) {
        this.feeClassesByTStaffStaffNo_0 = feeClassesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByPayTypeCreaterNo")
    public Collection<PayTypeEntity> getPayTypesByTStaffStaffNo() {
        return payTypesByTStaffStaffNo;
    }

    public void setPayTypesByTStaffStaffNo(Collection<PayTypeEntity> payTypesByTStaffStaffNo) {
        this.payTypesByTStaffStaffNo = payTypesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByPayTypeModifiNo")
    public Collection<PayTypeEntity> getPayTypesByTStaffStaffNo_0() {
        return payTypesByTStaffStaffNo_0;
    }

    public void setPayTypesByTStaffStaffNo_0(Collection<PayTypeEntity> payTypesByTStaffStaffNo_0) {
        this.payTypesByTStaffStaffNo_0 = payTypesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByPromotionPropertyCreateNo")
    public Collection<PromotionPropertyEntity> getPromotionPropertiesByTStaffStaffNo() {
        return promotionPropertiesByTStaffStaffNo;
    }

    public void setPromotionPropertiesByTStaffStaffNo(Collection<PromotionPropertyEntity> promotionPropertiesByTStaffStaffNo) {
        this.promotionPropertiesByTStaffStaffNo = promotionPropertiesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByPromotionPropertyModifiNo")
    public Collection<PromotionPropertyEntity> getPromotionPropertiesByTStaffStaffNo_0() {
        return promotionPropertiesByTStaffStaffNo_0;
    }

    public void setPromotionPropertiesByTStaffStaffNo_0(Collection<PromotionPropertyEntity> promotionPropertiesByTStaffStaffNo_0) {
        this.promotionPropertiesByTStaffStaffNo_0 = promotionPropertiesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageMWarehouseKeeper")
    public Collection<SBreakageMEntity> getsBreakageMSByTStaffStaffNo() {
        return sBreakageMSByTStaffStaffNo;
    }

    public void setsBreakageMSByTStaffStaffNo(Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo) {
        this.sBreakageMSByTStaffStaffNo = sBreakageMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageMSalesman")
    public Collection<SBreakageMEntity> getsBreakageMSByTStaffStaffNo_0() {
        return sBreakageMSByTStaffStaffNo_0;
    }

    public void setsBreakageMSByTStaffStaffNo_0(Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_0) {
        this.sBreakageMSByTStaffStaffNo_0 = sBreakageMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageMCreaterNo")
    public Collection<SBreakageMEntity> getsBreakageMSByTStaffStaffNo_1() {
        return sBreakageMSByTStaffStaffNo_1;
    }

    public void setsBreakageMSByTStaffStaffNo_1(Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_1) {
        this.sBreakageMSByTStaffStaffNo_1 = sBreakageMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageMModifiNo")
    public Collection<SBreakageMEntity> getsBreakageMSByTStaffStaffNo_2() {
        return sBreakageMSByTStaffStaffNo_2;
    }

    public void setsBreakageMSByTStaffStaffNo_2(Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_2) {
        this.sBreakageMSByTStaffStaffNo_2 = sBreakageMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageMChecker")
    public Collection<SBreakageMEntity> getsBreakageMSByTStaffStaffNo_3() {
        return sBreakageMSByTStaffStaffNo_3;
    }

    public void setsBreakageMSByTStaffStaffNo_3(Collection<SBreakageMEntity> sBreakageMSByTStaffStaffNo_3) {
        this.sBreakageMSByTStaffStaffNo_3 = sBreakageMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageSCreaterNo")
    public Collection<SBreakageSEntity> getsBreakageSByTStaffStaffNo() {
        return sBreakageSByTStaffStaffNo;
    }

    public void setsBreakageSByTStaffStaffNo(Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo) {
        this.sBreakageSByTStaffStaffNo = sBreakageSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageSModifiNo")
    public Collection<SBreakageSEntity> getsBreakageSByTStaffStaffNo_0() {
        return sBreakageSByTStaffStaffNo_0;
    }

    public void setsBreakageSByTStaffStaffNo_0(Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo_0) {
        this.sBreakageSByTStaffStaffNo_0 = sBreakageSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySBreakageSChecker")
    public Collection<SBreakageSEntity> getsBreakageSByTStaffStaffNo_1() {
        return sBreakageSByTStaffStaffNo_1;
    }

    public void setsBreakageSByTStaffStaffNo_1(Collection<SBreakageSEntity> sBreakageSByTStaffStaffNo_1) {
        this.sBreakageSByTStaffStaffNo_1 = sBreakageSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowMSalesman")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTStaffStaffNo() {
        return sInBorrowMSByTStaffStaffNo;
    }

    public void setsInBorrowMSByTStaffStaffNo(Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo) {
        this.sInBorrowMSByTStaffStaffNo = sInBorrowMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowMWarehouseKeeper")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTStaffStaffNo_0() {
        return sInBorrowMSByTStaffStaffNo_0;
    }

    public void setsInBorrowMSByTStaffStaffNo_0(Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_0) {
        this.sInBorrowMSByTStaffStaffNo_0 = sInBorrowMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowMCreaterNo")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTStaffStaffNo_1() {
        return sInBorrowMSByTStaffStaffNo_1;
    }

    public void setsInBorrowMSByTStaffStaffNo_1(Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_1) {
        this.sInBorrowMSByTStaffStaffNo_1 = sInBorrowMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowMModifiNo")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTStaffStaffNo_2() {
        return sInBorrowMSByTStaffStaffNo_2;
    }

    public void setsInBorrowMSByTStaffStaffNo_2(Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_2) {
        this.sInBorrowMSByTStaffStaffNo_2 = sInBorrowMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowMChecker")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTStaffStaffNo_3() {
        return sInBorrowMSByTStaffStaffNo_3;
    }

    public void setsInBorrowMSByTStaffStaffNo_3(Collection<SInBorrowMEntity> sInBorrowMSByTStaffStaffNo_3) {
        this.sInBorrowMSByTStaffStaffNo_3 = sInBorrowMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowSCreaterNo")
    public Collection<SInBorrowSEntity> getsInBorrowSByTStaffStaffNo() {
        return sInBorrowSByTStaffStaffNo;
    }

    public void setsInBorrowSByTStaffStaffNo(Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo) {
        this.sInBorrowSByTStaffStaffNo = sInBorrowSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowSModifiNo")
    public Collection<SInBorrowSEntity> getsInBorrowSByTStaffStaffNo_0() {
        return sInBorrowSByTStaffStaffNo_0;
    }

    public void setsInBorrowSByTStaffStaffNo_0(Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo_0) {
        this.sInBorrowSByTStaffStaffNo_0 = sInBorrowSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySInBorrowSChecker")
    public Collection<SInBorrowSEntity> getsInBorrowSByTStaffStaffNo_1() {
        return sInBorrowSByTStaffStaffNo_1;
    }

    public void setsInBorrowSByTStaffStaffNo_1(Collection<SInBorrowSEntity> sInBorrowSByTStaffStaffNo_1) {
        this.sInBorrowSByTStaffStaffNo_1 = sInBorrowSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanMSalesman")
    public Collection<SInLoanMEntity> getsInLoanMSByTStaffStaffNo() {
        return sInLoanMSByTStaffStaffNo;
    }

    public void setsInLoanMSByTStaffStaffNo(Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo) {
        this.sInLoanMSByTStaffStaffNo = sInLoanMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanMWarehouseKeeper")
    public Collection<SInLoanMEntity> getsInLoanMSByTStaffStaffNo_0() {
        return sInLoanMSByTStaffStaffNo_0;
    }

    public void setsInLoanMSByTStaffStaffNo_0(Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_0) {
        this.sInLoanMSByTStaffStaffNo_0 = sInLoanMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanMCreaterNo")
    public Collection<SInLoanMEntity> getsInLoanMSByTStaffStaffNo_1() {
        return sInLoanMSByTStaffStaffNo_1;
    }

    public void setsInLoanMSByTStaffStaffNo_1(Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_1) {
        this.sInLoanMSByTStaffStaffNo_1 = sInLoanMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanMModifiNo")
    public Collection<SInLoanMEntity> getsInLoanMSByTStaffStaffNo_2() {
        return sInLoanMSByTStaffStaffNo_2;
    }

    public void setsInLoanMSByTStaffStaffNo_2(Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_2) {
        this.sInLoanMSByTStaffStaffNo_2 = sInLoanMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanMChecker")
    public Collection<SInLoanMEntity> getsInLoanMSByTStaffStaffNo_3() {
        return sInLoanMSByTStaffStaffNo_3;
    }

    public void setsInLoanMSByTStaffStaffNo_3(Collection<SInLoanMEntity> sInLoanMSByTStaffStaffNo_3) {
        this.sInLoanMSByTStaffStaffNo_3 = sInLoanMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanSCreaterNo")
    public Collection<SInLoanSEntity> getsInLoanSByTStaffStaffNo() {
        return sInLoanSByTStaffStaffNo;
    }

    public void setsInLoanSByTStaffStaffNo(Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo) {
        this.sInLoanSByTStaffStaffNo = sInLoanSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanSModifiNo")
    public Collection<SInLoanSEntity> getsInLoanSByTStaffStaffNo_0() {
        return sInLoanSByTStaffStaffNo_0;
    }

    public void setsInLoanSByTStaffStaffNo_0(Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo_0) {
        this.sInLoanSByTStaffStaffNo_0 = sInLoanSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySInLoanSChecker")
    public Collection<SInLoanSEntity> getsInLoanSByTStaffStaffNo_1() {
        return sInLoanSByTStaffStaffNo_1;
    }

    public void setsInLoanSByTStaffStaffNo_1(Collection<SInLoanSEntity> sInLoanSByTStaffStaffNo_1) {
        this.sInLoanSByTStaffStaffNo_1 = sInLoanSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanMSalesman")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTStaffStaffNo() {
        return sOutLoanMSByTStaffStaffNo;
    }

    public void setsOutLoanMSByTStaffStaffNo(Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo) {
        this.sOutLoanMSByTStaffStaffNo = sOutLoanMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanMWarehouseKeeper")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTStaffStaffNo_0() {
        return sOutLoanMSByTStaffStaffNo_0;
    }

    public void setsOutLoanMSByTStaffStaffNo_0(Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_0) {
        this.sOutLoanMSByTStaffStaffNo_0 = sOutLoanMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanMCreaterNo")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTStaffStaffNo_1() {
        return sOutLoanMSByTStaffStaffNo_1;
    }

    public void setsOutLoanMSByTStaffStaffNo_1(Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_1) {
        this.sOutLoanMSByTStaffStaffNo_1 = sOutLoanMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanMModifiNo")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTStaffStaffNo_2() {
        return sOutLoanMSByTStaffStaffNo_2;
    }

    public void setsOutLoanMSByTStaffStaffNo_2(Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_2) {
        this.sOutLoanMSByTStaffStaffNo_2 = sOutLoanMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanMChecker")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTStaffStaffNo_3() {
        return sOutLoanMSByTStaffStaffNo_3;
    }

    public void setsOutLoanMSByTStaffStaffNo_3(Collection<SOutLoanMEntity> sOutLoanMSByTStaffStaffNo_3) {
        this.sOutLoanMSByTStaffStaffNo_3 = sOutLoanMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanSCreaterNo")
    public Collection<SOutLoanSEntity> getsOutLoanSByTStaffStaffNo() {
        return sOutLoanSByTStaffStaffNo;
    }

    public void setsOutLoanSByTStaffStaffNo(Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo) {
        this.sOutLoanSByTStaffStaffNo = sOutLoanSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanSModifiNo")
    public Collection<SOutLoanSEntity> getsOutLoanSByTStaffStaffNo_0() {
        return sOutLoanSByTStaffStaffNo_0;
    }

    public void setsOutLoanSByTStaffStaffNo_0(Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo_0) {
        this.sOutLoanSByTStaffStaffNo_0 = sOutLoanSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySOutLoanSChecker")
    public Collection<SOutLoanSEntity> getsOutLoanSByTStaffStaffNo_1() {
        return sOutLoanSByTStaffStaffNo_1;
    }

    public void setsOutLoanSByTStaffStaffNo_1(Collection<SOutLoanSEntity> sOutLoanSByTStaffStaffNo_1) {
        this.sOutLoanSByTStaffStaffNo_1 = sOutLoanSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferMWarehouseKeeper")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTStaffStaffNo() {
        return sRoomTransferMSByTStaffStaffNo;
    }

    public void setsRoomTransferMSByTStaffStaffNo(Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo) {
        this.sRoomTransferMSByTStaffStaffNo = sRoomTransferMSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferMWarehouseKeeper_0")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTStaffStaffNo_0() {
        return sRoomTransferMSByTStaffStaffNo_0;
    }

    public void setsRoomTransferMSByTStaffStaffNo_0(Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_0) {
        this.sRoomTransferMSByTStaffStaffNo_0 = sRoomTransferMSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferMCreaterNo")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTStaffStaffNo_1() {
        return sRoomTransferMSByTStaffStaffNo_1;
    }

    public void setsRoomTransferMSByTStaffStaffNo_1(Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_1) {
        this.sRoomTransferMSByTStaffStaffNo_1 = sRoomTransferMSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferMModifiNo")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTStaffStaffNo_2() {
        return sRoomTransferMSByTStaffStaffNo_2;
    }

    public void setsRoomTransferMSByTStaffStaffNo_2(Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_2) {
        this.sRoomTransferMSByTStaffStaffNo_2 = sRoomTransferMSByTStaffStaffNo_2;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferMChecker")
    public Collection<SRoomTransferMEntity> getsRoomTransferMSByTStaffStaffNo_3() {
        return sRoomTransferMSByTStaffStaffNo_3;
    }

    public void setsRoomTransferMSByTStaffStaffNo_3(Collection<SRoomTransferMEntity> sRoomTransferMSByTStaffStaffNo_3) {
        this.sRoomTransferMSByTStaffStaffNo_3 = sRoomTransferMSByTStaffStaffNo_3;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferSCreaterNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByTStaffStaffNo() {
        return sRoomTransferSByTStaffStaffNo;
    }

    public void setsRoomTransferSByTStaffStaffNo(Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo) {
        this.sRoomTransferSByTStaffStaffNo = sRoomTransferSByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferSModifiNo")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByTStaffStaffNo_0() {
        return sRoomTransferSByTStaffStaffNo_0;
    }

    public void setsRoomTransferSByTStaffStaffNo_0(Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo_0) {
        this.sRoomTransferSByTStaffStaffNo_0 = sRoomTransferSByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySRoomTransferSChecker")
    public Collection<SRoomTransferSEntity> getsRoomTransferSByTStaffStaffNo_1() {
        return sRoomTransferSByTStaffStaffNo_1;
    }

    public void setsRoomTransferSByTStaffStaffNo_1(Collection<SRoomTransferSEntity> sRoomTransferSByTStaffStaffNo_1) {
        this.sRoomTransferSByTStaffStaffNo_1 = sRoomTransferSByTStaffStaffNo_1;
    }

    @OneToMany(mappedBy = "tStaffBySalesPropertiesCreateNo")
    public Collection<SalesPropertiesEntity> getSalesPropertiesByTStaffStaffNo() {
        return salesPropertiesByTStaffStaffNo;
    }

    public void setSalesPropertiesByTStaffStaffNo(Collection<SalesPropertiesEntity> salesPropertiesByTStaffStaffNo) {
        this.salesPropertiesByTStaffStaffNo = salesPropertiesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySalesPropertiesModifiNo")
    public Collection<SalesPropertiesEntity> getSalesPropertiesByTStaffStaffNo_0() {
        return salesPropertiesByTStaffStaffNo_0;
    }

    public void setSalesPropertiesByTStaffStaffNo_0(Collection<SalesPropertiesEntity> salesPropertiesByTStaffStaffNo_0) {
        this.salesPropertiesByTStaffStaffNo_0 = salesPropertiesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffBySalesmanGroupCreaterNo")
    public Collection<SalesmanGroupEntity> getSalesmanGroupsByTStaffStaffNo() {
        return salesmanGroupsByTStaffStaffNo;
    }

    public void setSalesmanGroupsByTStaffStaffNo(Collection<SalesmanGroupEntity> salesmanGroupsByTStaffStaffNo) {
        this.salesmanGroupsByTStaffStaffNo = salesmanGroupsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffBySalesmanGroupModifiNo")
    public Collection<SalesmanGroupEntity> getSalesmanGroupsByTStaffStaffNo_0() {
        return salesmanGroupsByTStaffStaffNo_0;
    }

    public void setSalesmanGroupsByTStaffStaffNo_0(Collection<SalesmanGroupEntity> salesmanGroupsByTStaffStaffNo_0) {
        this.salesmanGroupsByTStaffStaffNo_0 = salesmanGroupsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByStoreLocationCreateNo")
    public Collection<StoreLocationEntity> getStoreLocationsByTStaffStaffNo() {
        return storeLocationsByTStaffStaffNo;
    }

    public void setStoreLocationsByTStaffStaffNo(Collection<StoreLocationEntity> storeLocationsByTStaffStaffNo) {
        this.storeLocationsByTStaffStaffNo = storeLocationsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByStoreLocationModifiNo")
    public Collection<StoreLocationEntity> getStoreLocationsByTStaffStaffNo_0() {
        return storeLocationsByTStaffStaffNo_0;
    }

    public void setStoreLocationsByTStaffStaffNo_0(Collection<StoreLocationEntity> storeLocationsByTStaffStaffNo_0) {
        this.storeLocationsByTStaffStaffNo_0 = storeLocationsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTBrandCreateNo")
    public Collection<TBrandEntity> gettBrandsByTStaffStaffNo() {
        return tBrandsByTStaffStaffNo;
    }

    public void settBrandsByTStaffStaffNo(Collection<TBrandEntity> tBrandsByTStaffStaffNo) {
        this.tBrandsByTStaffStaffNo = tBrandsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTBrandModifiNo")
    public Collection<TBrandEntity> gettBrandsByTStaffStaffNo_0() {
        return tBrandsByTStaffStaffNo_0;
    }

    public void settBrandsByTStaffStaffNo_0(Collection<TBrandEntity> tBrandsByTStaffStaffNo_0) {
        this.tBrandsByTStaffStaffNo_0 = tBrandsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTCarCreaterNo")
    public Collection<TCarEntity> gettCarsByTStaffStaffNo() {
        return tCarsByTStaffStaffNo;
    }

    public void settCarsByTStaffStaffNo(Collection<TCarEntity> tCarsByTStaffStaffNo) {
        this.tCarsByTStaffStaffNo = tCarsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTCarModifiNo")
    public Collection<TCarEntity> gettCarsByTStaffStaffNo_0() {
        return tCarsByTStaffStaffNo_0;
    }

    public void settCarsByTStaffStaffNo_0(Collection<TCarEntity> tCarsByTStaffStaffNo_0) {
        this.tCarsByTStaffStaffNo_0 = tCarsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTClientParentId")
    public Collection<TClientEntity> gettClientsByTStaffStaffNo() {
        return tClientsByTStaffStaffNo;
    }

    public void settClientsByTStaffStaffNo(Collection<TClientEntity> tClientsByTStaffStaffNo) {
        this.tClientsByTStaffStaffNo = tClientsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTClientCreateNo")
    public Collection<TClientEntity> gettClientsByTStaffStaffNo_0() {
        return tClientsByTStaffStaffNo_0;
    }

    public void settClientsByTStaffStaffNo_0(Collection<TClientEntity> tClientsByTStaffStaffNo_0) {
        this.tClientsByTStaffStaffNo_0 = tClientsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTClientClassifyCreateNo")
    public Collection<TClientClassifyEntity> gettClientClassifiesByTStaffStaffNo() {
        return tClientClassifiesByTStaffStaffNo;
    }

    public void settClientClassifiesByTStaffStaffNo(Collection<TClientClassifyEntity> tClientClassifiesByTStaffStaffNo) {
        this.tClientClassifiesByTStaffStaffNo = tClientClassifiesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTClientClassifyModifiNo")
    public Collection<TClientClassifyEntity> gettClientClassifiesByTStaffStaffNo_0() {
        return tClientClassifiesByTStaffStaffNo_0;
    }

    public void settClientClassifiesByTStaffStaffNo_0(Collection<TClientClassifyEntity> tClientClassifiesByTStaffStaffNo_0) {
        this.tClientClassifiesByTStaffStaffNo_0 = tClientClassifiesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTDepartmentCreateNo")
    public Collection<TDepartmentEntity> gettDepartmentsByTStaffStaffNo() {
        return tDepartmentsByTStaffStaffNo;
    }

    public void settDepartmentsByTStaffStaffNo(Collection<TDepartmentEntity> tDepartmentsByTStaffStaffNo) {
        this.tDepartmentsByTStaffStaffNo = tDepartmentsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTDepartmentModifiNo")
    public Collection<TDepartmentEntity> gettDepartmentsByTStaffStaffNo_0() {
        return tDepartmentsByTStaffStaffNo_0;
    }

    public void settDepartmentsByTStaffStaffNo_0(Collection<TDepartmentEntity> tDepartmentsByTStaffStaffNo_0) {
        this.tDepartmentsByTStaffStaffNo_0 = tDepartmentsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTFactorysCreateNo")
    public Collection<TFactorysEntity> gettFactorysByTStaffStaffNo() {
        return tFactorysByTStaffStaffNo;
    }

    public void settFactorysByTStaffStaffNo(Collection<TFactorysEntity> tFactorysByTStaffStaffNo) {
        this.tFactorysByTStaffStaffNo = tFactorysByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTFactorysModifiNo")
    public Collection<TFactorysEntity> gettFactorysByTStaffStaffNo_0() {
        return tFactorysByTStaffStaffNo_0;
    }

    public void settFactorysByTStaffStaffNo_0(Collection<TFactorysEntity> tFactorysByTStaffStaffNo_0) {
        this.tFactorysByTStaffStaffNo_0 = tFactorysByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTGoodsCreateNo")
    public Collection<TGoodsEntity> gettGoodsByTStaffStaffNo() {
        return tGoodsByTStaffStaffNo;
    }

    public void settGoodsByTStaffStaffNo(Collection<TGoodsEntity> tGoodsByTStaffStaffNo) {
        this.tGoodsByTStaffStaffNo = tGoodsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTGoodsModifiNo")
    public Collection<TGoodsEntity> gettGoodsByTStaffStaffNo_0() {
        return tGoodsByTStaffStaffNo_0;
    }

    public void settGoodsByTStaffStaffNo_0(Collection<TGoodsEntity> tGoodsByTStaffStaffNo_0) {
        this.tGoodsByTStaffStaffNo_0 = tGoodsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTGoodsClassifyCreateNo")
    public Collection<TGoodsClassifyEntity> gettGoodsClassifiesByTStaffStaffNo() {
        return tGoodsClassifiesByTStaffStaffNo;
    }

    public void settGoodsClassifiesByTStaffStaffNo(Collection<TGoodsClassifyEntity> tGoodsClassifiesByTStaffStaffNo) {
        this.tGoodsClassifiesByTStaffStaffNo = tGoodsClassifiesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTGoodsClassifyModifiNo")
    public Collection<TGoodsClassifyEntity> gettGoodsClassifiesByTStaffStaffNo_0() {
        return tGoodsClassifiesByTStaffStaffNo_0;
    }

    public void settGoodsClassifiesByTStaffStaffNo_0(Collection<TGoodsClassifyEntity> tGoodsClassifiesByTStaffStaffNo_0) {
        this.tGoodsClassifiesByTStaffStaffNo_0 = tGoodsClassifiesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTOrgCreateNo")
    public Collection<TOrgEntity> gettOrgsByTStaffStaffNo() {
        return tOrgsByTStaffStaffNo;
    }

    public void settOrgsByTStaffStaffNo(Collection<TOrgEntity> tOrgsByTStaffStaffNo) {
        this.tOrgsByTStaffStaffNo = tOrgsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTOrgModifiNo")
    public Collection<TOrgEntity> gettOrgsByTStaffStaffNo_0() {
        return tOrgsByTStaffStaffNo_0;
    }

    public void settOrgsByTStaffStaffNo_0(Collection<TOrgEntity> tOrgsByTStaffStaffNo_0) {
        this.tOrgsByTStaffStaffNo_0 = tOrgsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTPaymentCreateNo")
    public Collection<TPaymentEntity> gettPaymentsByTStaffStaffNo() {
        return tPaymentsByTStaffStaffNo;
    }

    public void settPaymentsByTStaffStaffNo(Collection<TPaymentEntity> tPaymentsByTStaffStaffNo) {
        this.tPaymentsByTStaffStaffNo = tPaymentsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTPaymentModifiNo")
    public Collection<TPaymentEntity> gettPaymentsByTStaffStaffNo_0() {
        return tPaymentsByTStaffStaffNo_0;
    }

    public void settPaymentsByTStaffStaffNo_0(Collection<TPaymentEntity> tPaymentsByTStaffStaffNo_0) {
        this.tPaymentsByTStaffStaffNo_0 = tPaymentsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTPositionCreateNo")
    public Collection<TPositionEntity> gettPositionsByTStaffStaffNo() {
        return tPositionsByTStaffStaffNo;
    }

    public void settPositionsByTStaffStaffNo(Collection<TPositionEntity> tPositionsByTStaffStaffNo) {
        this.tPositionsByTStaffStaffNo = tPositionsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTPositionModifiNo")
    public Collection<TPositionEntity> gettPositionsByTStaffStaffNo_0() {
        return tPositionsByTStaffStaffNo_0;
    }

    public void settPositionsByTStaffStaffNo_0(Collection<TPositionEntity> tPositionsByTStaffStaffNo_0) {
        this.tPositionsByTStaffStaffNo_0 = tPositionsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTPresentCreaterNo")
    public Collection<TPresentEntity> gettPresentsByTStaffStaffNo() {
        return tPresentsByTStaffStaffNo;
    }

    public void settPresentsByTStaffStaffNo(Collection<TPresentEntity> tPresentsByTStaffStaffNo) {
        this.tPresentsByTStaffStaffNo = tPresentsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTPresentModifiNo")
    public Collection<TPresentEntity> gettPresentsByTStaffStaffNo_0() {
        return tPresentsByTStaffStaffNo_0;
    }

    public void settPresentsByTStaffStaffNo_0(Collection<TPresentEntity> tPresentsByTStaffStaffNo_0) {
        this.tPresentsByTStaffStaffNo_0 = tPresentsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTRoomCreateNo")
    public Collection<TRoomEntity> gettRoomsByTStaffStaffNo() {
        return tRoomsByTStaffStaffNo;
    }

    public void settRoomsByTStaffStaffNo(Collection<TRoomEntity> tRoomsByTStaffStaffNo) {
        this.tRoomsByTStaffStaffNo = tRoomsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTRoomModifiNo")
    public Collection<TRoomEntity> gettRoomsByTStaffStaffNo_0() {
        return tRoomsByTStaffStaffNo_0;
    }

    public void settRoomsByTStaffStaffNo_0(Collection<TRoomEntity> tRoomsByTStaffStaffNo_0) {
        this.tRoomsByTStaffStaffNo_0 = tRoomsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTRouteCreaterNo")
    public Collection<TRouteEntity> gettRoutesByTStaffStaffNo() {
        return tRoutesByTStaffStaffNo;
    }

    public void settRoutesByTStaffStaffNo(Collection<TRouteEntity> tRoutesByTStaffStaffNo) {
        this.tRoutesByTStaffStaffNo = tRoutesByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTRouteModifiNo")
    public Collection<TRouteEntity> gettRoutesByTStaffStaffNo_0() {
        return tRoutesByTStaffStaffNo_0;
    }

    public void settRoutesByTStaffStaffNo_0(Collection<TRouteEntity> tRoutesByTStaffStaffNo_0) {
        this.tRoutesByTStaffStaffNo_0 = tRoutesByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByTSalesPromotionCreateNo")
    public Collection<TSalesPromotionEntity> gettSalesPromotionsByTStaffStaffNo() {
        return tSalesPromotionsByTStaffStaffNo;
    }

    public void settSalesPromotionsByTStaffStaffNo(Collection<TSalesPromotionEntity> tSalesPromotionsByTStaffStaffNo) {
        this.tSalesPromotionsByTStaffStaffNo = tSalesPromotionsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByTSalesPromotionModifiNo")
    public Collection<TSalesPromotionEntity> gettSalesPromotionsByTStaffStaffNo_0() {
        return tSalesPromotionsByTStaffStaffNo_0;
    }

    public void settSalesPromotionsByTStaffStaffNo_0(Collection<TSalesPromotionEntity> tSalesPromotionsByTStaffStaffNo_0) {
        this.tSalesPromotionsByTStaffStaffNo_0 = tSalesPromotionsByTStaffStaffNo_0;
    }

    @ManyToOne
    @JoinColumn(name = "t_staff_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByTStaffGroupNodeId() {
        return tOrgByTStaffGroupNodeId;
    }

    public void settOrgByTStaffGroupNodeId(TOrgEntity tOrgByTStaffGroupNodeId) {
        this.tOrgByTStaffGroupNodeId = tOrgByTStaffGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "t_staff_dept_no", referencedColumnName = "t_department_dept_no")
    public TDepartmentEntity gettDepartmentByTStaffDeptNo() {
        return tDepartmentByTStaffDeptNo;
    }

    public void settDepartmentByTStaffDeptNo(TDepartmentEntity tDepartmentByTStaffDeptNo) {
        this.tDepartmentByTStaffDeptNo = tDepartmentByTStaffDeptNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_staff_potition_no", referencedColumnName = "t_position_potition_no")
    public TPositionEntity gettPositionByTStaffPotitionNo() {
        return tPositionByTStaffPotitionNo;
    }

    public void settPositionByTStaffPotitionNo(TPositionEntity tPositionByTStaffPotitionNo) {
        this.tPositionByTStaffPotitionNo = tPositionByTStaffPotitionNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_staff_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTStaffCreateNo() {
        return tStaffByTStaffCreateNo;
    }

    public void settStaffByTStaffCreateNo(TStaffEntity tStaffByTStaffCreateNo) {
        this.tStaffByTStaffCreateNo = tStaffByTStaffCreateNo;
    }

    @OneToMany(mappedBy = "tStaffByTStaffCreateNo")
    public Collection<TStaffEntity> gettStaffsByTStaffStaffNo() {
        return tStaffsByTStaffStaffNo;
    }

    public void settStaffsByTStaffStaffNo(Collection<TStaffEntity> tStaffsByTStaffStaffNo) {
        this.tStaffsByTStaffStaffNo = tStaffsByTStaffStaffNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_staff_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByTStaffModifiNo() {
        return tStaffByTStaffModifiNo;
    }

    public void settStaffByTStaffModifiNo(TStaffEntity tStaffByTStaffModifiNo) {
        this.tStaffByTStaffModifiNo = tStaffByTStaffModifiNo;
    }

    @OneToMany(mappedBy = "tStaffByTStaffModifiNo")
    public Collection<TStaffEntity> gettStaffsByTStaffStaffNo_0() {
        return tStaffsByTStaffStaffNo_0;
    }

    public void settStaffsByTStaffStaffNo_0(Collection<TStaffEntity> tStaffsByTStaffStaffNo_0) {
        this.tStaffsByTStaffStaffNo_0 = tStaffsByTStaffStaffNo_0;
    }

    @OneToMany(mappedBy = "tStaffByUserGroupCreaterNo")
    public Collection<UserGroupEntity> getUserGroupsByTStaffStaffNo() {
        return userGroupsByTStaffStaffNo;
    }

    public void setUserGroupsByTStaffStaffNo(Collection<UserGroupEntity> userGroupsByTStaffStaffNo) {
        this.userGroupsByTStaffStaffNo = userGroupsByTStaffStaffNo;
    }

    @OneToMany(mappedBy = "tStaffByUserGroupModifiNo")
    public Collection<UserGroupEntity> getUserGroupsByTStaffStaffNo_0() {
        return userGroupsByTStaffStaffNo_0;
    }

    public void setUserGroupsByTStaffStaffNo_0(Collection<UserGroupEntity> userGroupsByTStaffStaffNo_0) {
        this.userGroupsByTStaffStaffNo_0 = userGroupsByTStaffStaffNo_0;
    }
}
