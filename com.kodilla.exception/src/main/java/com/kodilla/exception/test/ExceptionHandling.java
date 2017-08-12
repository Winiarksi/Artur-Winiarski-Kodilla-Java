package com.kodilla.exception.test;


import com.kodilla.exception.test.SecondChallenge;

import static java.lang.System.out;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0.5, 1.2);
        } catch (Exception e1) {
            out.println("Problem while reading a file!");
            e1.printStackTrace(out);
        } finally {
            out.println("Koniec");
        }

    }
}
