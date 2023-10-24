package org.example.springboot.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code CaseApplicationContextInitializer}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
public class CaseApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        MutablePropertySources propertySources = applicationContext.getEnvironment().getPropertySources();

        Map<String, Object> properties = new HashMap<>();
        properties.put("custom.property", "jianghong");
        MapPropertySource propertySource = new MapPropertySource("customPropertySource", properties);

        propertySources.addFirst(propertySource);
    }
}