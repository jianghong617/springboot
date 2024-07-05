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
package org.example.springboot.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code CaseApplicationContextInitializer}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 1.0.0
 */
public class CaseApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        MutablePropertySources propertySources = applicationContext.getEnvironment().getPropertySources();

        Map<String, Object> properties = new HashMap<>();
        properties.put("custom.property", "jianghong");
        MapPropertySource propertySource = new MapPropertySource("customPropertySource", properties);

        propertySources.addFirst(propertySource);
    }
}