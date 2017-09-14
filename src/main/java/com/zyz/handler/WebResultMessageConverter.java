package com.zyz.handler;/**
 * Created by zyz46160 on 2017/8/28.
 */

import com.alibaba.fastjson.JSON;
import com.zyz.vo.WebResult;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;

/**
 * User: 张月忠
 * Date: 2017/8/28  14:36
 */
public class WebResultMessageConverter extends AbstractHttpMessageConverter<WebResult> {
    @Override
    protected boolean supports(Class<?> clazz) {
        return WebResult.class.isAssignableFrom(clazz);
    }

    @Override
    protected WebResult readInternal(Class<? extends WebResult> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(WebResult webResult, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        outputMessage.getBody().write(JSON.toJSONString(webResult).getBytes("UTF-8"));

        outputMessage.getBody().close();
    }
}
