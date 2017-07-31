
package com.dms.repository.procure;


import com.dms.model.procure.BProcureMEntity;
import com.dms.model.procure.BProcureSEntity;
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
//    // 说明该方法是事务性操作
//     //定义查询
//     //@Param注解用于提取参数
//    @Query(value = " select b from BProcureSEntity b where b.procureNo = :id")
//    List<BProcureSEntity> findById(@Param("id") String id);

}

