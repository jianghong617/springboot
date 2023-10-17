package org.example.springboot.component;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * {@code CustomFactoryBean}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Component
public class CustomFactoryBean implements FactoryBean<CustomFactoryBean.CustomFactoryInnerBean> {

    @Override
    public CustomFactoryInnerBean getObject() throws Exception {
        System.out.println("CustomFactoryBean->getObject()");
        return new CustomFactoryInnerBean();
    }

    @Override
    public Class<?> getObjectType() {
//        System.out.println("CustomFactoryBean->getObjectType()");
        return CustomFactoryBean.CustomFactoryInnerBean.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    public static class CustomFactoryInnerBean {

    }
}