package com.vanroid.gd.shop.routes;

import com.jfinal.config.Routes;
import com.vanroid.gd.shop.controller.FrontController;


/**
 * Created by Dong¶« on 2017/1/28.
 */
public class FrontRoutes extends Routes {
    @Override
    public void config() {
        setBaseViewPath("/WEB-INF/view");
        add("/front", FrontController.class);


    }
}
