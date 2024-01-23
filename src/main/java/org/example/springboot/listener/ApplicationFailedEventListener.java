package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * {@code ApplicationFailedEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
@Slf4j
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        log.info("springboot->ApplicationFailedEventListener->ApplicationFailedEvent");
    }
}