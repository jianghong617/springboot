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
 * {@code ExceptionallyCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class ExceptionallyCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 异常回调
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            log.info("进入子线程中...");
            int v = 1 / 0;
            return "正常执行";
        }, Executors.newCachedThreadPool()).whenComplete((res, e) -> {
            // 回调方法whenComplete, 无返回值。
            // 返回的是上个任务的结果

            // 回调方法handle, 有返回值
            log.info("whenComplete返回的结果res是: " + res);
            log.info("whenComplete返回的异常为 " + e);
        }).exceptionally((e) -> {
            log.error("异常：" + e);
            return "异常了";
        });

        log.info("回调任务返回结果：" + future.get());
    }
}