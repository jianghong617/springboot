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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@code ThenComposeCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class ThenComposeCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> res01 = CompletableFuture.completedFuture("第一个任务01");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // 第二个任务 在某个任务执行完成后，将该任务的执行结果，作为方法入参，去执行指定的方法,
        // 该方法会返回一个新的CompletableFuture实例。
        CompletableFuture<String> futureRes = CompletableFuture.supplyAsync(() -> "第二个任务02", executor).thenComposeAsync(data -> {
            log.info("data数据为：" + data);
            return res01;
        }, executor);
        log.info("最终返回：" + futureRes.get());
        executor.shutdown();
    }
}