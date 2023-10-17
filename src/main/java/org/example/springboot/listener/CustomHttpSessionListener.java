package org.example.springboot.listener;

//import jakarta.servlet.ServletContext;
//import jakarta.servlet.http.HttpSessionEvent;
//import jakarta.servlet.http.HttpSessionListener;

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
public class CustomHttpSessionListener implements HttpSessionListener {

    public static int ONLINE_USERS_TOTAL = 0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer total = (Integer) servletContext.getAttribute("ONLINE_USERS_TOTAL");
        if (ONLINE_USERS_TOTAL == 0) {
            servletContext.setAttribute("ONLINE_USERS_TOTAL", 1);
        } else {
            servletContext.setAttribute("ONLINE_USERS_TOTAL", total);
        }
        ONLINE_USERS_TOTAL++;
        System.out.println(ONLINE_USERS_TOTAL + " login");
        System.out.println("会话初始化");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext application = httpSessionEvent.getSession().getServletContext();
        ONLINE_USERS_TOTAL--;
        application.setAttribute("ONLINE_USERS_TOTAL", ONLINE_USERS_TOTAL);
        System.out.println(ONLINE_USERS_TOTAL + " logout");
        System.out.println("会话销毁");
    }
}