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
package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * {@code ContextStoppedEventListener}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 1.0.0
 */
@Slf4j
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        log.info("spring->ContextStoppedEventListener->ContextStoppedEvent");
    }
}