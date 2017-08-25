package com.zyz.enums;/**
 * Created by zyz46160 on 2017/8/25.
 */

/**
 * User: 张月忠
 * Date: 2017/8/25  14:31
 */
public enum  BaseDataTypeEnum {
    MYSQL("mysql"),
    SQERVER("sqserver"),
    ORACLE("oracle");
    private String name;

    public String getName() {
        return name;
    }

    BaseDataTypeEnum(String name) {
        this.name = name;
    }
}
