package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "t_client", schema = "dbo", catalog = "logistics")
public class TClientEntity {
    private String tClientClientNo;
    private String tClientParentId;
    private String tClientClientClassifyNo;
    private String tClientClientZoneNo;
    private int tClientClientLevel;
    private String tClientClientName;
    private String tClientClientShortname;
    private String tClientEName;
    private String tClientTaxPart;
    private String tClientBrandPart;
    private String tClientBankName;
    private String tClientRouteName;
    private String tClientTel;
    private String tClientClientAddress;
    private String tClientFax;
    private String tClientWeb;
    private String tClientLinkman;
    private String tClientEMail;
    private String tClientBank;
    private String tClientAccount;
    private String tClientTaxNumber;
    private String tClientOrgCode;
    private BigDecimal tClientCreditLimit;
    private String tClientGroupnoC;
    private String tClientTaxCode;
    private int tClientPriceControlTag;
    private String tClientRemark;
    private String tClientCreateNo;
    private Timestamp tClientCreateDate;
    private String tClientModifiNo;
    private Timestamp tClientModifiTime;
    private String tClientFlag;
    private String tClientGroupNodeId;
    private Collection<DistributionListEntity> distributionListsByTClientClientNo;
    private Collection<PromotionClientGroupEntity> promotionClientGroupsByTClientClientNo;
    private Collection<PromotionMProductSEntity> promotionMProductSByTClientClientNo;
    private Collection<BAgentSalesMEntity> bAgentSalesMSByTClientClientNo;
    private Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTClientClientNo;
    private Collection<BSConMEntity> bSConMSByTClientClientNo;
    private Collection<BSOrderMEntity> bSOrderMSByTClientClientNo;
    private Collection<CPurchaseConMEntity> cPurchaseConMSByTClientClientNo;
    private Collection<CPurchaseConSEntity> cPurchaseConSByTClientClientNo;
    private Collection<FConMEntity> fConMSByTClientClientNo;
    private Collection<SBreakageMEntity> sBreakageMSByTClientClientNo;
    private Collection<SInBorrowMEntity> sInBorrowMSByTClientClientNo;
    private Collection<SOutLoanMEntity> sOutLoanMSByTClientClientNo;
    private TStaffEntity tStaffByTClientParentId;
    private TClientClassifyEntity tClientClassifyByTClientClientClassifyNo;
    private ClientZoneEntity clientZoneByTClientClientZoneNo;
    private TStaffEntity tStaffByTClientCreateNo;
    private TOrgEntity tOrgByTClientGroupNodeId;

    @Id
    @Column(name = "t_client_client_no", nullable = false, length = 20)
    public String gettClientClientNo() {
        return tClientClientNo;
    }

    public void settClientClientNo(String tClientClientNo) {
        this.tClientClientNo = tClientClientNo;
    }

    @Basic
    @Column(name = "t_client_parent_id", nullable = true, length = 8)
    public String gettClientParentId() {
        return tClientParentId;
    }

    public void settClientParentId(String tClientParentId) {
        this.tClientParentId = tClientParentId;
    }

    @Basic
    @Column(name = "t_client_client_classify_no", nullable = true, length = 20)
    public String gettClientClientClassifyNo() {
        return tClientClientClassifyNo;
    }

    public void settClientClientClassifyNo(String tClientClientClassifyNo) {
        this.tClientClientClassifyNo = tClientClientClassifyNo;
    }

    @Basic
    @Column(name = "t_client_client_zone_no", nullable = true, length = 4)
    public String gettClientClientZoneNo() {
        return tClientClientZoneNo;
    }

    public void settClientClientZoneNo(String tClientClientZoneNo) {
        this.tClientClientZoneNo = tClientClientZoneNo;
    }

    @Basic
    @Column(name = "t_client_client_level", nullable = false)
    public int gettClientClientLevel() {
        return tClientClientLevel;
    }

    public void settClientClientLevel(int tClientClientLevel) {
        this.tClientClientLevel = tClientClientLevel;
    }

    @Basic
    @Column(name = "t_client_client_name", nullable = false, length = 200)
    public String gettClientClientName() {
        return tClientClientName;
    }

    public void settClientClientName(String tClientClientName) {
        this.tClientClientName = tClientClientName;
    }

    @Basic
    @Column(name = "t_client_client_shortname", nullable = true, length = 50)
    public String gettClientClientShortname() {
        return tClientClientShortname;
    }

