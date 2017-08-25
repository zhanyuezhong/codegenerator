package com.zyz.utils;/**
 * Created by zyz46160 on 2017/8/25.
 */

import com.zyz.domain.ColumnModel;
import com.zyz.domain.TableModel;
import com.zyz.enums.MySQLDataTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * User: 张月忠
 * Date: 2017/8/25  17:21
 */
public class SQLGenerator {

    public static void main(String args[]){
        TableModel table = new TableModel();
        table.setTableName("users");
        table.setTableComment("用户信息");


        ColumnModel id = new ColumnModel("id", MySQLDataTypeEnum.Integer,11,"编号",true);
        ColumnModel name = new ColumnModel("name", MySQLDataTypeEnum.String,11,"姓名",false);
        List<ColumnModel> columnModels = new ArrayList<>(2);
        columnModels.add(id);
        columnModels.add(name);
        table.setColumnModels(columnModels);

        String sql = table.tableToSQL();
        System.out.println(sql);
    }
}
