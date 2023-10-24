package org.example.springboot.service.impl;

import org.example.springboot.service.ImportService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * {@code ImportServiceImpl}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
public class ImportServiceImpl implements ImportService, BeanFactoryAware, InitializingBean {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        System.out.println("ImportServiceImpl->setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("ImportServiceImpl->afterPropertiesSet");
    }
}