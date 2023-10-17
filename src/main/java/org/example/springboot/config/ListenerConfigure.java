package org.example.springboot.config;

import org.example.springboot.listener.CustomEventListener;
import org.example.springboot.listener.CustomHttpSessionListener;
import org.example.springboot.listener.CustomServletContextListener;
import org.example.springboot.listener.CustomServletRequestListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code ListenerConfigure}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 2.2.0
 */
@Configuration
public class ListenerConfigure {

    @Bean
    public CustomServletContextListener customServletContextListener() {
        return new CustomServletContextListener();
    }

    @Bean
    public CustomHttpSessionListener customHttpSessionListener() {
        return new CustomHttpSessionListener();
    }

    @Bean
    public CustomServletRequestListener customServletRequestListener() {
        return new CustomServletRequestListener();
    }

    @Bean
    public CustomEventListener customEventListener() {
        return new CustomEventListener();
    }
}