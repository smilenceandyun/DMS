package com.dms.model.procure;

import javax.persistence.*;
import java.sql.Timestamp;
//aaaaaaaaaaaaaaaaaaaawssssssssssssssssssssss
@Entity
@Table(name = "b_procure_m", schema = "dbo", catalog = "logistics_test")
public class BProcureMEntity {
    private String procureNo;
    private String handbillNo;
    private Timestamp createDate;
    private Timestamp modifiTime;
    private Timestamp checkDate;
    private String state;
    private String notes;
    private Integer prints;

    @Id
    @Column(name = "procure_no")
    public String getProcureNo() {
        return procureNo;
    }

    public void setProcureNo(String procureNo) {
        this.procureNo = procureNo;
    }

    @Basic
    @Column(name = "handbill_no")
    public String getHandbillNo() {
        return handbillNo;
    }

    public void setHandbillNo(String handbillNo) {
        this.handbillNo = handbillNo;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifi_time")
    public Timestamp getModifiTime() {
        return modifiTime;
    }

    public void setModifiTime(Timestamp modifiTime) {
        this.modifiTime = modifiTime;
    }

    @Basic
    @Column(name = "check_date")
    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "prints")
    public Integer getPrints() {
        return prints;
    }

    public void setPrints(Integer prints) {
        this.prints = prints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BProcureMEntity that = (BProcureMEntity) o;

        if (procureNo != null ? !procureNo.equals(that.procureNo) : that.procureNo != null) return false;
        if (handbillNo != null ? !handbillNo.equals(that.handbillNo) : that.handbillNo != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifiTime != null ? !modifiTime.equals(that.modifiTime) : that.modifiTime != null) return false;
        if (checkDate != null ? !checkDate.equals(that.checkDate) : that.checkDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (prints != null ? !prints.equals(that.prints) : that.prints != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = procureNo != null ? procureNo.hashCode() : 0;
        result = 31 * result + (handbillNo != null ? handbillNo.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifiTime != null ? modifiTime.hashCode() : 0);
        result = 31 * result + (checkDate != null ? checkDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (prints != null ? prints.hashCode() : 0);
        return result;
    }
}
