package com.zyz.dao;

import com.zyz.bean.Passfind;
import com.zyz.bean.PassfindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassfindMapper {
    int countByExample(PassfindExample example);

    int deleteByExample(PassfindExample example);

    int deleteByPrimaryKey(Integer pfid);

    int insert(Passfind record);

    int insertSelective(Passfind record);

    List<Passfind> selectByExample(PassfindExample example);

    Passfind selectByPrimaryKey(Integer pfid);

    int updateByExampleSelective(@Param("record") Passfind record, @Param("example") PassfindExample example);

    int updateByExample(@Param("record") Passfind record, @Param("example") PassfindExample example);

    int updateByPrimaryKeySelective(Passfind record);

    int updateByPrimaryKey(Passfind record);
}