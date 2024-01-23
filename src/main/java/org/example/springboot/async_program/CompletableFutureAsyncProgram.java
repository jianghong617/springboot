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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * {@code CompletableFutureAsyncProgram}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class CompletableFutureAsyncProgram {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        // 第一种创建方式
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            log.info(Thread.currentThread().getName() + " -> 使用默认内置线程池ForkJoinPool.commonPool()");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        });

        // 获取结果的四种方式
        log.info("getNow方法测试结果：" + future1.getNow(2));
        log.info("get方法测试结果：" + future1.get());
        log.info("get超时方法测试结果：" + future1.get(600, TimeUnit.MILLISECONDS));
        log.info("join方法测试结果：" + future1.join());

//        // 第二种创建方式
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//            log.info(Thread.currentThread().getName() + " -> 使用自建线程池");
//            return 2;
//        }, Executors.newSingleThreadExecutor());
//
//        // 第三种创建方式
//        CompletableFuture.runAsync(() -> {
//            log.info(Thread.currentThread().getName() + " -> 使用默认内置线程池ForkJoinPool.commonPool()");
//        });
//
//        // 第四种创建方式
//        CompletableFuture.runAsync(() -> {
//            log.info(Thread.currentThread().getName() + " -> 使用自建线程池");
//        }, Executors.newSingleThreadExecutor());

    }
}