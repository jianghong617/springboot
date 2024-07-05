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

import org.example.springboot.aop.CustomAfterAspect;
import org.example.springboot.aop.CustomAroundAspect;
import org.example.springboot.aop.CustomBeforeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code AopConfigure}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 1.0.0
 */
@Configuration
public class AopConfigure {

    @Bean
    public CustomAroundAspect customAroundAspect() {
        return new CustomAroundAspect();
    }

    @Bean
    public CustomBeforeAspect customBeforeAspect() {
        return new CustomBeforeAspect();
    }

    @Bean
    public CustomAfterAspect customAfterAspect() {
        return new CustomAfterAspect();
    }
}