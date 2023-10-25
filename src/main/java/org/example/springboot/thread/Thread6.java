package org.example.springboot.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * {@code Thread6}
 * 实现Callable接口
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread6 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " -> 实现Callable接口");
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        FutureTask<Integer> task = new FutureTask<>(new Thread6());
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " -> 返回值为：" + task.get());
    }
}