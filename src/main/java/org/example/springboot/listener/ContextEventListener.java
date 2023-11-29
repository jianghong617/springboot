package org.example.springboot.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * {@code ContextEventListener}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Component
public class ContextEventListener {

    @EventListener(ContextRefreshedEvent.class)
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("spring->ContextEventListener->ContextRefreshedEvent");
    }

    @EventListener(ContextClosedEvent.class)
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("spring->ContextEventListener->ContextClosedEvent");
    }
}