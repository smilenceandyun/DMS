package com.dms.repository.sale;

import com.dms.model.BOutPresentSEntity;
import com.dms.model.BSOrderSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BOutPresentSRepository  extends JpaRepository<BOutPresentSEntity, String> {
    @Transactional(timeout = 10)
    @Query("select bOutPresentS from BOutPresentSEntity bOutPresentS  where bOutPresentS.bOutPresentSOutPresentNo = ?1")
    List<BOutPresentSEntity>findBOutPresentSEntitiesByBOutPresentSOutPresentNoEquals(String id);
    //-----------通过赠品出库单号（BOutPresentSOutPresentNo）和明细ID（BOutPresentSDetailId）查询BOutPresentSEntity里的一条内容--------------
    BOutPresentSEntity findBOutPresentSEntitiesByBOutPresentSOutPresentNoAndAndBOutPresentSDetailIdEquals(String BOutPresentSOutPresentNo,Integer detailid );

    //-----------通过赠品出库单号（BOutPresentSOutPresentNo）和明细ID（BOutPresentSDetailId）删除 BSOrderSEntity里的一条内容--------------
    @Transactional
    @Modifying
    @Query("delete from BOutPresentSEntity where bOutPresentSOutPresentNo in (:bOutPresentSOutPresentNo) and bOutPresentSDetailId in (:bOutPresentSDetailId)")
    public void deleteBOutPresentSEntity(@Param("bOutPresentSOutPresentNo") String bOutPresentSOutPresentNo, @Param("bOutPresentSDetailId") Integer bOutPresentSDetailId );

    //======================================================================================================

    //-----------通过赠品出库单号（BOutPresentSOutPresentNo）删除BOutPresentSEntity 里的所有内容--------------
    @Transactional
    @Modifying
    @Query("delete from BOutPresentSEntity  where bOutPresentSOutPresentNo in (:bOutPresentSOutPresentNo)")
    public void deleteAllBOutPresentSEntity(@Param("bOutPresentSOutPresentNo") String bOutPresentSOutPresentNo );

    //找到该所有明细的最大DetailID
    @Transactional
    @Query("select max(bOutPresentS.bOutPresentSDetailId) from BOutPresentSEntity bOutPresentS where bOutPresentS.bOutPresentSOutPresentNo = ?1")
    Integer  findMaxDetailId(String bOutPresentSOutPresentNo );


}