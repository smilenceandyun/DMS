package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.SalesPropertiesEntity;
import com.dms.repository.SalesPropertiesRepository;
import com.dms.service.informationbase.SalesPorpertiesCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesPorpertiesCacheServiceLimp implements SalesPorpertiesCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#salesPropertiesRepository")
    public List<SalesPropertiesEntity> findAll(SalesPropertiesRepository salesPropertiesRepository) {



        List<SalesPropertiesEntity> list = salesPropertiesRepository.findAll();

        return list;
    }
}