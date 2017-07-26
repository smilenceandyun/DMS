package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "b_s_con_m", schema = "dbo", catalog = "logistics_test")
public class BSConMEntity {
    private String bSConMSConBillno;
    private String bSConMClientNo;
    private String bSConMLinkman;
    private String bSConMTel;
    private String bSConMEMail;
    private Timestamp bSConMConDate;
    private Long bSConMValidity;
    private String bSConMGrossMode;
    private String bSConMSalesTypeNo;
    private String bSConMState;
    private Timestamp bSConMCreateDate;
    private Timestamp bSConMModifiTime;
    private Timestamp bSConMCheckDate;
    private String bSConMNotes;
    private String bSConMSalesman;
    private String bSConMGroupNodeId;
    private String bSConMCreateNo;
    private String bSConMModifiNo;
    private String bSConMChecker;
    private String bSConMIsPass;
    private TClientEntity tClientByBSConMClientNo;
    private SalesPropertiesEntity salesPropertiesByBSConMSalesTypeNo;
    private TStaffEntity tStaffByBSConMSalesman;
    private TOrgEntity tOrgByBSConMGroupNodeId;
    private TStaffEntity tStaffByBSConMCreateNo;
    private TStaffEntity tStaffByBSConMModifiNo;
    private TStaffEntity tStaffByBSConMChecker;
    private Collection<BSConSEntity> bSConSByBSConMSConBillno;
    private Collection<BSOrderSEntity> bSOrderSByBSConMSConBillno;

    @Id
    @Column(name = "b_s_con_m_s_con_billno", nullable = false, length = 16)
    public String getbSConMSConBillno() {
        return bSConMSConBillno;
    }

    public void setbSConMSConBillno(String bSConMSConBillno) {
        this.bSConMSConBillno = bSConMSConBillno;
    }

    @Basic
    @Column(name = "b_s_con_m_client_no", nullable = false, length = 20)
    public String getbSConMClientNo() {
        return bSConMClientNo;
    }

    public void setbSConMClientNo(String bSConMClientNo) {
        this.bSConMClientNo = bSConMClientNo;
    }

    @Basic
    @Column(name = "b_s_con_m_linkman", nullable = true, length = 50)
    public String getbSConMLinkman() {
        return bSConMLinkman;
    }

    public void setbSConMLinkman(String bSConMLinkman) {
        this.bSConMLinkman = bSConMLinkman;
    }

    @Basic
    @Column(name = "b_s_con_m_tel", nullable = true, length = 30)
    public String getbSConMTel() {
        return bSConMTel;
    }

    public void setbSConMTel(String bSConMTel) {
        this.bSConMTel = bSConMTel;
    }

    @Basic
    @Column(name = "b_s_con_m_e_mail", nullable = true, length = 100)
    public String getbSConMEMail() {
        return bSConMEMail;
    }

    public void setbSConMEMail(String bSConMEMail) {
        this.bSConMEMail = bSConMEMail;
    }

    @Basic
    @Column(name = "b_s_con_m_con_date", nullable = true)
    public Timestamp getbSConMConDate() {
        return bSConMConDate;
    }

    public void setbSConMConDate(Timestamp bSConMConDate) {
        this.bSConMConDate = bSConMConDate;
    }

    @Basic
    @Column(name = "b_s_con_m_validity", nullable = true)
    public Long getbSConMValidity() {
        return bSConMValidity;
    }

    public void setbSConMValidity(Long bSConMValidity) {
        this.bSConMValidity = bSConMValidity;
    }

    @Basic
    @Column(name = "b_s_con_m_gross_mode", nullable = true, length = 20)
    public String getbSConMGrossMode() {
        return bSConMGrossMode;
    }

    public void setbSConMGrossMode(String bSConMGrossMode) {
        this.bSConMGrossMode = bSConMGrossMode;
    }

