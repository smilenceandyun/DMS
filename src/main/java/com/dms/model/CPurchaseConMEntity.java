package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "c_purchase_con_m", schema = "dbo", catalog = "logistics_test")
public class CPurchaseConMEntity {
    private String cPurchaseConMPurchasConNo;
    private String cPurchaseConMClientNo;
    private Timestamp cPurchaseConMConDate;
    private String cPurchaseConMFactoryGoodsNo;
    private int cPurchaseConMValidity;
    private String cPurchaseConMSalesman;
    private String cPurchaseConMCustomerSalesmanName;
    private String cPurchaseConMGrossMode;
    private String cPurchaseConMState;
    private String cPurchaseConMCreateNo;
    private Timestamp cPurchaseConMCreateDate;
    private String cPurchaseConMModifiNo;
    private Timestamp cPurchaseConMModifiTime;
    private String cPurchaseConMChecker;
    private String cPurchaseConMGroupNodeId;
    private Timestamp cPurchaseConMCheckDate;
    private String cPurchaseConMNotes;
    private String cPurchaseConMIsPass;
    private Collection<BPurchaseOrdSEntity> bPurchaseOrdSByCPurchaseConMPurchasConNo;
    private TClientEntity tClientByCPurchaseConMClientNo;
    private TFactorysEntity tFactorysByCPurchaseConMFactoryGoodsNo;
    private TStaffEntity tStaffByCPurchaseConMSalesman;
    private TStaffEntity tStaffByCPurchaseConMCreateNo;
    private TStaffEntity tStaffByCPurchaseConMModifiNo;
    private TStaffEntity tStaffByCPurchaseConMChecker;
    private TOrgEntity tOrgByCPurchaseConMGroupNodeId;

    @Id
    @Column(name = "c_purchase_con_m_purchas_con_no", nullable = false, length = 16)
    public String getcPurchaseConMPurchasConNo() {
        return cPurchaseConMPurchasConNo;
    }

    public void setcPurchaseConMPurchasConNo(String cPurchaseConMPurchasConNo) {
        this.cPurchaseConMPurchasConNo = cPurchaseConMPurchasConNo;
    }

    @Basic
    @Column(name = "c_purchase_con_m_client_no", nullable = true, length = 20)
    public String getcPurchaseConMClientNo() {
        return cPurchaseConMClientNo;
    }

    public void setcPurchaseConMClientNo(String cPurchaseConMClientNo) {
        this.cPurchaseConMClientNo = cPurchaseConMClientNo;
    }

    @Basic
    @Column(name = "c_purchase_con_m_con_date", nullable = true)
    public Timestamp getcPurchaseConMConDate() {
        return cPurchaseConMConDate;
    }

    public void setcPurchaseConMConDate(Timestamp cPurchaseConMConDate) {
        this.cPurchaseConMConDate = cPurchaseConMConDate;
    }

    @Basic
    @Column(name = "c_purchase_con_m_factory_goods_no", nullable = true, length = 80)
    public String getcPurchaseConMFactoryGoodsNo() {
        return cPurchaseConMFactoryGoodsNo;
    }

    public void setcPurchaseConMFactoryGoodsNo(String cPurchaseConMFactoryGoodsNo) {
        this.cPurchaseConMFactoryGoodsNo = cPurchaseConMFactoryGoodsNo;
    }

    @Basic
    @Column(name = "c_purchase_con_m_validity", nullable = false)
    public int getcPurchaseConMValidity() {
        return cPurchaseConMValidity;
    }

    public void setcPurchaseConMValidity(int cPurchaseConMValidity) {
        this.cPurchaseConMValidity = cPurchaseConMValidity;
    }

    @Basic
    @Column(name = "c_purchase_con_m_salesman", nullable = true, length = 8)
    public String getcPurchaseConMSalesman() {
        return cPurchaseConMSalesman;
    }

    public void setcPurchaseConMSalesman(String cPurchaseConMSalesman) {
        this.cPurchaseConMSalesman = cPurchaseConMSalesman;
    }

    @Basic
    @Column(name = "c_purchase_con_m_customer_salesman_name", nullable = true, length = 50)
    public String getcPurchaseConMCustomerSalesmanName() {
        return cPurchaseConMCustomerSalesmanName;
    }

