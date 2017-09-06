package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.DeliverymanEntity;
import com.dms.model.TClientEntity;
import com.dms.repository.DeliverymanRepository;
import com.dms.repository.TClientRepository;
import com.dms.service.informationbase.DeliverymanCacheService;
import com.dms.service.informationbase.TClientCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliverymanCacheServiceLimp implements DeliverymanCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#deliverymanRepository")
    public List<DeliverymanEntity> findAll(DeliverymanRepository deliverymanRepository) {



        List<DeliverymanEntity> list = deliverymanRepository.findAll();

        return list;
    }
}
