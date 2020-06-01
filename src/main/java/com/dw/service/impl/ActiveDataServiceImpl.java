package com.dw.service.impl;

import com.alibaba.fastjson.JSON;
import com.dw.mapper.*;
import com.dw.model.*;
import com.dw.service.ActiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


@Service
public class ActiveDataServiceImpl implements ActiveDataService {

    @Autowired
    private ActiveDataMapper activeDataMapper;

    @Autowired
    private NewMidCountMapper newMidCountMapper;
     @Autowired
     private WastageCountMapper wastageCountMapper;

     @Autowired
     private SilentCountMapper silentCountMapper;

     @Autowired
     private UserConvertMapper userConvertMapper;

    @Override
    public List<ActiveTotalData> queryActiveTotal(String thisEntryDate) {
        HashMap<String, String> map = new HashMap<>();
        map.put("thisEntryDate",thisEntryDate);
        ActiveTotalData dayCount = activeDataMapper.queryDayCount(map);
        dayCount.setId("dayCount");
        ActiveTotalData wkCount = activeDataMapper.queryWkCount(map);
        wkCount.setId("wkCount");
        ActiveTotalData monCount = activeDataMapper.queryMonCount(map);
        monCount.setId("monCount");
        ArrayList<ActiveTotalData> list = new ArrayList<>();
        list.add(dayCount);
        list.add(wkCount);
        list.add(monCount);
        System.out.println(JSON.toJSONString(list));

        return list;
    }

    @Override
    public List<ActiveData> queryActiveData(String tag,String thisEntryDate) {
        HashMap<String, String> map = new HashMap<>();
        map.put("thisEntryDate",thisEntryDate);
        if("dayCount".equals(tag)){
            System.out.println(JSON.toJSONString( activeDataMapper.queryDay(map)));
            return activeDataMapper.queryDay(map);
        }else if("wkCount".equals(tag)){
            List<ActiveData> activeDataList = activeDataMapper.queryWk(map);
            Iterator<ActiveData> iterator = activeDataList.iterator();
            iterator.next();
            while(iterator.hasNext()){
                ActiveData next = iterator.next();
                if("N".equals(next.getIs_weekend())){
                    iterator.remove();
                }
            }
            System.out.println(JSON.toJSONString(activeDataList));
            return activeDataList;
        }else if("monCount".equals(tag)){
            List<ActiveData> activeDataList = activeDataMapper.queryMon(map);
            Iterator<ActiveData> iterator = activeDataList.iterator();
            iterator.next();
            while(iterator.hasNext()){
                ActiveData next = iterator.next();
                if("N".equals(next.getIs_monthend())){
                    iterator.remove();
                }
            }
            System.out.println(JSON.toJSONString(activeDataList));
            return activeDataList;
        }
        return null;
    }

    @Override
    public List<RetainData> queryRetainData() {
        return activeDataMapper.queryRetainData();
    }

    @Override
    public List<GMVOrder> queryGMVOrder() {
        return activeDataMapper.queryGMVOrder();
    }

    @Override
    public List<MapData> queryMapData() {
        return activeDataMapper.queryMapData();
    }

    @Override
    public ConvertData queryConvertData(String tag) {
        return activeDataMapper.queryConvertData(tag);
    }

    @Override
    public List<NewMidCount> queryNewMid(String date) {
        return newMidCountMapper.selectRecent7Day(date);
    }

    @Override
    public List<WastageCount> queryWastage(String date) {
        return wastageCountMapper.selectRecent7Day(date);
    }

    @Override
    public List<SilentCount> querySilent(String date) {
        return silentCountMapper.selectRecent7Day(date);
    }

    @Override
    public List<UserConvert> queryUserconcert(String date) {
        return userConvertMapper.selectRecent7Day(date);
    }

}
