package org.example.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * {@code CustomAfterAspect}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Aspect
public class CustomAfterAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @After("pointcut()")
    public void controllerAfter(JoinPoint joinPoint) throws Throwable {
        System.out.println("CustomAfterAspect->后置通知");
    }
}