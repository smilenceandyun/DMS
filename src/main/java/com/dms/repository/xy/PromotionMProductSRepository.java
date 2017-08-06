
package com.dms.repository.xy;


import com.dms.model.PromotionMProductSEntity;
import com.dms.model.PromotionMSEntity;
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
public interface PromotionMProductSRepository extends JpaRepository<PromotionMProductSEntity,String> {
//    @Modifying      // 说明该方法是修改操作
//    @Transactional
//    // 说明该方法是事务性操作
//     //定义查询
//     //@Param注解用于提取参数
//    @Query("")
//    public List index();

    //获取某no所有商品明细
    List<PromotionMProductSEntity> findByPromotionMProductSPromotionNoEquals(String no);

    //获取某no和id下明细详情
    PromotionMProductSEntity findByPromotionMProductSPromotionNoAndAndPromotionMProductSIndexIdEquals(String no,int id);

    //找到该bProcureSProcureNo下所有明细的最大DetailID 没有明细时报AopInvocationException异常
    @Query(value = " select max (b.promotionMProductSIndexId) from PromotionMProductSEntity b where b.promotionMProductSPromotionNo = :no")
    int findMaxIndexID(@Param("no") String no);

    @Transactional
    @Modifying
    @Query(value = "delete from PromotionMProductSEntity b where b.promotionMProductSIndexId = :id and b.promotionMProductSPromotionNo = :no")
    int deleteByPromotionMProductSPromotionNoAndPromotionMProductSIndexIdEquals(@Param("no") String no,@Param("id") Integer id);

    @Transactional
    @Modifying
    @Query(value = "delete from PromotionMProductSEntity b where b.promotionMProductSPromotionNo = :no")
    int deleteByPromotionMProductSPromotionNoanEquals(@Param("no") String no);
}

