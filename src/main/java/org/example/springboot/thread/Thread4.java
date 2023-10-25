package org.example.springboot.thread;

/**
 * {@code Thread4}
 * 使用匿名内部类，实现Runnable接口
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class Thread4 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> jvm主线程");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " -> 使用匿名内部类，实现Runnable接口");
            }
        }).start();
    }
}