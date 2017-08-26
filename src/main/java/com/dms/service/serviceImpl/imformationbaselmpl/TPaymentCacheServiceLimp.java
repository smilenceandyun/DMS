package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TPaymentEntity;
import com.dms.repository.TPaymentRepository;
import com.dms.service.informationbase.TPaymentCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPaymentCacheServiceLimp implements TPaymentCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tPaymentRepository")
    public List<TPaymentEntity> findAll(TPaymentRepository tPaymentRepository) {



        List<TPaymentEntity> list = tPaymentRepository.findAll();

        return list;
    }
}
