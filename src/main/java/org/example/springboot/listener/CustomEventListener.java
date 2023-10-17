package org.example.springboot.listener;

import org.example.springboot.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

/**
 * {@code CustomEventListener}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(Thread.currentThread() + "监听到自定义事件...");
    }

//    @EventListener(CustomEvent.class)
//    public void onApplicationEvent(CustomEvent event) {
//        System.out.println("注解监听到自定义事件...");
//    }
}