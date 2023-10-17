package org.example.springboot.aop;

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
@Aspect
public class CustomBeforeAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void controllerBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("前置开始...");
    }
}