    @Basic
    @Column(name = "b_s_con_m_sales_type_no", nullable = true, length = 6)
    public String getbSConMSalesTypeNo() {
        return bSConMSalesTypeNo;
    }

    public void setbSConMSalesTypeNo(String bSConMSalesTypeNo) {
        this.bSConMSalesTypeNo = bSConMSalesTypeNo;
    }

    @Basic
    @Column(name = "b_s_con_m_state", nullable = true, length = 1)
    public String getbSConMState() {
        return bSConMState;
    }

    public void setbSConMState(String bSConMState) {
        this.bSConMState = bSConMState;
    }

    @Basic
    @Column(name = "b_s_con_m_create_date", nullable = true)
    public Timestamp getbSConMCreateDate() {
        return bSConMCreateDate;
    }

    public void setbSConMCreateDate(Timestamp bSConMCreateDate) {
        this.bSConMCreateDate = bSConMCreateDate;
    }

    @Basic
    @Column(name = "b_s_con_m_modifi_time", nullable = true)
    public Timestamp getbSConMModifiTime() {
        return bSConMModifiTime;
    }

    public void setbSConMModifiTime(Timestamp bSConMModifiTime) {
        this.bSConMModifiTime = bSConMModifiTime;
    }

    @Basic
    @Column(name = "b_s_con_m_check_date", nullable = true)
    public Timestamp getbSConMCheckDate() {
        return bSConMCheckDate;
    }

    public void setbSConMCheckDate(Timestamp bSConMCheckDate) {
        this.bSConMCheckDate = bSConMCheckDate;
    }

    @Basic
    @Column(name = "b_s_con_m_notes", nullable = true, length = 200)
    public String getbSConMNotes() {
        return bSConMNotes;
    }

    public void setbSConMNotes(String bSConMNotes) {
        this.bSConMNotes = bSConMNotes;
    }

    @Basic
    @Column(name = "b_s_con_m_salesman", nullable = true, length = 8)
    public String getbSConMSalesman() {
        return bSConMSalesman;
    }

    public void setbSConMSalesman(String bSConMSalesman) {
        this.bSConMSalesman = bSConMSalesman;
    }

    @Basic
    @Column(name = "b_s_con_m_group_node_id", nullable = false, length = 20)
    public String getbSConMGroupNodeId() {
        return bSConMGroupNodeId;
    }

    public void setbSConMGroupNodeId(String bSConMGroupNodeId) {
        this.bSConMGroupNodeId = bSConMGroupNodeId;
    }

    @Basic
    @Column(name = "b_s_con_m_create_no", nullable = true, length = 8)
    public String getbSConMCreateNo() {
        return bSConMCreateNo;
    }

    public void setbSConMCreateNo(String bSConMCreateNo) {
        this.bSConMCreateNo = bSConMCreateNo;
    }

    @Basic
    @Column(name = "b_s_con_m_modifi_no", nullable = true, length = 8)
    public String getbSConMModifiNo() {
        return bSConMModifiNo;
    }

    public void setbSConMModifiNo(String bSConMModifiNo) {
        this.bSConMModifiNo = bSConMModifiNo;
    }

    @Basic
    @Column(name = "b_s_con_m_checker", nullable = true, length = 8)
    public String getbSConMChecker() {
        return bSConMChecker;
    }

    public void setbSConMChecker(String bSConMChecker) {
        this.bSConMChecker = bSConMChecker;
    }

    @Basic
    @Column(name = "b_s_con_m_isPass", nullable = true, length = 1)
    public String getbSConMIsPass() {
        return bSConMIsPass;
    }

