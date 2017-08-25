package com.dms.repository.th;

import com.dms.model.BRProcureSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alex on 2017/8/3.
 */

@Repository
public interface BRProcureSRepository extends JpaRepository<BRProcureSEntity, String> {

    List<BRProcureSEntity> findBRProcureSEntitiesBybRProcureSRProcureNoEquals(String id);

    BRProcureSEntity findBRProcureSEntitiesBybRProcureSRProcureNoAndBRProcureSDetailIdEquals(String id,Integer detailID);

    @Transactional
    @Query("select max(bRProcureSEntity.bRProcureSDetailId) from BRProcureSEntity bRProcureSEntity where bRProcureSEntity.bRProcureSRProcureNo = ?1")
    Integer  findMaxDetailId(String ordProcureNo);

    @Transactional
    @Modifying
    @Query("delete from BRProcureSEntity where bRProcureSRProcureNo in (:bRProcureSRProcureNo) and bRProcureSDetailId in (:bRProcureSDetailId)")
    public void deleteBRProcureSEntity(@Param("bRProcureSRProcureNo") String bRProcureSRProcureNo, @Param("bRProcureSDetailId") Integer bRProcureSDetailId );
}