package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TOrgEntity;
import com.dms.repository.TOrgRepository;
import com.dms.service.informationbase.TOrgCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrgCacheServiceLimp implements TOrgCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tOrgRepository")
    public List<TOrgEntity> findAll(TOrgRepository tOrgRepository) {



        List<TOrgEntity> list = tOrgRepository.findAll();

        return list;
    }
}
