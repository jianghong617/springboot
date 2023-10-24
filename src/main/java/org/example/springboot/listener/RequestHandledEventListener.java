package org.example.springboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * {@code RequestHandledEventListener}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
@Component
public class RequestHandledEventListener implements ApplicationListener<RequestHandledEvent> {
    @Override
    public void onApplicationEvent(RequestHandledEvent event) {
        System.out.println("spring->RequestHandledEventListener->RequestHandledEvent");
    }
}