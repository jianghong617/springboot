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

import org.example.springboot.service.ImportSelectorService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Service;

/**
 * {@code ImportSelectorServiceImpl}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
// 如果不使用@Service, 当前类不会注入ioc容器。
@Service
public class ImportSelectorServiceImpl implements ImportSelectorService, BeanFactoryAware, InitializingBean,/*ImportSelector*/ DeferredImportSelector {

    private BeanFactory beanFactory;

    @Override

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.example.springboot.service.impl.OtherServiceImpl"};
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        log.info("ImportSelectorServiceImpl->setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        log.info("ImportSelectorServiceImpl->afterPropertiesSet");
    }

    @Override
    public void testBeanRegistry() {
//        log.info("test ImportSelectorServiceImpl registry success");
    }
}