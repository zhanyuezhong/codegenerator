package com.zyz.service;

import com.github.pagehelper.PageInfo;
import com.zyz.bean.College;

import java.util.List;

/**
 * User: 张月忠
 * Date: 2017/8/25  18:17
 */
public interface CollegeService {
    Integer insert(College college);

    Integer update(College college);

    Integer delete(Integer id);

    List<College> queryAll();

    List<College> queryByParam(College college);

    College getById(Integer id);



    PageInfo queryPage(College college, int offset, int limit);
}
