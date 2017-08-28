package com.dms.repository;

import com.dms.model.SalesPropertiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesPorpertiesRepository extends JpaRepository<SalesPropertiesEntity, String> {
}

