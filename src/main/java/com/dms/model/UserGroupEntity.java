package com.dms.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_group", schema = "dbo", catalog = "logistics_test")
public class UserGroupEntity {
    private String userGroupUserGroupNo;
    private String userGroupUserGroupName;
    private String userGroupRemark;
    private String userGroupGroupNodeId;
    private String userGroupCreaterNo;
    private Timestamp userGroupCreateDate;
    private String userGroupModifiNo;
    private Timestamp userGroupModifiTime;
    private String userGroupFlag;
    private TOrgEntity tOrgByUserGroupGroupNodeId;
    private TStaffEntity tStaffByUserGroupCreaterNo;
    private TStaffEntity tStaffByUserGroupModifiNo;

    @Id
    @Column(name = "user_group_user_group_no", nullable = false, length = 4)
    public String getUserGroupUserGroupNo() {
        return userGroupUserGroupNo;
    }

    public void setUserGroupUserGroupNo(String userGroupUserGroupNo) {
        this.userGroupUserGroupNo = userGroupUserGroupNo;
    }

    @Basic
    @Column(name = "user_group_user_group_name", nullable = false, length = 50)
    public String getUserGroupUserGroupName() {
        return userGroupUserGroupName;
    }

    public void setUserGroupUserGroupName(String userGroupUserGroupName) {
        this.userGroupUserGroupName = userGroupUserGroupName;
    }

    @Basic
    @Column(name = "user_group_remark", nullable = true, length = 100)
    public String getUserGroupRemark() {
        return userGroupRemark;
    }

    public void setUserGroupRemark(String userGroupRemark) {
        this.userGroupRemark = userGroupRemark;
    }

    @Basic
    @Column(name = "user_group_group_node_id", nullable = false, length = 20)
    public String getUserGroupGroupNodeId() {
        return userGroupGroupNodeId;
    }

    public void setUserGroupGroupNodeId(String userGroupGroupNodeId) {
        this.userGroupGroupNodeId = userGroupGroupNodeId;
    }

    @Basic
    @Column(name = "user_group_creater_no", nullable = true, length = 8)
    public String getUserGroupCreaterNo() {
        return userGroupCreaterNo;
    }

    public void setUserGroupCreaterNo(String userGroupCreaterNo) {
        this.userGroupCreaterNo = userGroupCreaterNo;
    }

    @Basic
    @Column(name = "user_group_create_date", nullable = true)
    public Timestamp getUserGroupCreateDate() {
        return userGroupCreateDate;
    }

    public void setUserGroupCreateDate(Timestamp userGroupCreateDate) {
        this.userGroupCreateDate = userGroupCreateDate;
    }

    @Basic
    @Column(name = "user_group_modifi_no", nullable = true, length = 8)
    public String getUserGroupModifiNo() {
        return userGroupModifiNo;
    }

    public void setUserGroupModifiNo(String userGroupModifiNo) {
        this.userGroupModifiNo = userGroupModifiNo;
    }

    @Basic
    @Column(name = "user_group_modifi_time", nullable = true)
    public Timestamp getUserGroupModifiTime() {
        return userGroupModifiTime;
    }

    public void setUserGroupModifiTime(Timestamp userGroupModifiTime) {
        this.userGroupModifiTime = userGroupModifiTime;
    }

    @Basic
    @Column(name = "user_group_flag", nullable = true, length = 1)
    public String getUserGroupFlag() {
        return userGroupFlag;
    }

    public void setUserGroupFlag(String userGroupFlag) {
        this.userGroupFlag = userGroupFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroupEntity that = (UserGroupEntity) o;

        if (userGroupUserGroupNo != null ? !userGroupUserGroupNo.equals(that.userGroupUserGroupNo) : that.userGroupUserGroupNo != null)
            return false;
        if (userGroupUserGroupName != null ? !userGroupUserGroupName.equals(that.userGroupUserGroupName) : that.userGroupUserGroupName != null)
            return false;
        if (userGroupRemark != null ? !userGroupRemark.equals(that.userGroupRemark) : that.userGroupRemark != null)
            return false;
        if (userGroupGroupNodeId != null ? !userGroupGroupNodeId.equals(that.userGroupGroupNodeId) : that.userGroupGroupNodeId != null)
            return false;
        if (userGroupCreaterNo != null ? !userGroupCreaterNo.equals(that.userGroupCreaterNo) : that.userGroupCreaterNo != null)
            return false;
        if (userGroupCreateDate != null ? !userGroupCreateDate.equals(that.userGroupCreateDate) : that.userGroupCreateDate != null)
            return false;
        if (userGroupModifiNo != null ? !userGroupModifiNo.equals(that.userGroupModifiNo) : that.userGroupModifiNo != null)
            return false;
        if (userGroupModifiTime != null ? !userGroupModifiTime.equals(that.userGroupModifiTime) : that.userGroupModifiTime != null)
            return false;
        if (userGroupFlag != null ? !userGroupFlag.equals(that.userGroupFlag) : that.userGroupFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userGroupUserGroupNo != null ? userGroupUserGroupNo.hashCode() : 0;
        result = 31 * result + (userGroupUserGroupName != null ? userGroupUserGroupName.hashCode() : 0);
        result = 31 * result + (userGroupRemark != null ? userGroupRemark.hashCode() : 0);
        result = 31 * result + (userGroupGroupNodeId != null ? userGroupGroupNodeId.hashCode() : 0);
        result = 31 * result + (userGroupCreaterNo != null ? userGroupCreaterNo.hashCode() : 0);
        result = 31 * result + (userGroupCreateDate != null ? userGroupCreateDate.hashCode() : 0);
        result = 31 * result + (userGroupModifiNo != null ? userGroupModifiNo.hashCode() : 0);
        result = 31 * result + (userGroupModifiTime != null ? userGroupModifiTime.hashCode() : 0);
        result = 31 * result + (userGroupFlag != null ? userGroupFlag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_group_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByUserGroupGroupNodeId() {
        return tOrgByUserGroupGroupNodeId;
    }

    public void settOrgByUserGroupGroupNodeId(TOrgEntity tOrgByUserGroupGroupNodeId) {
        this.tOrgByUserGroupGroupNodeId = tOrgByUserGroupGroupNodeId;
    }

    @ManyToOne
    @JoinColumn(name = "user_group_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByUserGroupCreaterNo() {
        return tStaffByUserGroupCreaterNo;
    }

    public void settStaffByUserGroupCreaterNo(TStaffEntity tStaffByUserGroupCreaterNo) {
        this.tStaffByUserGroupCreaterNo = tStaffByUserGroupCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "user_group_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByUserGroupModifiNo() {
        return tStaffByUserGroupModifiNo;
    }

    public void settStaffByUserGroupModifiNo(TStaffEntity tStaffByUserGroupModifiNo) {
        this.tStaffByUserGroupModifiNo = tStaffByUserGroupModifiNo;
    }
}
