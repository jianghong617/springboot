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
package org.example.springboot.config;

import org.example.springboot.filter.CustomFilter;
import org.example.springboot.filter.OtherFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code FilterConfigure}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 1.0.0
 */
@Configuration
public class FilterConfigure {

    @Bean
    public CustomFilter customFilter() {
        return new CustomFilter();
    }

    @Bean
    public OtherFilter otherFilter() {
        return new OtherFilter();
    }
}