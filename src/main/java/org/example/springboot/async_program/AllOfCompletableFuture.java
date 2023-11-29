package org.example.springboot.async_program;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@code AllOfCompletableFuture}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class AllOfCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 所有任务执行完成后

        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        //1、使用自定义线程池，开启异步任务01
        CompletableFuture<Integer> supplyAsyncRes01 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务1 开始执行任务01,当前线程为：12
                log.info("开始执行任务01,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 3; //模拟加1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        }, executorService);
        //2、使用自定义线程池，开启异步任务02
        CompletableFuture<Integer> supplyAsyncRes02 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务02 开始执行任务02,当前线程为：13
                log.info("开始执行任务02,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 4; //模拟加2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        }, executorService);
        //3、使用自定义线程池，开启异步任务03
        CompletableFuture<Integer> supplyAsyncRes03 = CompletableFuture.supplyAsync(() -> {
            int res = 1;
            try {
                //执行任务02 开始执行任务02,当前线程为：13
                log.info("开始执行任务03,当前线程为：" + Thread.currentThread().getId());
                //执行具体的事务
                Thread.sleep(600);
                res += 5; //模拟加2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //返回结果
            return res;
        }, executorService);
        //4、开始任务组合
        CompletableFuture<Void> allOfRes = CompletableFuture.allOf(supplyAsyncRes01, supplyAsyncRes02, supplyAsyncRes03);
        //等待所有任务完成
        log.info("所有任务执行完成,组合后返回结果为：" + allOfRes.get());
        //获取所有任务的返回结果
        log.info("任务01返回值：" + supplyAsyncRes01.get());
        log.info("任务02返回值：" + supplyAsyncRes02.get());
        log.info("任务03返回值：" + supplyAsyncRes03.get());
        log.info("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}