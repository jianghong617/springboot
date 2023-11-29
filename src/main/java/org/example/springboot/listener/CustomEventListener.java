package org.example.springboot.listener;

import org.example.springboot.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * {@code CustomEventListener}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Component
public class CustomEventListener /**implements ApplicationListener<CustomEvent>**/
{

//    @Override
//    public void onApplicationEvent(CustomEvent event) {
//        System.out.println(Thread.currentThread() + "监听到自定义事件...");
//    }

    // @EventListener 这种方式，所有单例bean初始化完成后发布事件，监听才能生效。
    // implements ApplicationListener 这种方式，则不需要担心发布事件的时机。
    @EventListener
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("CustomEventListener->CustomEvent");
    }
}