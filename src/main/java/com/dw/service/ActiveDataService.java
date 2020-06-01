package com.dw.service;

import com.dw.model.*;

import java.util.List;

public interface ActiveDataService {

    public List<ActiveTotalData> queryActiveTotal(String thisEntryDate);

    public List<ActiveData> queryActiveData(String tag, String thisEntryDate);

    public List<RetainData> queryRetainData();

    public List<GMVOrder> queryGMVOrder();

    public List<MapData> queryMapData();

    public ConvertData queryConvertData(String tag);

    public List<NewMidCount> queryNewMid(String date);

    public List<WastageCount> queryWastage(String date);

    public List<SilentCount> querySilent(String date);

    public List<UserConvert> queryUserconcert(String date);


}