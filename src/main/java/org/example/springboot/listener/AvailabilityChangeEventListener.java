package org.example.springboot.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

/**
 * {@code AvailabilityChangeEventListener}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
public class AvailabilityChangeEventListener implements ApplicationListener<AvailabilityChangeEvent> {

    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {
        System.out.println("springboot->AvailabilityChangeEventListener->AvailabilityChangeEvent");
    }
}