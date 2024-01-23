package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * {@code ContextStoppedEventListener}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
@Slf4j
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        log.info("spring->ContextStoppedEventListener->ContextStoppedEvent");
    }
}