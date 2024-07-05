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

import org.example.springboot.service.ImportService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * {@code ImportServiceImpl}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 1.0.0
 */
public class ImportServiceImpl implements ImportService, BeanFactoryAware, InitializingBean {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        log.info("ImportServiceImpl->setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        log.info("ImportServiceImpl->afterPropertiesSet");
    }
}