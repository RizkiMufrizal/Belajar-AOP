package org.rizki.mufrizal.belajar.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.rizki.mufrizal.belajar.aop.annotation.Logging;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @AfterReturning(value = "@annotation(org.rizki.mufrizal.belajar.aop.annotation.Logging)", returning = "returnValue")
    public void getAccountOperationInfo(JoinPoint joinPoint, Object returnValue) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        Logging logging = method.getAnnotation(Logging.class);
        var name = logging.name();

        log.info("name {}", name);
        log.info("cek {}", returnValue);
    }
}
