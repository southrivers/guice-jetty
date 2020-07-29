package com.hw;


import com.google.inject.servlet.ServletModule;
import com.hw.controller.HelloServlet;

public class AppServletModule extends ServletModule {

    @Override
    protected void configureServlets() {

        // 装配进来servlet对象
        bind(HelloServlet.class);
        // 将servlet对象绑定到指定的路径，用于拦截请求
        serve("/hello").with(HelloServlet.class);
    }
}
