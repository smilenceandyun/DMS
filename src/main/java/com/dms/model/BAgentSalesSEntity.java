package com.dms.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "b_agent_sales_s", schema = "dbo", catalog = "logistics_test")
@IdClass(BAgentSalesSEntityPK.class)
public class BAgentSalesSEntity {
    private String bAgentSalesSAgentSalesNo;
    private String bAgentSalesSRoomNo;
    private String bAgentSalesSLocationNo;
    private String bAgentSalesSGoodsNo;
    private String bAgentSalesSStoreCode;
    private String bAgentSalesSExRequest;
    private String bAgentSalesSMfg;
    private String bAgentSalesSLot;
    private BigDecimal bAgentSalesSTaxRate;
    private BigDecimal bAgentSalesSOrdBoxQuantity;
    private BigDecimal bAgentSalesSSalesQuantity;
    private BigDecimal bAgentSalesSSalesBoxquantity;
    private BigDecimal bAgentSalesSDetailMoney;
    private BigDecimal bAgentSalesSSalesPrice;
    private BigDecimal bAgentSalesSSalesMoney;
    private BigDecimal bAgentSalesSNtuPrice;
    private BigDecimal bAgentSalesSPrice;
    private Integer bAgentSalesSStock;
    private BigDecimal bAgentSalesSPackPrice;
    private String bAgentSalesSCreaterNo;
    private Timestamp bAgentSalesSCreateDate;
    private String bAgentSalesSModifiNo;
    private Timestamp bAgentSalesSModifiTime;
    private String bAgentSalesSChecker;
    private Timestamp bAgentSalesSCheckDate;
    private String bAgentSalesSGroupNodeId;
    private String bAgentSalesSState;
    private String bAgentSalesSNotes;
    private Integer bAgentSalesSPrints;
    private Timestamp bAgentSalesSInvoiceDate;
    private int bAgentSalesSDetailId;
    private String bAgentSalesSIsPass;
    private BAgentSalesMEntity bAgentSalesMByBAgentSalesSAgentSalesNo;
    private StoreLocationEntity storeLocationByBAgentSalesSRoomNo;
    private TGoodsEntity tGoodsByBAgentSalesSGoodsNo;
    private TStaffEntity tStaffByBAgentSalesSCreaterNo;
    private TStaffEntity tStaffByBAgentSalesSModifiNo;
    private TStaffEntity tStaffByBAgentSalesSChecker;
    private TOrgEntity tOrgByBAgentSalesSGroupNodeId;

    @Id
    @Column(name = "b_agent_sales_s_agent_sales_no", nullable = false, length = 16)
    public String getbAgentSalesSAgentSalesNo() {
        return bAgentSalesSAgentSalesNo;
    }

