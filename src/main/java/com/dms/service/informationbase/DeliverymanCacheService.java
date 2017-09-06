package com.dms.service.informationbase;

import com.dms.model.DeliverymanEntity;
import com.dms.repository.DeliverymanRepository;


import java.util.List;

public interface DeliverymanCacheService {

    public List<DeliverymanEntity> findAll(DeliverymanRepository deliverymanRepository);

}