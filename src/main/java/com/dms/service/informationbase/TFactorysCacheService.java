package com.dms.service.informationbase;
import com.dms.model.TFactorysEntity;
import com.dms.repository.TFactorysRepository;

import java.util.List;

public interface TFactorysCacheService {

    public List<TFactorysEntity> findAll(TFactorysRepository tFactorysRepository);

}


