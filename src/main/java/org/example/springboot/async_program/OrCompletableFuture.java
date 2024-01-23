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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@code OrCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class OrCompletableFuture {

    public static void main(String[] args) {
        // 两个任务只要有一个任务完成，就执行任务三 -> OR组合关系

        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        //1、使用自定义线程池，开启异步任务01
        CompletableFuture<Integer> supplyAsyncRes01 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务1 开始执行任务01,当前线程为：12
                log.info("开始执行任务01,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 2; //模拟加1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        }, executorService);
        //2、使用自定义线程池，开启异步任务02
        CompletableFuture<Integer> supplyAsyncRes02 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务02 开始执行任务02,当前线程为：13
                log.info("开始执行任务02,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(200);
                res += 3; //模拟加2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        }, executorService);
        //3、任务组合or
        supplyAsyncRes01.acceptEitherAsync(supplyAsyncRes02, (res) -> {
            // acceptEither 会将已经执行完成的任务，作为方法入参，无返回值
            // applyToEither 会将已经执行完成的任务，作为方法入参，有返回值
            // runAfterEither 不把执行结果当作方法入参，无返回值

            try {
                log.info("开始执行任务03,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                log.info("上一个任务返回值：" + res);
                log.info("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);
    }
}