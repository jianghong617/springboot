package org.example.springboot.async_program;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * {@code ThenApplyCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class ThenApplyCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 做完一个任务之后，再做第二个任务，有传参，有返回值

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                log.info("任务1开始睡眠600ms。。。。");
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                return 1;
            }
        }, Executors.newSingleThreadExecutor());

        CompletableFuture<Integer> future2 = future1.thenApplyAsync((res) -> {
            try {
                log.info("任务2开始睡眠400ms。。。。");
                Thread.sleep(400);
                log.info("任务1返回结果为：" + res);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                return res;
            }
        });
        log.info("回调任务返回结果：" + future2.get());
    }
}