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

import java.util.concurrent.*;

/**
 * {@code Thread7}
 * 使用线程池创建线程
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class Thread7 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        ExecutorService pool = Executors.newCachedThreadPool();

        // 线程池提交任务，execute面对异常时会抛出，submit面对异常时会忽略。
        pool.execute(new Runnable() {
            @Override
            public void run() {
//                int i = 1 / 0;
                log.info(Thread.currentThread().getName() + " -> 使用线程池创建线程, runnable为任务");
            }
        });

        Future<Integer> future = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.info(Thread.currentThread().getName() + " -> 使用线程池创建线程, callable为任务");
                return 1;
            }
        });
        log.info(Thread.currentThread().getName() + " -> 返回值为：" + future.get());
    }
}