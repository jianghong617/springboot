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
package org.example.springboot.config;

import org.example.springboot.listener.CustomHttpSessionListener;
import org.example.springboot.listener.CustomServletContextListener;
import org.example.springboot.listener.CustomServletRequestListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code ListenerConfigure}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
@Configuration
public class ListenerConfigure {

    @Bean
    public CustomServletContextListener customServletContextListener() {
        return new CustomServletContextListener();
    }

    @Bean
    public CustomHttpSessionListener customHttpSessionListener() {
        return new CustomHttpSessionListener();
    }

    @Bean
    public CustomServletRequestListener customServletRequestListener() {
        return new CustomServletRequestListener();
    }
}