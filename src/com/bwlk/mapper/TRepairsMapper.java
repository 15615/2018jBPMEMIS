package com.bwlk.mapper;

import com.bwlk.pojo.TRepairs;
import com.bwlk.pojo.TRepairsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRepairsMapper {
    int countByExample(TRepairsExample example);

    int deleteByExample(TRepairsExample example);

    int deleteByPrimaryKey(Integer repairid);

    int insert(TRepairs record);

    int insertSelective(TRepairs record);

    List<TRepairs> selectByExample(TRepairsExample example);

    TRepairs selectByPrimaryKey(Integer repairid);

    int updateByExampleSelective(@Param("record") TRepairs record, @Param("example") TRepairsExample example);

    int updateByExample(@Param("record") TRepairs record, @Param("example") TRepairsExample example);

    int updateByPrimaryKeySelective(TRepairs record);

    int updateByPrimaryKey(TRepairs record);
}