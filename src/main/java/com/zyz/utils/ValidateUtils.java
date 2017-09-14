package com.zyz.utils;/**
 * Created by zyz46160 on 2017/8/28.
 */

import com.zyz.vo.WebResult;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.List;

/**
 * User: 张月忠
 * Date: 2017/8/28  14:52
 */
public class ValidateUtils {
    /**
     * 校验工具
     * @param validator
     * @param t
     * @return
     */
    public static WebResult validate(Validator validator, Object t){
        List<ConstraintViolation> messages = validator.validate(t);
        if(!messages.isEmpty()){
            StringBuilder sb = new StringBuilder();
            int i =1;
            for(ConstraintViolation m:messages){
                sb.append("<font color='red'>").append(i).append(".").append(m.getMessage()).append("</font>").append("<br/>");
                i++;
            }
            return new WebResult(false, sb.toString(),null);
        }
        return null;
    }
}
