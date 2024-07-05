/*
 * Copyright (c) 2024 Zero Co., Ltd. All rights reserved.
 *
 * This software is owned by Zero Co., Ltd.
 * Without the official authorization of Zero Co., Ltd.,
 * no enterprise or individual can obtain, read, install,
 * or disseminate any content protected by intellectual
 * property rights involved in this software.
 *
 * The website of zero, please see <https://zero.com>
 */
package org.example.springboot.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code CustomController}
 *
 * @author jianghong
 * @date 2023/09/15
 * @since 1.0.0
 */
@Data
@RestController
public class CustomController {

    private String name = "wangqin";
}