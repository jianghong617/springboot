package org.example.springboot.aop;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Aspect
public class CustomAroundAspect {

    @Pointcut("within(org.example.springboot.controller..*)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object controllerAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("CustomAroundAspect->环绕通知开始");
        Object proceed = joinPoint.proceed();
        log.info("CustomAroundAspect->环绕通知结束");

        return proceed;
    }
}