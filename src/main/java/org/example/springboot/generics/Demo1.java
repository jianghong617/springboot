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

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * {@code Demo1}
 *
 * @author jianghong
 * @date 2024/02/01
 * @since 1.0.0
 */
@Slf4j
public class Demo1<T1, T2 extends Integer, T3 extends Demo1I1 & Demo1I2> {

    public static void main(String[] args) {
        TypeVariable<Class<Demo1>>[] typeParameters = Demo1.class.getTypeParameters();
        for (TypeVariable<Class<Demo1>> typeParameter : typeParameters) {
            log.info("变量名称{}", typeParameter.getName());
            log.info("变量在{}声明的", typeParameter.getGenericDeclaration());
            Type[] bounds = typeParameter.getBounds();
            log.info("这个变量上边界数量{}", bounds.length);
            log.info("这个变量上边界清单");
            for (Type bound : bounds) {
                log.info(bound.getTypeName());
            }
            log.info("--------------------");
        }
    }
}