package com.dms.repository.ht;

import com.dms.model.CPurchaseConSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alex on 2017/8/2.
 */

@Repository
public interface CPurchaseConSRepository extends JpaRepository<CPurchaseConSEntity, String> {
    @Transactional(timeout = 10)
    @Query("select cPurchaseConS from CPurchaseConSEntity cPurchaseConS where cPurchaseConS.cPurchaseConSPurchasConNo = ?1")
    List<CPurchaseConSEntity> findBypurchasConNo(String cPurchaseConSPurchasConNo);

    CPurchaseConSEntity findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(String cPurchaseConSPurchasConNo, Integer detailid);

    @Transactional
    @Modifying
    @Query("delete from CPurchaseConSEntity where cPurchaseConSPurchasConNo in (:cPurchaseConSPurchasConNo) and cPurchaseConSDetailId in (:cPurchaseConSDetailId)")
    public void deleteCPurchaseConSEntity(@Param("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @Param("cPurchaseConSDetailId") Integer cPurchaseConSDetailId );

    @Transactional
    @Query("select max(cPurchasConM.cPurchaseConSDetailId) from CPurchaseConSEntity cPurchasConM where cPurchasConM.cPurchaseConSPurchasConNo = ?1")
    Integer  findMaxDetailId(String PurchasConNo);
}