    public void setcPurchaseConMCustomerSalesmanName(String cPurchaseConMCustomerSalesmanName) {
        this.cPurchaseConMCustomerSalesmanName = cPurchaseConMCustomerSalesmanName;
    }

    @Basic
    @Column(name = "c_purchase_con_m_gross_mode", nullable = true, length = 20)
    public String getcPurchaseConMGrossMode() {
        return cPurchaseConMGrossMode;
    }

    public void setcPurchaseConMGrossMode(String cPurchaseConMGrossMode) {
        this.cPurchaseConMGrossMode = cPurchaseConMGrossMode;
    }

    @Basic
    @Column(name = "c_purchase_con_m_state", nullable = false, length = 1)
    public String getcPurchaseConMState() {
        return cPurchaseConMState;
    }

    public void setcPurchaseConMState(String cPurchaseConMState) {
        this.cPurchaseConMState = cPurchaseConMState;
    }

    @Basic
    @Column(name = "c_purchase_con_m_create_no", nullable = true, length = 8)
    public String getcPurchaseConMCreateNo() {
        return cPurchaseConMCreateNo;
    }

    public void setcPurchaseConMCreateNo(String cPurchaseConMCreateNo) {
        this.cPurchaseConMCreateNo = cPurchaseConMCreateNo;
    }

    @Basic
    @Column(name = "c_purchase_con_m_create_date", nullable = true)
    public Timestamp getcPurchaseConMCreateDate() {
        return cPurchaseConMCreateDate;
    }

    public void setcPurchaseConMCreateDate(Timestamp cPurchaseConMCreateDate) {
        this.cPurchaseConMCreateDate = cPurchaseConMCreateDate;
    }

    @Basic
    @Column(name = "c_purchase_con_m_modifi_no", nullable = true, length = 8)
    public String getcPurchaseConMModifiNo() {
        return cPurchaseConMModifiNo;
    }

    public void setcPurchaseConMModifiNo(String cPurchaseConMModifiNo) {
        this.cPurchaseConMModifiNo = cPurchaseConMModifiNo;
    }

    @Basic
    @Column(name = "c_purchase_con_m_modifi_time", nullable = true)
    public Timestamp getcPurchaseConMModifiTime() {
        return cPurchaseConMModifiTime;
    }

    public void setcPurchaseConMModifiTime(Timestamp cPurchaseConMModifiTime) {
        this.cPurchaseConMModifiTime = cPurchaseConMModifiTime;
    }

    @Basic
    @Column(name = "c_purchase_con_m_checker", nullable = true, length = 8)
    public String getcPurchaseConMChecker() {
        return cPurchaseConMChecker;
    }

    public void setcPurchaseConMChecker(String cPurchaseConMChecker) {
        this.cPurchaseConMChecker = cPurchaseConMChecker;
    }

    @Basic
    @Column(name = "c_purchase_con_m_group_node_id", nullable = true, length = 20)
    public String getcPurchaseConMGroupNodeId() {
        return cPurchaseConMGroupNodeId;
    }

    public void setcPurchaseConMGroupNodeId(String cPurchaseConMGroupNodeId) {
        this.cPurchaseConMGroupNodeId = cPurchaseConMGroupNodeId;
    }

    @Basic
    @Column(name = "c_purchase_con_m_check_date", nullable = true)
    public Timestamp getcPurchaseConMCheckDate() {
        return cPurchaseConMCheckDate;
    }

    public void setcPurchaseConMCheckDate(Timestamp cPurchaseConMCheckDate) {
        this.cPurchaseConMCheckDate = cPurchaseConMCheckDate;
    }

    @Basic
    @Column(name = "c_purchase_con_m_notes", nullable = true, length = 200)
    public String getcPurchaseConMNotes() {
        return cPurchaseConMNotes;
    }

    public void setcPurchaseConMNotes(String cPurchaseConMNotes) {
        this.cPurchaseConMNotes = cPurchaseConMNotes;
    }

    @Basic
    @Column(name = "c_purchase_con_m_isPass", nullable = true, length = 1)
    public String getcPurchaseConMIsPass() {
        return cPurchaseConMIsPass;
    }