    public void settClientClientShortname(String tClientClientShortname) {
        this.tClientClientShortname = tClientClientShortname;
    }

    @Basic
    @Column(name = "t_client_e_name", nullable = true, length = 100)
    public String gettClientEName() {
        return tClientEName;
    }

    public void settClientEName(String tClientEName) {
        this.tClientEName = tClientEName;
    }

    @Basic
    @Column(name = "t_client_tax_part", nullable = false, length = -1)
    public String gettClientTaxPart() {
        return tClientTaxPart;
    }

    public void settClientTaxPart(String tClientTaxPart) {
        this.tClientTaxPart = tClientTaxPart;
    }

    @Basic
    @Column(name = "t_client_brand_part", nullable = false, length = -1)
    public String gettClientBrandPart() {
        return tClientBrandPart;
    }

    public void settClientBrandPart(String tClientBrandPart) {
        this.tClientBrandPart = tClientBrandPart;
    }

    @Basic
    @Column(name = "t_client_bank_name", nullable = true, length = 100)
    public String gettClientBankName() {
        return tClientBankName;
    }

    public void settClientBankName(String tClientBankName) {
        this.tClientBankName = tClientBankName;
    }

    @Basic
    @Column(name = "t_client_route_name", nullable = true, length = 50)
    public String gettClientRouteName() {
        return tClientRouteName;
    }

    public void settClientRouteName(String tClientRouteName) {
        this.tClientRouteName = tClientRouteName;
    }

    @Basic
    @Column(name = "t_client_tel", nullable = true, length = 30)
    public String gettClientTel() {
        return tClientTel;
    }

    public void settClientTel(String tClientTel) {
        this.tClientTel = tClientTel;
    }

    @Basic
    @Column(name = "t_client_client_address", nullable = true, length = 200)
    public String gettClientClientAddress() {
        return tClientClientAddress;
    }

    public void settClientClientAddress(String tClientClientAddress) {
        this.tClientClientAddress = tClientClientAddress;
    }

    @Basic
    @Column(name = "t_client_fax", nullable = true, length = 30)
    public String gettClientFax() {
        return tClientFax;
    }

    public void settClientFax(String tClientFax) {
        this.tClientFax = tClientFax;
    }

    @Basic
    @Column(name = "t_client_web", nullable = true, length = 100)
    public String gettClientWeb() {
        return tClientWeb;
    }

    public void settClientWeb(String tClientWeb) {
        this.tClientWeb = tClientWeb;
    }

    @Basic
    @Column(name = "t_client_linkman", nullable = true, length = 50)
    public String gettClientLinkman() {
        return tClientLinkman;
    }

    public void settClientLinkman(String tClientLinkman) {
        this.tClientLinkman = tClientLinkman;
    }

    @Basic
    @Column(name = "t_client_e_mail", nullable = true, length = 100)
    public String gettClientEMail() {
        return tClientEMail;
    }

    public void settClientEMail(String tClientEMail) {
        this.tClientEMail = tClientEMail;
    }

    @Basic
    @Column(name = "t_client_bank", nullable = true, length = 50)
    public String gettClientBank() {
        return tClientBank;
    }

    public void settClientBank(String tClientBank) {
        this.tClientBank = tClientBank;
    }

    @Basic
    @Column(name = "t_client_account", nullable = true, length = 50)
    public String gettClientAccount() {
        return tClientAccount;
    }

    public void settClientAccount(String tClientAccount) {
        this.tClientAccount = tClientAccount;
    }

    @Basic
    @Column(name = "t_client_tax_number", nullable = true, length = 50)
    public String gettClientTaxNumber() {
        return tClientTaxNumber;
    }

    public void settClientTaxNumber(String tClientTaxNumber) {
        this.tClientTaxNumber = tClientTaxNumber;
    }

    @Basic
    @Column(name = "t_client_org_code", nullable = true, length = 50)
    public String gettClientOrgCode() {
        return tClientOrgCode;
    }

    public void settClientOrgCode(String tClientOrgCode) {
        this.tClientOrgCode = tClientOrgCode;
    }

    @Basic
    @Column(name = "t_client_credit_limit", nullable = true, precision = 6)
    public BigDecimal gettClientCreditLimit() {
        return tClientCreditLimit;
    }

    public void settClientCreditLimit(BigDecimal tClientCreditLimit) {
        this.tClientCreditLimit = tClientCreditLimit;
    }

