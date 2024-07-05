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
package org.example.springboot.ext;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.example.springboot.service.impl.CustomServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * {@code CustomSmartInstantiationAwareBeanPostProcessor}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 1.0.0
 */
@Slf4j
public class CustomSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    // @SneakyThrows 相当于省略try-catch
    @SneakyThrows
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(CustomServiceImpl.class)) {
//            log.info("spring->SmartInstantiationAwareBeanPostProcessor->predictBeanType");
        }
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(CustomServiceImpl.class)) {
            log.info("spring->SmartInstantiationAwareBeanPostProcessor->determineCandidateConstructors");
        }
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            log.info("spring->SmartInstantiationAwareBeanPostProcessor->getEarlyBeanReference");
        }
        return bean;
    }
}