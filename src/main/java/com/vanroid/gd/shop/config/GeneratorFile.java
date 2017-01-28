package com.vanroid.gd.shop.config;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Driver;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dong�� on 2017/1/22.
 * �û��Զ�����model�ļ�
 */
public class GeneratorFile {
    public static void main(String[] args) throws SQLException, PropertyVetoException {
        //��������Դ
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/gdufassistant");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        // base model ��ʹ�õİ���
        String baseModelPkg = "com.vanroid.gd.shop.model.base";
        // base model �ļ�����·��
        String baseModelDir = PathKit.getWebRootPath() + "/src/main/java/com/vanroid/gd/shop/model/base";

        // model ��ʹ�õİ���
        String modelPkg = "com.vanroid.gd.shop.model";
        // model �ļ�����·��
        String modelDir = baseModelDir + "/..";

        Generator gernerator = new Generator(dataSource, baseModelPkg, baseModelDir,
                modelPkg, modelDir);
        gernerator.generate();
    }
}
