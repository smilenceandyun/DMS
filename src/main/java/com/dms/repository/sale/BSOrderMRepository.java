package com.dms.repository.sale;

import com.dms.model.BPurchaseOrdMEntity;
import com.dms.model.BSOrderMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Repository
public interface BSOrderMRepository  extends JpaRepository<BSOrderMEntity, String> {

    BSOrderMEntity findBSOrderMEntityByBSOrderMSOrderNoEquals(String id);
}