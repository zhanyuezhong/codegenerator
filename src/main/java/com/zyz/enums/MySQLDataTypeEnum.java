package com.zyz.enums;


import com.zyz.exceptions.EnumException;


/**
 * User: 张月忠
 * Date: 2017/8/25  14:23
 */
public enum MySQLDataTypeEnum {
    Integer(1, "int"),
    Double(2, "double"),
    Float(3, "float"),
    String(4, "varchar"),
    Date(5, "date"),
    DateTime(6, "datetime"),
    Text(7, "text"),
    Long(8, "bigint");
    private int code;
    private String type;

    MySQLDataTypeEnum(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public static String getDataType(int code) {
        MySQLDataTypeEnum[] values = values();
        for (MySQLDataTypeEnum dataTypeEnum : values) {
            if (code == dataTypeEnum.getCode()) {
                return dataTypeEnum.getType();
            }
        }
        throw new EnumException("data Type EnumException , code not allow. code :" + code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }
}
