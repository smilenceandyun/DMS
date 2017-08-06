
package com.dms.repository.xy;


import com.dms.model.BProcureMEntity;
import com.dms.model.PromotionMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jc on 2017/7/25.
 */
@Repository
public interface PromotionMRepository extends JpaRepository<PromotionMEntity,String> {
//    @Modifying      // 说明该方法是修改操作
//    @Transactional
//    // 说明该方法是事务性操作
//     //定义查询
//     //@Param注解用于提取参数
//    @Query("")
//    public List index();


}

