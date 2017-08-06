package com.dms.repository.th;

import com.dms.model.BRProcureMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alex on 2017/8/3.
 */

@Repository
public interface BRProcureMRepository extends JpaRepository<BRProcureMEntity, String> {

}
