package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
public class CommonPointCutConfig {

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}
}
