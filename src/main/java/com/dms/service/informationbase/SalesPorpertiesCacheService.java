package com.dms.service.informationbase;

import com.dms.model.SalesPropertiesEntity;
import com.dms.repository.SalesPropertiesRepository;

import java.util.List;

public interface SalesPorpertiesCacheService {

    public List<SalesPropertiesEntity> findAll(SalesPropertiesRepository salesPropertiesRepository);
}