package org.example.springboot.service.impl;

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
 * @since 2.2.0
 */
public class OtherServiceImpl implements OtherService, BeanFactoryAware, ApplicationContextAware, InitializingBean, SmartInitializingSingleton {

    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        System.out.println("OtherServiceImpl->setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("OtherServiceImpl->afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("当前ioc容器下，所有单例bean初始化完成...");

        System.out.println("发布自定义事件`CustomEvent`开始");
        this.applicationContext.publishEvent(new CustomEvent(new Object()));
        System.out.println("发布自定义事件`CustomEvent`结束");
    }
}