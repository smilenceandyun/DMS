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

    //通过采购合同明细号查询一条采购合同明细
    @Transactional(timeout = 10)
    @Query("select cPurchaseConS from CPurchaseConSEntity cPurchaseConS where cPurchaseConS.cPurchaseConSPurchasConNo = ?1")
    List<CPurchaseConSEntity> findBypurchasConNo(String cPurchaseConSPurchasConNo);

    //通过采购合同ID与明细ID查询一条明细内容
    CPurchaseConSEntity findCPurchaseConSEntitiesByCPurchaseConSPurchasConNoAndCPurchaseConSDetailIdEquals(String cPurchaseConSPurchasConNo, Integer detailid);

    //删除一条采购合同及该合同下所有明细
    @Transactional
    @Modifying
    @Query("delete from CPurchaseConSEntity where cPurchaseConSPurchasConNo in (:cPurchaseConMPurchasConNo)")
    public void deleteAllBycPurchaseConMPurchasConNoEquals(@Param("cPurchaseConMPurchasConNo") String cPurchaseConMPurchasConNo);

    //删除明细
    @Transactional
    @Modifying
    @Query("delete from CPurchaseConSEntity where cPurchaseConSPurchasConNo in (:cPurchaseConSPurchasConNo) and cPurchaseConSDetailId in (:cPurchaseConSDetailId)")
    public void deleteCPurchaseConSEntity(@Param("cPurchaseConSPurchasConNo") String cPurchaseConSPurchasConNo, @Param("cPurchaseConSDetailId") Integer cPurchaseConSDetailId );

    //找到该所有明细的最大DetailID
    @Transactional
    @Query("select max(cPurchasConM.cPurchaseConSDetailId) from CPurchaseConSEntity cPurchasConM where cPurchasConM.cPurchaseConSPurchasConNo = ?1")
    Integer  findMaxDetailId(String PurchasConNo);
}
