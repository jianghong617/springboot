package org.example.springboot.async_program;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * {@code AsyncAnnotation}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
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