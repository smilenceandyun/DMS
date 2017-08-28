package com.dms.repository.sale;

import com.dms.model.BPurchaseOrdSEntity;
import com.dms.model.BSOrderSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BSOrderSRepository  extends JpaRepository<BSOrderSEntity, String> {

    //======================================================================================================
    List<BSOrderSEntity> findBSOrderSEntitiesByBSOrderSSOrderNoEquals(String id);
//

    //-----------通过销售订货单号（BSOrderSSOrderNo）和明细ID（BSOrderSDetailId）查询 BSOrderSEntity里的一条内容--------------
    BSOrderSEntity findBSOrderSEntitiesByBSOrderSSOrderNoAndBSOrderSDetailIdEquals(String id,Integer detailID);

    //-----------通过销售订货单号（BSOrderSSOrderNo）和明细ID（BSOrderSDetailId）删除 BSOrderSEntity里的一条内容--------------
    @Transactional
    @Modifying
    @Query("delete from BSOrderSEntity where bSOrderSSOrderNo in (:bSOrderSSOrderNo) and bSOrderSDetailId in (:bSOrderSDetailId)")
    public void deleteBSOrderSEntity(@Param("bSOrderSSOrderNo") String bSOrderSSOrderNo,@Param("bSOrderSDetailId") Integer bSOrderSDetailId );

    //======================================================================================================

    //-----------通过销售订货单号（bSOrderSSOrderNo）删除 BSOrderSEntity里的所有内容--------------
    @Transactional
    @Modifying
    @Query("delete from BSOrderSEntity where bSOrderSSOrderNo in (:bSOrderSSOrderNo)")
    public void deleteALLBSOrderSEntity(@Param("bSOrderSSOrderNo") String bSOrderSSOrderNo );


    //找到该所有明细的最大DetailID
    @Transactional
    @Query("select max(bSOrderM.bSOrderSDetailId) from BSOrderSEntity bSOrderM where bSOrderM.bSOrderSSOrderNo = ?1")
    Integer  findMaxDetailId(String bSOrderNo );

}