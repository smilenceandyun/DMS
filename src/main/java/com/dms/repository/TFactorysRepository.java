package com.dms.repository;

import com.dms.model.TFactorysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alex on 2017/8/6.
 */

@Repository
public interface TFactorysRepository  extends JpaRepository<TFactorysEntity, String> {

}
