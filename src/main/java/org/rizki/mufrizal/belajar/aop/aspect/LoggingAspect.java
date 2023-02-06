package org.rizki.mufrizal.belajar.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before(value = "@annotation(org.rizki.mufrizal.belajar.aop.annotation.Logging)")
    public void getAccountOperationInfo(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("full method description: " + signature.getMethod());
        System.out.println("method name: " + signature.getMethod().getName());
        System.out.println("declaring type: " + signature.getDeclaringType());

    }
}
