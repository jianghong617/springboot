package org.example.springboot.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * {@code Thread3}
 * 使用匿名内部类创建 Thread 子类对象
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class Thread3 {

    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread() {
            @Override
            public void run() {
                log.info(Thread.currentThread().getName() + " -> 使用匿名内部类创建 Thread 子类对象");
            }
        }.start();
    }
}