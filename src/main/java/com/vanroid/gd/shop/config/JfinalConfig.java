package com.vanroid.gd.shop.config;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.vanroid.gd.shop.model._MappingKit;
import com.vanroid.gd.shop.routes.AdminRoutes;
import com.vanroid.gd.shop.routes.FrontRoutes;

/**
 * Created by Dong东 on 2017/1/19.
 */
public class JfinalConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.JSP);
        constants.setEncoding("UTF-8");
    }

    @Override
    public void configRoute(Routes routes) {
        //前台路由
        routes.add(new FrontRoutes());
        //后台路由
        routes.add(new AdminRoutes());
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
    /*  数据库连接插件*/
        loadPropertyFile("C3P0Config.properties");
        C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"));
        plugins.add(c3p0Plugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        _MappingKit.mapping(arp);//自动生成model文件的映射
        plugins.add(arp);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
