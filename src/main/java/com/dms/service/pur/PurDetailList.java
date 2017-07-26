package com.dms.service.pur;

import com.dms.model.pur.PurDetail;

import java.util.List;

/**
 * Created by laoli on 2017/7/13.
 */
public class PurDetailList {
    private List<com.dms.model.pur.PurDetail> purDetail;

    public List<com.dms.model.pur.PurDetail> getPurDetail() {
        return purDetail;
    }

    public void setPurDetail(List<PurDetail> purDetail) {
        this.purDetail = purDetail;
    }
}
