package com.hw;

import com.google.inject.servlet.GuiceFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8090);

        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/");
        servletContextHandler.addEventListener(new ContextListener());

        // TODO 这一步是必须的，必须添加拦截所有的请求，否则就无法拦截到指定的请求，原因尚不清楚
        servletContextHandler.addFilter(GuiceFilter.class, "/*",
                EnumSet.allOf(DispatcherType.class));
        server.setHandler(servletContextHandler);
        server.start();
        server.join();
    }
}
