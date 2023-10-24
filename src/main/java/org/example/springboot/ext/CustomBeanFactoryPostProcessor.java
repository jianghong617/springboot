package org.example.springboot.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

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
        System.out.println("spring->BeanFactoryPostProcessor->postProcessBeanFactory");
    }
}