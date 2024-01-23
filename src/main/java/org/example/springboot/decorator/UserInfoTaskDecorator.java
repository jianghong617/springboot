package org.example.springboot.decorator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.task.TaskDecorator;

/**
 * {@code UserInfoTaskDecorator}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
@Slf4j
public class UserInfoTaskDecorator implements TaskDecorator {

    @Override
    public Runnable decorate(Runnable runnable) {
        // 获取用户信息
        log.info("获取用户信息");
        return () -> {
            // 把用户信息设置到子线程里
            log.info("把用户信息设置到子线程里");
            runnable.run();
        };
    }
}