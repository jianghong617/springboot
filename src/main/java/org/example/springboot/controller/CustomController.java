package org.example.springboot.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code CustomController}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 2.2.0
 */
@Data
@RestController
public class CustomController {

    private String name = "wangqin";
}