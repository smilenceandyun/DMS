package com.dms.listener;




import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;


/**
 * Created by laoli on 2017/7/5.
 */
public class LinListener implements ServletContextListener {

    ServletContext context;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context Created");
        context = servletContextEvent.getServletContext();
        // set variable to servlet context
        context.setAttribute("TEST", "TEST_VALUE");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        context = servletContextEvent.getServletContext();
        System.out.println("Context Destroyed");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            try {
                DriverManager.deregisterDriver(driver);
                 System.out.println("ok!");
            } catch (SQLException e) {

                System.out.println("error!");
            }

        }

    }
}
