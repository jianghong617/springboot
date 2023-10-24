package org.example.springboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * {@code ContextStartedEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("spring->ContextStartedEventListener->ContextStartedEvent");
    }
}