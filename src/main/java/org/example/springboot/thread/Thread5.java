package org.example.springboot.thread;

/**
 * {@code Thread5}
 * lambda表达式
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread5 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " -> lambda表达式");
        }).start();
    }
}