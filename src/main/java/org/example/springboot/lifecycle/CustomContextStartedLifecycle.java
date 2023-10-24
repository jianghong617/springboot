package org.example.springboot.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * {@code CustomContextStartedLifecycle}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
@Component
public class CustomContextStartedLifecycle implements SmartLifecycle, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private volatile boolean running;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void start() {
        this.running = true;
        this.applicationContext.publishEvent(new ContextStartedEvent(applicationContext));
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public int getPhase() {
        return Integer.MAX_VALUE - 3;
    }
}