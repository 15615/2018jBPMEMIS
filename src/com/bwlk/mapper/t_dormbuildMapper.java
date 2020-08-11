package com.bwlk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwlk.pojo.t_dormbuild;
import com.bwlk.pojo.t_dormbuildExample;

public interface t_dormbuildMapper {
	int countByExample(t_dormbuildExample example);

	int deleteByExample(t_dormbuildExample example);

	int deleteByPrimaryKey(Integer dormbuildid);

	int insert(t_dormbuild record);

	int insertSelective(t_dormbuild record);

	List<t_dormbuild> selectByExample(t_dormbuildExample example);

	t_dormbuild selectByPrimaryKey(Integer dormbuildid);

	int updateByExampleSelective(@Param("record") t_dormbuild record, @Param("example") t_dormbuildExample example);

	int updateByExample(@Param("record") t_dormbuild record, @Param("example") t_dormbuildExample example);

	int updateByPrimaryKeySelective(t_dormbuild record);

	int updateByPrimaryKey(t_dormbuild record);
}