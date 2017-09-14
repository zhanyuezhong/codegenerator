package com.zyz.handler;/**
 * Created by zyz46160 on 2017/8/28.
 */

import com.alibaba.fastjson.JSON;
import com.zyz.vo.WebResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: 张月忠
 * Date: 2017/8/28  14:19
 */
public class BusinessHandlerExceptionResolver   extends SimpleMappingExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        //设置响应头
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        try {
            WebResult error = null;
            PrintWriter writer = response.getWriter();
            error.setData(null);
            error.setMessage("操作失败："+ex.getMessage());
            error.setSuccess(false);
            String jsonString = JSON.toJSONString(error);
            writer.write(jsonString);
            writer.flush();
            writer.close();
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
