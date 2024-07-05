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

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * {@code AsyncAnnotation}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
@Component
public class AsyncAnnotation {

    // 当前类对象必须是spring容器管理的bean对象
    // 方法访问修饰符必须是public
    // 不能直接获取异步执行结果, 返回应该使用Future或者CompletableFuture包装
    @Async("commonAsyncExecutor") // `commonAsyncExecutor`是自定义线程池的bean名称
    public CompletableFuture<Void> mockAsync() {
        // TODO 实现
        return CompletableFuture.completedFuture(null);
    }
}