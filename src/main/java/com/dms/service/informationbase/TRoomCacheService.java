package com.dms.service.informationbase;
import com.dms.model.TRoomEntity;
import com.dms.repository.TRoomRepository;

import java.util.List;

public interface TRoomCacheService {

    public List<TRoomEntity> findAll(TRoomRepository tRoomRepository);

}


