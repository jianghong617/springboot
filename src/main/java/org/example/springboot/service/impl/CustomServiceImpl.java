package org.example.springboot.service.impl;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.example.springboot.event.CustomEvent;
import org.example.springboot.service.CustomService;
import org.example.springboot.service.OtherService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
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
 * @since 2.2.0
 */
@Data
@Service
public class CustomServiceImpl implements CustomService, BeanFactoryAware, EnvironmentAware, EmbeddedValueResolverAware,
        ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware, BeanNameAware,
        InitializingBean, SmartInitializingSingleton, CommandLineRunner, ApplicationRunner, DisposableBean {

    @Autowired
    private OtherService otherService;

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
        System.out.println("CustomServiceImpl->init()");

        System.out.println(Thread.currentThread() + "发布事件开始");
        this.applicationEventPublisher.publishEvent(new CustomEvent(new Object()));
        System.out.println(Thread.currentThread() + "发布事件结束");
    }

    @PreDestroy
    private void destroyz() {
        System.out.println("CustomServiceImpl->destroyz()");
    }

    @Override
    public String hello(String name) {
        return "亲亲的我来了，" + name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("CustomServiceImpl->setBeanFactory()");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println("CustomServiceImpl->setEnvironment()");
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("CustomServiceImpl->setBeanName()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(Thread.currentThread() + "CustomServiceImpl->afterPropertiesSet()");
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("CustomServiceImpl->afterSingletonsInstantiated()");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CustomServiceImpl->CommonLineRun()");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("CustomServiceImpl->ApplicationRun()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("CustomServiceImpl->destroy()");
    }
}