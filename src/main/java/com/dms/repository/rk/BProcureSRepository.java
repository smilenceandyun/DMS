
package com.dms.repository.rk;


import com.dms.model.BProcureSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jc on 2017/7/25.
 */
@Repository
public interface BProcureSRepository extends JpaRepository<BProcureSEntity,String> {
//    @Modifying      // 说明该方法是修改操作
//    @Transactional
    // 说明该方法是事务性操作
     //定义查询
     //@Param注解用于提取参数

    //查询某条明细
    @Query(value = " select b from BProcureSEntity b where b.bProcureSDetailId = :id and b.bProcureSProcureNo = :no")
    List<BProcureSEntity> findByBProcureSProcureNoAndBProcureSDetailIdEquals(@Param("no") String no, @Param("id") Integer id);

    //查询该bProcureSProcureNo下所有明细
    @Query(value = " select b from BProcureSEntity b where b.bProcureSProcureNo = :id")
    List<BProcureSEntity> findByBProcureSProcureNoEquals(@Param("id") String id);

    //找到该bProcureSProcureNo下所有明细的最大DetailID 没有明细时报AopInvocationException异常
    @Query(value = " select max (b.bProcureSDetailId) from BProcureSEntity b where b.bProcureSProcureNo = :no")
    int findMaxDetailID(@Param("no") String no);

    //删除明细
    @Transactional
    @Modifying
    @Query(value = "delete from BProcureSEntity b where b.bProcureSDetailId = :id and b.bProcureSProcureNo = :no")
    int deleteByBProcureSProcureNoAndBProcureSDetailIdEquals(@Param("no") String no, @Param("id") Integer id);

    //删除bProcureSProcureNo下所有明细
    @Transactional
    @Modifying
    @Query(value = "delete from BProcureSEntity b where b.bProcureSProcureNo = :no")
    int deleteAllByBProcureSProcureNoEquals(@Param("no") String no);
}

