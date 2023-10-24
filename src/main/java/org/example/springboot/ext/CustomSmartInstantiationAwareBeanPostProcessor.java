package org.example.springboot.ext;

import lombok.SneakyThrows;
import org.example.springboot.service.impl.CustomServiceImpl;
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

    // @SneakyThrows 相当于省略try-catch
    @SneakyThrows
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(CustomServiceImpl.class)) {
//            System.out.println("spring->SmartInstantiationAwareBeanPostProcessor->predictBeanType");
        }
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(CustomServiceImpl.class)) {
            System.out.println("spring->SmartInstantiationAwareBeanPostProcessor->determineCandidateConstructors");
        }
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("spring->SmartInstantiationAwareBeanPostProcessor->getEarlyBeanReference");
        }
        return bean;
    }
}