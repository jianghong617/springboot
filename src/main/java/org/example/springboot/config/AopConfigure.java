package org.example.springboot.config;

import org.example.springboot.aop.CustomAfterAspect;
import org.example.springboot.aop.CustomAroundAspect;
import org.example.springboot.aop.CustomBeforeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code AopConfigure}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Configuration
public class AopConfigure {

    @Bean
    public CustomAroundAspect customAroundAspect() {
        return new CustomAroundAspect();
    }

    @Bean
    public CustomBeforeAspect customBeforeAspect() {
        return new CustomBeforeAspect();
    }

    @Bean
    public CustomAfterAspect customAfterAspect() {
        return new CustomAfterAspect();
    }
}