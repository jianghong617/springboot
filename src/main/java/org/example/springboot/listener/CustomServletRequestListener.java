package org.example.springboot.listener;

//import jakarta.servlet.ServletRequestEvent;
//import jakarta.servlet.ServletRequestListener;

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
        System.out.println("请求对象初始化");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("请求对象销毁");
    }
}