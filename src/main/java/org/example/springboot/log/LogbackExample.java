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
package org.example.springboot.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code LogbackExample}
 *
 * @author jianghong
 * @date 2024/01/23
 * @since 1.4.0
 */
public class LogbackExample {

    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.info("我是org.slf4j.Logger");
        logger.warn("我是org.slf4j.Logger");
        logger.error("我是org.slf4j.Logger");
    }
}