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

/**
 * {@code OtherAsyncProgram}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class OtherAsyncProgram {

    // 1.消息队列MQ, 天生异步架构
    // 2.SpringEvent事件异步， 监听器方法上加上@Async
    // 3.hutool的ThreadUtil工具类， ThreadUtil.execAsync(() -> {});
    // 4.Guava异步
    // 5.自定义线程池
}