package com.dms.service.serviceImpl.imformationbaselmpl;

import com.dms.model.TRoomEntity;
import com.dms.repository.TRoomRepository;
import com.dms.service.informationbase.TRoomCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TRoomCacheServiceLimp implements TRoomCacheService {



    @Override
    @Cacheable(value = "myCache", key = "'get'+#tRoomRepository")
    public List<TRoomEntity> findAll(TRoomRepository tRoomRepository) {



        List<TRoomEntity> list = tRoomRepository.findAll();

        return list;
    }
}
