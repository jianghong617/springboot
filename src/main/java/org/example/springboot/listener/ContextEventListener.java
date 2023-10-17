package org.example.springboot.listener;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * {@code ContextEventListener}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Component
public class ContextEventListener {

    @EventListener(ContextStartedEvent.class)
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("spring容器初始化完成...");
    }

    @EventListener(ContextRefreshedEvent.class)
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("spring容器加载完成...");
//        CollectionUtils
    }

    @EventListener(ContextStoppedEvent.class)
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("spring容器已停止...");
    }

    @EventListener(ContextClosedEvent.class)
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("spring容器已关闭...");
    }
}