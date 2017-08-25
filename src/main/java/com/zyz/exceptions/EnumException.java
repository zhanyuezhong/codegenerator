package com.zyz.exceptions;/**
 * Created by zyz46160 on 2017/8/25.
 */

/**
 * User: 张月忠
 * Date: 2017/8/25  14:38
 */
public class EnumException extends RuntimeException {

    public EnumException() {
    }

    public EnumException(String message) {
        super(message);
    }

    public EnumException(String message, Throwable cause) {
        super(message, cause);
    }
}
