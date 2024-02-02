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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * {@code Test_Safe}
 *
 * @author jianghong
 * @date 2024/01/31
 * @since 1.0.0
 */
public class Test_Safe implements Serializable {

    public static void main(String[] args) {
        // 不使用泛型，无法控制类型，取数据时可能存在类型转换异常
        // 使用了泛型，编译阶段就可以判断类型
        List list = new ArrayList();
        list.add("aaaa");
        list.add(100);
    }
}