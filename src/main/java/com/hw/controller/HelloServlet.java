package com.hw.controller;

import com.hw.service.HelloService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Singleton
public class HelloServlet extends HttpServlet {

    HelloService helloService;

    @Inject
    public HelloServlet(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(helloService.say());
    }
}
