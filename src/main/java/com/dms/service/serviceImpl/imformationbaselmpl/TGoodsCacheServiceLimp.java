package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TGoodsEntity;
import com.dms.repository.TGoodsRepository;
import com.dms.service.informationbase.TGoodsCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TGoodsCacheServiceLimp implements TGoodsCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tGoodsRepository")
    public List<TGoodsEntity> findAll(TGoodsRepository tGoodsRepository) {



        List<TGoodsEntity> list = tGoodsRepository.findAll();

        return list;
    }
}
