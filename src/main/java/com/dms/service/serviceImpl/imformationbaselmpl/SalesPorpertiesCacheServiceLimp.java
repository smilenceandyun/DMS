package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.SalesPropertiesEntity;
import com.dms.repository.SalesPorpertiesRepository;
import com.dms.service.informationbase.SalesPorpertiesCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesPorpertiesCacheServiceLimp implements SalesPorpertiesCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#salesPorpertiesRepository")
    public List<SalesPropertiesEntity> findAll(SalesPorpertiesRepository salesPorpertiesRepository) {



        List<SalesPropertiesEntity> list = salesPorpertiesRepository.findAll();

        return list;
    }
}