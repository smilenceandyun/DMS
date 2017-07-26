package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "f_con_m", schema = "dbo", catalog = "logistics_test")
public class FConMEntity {
    private String fConMSConBillno;
    private Timestamp fConMConDate;
    private Timestamp fConMBeginDate;
    private String fConMClientNo;
    private Timestamp fConMValidityDate;
    private String fConMState;
    private Timestamp fConMCreateDate;
    private String fConMCreateNo;
    private String fConMModifiNo;
    private String fConMChecker;
    private String fConMSalesman;
    private Timestamp fConMModifiTime;
    private Timestamp fConMCheckDate;
    private String fConMNotes;
    private String fConMGroupNodeId;
    private String fConMIsPass;
    private TClientEntity tClientByFConMClientNo;
    private TStaffEntity tStaffByFConMCreateNo;
    private TStaffEntity tStaffByFConMModifiNo;
    private TStaffEntity tStaffByFConMChecker;
    private TOrgEntity tOrgByFConMGroupNodeId;
    private Collection<FConSEntity> fConSByFConMSConBillno;

    @Id
    @Column(name = "f_con_m_s_con_billno", nullable = false, length = 16)
    public String getfConMSConBillno() {
        return fConMSConBillno;
    }

    public void setfConMSConBillno(String fConMSConBillno) {
        this.fConMSConBillno = fConMSConBillno;
    }

    @Basic
    @Column(name = "f_con_m_con_date", nullable = true)
    public Timestamp getfConMConDate() {
        return fConMConDate;
    }

    public void setfConMConDate(Timestamp fConMConDate) {
        this.fConMConDate = fConMConDate;
    }

    @Basic
    @Column(name = "f_con_m_begin_date", nullable = true)
    public Timestamp getfConMBeginDate() {
        return fConMBeginDate;
    }

    public void setfConMBeginDate(Timestamp fConMBeginDate) {
        this.fConMBeginDate = fConMBeginDate;
    }

    @Basic
    @Column(name = "f_con_m_client_no", nullable = true, length = 20)
    public String getfConMClientNo() {
        return fConMClientNo;
    }

    public void setfConMClientNo(String fConMClientNo) {
        this.fConMClientNo = fConMClientNo;
    }

    @Basic
    @Column(name = "f_con_m_validity_date", nullable = true)
    public Timestamp getfConMValidityDate() {
        return fConMValidityDate;
    }

    public void setfConMValidityDate(Timestamp fConMValidityDate) {
        this.fConMValidityDate = fConMValidityDate;
    }

    @Basic
    @Column(name = "f_con_m_state", nullable = true, length = 1)
    public String getfConMState() {
        return fConMState;
    }

    public void setfConMState(String fConMState) {
        this.fConMState = fConMState;
    }

    @Basic
    @Column(name = "f_con_m_create_date", nullable = true)
    public Timestamp getfConMCreateDate() {
        return fConMCreateDate;
    }

    public void setfConMCreateDate(Timestamp fConMCreateDate) {
        this.fConMCreateDate = fConMCreateDate;
    }

    @Basic
    @Column(name = "f_con_m_create_no", nullable = true, length = 8)
    public String getfConMCreateNo() {
        return fConMCreateNo;
    }

    public void setfConMCreateNo(String fConMCreateNo) {
        this.fConMCreateNo = fConMCreateNo;
    }

    @Basic
    @Column(name = "f_con_m_modifi_no", nullable = true, length = 8)
    public String getfConMModifiNo() {
        return fConMModifiNo;
    }

    public void setfConMModifiNo(String fConMModifiNo) {
        this.fConMModifiNo = fConMModifiNo;
    }

    @Basic
    @Column(name = "f_con_m_checker", nullable = true, length = 8)
    public String getfConMChecker() {
        return fConMChecker;
    }

    public void setfConMChecker(String fConMChecker) {
        this.fConMChecker = fConMChecker;
    }

    @Basic
    @Column(name = "f_con_m_salesman", nullable = true, length = 20)
    public String getfConMSalesman() {
        return fConMSalesman;
    }

    public void setfConMSalesman(String fConMSalesman) {
        this.fConMSalesman = fConMSalesman;
    }

    @Basic
    @Column(name = "f_con_m_modifi_time", nullable = true)
    public Timestamp getfConMModifiTime() {
        return fConMModifiTime;
    }

    public void setfConMModifiTime(Timestamp fConMModifiTime) {
        this.fConMModifiTime = fConMModifiTime;
    }

    @Basic
    @Column(name = "f_con_m_check_date", nullable = true)
    public Timestamp getfConMCheckDate() {
        return fConMCheckDate;
    }

    public void setfConMCheckDate(Timestamp fConMCheckDate) {
        this.fConMCheckDate = fConMCheckDate;
    }

    @Basic
    @Column(name = "f_con_m_notes", nullable = true, length = 200)
    public String getfConMNotes() {
        return fConMNotes;
    }

    public void setfConMNotes(String fConMNotes) {
        this.fConMNotes = fConMNotes;
    }

    @Basic
    @Column(name = "f_con_m_group_node_id", nullable = false, length = 20)
    public String getfConMGroupNodeId() {
        return fConMGroupNodeId;
    }

    public void setfConMGroupNodeId(String fConMGroupNodeId) {
        this.fConMGroupNodeId = fConMGroupNodeId;
    }

    @Basic
    @Column(name = "f_con_m_isPass", nullable = true, length = 1)
    public String getfConMIsPass() {
        return fConMIsPass;
    }

