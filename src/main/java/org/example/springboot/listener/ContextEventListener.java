package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Component
public class ContextEventListener {

    @EventListener(ContextRefreshedEvent.class)
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("spring->ContextEventListener->ContextRefreshedEvent");
    }

    @EventListener(ContextClosedEvent.class)
    public void onApplicationEvent(ContextClosedEvent event) {
        log.info("spring->ContextEventListener->ContextClosedEvent");
    }
}