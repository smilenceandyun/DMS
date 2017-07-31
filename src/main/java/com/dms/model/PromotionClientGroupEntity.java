package com.dms.model;

import javax.persistence.*;

@Entity
@Table(name = "Promotion_client_group", schema = "dbo", catalog = "logistics")
@IdClass(PromotionClientGroupEntityPK.class)
public class PromotionClientGroupEntity {
    private String promotionClientGroupPromotionNo;
    private String promotionClientGroupClientNo;
    private int promotionClientGroupIndexId;
    private String promotionClientGroupGroupNodeId;
    private PromotionMEntity promotionMByPromotionClientGroupPromotionNo;
    private TClientEntity tClientByPromotionClientGroupClientNo;
    private TOrgEntity tOrgByPromotionClientGroupGroupNodeId;

    @Id
    @Column(name = "Promotion_client_group_Promotion_no", nullable = false, length = 16)
    public String getPromotionClientGroupPromotionNo() {
        return promotionClientGroupPromotionNo;
    }

    public void setPromotionClientGroupPromotionNo(String promotionClientGroupPromotionNo) {
        this.promotionClientGroupPromotionNo = promotionClientGroupPromotionNo;
    }

    @Basic
    @Column(name = "Promotion_client_group_client_no", nullable = false, length = 20)
    public String getPromotionClientGroupClientNo() {
        return promotionClientGroupClientNo;
    }

    public void setPromotionClientGroupClientNo(String promotionClientGroupClientNo) {
        this.promotionClientGroupClientNo = promotionClientGroupClientNo;
    }

    @Id
    @Column(name = "Promotion_client_group_index_id", nullable = false)
    public int getPromotionClientGroupIndexId() {
        return promotionClientGroupIndexId;
    }

    public void setPromotionClientGroupIndexId(int promotionClientGroupIndexId) {
        this.promotionClientGroupIndexId = promotionClientGroupIndexId;
    }

    @Basic
    @Column(name = "Promotion_client_group_group_node_id", nullable = false, length = 20)
    public String getPromotionClientGroupGroupNodeId() {
        return promotionClientGroupGroupNodeId;
    }

    public void setPromotionClientGroupGroupNodeId(String promotionClientGroupGroupNodeId) {
        this.promotionClientGroupGroupNodeId = promotionClientGroupGroupNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionClientGroupEntity that = (PromotionClientGroupEntity) o;

        if (promotionClientGroupIndexId != that.promotionClientGroupIndexId) return false;
        if (promotionClientGroupPromotionNo != null ? !promotionClientGroupPromotionNo.equals(that.promotionClientGroupPromotionNo) : that.promotionClientGroupPromotionNo != null)
            return false;
        if (promotionClientGroupClientNo != null ? !promotionClientGroupClientNo.equals(that.promotionClientGroupClientNo) : that.promotionClientGroupClientNo != null)
            return false;
        if (promotionClientGroupGroupNodeId != null ? !promotionClientGroupGroupNodeId.equals(that.promotionClientGroupGroupNodeId) : that.promotionClientGroupGroupNodeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionClientGroupPromotionNo != null ? promotionClientGroupPromotionNo.hashCode() : 0;
        result = 31 * result + (promotionClientGroupClientNo != null ? promotionClientGroupClientNo.hashCode() : 0);
        result = 31 * result + promotionClientGroupIndexId;
        result = 31 * result + (promotionClientGroupGroupNodeId != null ? promotionClientGroupGroupNodeId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_client_group_Promotion_no", referencedColumnName = "Promotion_m_Promotion_no", nullable = false,insertable = false, updatable = false)
    public PromotionMEntity getPromotionMByPromotionClientGroupPromotionNo() {
        return promotionMByPromotionClientGroupPromotionNo;
    }

    public void setPromotionMByPromotionClientGroupPromotionNo(PromotionMEntity promotionMByPromotionClientGroupPromotionNo) {
        this.promotionMByPromotionClientGroupPromotionNo = promotionMByPromotionClientGroupPromotionNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_client_group_client_no", referencedColumnName = "t_client_client_no", nullable = false,insertable = false, updatable = false)
    public TClientEntity gettClientByPromotionClientGroupClientNo() {
        return tClientByPromotionClientGroupClientNo;
    }

    public void settClientByPromotionClientGroupClientNo(TClientEntity tClientByPromotionClientGroupClientNo) {
        this.tClientByPromotionClientGroupClientNo = tClientByPromotionClientGroupClientNo;
    }

    @ManyToOne
    @JoinColumn(name = "Promotion_client_group_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false,insertable = false, updatable = false)
    public TOrgEntity gettOrgByPromotionClientGroupGroupNodeId() {
        return tOrgByPromotionClientGroupGroupNodeId;
    }

    public void settOrgByPromotionClientGroupGroupNodeId(TOrgEntity tOrgByPromotionClientGroupGroupNodeId) {
        this.tOrgByPromotionClientGroupGroupNodeId = tOrgByPromotionClientGroupGroupNodeId;
    }
}