    @Basic
    @Column(name = "t_client_groupno_c", nullable = true, length = 20)
    public String gettClientGroupnoC() {
        return tClientGroupnoC;
    }

    public void settClientGroupnoC(String tClientGroupnoC) {
        this.tClientGroupnoC = tClientGroupnoC;
    }

    @Basic
    @Column(name = "t_client_tax_code", nullable = true, length = 50)
    public String gettClientTaxCode() {
        return tClientTaxCode;
    }

    public void settClientTaxCode(String tClientTaxCode) {
        this.tClientTaxCode = tClientTaxCode;
    }

    @Basic
    @Column(name = "t_client_price_control_tag", nullable = false)
    public int gettClientPriceControlTag() {
        return tClientPriceControlTag;
    }

    public void settClientPriceControlTag(int tClientPriceControlTag) {
        this.tClientPriceControlTag = tClientPriceControlTag;
    }

    @Basic
    @Column(name = "t_client_remark", nullable = true, length = 100)
    public String gettClientRemark() {
        return tClientRemark;
    }

    public void settClientRemark(String tClientRemark) {
        this.tClientRemark = tClientRemark;
    }

    @Basic
    @Column(name = "t_client_create_no", nullable = true, length = 8)
    public String gettClientCreateNo() {
        return tClientCreateNo;
    }

    public void settClientCreateNo(String tClientCreateNo) {
        this.tClientCreateNo = tClientCreateNo;
    }

    @Basic
    @Column(name = "t_client_create_date", nullable = true)
    public Timestamp gettClientCreateDate() {
        return tClientCreateDate;
    }

    public void settClientCreateDate(Timestamp tClientCreateDate) {
        this.tClientCreateDate = tClientCreateDate;
    }

    @Basic
    @Column(name = "t_client_modifi_no", nullable = true, length = 20)
    public String gettClientModifiNo() {
        return tClientModifiNo;
    }

    public void settClientModifiNo(String tClientModifiNo) {
        this.tClientModifiNo = tClientModifiNo;
    }

    @Basic
    @Column(name = "t_client_modifi_time", nullable = true)
    public Timestamp gettClientModifiTime() {
        return tClientModifiTime;
    }

    public void settClientModifiTime(Timestamp tClientModifiTime) {
        this.tClientModifiTime = tClientModifiTime;
    }

    @Basic
    @Column(name = "t_client_flag", nullable = false, length = -1)
    public String gettClientFlag() {
        return tClientFlag;
    }

    public void settClientFlag(String tClientFlag) {
        this.tClientFlag = tClientFlag;
    }

    @Basic
    @Column(name = "t_client_group_node_id", nullable = true, length = 20)
    public String gettClientGroupNodeId() {
        return tClientGroupNodeId;
    }

