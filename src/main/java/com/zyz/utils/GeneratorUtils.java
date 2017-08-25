package com.zyz.utils;/**
 * Created by zyz46160 on 2017/8/25.
 */


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * User: 张月忠
 * Date: 2017/8/25  16:33
 */
public class GeneratorUtils {
    public static void generator() throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("D:\\MyConfiguration\\zyz46160\\IdeaProjects\\codegenerator\\target\\classes\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }
    public static void main(String[] args) throws Exception {
        try {
            generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
