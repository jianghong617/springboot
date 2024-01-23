package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * {@code CustomServletRequestListener}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
@Slf4j
public class CustomServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("spring->ServletRequestListener->requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("spring->ServletRequestListener->requestDestroyed");
    }
}