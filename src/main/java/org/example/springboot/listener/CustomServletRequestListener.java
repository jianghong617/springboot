package org.example.springboot.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * {@code CustomServletRequestListener}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
public class CustomServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("spring->ServletRequestListener->requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("spring->ServletRequestListener->requestDestroyed");
    }
}