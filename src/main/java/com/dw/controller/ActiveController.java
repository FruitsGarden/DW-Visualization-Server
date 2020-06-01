package com.dw.controller;

import com.alibaba.fastjson.JSON;
import com.dw.model.*;
import com.dw.service.ActiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/DW")
public class ActiveController {

    @Autowired
    private ActiveDataService activeDataService;


    /*
    *  获取数据头信息
    * */
    @RequestMapping("/getActiveTotalData")
    @ResponseBody
    public List<ActiveTotalData> queryActiveTotalData(String date){
        return activeDataService.queryActiveTotal(date);
    }

    /*
    *  获取折线图数据
    * */
    @RequestMapping("/getActiveData")
    @ResponseBody
    public List<ActiveData> queryActiveData(String type,String date){
        return activeDataService.queryActiveData(type,date);
    }

    @RequestMapping("/getRetainData")
    @ResponseBody
    public List<RetainData> queryRetainData(){
        System.out.println(JSON.toJSONString(activeDataService.queryRetainData()));
        return activeDataService.queryRetainData();
    }

    @RequestMapping("/getSilentCount")
    @ResponseBody
    public List<SilentCount> getSilentCount(String date){
        return activeDataService.querySilent(date);
    }

    @RequestMapping("/getWastageCount")
    @ResponseBody
    public List<WastageCount> getWastageCount(String date){
        return activeDataService.queryWastage(date);
    }



    @RequestMapping("/getUserConvertCount")
    @ResponseBody
    public List<UserConvert> getUserConvertCount(String date){
        return activeDataService.queryUserconcert(date);
    }


    @RequestMapping("/getNewMidCount")
    @ResponseBody
    public List<NewMidCount> getNewMidCount(String date){
        return activeDataService.queryNewMid(date);
    }


    @RequestMapping("/getGMVData")
    @ResponseBody
    public List<GMVOrder> queryGMVOrder(){

        System.out.println(JSON.toJSONString(activeDataService.queryGMVOrder()));
        return activeDataService.queryGMVOrder();
    }
    @RequestMapping("/getAreaData")
    @ResponseBody
    public List<MapData> queryMapData(){
        System.out.println(JSON.toJSONString(activeDataService.queryMapData()));
        return activeDataService.queryMapData();
    }

    @RequestMapping(value = "getConvertData", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap<String, String>> getList(String date) {
        ConvertData convertData = activeDataService.queryConvertData(date);
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> convert0 = new HashMap<>();
        convert0.put("name","浏览");
        convert0.put("value",String.valueOf(100));

        HashMap<String, String> convert1 = new HashMap<>();
        convert1.put("name","订单");
        convert1.put("value",String.valueOf(convertData.getVisitor2order_convert_ratio()*100));

        HashMap<String, String> convert2 = new HashMap<>();
        convert2.put("name","支付");
        convert2.put("value",String.valueOf(convertData.getOrder2payment_convert_ratio()*100));

        /*HashMap<String, Double> convert5 = new HashMap<>();
        double visit2Pay_convert_ratio = convertData.getVisit2Pay_convert_ratio();
        convert5.put("全流程",visit2Pay_convert_ratio*100);*/
        list.add(convert0);
        list.add(convert1);
        list.add(convert2);
        System.out.println(JSON.toJSONString(list));
        return list;
    }

}
