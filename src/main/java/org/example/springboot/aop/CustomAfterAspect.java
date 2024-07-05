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
package org.example.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * {@code CustomAfterAspect}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 1.0.0
 */
@Slf4j
@Aspect
public class CustomAfterAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @After("pointcut()")
    public void controllerAfter(JoinPoint joinPoint) throws Throwable {
        log.info("CustomAfterAspect->后置通知");
    }
}