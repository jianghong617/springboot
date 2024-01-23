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

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * {@code CustomServletRequestListener}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
@Slf4j
public class CustomServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("spring->ServletRequestListener->requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("spring->ServletRequestListener->requestDestroyed");
    }
}