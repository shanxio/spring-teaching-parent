package com.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BProxy implements MethodInterceptor {

    private Object target;
    public BProxy(Object target){
        this.target=target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("B已经开启事务了------");
        Object result = methodProxy.invoke(target,objects);
        System.out.println("B关闭事务了--------------");
        return  result;
    }
}
