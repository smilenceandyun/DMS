package com.dms.repository.dd;
import com.dms.model.BPurchaseOrdMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by 家铭 on 2017/7/17.
 */
@Repository
public interface BPurchaseOrdMRepository extends JpaRepository<BPurchaseOrdMEntity, String> {
    @Modifying      // 说明该方法是修改操作
    @Transactional
    // 说明该方法是事务性操作a
     //定义查询
     //@Param注解用于提取参数
    @Query("update BPurchaseOrdMEntity bPurchaseOrdM set bPurchaseOrdM.bPurchaseOrdMSalesman=:bPurchaseOrdMSalesman, bPurchaseOrdM.bPurchaseOrdMAdPaymoney=:bPurchaseOrdMAdPaymoney, " +
            "bPurchaseOrdM.bPurchaseOrdMCreateNo=:bPurchaseOrdMCreateNo, bPurchaseOrdM.bPurchaseOrdMHandbillNo=:bPurchaseOrdMHandbillNo, bPurchaseOrdM.bPurchaseOrdMServiceAttribute=:bPurchaseOrdMServiceAttribute, bPurchaseOrdM.bPurchaseOrdMOrdDate=:bPurchaseOrdMOrdDate" +
            ", bPurchaseOrdM.bPurchaseOrdMPaymentType=:bPurchaseOrdMPaymentType, bPurchaseOrdM.bPurchaseOrdMFactoryGoodsNo=:bPurchaseOrdMFactoryGoodsNo, bPurchaseOrdM.bPurchaseOrdMDeliveryDate=:bPurchaseOrdMDeliveryDate, bPurchaseOrdM.bPurchaseOrdMClientNo=:bPurchaseOrdMClientNo" +
            ", bPurchaseOrdM.bPurchaseOrdMNotes=:bPurchaseOrdMNotes where bPurchaseOrdM.bPurchaseOrdMOrdProcureNo=:bPurchaseOrdMOrdProcureNo")
    public void updateOrder(@Param("bPurchaseOrdMSalesman") String bPurchaseOrdMSalesman, @Param("bPurchaseOrdMAdPaymoney") BigDecimal bPurchaseOrdMAdPaymoney,
                            @Param("bPurchaseOrdMCreateNo") String bPurchaseOrdMCreateNo, @Param("bPurchaseOrdMHandbillNo") String bPurchaseOrdMHandbillNo, @Param("bPurchaseOrdMServiceAttribute") String bPurchaseOrdMServiceAttribute
            , @Param("bPurchaseOrdMOrdDate") Timestamp bPurchaseOrdMOrdDate, @Param("bPurchaseOrdMPaymentType") String bPurchaseOrdMPaymentType, @Param("bPurchaseOrdMFactoryGoodsNo") String bPurchaseOrdMFactoryGoodsNo, @Param("bPurchaseOrdMDeliveryDate") String bPurchaseOrdMDeliveryDate
            , @Param("bPurchaseOrdMClientNo") String bPurchaseOrdMClientNo, @Param("bPurchaseOrdMNotes") String bPurchaseOrdMNotes, @Param("bPurchaseOrdMOrdProcureNo") String bPurchaseOrdMOrdProcureNo);

}

