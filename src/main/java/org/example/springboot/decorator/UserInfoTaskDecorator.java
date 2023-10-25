package org.example.springboot.decorator;

import org.springframework.core.task.TaskDecorator;

/**
 * {@code UserInfoTaskDecorator}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public class UserInfoTaskDecorator implements TaskDecorator {

    @Override
    public Runnable decorate(Runnable runnable) {
        // 获取用户信息
        System.out.println("获取用户信息");
        return () -> {
            // 把用户信息设置到子线程里
            System.out.println("把用户信息设置到子线程里");
            runnable.run();
        };
    }
}