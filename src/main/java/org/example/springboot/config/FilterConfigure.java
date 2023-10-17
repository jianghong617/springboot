package org.example.springboot.config;

import org.example.springboot.filter.CustomFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code FilterConfigure}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Configuration
public class FilterConfigure {

    @Bean
    public CustomFilter customFilter() {
        return new CustomFilter();
    }
}