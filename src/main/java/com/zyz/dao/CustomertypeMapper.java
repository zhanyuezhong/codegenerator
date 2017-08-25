package com.zyz.dao;

import com.zyz.bean.Customertype;
import com.zyz.bean.CustomertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomertypeMapper {
    int countByExample(CustomertypeExample example);

    int deleteByExample(CustomertypeExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(Customertype record);

    int insertSelective(Customertype record);

    List<Customertype> selectByExample(CustomertypeExample example);

    Customertype selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByExample(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByPrimaryKeySelective(Customertype record);

    int updateByPrimaryKey(Customertype record);
}