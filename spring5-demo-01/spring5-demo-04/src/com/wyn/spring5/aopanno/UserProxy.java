package com.wyn.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Component
@Aspect//生成代理对象
public class UserProxy {//增强的类D

    //相同切入点的抽取
    @Pointcut(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    public void pointCut() {
    }


    //前置通知  切入点表达式 写出要增强的方法
//    @Before(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    @Before(value = "pointCut()")
    public void before() {
        //前置通知
        System.out.println("before......");
    }

    @After(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    public void after() {
        //后置通知
        System.out.println("after........");
    }

    @Around(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行

        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");

    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    @AfterThrowing(value = "execution(* com.wyn.spring5.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

}
