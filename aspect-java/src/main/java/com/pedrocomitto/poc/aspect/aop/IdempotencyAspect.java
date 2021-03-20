package com.pedrocomitto.poc.aspect.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IdempotencyAspect {

    @Around("@annotation(com.pedrocomitto.poc.aspect.aspect.annotation.Idempotent)")
    public Object before(final ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("doing idempotency stuff");
        return joinPoint.proceed();
    }
}
