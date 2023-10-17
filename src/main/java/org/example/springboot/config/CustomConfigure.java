package org.example.springboot.config;

import org.example.springboot.service.impl.TestService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * {@code CustomConfigure}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
@Configuration
//@Import(value = OtherServiceImpl.class)
@Import(value = TestService.class)
public class CustomConfigure {

}