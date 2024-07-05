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

import org.example.springboot.ext.CustomBeanDefinitionRegistryPostProcessor;
import org.example.springboot.ext.CustomBeanFactoryPostProcessor;
import org.example.springboot.ext.CustomInstantiationAwareBeanPostProcessor;
import org.example.springboot.ext.CustomSmartInstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code PostProcessorConfigure}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 1.0.0
 */
@Configuration
public class PostProcessorConfigure {

    @Bean
    public static CustomBeanDefinitionRegistryPostProcessor customBeanDefinitionRegistryPostProcessor() {
        return new CustomBeanDefinitionRegistryPostProcessor();
    }

    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public CustomInstantiationAwareBeanPostProcessor customInstantiationAwareBeanPostProcessor() {
        return new CustomInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public CustomSmartInstantiationAwareBeanPostProcessor customSmartInstantiationAwareBeanPostProcessor() {
        return new CustomSmartInstantiationAwareBeanPostProcessor();
    }
}