package com.bwlk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwlk.pojo.t_dorm;
import com.bwlk.pojo.t_dormExample;

public interface t_dormMapper {
	int countByExample(t_dormExample example);

	int deleteByExample(t_dormExample example);

	int deleteByPrimaryKey(Integer dormid);

	int insert(t_dorm record);

	int insertSelective(t_dorm record);

	List<t_dorm> selectByExample(t_dormExample example);

	t_dorm selectByPrimaryKey(Integer dormid);

	int updateByExampleSelective(@Param("record") t_dorm record, @Param("example") t_dormExample example);

	int updateByExample(@Param("record") t_dorm record, @Param("example") t_dormExample example);

	int updateByPrimaryKeySelective(t_dorm record);

	int updateByPrimaryKey(t_dorm record);
}