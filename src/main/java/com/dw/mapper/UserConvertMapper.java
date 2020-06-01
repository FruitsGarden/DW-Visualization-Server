package com.dw.mapper;

import com.dw.model.UserConvert;
import com.dw.model.WastageCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserConvertMapper {
    public List<UserConvert> selectRecent7Day(String date);
}