    public void setfConMIsPass(String fConMIsPass) {
        this.fConMIsPass = fConMIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FConMEntity that = (FConMEntity) o;

        if (fConMSConBillno != null ? !fConMSConBillno.equals(that.fConMSConBillno) : that.fConMSConBillno != null)
            return false;
        if (fConMConDate != null ? !fConMConDate.equals(that.fConMConDate) : that.fConMConDate != null) return false;
        if (fConMBeginDate != null ? !fConMBeginDate.equals(that.fConMBeginDate) : that.fConMBeginDate != null)
            return false;
        if (fConMClientNo != null ? !fConMClientNo.equals(that.fConMClientNo) : that.fConMClientNo != null)
            return false;
        if (fConMValidityDate != null ? !fConMValidityDate.equals(that.fConMValidityDate) : that.fConMValidityDate != null)
            return false;
        if (fConMState != null ? !fConMState.equals(that.fConMState) : that.fConMState != null) return false;
        if (fConMCreateDate != null ? !fConMCreateDate.equals(that.fConMCreateDate) : that.fConMCreateDate != null)
            return false;
        if (fConMCreateNo != null ? !fConMCreateNo.equals(that.fConMCreateNo) : that.fConMCreateNo != null)
            return false;
        if (fConMModifiNo != null ? !fConMModifiNo.equals(that.fConMModifiNo) : that.fConMModifiNo != null)
            return false;
        if (fConMChecker != null ? !fConMChecker.equals(that.fConMChecker) : that.fConMChecker != null) return false;
        if (fConMSalesman != null ? !fConMSalesman.equals(that.fConMSalesman) : that.fConMSalesman != null)
            return false;
        if (fConMModifiTime != null ? !fConMModifiTime.equals(that.fConMModifiTime) : that.fConMModifiTime != null)
            return false;
        if (fConMCheckDate != null ? !fConMCheckDate.equals(that.fConMCheckDate) : that.fConMCheckDate != null)
            return false;
        if (fConMNotes != null ? !fConMNotes.equals(that.fConMNotes) : that.fConMNotes != null) return false;
        if (fConMGroupNodeId != null ? !fConMGroupNodeId.equals(that.fConMGroupNodeId) : that.fConMGroupNodeId != null)
            return false;
        if (fConMIsPass != null ? !fConMIsPass.equals(that.fConMIsPass) : that.fConMIsPass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fConMSConBillno != null ? fConMSConBillno.hashCode() : 0;
        result = 31 * result + (fConMConDate != null ? fConMConDate.hashCode() : 0);
        result = 31 * result + (fConMBeginDate != null ? fConMBeginDate.hashCode() : 0);
        result = 31 * result + (fConMClientNo != null ? fConMClientNo.hashCode() : 0);
        result = 31 * result + (fConMValidityDate != null ? fConMValidityDate.hashCode() : 0);
        result = 31 * result + (fConMState != null ? fConMState.hashCode() : 0);
        result = 31 * result + (fConMCreateDate != null ? fConMCreateDate.hashCode() : 0);
        result = 31 * result + (fConMCreateNo != null ? fConMCreateNo.hashCode() : 0);
        result = 31 * result + (fConMModifiNo != null ? fConMModifiNo.hashCode() : 0);
        result = 31 * result + (fConMChecker != null ? fConMChecker.hashCode() : 0);
        result = 31 * result + (fConMSalesman != null ? fConMSalesman.hashCode() : 0);
        result = 31 * result + (fConMModifiTime != null ? fConMModifiTime.hashCode() : 0);
        result = 31 * result + (fConMCheckDate != null ? fConMCheckDate.hashCode() : 0);
        result = 31 * result + (fConMNotes != null ? fConMNotes.hashCode() : 0);
        result = 31 * result + (fConMGroupNodeId != null ? fConMGroupNodeId.hashCode() : 0);
        result = 31 * result + (fConMIsPass != null ? fConMIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_m_client_no", referencedColumnName = "t_client_client_no")
    public TClientEntity gettClientByFConMClientNo() {
        return tClientByFConMClientNo;
    }

    public void settClientByFConMClientNo(TClientEntity tClientByFConMClientNo) {
        this.tClientByFConMClientNo = tClientByFConMClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_m_create_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConMCreateNo() {
        return tStaffByFConMCreateNo;
    }

    public void settStaffByFConMCreateNo(TStaffEntity tStaffByFConMCreateNo) {
        this.tStaffByFConMCreateNo = tStaffByFConMCreateNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_m_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConMModifiNo() {
        return tStaffByFConMModifiNo;
    }

    public void settStaffByFConMModifiNo(TStaffEntity tStaffByFConMModifiNo) {
        this.tStaffByFConMModifiNo = tStaffByFConMModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_m_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByFConMChecker() {
        return tStaffByFConMChecker;
    }

    public void settStaffByFConMChecker(TStaffEntity tStaffByFConMChecker) {
        this.tStaffByFConMChecker = tStaffByFConMChecker;
    }

    @ManyToOne
    @JoinColumn(name = "f_con_m_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByFConMGroupNodeId() {
        return tOrgByFConMGroupNodeId;
    }

    public void settOrgByFConMGroupNodeId(TOrgEntity tOrgByFConMGroupNodeId) {
        this.tOrgByFConMGroupNodeId = tOrgByFConMGroupNodeId;
    }

    @OneToMany(mappedBy = "fConMByFConSSConBillno")
    public Collection<FConSEntity> getfConSByFConMSConBillno() {
        return fConSByFConMSConBillno;
    }

    public void setfConSByFConMSConBillno(Collection<FConSEntity> fConSByFConMSConBillno) {
        this.fConSByFConMSConBillno = fConSByFConMSConBillno;
    }
}
