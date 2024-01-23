/*
 * Copyright (c) 2024 Zero Co., Ltd. All rights reserved.
 *
 * This software is owned by Zero Co., Ltd.
 * Without the official authorization of Zero Co., Ltd.,
 * no enterprise or individual can obtain, read, install,
 * or disseminate any content protected by intellectual
 * property rights involved in this software.
 *
 * The website of zero, please see <https://zero.com>
 */
package org.example.springboot.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * {@code CustomContextStoppedLifecycle}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
//@Component
public class CustomContextStoppedLifecycle implements SmartLifecycle, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private volatile boolean running;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void start() {
        this.running = true;
        this.applicationContext.publishEvent(new ContextStoppedEvent(applicationContext));
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
        return Integer.MAX_VALUE - 4;
    }
}