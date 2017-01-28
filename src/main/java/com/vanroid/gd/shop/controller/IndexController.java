package com.vanroid.gd.shop.controller;

import com.jfinal.core.Controller;

import com.vanroid.gd.shop.model.GdCircle;
import com.vanroid.gd.shop.model.GdUser;

import java.util.Date;

/**
 * Created by Dong¶« on 2017/1/19.
 */
public class IndexController extends Controller {
    public void index() {

        renderText("hello my 3jfinals2s2205s");
    }

    public void hello() {
//        GdCircle circle=new GdCircle();
//
//        circle.setCreateTime(new Date());
//        circle.setContent("ÄãºÃ°¡jfinal");
//        circle.save();
        render("/hello.jsp");
    }
}
