package com.dw.mapper;

import com.dw.model.NewMidCount;
import com.dw.model.SilentCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wangwj
 */
@Mapper
public interface SilentCountMapper {
    public List<SilentCount> selectRecent7Day(String date);
}
