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