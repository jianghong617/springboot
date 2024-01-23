/*
 * Copyright (c) 2024 Zero Co., Ltd. All rights reserved.
 *
 * This software is owned by Zero Co., Ltd.
 * Without the official authorization of Zero Co., Ltd.,
 * no enterprise or individual can obtain, read, install,
 * or disseminate any content protected by intellectual
 * property rights involved in this software.
 *
 * The website of zero, please see <https://zero.com>
 */
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
public class CustomFactoryBean implements FactoryBean<CustomFactoryBean.CustomInnerFactoryBean> {

    @Override
    public CustomInnerFactoryBean getObject() throws Exception {
        return new CustomInnerFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return CustomFactoryBean.CustomInnerFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    public static class CustomInnerFactoryBean {

    }
}