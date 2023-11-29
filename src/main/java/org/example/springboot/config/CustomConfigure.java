package org.example.springboot.config;

import org.example.springboot.service.impl.ImportSelectorServiceImpl;
import org.example.springboot.service.impl.ImportServiceImpl;
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
@Import(value = {
        ImportServiceImpl.class,
        ImportSelectorServiceImpl.class
})
public class CustomConfigure {

}