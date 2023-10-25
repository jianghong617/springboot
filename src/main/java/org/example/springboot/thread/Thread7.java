package org.example.springboot.thread;

import java.util.concurrent.*;

/**
 * {@code Thread7}
 * 使用线程池创建线程
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread7 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        ExecutorService pool = Executors.newCachedThreadPool();

        // 线程池提交任务，execute面对异常时会抛出，submit面对异常时会忽略。
        pool.execute(new Runnable() {
            @Override
            public void run() {
//                int i = 1 / 0;
                System.out.println(Thread.currentThread().getName() + " -> 使用线程池创建线程, runnable为任务");
            }
        });

        Future<Integer> future = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " -> 使用线程池创建线程, callable为任务");
                return 1;
            }
        });
        System.out.println(Thread.currentThread().getName() + " -> 返回值为：" + future.get());

    }
}