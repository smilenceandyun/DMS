package com.dms.service.informationbase;
import com.dms.model.TClientEntity;
import com.dms.repository.TClientRepository;

import java.util.List;

public interface TClientCacheService {

    public List<TClientEntity> findAll(TClientRepository tClientRepository);
}


