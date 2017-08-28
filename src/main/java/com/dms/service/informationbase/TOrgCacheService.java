package com.dms.service.informationbase;
import com.dms.model.TOrgEntity;
import com.dms.repository.TOrgRepository;

import java.util.List;

public interface TOrgCacheService {

    public List<TOrgEntity> findAll(TOrgRepository tOrgRepository);

}


