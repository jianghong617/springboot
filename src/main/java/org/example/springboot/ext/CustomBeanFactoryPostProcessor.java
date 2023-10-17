package org.example.springboot.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * {@code CustomBeanFactoryPostProcessor}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("userDTO");
//        DefaultListableBeanFactory
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userDTO");

        beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//        beanDefinition.setConstructorArgumentValues();
//        beanDefinition.setPropertyValues();

        System.out.println("userDTO是否是单例对象：" + beanDefinition.isSingleton());
        System.out.println("CustomBeanFactoryPostProcessor->postProcessBeanFactory()");
    }
}