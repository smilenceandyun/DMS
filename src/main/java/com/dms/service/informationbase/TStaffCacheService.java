package com.dms.service.informationbase;
import com.dms.model.TStaffEntity;
import com.dms.repository.TStaffRepository;

import java.util.List;

public interface TStaffCacheService {

    public List<TStaffEntity> findAll( TStaffRepository tStaffRepository);

}


