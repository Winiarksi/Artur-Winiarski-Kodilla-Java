package com.kodilla.spring.calculator_10_2z;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
   double a;
   double b;
   double result;

    @Autowired
    private Display display;

    public void add(double a, double b){
        result = a + b;
        System.out.print("add: ");
        display.displayValue(result);
    }

    public void sub(double a, double b){
        result = a - b;
        System.out.print("sub: ");
        display.displayValue(result);
    }

    public void mul(double a, double b){
        result = a * b;
        System.out.print("mul: ");
        display.displayValue(result);
    }

    public void div(double a, double b){
        result = a / b;
        System.out.print("div: ");
        display.displayValue(result);
    }
}