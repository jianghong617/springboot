package org.example.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * {@code CustomAroundAspect}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Aspect
public class CustomAroundAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object controllerAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕开始...");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕结束");

        return proceed;
    }
}