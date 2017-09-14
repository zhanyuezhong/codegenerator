package com.zyz.vo;/**
 * Created by zyz46160 on 2017/8/28.
 */

/**
 * User: 张月忠
 * Date: 2017/8/28  14:05
 */
public class WebResult<T> {

    private boolean success;

    private String message;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public WebResult() {
    }

    public WebResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    @SuppressWarnings("unchecked")
    public static   WebResult OK(Object data){
            //setSuccess(true);
            return new WebResult(true,"操作成功" ,data);
    }
    @SuppressWarnings("unchecked")
    public static WebResult Fail(Object data){
        return new WebResult(false,"操作失败" ,data);

    }
}
