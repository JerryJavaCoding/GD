package com.vanroid.gd.shop.config;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Driver;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dong东 on 2017/1/22.
 * 用户自动生成model文件
 */
public class GeneratorFile {
    public static void main(String[] args) throws SQLException, PropertyVetoException {
        //数据连接源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/gdufassistant");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        // base model 所使用的包名
        String baseModelPkg = "com.vanroid.gd.shop.model.base";
        // base model 文件保存路径
        String baseModelDir = PathKit.getWebRootPath() + "/src/main/java/com/vanroid/gd/shop/model/base";

        // model 所使用的包名
        String modelPkg = "com.vanroid.gd.shop.model";
        // model 文件保存路径
        String modelDir = baseModelDir + "/..";

        Generator gernerator = new Generator(dataSource, baseModelPkg, baseModelDir,
                modelPkg, modelDir);
        gernerator.generate();
    }
}
