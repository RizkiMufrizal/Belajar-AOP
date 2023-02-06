package org.rizki.mufrizal.belajar.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @AfterReturning(value = "@annotation(org.rizki.mufrizal.belajar.aop.annotation.Logging)", returning = "returnValue")
    public void getAccountOperationInfo(JoinPoint joinPoint, Object returnValue) {
        log.info("cek {}", returnValue);
    }
}
