package com.ydy.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("---------- init listener -----------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("---------- destroy listener -----------");
    }
}
