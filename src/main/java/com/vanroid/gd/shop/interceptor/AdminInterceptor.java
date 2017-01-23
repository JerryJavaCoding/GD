package com.vanroid.gd.shop.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.vanroid.gd.shop.constant.ConstantStr;
import com.vanroid.gd.shop.model.GdAdmin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dong东 on 2017/1/28.
 * 后台管理员的权限拦截器
 */
public class AdminInterceptor implements Interceptor {
    public void intercept(Invocation invocation) {
        Controller controller = invocation.getController();
        HttpServletRequest request = controller.getRequest();
        HttpServletResponse response = controller.getResponse();
        String action = invocation.getActionKey();
        if ("/admin/login".equals(action)) {
            invocation.invoke();
            return;
        }
        GdAdmin currentAdmin = (GdAdmin) request.getSession().getAttribute(ConstantStr.session_admin);
        if(currentAdmin==null){
            toView(controller,ConstantStr.admin_no_login,"authentication_error");
        }else
            invocation.invoke();
    }
    /**
     * 提示信息展示页
     * @param contro
     * @param type
     * @param msg
     */
    private void toView(Controller contro, String type, String msg) {
        String isAjax = contro.getRequest().getHeader("X-Requested-With");

        if (type.equals(ConstantStr.admin_no_login)) {// 未登录处理
            contro.redirect("/admin/login?msg="+msg);
            return;
        }else if(type.equals(ConstantStr.user_no_login)){
            contro.redirect("/user/login?msg="+msg);
            return;
        }

        contro.setAttr("msg", msg);

//        if(isAjax != null && isAjax.equalsIgnoreCase("XMLHttpRequest")) {
//            contro.render("/platform/common/msgAjax.html"); // Ajax页面
//        }else{
//            contro.render("/platform/common/msg.html"); // 完整html页面
//        }
    }
}
