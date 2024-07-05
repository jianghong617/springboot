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
package org.example.springboot.service;

/**
 * {@code CustomService}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 1.0.0
 */
public interface CustomService {

    /**
     * hello
     *
     * @param name 名称
     * @return 响应
     */
    String hello(String name);
}