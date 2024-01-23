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

import org.apache.log4j.Logger;

/**
 * {@code Log4jExample}
 *
 * @author jianghong
 * @date 2024/01/23
 * @since 1.4.0
 */
public class Log4jExample {

    private static final Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("我是org.apache.log4j.Logger");
        logger.warn("我是org.apache.log4j.Logger");
        logger.error("我是org.apache.log4j.Logger");
    }
}