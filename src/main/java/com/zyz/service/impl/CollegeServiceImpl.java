package com.zyz.service.impl;/**
 * Created by zyz46160 on 2017/8/25.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyz.bean.College;
import com.zyz.bean.CollegeExample;
import com.zyz.dao.CollegeMapper;
import com.zyz.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 张月忠
 * Date: 2017/8/25  18:25
 */
@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeMapper mapper;
    @Override
    public Integer insert(College college) {
        return mapper.insert(college);
    }

    @Override
    public Integer update(College college) {
        return mapper.updateByPrimaryKeySelective(college);

    }

    @Override
    public Integer delete(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<College> queryAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public List<College> queryByParam(College college) {

        CollegeExample example = getQueryParam(college);
        return mapper.selectByExample(example);
    }


    private CollegeExample getQueryParam(College college){
        CollegeExample example = new CollegeExample();
        CollegeExample.Criteria criteria = example.createCriteria();
        criteria.andCollegenameLike(college.getCollegename());
        criteria.andCollidEqualTo(college.getCollid());
        return  example;
    }

    @Override
    public College getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }



    @Override
    public PageInfo queryPage(College college,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CollegeExample queryParam = getQueryParam(college);
        List<College> colleges = mapper.selectByExample(queryParam);
        PageInfo pageInfo = new PageInfo(colleges);
        return pageInfo;
    }
}
