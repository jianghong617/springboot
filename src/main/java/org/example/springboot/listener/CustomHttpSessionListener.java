package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * {@code CustomHttpSessionListener}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
@Slf4j
public class CustomHttpSessionListener implements HttpSessionListener {

    public static int ONLINE_USERS_TOTAL = 0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        log.info("servlet->HttpSessionListener->sessionCreated");
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();

        synchronized (this) {
            ONLINE_USERS_TOTAL++;
            servletContext.setAttribute("ONLINE_USERS_TOTAL", ONLINE_USERS_TOTAL);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        log.info("servlet->HttpSessionListener->sessionDestroyed");
        ServletContext application = httpSessionEvent.getSession().getServletContext();

        synchronized (this) {
            ONLINE_USERS_TOTAL--;
            application.setAttribute("ONLINE_USERS_TOTAL", ONLINE_USERS_TOTAL);
        }
    }
}