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
 * @since 2.2.0
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