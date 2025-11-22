package com.example.lab1.service;

import org.springframework.stereotype.Component;

@Component
public class FactorialService {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число має бути невідʼємним");
        }
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
