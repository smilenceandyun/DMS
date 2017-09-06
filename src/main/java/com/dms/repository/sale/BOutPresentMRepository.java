package com.dms.repository.sale;

import com.dms.model.BOutPresentMEntity;
import com.dms.model.BSOrderMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BOutPresentMRepository  extends JpaRepository<BOutPresentMEntity, String> {

    BOutPresentMEntity findBOutPresentMEntityByBOutPresentMCreateNoEquals(String id);
}