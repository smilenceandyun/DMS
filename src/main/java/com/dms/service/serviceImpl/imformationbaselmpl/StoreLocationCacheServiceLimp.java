package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.StoreLocationEntity;
import com.dms.repository.StoreLocationRepository;
import com.dms.service.informationbase.StoreLocationCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreLocationCacheServiceLimp implements StoreLocationCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#storeLocationRepository")
    public List<StoreLocationEntity> findAll(StoreLocationRepository storeLocationRepository) {



        List<StoreLocationEntity> list = storeLocationRepository.findAll();

        return list;
    }
}
