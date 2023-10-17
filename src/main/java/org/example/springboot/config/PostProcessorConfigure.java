package org.example.springboot.config;

import org.example.springboot.ext.CustomBeanDefinitionRegistryPostProcessor;
import org.example.springboot.ext.CustomBeanFactoryPostProcessor;
import org.example.springboot.ext.CustomInstantiationAwareBeanPostProcessor;
import org.example.springboot.ext.CustomSmartInstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code PostProcessorConfigure}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
@Configuration
public class PostProcessorConfigure {

    @Bean
    public static CustomBeanDefinitionRegistryPostProcessor customBeanDefinitionRegistryPostProcessor() {
        return new CustomBeanDefinitionRegistryPostProcessor();
    }

    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public CustomInstantiationAwareBeanPostProcessor customInstantiationAwareBeanPostProcessor() {
        return new CustomInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public CustomSmartInstantiationAwareBeanPostProcessor customSmartInstantiationAwareBeanPostProcessor() {
        return new CustomSmartInstantiationAwareBeanPostProcessor();
    }
}