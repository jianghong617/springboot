package org.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code HealthController}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "我是健康的.";
    }
}