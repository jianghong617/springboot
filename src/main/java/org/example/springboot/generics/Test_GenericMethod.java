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
import org.example.springboot.aop.CustomAfterAspect;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/**
 * {@code Test_GenericMethod}
 *
 * @author jianghong
 * @date 2024/01/31
 * @since 1.0.0
 */
@Slf4j
public class Test_GenericMethod {

    public static void main(String[] args) throws NoSuchMethodException {
//        Test_GenericMethod method = new Test_GenericMethod();
//        Integer i = method.genericMethod(12);
//        if (log.isInfoEnabled()) {
//            log.info(String.valueOf(i));
//        }
//        Generic<Integer> integerGeneric = new Generic<>(123);
//        Generic<String> stringGeneric = new Generic<>("aaaa");
//        method.genericMethod01(integerGeneric);
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> fruitGenerateTest = new GenerateTest<>();
        fruitGenerateTest.show_1(apple);
//        fruitGenerateTest.show_1(person);

        fruitGenerateTest.show_2(person);
        fruitGenerateTest.show_3(person);

        print("123", 753, 123.12);

        Integer i = add(1, 2);
        Number add = add(1, 1.23);

        Number add1 = Test_GenericMethod.<Number>add(1, 1.23);

        ArrayList strings = new ArrayList<>();
        strings.add(1);

        CustomAfterAspect customAfterAspect = new CustomAfterAspect();
        String typeName = customAfterAspect.getClass().getTypeName();
        TypeVariable<? extends Class<? extends CustomAfterAspect>>[] typeParameters = customAfterAspect.getClass().getTypeParameters();

        for (TypeVariable<? extends Class<? extends CustomAfterAspect>> typeParameter : typeParameters) {
            String name = typeParameter.getName();
        }

        TypeVariable<Class<CustomAfterAspect>>[] typeParameters2 = CustomAfterAspect.class.getTypeParameters();


//        CustomAfterAspect childAspect = new ChildAspect();
//        TypeVariable<? extends Class<? extends CustomAfterAspect>>[] typeParameters2 = childAspect.getClass().getTypeParameters();

//        TypeVariable<? extends Constructor<? extends CustomAfterAspect>>[] typeParameters3 = childAspect.getClass().getConstructor().getTypeParameters();

//        TypeVariable<Class<? extends CustomAfterAspect>>[] yy = customAfterAspect.getClass().getTypeParameters();
//        TypeVariable<Class<CustomAfterAspect>>[] xx = customAfterAspect.getClass().getTypeParameters();


        Method show1 = customAfterAspect.getClass().getDeclaredMethod("show_1");
        TypeVariable<Method>[] typeParameters1 = show1.getTypeParameters();
        TypeVariable<? extends Method>[] typeParameters5 = show1.getTypeParameters();

//        TypeVariable<Class<?>>[] typeVariables = customAfterAspect.getClass().getTypeParameters().

        List<?> objects = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        processList(objects);
        getElement(list);

        List<? extends Fruit> list1 = null;
        List<Apple> list2 = new ArrayList<>();
        List<Fruit> list3 = new ArrayList<>();

        list1 = list2;
        list1 = list3;
    }

    public static void processList(List<?> list) {
        log.info("list size: " + list.size());
    }

    public static Number getElement(List<? extends Number> list) {
        return null;
    }

    public <T extends Comparable<?>> T findMax(List<T> list) {
        return null;
    }

    public <T> T genericMethod01(Generic<T> generic) {
        log.info("" + generic.getVar());

        T var = generic.getVar();
        return var;
    }

    public <T, V> T genericMethod02(Generic<T> generic, V value) {
        log.info("" + generic.getVar());

        T var = generic.getVar();
        return var;
    }

    public static <T> void print(T... args) {
        for (T t : args) {
//            log.info(t);
            System.out.println(t);
        }
    }

    public static <T> T add (T x, T y) {
        return x;
    }
}