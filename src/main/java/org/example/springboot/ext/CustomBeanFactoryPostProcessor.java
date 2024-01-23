package org.example.springboot.ext;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("spring->BeanFactoryPostProcessor->postProcessBeanFactory");
    }
}