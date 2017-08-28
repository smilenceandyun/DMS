package com.dms.service.informationbase;
import com.dms.model.TGoodsEntity;
import com.dms.repository.TGoodsRepository;

import java.util.List;

public interface TGoodsCacheService {

    public List<TGoodsEntity> findAll(TGoodsRepository tGoodsRepository);

}


