package org.example.springboot.service.impl;

import org.example.springboot.service.OtherService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * {@code OtherServiceImpl}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
//@Service
public class OtherServiceImpl implements OtherService, BeanFactoryAware, InitializingBean {

//    @Autowired
//    private CustomService customService;

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("OtherServiceImpl->setBeanFactory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OtherServiceImpl->afterPropertiesSet()");
    }
}