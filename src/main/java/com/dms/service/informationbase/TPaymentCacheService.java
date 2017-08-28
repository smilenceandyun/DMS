package com.dms.service.informationbase;
import com.dms.model.TPaymentEntity;
import com.dms.repository.TPaymentRepository;

import java.util.List;

public interface TPaymentCacheService {

    public List<TPaymentEntity> findAll(TPaymentRepository tPaymentRepository);

}


