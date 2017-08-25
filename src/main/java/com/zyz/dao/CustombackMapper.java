package com.zyz.dao;

import com.zyz.bean.Customback;
import com.zyz.bean.CustombackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustombackMapper {
    int countByExample(CustombackExample example);

    int deleteByExample(CustombackExample example);

    int deleteByPrimaryKey(Integer cbid);

    int insert(Customback record);

    int insertSelective(Customback record);

    List<Customback> selectByExample(CustombackExample example);

    Customback selectByPrimaryKey(Integer cbid);

    int updateByExampleSelective(@Param("record") Customback record, @Param("example") CustombackExample example);

    int updateByExample(@Param("record") Customback record, @Param("example") CustombackExample example);

    int updateByPrimaryKeySelective(Customback record);

    int updateByPrimaryKey(Customback record);
}