package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TFactorysEntity;
import com.dms.repository.TFactorysRepository;
import com.dms.service.informationbase.TFactorysCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TFactorysCacheServiceLimp implements TFactorysCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tFactorysRepository")
    public List<TFactorysEntity> findAll(TFactorysRepository tFactorysRepository) {

        List<TFactorysEntity> list = tFactorysRepository.findAll();

        return list;
    }
}
