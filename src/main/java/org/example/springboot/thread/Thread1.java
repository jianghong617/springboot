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
 * {@code Thread1}
 * 继承Thread，重写run方法
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class Thread1 extends Thread {

    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " -> 继承Thread，重写run方法");
    }

    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        Thread1 thread1 = new Thread1();
        thread1.start(); // 必须调用start()才会创建一个新的线程
    }
}