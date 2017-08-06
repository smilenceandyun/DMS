package com.dms.repository.dd;

import com.dms.model.BPurchaseOrdSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 家铭 on 2017/7/17.
 */
@Repository
public interface BPurchaseOrdSRepository extends JpaRepository<BPurchaseOrdSEntity, String> {
    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update BPurchaseOrdSEntity detaileorder set detaileorder.bPurchaseOrdSFactoryGoodsNo=:bPurchaseOrdSFactoryGoodsNo, detaileorder.bPurchaseOrdSPresentationProperty=:bPurchaseOrdSPresentationProperty, " +
            "detaileorder.bPurchaseOrdSGoodsNo=:bPurchaseOrdSGoodsNo, detaileorder.bPurchaseOrdSOriginalPrice=:bPurchaseOrdSOriginalPrice, detaileorder.bPurchaseOrdSTaxRate=:bPurchaseOrdSTaxRate," +
            "detaileorder.bPurchaseOrdSRoomNo=:bPurchaseOrdSRoomNo,detaileorder.bPurchaseOrdSPrice=:bPurchaseOrdSPrice,detaileorder.bPurchaseOrdSQuantity=:bPurchaseOrdSQuantity,detaileorder.bPurchaseOrdSDetailMoney=:bPurchaseOrdSDetailMoney" +
            ",detaileorder.bPurchaseOrdSBoxQuantity=:bPurchaseOrdSBoxQuantity,detaileorder.bPurchaseOrdSBoxPrice=:bPurchaseOrdSBoxPrice, detaileorder.bPurchaseOrdSPaymentNo=:bPurchaseOrdSPaymentNo" +
            ",detaileorder.bPurchaseOrdSMfg=:bPurchaseOrdSMfg,detaileorder.bPurchaseOrdSExp=:bPurchaseOrdSExp where detaileorder.bPurchaseOrdSDetailId=:bPurchaseOrdSDetailId and detaileorder.bPurchaseOrdSOrdProcureNo=:bPurchaseOrdSOrdProcureNo")
    public void updateDetailOrder(@Param("bPurchaseOrdSFactoryGoodsNo") String bPurchaseOrdSFactoryGoodsNo, @Param("bPurchaseOrdSPresentationProperty") String bPurchaseOrdSPresentationProperty,
                               @Param("bPurchaseOrdSGoodsNo") String bPurchaseOrdSGoodsNo, @Param("bPurchaseOrdSOriginalPrice") BigDecimal bPurchaseOrdSOriginalPrice, @Param("bPurchaseOrdSTaxRate") BigDecimal bPurchaseOrdSTaxRate,
                               @Param("bPurchaseOrdSRoomNo") String bPurchaseOrdSRoomNo,@Param("bPurchaseOrdSPrice") BigDecimal bPurchaseOrdSPrice,@Param("bPurchaseOrdSQuantity") BigDecimal bPurchaseOrdSQuantity,@Param("bPurchaseOrdSDetailMoney") BigDecimal bPurchaseOrdSDetailMoney,
                               @Param("bPurchaseOrdSBoxQuantity") BigDecimal bPurchaseOrdSBoxQuantity,@Param("bPurchaseOrdSBoxPrice") BigDecimal bPurchaseOrdSBoxPrice,@Param("bPurchaseOrdSPaymentNo") String bPurchaseOrdSPaymentNo,@Param("bPurchaseOrdSMfg") String bPurchaseOrdSMfg,
                               @Param("bPurchaseOrdSExp") String bPurchaseOrdSExp,@Param("bPurchaseOrdSDetailId") int bPurchaseOrdSDetailId,@Param("bPurchaseOrdSOrdProcureNo") String bPurchaseOrdSOrdProcureNo);
//@Transactional(timeout = 10)
//@Query("select bPurchaseOrdS from BPurchaseOrdSEntity bPurchaseOrdS where bPurchaseOrdS.bPurchaseOrdSOrdProcureNo = ?1")
//    List<BPurchaseOrdSEntity> findByordProcureNo(java.lang.String ordProcureNo);

    //-----------通过采购订单号（BPurchaseOrdSOrdProcureNo）返回BPurchaseOrdSEntity里的所有内容--------------
    //-----------格式：find  |  BPurchaseOrdSEntities  |  By  |  BPurchaseOrdSOrdProcureNo  |  Equals  (String id)
    List<BPurchaseOrdSEntity> findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoEquals(String id);

    //======================================================================================================

    //-----------通过采购订单号（BPurchaseOrdSOrdProcureNo）和明细ID（BPurchaseOrdSDetailId）返回BPurchaseOrdSEntity里的一条内容--------------
    //-----------格式：find  |  BPurchaseOrdSEntities  |  By  |  BPurchaseOrdSOrdProcureNo  |  And  |  BPurchaseOrdSDetailId   |   Equals  (String id,Integer detailID)
    BPurchaseOrdSEntity findBPurchaseOrdSEntitiesByBPurchaseOrdSOrdProcureNoAndBPurchaseOrdSDetailIdEquals(String id,Integer detailID);

    //======================================================================================================

    //-----------通过采购订单号（BPurchaseOrdSOrdProcureNo）和明细ID（BPurchaseOrdSDetailId）删除 BPurchaseOrdSEntity里的一条内容--------------

    @Transactional
    @Modifying
    @Query("delete from BPurchaseOrdSEntity where bPurchaseOrdSOrdProcureNo in (:bPurchaseOrdSOrdProcureNo) and bPurchaseOrdSDetailId in (:bPurchaseOrdSDetailId)")
    public void deleteBPurchaseOrdSEntity(@Param("bPurchaseOrdSOrdProcureNo") String bPurchaseOrdSOrdProcureNo,@Param("bPurchaseOrdSDetailId") Integer bPurchaseOrdSDetailId );

    //======================================================================================================

    //-----------通过采购订单号（BPurchaseOrdSOrdProcureNo）删除 BPurchaseOrdSEntity里的所有内容--------------
    @Transactional
    @Modifying
    @Query("delete from BPurchaseOrdSEntity where bPurchaseOrdSOrdProcureNo in (:bPurchaseOrdSOrdProcureNo)")
    public void deleteALLBPurchaseOrdSEntity(@Param("bPurchaseOrdSOrdProcureNo") String bPurchaseOrdSOrdProcureNo );

    @Transactional
    @Query("select max(bPurchaseOrdS.bPurchaseOrdSDetailId) from BPurchaseOrdSEntity bPurchaseOrdS where bPurchaseOrdS.bPurchaseOrdSOrdProcureNo = ?1")
    Integer  findMaxDetailId(String ordProcureNo);


}