    public void settClientGroupNodeId(String tClientGroupNodeId) {
        this.tClientGroupNodeId = tClientGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TClientEntity that = (TClientEntity) o;

        if (tClientClientLevel != that.tClientClientLevel) return false;
        if (tClientPriceControlTag != that.tClientPriceControlTag) return false;
        if (tClientClientNo != null ? !tClientClientNo.equals(that.tClientClientNo) : that.tClientClientNo != null)
            return false;
        if (tClientParentId != null ? !tClientParentId.equals(that.tClientParentId) : that.tClientParentId != null)
            return false;
        if (tClientClientClassifyNo != null ? !tClientClientClassifyNo.equals(that.tClientClientClassifyNo) : that.tClientClientClassifyNo != null)
            return false;
        if (tClientClientZoneNo != null ? !tClientClientZoneNo.equals(that.tClientClientZoneNo) : that.tClientClientZoneNo != null)
            return false;
        if (tClientClientName != null ? !tClientClientName.equals(that.tClientClientName) : that.tClientClientName != null)
            return false;
        if (tClientClientShortname != null ? !tClientClientShortname.equals(that.tClientClientShortname) : that.tClientClientShortname != null)
            return false;
        if (tClientEName != null ? !tClientEName.equals(that.tClientEName) : that.tClientEName != null) return false;
        if (tClientTaxPart != null ? !tClientTaxPart.equals(that.tClientTaxPart) : that.tClientTaxPart != null)
            return false;
        if (tClientBrandPart != null ? !tClientBrandPart.equals(that.tClientBrandPart) : that.tClientBrandPart != null)
            return false;
        if (tClientBankName != null ? !tClientBankName.equals(that.tClientBankName) : that.tClientBankName != null)
            return false;
        if (tClientRouteName != null ? !tClientRouteName.equals(that.tClientRouteName) : that.tClientRouteName != null)
            return false;
        if (tClientTel != null ? !tClientTel.equals(that.tClientTel) : that.tClientTel != null) return false;
        if (tClientClientAddress != null ? !tClientClientAddress.equals(that.tClientClientAddress) : that.tClientClientAddress != null)
            return false;
        if (tClientFax != null ? !tClientFax.equals(that.tClientFax) : that.tClientFax != null) return false;
        if (tClientWeb != null ? !tClientWeb.equals(that.tClientWeb) : that.tClientWeb != null) return false;
        if (tClientLinkman != null ? !tClientLinkman.equals(that.tClientLinkman) : that.tClientLinkman != null)
            return false;
        if (tClientEMail != null ? !tClientEMail.equals(that.tClientEMail) : that.tClientEMail != null) return false;
        if (tClientBank != null ? !tClientBank.equals(that.tClientBank) : that.tClientBank != null) return false;
        if (tClientAccount != null ? !tClientAccount.equals(that.tClientAccount) : that.tClientAccount != null)
            return false;
        if (tClientTaxNumber != null ? !tClientTaxNumber.equals(that.tClientTaxNumber) : that.tClientTaxNumber != null)
            return false;
        if (tClientOrgCode != null ? !tClientOrgCode.equals(that.tClientOrgCode) : that.tClientOrgCode != null)
            return false;
        if (tClientCreditLimit != null ? !tClientCreditLimit.equals(that.tClientCreditLimit) : that.tClientCreditLimit != null)
            return false;
        if (tClientGroupnoC != null ? !tClientGroupnoC.equals(that.tClientGroupnoC) : that.tClientGroupnoC != null)
            return false;
        if (tClientTaxCode != null ? !tClientTaxCode.equals(that.tClientTaxCode) : that.tClientTaxCode != null)
            return false;
        if (tClientRemark != null ? !tClientRemark.equals(that.tClientRemark) : that.tClientRemark != null)
            return false;
        if (tClientCreateNo != null ? !tClientCreateNo.equals(that.tClientCreateNo) : that.tClientCreateNo != null)
            return false;
        if (tClientCreateDate != null ? !tClientCreateDate.equals(that.tClientCreateDate) : that.tClientCreateDate != null)
            return false;
        if (tClientModifiNo != null ? !tClientModifiNo.equals(that.tClientModifiNo) : that.tClientModifiNo != null)
            return false;
        if (tClientModifiTime != null ? !tClientModifiTime.equals(that.tClientModifiTime) : that.tClientModifiTime != null)
            return false;
        if (tClientFlag != null ? !tClientFlag.equals(that.tClientFlag) : that.tClientFlag != null) return false;
        if (tClientGroupNodeId != null ? !tClientGroupNodeId.equals(that.tClientGroupNodeId) : that.tClientGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tClientClientNo != null ? tClientClientNo.hashCode() : 0;
        result = 31 * result + (tClientParentId != null ? tClientParentId.hashCode() : 0);
        result = 31 * result + (tClientClientClassifyNo != null ? tClientClientClassifyNo.hashCode() : 0);
        result = 31 * result + (tClientClientZoneNo != null ? tClientClientZoneNo.hashCode() : 0);
        result = 31 * result + tClientClientLevel;
        result = 31 * result + (tClientClientName != null ? tClientClientName.hashCode() : 0);
        result = 31 * result + (tClientClientShortname != null ? tClientClientShortname.hashCode() : 0);
        result = 31 * result + (tClientEName != null ? tClientEName.hashCode() : 0);
        result = 31 * result + (tClientTaxPart != null ? tClientTaxPart.hashCode() : 0);
        result = 31 * result + (tClientBrandPart != null ? tClientBrandPart.hashCode() : 0);
        result = 31 * result + (tClientBankName != null ? tClientBankName.hashCode() : 0);
        result = 31 * result + (tClientRouteName != null ? tClientRouteName.hashCode() : 0);
        result = 31 * result + (tClientTel != null ? tClientTel.hashCode() : 0);
        result = 31 * result + (tClientClientAddress != null ? tClientClientAddress.hashCode() : 0);
        result = 31 * result + (tClientFax != null ? tClientFax.hashCode() : 0);
        result = 31 * result + (tClientWeb != null ? tClientWeb.hashCode() : 0);
        result = 31 * result + (tClientLinkman != null ? tClientLinkman.hashCode() : 0);
        result = 31 * result + (tClientEMail != null ? tClientEMail.hashCode() : 0);
        result = 31 * result + (tClientBank != null ? tClientBank.hashCode() : 0);
        result = 31 * result + (tClientAccount != null ? tClientAccount.hashCode() : 0);
        result = 31 * result + (tClientTaxNumber != null ? tClientTaxNumber.hashCode() : 0);
        result = 31 * result + (tClientOrgCode != null ? tClientOrgCode.hashCode() : 0);
        result = 31 * result + (tClientCreditLimit != null ? tClientCreditLimit.hashCode() : 0);
        result = 31 * result + (tClientGroupnoC != null ? tClientGroupnoC.hashCode() : 0);
        result = 31 * result + (tClientTaxCode != null ? tClientTaxCode.hashCode() : 0);
        result = 31 * result + tClientPriceControlTag;
        result = 31 * result + (tClientRemark != null ? tClientRemark.hashCode() : 0);
        result = 31 * result + (tClientCreateNo != null ? tClientCreateNo.hashCode() : 0);
        result = 31 * result + (tClientCreateDate != null ? tClientCreateDate.hashCode() : 0);
        result = 31 * result + (tClientModifiNo != null ? tClientModifiNo.hashCode() : 0);
        result = 31 * result + (tClientModifiTime != null ? tClientModifiTime.hashCode() : 0);
        result = 31 * result + (tClientFlag != null ? tClientFlag.hashCode() : 0);
        result = 31 * result + (tClientGroupNodeId != null ? tClientGroupNodeId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tClientByDistributionListClientNo")
    public Collection<DistributionListEntity> getDistributionListsByTClientClientNo() {
        return distributionListsByTClientClientNo;
    }

    public void setDistributionListsByTClientClientNo(Collection<DistributionListEntity> distributionListsByTClientClientNo) {
        this.distributionListsByTClientClientNo = distributionListsByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByPromotionClientGroupClientNo")
    public Collection<PromotionClientGroupEntity> getPromotionClientGroupsByTClientClientNo() {
        return promotionClientGroupsByTClientClientNo;
    }

    public void setPromotionClientGroupsByTClientClientNo(Collection<PromotionClientGroupEntity> promotionClientGroupsByTClientClientNo) {
        this.promotionClientGroupsByTClientClientNo = promotionClientGroupsByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByPromotionMProductSClientNo")
    public Collection<PromotionMProductSEntity> getPromotionMProductSByTClientClientNo() {
        return promotionMProductSByTClientClientNo;
    }

    public void setPromotionMProductSByTClientClientNo(Collection<PromotionMProductSEntity> promotionMProductSByTClientClientNo) {
        this.promotionMProductSByTClientClientNo = promotionMProductSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByBAgentSalesMClientNo")
    public Collection<BAgentSalesMEntity> getbAgentSalesMSByTClientClientNo() {
        return bAgentSalesMSByTClientClientNo;
    }

    public void setbAgentSalesMSByTClientClientNo(Collection<BAgentSalesMEntity> bAgentSalesMSByTClientClientNo) {
        this.bAgentSalesMSByTClientClientNo = bAgentSalesMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByBPurchaseOrdMClientNo")
    public Collection<BPurchaseOrdMEntity> getbPurchaseOrdMSByTClientClientNo() {
        return bPurchaseOrdMSByTClientClientNo;
    }

    public void setbPurchaseOrdMSByTClientClientNo(Collection<BPurchaseOrdMEntity> bPurchaseOrdMSByTClientClientNo) {
        this.bPurchaseOrdMSByTClientClientNo = bPurchaseOrdMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByBSConMClientNo")
    public Collection<BSConMEntity> getbSConMSByTClientClientNo() {
        return bSConMSByTClientClientNo;
    }

    public void setbSConMSByTClientClientNo(Collection<BSConMEntity> bSConMSByTClientClientNo) {
        this.bSConMSByTClientClientNo = bSConMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByBSOrderMClientNo")
    public Collection<BSOrderMEntity> getbSOrderMSByTClientClientNo() {
        return bSOrderMSByTClientClientNo;
    }

    public void setbSOrderMSByTClientClientNo(Collection<BSOrderMEntity> bSOrderMSByTClientClientNo) {
        this.bSOrderMSByTClientClientNo = bSOrderMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByCPurchaseConMClientNo")
    public Collection<CPurchaseConMEntity> getcPurchaseConMSByTClientClientNo() {
        return cPurchaseConMSByTClientClientNo;
    }

    public void setcPurchaseConMSByTClientClientNo(Collection<CPurchaseConMEntity> cPurchaseConMSByTClientClientNo) {
        this.cPurchaseConMSByTClientClientNo = cPurchaseConMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByCPurchaseConSClientNo")
    public Collection<CPurchaseConSEntity> getcPurchaseConSByTClientClientNo() {
        return cPurchaseConSByTClientClientNo;
    }

    public void setcPurchaseConSByTClientClientNo(Collection<CPurchaseConSEntity> cPurchaseConSByTClientClientNo) {
        this.cPurchaseConSByTClientClientNo = cPurchaseConSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientByFConMClientNo")
    public Collection<FConMEntity> getfConMSByTClientClientNo() {
        return fConMSByTClientClientNo;
    }

    public void setfConMSByTClientClientNo(Collection<FConMEntity> fConMSByTClientClientNo) {
        this.fConMSByTClientClientNo = fConMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientBySBreakageMClientNo")
    public Collection<SBreakageMEntity> getsBreakageMSByTClientClientNo() {
        return sBreakageMSByTClientClientNo;
    }

    public void setsBreakageMSByTClientClientNo(Collection<SBreakageMEntity> sBreakageMSByTClientClientNo) {
        this.sBreakageMSByTClientClientNo = sBreakageMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientBySInBorrowMClientNo")
    public Collection<SInBorrowMEntity> getsInBorrowMSByTClientClientNo() {
        return sInBorrowMSByTClientClientNo;
    }

    public void setsInBorrowMSByTClientClientNo(Collection<SInBorrowMEntity> sInBorrowMSByTClientClientNo) {
        this.sInBorrowMSByTClientClientNo = sInBorrowMSByTClientClientNo;
    }

    @OneToMany(mappedBy = "tClientBySOutLoanMClientNo")
    public Collection<SOutLoanMEntity> getsOutLoanMSByTClientClientNo() {
        return sOutLoanMSByTClientClientNo;
    }

    public void setsOutLoanMSByTClientClientNo(Collection<SOutLoanMEntity> sOutLoanMSByTClientClientNo) {
        this.sOutLoanMSByTClientClientNo = sOutLoanMSByTClientClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_parent_id", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTClientParentId() {
        return tStaffByTClientParentId;
    }

    public void settStaffByTClientParentId(TStaffEntity tStaffByTClientParentId) {
        this.tStaffByTClientParentId = tStaffByTClientParentId;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_client_classify_no", referencedColumnName = "t_client_classify_client_classify_no",insertable = false, updatable = false)
    public TClientClassifyEntity gettClientClassifyByTClientClientClassifyNo() {
        return tClientClassifyByTClientClientClassifyNo;
    }

    public void settClientClassifyByTClientClientClassifyNo(TClientClassifyEntity tClientClassifyByTClientClientClassifyNo) {
        this.tClientClassifyByTClientClientClassifyNo = tClientClassifyByTClientClientClassifyNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_client_zone_no", referencedColumnName = "client_zone_client_zone_no",insertable = false, updatable = false)
    public ClientZoneEntity getClientZoneByTClientClientZoneNo() {
        return clientZoneByTClientClientZoneNo;
    }

    public void setClientZoneByTClientClientZoneNo(ClientZoneEntity clientZoneByTClientClientZoneNo) {
        this.clientZoneByTClientClientZoneNo = clientZoneByTClientClientZoneNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_create_no", referencedColumnName = "t_staff_staff_no",insertable = false, updatable = false)
    public TStaffEntity gettStaffByTClientCreateNo() {
        return tStaffByTClientCreateNo;
    }

    public void settStaffByTClientCreateNo(TStaffEntity tStaffByTClientCreateNo) {
        this.tStaffByTClientCreateNo = tStaffByTClientCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "t_client_group_node_id", referencedColumnName = "t_org_group_node_id",insertable = false, updatable = false)
    public TOrgEntity gettOrgByTClientGroupNodeId() {
        return tOrgByTClientGroupNodeId;
    }

    public void settOrgByTClientGroupNodeId(TOrgEntity tOrgByTClientGroupNodeId) {
        this.tOrgByTClientGroupNodeId = tOrgByTClientGroupNodeId;
    }
}
