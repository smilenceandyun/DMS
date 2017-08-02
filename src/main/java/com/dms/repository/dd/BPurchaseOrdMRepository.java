package com.dms.repository.dd;
import com.dms.model.BPurchaseOrdMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 家铭 on 2017/7/17.
 */
@Repository
public interface BPurchaseOrdMRepository extends JpaRepository<BPurchaseOrdMEntity, String> {
//    @Modifying      // 说明该方法是修改操作
//    @Transactional
//    // 说明该方法是事务性操作a
//     //定义查询
//     //@Param注解用于提取参数
//    @Query("update BPurchaseOrdMEntity bPurchaseOrdM set bPurchaseOrdM.ordProcureNo=:qOrdProcureNo, bPurchaseOrdM.factoryBillno=:qFactoryBillno, " +
//            "bPurchaseOrdM.handbillNo=:qHandbillNo, bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.paymentAttributer=:qPaymentAttributer, bPurchaseOrdM.ordDate=:qOrdDate" +
//            ", bPurchaseOrdM.deliveryDate=:qDeliveryDate, bPurchaseOrdM.factoryBillno=:qFactoryBillno, bPurchaseOrdM.discount=:qDiscount, bPurchaseOrdM.serviceAttribute=:qServiceAttribute" +
//            ", bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney" +
//            ", bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney, bPurchaseOrdM.adPaymoney=:qAdPaymoney" +
//            "  where bPurchaseOrdM.paymentAttributer=:qPaymentAttributer")
//    public void updatePurOrder(@Param("qDetaile1") String detaile1, @Param("qDetaile2") String detaile2,
//                               @Param("qDetaile3") String detaile3, @Param("qDetaile4") String detaile4, @Param("qId") int detaileId);

}

