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

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {@code LoggingExample}
 *
 * @author jianghong
 * @date 2024/01/23
 * @since 1.4.0
 */
public class LoggingExample {

    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("我是java.util.logging.Logger");
        logger.warning("我是java.util.logging.Logger");
        logger.log(Level.SEVERE, "我是java.util.logging.Logger");
    }
}