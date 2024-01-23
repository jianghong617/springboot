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
package org.example.springboot.config;

import org.example.springboot.decorator.UserInfoTaskDecorator;
import org.example.springboot.util.HardwareUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * {@code ExecutorConfigure}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Configuration
public class ExecutorConfigure {

    @Bean("commonAsyncExecutor")
    public ThreadPoolTaskExecutor commonAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(Math.max(1 << 3, HardwareUtils.getNcpu() + 1));
        taskExecutor.setMaxPoolSize(Math.max(1 << 3, HardwareUtils.getDoubleNcpu()));
        taskExecutor.setQueueCapacity(1 << 10);
        taskExecutor.setKeepAliveSeconds(60);
        taskExecutor.setThreadGroupName("async");
        taskExecutor.setThreadNamePrefix("cmn" + "-");
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 允许核心线程超时
        taskExecutor.setAllowCoreThreadTimeOut(true);
        // 关闭线程池时等待任务完成
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        // 默认使用BlockingQueue阻塞队列
        taskExecutor.initialize();

        return taskExecutor;
    }

    @Bean("queryAsyncExecutor")
    public ThreadPoolTaskExecutor queryAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(Math.max(1 << 3, HardwareUtils.getNcpu() + 1));
        taskExecutor.setMaxPoolSize(Math.max(1 << 3, HardwareUtils.getDoubleNcpu()));
        taskExecutor.setQueueCapacity(1 << 10);
        taskExecutor.setKeepAliveSeconds(60);
        taskExecutor.setThreadGroupName("async");
        taskExecutor.setThreadNamePrefix("cqr" + "-");
        // 线程装饰
        taskExecutor.setTaskDecorator(new UserInfoTaskDecorator());

        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.setAllowCoreThreadTimeOut(true);
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        taskExecutor.initialize();

        return taskExecutor;
    }

    /**
     * 专门:
     * 用于时间短的小任务
     *
     * @return
     */
    @Bean("cachePoolExecutor")
    public ExecutorService cachePoolExecutor() {
        return new ThreadPoolExecutor(
                0,
                Integer.MAX_VALUE,
                60L,
                TimeUnit.SECONDS,
                // 不存储任务，插入必须立即有线程执行，否则插入线程会出入阻塞中
                new SynchronousQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
    }
}