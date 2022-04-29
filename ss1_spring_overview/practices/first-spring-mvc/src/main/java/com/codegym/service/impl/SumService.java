package com.codegym.service.impl;
import com.codegym.service.ISumServie;
import org.springframework.stereotype.Service;

@Service
public class SumService implements ISumServie {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
