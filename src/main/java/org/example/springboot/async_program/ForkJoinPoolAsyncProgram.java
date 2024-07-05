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

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * {@code ForkJoinPoolAsyncProgram}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
public class ForkJoinPoolAsyncProgram {

    // ForkJoinPool体现分治思想, 每个线程都有自己的队列，工作窃取模式：线程会从其它线程的队列尾部取任务执行
    // ForkJoinPool实现类
    // RecursiveTask 有返回值
    // RecursiveAction 无返回值
    // CountedCompleter 无返回值任务，任务完成后触发回调
    // 1.CompletableFuture默认使用 2.java8 parallelStream并行流默认使用
    // 1.@Async默认使用SimpleAsyncTaskExecutor->每次调用都会创建一个新的线程，不算是真的线程池
    // 线程池最需要解决的问题：1.异常机制 2.线程阻塞

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Stream<Object> stream = list.parallelStream();
    }
}