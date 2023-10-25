package org.example.springboot.thread;

/**
 * {@code Thread3}
 * 使用匿名内部类创建 Thread 子类对象
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread3 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " -> 使用匿名内部类创建 Thread 子类对象");
            }
        }.start();
    }
}