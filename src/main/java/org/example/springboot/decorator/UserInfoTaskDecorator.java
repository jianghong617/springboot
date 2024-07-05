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
package org.example.springboot.decorator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.task.TaskDecorator;

/**
 * {@code UserInfoTaskDecorator}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class UserInfoTaskDecorator implements TaskDecorator {

    @Override
    public Runnable decorate(Runnable runnable) {
        // 获取用户信息
        log.info("获取用户信息");
        return () -> {
            // 把用户信息设置到子线程里
            log.info("把用户信息设置到子线程里");
            runnable.run();
        };
    }
}