    public void setbAgentSalesSAgentSalesNo(String bAgentSalesSAgentSalesNo) {
        this.bAgentSalesSAgentSalesNo = bAgentSalesSAgentSalesNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_room_no", nullable = false, length = 8)
    public String getbAgentSalesSRoomNo() {
        return bAgentSalesSRoomNo;
    }

    public void setbAgentSalesSRoomNo(String bAgentSalesSRoomNo) {
        this.bAgentSalesSRoomNo = bAgentSalesSRoomNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_location_no", nullable = false, length = 8)
    public String getbAgentSalesSLocationNo() {
        return bAgentSalesSLocationNo;
    }

    public void setbAgentSalesSLocationNo(String bAgentSalesSLocationNo) {
        this.bAgentSalesSLocationNo = bAgentSalesSLocationNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_goods_no", nullable = false, length = 20)
    public String getbAgentSalesSGoodsNo() {
        return bAgentSalesSGoodsNo;
    }

    public void setbAgentSalesSGoodsNo(String bAgentSalesSGoodsNo) {
        this.bAgentSalesSGoodsNo = bAgentSalesSGoodsNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_store_code", nullable = true, length = 80)
    public String getbAgentSalesSStoreCode() {
        return bAgentSalesSStoreCode;
    }

    public void setbAgentSalesSStoreCode(String bAgentSalesSStoreCode) {
        this.bAgentSalesSStoreCode = bAgentSalesSStoreCode;
    }

    @Basic
    @Column(name = "b_agent_sales_s_ex_request", nullable = true, length = 80)
    public String getbAgentSalesSExRequest() {
        return bAgentSalesSExRequest;
    }

    public void setbAgentSalesSExRequest(String bAgentSalesSExRequest) {
        this.bAgentSalesSExRequest = bAgentSalesSExRequest;
    }

    @Basic
    @Column(name = "b_agent_sales_s_MFG", nullable = false, length = 12)
    public String getbAgentSalesSMfg() {
        return bAgentSalesSMfg;
    }

    public void setbAgentSalesSMfg(String bAgentSalesSMfg) {
        this.bAgentSalesSMfg = bAgentSalesSMfg;
    }

    @Basic
    @Column(name = "b_agent_sales_s_LOT", nullable = false, length = 20)
    public String getbAgentSalesSLot() {
        return bAgentSalesSLot;
    }

    public void setbAgentSalesSLot(String bAgentSalesSLot) {
        this.bAgentSalesSLot = bAgentSalesSLot;
    }

    @Basic
    @Column(name = "b_agent_sales_s_tax_rate", nullable = true, precision = 4)
    public BigDecimal getbAgentSalesSTaxRate() {
        return bAgentSalesSTaxRate;
    }

    public void setbAgentSalesSTaxRate(BigDecimal bAgentSalesSTaxRate) {
        this.bAgentSalesSTaxRate = bAgentSalesSTaxRate;
    }

    @Basic
    @Column(name = "b_agent_sales_s_ord_box_quantity", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSOrdBoxQuantity() {
        return bAgentSalesSOrdBoxQuantity;
    }

    public void setbAgentSalesSOrdBoxQuantity(BigDecimal bAgentSalesSOrdBoxQuantity) {
        this.bAgentSalesSOrdBoxQuantity = bAgentSalesSOrdBoxQuantity;
    }

    @Basic
    @Column(name = "b_agent_sales_s_sales_quantity", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSSalesQuantity() {
        return bAgentSalesSSalesQuantity;
    }

    public void setbAgentSalesSSalesQuantity(BigDecimal bAgentSalesSSalesQuantity) {
        this.bAgentSalesSSalesQuantity = bAgentSalesSSalesQuantity;
    }

    @Basic
    @Column(name = "b_agent_sales_s_sales_boxquantity", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSSalesBoxquantity() {
        return bAgentSalesSSalesBoxquantity;
    }

    public void setbAgentSalesSSalesBoxquantity(BigDecimal bAgentSalesSSalesBoxquantity) {
        this.bAgentSalesSSalesBoxquantity = bAgentSalesSSalesBoxquantity;
    }

    @Basic
    @Column(name = "b_agent_sales_s_detail_money", nullable = true, precision = 4)
    public BigDecimal getbAgentSalesSDetailMoney() {
        return bAgentSalesSDetailMoney;
    }

    public void setbAgentSalesSDetailMoney(BigDecimal bAgentSalesSDetailMoney) {
        this.bAgentSalesSDetailMoney = bAgentSalesSDetailMoney;
    }

    @Basic
    @Column(name = "b_agent_sales_s_sales_price", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSSalesPrice() {
        return bAgentSalesSSalesPrice;
    }

    public void setbAgentSalesSSalesPrice(BigDecimal bAgentSalesSSalesPrice) {
        this.bAgentSalesSSalesPrice = bAgentSalesSSalesPrice;
    }

    @Basic
    @Column(name = "b_agent_sales_s_sales_money", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSSalesMoney() {
        return bAgentSalesSSalesMoney;
    }

    public void setbAgentSalesSSalesMoney(BigDecimal bAgentSalesSSalesMoney) {
        this.bAgentSalesSSalesMoney = bAgentSalesSSalesMoney;
    }

    @Basic
    @Column(name = "b_agent_sales_s_Ntu_price", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSNtuPrice() {
        return bAgentSalesSNtuPrice;
    }

    public void setbAgentSalesSNtuPrice(BigDecimal bAgentSalesSNtuPrice) {
        this.bAgentSalesSNtuPrice = bAgentSalesSNtuPrice;
    }

    @Basic
    @Column(name = "b_agent_sales_s_price", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSPrice() {
        return bAgentSalesSPrice;
    }

    public void setbAgentSalesSPrice(BigDecimal bAgentSalesSPrice) {
        this.bAgentSalesSPrice = bAgentSalesSPrice;
    }

    @Basic
    @Column(name = "b_agent_sales_s_Stock", nullable = true)
    public Integer getbAgentSalesSStock() {
        return bAgentSalesSStock;
    }

    public void setbAgentSalesSStock(Integer bAgentSalesSStock) {
        this.bAgentSalesSStock = bAgentSalesSStock;
    }

    @Basic
    @Column(name = "b_agent_sales_s_pack_price", nullable = true, precision = 6)
    public BigDecimal getbAgentSalesSPackPrice() {
        return bAgentSalesSPackPrice;
    }

    public void setbAgentSalesSPackPrice(BigDecimal bAgentSalesSPackPrice) {
        this.bAgentSalesSPackPrice = bAgentSalesSPackPrice;
    }

    @Basic
    @Column(name = "b_agent_sales_s_creater_no", nullable = true, length = 8)
    public String getbAgentSalesSCreaterNo() {
        return bAgentSalesSCreaterNo;
    }

    public void setbAgentSalesSCreaterNo(String bAgentSalesSCreaterNo) {
        this.bAgentSalesSCreaterNo = bAgentSalesSCreaterNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_create_date", nullable = true)
    public Timestamp getbAgentSalesSCreateDate() {
        return bAgentSalesSCreateDate;
    }

    public void setbAgentSalesSCreateDate(Timestamp bAgentSalesSCreateDate) {
        this.bAgentSalesSCreateDate = bAgentSalesSCreateDate;
    }

    @Basic
    @Column(name = "b_agent_sales_s_modifi_no", nullable = true, length = 8)
    public String getbAgentSalesSModifiNo() {
        return bAgentSalesSModifiNo;
    }

    public void setbAgentSalesSModifiNo(String bAgentSalesSModifiNo) {
        this.bAgentSalesSModifiNo = bAgentSalesSModifiNo;
    }

    @Basic
    @Column(name = "b_agent_sales_s_modifi_time", nullable = true)
    public Timestamp getbAgentSalesSModifiTime() {
        return bAgentSalesSModifiTime;
    }

    public void setbAgentSalesSModifiTime(Timestamp bAgentSalesSModifiTime) {
        this.bAgentSalesSModifiTime = bAgentSalesSModifiTime;
    }

    @Basic
    @Column(name = "b_agent_sales_s_checker", nullable = true, length = 8)
    public String getbAgentSalesSChecker() {
        return bAgentSalesSChecker;
    }

    public void setbAgentSalesSChecker(String bAgentSalesSChecker) {
        this.bAgentSalesSChecker = bAgentSalesSChecker;
    }

    @Basic
    @Column(name = "b_agent_sales_s_check_date", nullable = true)
    public Timestamp getbAgentSalesSCheckDate() {
        return bAgentSalesSCheckDate;
    }

    public void setbAgentSalesSCheckDate(Timestamp bAgentSalesSCheckDate) {
        this.bAgentSalesSCheckDate = bAgentSalesSCheckDate;
    }

    @Basic
    @Column(name = "b_agent_sales_s_group_node_id", nullable = false, length = 20)
    public String getbAgentSalesSGroupNodeId() {
        return bAgentSalesSGroupNodeId;
    }

    public void setbAgentSalesSGroupNodeId(String bAgentSalesSGroupNodeId) {
        this.bAgentSalesSGroupNodeId = bAgentSalesSGroupNodeId;
    }

    @Basic
    @Column(name = "b_agent_sales_s_state", nullable = true, length = 1)
    public String getbAgentSalesSState() {
        return bAgentSalesSState;
    }

    public void setbAgentSalesSState(String bAgentSalesSState) {
        this.bAgentSalesSState = bAgentSalesSState;
    }

    @Basic
    @Column(name = "b_agent_sales_s_notes", nullable = true, length = 200)
    public String getbAgentSalesSNotes() {
        return bAgentSalesSNotes;
    }

    public void setbAgentSalesSNotes(String bAgentSalesSNotes) {
        this.bAgentSalesSNotes = bAgentSalesSNotes;
    }

    @Basic
    @Column(name = "b_agent_sales_s_prints", nullable = true)
    public Integer getbAgentSalesSPrints() {
        return bAgentSalesSPrints;
    }

    public void setbAgentSalesSPrints(Integer bAgentSalesSPrints) {
        this.bAgentSalesSPrints = bAgentSalesSPrints;
    }

    @Basic
    @Column(name = "b_agent_sales_s_invoice_date", nullable = true)
    public Timestamp getbAgentSalesSInvoiceDate() {
        return bAgentSalesSInvoiceDate;
    }

    public void setbAgentSalesSInvoiceDate(Timestamp bAgentSalesSInvoiceDate) {
        this.bAgentSalesSInvoiceDate = bAgentSalesSInvoiceDate;
    }

    @Id
    @Column(name = "b_agent_sales_s_detail_id", nullable = false)
    public int getbAgentSalesSDetailId() {
        return bAgentSalesSDetailId;
    }

    public void setbAgentSalesSDetailId(int bAgentSalesSDetailId) {
        this.bAgentSalesSDetailId = bAgentSalesSDetailId;
    }

    @Basic
    @Column(name = "b_agent_sales_s_isPass", nullable = true, length = 1)
    public String getbAgentSalesSIsPass() {
        return bAgentSalesSIsPass;
    }

    public void setbAgentSalesSIsPass(String bAgentSalesSIsPass) {
        this.bAgentSalesSIsPass = bAgentSalesSIsPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BAgentSalesSEntity that = (BAgentSalesSEntity) o;

        if (bAgentSalesSDetailId != that.bAgentSalesSDetailId) return false;
        if (bAgentSalesSAgentSalesNo != null ? !bAgentSalesSAgentSalesNo.equals(that.bAgentSalesSAgentSalesNo) : that.bAgentSalesSAgentSalesNo != null)
            return false;
        if (bAgentSalesSRoomNo != null ? !bAgentSalesSRoomNo.equals(that.bAgentSalesSRoomNo) : that.bAgentSalesSRoomNo != null)
            return false;
        if (bAgentSalesSLocationNo != null ? !bAgentSalesSLocationNo.equals(that.bAgentSalesSLocationNo) : that.bAgentSalesSLocationNo != null)
            return false;
        if (bAgentSalesSGoodsNo != null ? !bAgentSalesSGoodsNo.equals(that.bAgentSalesSGoodsNo) : that.bAgentSalesSGoodsNo != null)
            return false;
        if (bAgentSalesSStoreCode != null ? !bAgentSalesSStoreCode.equals(that.bAgentSalesSStoreCode) : that.bAgentSalesSStoreCode != null)
            return false;
        if (bAgentSalesSExRequest != null ? !bAgentSalesSExRequest.equals(that.bAgentSalesSExRequest) : that.bAgentSalesSExRequest != null)
            return false;
        if (bAgentSalesSMfg != null ? !bAgentSalesSMfg.equals(that.bAgentSalesSMfg) : that.bAgentSalesSMfg != null)
            return false;
        if (bAgentSalesSLot != null ? !bAgentSalesSLot.equals(that.bAgentSalesSLot) : that.bAgentSalesSLot != null)
            return false;
        if (bAgentSalesSTaxRate != null ? !bAgentSalesSTaxRate.equals(that.bAgentSalesSTaxRate) : that.bAgentSalesSTaxRate != null)
            return false;
        if (bAgentSalesSOrdBoxQuantity != null ? !bAgentSalesSOrdBoxQuantity.equals(that.bAgentSalesSOrdBoxQuantity) : that.bAgentSalesSOrdBoxQuantity != null)
            return false;
        if (bAgentSalesSSalesQuantity != null ? !bAgentSalesSSalesQuantity.equals(that.bAgentSalesSSalesQuantity) : that.bAgentSalesSSalesQuantity != null)
            return false;
        if (bAgentSalesSSalesBoxquantity != null ? !bAgentSalesSSalesBoxquantity.equals(that.bAgentSalesSSalesBoxquantity) : that.bAgentSalesSSalesBoxquantity != null)
            return false;
        if (bAgentSalesSDetailMoney != null ? !bAgentSalesSDetailMoney.equals(that.bAgentSalesSDetailMoney) : that.bAgentSalesSDetailMoney != null)
            return false;
        if (bAgentSalesSSalesPrice != null ? !bAgentSalesSSalesPrice.equals(that.bAgentSalesSSalesPrice) : that.bAgentSalesSSalesPrice != null)
            return false;
        if (bAgentSalesSSalesMoney != null ? !bAgentSalesSSalesMoney.equals(that.bAgentSalesSSalesMoney) : that.bAgentSalesSSalesMoney != null)
            return false;
        if (bAgentSalesSNtuPrice != null ? !bAgentSalesSNtuPrice.equals(that.bAgentSalesSNtuPrice) : that.bAgentSalesSNtuPrice != null)
            return false;
        if (bAgentSalesSPrice != null ? !bAgentSalesSPrice.equals(that.bAgentSalesSPrice) : that.bAgentSalesSPrice != null)
            return false;
        if (bAgentSalesSStock != null ? !bAgentSalesSStock.equals(that.bAgentSalesSStock) : that.bAgentSalesSStock != null)
            return false;
        if (bAgentSalesSPackPrice != null ? !bAgentSalesSPackPrice.equals(that.bAgentSalesSPackPrice) : that.bAgentSalesSPackPrice != null)
            return false;
        if (bAgentSalesSCreaterNo != null ? !bAgentSalesSCreaterNo.equals(that.bAgentSalesSCreaterNo) : that.bAgentSalesSCreaterNo != null)
            return false;
        if (bAgentSalesSCreateDate != null ? !bAgentSalesSCreateDate.equals(that.bAgentSalesSCreateDate) : that.bAgentSalesSCreateDate != null)
            return false;
        if (bAgentSalesSModifiNo != null ? !bAgentSalesSModifiNo.equals(that.bAgentSalesSModifiNo) : that.bAgentSalesSModifiNo != null)
            return false;
        if (bAgentSalesSModifiTime != null ? !bAgentSalesSModifiTime.equals(that.bAgentSalesSModifiTime) : that.bAgentSalesSModifiTime != null)
            return false;
        if (bAgentSalesSChecker != null ? !bAgentSalesSChecker.equals(that.bAgentSalesSChecker) : that.bAgentSalesSChecker != null)
            return false;
        if (bAgentSalesSCheckDate != null ? !bAgentSalesSCheckDate.equals(that.bAgentSalesSCheckDate) : that.bAgentSalesSCheckDate != null)
            return false;
        if (bAgentSalesSGroupNodeId != null ? !bAgentSalesSGroupNodeId.equals(that.bAgentSalesSGroupNodeId) : that.bAgentSalesSGroupNodeId != null)
            return false;
        if (bAgentSalesSState != null ? !bAgentSalesSState.equals(that.bAgentSalesSState) : that.bAgentSalesSState != null)
            return false;
        if (bAgentSalesSNotes != null ? !bAgentSalesSNotes.equals(that.bAgentSalesSNotes) : that.bAgentSalesSNotes != null)
            return false;
        if (bAgentSalesSPrints != null ? !bAgentSalesSPrints.equals(that.bAgentSalesSPrints) : that.bAgentSalesSPrints != null)
            return false;
        if (bAgentSalesSInvoiceDate != null ? !bAgentSalesSInvoiceDate.equals(that.bAgentSalesSInvoiceDate) : that.bAgentSalesSInvoiceDate != null)
            return false;
        if (bAgentSalesSIsPass != null ? !bAgentSalesSIsPass.equals(that.bAgentSalesSIsPass) : that.bAgentSalesSIsPass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bAgentSalesSAgentSalesNo != null ? bAgentSalesSAgentSalesNo.hashCode() : 0;
        result = 31 * result + (bAgentSalesSRoomNo != null ? bAgentSalesSRoomNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesSLocationNo != null ? bAgentSalesSLocationNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesSGoodsNo != null ? bAgentSalesSGoodsNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesSStoreCode != null ? bAgentSalesSStoreCode.hashCode() : 0);
        result = 31 * result + (bAgentSalesSExRequest != null ? bAgentSalesSExRequest.hashCode() : 0);
        result = 31 * result + (bAgentSalesSMfg != null ? bAgentSalesSMfg.hashCode() : 0);
        result = 31 * result + (bAgentSalesSLot != null ? bAgentSalesSLot.hashCode() : 0);
        result = 31 * result + (bAgentSalesSTaxRate != null ? bAgentSalesSTaxRate.hashCode() : 0);
        result = 31 * result + (bAgentSalesSOrdBoxQuantity != null ? bAgentSalesSOrdBoxQuantity.hashCode() : 0);
        result = 31 * result + (bAgentSalesSSalesQuantity != null ? bAgentSalesSSalesQuantity.hashCode() : 0);
        result = 31 * result + (bAgentSalesSSalesBoxquantity != null ? bAgentSalesSSalesBoxquantity.hashCode() : 0);
        result = 31 * result + (bAgentSalesSDetailMoney != null ? bAgentSalesSDetailMoney.hashCode() : 0);
        result = 31 * result + (bAgentSalesSSalesPrice != null ? bAgentSalesSSalesPrice.hashCode() : 0);
        result = 31 * result + (bAgentSalesSSalesMoney != null ? bAgentSalesSSalesMoney.hashCode() : 0);
        result = 31 * result + (bAgentSalesSNtuPrice != null ? bAgentSalesSNtuPrice.hashCode() : 0);
        result = 31 * result + (bAgentSalesSPrice != null ? bAgentSalesSPrice.hashCode() : 0);
        result = 31 * result + (bAgentSalesSStock != null ? bAgentSalesSStock.hashCode() : 0);
        result = 31 * result + (bAgentSalesSPackPrice != null ? bAgentSalesSPackPrice.hashCode() : 0);
        result = 31 * result + (bAgentSalesSCreaterNo != null ? bAgentSalesSCreaterNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesSCreateDate != null ? bAgentSalesSCreateDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesSModifiNo != null ? bAgentSalesSModifiNo.hashCode() : 0);
        result = 31 * result + (bAgentSalesSModifiTime != null ? bAgentSalesSModifiTime.hashCode() : 0);
        result = 31 * result + (bAgentSalesSChecker != null ? bAgentSalesSChecker.hashCode() : 0);
        result = 31 * result + (bAgentSalesSCheckDate != null ? bAgentSalesSCheckDate.hashCode() : 0);
        result = 31 * result + (bAgentSalesSGroupNodeId != null ? bAgentSalesSGroupNodeId.hashCode() : 0);
        result = 31 * result + (bAgentSalesSState != null ? bAgentSalesSState.hashCode() : 0);
        result = 31 * result + (bAgentSalesSNotes != null ? bAgentSalesSNotes.hashCode() : 0);
        result = 31 * result + (bAgentSalesSPrints != null ? bAgentSalesSPrints.hashCode() : 0);
        result = 31 * result + (bAgentSalesSInvoiceDate != null ? bAgentSalesSInvoiceDate.hashCode() : 0);
        result = 31 * result + bAgentSalesSDetailId;
        result = 31 * result + (bAgentSalesSIsPass != null ? bAgentSalesSIsPass.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_agent_sales_no", referencedColumnName = "b_agent_sales_m_agent_sales_no", nullable = false)
    public BAgentSalesMEntity getbAgentSalesMByBAgentSalesSAgentSalesNo() {
        return bAgentSalesMByBAgentSalesSAgentSalesNo;
    }

    public void setbAgentSalesMByBAgentSalesSAgentSalesNo(BAgentSalesMEntity bAgentSalesMByBAgentSalesSAgentSalesNo) {
        this.bAgentSalesMByBAgentSalesSAgentSalesNo = bAgentSalesMByBAgentSalesSAgentSalesNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_room_no", referencedColumnName = "store_location_location_no", nullable = false)
    public StoreLocationEntity getStoreLocationByBAgentSalesSRoomNo() {
        return storeLocationByBAgentSalesSRoomNo;
    }

    public void setStoreLocationByBAgentSalesSRoomNo(StoreLocationEntity storeLocationByBAgentSalesSRoomNo) {
        this.storeLocationByBAgentSalesSRoomNo = storeLocationByBAgentSalesSRoomNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_goods_no", referencedColumnName = "t_goods_goods_no", nullable = false)
    public TGoodsEntity gettGoodsByBAgentSalesSGoodsNo() {
        return tGoodsByBAgentSalesSGoodsNo;
    }

    public void settGoodsByBAgentSalesSGoodsNo(TGoodsEntity tGoodsByBAgentSalesSGoodsNo) {
        this.tGoodsByBAgentSalesSGoodsNo = tGoodsByBAgentSalesSGoodsNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_creater_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesSCreaterNo() {
        return tStaffByBAgentSalesSCreaterNo;
    }

    public void settStaffByBAgentSalesSCreaterNo(TStaffEntity tStaffByBAgentSalesSCreaterNo) {
        this.tStaffByBAgentSalesSCreaterNo = tStaffByBAgentSalesSCreaterNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_modifi_no", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesSModifiNo() {
        return tStaffByBAgentSalesSModifiNo;
    }

    public void settStaffByBAgentSalesSModifiNo(TStaffEntity tStaffByBAgentSalesSModifiNo) {
        this.tStaffByBAgentSalesSModifiNo = tStaffByBAgentSalesSModifiNo;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_checker", referencedColumnName = "t_staff_staff_no")
    public TStaffEntity gettStaffByBAgentSalesSChecker() {
        return tStaffByBAgentSalesSChecker;
    }

    public void settStaffByBAgentSalesSChecker(TStaffEntity tStaffByBAgentSalesSChecker) {
        this.tStaffByBAgentSalesSChecker = tStaffByBAgentSalesSChecker;
    }

    @ManyToOne
    @JoinColumn(name = "b_agent_sales_s_group_node_id", referencedColumnName = "t_org_group_node_id", nullable = false)
    public TOrgEntity gettOrgByBAgentSalesSGroupNodeId() {
        return tOrgByBAgentSalesSGroupNodeId;
    }

    public void settOrgByBAgentSalesSGroupNodeId(TOrgEntity tOrgByBAgentSalesSGroupNodeId) {
        this.tOrgByBAgentSalesSGroupNodeId = tOrgByBAgentSalesSGroupNodeId;
    }
}
