package com.vanroid.gd.shop.routes;

import com.jfinal.config.Routes;
import com.vanroid.gd.shop.controller.AdminController;
import com.vanroid.gd.shop.interceptor.AdminInterceptor;

/**
 * Created by Dong¶« on 2017/1/28.
 */
public class AdminRoutes extends Routes {
    @Override
    public void config() {
        setBaseViewPath("/WEB-INF/view");
        add("/admin", AdminController.class);
        addInterceptor(new AdminInterceptor());
    }
}
