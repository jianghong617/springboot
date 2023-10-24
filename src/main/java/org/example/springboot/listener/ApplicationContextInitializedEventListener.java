package org.example.springboot.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * {@code ApplicationContextInitializedEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
public class ApplicationContextInitializedEventListener implements ApplicationListener<ApplicationContextInitializedEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        System.out.println("springboot->ApplicationContextInitializedEventListener->ApplicationContextInitializedEvent");
    }
}