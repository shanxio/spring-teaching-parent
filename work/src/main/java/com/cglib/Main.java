package com.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(a.getClass());
        enhancer.setCallback(new AProxy(a));
        A aProxy = (A) enhancer.create();

        B b = new B();
        Enhancer enhancer1 = new Enhancer();
        enhancer1.setSuperclass(b.getClass());
        enhancer1.setCallback(new BProxy(b));


        aProxy.getStr((B) enhancer1.create());
    }
}
