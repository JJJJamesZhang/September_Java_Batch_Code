package com.ss.class9;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AopMethods {

    public void before(){
        System.out.println("This is the before method");
    }

    public void afterReturning(){
        System.out.println("This is the after method");
    }
}
