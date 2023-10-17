package org.example.springboot.ext;

import org.example.springboot.dto.UserDTO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

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
        System.out.println("BeanDefinition数量：" + registry.getBeanDefinitionCount());

        System.out.println("自定义BeanDefinition注册开始....");
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(UserDTO.class);
        registry.registerBeanDefinition("userDTO", rootBeanDefinition);
        System.out.println("自定义BeanDefinition注册结束....");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("CustomBeanDefinitionRegistryPostProcessor->postProcessBeanFactory()");
        System.out.println("BeanDefinition数量：" + beanFactory.getBeanDefinitionCount());
        UserDTO bean = beanFactory.getBean(UserDTO.class);
        System.out.println(bean);
    }
}