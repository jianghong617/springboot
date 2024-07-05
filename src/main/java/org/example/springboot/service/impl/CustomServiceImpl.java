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

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.springboot.service.CustomService;
import org.example.springboot.service.ImportSelectorService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * {@code CustomServiceImpl}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 1.0.0
 */
@Slf4j
@Data
@Service
public class CustomServiceImpl implements CustomService, BeanFactoryAware, EnvironmentAware, EmbeddedValueResolverAware,
        ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware, BeanNameAware,
        InitializingBean, DisposableBean {

    @Autowired
    private ImportSelectorService importSelectorService;

    private BeanFactory beanFactory;

    private Environment environment;

    private StringValueResolver resolver;

    private ResourceLoader resourceLoader;

    private ApplicationEventPublisher applicationEventPublisher;

    private MessageSource messageSource;

    private ApplicationContext applicationContext;

    private String beanName;

    private String name;

    @PostConstruct
    private void init() {
        log.info("CustomServiceImpl->init");
        importSelectorService.testBeanRegistry();
    }

    @Override
    public String hello(String name) {
        return "轻轻地我来了，" + name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        log.info("CustomServiceImpl->setBeanFactory");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        log.info("CustomServiceImpl->setEnvironment");

        String propertyValue = environment.getProperty("custom.property");
        log.info("CaseApplicationContextInitializer->`custom.property`->" + propertyValue);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
        log.info("CustomServiceImpl->setEmbeddedValueResolver");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        log.info("CustomServiceImpl->setResourceLoader");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        log.info("CustomServiceImpl->setApplicationEventPublisher");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
        log.info("CustomServiceImpl->setMessageSource");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        log.info("CustomServiceImpl->setApplicationContext");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        log.info("CustomServiceImpl->setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("CustomServiceImpl->afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        log.info("CustomServiceImpl->destroy");
    }

    @PreDestroy
    private void destroyz() {
        log.info("CustomServiceImpl->destroyz");
    }
}