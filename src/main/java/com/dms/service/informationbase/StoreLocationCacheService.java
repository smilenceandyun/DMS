package com.dms.service.informationbase;
import com.dms.model.StoreLocationEntity;
import com.dms.repository.StoreLocationRepository;

import java.util.List;

public interface StoreLocationCacheService {

    public List<StoreLocationEntity> findAll(StoreLocationRepository storeLocationRepository);
}


