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

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * {@code SpringRunBean}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
@Slf4j
@Component
public class SpringRunBean implements CommandLineRunner, ApplicationRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("SpringRunBean->CommonLineRun");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("SpringRunBean->ApplicationRun");
    }
}