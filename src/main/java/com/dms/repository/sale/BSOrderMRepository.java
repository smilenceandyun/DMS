package com.dms.repository.sale;

import com.dms.model.BPurchaseOrdMEntity;
import com.dms.model.BSOrderMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Repository
public interface BSOrderMRepository  extends JpaRepository<BSOrderMEntity, String> {
    @Modifying      // 说明该方法是修改操作
    @Transactional
    // 说明该方法是事务性操作a
    //定义查询
    //@Param注解用于提取参数
    @Query("update BSOrderMEntity bSOrderM set bSOrderM.bSOrderMSalesman=:bSOrderMSalesman, bSOrderM.bSOrderMAdPaymoney=:bSOrderMAdPaymoney, " +
            "bSOrderM.bSOrderMCreateNo=:bSOrderMCreateNo, bSOrderM.bSOrderMOrderNo=:bSOrderMOrderNo, bSOrderM.bSOrderMSalesTypeNo=:bSOrderMSalesTypeNo, bSOrderM.bSOrderMSalesDiscount=:bSOrderMSalesDiscount" +
            ", bSOrderM.bSOrderMClientNo=:bSOrderMClientNo, bSOrderM.bSOrderMSendDate=:bSOrderMSendDate, bSOrderM.bSOrderMClientAddress=:bSOrderMClientAddress, bSOrderM.bSOrderMCreateDate=:bSOrderMCreateDate" +
            ", bSOrderM.bSOrderMNotes=:bSOrderMNotes,bSOrderM.bSOrderMOrdDate=:bSOrderMOrdDate where bSOrderM.bSOrderMSOrderNo=:bSOrderMSOrderNo")
    public void updateOrder(@Param("bSOrderMSalesman") String bSOrderMSalesman, @Param("bSOrderMAdPaymoney") BigDecimal bSOrderMAdPaymoney,
                            @Param("bSOrderMCreateNo") String bSOrderMCreateNo, @Param("bSOrderMOrderNo") String bSOrderMOrderNo, @Param("bSOrderMSalesTypeNo") String bSOrderMSalesTypeNo,@Param("bSOrderMSalesDiscount")  BigDecimal bSOrderMSalesDiscount
            ,@Param("bSOrderMClientNo") String bSOrderMClientNo, @Param("bSOrderMSendDate") Timestamp bSOrderMSendDate,  @Param("bSOrderMClientAddress") String bSOrderMClientAddress, @Param("bSOrderMCreateDate") Timestamp bSOrderMCreateDate
            , @Param("bSOrderMNotes") String bSOrderMNotes, @Param("bSOrderMOrdDate") Timestamp bSOrderMOrdDate, @Param("bSOrderMSOrderNo") String bSOrderMSOrderNo);


    // BPurchaseOrdMEntity findBPurchaseOrdMEntitiesByBPurchaseOrdMOrdProcureNoEqual(String id);

    BSOrderMEntity findBSOrderMEntityByBSOrderMSOrderNoEquals(String id);
}
