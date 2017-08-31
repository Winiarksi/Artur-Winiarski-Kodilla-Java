package com.kodilla.spring.calculator_10_2z;

import org.springframework.stereotype.Service;

@Service
public class Display {

    public void displayValue(double val){
        System.out.println(val);
    }
}