    public void setcPurchaseConMIsPass(String cPurchaseConMIsPass) {
        this.cPurchaseConMIsPass = cPurchaseConMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPurchaseConMEntity that = (CPurchaseConMEntity) o;

        if (cPurchaseConMValidity != that.cPurchaseConMValidity) return false;
        if (cPurchaseConMPurchasConNo != null ? !cPurchaseConMPurchasConNo.equals(that.cPurchaseConMPurchasConNo) : that.cPurchaseConMPurchasConNo != null)
            return false;
        if (cPurchaseConMClientNo != null ? !cPurchaseConMClientNo.equals(that.cPurchaseConMClientNo) : that.cPurchaseConMClientNo != null)
            return false;
        if (cPurchaseConMConDate != null ? !cPurchaseConMConDate.equals(that.cPurchaseConMConDate) : that.cPurchaseConMConDate != null)
            return false;
        if (cPurchaseConMFactoryGoodsNo != null ? !cPurchaseConMFactoryGoodsNo.equals(that.cPurchaseConMFactoryGoodsNo) : that.cPurchaseConMFactoryGoodsNo != null)
            return false;
        if (cPurchaseConMSalesman != null ? !cPurchaseConMSalesman.equals(that.cPurchaseConMSalesman) : that.cPurchaseConMSalesman != null)
            return false;
        if (cPurchaseConMCustomerSalesmanName != null ? !cPurchaseConMCustomerSalesmanName.equals(that.cPurchaseConMCustomerSalesmanName) : that.cPurchaseConMCustomerSalesmanName != null)
            return false;
        if (cPurchaseConMGrossMode != null ? !cPurchaseConMGrossMode.equals(that.cPurchaseConMGrossMode) : that.cPurchaseConMGrossMode != null)
            return false;
        if (cPurchaseConMState != null ? !cPurchaseConMState.equals(that.cPurchaseConMState) : that.cPurchaseConMState != null)
            return false;
        if (cPurchaseConMCreateNo != null ? !cPurchaseConMCreateNo.equals(that.cPurchaseConMCreateNo) : that.cPurchaseConMCreateNo != null)
            return false;
        if (cPurchaseConMCreateDate != null ? !cPurchaseConMCreateDate.equals(that.cPurchaseConMCreateDate) : that.cPurchaseConMCreateDate != null)
            return false;
        if (cPurchaseConMModifiNo != null ? !cPurchaseConMModifiNo.equals(that.cPurchaseConMModifiNo) : that.cPurchaseConMModifiNo != null)
            return false;
        if (cPurchaseConMModifiTime != null ? !cPurchaseConMModifiTime.equals(that.cPurchaseConMModifiTime) : that.cPurchaseConMModifiTime != null)
            return false;
        if (cPurchaseConMChecker != null ? !cPurchaseConMChecker.equals(that.cPurchaseConMChecker) : that.cPurchaseConMChecker != null)
            return false;
        if (cPurchaseConMGroupNodeId != null ? !cPurchaseConMGroupNodeId.equals(that.cPurchaseConMGroupNodeId) : that.cPurchaseConMGroupNodeId != null)
            return false;
        if (cPurchaseConMCheckDate != null ? !cPurchaseConMCheckDate.equals(that.cPurchaseConMCheckDate) : that.cPurchaseConMCheckDate != null)
            return false;
        if (cPurchaseConMNotes != null ? !cPurchaseConMNotes.equals(that.cPurchaseConMNotes) : that.cPurchaseConMNotes != null)
            return false;
        if (cPurchaseConMIsPass != null ? !cPurchaseConMIsPass.equals(that.cPurchaseConMIsPass) : that.cPurchaseConMIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cPurchaseConMPurchasConNo != null ? cPurchaseConMPurchasConNo.hashCode() : 0;
        result = 31 * result + (cPurchaseConMClientNo != null ? cPurchaseConMClientNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConMConDate != null ? cPurchaseConMConDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConMFactoryGoodsNo != null ? cPurchaseConMFactoryGoodsNo.hashCode() : 0);
        result = 31 * result + cPurchaseConMValidity;
        result = 31 * result + (cPurchaseConMSalesman != null ? cPurchaseConMSalesman.hashCode() : 0);
        result = 31 * result + (cPurchaseConMCustomerSalesmanName != null ? cPurchaseConMCustomerSalesmanName.hashCode() : 0);
        result = 31 * result + (cPurchaseConMGrossMode != null ? cPurchaseConMGrossMode.hashCode() : 0);
        result = 31 * result + (cPurchaseConMState != null ? cPurchaseConMState.hashCode() : 0);
        result = 31 * result + (cPurchaseConMCreateNo != null ? cPurchaseConMCreateNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConMCreateDate != null ? cPurchaseConMCreateDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConMModifiNo != null ? cPurchaseConMModifiNo.hashCode() : 0);
        result = 31 * result + (cPurchaseConMModifiTime != null ? cPurchaseConMModifiTime.hashCode() : 0);
        result = 31 * result + (cPurchaseConMChecker != null ? cPurchaseConMChecker.hashCode() : 0);
        result = 31 * result + (cPurchaseConMGroupNodeId != null ? cPurchaseConMGroupNodeId.hashCode() : 0);
        result = 31 * result + (cPurchaseConMCheckDate != null ? cPurchaseConMCheckDate.hashCode() : 0);
        result = 31 * result + (cPurchaseConMNotes != null ? cPurchaseConMNotes.hashCode() : 0);
        result = 31 * result + (cPurchaseConMIsPass != null ? cPurchaseConMIsPass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cPurchaseConMByBPurchaseOrdSPurchasConNo")
    public Collection<BPurchaseOrdSEntity> getbPurchaseOrdSByCPurchaseConMPurchasConNo() {
        return bPurchaseOrdSByCPurchaseConMPurchasConNo;
    }

    public void setbPurchaseOrdSByCPurchaseConMPurchasConNo(Collection<BPurchaseOrdSEntity> bPurchaseOrdSByCPurchaseConMPurchasConNo) {
        this.bPurchaseOrdSByCPurchaseConMPurchasConNo = bPurchaseOrdSByCPurchaseConMPurchasConNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_client_no", referencedColumnName = "t_client_client_no")
    public TClientEntity gettClientByCPurchaseConMClientNo() {
        return tClientByCPurchaseConMClientNo;
    }

    public void settClientByCPurchaseConMClientNo(TClientEntity tClientByCPurchaseConMClientNo) {
        this.tClientByCPurchaseConMClientNo = tClientByCPurchaseConMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_factory_goods_no", referencedColumnName = "t_factorys_factory_goods_no")
    public TFactorysEntity gettFactorysByCPurchaseConMFactoryGoodsNo() {
        return tFactorysByCPurchaseConMFactoryGoodsNo;
    }

    public void settFactorysByCPurchaseConMFactoryGoodsNo(TFactorysEntity tFactorysByCPurchaseConMFactoryGoodsNo) {
        this.tFactorysByCPurchaseConMFactoryGoodsNo = tFactorysByCPurchaseConMFactoryGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByCPurchaseConMSalesman() {
        return tStaffByCPurchaseConMSalesman;
    }

    public void settStaffByCPurchaseConMSalesman(TStaffEntity tStaffByCPurchaseConMSalesman) {
        this.tStaffByCPurchaseConMSalesman = tStaffByCPurchaseConMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByCPurchaseConMCreateNo() {
        return tStaffByCPurchaseConMCreateNo;
    }

    public void settStaffByCPurchaseConMCreateNo(TStaffEntity tStaffByCPurchaseConMCreateNo) {
        this.tStaffByCPurchaseConMCreateNo = tStaffByCPurchaseConMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByCPurchaseConMModifiNo() {
        return tStaffByCPurchaseConMModifiNo;
    }

    public void settStaffByCPurchaseConMModifiNo(TStaffEntity tStaffByCPurchaseConMModifiNo) {
        this.tStaffByCPurchaseConMModifiNo = tStaffByCPurchaseConMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByCPurchaseConMChecker() {
        return tStaffByCPurchaseConMChecker;
    }

    public void settStaffByCPurchaseConMChecker(TStaffEntity tStaffByCPurchaseConMChecker) {
        this.tStaffByCPurchaseConMChecker = tStaffByCPurchaseConMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "c_purchase_con_m_group_node_id", referencedColumnName = "t_org_group_node_id")
    public TOrgEntity gettOrgByCPurchaseConMGroupNodeId() {
        return tOrgByCPurchaseConMGroupNodeId;
    }

    public void settOrgByCPurchaseConMGroupNodeId(TOrgEntity tOrgByCPurchaseConMGroupNodeId) {
        this.tOrgByCPurchaseConMGroupNodeId = tOrgByCPurchaseConMGroupNodeId;
    }
}
