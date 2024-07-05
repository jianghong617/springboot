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
package org.example.springboot.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.springboot.event.CustomEvent;
import org.example.springboot.service.OtherService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * {@code OtherServiceImpl}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 1.0.0
 */
@Slf4j
public class OtherServiceImpl implements OtherService, BeanFactoryAware, ApplicationContextAware, InitializingBean, SmartInitializingSingleton {

    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        log.info("OtherServiceImpl->setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        log.info("OtherServiceImpl->afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterSingletonsInstantiated() {
        log.info("当前ioc容器下，所有单例bean初始化完成...");

        log.info("发布自定义事件`CustomEvent`开始");
        this.applicationContext.publishEvent(new CustomEvent(new Object()));
        log.info("发布自定义事件`CustomEvent`结束");
    }
}