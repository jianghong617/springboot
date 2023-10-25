package org.example.springboot.thread;

/**
 * {@code Thread2}
 * 实现Runnable接口，重写run方法
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> 实现Runnable接口，重写run方法");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        Thread2 runnable = new Thread2();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}