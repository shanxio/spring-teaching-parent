package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect  {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPoing(){}

    @Around("myPoing()")
    public Object aroundActive(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            Long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            Long end = System.currentTimeMillis();
            System.out.println("耗时："+(end-start));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
