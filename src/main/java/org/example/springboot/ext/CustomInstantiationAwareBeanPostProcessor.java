package org.example.springboot.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
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
        if (beanName.equals("customServiceImpl")) {
//            ReflectionUtils.doWithFields(beanClass, (field -> {
//                ReflectionUtils.makeAccessible(field);
//                if (field.getName().equals("name")) {
//                    field.set("name", "么么哥");
//                }
//            }));
            System.out.println("CustomInstantiationAwareBeanPostProcessor->postProcessBeforeInstantiation()");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomInstantiationAwareBeanPostProcessor->postProcessAfterInstantiation()");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomInstantiationAwareBeanPostProcessor->postProcessProperties()");

            MutablePropertyValues  mutablePropertyValues = new MutablePropertyValues();
            mutablePropertyValues.addPropertyValue("name", "change again!");
            pvs = mutablePropertyValues;
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomInstantiationAwareBeanPostProcessor->postProcessBeforeInitialization()");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("customServiceImpl")) {
            System.out.println("CustomInstantiationAwareBeanPostProcessor->postProcessAfterInitialization()");
        }
        return bean;
    }
}