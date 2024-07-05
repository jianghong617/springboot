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
import org.springframework.context.event.ContextStartedEvent;

/**
 * {@code ContextStartedEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 1.0.0
 */
@Slf4j
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        log.info("spring->ContextStartedEventListener->ContextStartedEvent");
    }
}