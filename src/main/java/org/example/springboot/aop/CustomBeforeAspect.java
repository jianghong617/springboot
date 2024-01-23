package org.example.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * {@code CustomBeforeAspect}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Slf4j
@Aspect
public class CustomBeforeAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void controllerBefore(JoinPoint joinPoint) throws Throwable {
        log.info("CustomBeforeAspect->前置通知");
    }
}