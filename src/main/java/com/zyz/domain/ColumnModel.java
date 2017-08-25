package com.zyz.domain;/**
 * Created by zyz46160 on 2017/8/25.
 */

import com.zyz.enums.MySQLDataTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: 张月忠
 * Date: 2017/8/25  14:43
 */
public class ColumnModel {

    private static Logger logger = LoggerFactory.getLogger(ColumnModel.class);
    private String colName;
    private MySQLDataTypeEnum colType;
    private int length;
    private String colComment;

    private boolean isPrimaryKey;

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public MySQLDataTypeEnum getColType() {
        return colType;
    }

    public void setColType(MySQLDataTypeEnum colType) {
        this.colType = colType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColComment() {
        return colComment;
    }

    public void setColComment(String colComment) {
        this.colComment = colComment;
    }


    public  String columnToSQL(){
        StringBuilder sb = new StringBuilder();

        sb.append(colName).append(" ");//字段名称
        if(colType == MySQLDataTypeEnum.String)
            sb.append(colType.getType()).append("(").append(length).append(") ");//是字符串 添加长度
        else
            sb.append(colType.getType()).append(" "); //其他直接添加 没有长度
        if(isPrimaryKey)
            sb.append(" PRIMARY KEY AUTO_INCREMENT ");
        sb.append(" COMMENT '"+colComment+"' ");

        String sqlseg = sb.toString();
        logger.info("sql seg :"+sqlseg);
        return sqlseg;
    }


    public ColumnModel(String colName, MySQLDataTypeEnum colType, int length, String colComment, boolean isPrimaryKey) {
        this.colName = colName;
        this.colType = colType;
        this.length = length;
        this.colComment = colComment;
        this.isPrimaryKey = isPrimaryKey;
    }

    public ColumnModel() {
    }
}
