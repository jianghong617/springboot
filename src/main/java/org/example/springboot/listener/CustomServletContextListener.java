package org.example.springboot.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * {@code CustomServletContextListener}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
public class CustomServletContextListener implements ServletContextListener, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet->ServletContextListener->contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet->ServletContextListener->contextDestroyed");
    }
}