package org.example.springboot.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * {@code CustomBeanDefinitionRegistryPostProcessor}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("spring->BeanDefinitionRegistryPostProcessor->postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("spring->BeanDefinitionRegistryPostProcessor->postProcessBeanFactory");
    }
}