package com.hw;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8090);

        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/*");
        servletContextHandler.addEventListener(new ContextListener());

        server.setHandler(servletContextHandler);
        server.start();
        server.join();
    }
}
