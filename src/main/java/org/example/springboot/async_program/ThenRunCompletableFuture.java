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
package org.example.springboot.async_program;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * {@code ThenRunCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class ThenRunCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 做完一个任务之后，再做第二个任务，无传参，无返回值

        long startTime = System.currentTimeMillis();
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                log.info("任务1开始睡眠600ms。。。。");
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, Executors.newSingleThreadExecutor());

        // 第一个任务使用了自定义线程池，且第二个任务使用的thenRunAsync(), 那么第二个任务就使用的默认线程池ForkJoinPool
        CompletableFuture<Void> future2 = future1.thenRunAsync(() -> {
            try {
                log.info("任务2开始睡眠400ms。。。。");
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        log.info("使用get方式获取future2的返回结果：" + future2.get());
        log.info("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}