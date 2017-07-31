package com.dms.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hibernate_sequence", schema = "dbo", catalog = "logistics")
public class HibernateSequenceEntity {
    private int nextVal;
    private String id;

    @Basic
    @Column(name = "next_val", nullable = false, precision = 0)
    public int getNextVal() {
        return nextVal;
    }

    public void setNextVal(int nextVal) {
        this.nextVal = nextVal;
    }

    @javax.persistence.Id
    @Column(name = "id", nullable = true, length = 255)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HibernateSequenceEntity that = (HibernateSequenceEntity) o;

        if (nextVal != that.nextVal) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nextVal;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
