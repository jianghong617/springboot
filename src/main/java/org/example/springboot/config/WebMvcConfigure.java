package org.example.springboot.config;

import org.example.springboot.interceptor.CustomInterceptor;
import org.example.springboot.interceptor.OtherInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * {@code WebMvcConfigure}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 指定拦截url
        String[] paths = {"/**"};
        // 指定不拦截url
        String[] excludePaths = {"/health"};
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns(paths).excludePathPatterns(excludePaths);
        registry.addInterceptor(new OtherInterceptor()).addPathPatterns(paths).excludePathPatterns(excludePaths);
    }
}