    public void setbSConMIsPass(String bSConMIsPass) {
        this.bSConMIsPass = bSConMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSConMEntity that = (BSConMEntity) o;

        if (bSConMSConBillno != null ? !bSConMSConBillno.equals(that.bSConMSConBillno) : that.bSConMSConBillno != null)
            return false;
        if (bSConMClientNo != null ? !bSConMClientNo.equals(that.bSConMClientNo) : that.bSConMClientNo != null)
            return false;
        if (bSConMLinkman != null ? !bSConMLinkman.equals(that.bSConMLinkman) : that.bSConMLinkman != null)
            return false;
        if (bSConMTel != null ? !bSConMTel.equals(that.bSConMTel) : that.bSConMTel != null) return false;
        if (bSConMEMail != null ? !bSConMEMail.equals(that.bSConMEMail) : that.bSConMEMail != null) return false;
        if (bSConMConDate != null ? !bSConMConDate.equals(that.bSConMConDate) : that.bSConMConDate != null)
            return false;
        if (bSConMValidity != null ? !bSConMValidity.equals(that.bSConMValidity) : that.bSConMValidity != null)
            return false;
        if (bSConMGrossMode != null ? !bSConMGrossMode.equals(that.bSConMGrossMode) : that.bSConMGrossMode != null)
            return false;
        if (bSConMSalesTypeNo != null ? !bSConMSalesTypeNo.equals(that.bSConMSalesTypeNo) : that.bSConMSalesTypeNo != null)
            return false;
        if (bSConMState != null ? !bSConMState.equals(that.bSConMState) : that.bSConMState != null) return false;
        if (bSConMCreateDate != null ? !bSConMCreateDate.equals(that.bSConMCreateDate) : that.bSConMCreateDate != null)
            return false;
        if (bSConMModifiTime != null ? !bSConMModifiTime.equals(that.bSConMModifiTime) : that.bSConMModifiTime != null)
            return false;
        if (bSConMCheckDate != null ? !bSConMCheckDate.equals(that.bSConMCheckDate) : that.bSConMCheckDate != null)
            return false;
        if (bSConMNotes != null ? !bSConMNotes.equals(that.bSConMNotes) : that.bSConMNotes != null) return false;
        if (bSConMSalesman != null ? !bSConMSalesman.equals(that.bSConMSalesman) : that.bSConMSalesman != null)
            return false;
        if (bSConMGroupNodeId != null ? !bSConMGroupNodeId.equals(that.bSConMGroupNodeId) : that.bSConMGroupNodeId != null)
            return false;
        if (bSConMCreateNo != null ? !bSConMCreateNo.equals(that.bSConMCreateNo) : that.bSConMCreateNo != null)
            return false;
        if (bSConMModifiNo != null ? !bSConMModifiNo.equals(that.bSConMModifiNo) : that.bSConMModifiNo != null)
            return false;
        if (bSConMChecker != null ? !bSConMChecker.equals(that.bSConMChecker) : that.bSConMChecker != null)
            return false;
        if (bSConMIsPass != null ? !bSConMIsPass.equals(that.bSConMIsPass) : that.bSConMIsPass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSConMSConBillno != null ? bSConMSConBillno.hashCode() : 0;
        result = 31 * result + (bSConMClientNo != null ? bSConMClientNo.hashCode() : 0);
        result = 31 * result + (bSConMLinkman != null ? bSConMLinkman.hashCode() : 0);
        result = 31 * result + (bSConMTel != null ? bSConMTel.hashCode() : 0);
        result = 31 * result + (bSConMEMail != null ? bSConMEMail.hashCode() : 0);
        result = 31 * result + (bSConMConDate != null ? bSConMConDate.hashCode() : 0);
        result = 31 * result + (bSConMValidity != null ? bSConMValidity.hashCode() : 0);
        result = 31 * result + (bSConMGrossMode != null ? bSConMGrossMode.hashCode() : 0);
        result = 31 * result + (bSConMSalesTypeNo != null ? bSConMSalesTypeNo.hashCode() : 0);
        result = 31 * result + (bSConMState != null ? bSConMState.hashCode() : 0);
        result = 31 * result + (bSConMCreateDate != null ? bSConMCreateDate.hashCode() : 0);
        result = 31 * result + (bSConMModifiTime != null ? bSConMModifiTime.hashCode() : 0);
        result = 31 * result + (bSConMCheckDate != null ? bSConMCheckDate.hashCode() : 0);
        result = 31 * result + (bSConMNotes != null ? bSConMNotes.hashCode() : 0);
        result = 31 * result + (bSConMSalesman != null ? bSConMSalesman.hashCode() : 0);
        result = 31 * result + (bSConMGroupNodeId != null ? bSConMGroupNodeId.hashCode() : 0);
        result = 31 * result + (bSConMCreateNo != null ? bSConMCreateNo.hashCode() : 0);
        result = 31 * result + (bSConMModifiNo != null ? bSConMModifiNo.hashCode() : 0);
        result = 31 * result + (bSConMChecker != null ? bSConMChecker.hashCode() : 0);
        result = 31 * result + (bSConMIsPass != null ? bSConMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_client_no", referencedColumnName = "t_client_client_no", nullable = false)
    public TClientEntity gettClientByBSConMClientNo() {
        return tClientByBSConMClientNo;
    }

    public void settClientByBSConMClientNo(TClientEntity tClientByBSConMClientNo) {
        this.tClientByBSConMClientNo = tClientByBSConMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_sales_type_no", referencedColumnName = "sales_properties_sales_type_no")
    public SalesPropertiesEntity getSalesPropertiesByBSConMSalesTypeNo() {
        return salesPropertiesByBSConMSalesTypeNo;
    }

    public void setSalesPropertiesByBSConMSalesTypeNo(SalesPropertiesEntity salesPropertiesByBSConMSalesTypeNo) {
        this.salesPropertiesByBSConMSalesTypeNo = salesPropertiesByBSConMSalesTypeNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_salesman", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSConMSalesman() {
        return tStaffByBSConMSalesman;
    }

    public void settStaffByBSConMSalesman(TStaffEntity tStaffByBSConMSalesman) {
        this.tStaffByBSConMSalesman = tStaffByBSConMSalesman;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBSConMGroupNodeId() {
        return tOrgByBSConMGroupNodeId;
    }

    public void settOrgByBSConMGroupNodeId(TOrgEntity tOrgByBSConMGroupNodeId) {
        this.tOrgByBSConMGroupNodeId = tOrgByBSConMGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSConMCreateNo() {
        return tStaffByBSConMCreateNo;
    }

    public void settStaffByBSConMCreateNo(TStaffEntity tStaffByBSConMCreateNo) {
        this.tStaffByBSConMCreateNo = tStaffByBSConMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSConMModifiNo() {
        return tStaffByBSConMModifiNo;
    }

    public void settStaffByBSConMModifiNo(TStaffEntity tStaffByBSConMModifiNo) {
        this.tStaffByBSConMModifiNo = tStaffByBSConMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_con_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBSConMChecker() {
        return tStaffByBSConMChecker;
    }

    public void settStaffByBSConMChecker(TStaffEntity tStaffByBSConMChecker) {
        this.tStaffByBSConMChecker = tStaffByBSConMChecker;
    }

    @OneToMany(mappedBy = "bSConMByBSConSSConBillno")
    public Collection<BSConSEntity> getbSConSByBSConMSConBillno() {
        return bSConSByBSConMSConBillno;
    }

    public void setbSConSByBSConMSConBillno(Collection<BSConSEntity> bSConSByBSConMSConBillno) {
        this.bSConSByBSConMSConBillno = bSConSByBSConMSConBillno;
    }

    @OneToMany(mappedBy = "bSConMByBSOrderSSConBillno")
    public Collection<BSOrderSEntity> getbSOrderSByBSConMSConBillno() {
        return bSOrderSByBSConMSConBillno;
    }

    public void setbSOrderSByBSConMSConBillno(Collection<BSOrderSEntity> bSOrderSByBSConMSConBillno) {
        this.bSOrderSByBSConMSConBillno = bSOrderSByBSConMSConBillno;
    }
}
