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

import java.util.concurrent.*;

/**
 * {@code AsyncProgram}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class TraditionAsyncProgram {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 无法解决多个异步任务相互依赖的场景，比如：主线程需要等待子线程任务执行完毕之后再执行.

//        ExecutorService pool = Executors.newCachedThreadPool();
//        Future<String> future = pool.submit(() -> {
//            log.info(Thread.currentThread().getName() + " -> Executors工厂创建线程池");
//            return "hello";
//        });
//        log.info(Thread.currentThread().getName() + " -> 获取到的值为：" + future.get());


        // Future.get()是阻塞调用, 可以通过Future.isDone()在程序中做轮询
        // 阻塞的方式与异步编程的设计理念相违背，而轮询的方式会耗费无谓的CPU资源
        // CompletableFuture提供了一种观察者模式类似的机制，可以让任务执行完成后通知监听的一方

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch downLatch = new CountDownLatch(2);
        long startTime = System.currentTimeMillis();
        Future<String> userFuture = executorService.submit(() -> {
            //模拟查询商品耗时500毫秒
            Thread.sleep(500);
            downLatch.countDown();
            return "用户A";
        });
        Future<String> goodsFuture = executorService.submit(() -> {
            //模拟查询商品耗时500毫秒
            Thread.sleep(400);
            downLatch.countDown();
            return "商品A";
        });
        downLatch.await();
        //模拟主程序耗时时间
        Thread.sleep(600);
        log.info("获取用户信息:" + userFuture.get());
        log.info("获取商品信息:" + goodsFuture.get());
        log.info("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}