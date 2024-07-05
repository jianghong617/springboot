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
package org.example.springboot.util;

/**
 * {@code HardwareUtils}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 1.0.0
 */
public final class HardwareUtils {

    private static final int NCPU = Runtime.getRuntime().availableProcessors();

    private HardwareUtils() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    public static int getNcpu() {
        return NCPU;
    }

    public static int getDoubleNcpu() {
        return NCPU << 1;
    }
}