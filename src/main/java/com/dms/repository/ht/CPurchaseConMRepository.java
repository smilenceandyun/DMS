package com.dms.repository.ht;

import com.dms.model.CPurchaseConMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alex on 2017/8/2.
 */

@Repository
public interface CPurchaseConMRepository extends JpaRepository<CPurchaseConMEntity, String> {

}
