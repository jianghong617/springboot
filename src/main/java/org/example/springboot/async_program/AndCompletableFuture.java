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
 * {@code AndCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Slf4j
public class AndCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 两个任务都执行完了，再执行某个任务 -> AND组合关系

        long startTime = System.currentTimeMillis();
        //1、使用自定义线程池，开启异步任务01
        CompletableFuture<Integer> supplyAsyncRes01 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务1 开始执行任务01,当前线程为：12
                log.info("开始执行任务01,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 1; //模拟加1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return res;
        }, Executors.newCachedThreadPool());
        //2、使用自定义线程池，开启异步任务02
        CompletableFuture<Integer> supplyAsyncRes02 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务02 开始执行任务02,当前线程为：13
                log.info("开始执行任务02,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 2; //模拟加2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        });
        //3、任务02：将任务1与任务2开始任务组合
        CompletableFuture<Integer> thenCombineAsyncRes = supplyAsyncRes01.thenCombineAsync(supplyAsyncRes02, (res01, res02) -> {
            // thenCombine 会将前两个任务的执行结果作为方法入参，有返回值
            // thenAcceptBoth 会将两个任务的执行结果作为方法入参，无返回值
            // runAfterBoth 不会把前两个任务的执行结果作为方法入参，无返回值

            //开始执行任务03,当前线程为：14
            log.info("开始执行任务03,当前线程为：" + Thread.currentThread().getId());
            log.info("任务01返回值：" + res01);
            log.info("任务02返回值：" + res02);
            //任务组合返回值 可以拿到任务01和任务02的返回结果进行相关操作，然后统一返回结果
            return res01 + res02;
        }, Executors.newCachedThreadPool());
        //4、最终返回结果
        log.info("最终返回结果为：" + thenCombineAsyncRes.get());
        log.info("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}