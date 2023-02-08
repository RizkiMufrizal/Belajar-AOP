package org.rizki.mufrizal.belajar.aop.service;

import org.rizki.mufrizal.belajar.aop.annotation.Logging;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Logging(name = "rizki")
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}