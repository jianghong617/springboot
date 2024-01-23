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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * {@code Thread6}
 * 实现Callable接口
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class Thread6 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        log.info(Thread.currentThread().getName() + " -> 实现Callable接口");
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        FutureTask<Integer> task = new FutureTask<>(new Thread6());
        Thread thread = new Thread(task);
        thread.start();
        log.info(Thread.currentThread().getName() + " -> 返回值为：" + task.get());
    }
}