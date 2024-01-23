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
package org.example.springboot.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * {@code Thread4}
 * 使用匿名内部类，实现Runnable接口
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class Thread4 {

    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info(Thread.currentThread().getName() + " -> 使用匿名内部类，实现Runnable接口");
            }
        }).start();
    }
}