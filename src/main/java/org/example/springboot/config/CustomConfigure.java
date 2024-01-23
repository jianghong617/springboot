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

import org.example.springboot.service.impl.ImportSelectorServiceImpl;
import org.example.springboot.service.impl.ImportServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * {@code CustomConfigure}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Configuration
@Import(value = {
        ImportServiceImpl.class,
        ImportSelectorServiceImpl.class
})
public class CustomConfigure {

}