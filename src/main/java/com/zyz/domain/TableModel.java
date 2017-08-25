package com.zyz.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * User: 张月忠
 * Date: 2017/8/25  14:20
 * 数据库表模型
 */
public class TableModel {

    private static final Logger logger = LoggerFactory.getLogger(TableModel.class);
    private String tableName;//表名

    private String tableComment;//表配备注

    List<ColumnModel> columnModels;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public List<ColumnModel> getColumnModels() {
        return columnModels;
    }

    public void setColumnModels(List<ColumnModel> columnModels) {
        this.columnModels = columnModels;
    }


    public String tableToSQL() {

        StringBuilder sb = new StringBuilder();

        sb.append("CREATE TABLE ").append(tableName).append(" (");

        for (int i = 0; i < columnModels.size(); i++) {
            ColumnModel col = columnModels.get(i);
            sb.append(col.columnToSQL());
            if (i < getColumnModels().size() - 1) {
                sb.append(",");
            }
        }

        sb.append(" )").append(" COMMENT '" + tableComment + "' ; ");
        String sql = sb.toString();
        logger.info("create table sql :"+sql);
        return sql;
    }
}
