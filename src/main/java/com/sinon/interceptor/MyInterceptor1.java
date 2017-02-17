package com.sinon.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by
 * autor: ghh on
 * Date: 2017/2/17.
 * Time: 21:31
 */
public class MyInterceptor1 implements HandlerInterceptor {
    public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(tologin)|(logout)|(code)|(app)|(weixin)|(static)|(main)|(news)|(websocket)|(web)|(druid)|(zaizheli)|(wu)|(uploadFiles)|(admin)|(css)|(js)).*";	//不对匹配该值的访问路径拦截（正则）

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(">>>>"+httpServletRequest.getServerName()+">>>>"+httpServletRequest.getServerPort()+">>>>"+httpServletRequest.getServletPath());
        System.out.println(">>>MyInterceptor1>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");

        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }
}
