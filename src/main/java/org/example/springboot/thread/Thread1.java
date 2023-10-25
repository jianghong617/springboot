package org.example.springboot.thread;

/**
 * {@code Thread1}
 * 继承Thread，重写run方法
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> 继承Thread，重写run方法");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        Thread1 thread1 = new Thread1();
        thread1.start(); // 必须调用start()才会创建一个新的线程
    }
}