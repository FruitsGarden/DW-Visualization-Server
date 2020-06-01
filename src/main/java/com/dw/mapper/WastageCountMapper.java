package com.dw.mapper;

import com.dw.model.NewMidCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WastageCountMapper {
    public List<com.dw.model.WastageCount> selectRecent7Day(String date);
}
