package org.example.springboot.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@code CustomApplicationContextInitializer}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
@Slf4j
public class CustomApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        log.info("spring->ApplicationContextInitializer->initialize");
    }
}