package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TStaffEntity;
import com.dms.repository.TStaffRepository;
import com.dms.service.informationbase.TStaffCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStaffCacheServiceLimp implements TStaffCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tStaffRepository")
    public List<TStaffEntity> findAll(TStaffRepository tStaffRepository) {



        List<TStaffEntity> list = tStaffRepository.findAll();

        return list;
    }
}
