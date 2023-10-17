package org.example.springboot.ext;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * {@code CustomSmartInstantiationAwareBeanPostProcessor}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
public class CustomSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
//            System.out.println("CustomSmartInstantiationAwareBeanPostProcessor->predictBeanType()");
        }
        return beanClass;
    }

    @SneakyThrows
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomSmartInstantiationAwareBeanPostProcessor->determineCandidateConstructors()");
        }
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomSmartInstantiationAwareBeanPostProcessor->getEarlyBeanReference()");
        }
        return bean;
    }
}