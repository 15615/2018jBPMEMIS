package com.bwlk.mapper;

import com.bwlk.pojo.Forms;
import com.bwlk.pojo.FormsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormsMapper {
    int countByExample(FormsExample example);

    int deleteByExample(FormsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Forms record);

    int insertSelective(Forms record);

    List<Forms> selectByExample(FormsExample example);

    Forms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Forms record, @Param("example") FormsExample example);

    int updateByExample(@Param("record") Forms record, @Param("example") FormsExample example);

    int updateByPrimaryKeySelective(Forms record);

    int updateByPrimaryKey(Forms record);
}