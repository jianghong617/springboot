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
package org.example.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * {@code CustomEvent}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 1.0.0
 */
public class CustomEvent extends ApplicationEvent {

    private static final long serialVersionUID = -2768916883382986730L;

    public CustomEvent(Object source) {
        super(source);
    }
}