package com.dms.repository;

import com.dms.model.DeliverymanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverymanRepository extends JpaRepository<DeliverymanEntity, String> {
}