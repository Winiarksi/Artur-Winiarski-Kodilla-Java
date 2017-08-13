package com.kodilla.exception.main;


import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

import static java.lang.System.out;

public class ExceptionModuleRunner {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0.5, 1.2);
        } catch (ExceptionHandling e) {
            out.println("Problem can be wrongly initiated variable!");
            e.printStackTrace( out );
        } finally {
            out.println( "Koniec" );
        }

    }
}


