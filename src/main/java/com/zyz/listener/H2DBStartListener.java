package com.zyz.listener;/**
 * Created by zyz46160 on 2017/9/4.
 */

import org.h2.tools.Server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;

/**
 * User: 张月忠
 * Date: 2017/9/4  17:36
 */
public class H2DBStartListener implements ServletContextListener {
    Server server;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("正在启动h2数据库...");
        //使用org.h2.tools.Server这个类创建一个H2数据库的服务并启动服务，由于没有指定任何参数，那么H2数据库启动时默认占用的端口就是8082
        try{
            server = Server.createTcpServer().start();

            //初始化脚本
            System.out.println("h2数据库启动成功...");
        } catch (SQLException e) {
            System.out.println("启动h2数据库出错：" + e.toString());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        if (this.server != null) {
            // 停止H2数据库
            this.server.stop();
            this.server = null;
        }
    }
}
