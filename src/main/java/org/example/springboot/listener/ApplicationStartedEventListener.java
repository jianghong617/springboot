package org.example.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * {@code ApplicationStartedEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("springboot->ApplicationStartedEventListener->ApplicationStartedEvent");
    }
}