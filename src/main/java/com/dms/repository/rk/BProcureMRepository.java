
package com.dms.repository.rk;


import com.dms.model.BProcureMEntity;
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
public interface BProcureMRepository extends JpaRepository<BProcureMEntity,String> {
//    @Modifying      // 说明该方法是修改操作
//    @Transactional
//    // 说明该方法是事务性操作
//     //定义查询
//     //@Param注解用于提取参数
//    @Query("")
//    public List index();

}

