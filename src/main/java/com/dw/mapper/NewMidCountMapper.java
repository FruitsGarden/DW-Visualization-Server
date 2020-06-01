package com.dw.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewMidCountMapper {
    public List<com.dw.model.NewMidCount> selectRecent7Day(String date);
}
