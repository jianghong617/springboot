package org.example.springboot.ext;

import org.example.springboot.service.CustomService;
import org.example.springboot.service.impl.CustomServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * {@code CustomInstantiationAwareBeanPostProcessor}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(CustomServiceImpl.class)) {
            System.out.println("spring->InstantiationAwareBeanPostProcessor->postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("spring->InstantiationAwareBeanPostProcessor->postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("spring->InstantiationAwareBeanPostProcessor->postProcessProperties");
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("spring->InstantiationAwareBeanPostProcessor->postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("spring->InstantiationAwareBeanPostProcessor->postProcessAfterInitialization");
        }
        return bean;
    }
}