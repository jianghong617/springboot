package org.example.springboot.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * {@code Thread5}
 * lambda表达式
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class Thread5 {

    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread(() -> {
            log.info(Thread.currentThread().getName() + " -> lambda表达式");
        }).start();
    }
}