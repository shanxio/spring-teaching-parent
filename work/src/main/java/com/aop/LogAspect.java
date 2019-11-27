package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPoing(){}

    @Before("myPoing()")
    public void before(){
        System.out.println("before****");
    }

    @After("myPoing()")
    public void after(){
        System.out.println("after----");
    }
    @AfterReturning(value = "myPoing()")
    public void afterReturn(){
        System.out.println("after return..." );
    }

    @AfterThrowing(pointcut = "myPoing()",throwing = "re")
    public void afterThrow(RuntimeException re){
        System.out.println("after throw----" + re);
    }

    @Around(value = "myPoing()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("before in around---");
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return result;
    }

}
