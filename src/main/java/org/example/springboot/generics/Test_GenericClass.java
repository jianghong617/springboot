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

/**
 * {@code Test_GenericClass}
 *
 * @author jianghong
 * @date 2024/01/31
 * @since 1.0.0
 */
public class Test_GenericClass {

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(123);
        Generic<String> stringGeneric = new Generic<>("123");
    }
}