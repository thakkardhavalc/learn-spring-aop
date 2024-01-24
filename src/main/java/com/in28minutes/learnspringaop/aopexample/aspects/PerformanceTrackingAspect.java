package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
@Aspect
@Configuration
public class PerformanceTrackingAspect {

    private final Logger logger = LoggerFactory.getLogger(PerformanceTrackingAspect.class);

    @Around("com.in28minutes.learnspringaop.aopexample.aspects.CommonPointCutConfig.businessAndDataPackageConfig()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // Start timer
        long startTimeMillis = System.currentTimeMillis();

        // Execute method
        Object returnedValue = proceedingJoinPoint.proceed();

        // Stop timer
        long stopTimeMillis = System.currentTimeMillis();

        long executionDuration = stopTimeMillis - startTimeMillis;

        logger.info("Around Aspect - {} Method executed in {} ms", returnedValue, executionDuration);

        return returnedValue;
    }
}
