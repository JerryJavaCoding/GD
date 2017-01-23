package com.vanroid.gd.shop.controller;

import com.jfinal.core.Controller;

/**
 * Created by Dong东 on 2017/1/28.
 */
public class AdminController extends Controller {
    public void index() {

        render("index.jsp");
    }

    public void login() {
          render("login.jsp");
    }
}
