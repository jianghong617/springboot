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
package org.example.springboot.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {@code Generic}
 *
 * @author jianghong
 * @date 2024/01/31
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class Generic<T> {

    private T var;
}