package com.dms.repository;

import com.dms.model.TClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alex on 2017/8/4.
 */

@Repository
public interface TClientRepository  extends JpaRepository<TClientEntity, String> {
}
