package com.dms.service.informationbase;

import com.dms.model.SalesPropertiesEntity;
import com.dms.repository.SalesPorpertiesRepository;

import java.util.List;

public interface SalesPorpertiesCacheService {

    public List<SalesPropertiesEntity> findAll(SalesPorpertiesRepository salesPorpertiesRepository);
}