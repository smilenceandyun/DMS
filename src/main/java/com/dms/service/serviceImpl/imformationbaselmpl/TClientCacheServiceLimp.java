package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TClientEntity;
import com.dms.repository.TClientRepository;
import com.dms.service.informationbase.TClientCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TClientCacheServiceLimp implements TClientCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tClientRepository")
    public List<TClientEntity> findAll(TClientRepository tClientRepository) {



        List<TClientEntity> list = tClientRepository.findAll();

        return list;
    }
}
