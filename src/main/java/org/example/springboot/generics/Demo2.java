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

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * {@code Demo2}
 *
 * @author jianghong
 * @date 2024/02/01
 * @since 1.0.0
 */
public class Demo2 {

    public static void main(String[] args) {
        //获取Demo2中声明的所有方法
        Method[] methods = Demo2.class.getDeclaredMethods();
        Method m1 = null;
        //找到m1方法
        for (Method method : methods) {
            if (method.getName().equals("m1")) {
                m1 = method;
                break;
            }
        }

        //获取方法的泛型参数列表
        System.out.println("m1方法参数类型列表信息:----------");
        Type[] genericParameterTypes = m1.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            //3个参数都是泛型变量类型的，对应java中的TypeVariable
            if (genericParameterType instanceof TypeVariable) {
                TypeVariable pt = (TypeVariable) genericParameterType;
                System.out.println("变量类型名称:" + pt.getTypeName());
                System.out.println("变量名称:" + pt.getName());
                System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
                Type[] bounds = pt.getBounds();
                System.out.println("这个变量上边界数量:" + bounds.length);
                System.out.println("这个变量上边界清单:");
                for (Type bound : bounds) {
                    System.out.println(bound.getTypeName());
                }
            } else if (genericParameterType instanceof Class) {
                Class pt = (Class) genericParameterType;
                System.out.println("参数类型名称:" + pt.getTypeName());
                System.out.println("参数类名:" + pt.getName());
            }
            System.out.println("--------------------");
        }


        //获取方法中声明的泛型参数列表
        System.out.println("m1方法中声明的泛型变量类型列表:----------");
        TypeVariable<Method>[] typeParameters = m1.getTypeParameters();
        for (TypeVariable<Method> pt : typeParameters) {
            System.out.println("变量类型名称:" + pt.getTypeName());
            System.out.println("变量名称:" + pt.getName());
            System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
            Type[] bounds = pt.getBounds();
            System.out.println("这个变量上边界数量:" + bounds.length);
            System.out.println("这个变量上边界清单:");
            for (Type bound : bounds) {
                System.out.println(bound.getTypeName());
            }
            System.out.println("--------------------");
        }

        //获取方法的返回值，也是一个泛型变量
        System.out.println("m1方法返回值类型信息:----------");
        Type genericReturnType = m1.getGenericReturnType();
        if (genericReturnType instanceof TypeVariable) {
            TypeVariable pt = (TypeVariable) genericReturnType;
            System.out.println("变量名称:" + pt.getName());
            System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
            Type[] bounds = pt.getBounds();
            System.out.println("这个变量上边界数量:" + bounds.length);
            System.out.println("这个变量上边界清单:");
            for (Type bound : bounds) {
                System.out.println(bound.getTypeName());
            }
            System.out.println("--------------------");
        }

    }

    public <T1, T2 extends Integer, T3 extends Demo1I1 & Demo1I2> T3 m1(T1 t1, T2 t2, T3 t3, String s) {
        return t3;
    }

}