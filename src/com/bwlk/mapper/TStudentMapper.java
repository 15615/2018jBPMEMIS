package com.bwlk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwlk.pojo.TStudent;
import com.bwlk.pojo.TStudentExample;

public interface TStudentMapper {
	int countByExample(TStudentExample example);

	int deleteByExample(TStudentExample example);

	int deleteByPrimaryKey(Integer studentid);

	int insert(TStudent record);

	int insertSelective(TStudent record);

	List<TStudent> selectByExample(TStudentExample example);

	TStudent selectByPrimaryKey(Integer studentid);

	int updateByExampleSelective(@Param("record") TStudent record, @Param("example") TStudentExample example);

	int updateByExample(@Param("record") TStudent record, @Param("example") TStudentExample example);

	int updateByPrimaryKeySelective(TStudent record);

	int updateByPrimaryKey(TStudent record);
}