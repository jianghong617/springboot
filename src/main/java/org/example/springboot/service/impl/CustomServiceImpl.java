package org.example.springboot.service.impl;

import lombok.Data;
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
 * @since 2.2.0
 */
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
        System.out.println("CustomServiceImpl->init");
        importSelectorService.testBeanRegistry();
    }

    @Override
    public String hello(String name) {
        return "轻轻地我来了，" + name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("CustomServiceImpl->setBeanFactory");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println("CustomServiceImpl->setEnvironment");

        String propertyValue = environment.getProperty("custom.property");
        System.out.println("CaseApplicationContextInitializer->`custom.property`->" + propertyValue);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
        System.out.println("CustomServiceImpl->setEmbeddedValueResolver");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        System.out.println("CustomServiceImpl->setResourceLoader");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        System.out.println("CustomServiceImpl->setApplicationEventPublisher");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
        System.out.println("CustomServiceImpl->setMessageSource");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("CustomServiceImpl->setApplicationContext");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("CustomServiceImpl->setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("CustomServiceImpl->afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("CustomServiceImpl->destroy");
    }

    @PreDestroy
    private void destroyz() {
        System.out.println("CustomServiceImpl->destroyz");
    }
}