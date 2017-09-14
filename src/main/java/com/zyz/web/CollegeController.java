package com.zyz.web;/**
 * Created by zyz46160 on 2017/8/28.
 */

import com.github.pagehelper.PageInfo;
import com.zyz.bean.College;
import com.zyz.bean.G16;
import com.zyz.dao.G16Dao;
import com.zyz.exceptions.BussinessException;
import com.zyz.service.CollegeService;
import com.zyz.utils.ValidateUtils;
import com.zyz.vo.WebResult;
import net.sf.oval.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * User: 张月忠
 * Date: 2017/8/28  14:03
 */
@Controller
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;
    @Autowired
    private Validator validator;

    @Autowired
    G16Dao g16Dao;

    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<Integer> insert(@ModelAttribute College college) throws BussinessException {
        //校验
        WebResult validateRet = ValidateUtils.validate(validator, college);
        if (validateRet != null) {
            return validateRet;
        }
        Integer row = collegeService.insert(college);
        return WebResult.OK(row);
    }

    @RequestMapping(value = "/update", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<Integer> update(@ModelAttribute College college) throws BussinessException {
        //校验
        WebResult validateRet = ValidateUtils.validate(validator, college);
        if (validateRet != null) {
            return validateRet;
        }
        Integer row = collegeService.update(college);
        return WebResult.OK(row);
    }

    @RequestMapping(value = "/delete", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<Integer> delete(@RequestParam("id") Integer id) throws BussinessException{
        Integer row = collegeService.delete(id);
        return WebResult.OK(row);

    }

    @RequestMapping(value = "/queryAll", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<List<College>> queryAll() throws BussinessException {
        List<College> colleges = collegeService.queryAll();
        return WebResult.OK(colleges);
    }

    @RequestMapping(value = "/queryByParam", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    WebResult<List<College>> queryByParam(College college) throws BussinessException {
        List<College> colleges = collegeService.queryByParam(college);
        return WebResult.OK(colleges);
    }

    @RequestMapping(value = "/getById", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<College> getById(Integer id) throws BussinessException {
        College college = collegeService.getById(id);
        return WebResult.OK(college);
    }


    @RequestMapping(value = "/queryPage", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult<PageInfo> queryPage(@ModelAttribute College college, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize) throws BussinessException {
        PageInfo pageInfo = collegeService.queryPage(college, pageNum, pageSize);
        return WebResult.OK(pageInfo);
    }
    @RequestMapping(value = "/g16", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public WebResult g16(){
        G16 g16 = new G16();
        Random random = new Random();
        g16.setCreateId(-10L);
        g16.setDeleteId(-10L);
        g16.setAreacd("1");
        g16.setCxr("1");
        g16.setAfz1tariffnum("23");
        g16.setAfz1ast("1");
        g16.setAfz2tariffcd("1");
        g16.setAfz2tariffnum("1");
        g16.setAfz4tariffcd("1");
        g16.setAreacode1("1");
        g16.setAreacode3("w");
        g16.setAreacode4("w");
        g16.setDisdate(new Date());
        Long time1 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            g16.setId(random.nextLong());
            g16Dao.insert(g16);

        }
        Long time2 = System.currentTimeMillis();
        return WebResult.OK(time2-time1);
    }
}
