package org.example.springboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * {@code ContextStoppedEventListener}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("spring->ContextStoppedEventListener->ContextStoppedEvent");
    }
}