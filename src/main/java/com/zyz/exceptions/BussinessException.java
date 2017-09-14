package com.zyz.exceptions;/**
 * Created by zyz46160 on 2017/8/28.
 */

/**
 * User: 张月忠
 * Date: 2017/8/28  14:15
 */
public class BussinessException extends RuntimeException {
    public BussinessException() {
    }

    public BussinessException(String message) {
        super(message);
    }

    public BussinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
