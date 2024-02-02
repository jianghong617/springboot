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

import java.util.ArrayList;
import java.util.List;

/**
 * {@code StaticGenerator}
 *
 * @author jianghong
 * @date 2024/01/31
 * @since 1.0.0
 */
public class StaticGenerator<T> {

    public void show(T t) {
//        List<String>[] ls = new ArrayList<String>[10];

        List<Integer> li = new ArrayList<Integer>();

        List<String>[] ss = new ArrayList[10];

        List<?> list = null;
        list.add(null);
    }

    public static <E> List<E> copyFromArray(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}