package com.zyz.dao;

import com.zyz.bean.Sell;
import com.zyz.bean.SellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellMapper {
    int countByExample(SellExample example);

    int deleteByExample(SellExample example);

    int deleteByPrimaryKey(Integer sellid);

    int insert(Sell record);

    int insertSelective(Sell record);

    List<Sell> selectByExample(SellExample example);

    Sell selectByPrimaryKey(Integer sellid);

    int updateByExampleSelective(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByExample(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}