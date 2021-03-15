package com.fdd.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/15 11:03
 * @WeChat: fdd15735171890
 */

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //编写业务的拦截规则
//       if("我的验证信息" .equals( "错误信息")){
            //未登录，重定向到登录页面
            System.out.println("信息有误");
            response.sendRedirect(request.getContextPath() + "/fdd/login");
            return false;
//        }
//        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
