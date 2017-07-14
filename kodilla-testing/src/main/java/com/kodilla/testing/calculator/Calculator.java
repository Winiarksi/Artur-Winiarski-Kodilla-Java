package com.kodilla.testing.calculator;
/*
w tym pakiecie stwórz i zaimplementuj nową klasę Calculator reprezentującą
prosty kalkulator z dwoma funkcjami: add(int a, int b) oraz subtract(int a, int b).

w metodzie main klasy TestingMain napisz test sprawdzający działanie klasy Calculator
- dla każdej metody kalkulatora po jednym teście.
Rozwiązanie zadania prześlij do repozytorium GitHub.
 */
/**
 * Created by Artur Winiarski on 14.07.2017.
 */
public class Calculator {
    private int vaule1;
    private int vaule2;

    private int resultAdd;
    private int resultSubtract;

    public Calculator ( int vaule1, int vaule2 ) {
        this.vaule1 = vaule1;
        this.vaule2 = vaule2;
    }

    public void add(){
        resultAdd = vaule1 + vaule2;
    }

    public int getResultAdd() {
        return resultAdd;
    }

    public void subtract() {
        resultSubtract = vaule1 - vaule2;
    }

    public int getResultSubtract(){
        return resultSubtract;
    }
}
